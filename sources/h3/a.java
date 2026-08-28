package h3;

import android.util.Pair;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a extends r2 {
    public static final /* synthetic */ int d = 0;
    public final int b;
    public final j4.g1 c;

    public a(j4.g1 g1Var) {
        this.c = g1Var;
        this.b = g1Var.getLength();
    }

    @Override // h3.r2
    public final int a(boolean z10) {
        if (this.b != 0) {
            int b10 = z10 ? this.c.b() : 0;
            while (x(b10).p()) {
                b10 = w(b10, z10);
                if (b10 == -1) {
                }
            }
            return x(b10).a(z10) + v(b10);
        }
        return -1;
    }

    @Override // h3.r2
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

    @Override // h3.r2
    public final int c(boolean z10) {
        int i9 = this.b;
        if (i9 != 0) {
            j4.g1 g1Var = this.c;
            int f10 = z10 ? g1Var.f() : i9 - 1;
            while (x(f10).p()) {
                f10 = z10 ? g1Var.c(f10) : f10 > 0 ? f10 - 1 : -1;
                if (f10 == -1) {
                }
            }
            return x(f10).c(z10) + v(f10);
        }
        return -1;
    }

    @Override // h3.r2
    public final int e(int i9, int i10, boolean z10) {
        int s10 = s(i9);
        int v = v(s10);
        int e10 = x(s10).e(i9 - v, i10 == 2 ? 0 : i10, z10);
        if (e10 != -1) {
            return v + e10;
        }
        int w8 = w(s10, z10);
        while (w8 != -1 && x(w8).p()) {
            w8 = w(w8, z10);
        }
        if (w8 != -1) {
            return x(w8).a(z10) + v(w8);
        }
        if (i10 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // h3.r2
    public final p2 f(int i9, p2 p2Var, boolean z10) {
        int r10 = r(i9);
        int v = v(r10);
        x(r10).f(i9 - u(r10), p2Var, z10);
        p2Var.c += v;
        if (z10) {
            Object t10 = t(r10);
            Object obj = p2Var.b;
            obj.getClass();
            p2Var.b = Pair.create(t10, obj);
        }
        return p2Var;
    }

    @Override // h3.r2
    public final p2 g(Object obj, p2 p2Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        int v = v(q10);
        x(q10).g(obj3, p2Var);
        p2Var.c += v;
        p2Var.b = obj;
        return p2Var;
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
    @Override // h3.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i9, int i10, boolean z10) {
        int i11;
        int s10 = s(i9);
        int v = v(s10);
        int k10 = x(s10).k(i9 - v, i10 == 2 ? 0 : i10, z10);
        if (k10 != -1) {
            return v + k10;
        }
        j4.g1 g1Var = this.c;
        if (z10) {
            i11 = g1Var.c(s10);
        }
        while (i11 != -1 && x(i11).p()) {
            i11 = z10 ? g1Var.c(i11) : i11 > 0 ? i11 - 1 : -1;
        }
        if (i11 != -1) {
            return x(i11).c(z10) + v(i11);
        }
        if (i10 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // h3.r2
    public final Object l(int i9) {
        int r10 = r(i9);
        return Pair.create(t(r10), x(r10).l(i9 - u(r10)));
    }

    @Override // h3.r2
    public final q2 m(int i9, q2 q2Var, long j10) {
        int s10 = s(i9);
        int v = v(s10);
        int u10 = u(s10);
        x(s10).m(i9 - v, q2Var, j10);
        Object t10 = t(s10);
        if (!q2.D.equals(q2Var.a)) {
            t10 = Pair.create(t10, q2Var.a);
        }
        q2Var.a = t10;
        q2Var.A += u10;
        q2Var.B += u10;
        return q2Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i9);

    public abstract int s(int i9);

    public abstract Object t(int i9);

    public abstract int u(int i9);

    public abstract int v(int i9);

    public final int w(int i9, boolean z10) {
        if (z10) {
            return this.c.d(i9);
        }
        if (i9 < this.b - 1) {
            return i9 + 1;
        }
        return -1;
    }

    public abstract r2 x(int i9);
}
