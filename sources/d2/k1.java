package d2;

import j$.util.Objects;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k1 {
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
        String str = g2.n0.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public final long a(int i3, int i10) {
        a a10 = this.g.a(i3);
        if (a10.a != -1) {
            return a10.f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j10) {
        a a10;
        int i3;
        c cVar = this.g;
        long j11 = this.d;
        int i10 = cVar.a;
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i11 = 0;
            while (i11 < i10) {
                cVar.a(i11).getClass();
                cVar.a(i11).getClass();
                if (0 > j10 && ((i3 = (a10 = cVar.a(i11)).a) == -1 || a10.a(-1) < i3)) {
                    break;
                }
                i11++;
            }
            if (i11 < i10) {
                if (j11 != -9223372036854775807L) {
                    cVar.a(i11).getClass();
                    if (0 <= j11) {
                    }
                }
                return i11;
            }
        }
        return -1;
    }

    public final int c(long j10) {
        int i3;
        c cVar = this.g;
        int i10 = cVar.a;
        int i11 = i10 - 1;
        if (i11 == i10 - 1) {
            cVar.a(i11).getClass();
        }
        while (i11 >= 0 && j10 != Long.MIN_VALUE) {
            cVar.a(i11).getClass();
            if (j10 >= 0) {
                break;
            }
            i11--;
        }
        if (i11 >= 0) {
            a a10 = cVar.a(i11);
            int i12 = a10.a;
            if (i12 != -1) {
                while (i3 < i12) {
                    int i13 = a10.e[i3];
                    i3 = (i13 == 0 || i13 == 1) ? 0 : i3 + 1;
                }
            }
            return i11;
        }
        return -1;
    }

    public final long d(int i3) {
        this.g.a(i3).getClass();
        return 0L;
    }

    public final int e(int i3) {
        return this.g.a(i3).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k1.class.equals(obj.getClass())) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Objects.equals(this.a, k1Var.a) && Objects.equals(this.b, k1Var.b) && this.c == k1Var.c && this.d == k1Var.d && this.e == k1Var.e && this.f == k1Var.f && Objects.equals(this.g, k1Var.g);
    }

    public final boolean f(int i3) {
        c cVar = this.g;
        int i10 = cVar.a;
        if (i3 != i10 - 1 || i3 != i10 - 1) {
            return false;
        }
        cVar.a(i3).getClass();
        return false;
    }

    public final boolean g(int i3) {
        this.g.a(i3).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i3, long j10, long j11, c cVar, boolean z10) {
        this.a = obj;
        this.b = obj2;
        this.c = i3;
        this.d = j10;
        this.e = j11;
        this.g = cVar;
        this.f = z10;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (hs.u3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j10 = this.d;
        int i3 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.e;
        return this.g.hashCode() + ((((i3 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
