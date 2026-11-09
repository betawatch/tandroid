package l2;

import android.util.Pair;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class a extends e2.l1 {
    public static final /* synthetic */ int g = 0;
    public final int e;
    public final x2.h1 f;

    public a(x2.h1 h1Var) {
        this.f = h1Var;
        this.e = h1Var.getLength();
    }

    @Override // e2.l1
    public final int a(boolean z9) {
        if (this.e != 0) {
            int b10 = z9 ? this.f.b() : 0;
            while (x(b10).p()) {
                b10 = w(b10, z9);
                if (b10 == -1) {
                }
            }
            return x(b10).a(z9) + v(b10);
        }
        return -1;
    }

    @Override // e2.l1
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

    @Override // e2.l1
    public final int c(boolean z9) {
        int i7 = this.e;
        if (i7 != 0) {
            x2.h1 h1Var = this.f;
            int h = z9 ? h1Var.h() : i7 - 1;
            while (x(h).p()) {
                h = z9 ? h1Var.d(h) : h > 0 ? h - 1 : -1;
                if (h == -1) {
                }
            }
            return x(h).c(z9) + v(h);
        }
        return -1;
    }

    @Override // e2.l1
    public final int e(int i7, int i10, boolean z9) {
        int s5 = s(i7);
        int v = v(s5);
        int e10 = x(s5).e(i7 - v, i10 == 2 ? 0 : i10, z9);
        if (e10 != -1) {
            return v + e10;
        }
        int w10 = w(s5, z9);
        while (w10 != -1 && x(w10).p()) {
            w10 = w(w10, z9);
        }
        if (w10 != -1) {
            return x(w10).a(z9) + v(w10);
        }
        if (i10 == 2) {
            return a(z9);
        }
        return -1;
    }

    @Override // e2.l1
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        int r10 = r(i7);
        int v = v(r10);
        x(r10).f(i7 - u(r10), i1Var, z9);
        i1Var.c += v;
        if (z9) {
            Object t6 = t(r10);
            Object obj = i1Var.b;
            obj.getClass();
            i1Var.b = Pair.create(t6, obj);
        }
        return i1Var;
    }

    @Override // e2.l1
    public final e2.i1 g(Object obj, e2.i1 i1Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        int v = v(q10);
        x(q10).g(obj3, i1Var);
        i1Var.c += v;
        i1Var.b = obj;
        return i1Var;
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
    @Override // e2.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i7, int i10, boolean z9) {
        int i11;
        int s5 = s(i7);
        int v = v(s5);
        int k10 = x(s5).k(i7 - v, i10 == 2 ? 0 : i10, z9);
        if (k10 != -1) {
            return v + k10;
        }
        x2.h1 h1Var = this.f;
        if (z9) {
            i11 = h1Var.d(s5);
        }
        while (i11 != -1 && x(i11).p()) {
            i11 = z9 ? h1Var.d(i11) : i11 > 0 ? i11 - 1 : -1;
        }
        if (i11 != -1) {
            return x(i11).c(z9) + v(i11);
        }
        if (i10 == 2) {
            return c(z9);
        }
        return -1;
    }

    @Override // e2.l1
    public final Object l(int i7) {
        int r10 = r(i7);
        return Pair.create(t(r10), x(r10).l(i7 - u(r10)));
    }

    @Override // e2.l1
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        int s5 = s(i7);
        int v = v(s5);
        int u10 = u(s5);
        x(s5).m(i7 - v, k1Var, j3);
        Object t6 = t(s5);
        if (!e2.k1.q.equals(k1Var.a)) {
            t6 = Pair.create(t6, k1Var.a);
        }
        k1Var.a = t6;
        k1Var.n += u10;
        k1Var.o += u10;
        return k1Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i7);

    public abstract int s(int i7);

    public abstract Object t(int i7);

    public abstract int u(int i7);

    public abstract int v(int i7);

    public final int w(int i7, boolean z9) {
        if (z9) {
            return this.f.e(i7);
        }
        if (i7 < this.e - 1) {
            return i7 + 1;
        }
        return -1;
    }

    public abstract e2.l1 x(int i7);
}
