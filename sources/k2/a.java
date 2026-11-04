package k2;

import android.util.Pair;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a extends d2.n1 {
    public static final /* synthetic */ int g = 0;
    public final int e;
    public final w2.i1 f;

    public a(w2.i1 i1Var) {
        this.f = i1Var;
        this.e = i1Var.getLength();
    }

    @Override // d2.n1
    public final int a(boolean z10) {
        if (this.e != 0) {
            int b10 = z10 ? this.f.b() : 0;
            while (x(b10).p()) {
                b10 = w(b10, z10);
                if (b10 == -1) {
                }
            }
            return x(b10).a(z10) + v(b10);
        }
        return -1;
    }

    @Override // d2.n1
    public final int b(Object obj) {
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        if (q10 == -1 || (b10 = x(q10).b(obj3)) == -1) {
            return -1;
        }
        return u(q10) + b10;
    }

    @Override // d2.n1
    public final int c(boolean z10) {
        int i3 = this.e;
        if (i3 != 0) {
            w2.i1 i1Var = this.f;
            int h = z10 ? i1Var.h() : i3 - 1;
            while (x(h).p()) {
                h = z10 ? i1Var.d(h) : h > 0 ? h - 1 : -1;
                if (h == -1) {
                }
            }
            return x(h).c(z10) + v(h);
        }
        return -1;
    }

    @Override // d2.n1
    public final int e(int i3, int i10, boolean z10) {
        int s6 = s(i3);
        int v = v(s6);
        int e10 = x(s6).e(i3 - v, i10 == 2 ? 0 : i10, z10);
        if (e10 != -1) {
            return v + e10;
        }
        int w10 = w(s6, z10);
        while (w10 != -1 && x(w10).p()) {
            w10 = w(w10, z10);
        }
        if (w10 != -1) {
            return x(w10).a(z10) + v(w10);
        }
        if (i10 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // d2.n1
    public final d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        int r5 = r(i3);
        int v = v(r5);
        x(r5).f(i3 - u(r5), k1Var, z10);
        k1Var.c += v;
        if (z10) {
            Object t10 = t(r5);
            Object obj = k1Var.b;
            obj.getClass();
            k1Var.b = Pair.create(t10, obj);
        }
        return k1Var;
    }

    @Override // d2.n1
    public final d2.k1 g(Object obj, d2.k1 k1Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        int v = v(q10);
        x(q10).g(obj3, k1Var);
        k1Var.c += v;
        k1Var.b = obj;
        return k1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0025, code lost:
    
        if (r0 > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002b, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002b, code lost:
    
        r0 = r0 - 1;
     */
    @Override // d2.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i3, int i10, boolean z10) {
        int i11;
        int s6 = s(i3);
        int v = v(s6);
        int k10 = x(s6).k(i3 - v, i10 == 2 ? 0 : i10, z10);
        if (k10 != -1) {
            return v + k10;
        }
        w2.i1 i1Var = this.f;
        if (z10) {
            i11 = i1Var.d(s6);
        }
        while (i11 != -1 && x(i11).p()) {
            i11 = z10 ? i1Var.d(i11) : i11 > 0 ? i11 - 1 : -1;
        }
        if (i11 != -1) {
            return x(i11).c(z10) + v(i11);
        }
        if (i10 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // d2.n1
    public final Object l(int i3) {
        int r5 = r(i3);
        return Pair.create(t(r5), x(r5).l(i3 - u(r5)));
    }

    @Override // d2.n1
    public final d2.m1 m(int i3, d2.m1 m1Var, long j10) {
        int s6 = s(i3);
        int v = v(s6);
        int u10 = u(s6);
        x(s6).m(i3 - v, m1Var, j10);
        Object t10 = t(s6);
        if (!d2.m1.q.equals(m1Var.a)) {
            t10 = Pair.create(t10, m1Var.a);
        }
        m1Var.a = t10;
        m1Var.n += u10;
        m1Var.o += u10;
        return m1Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i3);

    public abstract int s(int i3);

    public abstract Object t(int i3);

    public abstract int u(int i3);

    public abstract int v(int i3);

    public final int w(int i3, boolean z10) {
        if (z10) {
            return this.f.e(i3);
        }
        if (i3 < this.e - 1) {
            return i3 + 1;
        }
        return -1;
    }

    public abstract d2.n1 x(int i3);
}
