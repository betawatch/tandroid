package k2;

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
import e9.x1;
import ei.bc;
import j$.util.Objects;
import java.math.RoundingMode;
import java.util.List;
import org.telegram.messenger.MediaController;
import v7.b8;
import v7.m7;
import v7.u6;
import v7.v6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class k0 implements q {
    public final Context a;
    public final u0 b;
    public final n0 c;
    public final a6.i d;
    public final float e;
    public e2.r f;
    public e2.g0 g;
    public b h;
    public e i;
    public Looper j;
    public Context k;

    public k0(j0 j0Var) {
        Context context = j0Var.a;
        this.a = context;
        n0 n0Var = j0Var.b;
        n0Var.getClass();
        this.c = n0Var;
        this.b = j0Var.c;
        this.h = j0Var.d;
        this.d = context == null ? null : new a6.i(this, 28);
        this.e = j0Var.e;
        this.g = e2.g0.a;
    }

    public final i0 a(p pVar) {
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
                return new i0(build, pVar, this.d, this.e, this.g);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new n();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new n(e);
        } catch (UnsupportedOperationException e7) {
            e = e7;
            throw new n(e);
        }
    }

    public final m b(k kVar) {
        e(kVar);
        b2.w wVar = kVar.a;
        b2.f fVar = kVar.b;
        h b10 = this.c.b(fVar, wVar);
        l lVar = new l();
        String str = wVar.s;
        int i10 = wVar.M;
        int i11 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(fVar, wVar) != null : i10 == 2) {
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
        b2.w wVar = kVar.a;
        boolean z13 = kVar.d;
        b2.f fVar = kVar.b;
        e(kVar);
        String str = wVar.s;
        int i15 = wVar.L;
        int i16 = wVar.M;
        int i17 = wVar.K;
        if (Objects.equals(str, "audio/raw")) {
            u6.g(e2.m0.M(i16));
            intValue = e2.m0.t(i17);
            i10 = e2.m0.u(i16) * i17;
            z10 = false;
            c10 = 0;
        } else {
            h b10 = z13 ? this.c.b(fVar, wVar) : h.d;
            if (z13 && b10.a) {
                str.getClass();
                int c11 = b2.v0.c(str, wVar.k);
                int t10 = e2.m0.t(i17);
                boolean z14 = b10.b;
                i16 = c11;
                intValue = t10;
                z10 = z14;
                i10 = -1;
                c10 = 1;
                z11 = true;
                i11 = wVar.j;
                if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i11 == -1) {
                    i11 = 768000;
                }
                i12 = kVar.h;
                if (i12 == -1) {
                    z12 = true;
                } else {
                    int minBufferSize = AudioTrack.getMinBufferSize(i15, intValue, i16);
                    u6.p(minBufferSize != -2);
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
                                j10 = m7.b(i11, 8);
                            } else {
                                j10 = c3.b.j(i16);
                                u6.p(j10 != -2147483647);
                            }
                            d = d10;
                            i14 = b8.b((i18 * j10) / 1000000);
                        } else {
                            d = d10;
                            z12 = true;
                            int j11 = c3.b.j(i16);
                            u6.p(j11 != -2147483647);
                            i14 = b8.b((50000000 * j11) / 1000000);
                        }
                        i13 = i10;
                    } else {
                        d = d10;
                        z12 = true;
                        long j12 = i15;
                        long j13 = i10;
                        i13 = i10;
                        i14 = e2.m0.i(minBufferSize * 4, b8.b(((250000 * j12) * j13) / 1000000), b8.b(((MediaController.VIDEO_BITRATE_360 * j12) * j13) / 1000000));
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
            Pair c12 = this.h.c(fVar, wVar);
            if (c12 == null) {
                String str2 = "Unable to configure passthrough for: " + wVar;
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
        i11 = wVar.j;
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
        z2.e eVar;
        e2.r rVar = this.f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar2 = this.i;
        if (eVar2 != null) {
            Context context = eVar2.a;
            if (eVar2.k) {
                eVar2.h = null;
                c2.i.e(context).unregisterAudioDeviceCallback(eVar2.d);
                if (Build.VERSION.SDK_INT >= 32 && (eVar = eVar2.g) != null) {
                    eVar.e();
                    eVar2.g = null;
                }
                context.unregisterReceiver(eVar2.e);
                d dVar = eVar2.f;
                if (dVar != null) {
                    dVar.a.unregisterContentObserver(dVar);
                }
                eVar2.k = false;
            }
        }
    }

    public final void e(k kVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = kVar.c;
        b2.f fVar = kVar.b;
        f();
        e eVar = this.i;
        if (eVar == null && (context = this.a) != null) {
            e eVar2 = new e(context, new j5.b(this, 1), fVar, audioDeviceInfo);
            this.i = eVar2;
            if (eVar2.k) {
                b10 = eVar2.h;
                b10.getClass();
            } else {
                eVar2.k = true;
                d dVar = eVar2.f;
                if (dVar != null) {
                    dVar.a.registerContentObserver(dVar.b, false, dVar);
                }
                Context context2 = eVar2.a;
                AudioManager e = c2.i.e(context2);
                c cVar = eVar2.d;
                Handler handler = eVar2.c;
                e.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar2.g == null) {
                    eVar2.g = new z2.e(context2, new bc(eVar2, 26), Boolean.valueOf(e2.m0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar2.j, eVar2.i, eVar2.a());
                eVar2.h = b10;
            }
            this.h = b10;
        } else if (eVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar.i)) {
                eVar.i = audioDeviceInfo;
                Context context3 = eVar.a;
                b2.f fVar2 = eVar.j;
                List a2 = eVar.a();
                x1 x1Var = b.e;
                eVar.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar2, audioDeviceInfo, a2));
            }
            e eVar3 = this.i;
            if (!Objects.equals(fVar, eVar3.j)) {
                eVar3.j = fVar;
                Context context4 = eVar3.a;
                AudioDeviceInfo audioDeviceInfo2 = eVar3.i;
                List a10 = eVar3.a();
                x1 x1Var2 = b.e;
                eVar3.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar, audioDeviceInfo2, a10));
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
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (!z10) {
            throw new IllegalStateException(v6.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.j = myLooper;
    }
}
