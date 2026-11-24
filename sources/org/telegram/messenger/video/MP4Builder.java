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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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

    public void createCtts(Track track, jp9 jp9Var) {
        int[] sampleCompositions = track.getSampleCompositions();
        if (sampleCompositions == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        mq2 mq2Var = null;
        for (int i : sampleCompositions) {
            if (mq2Var == null || mq2Var.b != i) {
                mq2Var = new mq2(1, i);
                arrayList.add(mq2Var);
            } else {
                mq2Var.a++;
            }
        }
        nq2 nq2Var = new nq2("ctts");
        nq2Var.e = Collections.EMPTY_LIST;
        oo1.r(z74.c(nq2.f, nq2Var, nq2Var, arrayList));
        nq2Var.e = arrayList;
        jp9Var.a(nq2Var);
    }

    public lb4 createFileTypeBox(boolean z) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(z ? "hvc1" : "avc1");
        linkedList.add("mp41");
        lb4 lb4Var = new lb4("ftyp");
        List list = Collections.EMPTY_LIST;
        lb4Var.a = "isom";
        lb4Var.b = 512L;
        lb4Var.c = linkedList;
        return lb4Var;
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie, boolean z, boolean z2) {
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        lb4 createFileTypeBox = createFileTypeBox(z2);
        createFileTypeBox.getBox(this.fc);
        long size = createFileTypeBox.getSize() + this.dataOffset;
        this.dataOffset = size;
        this.wroteSinceLastMdat += size;
        this.splitMdat = z;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    public ff7 createMovieBox(Mp4Movie mp4Movie) {
        ff7 ff7Var = new ff7("moov");
        gf7 gf7Var = new gf7("mvhd");
        gf7Var.r = 1.0d;
        gf7Var.s = 1.0f;
        jj6 jj6Var = jj6.j;
        gf7Var.w = jj6Var;
        Date date = new Date();
        oo1.r(z74.c(gf7.R, gf7Var, gf7Var, date));
        gf7Var.e = date;
        long j = 4294967296L;
        if (nce.a(date) >= 4294967296L) {
            gf7Var.h();
        }
        Date date2 = new Date();
        oo1.r(z74.c(gf7.S, gf7Var, gf7Var, date2));
        gf7Var.f = date2;
        if (nce.a(date2) >= 4294967296L) {
            gf7Var.h();
        }
        oo1.r(z74.c(gf7.V, gf7Var, gf7Var, jj6Var));
        gf7Var.w = jj6Var;
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
        oo1.r(z74.c(gf7.U, gf7Var, gf7Var, new Long(j2)));
        gf7Var.n = j2;
        if (j2 >= j4) {
            gf7Var.h();
        }
        oo1.r(z74.c(gf7.T, gf7Var, gf7Var, new Long(timescale)));
        gf7Var.h = timescale;
        long size2 = mp4Movie.getTracks().size() + 1;
        oo1.r(z74.c(gf7.W, gf7Var, gf7Var, new Long(size2)));
        gf7Var.x = size2;
        ff7Var.a(gf7Var);
        ArrayList<Track> tracks2 = mp4Movie.getTracks();
        int size3 = tracks2.size();
        while (i < size3) {
            Track track3 = tracks2.get(i);
            i++;
            ff7Var.a(createTrackBox(track3, mp4Movie));
        }
        return ff7Var;
    }

    public iy0 createStbl(Track track) {
        jp9 jp9Var = new jp9("stbl");
        createStsd(track, jp9Var);
        createStts(track, jp9Var);
        createCtts(track, jp9Var);
        createStss(track, jp9Var);
        createStsc(track, jp9Var);
        createStsz(track, jp9Var);
        createStco(track, jp9Var);
        return jp9Var;
    }

    public void createStco(Track track, jp9 jp9Var) {
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
        kwa kwaVar = new kwa("stco");
        kwaVar.f = new long[0];
        oo1.r(z74.c(kwa.n, kwaVar, kwaVar, jArr));
        kwaVar.f = jArr;
        jp9Var.a(kwaVar);
    }

    public void createStsc(Track track, jp9 jp9Var) {
        lp9 lp9Var = new lp9("stsc");
        lp9Var.e = Collections.EMPTY_LIST;
        LinkedList linkedList = new LinkedList();
        oo1.r(z74.c(lp9.h, lp9Var, lp9Var, linkedList));
        lp9Var.e = linkedList;
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
                    oo1.r(z74.b(lp9.f, lp9Var, lp9Var));
                    lp9Var.e.add(new kp9(i2, i3, 1L));
                    i = i3;
                }
                i2++;
                i3 = 0;
            }
        }
        jp9Var.a(lp9Var);
    }

    public void createStsd(Track track, jp9 jp9Var) {
        jp9Var.a(track.getSampleDescriptionBox());
    }

    public void createStss(Track track, jp9 jp9Var) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples == null || syncSamples.length <= 0) {
            return;
        }
        tcb tcbVar = new tcb("stss");
        oo1.r(z74.c(tcb.h, tcbVar, tcbVar, syncSamples));
        tcbVar.e = syncSamples;
        jp9Var.a(tcbVar);
    }

    public void createStsz(Track track, jp9 jp9Var) {
        hp9 hp9Var = new hp9("stsz");
        hp9Var.f = new long[0];
        long[] jArr = this.track2SampleSizes.get(track);
        oo1.r(z74.c(hp9.s, hp9Var, hp9Var, jArr));
        hp9Var.f = jArr;
        jp9Var.a(hp9Var);
    }

    public void createStts(Track track, jp9 jp9Var) {
        ArrayList arrayList = new ArrayList();
        tnb tnbVar = null;
        for (long j : track.getSampleDurations()) {
            if (tnbVar == null || tnbVar.b != j) {
                tnbVar = new tnb(1L, j);
                arrayList.add(tnbVar);
            } else {
                tnbVar.a++;
            }
        }
        unb unbVar = new unb("stts");
        unbVar.e = Collections.EMPTY_LIST;
        oo1.r(z74.c(unb.f, unbVar, unbVar, arrayList));
        unbVar.e = arrayList;
        jp9Var.a(unbVar);
    }

    public pxb createTrackBox(Track track, Mp4Movie mp4Movie) {
        pxb pxbVar = new pxb("trak");
        uxb uxbVar = new uxb("tkhd");
        jj6 jj6Var = jj6.j;
        uxbVar.x = jj6Var;
        c5a c = z74.c(uxb.a0, uxbVar, uxbVar, new Boolean(true));
        n89.a().getClass();
        n89.b(c);
        uxbVar.g(uxbVar.d() | 1);
        c5a c2 = z74.c(uxb.b0, uxbVar, uxbVar, new Boolean(true));
        n89.a().getClass();
        n89.b(c2);
        uxbVar.g(uxbVar.d() | 2);
        c5a c3 = z74.c(uxb.c0, uxbVar, uxbVar, new Boolean(true));
        n89.a().getClass();
        n89.b(c3);
        uxbVar.g(uxbVar.d() | 4);
        if (track.isAudio()) {
            oo1.r(z74.c(uxb.X, uxbVar, uxbVar, jj6Var));
            uxbVar.x = jj6Var;
        } else {
            jj6 matrix = mp4Movie.getMatrix();
            oo1.r(z74.c(uxb.X, uxbVar, uxbVar, matrix));
            uxbVar.x = matrix;
        }
        oo1.r(z74.c(uxb.V, uxbVar, uxbVar, new Integer(0)));
        uxbVar.s = 0;
        Date creationTime = track.getCreationTime();
        oo1.r(z74.c(uxb.Q, uxbVar, uxbVar, creationTime));
        uxbVar.e = creationTime;
        if (nce.a(creationTime) >= 4294967296L) {
            uxbVar.h();
        }
        long timescale = (getTimescale(mp4Movie) * track.getDuration()) / track.getTimeScale();
        oo1.r(z74.c(uxb.T, uxbVar, uxbVar, new Long(timescale)));
        uxbVar.n = timescale;
        if (timescale >= 4294967296L) {
            uxbVar.g(1);
        }
        double height = track.getHeight();
        oo1.r(z74.c(uxb.Z, uxbVar, uxbVar, new Double(height)));
        uxbVar.E = height;
        double width = track.getWidth();
        oo1.r(z74.c(uxb.Y, uxbVar, uxbVar, new Double(width)));
        uxbVar.y = width;
        oo1.r(z74.c(uxb.U, uxbVar, uxbVar, new Integer(0)));
        uxbVar.r = 0;
        Date date = new Date();
        oo1.r(z74.c(uxb.R, uxbVar, uxbVar, date));
        uxbVar.f = date;
        if (nce.a(date) >= 4294967296L) {
            uxbVar.h();
        }
        long trackId = track.getTrackId() + 1;
        oo1.r(z74.c(uxb.S, uxbVar, uxbVar, new Long(trackId)));
        uxbVar.h = trackId;
        float volume = track.getVolume();
        oo1.r(z74.c(uxb.W, uxbVar, uxbVar, new Float(volume)));
        uxbVar.w = volume;
        pxbVar.a(uxbVar);
        c63 c63Var = new c63("mdia", (byte) 2);
        pxbVar.a(c63Var);
        nq6 nq6Var = new nq6("mdhd");
        nq6Var.e = new Date();
        nq6Var.f = new Date();
        nq6Var.r = "eng";
        Date creationTime2 = track.getCreationTime();
        oo1.r(z74.c(nq6.F, nq6Var, nq6Var, creationTime2));
        nq6Var.e = creationTime2;
        long duration = track.getDuration();
        oo1.r(z74.c(nq6.H, nq6Var, nq6Var, new Long(duration)));
        nq6Var.n = duration;
        long timeScale = track.getTimeScale();
        oo1.r(z74.c(nq6.G, nq6Var, nq6Var, new Long(timeScale)));
        nq6Var.h = timeScale;
        oo1.r(z74.c(nq6.I, nq6Var, nq6Var, "eng"));
        nq6Var.r = "eng";
        c63Var.a(nq6Var);
        ic5 ic5Var = new ic5("hdlr");
        ic5Var.f = null;
        ic5Var.s = true;
        String str = track.isAudio() ? "SoundHandle" : "VideoHandle";
        oo1.r(z74.c(ic5.y, ic5Var, ic5Var, str));
        ic5Var.f = str;
        String handler = track.getHandler();
        oo1.r(z74.c(ic5.E, ic5Var, ic5Var, handler));
        ic5Var.e = handler;
        c63Var.a(ic5Var);
        c63 c63Var2 = new c63("minf", (byte) 3);
        c63Var2.a(track.getMediaHeaderBox());
        c63 c63Var3 = new c63("dinf", (byte) 0);
        c63 c63Var4 = new c63("dref", (byte) 1);
        c63Var3.a(c63Var4);
        b63 b63Var = new b63("url ");
        b63Var.g(1);
        c63Var4.a(b63Var);
        c63Var2.a(c63Var3);
        c63Var2.a(createStbl(track));
        c63Var.a(c63Var2);
        return pxbVar;
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
        gl.E(this.currentMp4Movie.getCacheFile(), file);
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

    public void createSidx(Track track, jp9 jp9Var) {
    }

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    private static class InterleaveChunkMdat implements iy0 {
        private long contentSize;
        private long dataOffset;
        private wu2 parent;

        private InterleaveChunkMdat() {
            this.contentSize = 1073741824L;
            this.dataOffset = 0L;
        }

        private boolean isSmallBox(long j) {
            return j + 8 < 4294967296L;
        }

        @Override // iy0
        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                allocate.putInt((int) size);
            } else {
                allocate.putInt(1);
            }
            allocate.put(or5.d("mdat"));
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

        @Override // iy0
        public wu2 getParent() {
            return this.parent;
        }

        @Override // iy0
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // iy0
        public String getType() {
            return "mdat";
        }

        public void setContentSize(long j) {
            this.contentSize = j;
        }

        public void setDataOffset(long j) {
            this.dataOffset = j;
        }

        @Override // iy0
        public void setParent(wu2 wu2Var) {
            this.parent = wu2Var;
        }

        public void parse(n63 n63Var, ByteBuffer byteBuffer, long j, qy0 qy0Var) {
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
