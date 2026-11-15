package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        l2.f0 f0Var = (l2.f0) e0Var.a;
        if (!f0Var.h()) {
            if (this.f) {
                i0Var.e(2);
            }
            this.f = false;
            return;
        }
        l1 y02 = f0Var.y0();
        Object l10 = y02.p() ? null : y02.l(f0Var.B());
        int n02 = f0Var.n0();
        int O = f0Var.O();
        long l11 = f0Var.l();
        if (l10 != null && n02 == -1) {
            l11 -= l0.h0(y02.g(l10, (i1) e0Var.e).e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f;
        int i7 = this.a;
        if (z10 && Objects.equals(l10, this.b) && n02 == this.c && O == this.d && l11 == this.e) {
            if (elapsedRealtime - this.g >= i7) {
                ((l2.z) e0Var.c).a.A1(new l2.l(2, new f0(2, i7), 1003));
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
