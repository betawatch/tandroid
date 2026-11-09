package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        l2.i0 i0Var2 = (l2.i0) e0Var.a;
        if (!i0Var2.h()) {
            if (this.f) {
                i0Var.e(2);
            }
            this.f = false;
            return;
        }
        l1 y02 = i0Var2.y0();
        Object l10 = y02.p() ? null : y02.l(i0Var2.B());
        int n02 = i0Var2.n0();
        int O = i0Var2.O();
        long l11 = i0Var2.l();
        if (l10 != null && n02 == -1) {
            l11 -= m0.h0(y02.g(l10, (i1) e0Var.e).e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z9 = this.f;
        int i7 = this.a;
        if (z9 && Objects.equals(l10, this.b) && n02 == this.c && O == this.d && l11 == this.e) {
            if (elapsedRealtime - this.g >= i7) {
                ((l2.c0) e0Var.c).a.A1(new l2.l(2, new f0(2, i7), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.b = l10;
        this.c = n02;
        this.d = O;
        this.e = l11;
        i0Var.e(2);
        i0Var.a.sendEmptyMessageDelayed(2, i7);
    }
}
