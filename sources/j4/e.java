package j4;

import h3.j2;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements a0, z {
    public final a0 a;
    public z b;
    public d[] c = new d[0];
    public long d;
    public long e;
    public long f;
    public g h;

    public e(a0 a0Var, boolean z10, long j10, long j11) {
        this.a = a0Var;
        this.d = z10 ? j10 : -9223372036854775807L;
        this.e = j10;
        this.f = j11;
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    @Override // j4.d1
    public final boolean b() {
        return this.a.b();
    }

    @Override // j4.c1
    public final void c(d1 d1Var) {
        z zVar = this.b;
        zVar.getClass();
        zVar.c(this);
    }

    @Override // j4.d1
    public final long d() {
        long d = this.a.d();
        if (d != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || d < j10) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // j4.z
    public final void f(a0 a0Var) {
        if (this.h != null) {
            return;
        }
        z zVar = this.b;
        zVar.getClass();
        zVar.f(this);
    }

    @Override // j4.a0
    public final void g() {
        g gVar = this.h;
        if (gVar != null) {
            throw gVar;
        }
        this.a.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r7) goto L17;
     */
    @Override // j4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i(long j10) {
        this.d = -9223372036854775807L;
        boolean z10 = false;
        for (d dVar : this.c) {
            if (dVar != null) {
                dVar.b = false;
            }
        }
        long i9 = this.a.i(j10);
        if (i9 != j10) {
            if (i9 >= this.e) {
                long j11 = this.f;
                if (j11 != Long.MIN_VALUE) {
                }
            }
            d5.a.i(z10);
            return i9;
        }
        z10 = true;
        d5.a.i(z10);
        return i9;
    }

    @Override // j4.a0
    public final void k(long j10) {
        this.a.k(j10);
    }

    @Override // j4.d1
    public final boolean n(long j10) {
        return this.a.n(j10);
    }

    @Override // j4.a0
    public final long o() {
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long o6 = o();
            return o6 != -9223372036854775807L ? o6 : j10;
        }
        long o9 = this.a.o();
        if (o9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        d5.a.i(o9 >= this.e);
        long j11 = this.f;
        d5.a.i(j11 == Long.MIN_VALUE || o9 <= j11);
        return o9;
    }

    @Override // j4.a0
    public final j1 q() {
        return this.a.q();
    }

    @Override // j4.a0
    public final long u(long j10, j2 j2Var) {
        long j11 = this.e;
        if (j10 == j11) {
            return j11;
        }
        long i9 = d5.f0.i(j2Var.a, 0L, j10 - j11);
        long j12 = j2Var.b;
        long j13 = this.f;
        long i10 = d5.f0.i(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (i9 != j2Var.a || i10 != j2Var.b) {
            j2Var = new j2(i9, i10);
        }
        return this.a.u(j10, j2Var);
    }

    @Override // j4.d1
    public final long v() {
        long v = this.a.v();
        if (v != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || v < j10) {
                return v;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // j4.a0
    public final void w(z zVar, long j10) {
        this.b = zVar;
        this.a.w(this, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x011c, code lost:
    
        if (r10 > r2) goto L93;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00e2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    @Override // j4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long x(b5.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        long j11;
        d5.p e10;
        int a2;
        this.c = new d[b1VarArr.length];
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i9 = 0;
        while (true) {
            b1 b1Var = null;
            if (i9 >= b1VarArr.length) {
                break;
            }
            d[] dVarArr = this.c;
            d dVar = (d) b1VarArr[i9];
            dVarArr[i9] = dVar;
            if (dVar != null) {
                b1Var = dVar.a;
            }
            b1VarArr2[i9] = b1Var;
            i9++;
        }
        long x10 = this.a.x(tVarArr, zArr, b1VarArr2, zArr2, j10);
        boolean z10 = true;
        if (a()) {
            long j12 = this.e;
            if (j10 == j12 && j12 != 0) {
                for (b5.t tVar : tVarArr) {
                    if (tVar != null) {
                        h3.t0 o6 = tVar.o();
                        String str = o6.B;
                        String str2 = o6.r;
                        ArrayList arrayList = d5.q.a;
                        if (str != null) {
                            switch (str) {
                                case "audio/mp4a-latm":
                                    if (str2 != null && (e10 = d5.q.e(str2)) != null && (a2 = e10.a()) != 0 && a2 != 16) {
                                        break;
                                    }
                                    break;
                            }
                            this.d = j11;
                            if (x10 != j10) {
                                if (x10 >= this.e) {
                                    long j13 = this.f;
                                    if (j13 != Long.MIN_VALUE) {
                                    }
                                }
                                z10 = false;
                            }
                            d5.a.i(z10);
                            for (int i10 = 0; i10 < b1VarArr.length; i10++) {
                                b1 b1Var2 = b1VarArr2[i10];
                                if (b1Var2 == null) {
                                    this.c[i10] = null;
                                } else {
                                    d[] dVarArr2 = this.c;
                                    d dVar2 = dVarArr2[i10];
                                    if (dVar2 == null || dVar2.a != b1Var2) {
                                        dVarArr2[i10] = new d(this, b1Var2);
                                    }
                                }
                                b1VarArr[i10] = this.c[i10];
                            }
                            return x10;
                        }
                        j11 = x10;
                        this.d = j11;
                        if (x10 != j10) {
                        }
                        d5.a.i(z10);
                        while (i10 < b1VarArr.length) {
                        }
                        return x10;
                    }
                }
            }
        }
        j11 = -9223372036854775807L;
        this.d = j11;
        if (x10 != j10) {
        }
        d5.a.i(z10);
        while (i10 < b1VarArr.length) {
        }
        return x10;
    }

    @Override // j4.d1
    public final void z(long j10) {
        this.a.z(j10);
    }
}
