// default package

import android.net.Uri;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lia extends aob {
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
    public final i2f o;
    public final br6 p;
    public final wq6 q;

    static {
        pq6 pq6Var = new pq6();
        pq6Var.a = "SinglePeriodTimeline";
        pq6Var.b = Uri.EMPTY;
        pq6Var.a();
    }

    public lia(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, i2f i2fVar, br6 br6Var, wq6 wq6Var) {
        this.e = j;
        this.f = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = i2fVar;
        br6Var.getClass();
        this.p = br6Var;
        this.q = wq6Var;
    }

    @Override // aob
    public final int b(Object obj) {
        return r != obj ? -1 : 0;
    }

    @Override // aob
    public final xnb f(int i, xnb xnbVar, boolean z) {
        gre.j(i, 1);
        Object obj = z ? r : null;
        long j = -this.j;
        da daVar = da.c;
        xnbVar.h(null, obj, 0, this.h, j, false);
        return xnbVar;
    }

    @Override // aob
    public final int h() {
        return 1;
    }

    @Override // aob
    public final Object l(int i) {
        gre.j(i, 1);
        return r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r1 > r3) goto L12;
     */
    @Override // aob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final znb m(int i, znb znbVar, long j) {
        long j2;
        gre.j(i, 1);
        long j3 = this.k;
        boolean z = this.m;
        if (z && !this.n && j != 0) {
            long j4 = this.i;
            if (j4 != -9223372036854775807L) {
                j3 += j;
            }
            j2 = -9223372036854775807L;
            znbVar.b(znb.p, this.p, this.o, this.e, this.f, this.g, this.l, z, this.q, j2, this.i, 0, 0, this.j);
            return znbVar;
        }
        j2 = j3;
        znbVar.b(znb.p, this.p, this.o, this.e, this.f, this.g, this.l, z, this.q, j2, this.i, 0, 0, this.j);
        return znbVar;
    }

    @Override // aob
    public final int o() {
        return 1;
    }
}
