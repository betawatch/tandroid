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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

    public void createCtts(Track track, bt9 bt9Var) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        fr2 fr2Var = null;
        for (int i : sampleCompositions) {
            if (fr2Var == null || fr2Var.b != i) {
                fr2Var = new fr2(1, i);
                arrayList.add(fr2Var);
            } else {
                fr2Var.a++;
            }
        }
        gr2 gr2Var = new gr2("ctts");
        gr2Var.e = Collections.EMPTY_LIST;
        bp1.r(u84.c(gr2.f, gr2Var, gr2Var, arrayList));
        gr2Var.e = arrayList;
        bt9Var.a(gr2Var);
    }

    public id4 createFileTypeBox(boolean z) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(z ? "hvc1" : "avc1");
        linkedList.add("mp41");
        id4 id4Var = new id4("ftyp");
        List list = Collections.EMPTY_LIST;
        id4Var.a = "isom";
        id4Var.b = 512L;
        id4Var.c = linkedList;
        return id4Var;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z, boolean z2) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        id4 createFileTypeBox = createFileTypeBox(z2);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z;
        this.mdat = new InterleaveChunkMdat(0);
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public oh7 createMovieBox(Mp4Movie mp4Movie) {
        oh7 oh7Var = new oh7("moov");
        ph7 ph7Var = new ph7("mvhd");
        ph7Var.r = 1.0d;
        ph7Var.s = 1.0f;
        ol6 ol6Var = ol6.j;
        ph7Var.w = ol6Var;
        Date date = new Date();
        bp1.r(u84.c(ph7.R, ph7Var, ph7Var, date));
        ph7Var.e = date;
        long j = 4294967296L;
        if (ehe.a(date) >= 4294967296L) {
            ph7Var.h();
        }
        Date date2 = new Date();
        bp1.r(u84.c(ph7.S, ph7Var, ph7Var, date2));
        ph7Var.f = date2;
        if (ehe.a(date2) >= 4294967296L) {
            ph7Var.h();
        }
        bp1.r(u84.c(ph7.V, ph7Var, ph7Var, ol6Var));
        ph7Var.w = ol6Var;
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
        bp1.r(u84.c(ph7.U, ph7Var, ph7Var, new Long(j2)));
        ph7Var.n = j2;
        if (j2 >= j4) {
            ph7Var.h();
        }
        bp1.r(u84.c(ph7.T, ph7Var, ph7Var, new Long(timescale)));
        ph7Var.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        bp1.r(u84.c(ph7.W, ph7Var, ph7Var, new Long(size2)));
        ph7Var.x = size2;
        oh7Var.a(ph7Var);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i < size3) {
            Track track3 = tracks2.get(i);
            i++;
            oh7Var.a(createTrackBox(track3, mp4Movie));
        }
        return oh7Var;
    }

    public qy0 createStbl(Track track) {
        bt9 bt9Var = new bt9("stbl");
        createStsd(track, bt9Var);
        createStts(track, bt9Var);
        createCtts(track, bt9Var);
        createStss(track, bt9Var);
        createStsc(track, bt9Var);
        createStsz(track, bt9Var);
        createStco(track, bt9Var);
        return bt9Var;
    }

    public void createStco(Track track, bt9 bt9Var) {
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
        n0b n0bVar = new n0b("stco");
        n0bVar.f = new long[0];
        bp1.r(u84.c(n0b.n, n0bVar, n0bVar, jArr));
        n0bVar.f = jArr;
        bt9Var.a(n0bVar);
    }

    public void createStsc(Track track, bt9 bt9Var) {
        dt9 dt9Var = new dt9("stsc");
        dt9Var.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        bp1.r(u84.c(dt9.h, dt9Var, dt9Var, linkedList));
        dt9Var.e = linkedList;
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
                    bp1.r(u84.b(dt9.f, dt9Var, dt9Var));
                    dt9Var.e.add(new ct9(i2, i3, 1L));
                    i = i3;
                }
                i2++;
                i3 = 0;
            }
        }
        bt9Var.a(dt9Var);
    }

    public void createStsd(Track track, bt9 bt9Var) {
        bt9Var.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, bt9 bt9Var) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples == null || syncSamples.length <= 0) {
            return;
        }
        pgb pgbVar = new pgb("stss");
        bp1.r(u84.c(pgb.h, pgbVar, pgbVar, syncSamples));
        pgbVar.e = syncSamples;
        bt9Var.a(pgbVar);
    }

    public void createStsz(Track track, bt9 bt9Var) {
        zs9 zs9Var = new zs9("stsz");
        zs9Var.f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        bp1.r(u84.c(zs9.s, zs9Var, zs9Var, jArr));
        zs9Var.f = jArr;
        bt9Var.a(zs9Var);
    }

    public void createStts(Track track, bt9 bt9Var) {
        ArrayList arrayList = new ArrayList();
        trb trbVar = null;
        for (long j : track.getSampleDurations()) {
            if (trbVar == null || trbVar.b != j) {
                trbVar = new trb(1L, j);
                arrayList.add(trbVar);
            } else {
                trbVar.a++;
            }
        }
        urb urbVar = new urb("stts");
        urbVar.e = Collections.EMPTY_LIST;
        bp1.r(u84.c(urb.f, urbVar, urbVar, arrayList));
        urbVar.e = arrayList;
        bt9Var.a(urbVar);
    }

    public q1c createTrackBox(Track track, Mp4Movie mp4Movie) {
        q1c q1cVar = new q1c("trak");
        v1c v1cVar = new v1c("tkhd");
        ol6 ol6Var = ol6.j;
        v1cVar.x = ol6Var;
        lyc c = u84.c(v1c.a0, v1cVar, v1cVar, new Boolean(true));
        zb9.a().getClass();
        zb9.b(c);
        v1cVar.g(v1cVar.d() | 1);
        lyc c2 = u84.c(v1c.b0, v1cVar, v1cVar, new Boolean(true));
        zb9.a().getClass();
        zb9.b(c2);
        v1cVar.g(v1cVar.d() | 2);
        lyc c3 = u84.c(v1c.c0, v1cVar, v1cVar, new Boolean(true));
        zb9.a().getClass();
        zb9.b(c3);
        v1cVar.g(v1cVar.d() | 4);
        if (track.isAudio()) {
            bp1.r(u84.c(v1c.X, v1cVar, v1cVar, ol6Var));
            v1cVar.x = ol6Var;
        } else {
            ol6 matrix = mp4Movie.getMatrix();
            bp1.r(u84.c(v1c.X, v1cVar, v1cVar, matrix));
            v1cVar.x = matrix;
        }
        bp1.r(u84.c(v1c.V, v1cVar, v1cVar, new Integer(0)));
        v1cVar.s = 0;
        Date creationTime = track.getCreationTime();
        bp1.r(u84.c(v1c.Q, v1cVar, v1cVar, creationTime));
        v1cVar.e = creationTime;
        if (ehe.a(creationTime) >= 4294967296L) {
            v1cVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        bp1.r(u84.c(v1c.T, v1cVar, v1cVar, new Long(timescale)));
        v1cVar.n = timescale;
        if (timescale >= 4294967296L) {
            v1cVar.g(1);
        }
        double height = track.getHeight();
        bp1.r(u84.c(v1c.Z, v1cVar, v1cVar, new Double(height)));
        v1cVar.E = height;
        double width = track.getWidth();
        bp1.r(u84.c(v1c.Y, v1cVar, v1cVar, new Double(width)));
        v1cVar.y = width;
        bp1.r(u84.c(v1c.U, v1cVar, v1cVar, new Integer(0)));
        v1cVar.r = 0;
        Date date = new Date();
        bp1.r(u84.c(v1c.R, v1cVar, v1cVar, date));
        v1cVar.f = date;
        if (ehe.a(date) >= 4294967296L) {
            v1cVar.h();
        }
        long trackId = track.getTrackId() + 1;
        bp1.r(u84.c(v1c.S, v1cVar, v1cVar, new Long(trackId)));
        v1cVar.h = trackId;
        float volume = track.getVolume();
        bp1.r(u84.c(v1c.W, v1cVar, v1cVar, new Float(volume)));
        v1cVar.w = volume;
        q1cVar.a(v1cVar);
        v63 v63Var = new v63("mdia", (byte) 2);
        q1cVar.a(v63Var);
        rs6 rs6Var = new rs6("mdhd");
        rs6Var.e = new Date();
        rs6Var.f = new Date();
        rs6Var.r = "eng";
        Date creationTime2 = track.getCreationTime();
        bp1.r(u84.c(rs6.F, rs6Var, rs6Var, creationTime2));
        rs6Var.e = creationTime2;
        long duration = track.getDuration();
        bp1.r(u84.c(rs6.H, rs6Var, rs6Var, new Long(duration)));
        rs6Var.n = duration;
        long timeScale = track.getTimeScale();
        bp1.r(u84.c(rs6.G, rs6Var, rs6Var, new Long(timeScale)));
        rs6Var.h = timeScale;
        bp1.r(u84.c(rs6.I, rs6Var, rs6Var, "eng"));
        rs6Var.r = "eng";
        v63Var.a(rs6Var);
        je5 je5Var = new je5("hdlr");
        je5Var.f = null;
        je5Var.s = true;
        String str = track.isAudio() ? "SoundHandle" : "VideoHandle";
        bp1.r(u84.c(je5.y, je5Var, je5Var, str));
        je5Var.f = str;
        String handler = track.getHandler();
        bp1.r(u84.c(je5.E, je5Var, je5Var, handler));
        je5Var.e = handler;
        v63Var.a(je5Var);
        v63 v63Var2 = new v63("minf", (byte) 3);
        v63Var2.a(track.getMediaHeaderBox());
        v63 v63Var3 = new v63("dinf", (byte) 0);
        v63 v63Var4 = new v63("dref", (byte) 1);
        v63Var3.a(v63Var4);
        u63 u63Var = new u63("url ");
        u63Var.g(1);
        v63Var4.a(u63Var);
        v63Var2.a(v63Var3);
        v63Var2.a(createStbl(track));
        v63Var.a(v63Var2);
        return q1cVar;
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
        hl.E(this.currentMp4Movie.getCacheFile(), file);
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

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    private static class InterleaveChunkMdat implements qy0 {
        private long contentSize;
        private long dataOffset;
        private qv2 parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j) {
            return j + 8 < 4294967296L;
        }

        @Override // qy0
        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                allocate.putInt((int) size);
            } else {
                allocate.putInt(1);
            }
            allocate.put(qt5.d("mdat"));
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

        @Override // qy0
        public qv2 getParent() {
            return this.parent;
        }

        @Override // qy0
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // qy0
        public String getType() {
            return "mdat";
        }

        public void setContentSize(long j) {
            this.contentSize = j;
        }

        public void setDataOffset(long j) {
            this.dataOffset = j;
        }

        @Override // qy0
        public void setParent(qv2 qv2Var) {
            this.parent = qv2Var;
        }

        public /* synthetic */ InterleaveChunkMdat(int i) {
            this();
        }

        public void parse(g73 g73Var, ByteBuffer byteBuffer, long j, yy0 yy0Var) {
        }
    }

    public void createSidx(Track track, bt9 bt9Var) {
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
