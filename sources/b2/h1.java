package b2;

import j$.util.Objects;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class h1 {
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
    public b g = b.c;

    static {
        String str = e2.d0.a;
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

    public final int b(long j3) {
        a a2;
        int i10;
        b bVar = this.g;
        long j10 = this.d;
        int i11 = bVar.a;
        if (j3 != Long.MIN_VALUE && (j10 == -9223372036854775807L || j3 < j10)) {
            int i12 = 0;
            while (i12 < i11) {
                bVar.a(i12).getClass();
                bVar.a(i12).getClass();
                if (0 > j3 && ((i10 = (a2 = bVar.a(i12)).a) == -1 || a2.a(-1) < i10)) {
                    break;
                }
                i12++;
            }
            if (i12 < i11) {
                if (j10 != -9223372036854775807L) {
                    bVar.a(i12).getClass();
                    if (0 <= j10) {
                    }
                }
                return i12;
            }
        }
        return -1;
    }

    public final int c(long j3) {
        int i10;
        b bVar = this.g;
        int i11 = bVar.a;
        int i12 = i11 - 1;
        if (i12 == i11 - 1) {
            bVar.a(i12).getClass();
        }
        while (i12 >= 0 && j3 != Long.MIN_VALUE) {
            bVar.a(i12).getClass();
            if (j3 >= 0) {
                break;
            }
            i12--;
        }
        if (i12 >= 0) {
            a a2 = bVar.a(i12);
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
        if (obj != null && h1.class.equals(obj.getClass())) {
            h1 h1Var = (h1) obj;
            if (Objects.equals(this.a, h1Var.a) && Objects.equals(this.b, h1Var.b) && this.c == h1Var.c && this.d == h1Var.d && this.e == h1Var.e && this.f == h1Var.f && Objects.equals(this.g, h1Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i10) {
        b bVar = this.g;
        int i11 = bVar.a;
        if (i10 != i11 - 1 || i10 != i11 - 1) {
            return false;
        }
        bVar.a(i10).getClass();
        return false;
    }

    public final boolean g(int i10) {
        this.g.a(i10).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i10, long j3, long j10, b bVar, boolean z10) {
        this.a = obj;
        this.b = obj2;
        this.c = i10;
        this.d = j3;
        this.e = j10;
        this.g = bVar;
        this.f = z10;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j3 = this.d;
        int i10 = (hashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.e;
        return this.g.hashCode() + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
