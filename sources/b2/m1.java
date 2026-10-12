package b2;

import j$.util.Objects;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class m1 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public c g = c.c;

    static {
        String str = e2.m0.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        a a2 = this.g.a(i10);
        if (a2.a != -1) {
            return a2.f[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long j10) {
        a a2;
        int i10;
        c cVar = this.g;
        long j11 = this.d;
        int i11 = cVar.a;
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i12 = 0;
            while (i12 < i11) {
                cVar.a(i12).getClass();
                cVar.a(i12).getClass();
                if (0 > j10 && ((i10 = (a2 = cVar.a(i12)).a) == -1 || a2.a(-1) < i10)) {
                    break;
                }
                i12++;
            }
            if (i12 < i11) {
                if (j11 != -9223372036854775807L) {
                    cVar.a(i12).getClass();
                    if (0 <= j11) {
                    }
                }
                return i12;
            }
        }
        return -1;
    }

    public final int c(long j10) {
        int i10;
        c cVar = this.g;
        int i11 = cVar.a;
        int i12 = i11 - 1;
        if (i12 == i11 - 1) {
            cVar.a(i12).getClass();
        }
        while (i12 >= 0 && j10 != Long.MIN_VALUE) {
            cVar.a(i12).getClass();
            if (j10 >= 0) {
                break;
            }
            i12--;
        }
        if (i12 >= 0) {
            a a2 = cVar.a(i12);
            int i13 = a2.a;
            if (i13 != -1) {
                while (i10 < i13) {
                    int i14 = a2.e[i10];
                    i10 = (i14 == 0 || i14 == 1) ? 0 : i10 + 1;
                }
            }
            return i12;
        }
        return -1;
    }

    public final long d(int i10) {
        this.g.a(i10).getClass();
        return 0L;
    }

    public final int e(int i10) {
        return this.g.a(i10).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m1.class.equals(obj.getClass())) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Objects.equals(this.a, m1Var.a) && Objects.equals(this.b, m1Var.b) && this.c == m1Var.c && this.d == m1Var.d && this.e == m1Var.e && this.f == m1Var.f && Objects.equals(this.g, m1Var.g);
    }

    public final boolean f(int i10) {
        c cVar = this.g;
        int i11 = cVar.a;
        if (i10 != i11 - 1 || i10 != i11 - 1) {
            return false;
        }
        cVar.a(i10).getClass();
        return false;
    }

    public final boolean g(int i10) {
        this.g.a(i10).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i10, long j10, long j11, c cVar, boolean z10) {
        this.a = obj;
        this.b = obj2;
        this.c = i10;
        this.d = j10;
        this.e = j11;
        this.g = cVar;
        this.f = z10;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j10 = this.d;
        int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.e;
        return this.g.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
