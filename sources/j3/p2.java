package j3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p2 implements g {
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
    public m4.c h = m4.c.f;

    static {
        int i10 = f5.d0.a;
        n = Integer.toString(0, 36);
        r = Integer.toString(1, 36);
        s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        m4.b a2 = this.h.a(i10);
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
        m4.b a2;
        int i10;
        m4.c cVar = this.h;
        long j11 = this.d;
        int i11 = cVar.a;
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i12 = cVar.d;
            while (i12 < i11 && ((cVar.a(i12).a != Long.MIN_VALUE && cVar.a(i12).a <= j10) || ((i10 = (a2 = cVar.a(i12)).b) != -1 && a2.a(-1) >= i10))) {
                i12++;
            }
        }
        return -1;
    }

    public final int c(long j10) {
        int i10;
        m4.c cVar = this.h;
        long j11 = this.d;
        int i11 = cVar.a - 1;
        while (i11 >= 0 && j10 != Long.MIN_VALUE) {
            long j12 = cVar.a(i11).a;
            if (j12 != Long.MIN_VALUE) {
                if (j10 >= j12) {
                    break;
                }
                i11--;
            } else {
                if (j11 != -9223372036854775807L && j10 >= j11) {
                    break;
                }
                i11--;
            }
        }
        if (i11 >= 0) {
            m4.b a2 = cVar.a(i11);
            int i12 = a2.b;
            if (i12 != -1) {
                while (i10 < i12) {
                    int i13 = a2.e[i10];
                    i10 = (i13 == 0 || i13 == 1) ? 0 : i10 + 1;
                }
            }
            return i11;
        }
        return -1;
    }

    public final long d(int i10) {
        return this.h.a(i10).a;
    }

    public final int e(int i10, int i11) {
        m4.b a2 = this.h.a(i10);
        if (a2.b != -1) {
            return a2.e[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p2.class.equals(obj.getClass())) {
            p2 p2Var = (p2) obj;
            if (f5.d0.a(this.a, p2Var.a) && f5.d0.a(this.b, p2Var.b) && this.c == p2Var.c && this.d == p2Var.d && this.e == p2Var.e && this.f == p2Var.f && f5.d0.a(this.h, p2Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i10) {
        return this.h.a(i10).a(-1);
    }

    public final boolean g(int i10) {
        return this.h.a(i10).n;
    }

    public final void h(Object obj, Object obj2, int i10, long j10, long j11, m4.c cVar, boolean z10) {
        this.a = obj;
        this.b = obj2;
        this.c = i10;
        this.d = j10;
        this.e = j11;
        this.h = cVar;
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
        return this.h.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
