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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class Track {
    private static Map<Integer, Integer> samplingFrequencyIndexMap;
    private String handler;
    private n3 headerBox;
    private int height;
    private boolean isAudio;
    private int[] sampleCompositions;
    private dp9 sampleDescriptionBox;
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
    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
        samplingFrequencyIndexMap.put(Integer.valueOf(gc1.AUDIO_CONTENT_SAMPLING_RATE), 8);
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
            this.headerBox = new nka("smhd");
            this.sampleDescriptionBox = new dp9();
            q30 q30Var = new q30("mp4a");
            q30Var.f = mediaFormat.getInteger("channel-count");
            q30Var.n = mediaFormat.getInteger("sample-rate");
            q30Var.h = (byte) 16;
            js3 js3Var = new js3("esds");
            is3 is3Var = new is3();
            is3Var.i = 0;
            is3Var.o = new ArrayList();
            is3Var.d = 0;
            fo9 fo9Var = new fo9();
            fo9Var.d = 2;
            is3Var.n = fo9Var;
            String string = mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "audio/mp4-latm";
            v83 v83Var = new v83();
            v83Var.k = new ArrayList();
            if ("audio/mpeg".equals(string)) {
                v83Var.d = kk7.p1;
            } else {
                v83Var.d = 64;
            }
            v83Var.e = 5;
            v83Var.g = 1536;
            if (mediaFormat.containsKey("max-bitrate")) {
                i2 = 31;
                v83Var.h = mediaFormat.getInteger("max-bitrate");
            } else {
                i2 = 31;
                v83Var.h = 96000L;
            }
            v83Var.i = this.timeScale;
            y30 y30Var = new y30();
            y30Var.e = 2;
            y30Var.f = samplingFrequencyIndexMap.get(Integer.valueOf((int) q30Var.n)).intValue();
            y30Var.h = q30Var.f;
            v83Var.j = y30Var;
            is3Var.m = v83Var;
            ByteBuffer allocate = ByteBuffer.allocate(is3Var.c());
            ile.f(3, allocate);
            allocate.put((byte) ((is3Var.c() - 2) & kk7.d4));
            ile.d(is3Var.d, allocate);
            allocate.put((byte) (((is3Var.e << 7) | (is3Var.f << 6) | (is3Var.g << 5) | (is3Var.h & i2)) & kk7.d4));
            if (is3Var.e > 0) {
                ile.d(is3Var.k, allocate);
            }
            if (is3Var.f > 0) {
                allocate.put((byte) (is3Var.i & kk7.d4));
                allocate.put(pxe.a(is3Var.j));
                allocate.put((byte) 0);
            }
            if (is3Var.g > 0) {
                ile.d(is3Var.l, allocate);
            }
            v83 v83Var2 = is3Var.m;
            y30 y30Var2 = v83Var2.j;
            if (y30Var2 == null) {
                i3 = 0;
            } else {
                if (y30Var2.e != 2) {
                    fyb.i("can't serialize that yet");
                    throw null;
                }
                i3 = 4;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i3 + 15);
            ile.f(4, allocate2);
            y30 y30Var3 = v83Var2.j;
            if (y30Var3 != null) {
                if (y30Var3.e != 2) {
                    fyb.i("can't serialize that yet");
                    throw null;
                }
                i4 = 4;
            }
            allocate2.put((byte) ((i4 + 13) & kk7.d4));
            allocate2.put((byte) (v83Var2.d & kk7.d4));
            allocate2.put((byte) (((v83Var2.e << 2) | (v83Var2.f << 1) | 1) & kk7.d4));
            ile.e(v83Var2.g, allocate2);
            allocate2.putInt((int) v83Var2.h);
            allocate2.putInt((int) v83Var2.i);
            y30 y30Var4 = v83Var2.j;
            if (y30Var4 != null) {
                if (y30Var4.e != 2) {
                    fyb.i("can't serialize that yet");
                    throw null;
                }
                ByteBuffer allocate3 = ByteBuffer.allocate(4);
                ile.f(5, allocate3);
                if (y30Var4.e != 2) {
                    fyb.i("can't serialize that yet");
                    throw null;
                }
                allocate3.put((byte) 2);
                io7 io7Var = new io7(allocate3, (byte) 2);
                io7Var.c(y30Var4.e, 5);
                io7Var.c(y30Var4.f, 4);
                if (y30Var4.f == 15) {
                    fyb.i("can't serialize that yet");
                    throw null;
                }
                io7Var.c(y30Var4.h, 4);
                allocate2.put(allocate3.array());
            }
            fo9 fo9Var2 = is3Var.n;
            fo9Var2.getClass();
            ByteBuffer allocate4 = ByteBuffer.allocate(3);
            ile.f(6, allocate4);
            allocate4.put((byte) 1);
            allocate4.put((byte) (fo9Var2.d & kk7.d4));
            allocate.put(allocate2.array());
            allocate.put(allocate4.array());
            oo1.r(z74.c(e2.h, js3Var, js3Var, allocate));
            js3Var.e = allocate;
            q30Var.a(js3Var);
            this.sampleDescriptionBox.a(q30Var);
            return;
        }
        this.width = mediaFormat.getInteger("width");
        this.height = mediaFormat.getInteger("height");
        this.timeScale = 90000;
        this.syncSamples = new LinkedList<>();
        this.handler = "vide";
        dbc dbcVar = new dbc("vmhd");
        dbcVar.e = 0;
        dbcVar.f = new int[3];
        dbcVar.g(1);
        this.headerBox = dbcVar;
        this.sampleDescriptionBox = new dp9();
        String string2 = mediaFormat.getString("mime");
        if (!string2.equals("video/avc")) {
            if (string2.equals("video/mp4v")) {
                jfc jfcVar = new jfc("mp4v");
                jfcVar.f = this.width;
                jfcVar.h = this.height;
                this.sampleDescriptionBox.a(jfcVar);
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
                jfc parseFromCsd = HevcDecoderConfigurationRecord.parseFromCsd(Arrays.asList(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr3), ByteBuffer.wrap(bArr2)));
                parseFromCsd.f = this.width;
                parseFromCsd.h = this.height;
                this.sampleDescriptionBox.a(parseFromCsd);
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        jfc jfcVar2 = new jfc("avc1");
        jfcVar2.f = this.width;
        jfcVar2.h = this.height;
        lc0 lc0Var = new lc0("avcC");
        mc0 mc0Var = new mc0();
        mc0Var.f = new ArrayList();
        mc0Var.g = new ArrayList();
        mc0Var.h = true;
        mc0Var.i = 1;
        mc0Var.j = 0;
        mc0Var.k = 0;
        mc0Var.l = new ArrayList();
        mc0Var.m = 63;
        mc0Var.n = 7;
        mc0Var.o = 31;
        mc0Var.p = 31;
        mc0Var.q = 31;
        lc0Var.a = mc0Var;
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
            oo1.r(z74.c(lc0.h, lc0Var, lc0Var, arrayList));
            lc0Var.a.f = arrayList;
            oo1.r(z74.c(lc0.n, lc0Var, lc0Var, arrayList2));
            lc0Var.a.g = arrayList2;
        }
        if (mediaFormat.containsKey("level")) {
            int integer = mediaFormat.getInteger("level");
            if (integer == 1) {
                lc0Var.d(1);
            } else if (integer == 32) {
                lc0Var.d(2);
            } else if (integer == 4) {
                lc0Var.d(11);
            } else if (integer == 8) {
                lc0Var.d(12);
            } else if (integer == 16) {
                lc0Var.d(13);
            } else if (integer == 64) {
                lc0Var.d(21);
            } else if (integer == 128) {
                lc0Var.d(22);
            } else if (integer == 256) {
                lc0Var.d(3);
            } else if (integer == 512) {
                lc0Var.d(31);
            } else if (integer == 1024) {
                lc0Var.d(32);
            } else if (integer == 2048) {
                lc0Var.d(4);
            } else if (integer == 4096) {
                lc0Var.d(41);
            } else if (integer == 8192) {
                lc0Var.d(42);
            } else if (integer == 16384) {
                lc0Var.d(5);
            } else if (integer == 32768) {
                lc0Var.d(51);
            } else if (integer == 65536) {
                lc0Var.d(52);
            } else if (integer == 2) {
                lc0Var.d(27);
            }
        } else {
            lc0Var.d(13);
        }
        if (mediaFormat.containsKey("profile")) {
            int integer2 = mediaFormat.getInteger("profile");
            if (integer2 == 1) {
                lc0Var.e(66);
            } else if (integer2 == 2) {
                lc0Var.e(77);
            } else if (integer2 == 4) {
                lc0Var.e(88);
            } else if (integer2 == 8) {
                lc0Var.e(100);
            } else if (integer2 == 16) {
                lc0Var.e(kk7.u1);
            } else if (integer2 == 32) {
                lc0Var.e(kk7.F1);
            } else if (integer2 == 64) {
                lc0Var.e(kk7.S3);
            }
        } else {
            lc0Var.e(100);
        }
        oo1.r(z74.c(lc0.s, lc0Var, lc0Var, new Integer(-1)));
        lc0Var.a.j = -1;
        oo1.r(z74.c(lc0.w, lc0Var, lc0Var, new Integer(-1)));
        lc0Var.a.k = -1;
        oo1.r(z74.c(lc0.r, lc0Var, lc0Var, new Integer(-1)));
        lc0Var.a.i = -1;
        oo1.r(z74.c(lc0.b, lc0Var, lc0Var, new Integer(1)));
        lc0Var.a.a = 1;
        oo1.r(z74.c(lc0.f, lc0Var, lc0Var, new Integer(3)));
        lc0Var.a.e = 3;
        oo1.r(z74.c(lc0.d, lc0Var, lc0Var, new Integer(0)));
        lc0Var.a.c = 0;
        jfcVar2.a(lc0Var);
        this.sampleDescriptionBox.a(jfcVar2);
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

    public dp9 getSampleDescriptionBox() {
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
