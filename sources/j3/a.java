package j3;

import android.util.Pair;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class a extends o2 {
    public static final /* synthetic */ int d = 0;
    public final int b;
    public final o4.q0 c;

    public a(o4.q0 q0Var) {
        this.c = q0Var;
        this.b = q0Var.getLength();
    }

    @Override // j3.o2
    public final int a(boolean z4) {
        if (this.b != 0) {
            int a2 = z4 ? this.c.a() : 0;
            while (x(a2).p()) {
                a2 = w(a2, z4);
                if (a2 == -1) {
                }
            }
            return x(a2).a(z4) + v(a2);
        }
        return -1;
    }

    @Override // j3.o2
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

    @Override // j3.o2
    public final int c(boolean z4) {
        int i10 = this.b;
        if (i10 != 0) {
            o4.q0 q0Var = this.c;
            int f10 = z4 ? q0Var.f() : i10 - 1;
            while (x(f10).p()) {
                f10 = z4 ? q0Var.c(f10) : f10 > 0 ? f10 - 1 : -1;
                if (f10 == -1) {
                }
            }
            return x(f10).c(z4) + v(f10);
        }
        return -1;
    }

    @Override // j3.o2
    public final int e(int i10, int i11, boolean z4) {
        int s6 = s(i10);
        int v = v(s6);
        int e6 = x(s6).e(i10 - v, i11 == 2 ? 0 : i11, z4);
        if (e6 != -1) {
            return v + e6;
        }
        int w10 = w(s6, z4);
        while (w10 != -1 && x(w10).p()) {
            w10 = w(w10, z4);
        }
        if (w10 != -1) {
            return x(w10).a(z4) + v(w10);
        }
        if (i11 == 2) {
            return a(z4);
        }
        return -1;
    }

    @Override // j3.o2
    public final m2 f(int i10, m2 m2Var, boolean z4) {
        int r10 = r(i10);
        int v = v(r10);
        x(r10).f(i10 - u(r10), m2Var, z4);
        m2Var.c += v;
        if (z4) {
            Object t6 = t(r10);
            Object obj = m2Var.b;
            obj.getClass();
            m2Var.b = Pair.create(t6, obj);
        }
        return m2Var;
    }

    @Override // j3.o2
    public final m2 g(Object obj, m2 m2Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        int v = v(q10);
        x(q10).g(obj3, m2Var);
        m2Var.c += v;
        m2Var.b = obj;
        return m2Var;
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
    @Override // j3.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i10, int i11, boolean z4) {
        int i12;
        int s6 = s(i10);
        int v = v(s6);
        int k10 = x(s6).k(i10 - v, i11 == 2 ? 0 : i11, z4);
        if (k10 != -1) {
            return v + k10;
        }
        o4.q0 q0Var = this.c;
        if (z4) {
            i12 = q0Var.c(s6);
        }
        while (i12 != -1 && x(i12).p()) {
            i12 = z4 ? q0Var.c(i12) : i12 > 0 ? i12 - 1 : -1;
        }
        if (i12 != -1) {
            return x(i12).c(z4) + v(i12);
        }
        if (i11 == 2) {
            return c(z4);
        }
        return -1;
    }

    @Override // j3.o2
    public final Object l(int i10) {
        int r10 = r(i10);
        return Pair.create(t(r10), x(r10).l(i10 - u(r10)));
    }

    @Override // j3.o2
    public final n2 m(int i10, n2 n2Var, long j10) {
        int s6 = s(i10);
        int v = v(s6);
        int u10 = u(s6);
        x(s6).m(i10 - v, n2Var, j10);
        Object t6 = t(s6);
        if (!n2.E.equals(n2Var.a)) {
            t6 = Pair.create(t6, n2Var.a);
        }
        n2Var.a = t6;
        n2Var.B += u10;
        n2Var.C += u10;
        return n2Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i10);

    public abstract int s(int i10);

    public abstract Object t(int i10);

    public abstract int u(int i10);

    public abstract int v(int i10);

    public final int w(int i10, boolean z4) {
        if (z4) {
            return this.c.d(i10);
        }
        if (i10 < this.b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public abstract o2 x(int i10);
}
