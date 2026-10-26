package k2;

import a8.ed;
import a8.mc;
import a8.yb;
import a8.zb;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import f9.s1;
import j$.util.Objects;
import java.math.RoundingMode;
import java.util.List;
import jg.e1;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l0 implements q {
    public final Context a;
    public final v0 b;
    public final o0 c;
    public final jg.s0 d;
    public final float e;
    public e2.r f;
    public e2.g0 g;
    public b h;
    public f i;
    public Looper j;
    public Context k;

    public l0(k0 k0Var) {
        Context context = k0Var.a;
        this.a = context;
        o0 o0Var = k0Var.b;
        o0Var.getClass();
        this.c = o0Var;
        this.b = k0Var.c;
        this.h = k0Var.d;
        this.d = context == null ? null : new jg.s0(this, 1);
        this.e = k0Var.e;
        this.g = e2.g0.a;
    }

    public final j0 a(p pVar) {
        Context context;
        Context context2;
        try {
            int i10 = pVar.h;
            int i11 = pVar.i;
            if (i11 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.k;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.k = context2.createDeviceContext(i11);
                }
                context = this.k;
                i10 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(pVar.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : pVar.g.b()).setAudioFormat(new AudioFormat.Builder().setSampleRate(pVar.b).setChannelMask(pVar.c).setEncoding(pVar.a).build()).setTransferMode(1).setBufferSizeInBytes(pVar.f).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                sessionId.setOffloadedPlayback(pVar.e);
            }
            if (i12 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new j0(build, pVar, this.d, this.e, this.g);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new n();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new n(e);
        } catch (UnsupportedOperationException e10) {
            e = e10;
            throw new n(e);
        }
    }

    public final m b(k kVar) {
        e(kVar);
        b2.x xVar = kVar.a;
        b2.f fVar = kVar.b;
        h b10 = this.c.b(fVar, xVar);
        l lVar = new l();
        String str = xVar.s;
        int i10 = xVar.M;
        int i11 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(fVar, xVar) != null : i10 == 2) {
            i11 = 2;
        }
        lVar.a = i11;
        lVar.b = b10.a;
        lVar.c = b10.b;
        lVar.d = b10.c;
        return lVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p c(k kVar) {
        int intValue;
        int i10;
        boolean z10;
        char c10;
        boolean z11;
        int i11;
        int i12;
        double d;
        boolean z12;
        int i13;
        int i14;
        int j10;
        b2.x xVar = kVar.a;
        boolean z13 = kVar.d;
        b2.f fVar = kVar.b;
        e(kVar);
        String str = xVar.s;
        int i15 = xVar.L;
        int i16 = xVar.M;
        int i17 = xVar.K;
        if (Objects.equals(str, "audio/raw")) {
            yb.g(e2.n0.M(i16));
            intValue = e2.n0.t(i17);
            i10 = e2.n0.u(i16) * i17;
            z10 = false;
            c10 = 0;
        } else {
            h b10 = z13 ? this.c.b(fVar, xVar) : h.d;
            if (z13 && b10.a) {
                str.getClass();
                int c11 = b2.w0.c(str, xVar.k);
                int t10 = e2.n0.t(i17);
                boolean z14 = b10.b;
                i16 = c11;
                intValue = t10;
                z10 = z14;
                i10 = -1;
                c10 = 1;
                z11 = true;
                i11 = xVar.j;
                if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i11 == -1) {
                    i11 = 768000;
                }
                i12 = kVar.h;
                if (i12 == -1) {
                    z12 = true;
                } else {
                    int minBufferSize = AudioTrack.getMinBufferSize(i15, intValue, i16);
                    yb.p(minBufferSize != -2);
                    if (i10 == -1) {
                        i10 = 1;
                    }
                    double d10 = z11 ? this.e : 1.0d;
                    this.b.getClass();
                    if (c10 != 0) {
                        if (c10 != 1) {
                            z12 = true;
                            if (c10 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int i18 = i16 == 5 ? 500000 : i16 == 8 ? MediaController.VIDEO_BITRATE_480 : 250000;
                            if (i11 != -1) {
                                RoundingMode roundingMode = RoundingMode.CEILING;
                                j10 = mc.b(i11, 8);
                            } else {
                                j10 = c3.b.j(i16);
                                yb.p(j10 != -2147483647);
                            }
                            d = d10;
                            i14 = ed.b((i18 * j10) / 1000000);
                        } else {
                            d = d10;
                            z12 = true;
                            int j11 = c3.b.j(i16);
                            yb.p(j11 != -2147483647);
                            i14 = ed.b((50000000 * j11) / 1000000);
                        }
                        i13 = i10;
                    } else {
                        d = d10;
                        z12 = true;
                        long j12 = i15;
                        long j13 = i10;
                        i13 = i10;
                        i14 = e2.n0.i(minBufferSize * 4, ed.b(((250000 * j12) * j13) / 1000000), ed.b(((MediaController.VIDEO_BITRATE_360 * j12) * j13) / 1000000));
                    }
                    i12 = (((Math.max(minBufferSize, (int) (i14 * d)) + i13) - 1) / i13) * i13;
                }
                o oVar = new o();
                b2.f fVar2 = b2.f.i;
                oVar.i = -1;
                oVar.b = i15;
                oVar.c = intValue;
                oVar.a = i16;
                oVar.f = i12;
                oVar.h = kVar.e;
                oVar.g = fVar;
                boolean z15 = z12;
                oVar.e = c10 != z15 ? z15 : false;
                oVar.d = kVar.g;
                oVar.j = z11;
                oVar.k = z10;
                oVar.i = kVar.f;
                return new p(oVar);
            }
            Pair c12 = this.h.c(fVar, xVar);
            if (c12 == null) {
                String str2 = "Unable to configure passthrough for: " + xVar;
                str2.getClass();
                throw new j(str2);
            }
            i16 = ((Integer) c12.first).intValue();
            intValue = ((Integer) c12.second).intValue();
            i10 = -1;
            z10 = false;
            c10 = 2;
        }
        z11 = false;
        i11 = xVar.j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i11 = 768000;
        }
        i12 = kVar.h;
        if (i12 == -1) {
        }
        o oVar2 = new o();
        b2.f fVar22 = b2.f.i;
        oVar2.i = -1;
        oVar2.b = i15;
        oVar2.c = intValue;
        oVar2.a = i16;
        oVar2.f = i12;
        oVar2.h = kVar.e;
        oVar2.g = fVar;
        boolean z152 = z12;
        oVar2.e = c10 != z152 ? z152 : false;
        oVar2.d = kVar.g;
        oVar2.j = z11;
        oVar2.k = z10;
        oVar2.i = kVar.f;
        return new p(oVar2);
    }

    public final void d() {
        z2.d dVar;
        e2.r rVar = this.f;
        if (rVar != null) {
            rVar.d();
        }
        f fVar = this.i;
        if (fVar != null) {
            Context context = fVar.a;
            if (fVar.k) {
                fVar.h = null;
                c2.j.e(context).unregisterAudioDeviceCallback(fVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = fVar.g) != null) {
                    dVar.e();
                    fVar.g = null;
                }
                context.unregisterReceiver(fVar.e);
                e eVar = fVar.f;
                if (eVar != null) {
                    eVar.a.unregisterContentObserver(eVar);
                }
                fVar.k = false;
            }
        }
    }

    public final void e(k kVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = kVar.c;
        b2.f fVar = kVar.b;
        f();
        f fVar2 = this.i;
        if (fVar2 == null && (context = this.a) != null) {
            f fVar3 = new f(context, new e1(this, 4), fVar, audioDeviceInfo);
            this.i = fVar3;
            if (fVar3.k) {
                b10 = fVar3.h;
                b10.getClass();
            } else {
                fVar3.k = true;
                int i10 = 0;
                e eVar = fVar3.f;
                if (eVar != null) {
                    eVar.a.registerContentObserver(eVar.b, false, eVar);
                }
                Context context2 = fVar3.a;
                AudioManager e = c2.j.e(context2);
                d dVar = fVar3.d;
                Handler handler = fVar3.c;
                e.registerAudioDeviceCallback(dVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && fVar3.g == null) {
                    fVar3.g = new z2.d(context2, new c(fVar3, i10), Boolean.valueOf(e2.n0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(fVar3.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), fVar3.j, fVar3.i, fVar3.a());
                fVar3.h = b10;
            }
            this.h = b10;
        } else if (fVar2 != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(fVar2.i)) {
                fVar2.i = audioDeviceInfo;
                Context context3 = fVar2.a;
                b2.f fVar4 = fVar2.j;
                List a2 = fVar2.a();
                s1 s1Var = b.e;
                fVar2.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar4, audioDeviceInfo, a2));
            }
            f fVar5 = this.i;
            if (!Objects.equals(fVar, fVar5.j)) {
                fVar5.j = fVar;
                Context context4 = fVar5.a;
                AudioDeviceInfo audioDeviceInfo2 = fVar5.i;
                List a10 = fVar5.a();
                s1 s1Var2 = b.e;
                fVar5.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar, audioDeviceInfo2, a10));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        if (this.a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.j;
        boolean z10 = looper == null || looper == myLooper;
        String str = BuildConfig.BETA_URL;
        String name = looper == null ? BuildConfig.BETA_URL : looper.getThread().getName();
        if (myLooper != null) {
            str = myLooper.getThread().getName();
        }
        if (!z10) {
            throw new IllegalStateException(zb.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
        }
        this.j = myLooper;
    }
}
