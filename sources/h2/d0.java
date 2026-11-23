package h2;

import android.os.SystemClock;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class d0 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ e0 e;

    public d0(e0 e0Var, int i7) {
        this.e = e0Var;
        this.a = i7;
    }

    public final void a() {
        e0 e0Var = this.e;
        i0 i0Var = (i0) e0Var.f;
        l2.g0 g0Var = (l2.g0) e0Var.a;
        int x02 = g0Var.x0();
        if (!g0Var.v() || g0Var.i() == 1 || g0Var.i() == 4 || x02 == 0 || x02 == 1) {
            if (this.c) {
                i0Var.e(4);
            }
            this.c = false;
            return;
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.c;
        int i7 = this.a;
        if (z10 && this.b == x02) {
            if (elapsedRealtime - this.d >= i7) {
                ((l2.a0) e0Var.c).a.A1(new l2.m(2, new f0(4, i7), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = elapsedRealtime;
        this.b = x02;
        i0Var.e(4);
        i0Var.a.sendEmptyMessageDelayed(4, i7);
    }
}
