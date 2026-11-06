package e2;

import j$.util.Objects;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i1 {
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
        String str = h2.m0.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public final long a(int i7, int i10) {
        a a10 = this.g.a(i7);
        if (a10.a != -1) {
            return a10.f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j3) {
        a a10;
        int i7;
        c cVar = this.g;
        long j10 = this.d;
        int i10 = cVar.a;
        if (j3 != Long.MIN_VALUE && (j10 == -9223372036854775807L || j3 < j10)) {
            int i11 = 0;
            while (i11 < i10) {
                cVar.a(i11).getClass();
                cVar.a(i11).getClass();
                if (0 > j3 && ((i7 = (a10 = cVar.a(i11)).a) == -1 || a10.a(-1) < i7)) {
                    break;
                }
                i11++;
            }
            if (i11 < i10) {
                if (j10 != -9223372036854775807L) {
                    cVar.a(i11).getClass();
                    if (0 <= j10) {
                    }
                }
                return i11;
            }
        }
        return -1;
    }

    public final int c(long j3) {
        int i7;
        c cVar = this.g;
        int i10 = cVar.a;
        int i11 = i10 - 1;
        if (i11 == i10 - 1) {
            cVar.a(i11).getClass();
        }
        while (i11 >= 0 && j3 != Long.MIN_VALUE) {
            cVar.a(i11).getClass();
            if (j3 >= 0) {
                break;
            }
            i11--;
        }
        if (i11 >= 0) {
            a a10 = cVar.a(i11);
            int i12 = a10.a;
            if (i12 != -1) {
                while (i7 < i12) {
                    int i13 = a10.e[i7];
                    i7 = (i13 == 0 || i13 == 1) ? 0 : i7 + 1;
                }
            }
            return i11;
        }
        return -1;
    }

    public final long d(int i7) {
        this.g.a(i7).getClass();
        return 0L;
    }

    public final int e(int i7) {
        return this.g.a(i7).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !i1.class.equals(obj.getClass())) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Objects.equals(this.a, i1Var.a) && Objects.equals(this.b, i1Var.b) && this.c == i1Var.c && this.d == i1Var.d && this.e == i1Var.e && this.f == i1Var.f && Objects.equals(this.g, i1Var.g);
    }

    public final boolean f(int i7) {
        c cVar = this.g;
        int i10 = cVar.a;
        if (i7 != i10 - 1 || i7 != i10 - 1) {
            return false;
        }
        cVar.a(i7).getClass();
        return false;
    }

    public final boolean g(int i7) {
        this.g.a(i7).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i7, long j3, long j10, c cVar, boolean z9) {
        this.a = obj;
        this.b = obj2;
        this.c = i7;
        this.d = j3;
        this.e = j10;
        this.g = cVar;
        this.f = z9;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (qs.u3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j3 = this.d;
        int i7 = (hashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.e;
        return this.g.hashCode() + ((((i7 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
