package i2;

import android.util.Pair;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class a extends b2.o1 {
    public static final /* synthetic */ int g = 0;
    public final int e;
    public final u2.h1 f;

    public a(u2.h1 h1Var) {
        this.f = h1Var;
        this.e = h1Var.getLength();
    }

    @Override // b2.o1
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

    @Override // b2.o1
    public final int b(Object obj) {
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q6 = q(obj2);
        if (q6 == -1 || (b10 = x(q6).b(obj3)) == -1) {
            return -1;
        }
        return u(q6) + b10;
    }

    @Override // b2.o1
    public final int c(boolean z10) {
        int i10 = this.e;
        if (i10 != 0) {
            u2.h1 h1Var = this.f;
            int h = z10 ? h1Var.h() : i10 - 1;
            while (x(h).p()) {
                h = z10 ? h1Var.d(h) : h > 0 ? h - 1 : -1;
                if (h == -1) {
                }
            }
            return x(h).c(z10) + v(h);
        }
        return -1;
    }

    @Override // b2.o1
    public final int e(int i10, int i11, boolean z10) {
        int s10 = s(i10);
        int v = v(s10);
        int e = x(s10).e(i10 - v, i11 == 2 ? 0 : i11, z10);
        if (e != -1) {
            return v + e;
        }
        int w9 = w(s10, z10);
        while (w9 != -1 && x(w9).p()) {
            w9 = w(w9, z10);
        }
        if (w9 != -1) {
            return x(w9).a(z10) + v(w9);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // b2.o1
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        int r10 = r(i10);
        int v = v(r10);
        x(r10).f(i10 - u(r10), l1Var, z10);
        l1Var.c += v;
        if (z10) {
            Object t10 = t(r10);
            Object obj = l1Var.b;
            obj.getClass();
            l1Var.b = Pair.create(t10, obj);
        }
        return l1Var;
    }

    @Override // b2.o1
    public final b2.l1 g(Object obj, b2.l1 l1Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q6 = q(obj2);
        int v = v(q6);
        x(q6).g(obj3, l1Var);
        l1Var.c += v;
        l1Var.b = obj;
        return l1Var;
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
    @Override // b2.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i10, int i11, boolean z10) {
        int i12;
        int s10 = s(i10);
        int v = v(s10);
        int k10 = x(s10).k(i10 - v, i11 == 2 ? 0 : i11, z10);
        if (k10 != -1) {
            return v + k10;
        }
        u2.h1 h1Var = this.f;
        if (z10) {
            i12 = h1Var.d(s10);
        }
        while (i12 != -1 && x(i12).p()) {
            i12 = z10 ? h1Var.d(i12) : i12 > 0 ? i12 - 1 : -1;
        }
        if (i12 != -1) {
            return x(i12).c(z10) + v(i12);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // b2.o1
    public final Object l(int i10) {
        int r10 = r(i10);
        return Pair.create(t(r10), x(r10).l(i10 - u(r10)));
    }

    @Override // b2.o1
    public final b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        int s10 = s(i10);
        int v = v(s10);
        int u10 = u(s10);
        x(s10).m(i10 - v, n1Var, j10);
        Object t10 = t(s10);
        if (!b2.n1.q.equals(n1Var.a)) {
            t10 = Pair.create(t10, n1Var.a);
        }
        n1Var.a = t10;
        n1Var.n += u10;
        n1Var.o += u10;
        return n1Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i10);

    public abstract int s(int i10);

    public abstract Object t(int i10);

    public abstract int u(int i10);

    public abstract int v(int i10);

    public final int w(int i10, boolean z10) {
        if (z10) {
            return this.f.e(i10);
        }
        if (i10 < this.e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public abstract b2.o1 x(int i10);
}
