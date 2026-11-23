package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a0 {
    public long a;
    public long b;
    public long c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public Object h;
    public final Object i;

    public a0(e0 e0Var, int i7) {
        this.i = e0Var;
        this.d = i7;
    }

    public void a() {
        int i7 = this.d;
        e0 e0Var = (e0) this.i;
        i0 i0Var = (i0) e0Var.f;
        l2.g0 g0Var = (l2.g0) e0Var.a;
        if (g0Var.i() != 2 || !g0Var.v() || g0Var.x0() != 0) {
            if (this.e) {
                i0Var.e(1);
            }
            this.e = false;
            return;
        }
        l1 z02 = g0Var.z0();
        Object l10 = z02.p() ? null : z02.l(g0Var.C());
        int o02 = g0Var.o0();
        int P = g0Var.P();
        long e02 = g0Var.e0();
        long max = Math.max(0L, g0Var.s() - Math.max(0L, e02 - g0Var.n()));
        if (l10 != null && o02 == -1) {
            e02 -= l0.h0(z02.g(l10, (i1) e0Var.e).e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.e && Objects.equals(l10, this.h) && o02 == this.f && P == this.g && e02 == this.a && max == this.b) {
            if (elapsedRealtime - this.c >= i7) {
                ((l2.a0) e0Var.c).a.A1(new l2.m(2, new f0(1, i7), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.c = elapsedRealtime;
        this.h = l10;
        this.f = o02;
        this.g = P;
        this.a = e02;
        this.b = max;
        i0Var.e(1);
        i0Var.a.sendEmptyMessageDelayed(1, i7);
    }

    public a0(String str, long j3, long j10, long j11, jg.o0 o0Var) {
        this.i = o0Var;
        this.h = str;
        this.a = j3;
        this.b = j10;
        this.c = j11;
    }
}
