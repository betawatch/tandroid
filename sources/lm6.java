// default package

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lm6 {
    public static final sdb m = xwe.a(new k50(4));
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public lm6(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = wf7.m(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(hac.g(i, widthAlignment) * widthAlignment, hac.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (r3.equals("Fairphone") == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lm6 i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z6;
        boolean z7;
        boolean z8;
        String str6;
        boolean z9 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z10 = z4 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            Integer num = (Integer) m.get();
            if (num != null && num.intValue() <= 202604) {
                String str7 = Build.MANUFACTURER;
                if (!str7.equals("Xiaomi")) {
                    if (!str7.equals("OPPO")) {
                        if (!str7.equals("realme")) {
                            if (!str7.equals("motorola")) {
                                if (!str7.equals("LENOVO")) {
                                }
                            }
                        }
                    }
                }
            }
            z5 = true;
            str6 = str;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z6 = z;
            z7 = z2;
            z8 = z3;
            str4 = str2;
            return new lm6(str6, str4, str5, codecCapabilities2, z6, z7, z8, z9, z10, z5);
        }
        z5 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z6 = z;
        z7 = z2;
        z8 = z3;
        str6 = str;
        return new lm6(str6, str4, str5, codecCapabilities2, z6, z7, z8, z9, z10, z5);
    }

    public final pa3 b(go4 go4Var, go4 go4Var2) {
        go4 go4Var3;
        go4 go4Var4;
        int i;
        String str = go4Var.t;
        tm2 tm2Var = go4Var.L;
        String str2 = go4Var2.t;
        tm2 tm2Var2 = go4Var2.L;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (go4Var.G != go4Var2.G) {
                i2 |= 1024;
            }
            boolean z = (go4Var.A == go4Var2.A && go4Var.B == go4Var2.B) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!tm2.e(tm2Var) || !tm2.e(tm2Var2)) && !Objects.equals(tm2Var, tm2Var2)) {
                i2 |= 2048;
            }
            HashSet hashSet = ct6.a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !go4Var.b(go4Var2)) {
                i2 |= 2;
            }
            int i3 = go4Var.D;
            if (i3 != -1 && (i = go4Var.E) != -1 && i3 == go4Var2.D && i == go4Var2.E && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(go4Var2.t, "video/dolby-vision")) {
                Pair b = jl2.b(go4Var);
                Pair b2 = jl2.b(go4Var2);
                if (b == null || b2 == null || !((Integer) b.first).equals(b2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new pa3(this.a, go4Var, go4Var2, go4Var.b(go4Var2) ? 3 : 2, 0);
            }
            go4Var3 = go4Var;
            go4Var4 = go4Var2;
        } else {
            go4Var3 = go4Var;
            go4Var4 = go4Var2;
            if (go4Var3.N != go4Var4.N) {
                i2 |= TLObject.FLAG_12;
            }
            if (go4Var3.P != go4Var4.P) {
                i2 |= TLObject.FLAG_13;
            }
            if (go4Var3.Q != go4Var4.Q) {
                i2 |= TLObject.FLAG_14;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair b3 = jl2.b(go4Var3);
                Pair b4 = jl2.b(go4Var4);
                if (b3 != null && b4 != null) {
                    int intValue = ((Integer) b3.first).intValue();
                    int intValue2 = ((Integer) b4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new pa3(this.a, go4Var3, go4Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b3.equals(b4)) {
                        return new pa3(this.a, go4Var3, go4Var4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new pa3(this.a, go4Var3, go4Var4, 3, 0);
            }
            if (!go4Var3.b(go4Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new pa3(this.a, go4Var3, go4Var4, 1, 0);
            }
        }
        return new pa3(this.a, go4Var3, go4Var4, 0, i2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Context context, go4 go4Var, boolean z) {
        char c;
        boolean z2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        il2 il2Var;
        boolean z3;
        String str;
        il2 d = jl2.d(go4Var);
        String str2 = go4Var.t;
        int i2 = 3;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String n = wf7.n(str3);
            if (n.equals("video/mv-hevc")) {
                return true;
            }
            if (n.equals("video/hevc")) {
                HashMap hashMap = tm6.a;
                List list = go4Var.w;
                int i3 = 0;
                loop0: while (true) {
                    if (i3 >= list.size()) {
                        il2Var = null;
                        z3 = false;
                        str = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i3);
                    int length = bArr.length;
                    if (length > i2) {
                        boolean[] zArr = new boolean[i2];
                        z3 = false;
                        jo5 p = mo5.p();
                        int i4 = 0;
                        while (i4 < bArr.length) {
                            int b = add.b(bArr, i4, bArr.length, zArr);
                            if (b != bArr.length) {
                                p.c(Integer.valueOf(b));
                            }
                            i4 = b + 3;
                        }
                        y79 f = p.f();
                        int i5 = 0;
                        while (i5 < f.d) {
                            if (((Integer) f.get(i5)).intValue() + i2 < length) {
                                rh6 rh6Var = new rh6(bArr, ((Integer) f.get(i5)).intValue() + i2, length);
                                pd0 f2 = add.f(rh6Var);
                                if (f2.a == 33 && f2.b == 0) {
                                    rh6Var.k(4);
                                    int e = rh6Var.e(3);
                                    rh6Var.j();
                                    il2Var = null;
                                    tj7 g = add.g(rh6Var, true, e, null);
                                    str = jl2.a(g.a, g.c, g.d, g.f, g.b, g.e);
                                    break loop0;
                                }
                            }
                            i5++;
                            i2 = 3;
                        }
                    }
                    i3++;
                    i2 = 3;
                }
                if (str == null) {
                    d = il2Var;
                    c = 65535;
                    z2 = z3;
                } else {
                    String trim = str.trim();
                    String str4 = hac.a;
                    c = 65535;
                    d = jl2.c(str, trim.split("\\.", -1), go4Var.L);
                    z2 = z3;
                }
                if (d != null) {
                    return true;
                }
                boolean z4 = d.c;
                if (!z4) {
                    return z2;
                }
                jte.p(z4);
                int i6 = d.a;
                jte.p(z4);
                int i7 = d.b;
                boolean equals = "video/dolby-vision".equals(str2);
                String str5 = this.b;
                if (equals) {
                    str5.getClass();
                    switch (str5.hashCode()) {
                        case -1662735862:
                            if (str5.equals("video/av01")) {
                                c = z2;
                                break;
                            }
                            break;
                        case -1662541442:
                            if (str5.equals("video/hevc")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1331836730:
                            if (str5.equals("video/avc")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                            i6 = 2;
                            i7 = z2;
                            break;
                        case 2:
                            i7 = z2;
                            i6 = 8;
                            break;
                    }
                }
                if (!this.i && !str5.equals("audio/ac4") && i6 != 42) {
                    return true;
                }
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[z2];
                }
                if (str5.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                    int i8 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                        i = 4;
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{tm6.b(1026, i8)};
                    } else {
                        i = 4;
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{tm6.b(nm7.f4, i8), tm6.b(513, i8), tm6.b(514, i8), tm6.b(1026, i8), tm6.b(1028, i8)};
                    }
                } else {
                    i = 4;
                }
                if (Build.VERSION.SDK_INT == 23 && "video/x-vnd.on2.vp9".equals(str5) && codecProfileLevelArr.length == 0) {
                    int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{tm6.b(1, intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? i : intValue >= 800000 ? 2 : 1)};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    if (codecProfileLevel.profile == i6 && (codecProfileLevel.level >= i7 || !z)) {
                        HashSet hashSet = ct6.a;
                        if (!"video/hevc".equals(str5) || 2 != i6) {
                            return true;
                        }
                        String str6 = Build.DEVICE;
                        if (!"sailfish".equals(str6) && !"marlin".equals(str6)) {
                            return true;
                        }
                    }
                }
                h("codec.profileLevel, " + go4Var.l + ", " + str3);
                return false;
            }
        }
        c = 65535;
        z2 = 0;
        if (d != null) {
        }
    }

    public final boolean d(go4 go4Var) {
        return (Objects.equals(go4Var.t, "audio/flac") && go4Var.Q == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, go4 go4Var) {
        int i;
        String str = go4Var.t;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(tm6.c(go4Var))) || !c(context, go4Var, true) || !d(go4Var)) {
            return false;
        }
        if (this.i) {
            int i2 = go4Var.A;
            if (i2 > 0 && (i = go4Var.B) > 0) {
                return g(i2, i, go4Var.F);
            }
        } else {
            int i3 = go4Var.P;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    h("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = go4Var.N;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    ncd.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i5 + "]");
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    h("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(go4 go4Var) {
        boolean z;
        if (this.i) {
            return this.e;
        }
        il2 d = jl2.d(go4Var);
        if (d == null || !(z = d.c)) {
            return false;
        }
        jte.p(z);
        return d.a == 42;
    }

    public final boolean g(int i, int i2, double d) {
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            int a = (i3 < 29 || ((bool = qqe.a) != null && bool.booleanValue())) ? 0 : rs.a(videoCapabilities, i, i2, d);
            if (a != 2) {
                if (a == 1) {
                    StringBuilder o = ts2.o("sizeAndRate.cover, ", i, "x", i2, "@");
                    o.append(d);
                    h(o.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                HashSet hashSet = ct6.a;
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder o2 = ts2.o("sizeAndRate.rotated, ", i, "x", i2, "@");
                    o2.append(d);
                    StringBuilder m2 = mlb.m("AssumedSupport [", o2.toString(), "] [", str, ", ");
                    m2.append(this.b);
                    m2.append("] [");
                    m2.append(hac.a);
                    m2.append("]");
                    ncd.b("MediaCodecInfo", m2.toString());
                    return true;
                }
            }
            StringBuilder o3 = ts2.o("sizeAndRate.support, ", i, "x", i2, "@");
            o3.append(d);
            h(o3.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder p = wi8.p("NoSupport [", str, "] [");
        p.append(this.a);
        p.append(", ");
        p.append(this.b);
        p.append("] [");
        p.append(hac.a);
        p.append("]");
        ncd.b("MediaCodecInfo", p.toString());
    }

    public final String toString() {
        return this.a;
    }
}
