package n2;

import a8.bb;
import a8.ma;
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
import c8.l1;
import h9.s1;
import j$.util.Objects;
import java.math.RoundingMode;
import java.util.List;
import kg.f1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class j0 implements o {
    public final Context a;
    public final t0 b;
    public final m0 c;
    public final hi.u0 d;
    public final float e;
    public h2.r f;
    public h2.g0 g;
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
        this.d = context == null ? null : new hi.u0(this, 17);
        this.e = i0Var.e;
        this.g = h2.g0.a;
    }

    public final h0 a(n nVar) {
        Context context;
        Context context2;
        try {
            int i7 = nVar.h;
            int i10 = nVar.i;
            if (i10 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.k;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.k = context2.createDeviceContext(i10);
                }
                context = this.k;
                i7 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(nVar.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : nVar.g.b()).setAudioFormat(new AudioFormat.Builder().setSampleRate(nVar.b).setChannelMask(nVar.c).setEncoding(nVar.a).build()).setTransferMode(1).setBufferSizeInBytes(nVar.f).setSessionId(i7);
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
        e2.u uVar = iVar.a;
        e2.e eVar = iVar.b;
        f a10 = this.c.a(eVar, uVar);
        j jVar = new j();
        String str = uVar.s;
        int i7 = uVar.M;
        int i10 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(eVar, uVar) != null : i7 == 2) {
            i10 = 2;
        }
        jVar.a = i10;
        jVar.b = a10.a;
        jVar.c = a10.b;
        jVar.d = a10.c;
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
        int i7;
        boolean z10;
        char c10;
        boolean z11;
        int i10;
        int i11;
        double d;
        boolean z12;
        int i12;
        int i13;
        int j3;
        e2.u uVar = iVar.a;
        boolean z13 = iVar.d;
        e2.e eVar = iVar.b;
        e(iVar);
        String str = uVar.s;
        int i14 = uVar.L;
        int i15 = uVar.M;
        int i16 = uVar.K;
        if (Objects.equals(str, "audio/raw")) {
            ma.f(h2.l0.M(i15));
            intValue = h2.l0.t(i16);
            i7 = h2.l0.u(i15) * i16;
            z10 = false;
            c10 = 0;
        } else {
            f a10 = z13 ? this.c.a(eVar, uVar) : f.d;
            if (z13 && a10.a) {
                str.getClass();
                int c11 = e2.s0.c(str, uVar.k);
                int t6 = h2.l0.t(i16);
                boolean z14 = a10.b;
                i15 = c11;
                intValue = t6;
                z10 = z14;
                i7 = -1;
                c10 = 1;
                z11 = true;
                i10 = uVar.j;
                if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i10 == -1) {
                    i10 = 768000;
                }
                i11 = iVar.h;
                if (i11 == -1) {
                    z12 = true;
                } else {
                    int minBufferSize = AudioTrack.getMinBufferSize(i14, intValue, i15);
                    ma.p(minBufferSize != -2);
                    if (i7 == -1) {
                        i7 = 1;
                    }
                    double d2 = z11 ? this.e : 1.0d;
                    this.b.getClass();
                    if (c10 != 0) {
                        if (c10 != 1) {
                            z12 = true;
                            if (c10 != 2) {
                                throw new IllegalArgumentException();
                            }
                            int i17 = i15 == 5 ? 500000 : i15 == 8 ? 1000000 : 250000;
                            if (i10 != -1) {
                                RoundingMode roundingMode = RoundingMode.CEILING;
                                j3 = c8.v0.b(i10, 8);
                            } else {
                                j3 = f3.b.j(i15);
                                ma.p(j3 != -2147483647);
                            }
                            d = d2;
                            i13 = l1.b((i17 * j3) / 1000000);
                        } else {
                            d = d2;
                            z12 = true;
                            int j10 = f3.b.j(i15);
                            ma.p(j10 != -2147483647);
                            i13 = l1.b((50000000 * j10) / 1000000);
                        }
                        i12 = i7;
                    } else {
                        d = d2;
                        z12 = true;
                        long j11 = i14;
                        long j12 = i7;
                        i12 = i7;
                        i13 = h2.l0.i(minBufferSize * 4, l1.b(((250000 * j11) * j12) / 1000000), l1.b(((750000 * j11) * j12) / 1000000));
                    }
                    i11 = (((Math.max(minBufferSize, (int) (i13 * d)) + i12) - 1) / i12) * i12;
                }
                m mVar = new m();
                e2.e eVar2 = e2.e.i;
                mVar.i = -1;
                mVar.b = i14;
                mVar.c = intValue;
                mVar.a = i15;
                mVar.f = i11;
                mVar.h = iVar.e;
                mVar.g = eVar;
                boolean z15 = z12;
                mVar.e = c10 != z15 ? z15 : false;
                mVar.d = iVar.g;
                mVar.j = z11;
                mVar.k = z10;
                mVar.i = iVar.f;
                return new n(mVar);
            }
            Pair c12 = this.h.c(eVar, uVar);
            if (c12 == null) {
                String str2 = "Unable to configure passthrough for: " + uVar;
                str2.getClass();
                throw new h(str2);
            }
            i15 = ((Integer) c12.first).intValue();
            intValue = ((Integer) c12.second).intValue();
            i7 = -1;
            z10 = false;
            c10 = 2;
        }
        z11 = false;
        i10 = uVar.j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i10 = 768000;
        }
        i11 = iVar.h;
        if (i11 == -1) {
        }
        m mVar2 = new m();
        e2.e eVar22 = e2.e.i;
        mVar2.i = -1;
        mVar2.b = i14;
        mVar2.c = intValue;
        mVar2.a = i15;
        mVar2.f = i11;
        mVar2.h = iVar.e;
        mVar2.g = eVar;
        boolean z152 = z12;
        mVar2.e = c10 != z152 ? z152 : false;
        mVar2.d = iVar.g;
        mVar2.j = z11;
        mVar2.k = z10;
        mVar2.i = iVar.f;
        return new n(mVar2);
    }

    public final void d() {
        c3.d dVar;
        h2.r rVar = this.f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar = this.i;
        if (eVar != null) {
            Context context = eVar.a;
            if (eVar.k) {
                eVar.h = null;
                f2.i.d(context).unregisterAudioDeviceCallback(eVar.d);
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
        e2.e eVar = iVar.b;
        f();
        e eVar2 = this.i;
        if (eVar2 == null && (context = this.a) != null) {
            e eVar3 = new e(context, new f1(this, 20), eVar, audioDeviceInfo);
            this.i = eVar3;
            if (eVar3.k) {
                b10 = eVar3.h;
                b10.getClass();
            } else {
                eVar3.k = true;
                d dVar = eVar3.f;
                if (dVar != null) {
                    dVar.a.registerContentObserver(dVar.b, false, dVar);
                }
                Context context2 = eVar3.a;
                AudioManager d = f2.i.d(context2);
                c cVar = eVar3.d;
                Handler handler = eVar3.c;
                d.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar3.g == null) {
                    eVar3.g = new c3.d(context2, new kg.i0(eVar3, 21), Boolean.valueOf(h2.l0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar3.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar3.j, eVar3.i, eVar3.a());
                eVar3.h = b10;
            }
            this.h = b10;
        } else if (eVar2 != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar2.i)) {
                eVar2.i = audioDeviceInfo;
                Context context3 = eVar2.a;
                e2.e eVar4 = eVar2.j;
                List a10 = eVar2.a();
                s1 s1Var = b.e;
                eVar2.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar4, audioDeviceInfo, a10));
            }
            e eVar5 = this.i;
            if (!Objects.equals(eVar, eVar5.j)) {
                eVar5.j = eVar;
                Context context4 = eVar5.a;
                AudioDeviceInfo audioDeviceInfo2 = eVar5.i;
                List a11 = eVar5.a();
                s1 s1Var2 = b.e;
                eVar5.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, audioDeviceInfo2, a11));
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
            throw new IllegalStateException(bb.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.j = myLooper;
    }
}
