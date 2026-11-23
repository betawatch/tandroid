package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c0 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ e0 g;

    public c0(e0 e0Var, int i7) {
        this.g = e0Var;
        this.a = i7;
    }

    public final void a() {
        long duration;
        e0 e0Var = this.g;
        i1 i1Var = (i1) e0Var.e;
        i0 i0Var = (i0) e0Var.f;
        l2.g0 g0Var = (l2.g0) e0Var.a;
        l1 z02 = g0Var.z0();
        Object l10 = z02.p() ? null : z02.l(g0Var.C());
        int o02 = g0Var.o0();
        int P = g0Var.P();
        long n10 = g0Var.n();
        if (l10 == null || o02 != -1) {
            duration = o02 != -1 ? g0Var.getDuration() : -9223372036854775807L;
        } else {
            z02.g(l10, i1Var);
            n10 -= l0.h0(i1Var.e);
            duration = l0.h0(i1Var.d);
        }
        boolean j3 = g0Var.j();
        if (!j3 || duration == -9223372036854775807L || n10 < duration) {
            i0Var.e(3);
            if (j3 && duration != -9223372036854775807L) {
                i0Var.a.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - n10) / g0Var.l().a));
            }
            this.e = false;
            return;
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.e;
        int i7 = this.a;
        if (z10 && Objects.equals(l10, this.b) && o02 == this.c && P == this.d) {
            if (elapsedRealtime - this.f >= i7) {
                ((l2.a0) e0Var.c).a.A1(new l2.m(2, new f0(3, i7), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = elapsedRealtime;
        this.b = l10;
        this.c = o02;
        this.d = P;
        i0Var.e(3);
        i0Var.a.sendEmptyMessageDelayed(3, i7);
    }
}
