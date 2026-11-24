// default package

import android.net.Uri;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nka extends bqb {
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
    public final k4f o;
    public final bt6 p;
    public final ws6 q;

    static {
        ps6 ps6Var = new ps6();
        ps6Var.a = "SinglePeriodTimeline";
        ps6Var.b = Uri.EMPTY;
        ps6Var.a();
    }

    public nka(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, k4f k4fVar, bt6 bt6Var, ws6 ws6Var) {
        this.e = j;
        this.f = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = k4fVar;
        bt6Var.getClass();
        this.p = bt6Var;
        this.q = ws6Var;
    }

    @Override // bqb
    public final int b(Object obj) {
        return r != obj ? -1 : 0;
    }

    @Override // bqb
    public final ypb f(int i, ypb ypbVar, boolean z) {
        jte.j(i, 1);
        Object obj = z ? r : null;
        long j = -this.j;
        da daVar = da.c;
        ypbVar.h(null, obj, 0, this.h, j, false);
        return ypbVar;
    }

    @Override // bqb
    public final int h() {
        return 1;
    }

    @Override // bqb
    public final Object l(int i) {
        jte.j(i, 1);
        return r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r1 > r3) goto L12;
     */
    @Override // bqb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aqb m(int i, aqb aqbVar, long j) {
        long j2;
        jte.j(i, 1);
        long j3 = this.k;
        boolean z = this.m;
        if (z && !this.n && j != 0) {
            long j4 = this.i;
            if (j4 != -9223372036854775807L) {
                j3 += j;
            }
            j2 = -9223372036854775807L;
            aqbVar.b(aqb.p, this.p, this.o, this.e, this.f, this.g, this.l, z, this.q, j2, this.i, 0, 0, this.j);
            return aqbVar;
        }
        j2 = j3;
        aqbVar.b(aqb.p, this.p, this.o, this.e, this.f, this.g, this.l, z, this.q, j2, this.i, 0, 0, this.j);
        return aqbVar;
    }

    @Override // bqb
    public final int o() {
        return 1;
    }
}
