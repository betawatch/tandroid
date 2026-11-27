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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class Track {
    private static Map<Integer, Integer> samplingFrequencyIndexMap;
    private String handler;
    private o3 headerBox;
    private int height;
    private boolean isAudio;
    private int[] sampleCompositions;
    private vs9 sampleDescriptionBox;
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
    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        samplingFrequencyIndexMap.put(Integer.valueOf(oc1.AUDIO_CONTENT_SAMPLING_RATE), 8);
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
            this.headerBox = new hoa("smhd");
            this.sampleDescriptionBox = new vs9();
            r30 r30Var = new r30("mp4a");
            r30Var.f = mediaFormat.getInteger("channel-count");
            r30Var.n = mediaFormat.getInteger("sample-rate");
            r30Var.h = (byte) 16;
            bt3 bt3Var = new bt3("esds");
            at3 at3Var = new at3();
            at3Var.i = 0;
            at3Var.o = new ArrayList();
            at3Var.d = 0;
            zr9 zr9Var = new zr9();
            zr9Var.d = 2;
            at3Var.n = zr9Var;
            String string = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "audio/mp4-latm";
            o93 o93Var = new o93();
            o93Var.k = new ArrayList();
            if ("audio/mpeg".equals(string)) {
                o93Var.d = jn7.p1;
            } else {
                o93Var.d = 64;
            }
            o93Var.e = 5;
            o93Var.g = 1536;
            if (mediaFormat.containsKey("max-bitrate")) {
                i2 = 31;
                o93Var.h = mediaFormat.getInteger("max-bitrate");
            } else {
                i2 = 31;
                o93Var.h = 96000L;
            }
            o93Var.i = this.timeScale;
            z30 z30Var = new z30();
            z30Var.e = 2;
            z30Var.f = samplingFrequencyIndexMap.get(Integer.valueOf((int) r30Var.n)).intValue();
            z30Var.h = r30Var.f;
            o93Var.j = z30Var;
            at3Var.m = o93Var;
            ByteBuffer allocate = ByteBuffer.allocate(at3Var.c());
            aqe.f(3, allocate);
            allocate.put((byte) ((at3Var.c() - 2) & jn7.d4));
            aqe.d(at3Var.d, allocate);
            allocate.put((byte) (((at3Var.e << 7) | (at3Var.f << 6) | (at3Var.g << 5) | (at3Var.h & i2)) & jn7.d4));
            if (at3Var.e > 0) {
                aqe.d(at3Var.k, allocate);
            }
            if (at3Var.f > 0) {
                allocate.put((byte) (at3Var.i & jn7.d4));
                allocate.put(h2f.a(at3Var.j));
                allocate.put((byte) 0);
            }
            if (at3Var.g > 0) {
                aqe.d(at3Var.l, allocate);
            }
            o93 o93Var2 = at3Var.m;
            z30 z30Var2 = o93Var2.j;
            if (z30Var2 == null) {
                i3 = 0;
            } else {
                if (z30Var2.e != 2) {
                    qyc.c("can't serialize that yet");
                    throw null;
                }
                i3 = 4;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i3 + 15);
            aqe.f(4, allocate2);
            z30 z30Var3 = o93Var2.j;
            if (z30Var3 != null) {
                if (z30Var3.e != 2) {
                    qyc.c("can't serialize that yet");
                    throw null;
                }
                i4 = 4;
            }
            allocate2.put((byte) ((i4 + 13) & jn7.d4));
            allocate2.put((byte) (o93Var2.d & jn7.d4));
            allocate2.put((byte) (((o93Var2.e << 2) | (o93Var2.f << 1) | 1) & jn7.d4));
            aqe.e(o93Var2.g, allocate2);
            allocate2.putInt((int) o93Var2.h);
            allocate2.putInt((int) o93Var2.i);
            z30 z30Var4 = o93Var2.j;
            if (z30Var4 != null) {
                if (z30Var4.e != 2) {
                    qyc.c("can't serialize that yet");
                    throw null;
                }
                ByteBuffer allocate3 = ByteBuffer.allocate(4);
                aqe.f(5, allocate3);
                if (z30Var4.e != 2) {
                    qyc.c("can't serialize that yet");
                    throw null;
                }
                allocate3.put((byte) 2);
                ir7 ir7Var = new ir7(allocate3, (byte) 2);
                ir7Var.c(z30Var4.e, 5);
                ir7Var.c(z30Var4.f, 4);
                if (z30Var4.f == 15) {
                    qyc.c("can't serialize that yet");
                    throw null;
                }
                ir7Var.c(z30Var4.h, 4);
                allocate2.put(allocate3.array());
            }
            zr9 zr9Var2 = at3Var.n;
            zr9Var2.getClass();
            ByteBuffer allocate4 = ByteBuffer.allocate(3);
            aqe.f(6, allocate4);
            allocate4.put((byte) 1);
            allocate4.put((byte) (zr9Var2.d & jn7.d4));
            allocate.put(allocate2.array());
            allocate.put(allocate4.array());
            bp1.r(u84.c(f2.h, bt3Var, bt3Var, allocate));
            bt3Var.e = allocate;
            r30Var.a(bt3Var);
            this.sampleDescriptionBox.a(r30Var);
            return;
        }
        this.width = mediaFormat.getInteger("width");
        this.height = mediaFormat.getInteger("height");
        this.timeScale = 90000;
        this.syncSamples = new LinkedList<>();
        this.handler = "vide";
        dfc dfcVar = new dfc("vmhd");
        dfcVar.e = 0;
        dfcVar.f = new int[3];
        dfcVar.g(1);
        this.headerBox = dfcVar;
        this.sampleDescriptionBox = new vs9();
        String string2 = mediaFormat.getString("mime");
        if (!string2.equals("video/avc")) {
            if (string2.equals("video/mp4v")) {
                ijc ijcVar = new ijc("mp4v");
                ijcVar.f = this.width;
                ijcVar.h = this.height;
                this.sampleDescriptionBox.a(ijcVar);
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
                ijc parseFromCsd = HevcDecoderConfigurationRecord.parseFromCsd(Arrays.asList(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr3), ByteBuffer.wrap(bArr2)));
                parseFromCsd.f = this.width;
                parseFromCsd.h = this.height;
                this.sampleDescriptionBox.a(parseFromCsd);
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        ijc ijcVar2 = new ijc("avc1");
        ijcVar2.f = this.width;
        ijcVar2.h = this.height;
        nc0 nc0Var = new nc0("avcC");
        oc0 oc0Var = new oc0();
        oc0Var.f = new ArrayList();
        oc0Var.g = new ArrayList();
        oc0Var.h = true;
        oc0Var.i = 1;
        oc0Var.j = 0;
        oc0Var.k = 0;
        oc0Var.l = new ArrayList();
        oc0Var.m = 63;
        oc0Var.n = 7;
        oc0Var.o = 31;
        oc0Var.p = 31;
        oc0Var.q = 31;
        nc0Var.a = oc0Var;
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
            bp1.r(u84.c(nc0.h, nc0Var, nc0Var, arrayList));
            nc0Var.a.f = arrayList;
            bp1.r(u84.c(nc0.n, nc0Var, nc0Var, arrayList2));
            nc0Var.a.g = arrayList2;
        }
        if (mediaFormat.containsKey("level")) {
            int integer = mediaFormat.getInteger("level");
            if (integer == 1) {
                nc0Var.d(1);
            } else if (integer == 32) {
                nc0Var.d(2);
            } else if (integer == 4) {
                nc0Var.d(11);
            } else if (integer == 8) {
                nc0Var.d(12);
            } else if (integer == 16) {
                nc0Var.d(13);
            } else if (integer == 64) {
                nc0Var.d(21);
            } else if (integer == 128) {
                nc0Var.d(22);
            } else if (integer == 256) {
                nc0Var.d(3);
            } else if (integer == 512) {
                nc0Var.d(31);
            } else if (integer == 1024) {
                nc0Var.d(32);
            } else if (integer == 2048) {
                nc0Var.d(4);
            } else if (integer == 4096) {
                nc0Var.d(41);
            } else if (integer == 8192) {
                nc0Var.d(42);
            } else if (integer == 16384) {
                nc0Var.d(5);
            } else if (integer == 32768) {
                nc0Var.d(51);
            } else if (integer == 65536) {
                nc0Var.d(52);
            } else if (integer == 2) {
                nc0Var.d(27);
            }
        } else {
            nc0Var.d(13);
        }
        if (mediaFormat.containsKey("profile")) {
            int integer2 = mediaFormat.getInteger("profile");
            if (integer2 == 1) {
                nc0Var.e(66);
            } else if (integer2 == 2) {
                nc0Var.e(77);
            } else if (integer2 == 4) {
                nc0Var.e(88);
            } else if (integer2 == 8) {
                nc0Var.e(100);
            } else if (integer2 == 16) {
                nc0Var.e(jn7.u1);
            } else if (integer2 == 32) {
                nc0Var.e(jn7.F1);
            } else if (integer2 == 64) {
                nc0Var.e(jn7.S3);
            }
        } else {
            nc0Var.e(100);
        }
        bp1.r(u84.c(nc0.s, nc0Var, nc0Var, new Integer(-1)));
        nc0Var.a.j = -1;
        bp1.r(u84.c(nc0.w, nc0Var, nc0Var, new Integer(-1)));
        nc0Var.a.k = -1;
        bp1.r(u84.c(nc0.r, nc0Var, nc0Var, new Integer(-1)));
        nc0Var.a.i = -1;
        bp1.r(u84.c(nc0.b, nc0Var, nc0Var, new Integer(1)));
        nc0Var.a.a = 1;
        bp1.r(u84.c(nc0.f, nc0Var, nc0Var, new Integer(3)));
        nc0Var.a.e = 3;
        bp1.r(u84.c(nc0.d, nc0Var, nc0Var, new Integer(0)));
        nc0Var.a.c = 0;
        ijcVar2.a(nc0Var);
        this.sampleDescriptionBox.a(ijcVar2);
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

    public o3 getMediaHeaderBox() {
        return this.headerBox;
    }

    public int[] getSampleCompositions() {
        return this.sampleCompositions;
    }

    public vs9 getSampleDescriptionBox() {
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
