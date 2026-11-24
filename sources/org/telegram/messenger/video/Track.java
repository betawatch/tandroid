package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class Track {
    private static Map<Integer, Integer> samplingFrequencyIndexMap;
    private String handler;
    private n3 headerBox;
    private int height;
    private boolean isAudio;
    private int[] sampleCompositions;
    private er9 sampleDescriptionBox;
    private long[] sampleDurations;
    private LinkedList<Integer> syncSamples;
    private int timeScale;
    private long trackId;
    private float volume;
    private int width;
    private ArrayList<Sample> samples = new ArrayList<>();
    private long duration = 0;
    private Date creationTime = new Date();
    private ArrayList<SamplePresentationTime> samplePresentationTimes = new ArrayList<>();
    private boolean first = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    static class SamplePresentationTime {
        private long dt;
        private int index;
        private long presentationTime;

        public SamplePresentationTime(int i, long j) {
            this.index = i;
            this.presentationTime = j;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        samplingFrequencyIndexMap = hashMap;
        hashMap.put(96000, 0);
        samplingFrequencyIndexMap.put(88200, 1);
        samplingFrequencyIndexMap.put(64000, 2);
        samplingFrequencyIndexMap.put(48000, 3);
        samplingFrequencyIndexMap.put(44100, 4);
        samplingFrequencyIndexMap.put(32000, 5);
        samplingFrequencyIndexMap.put(24000, 6);
        samplingFrequencyIndexMap.put(22050, 7);
        samplingFrequencyIndexMap.put(Integer.valueOf(od1.AUDIO_CONTENT_SAMPLING_RATE), 8);
        samplingFrequencyIndexMap.put(12000, 9);
        samplingFrequencyIndexMap.put(11025, 10);
        samplingFrequencyIndexMap.put(8000, 11);
    }

    public Track(int i, MediaFormat mediaFormat, boolean z) {
        int i2;
        int i3;
        this.syncSamples = null;
        this.volume = 0.0f;
        this.trackId = i;
        this.isAudio = z;
        int i4 = 0;
        if (z) {
            this.volume = 1.0f;
            this.timeScale = mediaFormat.getInteger("sample-rate");
            this.handler = "soun";
            this.headerBox = new oma("smhd");
            this.sampleDescriptionBox = new er9();
            q40 q40Var = new q40("mp4a");
            q40Var.f = mediaFormat.getInteger("channel-count");
            q40Var.n = mediaFormat.getInteger("sample-rate");
            q40Var.h = (byte) 16;
            tt3 tt3Var = new tt3("esds");
            st3 st3Var = new st3();
            st3Var.i = 0;
            st3Var.o = new ArrayList();
            st3Var.d = 0;
            hq9 hq9Var = new hq9();
            hq9Var.d = 2;
            st3Var.n = hq9Var;
            String string = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "audio/mp4-latm";
            ha3 ha3Var = new ha3();
            ha3Var.k = new ArrayList();
            if ("audio/mpeg".equals(string)) {
                ha3Var.d = nm7.p1;
            } else {
                ha3Var.d = 64;
            }
            ha3Var.e = 5;
            ha3Var.g = 1536;
            if (mediaFormat.containsKey("max-bitrate")) {
                i2 = 31;
                ha3Var.h = mediaFormat.getInteger("max-bitrate");
            } else {
                i2 = 31;
                ha3Var.h = 96000L;
            }
            ha3Var.i = this.timeScale;
            y40 y40Var = new y40();
            y40Var.e = 2;
            y40Var.f = samplingFrequencyIndexMap.get(Integer.valueOf((int) q40Var.n)).intValue();
            y40Var.h = q40Var.f;
            ha3Var.j = y40Var;
            st3Var.m = ha3Var;
            ByteBuffer allocate = ByteBuffer.allocate(st3Var.c());
            kne.f(3, allocate);
            allocate.put((byte) ((st3Var.c() - 2) & nm7.d4));
            kne.d(st3Var.d, allocate);
            allocate.put((byte) (((st3Var.e << 7) | (st3Var.f << 6) | (st3Var.g << 5) | (st3Var.h & i2)) & nm7.d4));
            if (st3Var.e > 0) {
                kne.d(st3Var.k, allocate);
            }
            if (st3Var.f > 0) {
                allocate.put((byte) (st3Var.i & nm7.d4));
                allocate.put(rze.a(st3Var.j));
                allocate.put((byte) 0);
            }
            if (st3Var.g > 0) {
                kne.d(st3Var.l, allocate);
            }
            ha3 ha3Var2 = st3Var.m;
            y40 y40Var2 = ha3Var2.j;
            if (y40Var2 == null) {
                i3 = 0;
            } else {
                if (y40Var2.e != 2) {
                    rjb.j("can't serialize that yet");
                    throw null;
                }
                i3 = 4;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i3 + 15);
            kne.f(4, allocate2);
            y40 y40Var3 = ha3Var2.j;
            if (y40Var3 != null) {
                if (y40Var3.e != 2) {
                    rjb.j("can't serialize that yet");
                    throw null;
                }
                i4 = 4;
            }
            allocate2.put((byte) ((i4 + 13) & nm7.d4));
            allocate2.put((byte) (ha3Var2.d & nm7.d4));
            allocate2.put((byte) (((ha3Var2.e << 2) | (ha3Var2.f << 1) | 1) & nm7.d4));
            kne.e(ha3Var2.g, allocate2);
            allocate2.putInt((int) ha3Var2.h);
            allocate2.putInt((int) ha3Var2.i);
            y40 y40Var4 = ha3Var2.j;
            if (y40Var4 != null) {
                if (y40Var4.e != 2) {
                    rjb.j("can't serialize that yet");
                    throw null;
                }
                ByteBuffer allocate3 = ByteBuffer.allocate(4);
                kne.f(5, allocate3);
                if (y40Var4.e != 2) {
                    rjb.j("can't serialize that yet");
                    throw null;
                }
                allocate3.put((byte) 2);
                lq7 lq7Var = new lq7(allocate3, (byte) 2);
                lq7Var.c(y40Var4.e, 5);
                lq7Var.c(y40Var4.f, 4);
                if (y40Var4.f == 15) {
                    rjb.j("can't serialize that yet");
                    throw null;
                }
                lq7Var.c(y40Var4.h, 4);
                allocate2.put(allocate3.array());
            }
            hq9 hq9Var2 = st3Var.n;
            hq9Var2.getClass();
            ByteBuffer allocate4 = ByteBuffer.allocate(3);
            kne.f(6, allocate4);
            allocate4.put((byte) 1);
            allocate4.put((byte) (hq9Var2.d & nm7.d4));
            allocate.put(allocate2.array());
            allocate.put(allocate4.array());
            aq1.r(i94.c(e2.h, tt3Var, tt3Var, allocate));
            tt3Var.e = allocate;
            q40Var.a(tt3Var);
            this.sampleDescriptionBox.a(q40Var);
            return;
        }
        this.width = mediaFormat.getInteger("width");
        this.height = mediaFormat.getInteger("height");
        this.timeScale = 90000;
        this.syncSamples = new LinkedList<>();
        this.handler = "vide";
        gdc gdcVar = new gdc("vmhd");
        gdcVar.e = 0;
        gdcVar.f = new int[3];
        gdcVar.g(1);
        this.headerBox = gdcVar;
        this.sampleDescriptionBox = new er9();
        String string2 = mediaFormat.getString("mime");
        if (!string2.equals("video/avc")) {
            if (string2.equals("video/mp4v")) {
                jhc jhcVar = new jhc("mp4v");
                jhcVar.f = this.width;
                jhcVar.h = this.height;
                this.sampleDescriptionBox.a(jhcVar);
                return;
            }
            if (!string2.equals("video/hevc") || mediaFormat.getByteBuffer("csd-0") == null) {
                return;
            }
            byte[] array = mediaFormat.getByteBuffer("csd-0").array();
            int i5 = 0;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < array.length; i9++) {
                if (i5 == 3 && array[i9] == 1) {
                    if (i7 == -1) {
                        i7 = i9 - 3;
                    } else if (i8 == -1) {
                        i8 = i9 - 3;
                    } else if (i6 == -1) {
                        i6 = i9 - 3;
                    }
                }
                i5 = array[i9] == 0 ? i5 + 1 : 0;
            }
            byte[] bArr = new byte[i8 - 4];
            byte[] bArr2 = new byte[(i6 - i8) - 4];
            byte[] bArr3 = new byte[(array.length - i6) - 4];
            for (int i10 = 0; i10 < array.length; i10++) {
                if (i10 < i8) {
                    int i11 = i10 - 4;
                    if (i11 >= 0) {
                        bArr[i11] = array[i10];
                    }
                } else if (i10 < i6) {
                    int i12 = (i10 - i8) - 4;
                    if (i12 >= 0) {
                        bArr2[i12] = array[i10];
                    }
                } else {
                    int i13 = (i10 - i6) - 4;
                    if (i13 >= 0) {
                        bArr3[i13] = array[i10];
                    }
                }
            }
            try {
                jhc parseFromCsd = HevcDecoderConfigurationRecord.parseFromCsd(Arrays.asList(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr3), ByteBuffer.wrap(bArr2)));
                parseFromCsd.f = this.width;
                parseFromCsd.h = this.height;
                this.sampleDescriptionBox.a(parseFromCsd);
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        jhc jhcVar2 = new jhc("avc1");
        jhcVar2.f = this.width;
        jhcVar2.h = this.height;
        ld0 ld0Var = new ld0("avcC");
        md0 md0Var = new md0();
        md0Var.f = new ArrayList();
        md0Var.g = new ArrayList();
        md0Var.h = true;
        md0Var.i = 1;
        md0Var.j = 0;
        md0Var.k = 0;
        md0Var.l = new ArrayList();
        md0Var.m = 63;
        md0Var.n = 7;
        md0Var.o = 31;
        md0Var.p = 31;
        md0Var.q = 31;
        ld0Var.a = md0Var;
        if (mediaFormat.getByteBuffer("csd-0") != null) {
            ArrayList arrayList = new ArrayList();
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
            byteBuffer.position(4);
            byte[] bArr4 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr4);
            arrayList.add(bArr4);
            ArrayList arrayList2 = new ArrayList();
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
            byteBuffer2.position(4);
            byte[] bArr5 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr5);
            arrayList2.add(bArr5);
            aq1.r(i94.c(ld0.h, ld0Var, ld0Var, arrayList));
            ld0Var.a.f = arrayList;
            aq1.r(i94.c(ld0.n, ld0Var, ld0Var, arrayList2));
            ld0Var.a.g = arrayList2;
        }
        if (mediaFormat.containsKey("level")) {
            int integer = mediaFormat.getInteger("level");
            if (integer == 1) {
                ld0Var.d(1);
            } else if (integer == 32) {
                ld0Var.d(2);
            } else if (integer == 4) {
                ld0Var.d(11);
            } else if (integer == 8) {
                ld0Var.d(12);
            } else if (integer == 16) {
                ld0Var.d(13);
            } else if (integer == 64) {
                ld0Var.d(21);
            } else if (integer == 128) {
                ld0Var.d(22);
            } else if (integer == 256) {
                ld0Var.d(3);
            } else if (integer == 512) {
                ld0Var.d(31);
            } else if (integer == 1024) {
                ld0Var.d(32);
            } else if (integer == 2048) {
                ld0Var.d(4);
            } else if (integer == 4096) {
                ld0Var.d(41);
            } else if (integer == 8192) {
                ld0Var.d(42);
            } else if (integer == 16384) {
                ld0Var.d(5);
            } else if (integer == 32768) {
                ld0Var.d(51);
            } else if (integer == 65536) {
                ld0Var.d(52);
            } else if (integer == 2) {
                ld0Var.d(27);
            }
        } else {
            ld0Var.d(13);
        }
        if (mediaFormat.containsKey("profile")) {
            int integer2 = mediaFormat.getInteger("profile");
            if (integer2 == 1) {
                ld0Var.e(66);
            } else if (integer2 == 2) {
                ld0Var.e(77);
            } else if (integer2 == 4) {
                ld0Var.e(88);
            } else if (integer2 == 8) {
                ld0Var.e(100);
            } else if (integer2 == 16) {
                ld0Var.e(nm7.u1);
            } else if (integer2 == 32) {
                ld0Var.e(nm7.F1);
            } else if (integer2 == 64) {
                ld0Var.e(nm7.S3);
            }
        } else {
            ld0Var.e(100);
        }
        aq1.r(i94.c(ld0.s, ld0Var, ld0Var, new Integer(-1)));
        ld0Var.a.j = -1;
        aq1.r(i94.c(ld0.w, ld0Var, ld0Var, new Integer(-1)));
        ld0Var.a.k = -1;
        aq1.r(i94.c(ld0.r, ld0Var, ld0Var, new Integer(-1)));
        ld0Var.a.i = -1;
        aq1.r(i94.c(ld0.b, ld0Var, ld0Var, new Integer(1)));
        ld0Var.a.a = 1;
        aq1.r(i94.c(ld0.f, ld0Var, ld0Var, new Integer(3)));
        ld0Var.a.e = 3;
        aq1.r(i94.c(ld0.d, ld0Var, ld0Var, new Integer(0)));
        ld0Var.a.c = 0;
        jhcVar2.a(ld0Var);
        this.sampleDescriptionBox.a(jhcVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$prepare$0(SamplePresentationTime samplePresentationTime, SamplePresentationTime samplePresentationTime2) {
        if (samplePresentationTime.presentationTime > samplePresentationTime2.presentationTime) {
            return 1;
        }
        return samplePresentationTime.presentationTime < samplePresentationTime2.presentationTime ? -1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if ((r8.flags & 1) == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addSample(long j, MediaCodec.BufferInfo bufferInfo) {
        boolean z = this.isAudio ? false : true;
        this.samples.add(new Sample(j, bufferInfo.size));
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList != null && z) {
            linkedList.add(Integer.valueOf(this.samples.size()));
        }
        ArrayList<SamplePresentationTime> arrayList = this.samplePresentationTimes;
        arrayList.add(new SamplePresentationTime(arrayList.size(), ((bufferInfo.presentationTimeUs * this.timeScale) + 500000) / 1000000));
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getHandler() {
        return this.handler;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp() {
        return (((this.duration - this.sampleDurations[r2.length - 1]) * 1000000) - 500000) / this.timeScale;
    }

    public n3 getMediaHeaderBox() {
        return this.headerBox;
    }

    public int[] getSampleCompositions() {
        return this.sampleCompositions;
    }

    public er9 getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public long[] getSampleDurations() {
        return this.sampleDurations;
    }

    public ArrayList<Sample> getSamples() {
        return this.samples;
    }

    public long[] getSyncSamples() {
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        long[] jArr = new long[this.syncSamples.size()];
        for (int i = 0; i < this.syncSamples.size(); i++) {
            jArr[i] = this.syncSamples.get(i).intValue();
        }
        return jArr;
    }

    public int getTimeScale() {
        return this.timeScale;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public float getVolume() {
        return this.volume;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAudio() {
        return this.isAudio;
    }

    public void prepare() {
        int i;
        long j;
        long j2 = 0;
        this.duration = 0L;
        ArrayList arrayList = new ArrayList(this.samplePresentationTimes);
        Collections.sort(this.samplePresentationTimes, new a(false ? 1 : 0));
        this.sampleDurations = new long[this.samplePresentationTimes.size()];
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= this.samplePresentationTimes.size()) {
                break;
            }
            SamplePresentationTime samplePresentationTime = this.samplePresentationTimes.get(i2);
            long j5 = samplePresentationTime.presentationTime - j4;
            j4 = samplePresentationTime.presentationTime;
            this.sampleDurations[samplePresentationTime.index] = j5;
            if (samplePresentationTime.index != 0) {
                j = j2;
                this.duration += j5;
            } else {
                j = j2;
            }
            if (j5 > j && j5 < 2147483647L) {
                j3 = Math.min(j3, j5);
            }
            if (samplePresentationTime.index != i2) {
                z = true;
            }
            i2++;
            j2 = j;
            z = z;
        }
        long[] jArr = this.sampleDurations;
        if (jArr.length > 0) {
            jArr[0] = j3;
            this.duration += j3;
        }
        for (i = 1; i < arrayList.size(); i++) {
            ((SamplePresentationTime) arrayList.get(i)).dt = this.sampleDurations[i] + ((SamplePresentationTime) arrayList.get(i - 1)).dt;
        }
        if (z) {
            this.sampleCompositions = new int[this.samplePresentationTimes.size()];
            for (int i3 = 0; i3 < this.samplePresentationTimes.size(); i3++) {
                SamplePresentationTime samplePresentationTime2 = this.samplePresentationTimes.get(i3);
                this.sampleCompositions[samplePresentationTime2.index] = (int) (samplePresentationTime2.presentationTime - samplePresentationTime2.dt);
            }
        }
    }
}
