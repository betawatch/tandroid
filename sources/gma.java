// default package

import android.net.Uri;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gma extends asb {
    public static final Object r = new Object();
    public final long e;
    public final long f;
    public final long g = -9223372036854775807L;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final z6f o;
    public final ft6 p;
    public final at6 q;

    static {
        ts6 ts6Var = new ts6();
        ts6Var.a = "SinglePeriodTimeline";
        ts6Var.b = Uri.EMPTY;
        ts6Var.a();
    }

    public gma(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, z6f z6fVar, ft6 ft6Var, at6 at6Var) {
        this.e = j;
        this.f = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z6fVar;
        ft6Var.getClass();
        this.p = ft6Var;
        this.q = at6Var;
    }

    @Override // asb
    public final int b(Object obj) {
        return r != obj ? -1 : 0;
    }

    @Override // asb
    public final xrb f(int i, xrb xrbVar, boolean z) {
        yve.j(i, 1);
        Object obj = z ? r : null;
        long j = -this.j;
        ea eaVar = ea.c;
        xrbVar.h(null, obj, 0, this.h, j, false);
        return xrbVar;
    }

    @Override // asb
    public final int h() {
        return 1;
    }

    @Override // asb
    public final Object l(int i) {
        yve.j(i, 1);
        return r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r1 > r3) goto L12;
     */
    @Override // asb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zrb m(int i, zrb zrbVar, long j) {
        long j2;
        yve.j(i, 1);
        long j3 = this.k;
        boolean z = this.m;
        if (z && !this.n && j != 0) {
            long j4 = this.i;
            if (j4 != -9223372036854775807L) {
                j3 += j;
            }
            j2 = -9223372036854775807L;
            zrbVar.b(zrb.p, this.p, this.o, this.e, this.f, this.g, this.l, z, this.q, j2, this.i, 0, 0, this.j);
            return zrbVar;
        }
        j2 = j3;
        zrbVar.b(zrb.p, this.p, this.o, this.e, this.f, this.g, this.l, z, this.q, j2, this.i, 0, 0, this.j);
        return zrbVar;
    }

    @Override // asb
    public final int o() {
        return 1;
    }
}
