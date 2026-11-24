package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class MP4Builder {
    private boolean splitMdat;
    private boolean wasFirstVideoFrame;
    private InterleaveChunkMdat mdat = null;
    private Mp4Movie currentMp4Movie = null;
    private FileOutputStream fos = null;
    private FileChannel fc = null;
    private long dataOffset = 0;
    private long wroteSinceLastMdat = 0;
    private boolean writeNewMdat = true;
    private HashMap<Track, long[]> track2SampleSizes = new HashMap<>();
    private ByteBuffer sizeBuffer = null;
    private boolean allowSyncFiles = true;

    private void flushCurrentMdat() {
        long position = this.fc.position();
        this.fc.position(this.mdat.getOffset());
        this.mdat.getBox(this.fc);
        this.fc.position(position);
        this.mdat.setDataOffset(0L);
        this.mdat.setContentSize(0L);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
    }

    public static long gcd(long j, long j2) {
        return j2 == 0 ? j : gcd(j2, j % j2);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z) {
        return this.currentMp4Movie.addTrack(mediaFormat, z);
    }

    public void createCtts(Track track, kr9 kr9Var) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        xr2 xr2Var = null;
        for (int i : sampleCompositions) {
            if (xr2Var == null || xr2Var.b != i) {
                xr2Var = new xr2(1, i);
                arrayList.add(xr2Var);
            } else {
                xr2Var.a++;
            }
        }
        yr2 yr2Var = new yr2("ctts");
        yr2Var.e = Collections.EMPTY_LIST;
        aq1.r(i94.c(yr2.f, yr2Var, yr2Var, arrayList));
        yr2Var.e = arrayList;
        kr9Var.a(yr2Var);
    }

    public ld4 createFileTypeBox(boolean z) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(z ? "hvc1" : "avc1");
        linkedList.add("mp41");
        ld4 ld4Var = new ld4("ftyp");
        List list = Collections.EMPTY_LIST;
        ld4Var.a = "isom";
        ld4Var.b = 512L;
        ld4Var.c = linkedList;
        return ld4Var;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z, boolean z2) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        ld4 createFileTypeBox = createFileTypeBox(z2);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public ih7 createMovieBox(Mp4Movie mp4Movie) {
        ih7 ih7Var = new ih7("moov");
        jh7 jh7Var = new jh7("mvhd");
        jh7Var.r = 1.0d;
        jh7Var.s = 1.0f;
        ml6 ml6Var = ml6.j;
        jh7Var.w = ml6Var;
        Date date = new Date();
        aq1.r(i94.c(jh7.R, jh7Var, jh7Var, date));
        jh7Var.e = date;
        long j = 4294967296L;
        if (oee.a(date) >= 4294967296L) {
            jh7Var.h();
        }
        Date date2 = new Date();
        aq1.r(i94.c(jh7.S, jh7Var, jh7Var, date2));
        jh7Var.f = date2;
        if (oee.a(date2) >= 4294967296L) {
            jh7Var.h();
        }
        aq1.r(i94.c(jh7.V, jh7Var, jh7Var, ml6Var));
        jh7Var.w = ml6Var;
        long timescale = getTimescale(mp4Movie);
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i = 0;
        long j2 = 0;
        int i2 = 0;
        while (i2 < size) {
            Track track = tracks.get(i2);
            i2++;
            Track track2 = track;
            track2.prepare();
            long j3 = j;
            long duration = (track2.getDuration() * timescale) / track2.getTimeScale();
            if (duration > j2) {
                j2 = duration;
            }
            j = j3;
        }
        long j4 = j;
        aq1.r(i94.c(jh7.U, jh7Var, jh7Var, new Long(j2)));
        jh7Var.n = j2;
        if (j2 >= j4) {
            jh7Var.h();
        }
        aq1.r(i94.c(jh7.T, jh7Var, jh7Var, new Long(timescale)));
        jh7Var.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        aq1.r(i94.c(jh7.W, jh7Var, jh7Var, new Long(size2)));
        jh7Var.x = size2;
        ih7Var.a(jh7Var);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i < size3) {
            Track track3 = tracks2.get(i);
            i++;
            ih7Var.a(createTrackBox(track3, mp4Movie));
        }
        return ih7Var;
    }

    public pz0 createStbl(Track track) {
        kr9 kr9Var = new kr9("stbl");
        createStsd(track, kr9Var);
        createStts(track, kr9Var);
        createCtts(track, kr9Var);
        createStss(track, kr9Var);
        createStsc(track, kr9Var);
        createStsz(track, kr9Var);
        createStco(track, kr9Var);
        return kr9Var;
    }

    public void createStco(Track track, kr9 kr9Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Sample> samples = track.getSamples();
        int size = samples.size();
        long j = -1;
        int i = 0;
        while (i < size) {
            Sample sample = samples.get(i);
            i++;
            Sample sample2 = sample;
            long offset = sample2.getOffset();
            if (j != -1 && j != offset) {
                j = -1;
            }
            if (j == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            j = sample2.getSize() + offset;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jArr[i2] = ((Long) arrayList.get(i2)).longValue();
        }
        nya nyaVar = new nya("stco");
        nyaVar.f = new long[0];
        aq1.r(i94.c(nya.n, nyaVar, nyaVar, jArr));
        nyaVar.f = jArr;
        kr9Var.a(nyaVar);
    }

    public void createStsc(Track track, kr9 kr9Var) {
        mr9 mr9Var = new mr9("stsc");
        mr9Var.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        aq1.r(i94.c(mr9.h, mr9Var, mr9Var, linkedList));
        mr9Var.e = linkedList;
        int size = track.getSamples().size();
        int i = -1;
        int i2 = 1;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Sample sample = track.getSamples().get(i4);
            long size2 = sample.getSize() + sample.getOffset();
            i3++;
            if (i4 == size - 1 || size2 != track.getSamples().get(i4 + 1).getOffset()) {
                if (i != i3) {
                    aq1.r(i94.b(mr9.f, mr9Var, mr9Var));
                    mr9Var.e.add(new lr9(i2, i3, 1L));
                    i = i3;
                }
                i2++;
                i3 = 0;
            }
        }
        kr9Var.a(mr9Var);
    }

    public void createStsd(Track track, kr9 kr9Var) {
        kr9Var.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, kr9 kr9Var) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples == null || syncSamples.length <= 0) {
            return;
        }
        veb vebVar = new veb("stss");
        aq1.r(i94.c(veb.h, vebVar, vebVar, syncSamples));
        vebVar.e = syncSamples;
        kr9Var.a(vebVar);
    }

    public void createStsz(Track track, kr9 kr9Var) {
        ir9 ir9Var = new ir9("stsz");
        ir9Var.f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        aq1.r(i94.c(ir9.s, ir9Var, ir9Var, jArr));
        ir9Var.f = jArr;
        kr9Var.a(ir9Var);
    }

    public void createStts(Track track, kr9 kr9Var) {
        ArrayList arrayList = new ArrayList();
        upb upbVar = null;
        for (long j : track.getSampleDurations()) {
            if (upbVar == null || upbVar.b != j) {
                upbVar = new upb(1L, j);
                arrayList.add(upbVar);
            } else {
                upbVar.a++;
            }
        }
        vpb vpbVar = new vpb("stts");
        vpbVar.e = Collections.EMPTY_LIST;
        aq1.r(i94.c(vpb.f, vpbVar, vpbVar, arrayList));
        vpbVar.e = arrayList;
        kr9Var.a(vpbVar);
    }

    public rzb createTrackBox(Track track, Mp4Movie mp4Movie) {
        rzb rzbVar = new rzb("trak");
        wzb wzbVar = new wzb("tkhd");
        ml6 ml6Var = ml6.j;
        wzbVar.x = ml6Var;
        xvc c = i94.c(wzb.a0, wzbVar, wzbVar, new Boolean(true));
        pa9.a().getClass();
        pa9.b(c);
        wzbVar.g(wzbVar.d() | 1);
        xvc c2 = i94.c(wzb.b0, wzbVar, wzbVar, new Boolean(true));
        pa9.a().getClass();
        pa9.b(c2);
        wzbVar.g(wzbVar.d() | 2);
        xvc c3 = i94.c(wzb.c0, wzbVar, wzbVar, new Boolean(true));
        pa9.a().getClass();
        pa9.b(c3);
        wzbVar.g(wzbVar.d() | 4);
        if (track.isAudio()) {
            aq1.r(i94.c(wzb.X, wzbVar, wzbVar, ml6Var));
            wzbVar.x = ml6Var;
        } else {
            ml6 matrix = mp4Movie.getMatrix();
            aq1.r(i94.c(wzb.X, wzbVar, wzbVar, matrix));
            wzbVar.x = matrix;
        }
        aq1.r(i94.c(wzb.V, wzbVar, wzbVar, new Integer(0)));
        wzbVar.s = 0;
        Date creationTime = track.getCreationTime();
        aq1.r(i94.c(wzb.Q, wzbVar, wzbVar, creationTime));
        wzbVar.e = creationTime;
        if (oee.a(creationTime) >= 4294967296L) {
            wzbVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        aq1.r(i94.c(wzb.T, wzbVar, wzbVar, new Long(timescale)));
        wzbVar.n = timescale;
        if (timescale >= 4294967296L) {
            wzbVar.g(1);
        }
        double height = track.getHeight();
        aq1.r(i94.c(wzb.Z, wzbVar, wzbVar, new Double(height)));
        wzbVar.E = height;
        double width = track.getWidth();
        aq1.r(i94.c(wzb.Y, wzbVar, wzbVar, new Double(width)));
        wzbVar.y = width;
        aq1.r(i94.c(wzb.U, wzbVar, wzbVar, new Integer(0)));
        wzbVar.r = 0;
        Date date = new Date();
        aq1.r(i94.c(wzb.R, wzbVar, wzbVar, date));
        wzbVar.f = date;
        if (oee.a(date) >= 4294967296L) {
            wzbVar.h();
        }
        long trackId = track.getTrackId() + 1;
        aq1.r(i94.c(wzb.S, wzbVar, wzbVar, new Long(trackId)));
        wzbVar.h = trackId;
        float volume = track.getVolume();
        aq1.r(i94.c(wzb.W, wzbVar, wzbVar, new Float(volume)));
        wzbVar.w = volume;
        rzbVar.a(wzbVar);
        o73 o73Var = new o73("mdia", (byte) 2);
        rzbVar.a(o73Var);
        ns6 ns6Var = new ns6("mdhd");
        ns6Var.e = new Date();
        ns6Var.f = new Date();
        ns6Var.r = "eng";
        Date creationTime2 = track.getCreationTime();
        aq1.r(i94.c(ns6.F, ns6Var, ns6Var, creationTime2));
        ns6Var.e = creationTime2;
        long duration = track.getDuration();
        aq1.r(i94.c(ns6.H, ns6Var, ns6Var, new Long(duration)));
        ns6Var.n = duration;
        long timeScale = track.getTimeScale();
        aq1.r(i94.c(ns6.G, ns6Var, ns6Var, new Long(timeScale)));
        ns6Var.h = timeScale;
        aq1.r(i94.c(ns6.I, ns6Var, ns6Var, "eng"));
        ns6Var.r = "eng";
        o73Var.a(ns6Var);
        ge5 ge5Var = new ge5("hdlr");
        ge5Var.f = null;
        ge5Var.s = true;
        String str = track.isAudio() ? "SoundHandle" : "VideoHandle";
        aq1.r(i94.c(ge5.y, ge5Var, ge5Var, str));
        ge5Var.f = str;
        String handler = track.getHandler();
        aq1.r(i94.c(ge5.E, ge5Var, ge5Var, handler));
        ge5Var.e = handler;
        o73Var.a(ge5Var);
        o73 o73Var2 = new o73("minf", (byte) 3);
        o73Var2.a(track.getMediaHeaderBox());
        o73 o73Var3 = new o73("dinf", (byte) 0);
        o73 o73Var4 = new o73("dref", (byte) 1);
        o73Var3.a(o73Var4);
        n73 n73Var = new n73("url ");
        n73Var.g(1);
        o73Var4.a(n73Var);
        o73Var2.a(o73Var3);
        o73Var2.a(createStbl(track));
        o73Var.a(o73Var2);
        return rzbVar;
    }

    public void finishMovie(File file) {
        if (file == null) {
            finishMovie();
            return;
        }
        this.fos.flush();
        long position = this.fc.position();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        gm.E(this.currentMp4Movie.getCacheFile(), file);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            FileChannel channel = randomAccessFile.getChannel();
            try {
                channel.position(position);
                if (this.mdat.getContentSize() != 0) {
                    channel.position(this.mdat.getOffset());
                    this.mdat.getBox(channel);
                    channel.position(position);
                }
                this.track2SampleSizes.clear();
                ArrayList<Track> tracks = this.currentMp4Movie.getTracks();
                int size = tracks.size();
                int i = 0;
                while (i < size) {
                    Track track = tracks.get(i);
                    i++;
                    Track track2 = track;
                    ArrayList<Sample> samples = track2.getSamples();
                    int size2 = samples.size();
                    long[] jArr = new long[size2];
                    for (int i2 = 0; i2 < size2; i2++) {
                        jArr[i2] = samples.get(i2).getSize();
                    }
                    this.track2SampleSizes.put(track2, jArr);
                }
                createMovieBox(this.currentMp4Movie).getBox(channel);
                channel.close();
                randomAccessFile.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public long getLastFrameTimestamp(int i) {
        return this.currentMp4Movie.getLastFrameTimestamp(i);
    }

    public long getTimescale(Mp4Movie mp4Movie) {
        long timeScale = !mp4Movie.getTracks().isEmpty() ? mp4Movie.getTracks().iterator().next().getTimeScale() : 0L;
        ArrayList<Track> tracks = mp4Movie.getTracks();
        int size = tracks.size();
        int i = 0;
        while (i < size) {
            Track track = tracks.get(i);
            i++;
            timeScale = gcd(track.getTimeScale(), timeScale);
        }
        return timeScale;
    }

    public void setAllowSyncFiles(boolean z) {
        this.allowSyncFiles = z;
    }

    public long writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z) {
        boolean z2;
        if (this.writeNewMdat) {
            this.mdat.setContentSize(0L);
            this.mdat.getBox(this.fc);
            this.mdat.setDataOffset(this.dataOffset);
            this.dataOffset += 16;
            this.wroteSinceLastMdat += 16;
            this.writeNewMdat = false;
        }
        InterleaveChunkMdat interleaveChunkMdat = this.mdat;
        interleaveChunkMdat.setContentSize(interleaveChunkMdat.getContentSize() + bufferInfo.size);
        long j = this.wroteSinceLastMdat + bufferInfo.size;
        this.wroteSinceLastMdat = j;
        if (j >= 32768) {
            z2 = true;
            if (this.splitMdat) {
                flushCurrentMdat();
                this.writeNewMdat = true;
            }
            this.wroteSinceLastMdat = 0L;
        } else {
            z2 = false;
        }
        this.currentMp4Movie.addSample(i, this.dataOffset, bufferInfo);
        if (z) {
            this.sizeBuffer.position(0);
            this.sizeBuffer.putInt(bufferInfo.size - 4);
            this.sizeBuffer.position(0);
            this.fc.write(this.sizeBuffer);
            byteBuffer.position(bufferInfo.offset + 4);
        } else {
            byteBuffer.position(bufferInfo.offset);
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        this.fc.write(byteBuffer);
        this.dataOffset += bufferInfo.size;
        if (!z2) {
            return 0L;
        }
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        return this.fc.position();
    }

    public void createSidx(Track track, kr9 kr9Var) {
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    private static class InterleaveChunkMdat implements pz0 {
        private long contentSize;
        private long dataOffset;
        private gw2 parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j) {
            return j + 8 < 4294967296L;
        }

        @Override // pz0
        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                allocate.putInt((int) size);
            } else {
                allocate.putInt(1);
            }
            allocate.put(nt5.d("mdat"));
            if (isSmallBox(size)) {
                allocate.put(new byte[8]);
            } else {
                allocate.putLong(size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
        }

        public long getContentSize() {
            return this.contentSize;
        }

        public long getOffset() {
            return this.dataOffset;
        }

        @Override // pz0
        public gw2 getParent() {
            return this.parent;
        }

        @Override // pz0
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // pz0
        public String getType() {
            return "mdat";
        }

        public void setContentSize(long j) {
            this.contentSize = j;
        }

        public void setDataOffset(long j) {
            this.dataOffset = j;
        }

        @Override // pz0
        public void setParent(gw2 gw2Var) {
            this.parent = gw2Var;
        }

        public void parse(z73 z73Var, ByteBuffer byteBuffer, long j, xz0 xz0Var) {
        }
    }

    public void finishMovie() {
        if (this.mdat.getContentSize() != 0) {
            flushCurrentMdat();
        }
        ArrayList<Track> tracks = this.currentMp4Movie.getTracks();
        int size = tracks.size();
        int i = 0;
        while (i < size) {
            Track track = tracks.get(i);
            i++;
            Track track2 = track;
            ArrayList<Sample> samples = track2.getSamples();
            int size2 = samples.size();
            long[] jArr = new long[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                jArr[i2] = samples.get(i2).getSize();
            }
            this.track2SampleSizes.put(track2, jArr);
        }
        createMovieBox(this.currentMp4Movie).getBox(this.fc);
        this.fos.flush();
        if (this.allowSyncFiles) {
            this.fos.getFD().sync();
        }
        this.fc.close();
        this.fos.close();
    }
}
