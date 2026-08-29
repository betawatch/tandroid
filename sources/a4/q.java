package a4;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import f5.d0;
import j3.t0;
import org.telegram.messenger.MediaController;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public q(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z10;
        this.e = z11;
        this.f = z12;
        this.h = f5.o.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(d0.f(i10, widthAlignment) * widthAlignment, d0.f(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (codecCapabilities != null && (i10 = d0.a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i10 <= 22) {
                String str4 = d0.d;
                if (!"ODROID-XU3".equals(str4)) {
                }
                if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                }
            }
            z12 = true;
            if (codecCapabilities != null && d0.a >= 21) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            return new q(str, str2, str3, codecCapabilities, z10, z12, !z11 || (codecCapabilities != null && d0.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
        }
        z12 = false;
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new q(str, str2, str3, codecCapabilities, z10, z12, !z11 || (codecCapabilities != null && d0.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final m3.l b(t0 t0Var, t0 t0Var2) {
        t0 t0Var3;
        t0 t0Var4;
        int i10 = !d0.a(t0Var.B, t0Var2.B) ? 8 : 0;
        if (this.h) {
            if (t0Var.J != t0Var2.J) {
                i10 |= 1024;
            }
            if (!this.e && (t0Var.G != t0Var2.G || t0Var.H != t0Var2.H)) {
                i10 |= 512;
            }
            if (!d0.a(t0Var.N, t0Var2.N)) {
                i10 |= 2048;
            }
            if (d0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !t0Var.b(t0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new m3.l(this.a, t0Var, t0Var2, t0Var.b(t0Var2) ? 3 : 2, 0);
            }
            t0Var3 = t0Var;
            t0Var4 = t0Var2;
        } else {
            t0Var3 = t0Var;
            t0Var4 = t0Var2;
            if (t0Var3.O != t0Var4.O) {
                i10 |= 4096;
            }
            if (t0Var3.P != t0Var4.P) {
                i10 |= 8192;
            }
            if (t0Var3.Q != t0Var4.Q) {
                i10 |= 16384;
            }
            String str = this.b;
            if (i10 == 0 && MediaController.AUDIO_MIME_TYPE.equals(str)) {
                Pair d = b0.d(t0Var3);
                Pair d10 = b0.d(t0Var4);
                if (d != null && d10 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d10.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new m3.l(this.a, t0Var3, t0Var4, 3, 0);
                    }
                }
            }
            if (!t0Var3.b(t0Var4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new m3.l(this.a, t0Var3, t0Var4, 1, 0);
            }
        }
        return new m3.l(this.a, t0Var3, t0Var4, 0, i10);
    }

    public final boolean c(t0 t0Var, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d = b0.d(t0Var);
        if (d != null) {
            int intValue = ((Integer) d.first).intValue();
            int intValue2 = ((Integer) d.second).intValue();
            boolean equals = "video/dolby-vision".equals(t0Var.B);
            int i10 = 8;
            String str = this.b;
            if (equals) {
                if (MediaController.VIDEO_MIME_TYPE.equals(str)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(str)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (this.h || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (d0.a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                    int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i10 = 1024;
                    } else if (intValue3 >= 120000000) {
                        i10 = 512;
                    } else if (intValue3 >= 60000000) {
                        i10 = 256;
                    } else if (intValue3 >= 30000000) {
                        i10 = 128;
                    } else if (intValue3 >= 18000000) {
                        i10 = 64;
                    } else if (intValue3 >= 12000000) {
                        i10 = 32;
                    } else if (intValue3 >= 7200000) {
                        i10 = 16;
                    } else if (intValue3 < 3600000) {
                        i10 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i10;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                        if ("video/hevc".equals(str) && 2 == intValue) {
                            String str2 = d0.b;
                            if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + t0Var.r + ", " + this.c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(t0 t0Var) {
        String str = t0Var.B;
        String str2 = this.b;
        boolean z10 = str2.equals(str) || str2.equals(b0.b(t0Var));
        int i10 = t0Var.H;
        int i11 = t0Var.G;
        if (!z10 || !c(t0Var, true)) {
            return false;
        }
        if (!this.h) {
            int i12 = d0.a;
            if (i12 >= 21) {
                int i13 = t0Var.P;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (i13 != -1) {
                    if (codecCapabilities == null) {
                        g("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("sampleRate.aCaps");
                        return false;
                    }
                    if (!audioCapabilities.isSampleRateSupported(i13)) {
                        g("sampleRate.support, " + i13);
                        return false;
                    }
                }
                int i14 = t0Var.O;
                if (i14 != -1) {
                    if (codecCapabilities == null) {
                        g("channelCount.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        g("channelCount.aCaps");
                        return false;
                    }
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i12 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !MediaController.AUDIO_MIME_TYPE.equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        int i15 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                        f5.a.K("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i15 + "]");
                        maxInputChannelCount = i15;
                    }
                    if (maxInputChannelCount < i14) {
                        g("channelCount.support, " + i14);
                        return false;
                    }
                }
            }
        } else if (i11 > 0 && i10 > 0) {
            if (d0.a >= 21) {
                return f(i11, i10, t0Var.I);
            }
            boolean z11 = i11 * i10 <= b0.j();
            if (!z11) {
                g("legacyFrameSize, " + i11 + "x" + i10);
            }
            return z11;
        }
        return true;
    }

    public final boolean e(t0 t0Var) {
        if (this.h) {
            return this.e;
        }
        Pair d = b0.d(t0Var);
        return d != null && ((Integer) d.first).intValue() == 42;
    }

    public final boolean f(int i10, int i11, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (d0.a >= 29) {
            int a2 = p.a(videoCapabilities, i10, i11, d);
            if (a2 == 2) {
                return true;
            }
            if (a2 == 1) {
                StringBuilder o10 = com.google.android.recaptcha.internal.a.o("sizeAndRate.cover, ", i10, "x", i11, "@");
                o10.append(d);
                g(o10.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d)) {
            if (i10 < i11) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(d0.b)) && a(videoCapabilities, i11, i10, d)) {
                    StringBuilder o11 = com.google.android.recaptcha.internal.a.o("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    o11.append(d);
                    StringBuilder k9 = th.k("AssumedSupport [", o11.toString(), "] [", str, ", ");
                    k9.append(this.b);
                    k9.append("] [");
                    k9.append(d0.e);
                    k9.append("]");
                    f5.a.n("MediaCodecInfo", k9.toString());
                }
            }
            StringBuilder o12 = com.google.android.recaptcha.internal.a.o("sizeAndRate.support, ", i10, "x", i11, "@");
            o12.append(d);
            g(o12.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder s10 = w.s("NoSupport [", str, "] [");
        s10.append(this.a);
        s10.append(", ");
        s10.append(this.b);
        s10.append("] [");
        s10.append(d0.e);
        s10.append("]");
        f5.a.n("MediaCodecInfo", s10.toString());
    }

    public final String toString() {
        return this.a;
    }
}
