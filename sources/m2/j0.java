package m2;

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
import b8.ac;
import b8.od;
import b8.wc;
import b8.zb;
import g9.s1;
import j$.util.Objects;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j0 implements o {
    public final Context a;
    public final t0 b;
    public final m0 c;
    public final hi.d d;
    public final float e;
    public g2.s f;
    public g2.h0 g;
    public b h;
    public e i;
    public Looper j;
    public Context k;

    public j0(i0 i0Var) {
        Context context = i0Var.a;
        this.a = context;
        m0 m0Var = i0Var.b;
        m0Var.getClass();
        this.c = m0Var;
        this.b = i0Var.c;
        this.h = i0Var.d;
        this.d = context == null ? null : new hi.d(this, 11);
        this.e = i0Var.e;
        this.g = g2.h0.a;
    }

    public final h0 a(n nVar) {
        Context context;
        Context context2;
        try {
            int i3 = nVar.h;
            int i10 = nVar.i;
            if (i10 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.k;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.k = context2.createDeviceContext(i10);
                }
                context = this.k;
                i3 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(nVar.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : nVar.g.b()).setAudioFormat(new AudioFormat.Builder().setSampleRate(nVar.b).setChannelMask(nVar.c).setEncoding(nVar.a).build()).setTransferMode(1).setBufferSizeInBytes(nVar.f).setSessionId(i3);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(nVar.e);
            }
            if (i11 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new h0(build, nVar, this.d, this.e, this.g);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new l();
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new l(e);
        } catch (UnsupportedOperationException e11) {
            e = e11;
            throw new l(e);
        }
    }

    public final k b(i iVar) {
        e(iVar);
        d2.v vVar = iVar.a;
        d2.f fVar = iVar.b;
        f b10 = this.c.b(fVar, vVar);
        j jVar = new j();
        String str = vVar.s;
        int i3 = vVar.M;
        int i10 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(fVar, vVar) != null : i3 == 2) {
            i10 = 2;
        }
        jVar.a = i10;
        jVar.b = b10.a;
        jVar.c = b10.b;
        jVar.d = b10.c;
        return jVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n c(i iVar) {
        int intValue;
        int i3;
        boolean z10;
        char c2;
        boolean z11;
        int i10;
        int i11;
        double d;
        boolean z12;
        int i12;
        int i13;
        int j10;
        d2.v vVar = iVar.a;
        boolean z13 = iVar.d;
        d2.f fVar = iVar.b;
        e(iVar);
        String str = vVar.s;
        int i14 = vVar.L;
        int i15 = vVar.M;
        int i16 = vVar.K;
        if (Objects.equals(str, "audio/raw")) {
            zb.f(g2.n0.M(i15));
            intValue = g2.n0.t(i16);
            i3 = g2.n0.u(i15) * i16;
            z10 = false;
            c2 = 0;
        } else {
            f b10 = z13 ? this.c.b(fVar, vVar) : f.d;
            if (z13 && b10.a) {
                str.getClass();
                int c10 = d2.u0.c(str, vVar.k);
                int t10 = g2.n0.t(i16);
                boolean z14 = b10.b;
                i15 = c10;
                intValue = t10;
                z10 = z14;
                i3 = -1;
                c2 = 1;
                z11 = true;
                i10 = vVar.j;
                if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i10 == -1) {
                    i10 = 768000;
                }
                i11 = iVar.h;
                if (i11 == -1) {
                    z12 = true;
                } else {
                    int minBufferSize = AudioTrack.getMinBufferSize(i14, intValue, i15);
                    zb.p(minBufferSize != -2);
                    if (i3 == -1) {
                        i3 = 1;
                    }
                    double d10 = z11 ? this.e : 1.0d;
                    this.b.getClass();
                    if (c2 != 0) {
                        if (c2 != 1) {
                            z12 = true;
                            if (c2 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int i17 = i15 == 5 ? 500000 : i15 == 8 ? 1000000 : 250000;
                            if (i10 != -1) {
                                RoundingMode roundingMode = RoundingMode.CEILING;
                                j10 = wc.b(i10, 8);
                            } else {
                                j10 = e3.b.j(i15);
                                zb.p(j10 != -2147483647);
                            }
                            d = d10;
                            i13 = od.b((i17 * j10) / 1000000);
                        } else {
                            d = d10;
                            z12 = true;
                            int j11 = e3.b.j(i15);
                            zb.p(j11 != -2147483647);
                            i13 = od.b((50000000 * j11) / 1000000);
                        }
                        i12 = i3;
                    } else {
                        d = d10;
                        z12 = true;
                        long j12 = i14;
                        long j13 = i3;
                        i12 = i3;
                        i13 = g2.n0.i(minBufferSize * 4, od.b(((250000 * j12) * j13) / 1000000), od.b(((750000 * j12) * j13) / 1000000));
                    }
                    i11 = (((Math.max(minBufferSize, (int) (i13 * d)) + i12) - 1) / i12) * i12;
                }
                m mVar = new m();
                d2.f fVar2 = d2.f.i;
                mVar.i = -1;
                mVar.b = i14;
                mVar.c = intValue;
                mVar.a = i15;
                mVar.f = i11;
                mVar.h = iVar.e;
                mVar.g = fVar;
                boolean z15 = z12;
                mVar.e = c2 != z15 ? z15 : false;
                mVar.d = iVar.g;
                mVar.j = z11;
                mVar.k = z10;
                mVar.i = iVar.f;
                return new n(mVar);
            }
            Pair c11 = this.h.c(fVar, vVar);
            if (c11 == null) {
                String str2 = "Unable to configure passthrough for: " + vVar;
                str2.getClass();
                throw new h(str2);
            }
            i15 = ((Integer) c11.first).intValue();
            intValue = ((Integer) c11.second).intValue();
            i3 = -1;
            z10 = false;
            c2 = 2;
        }
        z11 = false;
        i10 = vVar.j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i10 = 768000;
        }
        i11 = iVar.h;
        if (i11 == -1) {
        }
        m mVar2 = new m();
        d2.f fVar22 = d2.f.i;
        mVar2.i = -1;
        mVar2.b = i14;
        mVar2.c = intValue;
        mVar2.a = i15;
        mVar2.f = i11;
        mVar2.h = iVar.e;
        mVar2.g = fVar;
        boolean z152 = z12;
        mVar2.e = c2 != z152 ? z152 : false;
        mVar2.d = iVar.g;
        mVar2.j = z11;
        mVar2.k = z10;
        mVar2.i = iVar.f;
        return new n(mVar2);
    }

    public final void d() {
        b3.d dVar;
        g2.s sVar = this.f;
        if (sVar != null) {
            sVar.d();
        }
        e eVar = this.i;
        if (eVar != null) {
            Context context = eVar.a;
            if (eVar.k) {
                eVar.h = null;
                e2.h.e(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.g) != null) {
                    dVar.e();
                    eVar.g = null;
                }
                context.unregisterReceiver(eVar.e);
                d dVar2 = eVar.f;
                if (dVar2 != null) {
                    dVar2.a.unregisterContentObserver(dVar2);
                }
                eVar.k = false;
            }
        }
    }

    public final void e(i iVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = iVar.c;
        d2.f fVar = iVar.b;
        f();
        e eVar = this.i;
        if (eVar == null && (context = this.a) != null) {
            e eVar2 = new e(context, new l5.b(this, 5), fVar, audioDeviceInfo);
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
                AudioManager e10 = e2.h.e(context2);
                c cVar = eVar2.d;
                Handler handler = eVar2.c;
                e10.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar2.g == null) {
                    eVar2.g = new b3.d(context2, new lg.n(eVar2, 7), Boolean.valueOf(g2.n0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar2.j, eVar2.i, eVar2.a());
                eVar2.h = b10;
            }
            this.h = b10;
        } else if (eVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar.i)) {
                eVar.i = audioDeviceInfo;
                Context context3 = eVar.a;
                d2.f fVar2 = eVar.j;
                List a10 = eVar.a();
                s1 s1Var = b.e;
                eVar.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar2, audioDeviceInfo, a10));
            }
            e eVar3 = this.i;
            if (!Objects.equals(fVar, eVar3.j)) {
                eVar3.j = fVar;
                Context context4 = eVar3.a;
                AudioDeviceInfo audioDeviceInfo2 = eVar3.i;
                List a11 = eVar3.a();
                s1 s1Var2 = b.e;
                eVar3.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar, audioDeviceInfo2, a11));
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
            throw new IllegalStateException(ac.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.j = myLooper;
    }
}
