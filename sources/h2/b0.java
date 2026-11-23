package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b0 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ e0 h;

    public b0(e0 e0Var, int i7) {
        this.h = e0Var;
        this.a = i7;
    }

    public final void a() {
        e0 e0Var = this.h;
        i0 i0Var = (i0) e0Var.f;
        l2.g0 g0Var = (l2.g0) e0Var.a;
        if (!g0Var.j()) {
            if (this.f) {
                i0Var.e(2);
            }
            this.f = false;
            return;
        }
        l1 z02 = g0Var.z0();
        Object l10 = z02.p() ? null : z02.l(g0Var.C());
        int o02 = g0Var.o0();
        int P = g0Var.P();
        long n10 = g0Var.n();
        if (l10 != null && o02 == -1) {
            n10 -= l0.h0(z02.g(l10, (i1) e0Var.e).e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f;
        int i7 = this.a;
        if (z10 && Objects.equals(l10, this.b) && o02 == this.c && P == this.d && n10 == this.e) {
            if (elapsedRealtime - this.g >= i7) {
                ((l2.a0) e0Var.c).a.A1(new l2.m(2, new f0(2, i7), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.b = l10;
        this.c = o02;
        this.d = P;
        this.e = n10;
        i0Var.e(2);
        i0Var.a.sendEmptyMessageDelayed(2, i7);
    }
}
