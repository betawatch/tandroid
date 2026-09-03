package j3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m2 implements g {
    public static final String n;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final String w;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public p4.b h = p4.b.f;

    static {
        int i10 = h5.d0.a;
        n = Integer.toString(0, 36);
        r = Integer.toString(1, 36);
        s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        p4.a a2 = this.h.a(i10);
        if (a2.b != -1) {
            return a2.f[i11];
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(long j10) {
        p4.a a2;
        int i10;
        p4.b bVar = this.h;
        long j11 = this.d;
        int i11 = bVar.a;
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i12 = bVar.d;
            while (i12 < i11 && ((bVar.a(i12).a != Long.MIN_VALUE && bVar.a(i12).a <= j10) || ((i10 = (a2 = bVar.a(i12)).b) != -1 && a2.a(-1) >= i10))) {
                i12++;
            }
        }
        return -1;
    }

    public final int c(long j10) {
        int i10;
        p4.b bVar = this.h;
        long j11 = this.d;
        int i11 = bVar.a - 1;
        int i12 = i11 - (bVar.b(i11) ? 1 : 0);
        while (i12 >= 0 && j10 != Long.MIN_VALUE) {
            p4.a a2 = bVar.a(i12);
            long j12 = a2.a;
            if (j12 != Long.MIN_VALUE) {
                if (j10 >= j12) {
                    break;
                }
                i12--;
            } else {
                if (j11 != -9223372036854775807L && ((!a2.n || a2.b != -1) && j10 >= j11)) {
                    break;
                }
                i12--;
            }
        }
        if (i12 >= 0) {
            p4.a a10 = bVar.a(i12);
            int i13 = a10.b;
            if (i13 != -1) {
                while (i10 < i13) {
                    int i14 = a10.e[i10];
                    i10 = (i14 == 0 || i14 == 1) ? 0 : i10 + 1;
                }
            }
            return i12;
        }
        return -1;
    }

    public final long d(int i10) {
        return this.h.a(i10).a;
    }

    public final int e(int i10, int i11) {
        p4.a a2 = this.h.a(i10);
        if (a2.b != -1) {
            return a2.e[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m2.class.equals(obj.getClass())) {
            m2 m2Var = (m2) obj;
            if (h5.d0.a(this.a, m2Var.a) && h5.d0.a(this.b, m2Var.b) && this.c == m2Var.c && this.d == m2Var.d && this.e == m2Var.e && this.f == m2Var.f && h5.d0.a(this.h, m2Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i10) {
        return this.h.a(i10).a(-1);
    }

    public final boolean g(int i10) {
        p4.b bVar = this.h;
        return i10 == bVar.a - 1 && bVar.b(i10);
    }

    public final boolean h(int i10) {
        return this.h.a(i10).n;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j10 = this.d;
        int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.e;
        return this.h.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i10, long j10, long j11, p4.b bVar, boolean z4) {
        this.a = obj;
        this.b = obj2;
        this.c = i10;
        this.d = j10;
        this.e = j11;
        this.h = bVar;
        this.f = z4;
    }
}
