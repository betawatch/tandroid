package j3;

import android.util.Pair;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a extends r2 {
    public static final /* synthetic */ int d = 0;
    public final int b;
    public final l4.h1 c;

    public a(l4.h1 h1Var) {
        this.c = h1Var;
        this.b = h1Var.getLength();
    }

    @Override // j3.r2
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

    @Override // j3.r2
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

    @Override // j3.r2
    public final int c(boolean z10) {
        int i10 = this.b;
        if (i10 != 0) {
            l4.h1 h1Var = this.c;
            int f9 = z10 ? h1Var.f() : i10 - 1;
            while (x(f9).p()) {
                f9 = z10 ? h1Var.c(f9) : f9 > 0 ? f9 - 1 : -1;
                if (f9 == -1) {
                }
            }
            return x(f9).c(z10) + v(f9);
        }
        return -1;
    }

    @Override // j3.r2
    public final int e(int i10, int i11, boolean z10) {
        int s10 = s(i10);
        int v = v(s10);
        int e10 = x(s10).e(i10 - v, i11 == 2 ? 0 : i11, z10);
        if (e10 != -1) {
            return v + e10;
        }
        int w10 = w(s10, z10);
        while (w10 != -1 && x(w10).p()) {
            w10 = w(w10, z10);
        }
        if (w10 != -1) {
            return x(w10).a(z10) + v(w10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // j3.r2
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        int r6 = r(i10);
        int v = v(r6);
        x(r6).f(i10 - u(r6), p2Var, z10);
        p2Var.c += v;
        if (z10) {
            Object t10 = t(r6);
            Object obj = p2Var.b;
            obj.getClass();
            p2Var.b = Pair.create(t10, obj);
        }
        return p2Var;
    }

    @Override // j3.r2
    public final p2 g(Object obj, p2 p2Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q6 = q(obj2);
        int v = v(q6);
        x(q6).g(obj3, p2Var);
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
    @Override // j3.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i10, int i11, boolean z10) {
        int i12;
        int s10 = s(i10);
        int v = v(s10);
        int k9 = x(s10).k(i10 - v, i11 == 2 ? 0 : i11, z10);
        if (k9 != -1) {
            return v + k9;
        }
        l4.h1 h1Var = this.c;
        if (z10) {
            i12 = h1Var.c(s10);
        }
        while (i12 != -1 && x(i12).p()) {
            i12 = z10 ? h1Var.c(i12) : i12 > 0 ? i12 - 1 : -1;
        }
        if (i12 != -1) {
            return x(i12).c(z10) + v(i12);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // j3.r2
    public final Object l(int i10) {
        int r6 = r(i10);
        return Pair.create(t(r6), x(r6).l(i10 - u(r6)));
    }

    @Override // j3.r2
    public final q2 m(int i10, q2 q2Var, long j10) {
        int s10 = s(i10);
        int v = v(s10);
        int u10 = u(s10);
        x(s10).m(i10 - v, q2Var, j10);
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

    public abstract int r(int i10);

    public abstract int s(int i10);

    public abstract Object t(int i10);

    public abstract int u(int i10);

    public abstract int v(int i10);

    public final int w(int i10, boolean z10) {
        if (z10) {
            return this.c.d(i10);
        }
        if (i10 < this.b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public abstract r2 x(int i10);
}
