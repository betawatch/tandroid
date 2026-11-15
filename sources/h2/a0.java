package h2;

import android.os.SystemClock;
import e2.i1;
import e2.l1;
import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        l2.f0 f0Var = (l2.f0) e0Var.a;
        if (f0Var.i() != 2 || !f0Var.u() || f0Var.w0() != 0) {
            if (this.e) {
                i0Var.e(1);
            }
            this.e = false;
            return;
        }
        l1 y02 = f0Var.y0();
        Object l10 = y02.p() ? null : y02.l(f0Var.B());
        int n02 = f0Var.n0();
        int O = f0Var.O();
        long d02 = f0Var.d0();
        long max = Math.max(0L, f0Var.r() - Math.max(0L, d02 - f0Var.l()));
        if (l10 != null && n02 == -1) {
            d02 -= l0.h0(y02.g(l10, (i1) e0Var.e).e);
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.e && Objects.equals(l10, this.h) && n02 == this.f && O == this.g && d02 == this.a && max == this.b) {
            if (elapsedRealtime - this.c >= i7) {
                ((l2.z) e0Var.c).a.A1(new l2.l(2, new f0(1, i7), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.c = elapsedRealtime;
        this.h = l10;
        this.f = n02;
        this.g = O;
        this.a = d02;
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
