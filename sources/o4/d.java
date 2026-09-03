package o4;

import j3.h2;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d implements t, s {
    public final t a;
    public s b;
    public c[] c = new c[0];
    public long d;
    public long e;
    public long f;

    public d(t tVar, boolean z4, long j10, long j11) {
        this.a = tVar;
        this.d = z4 ? j10 : -9223372036854775807L;
        this.e = j10;
        this.f = j11;
    }

    @Override // o4.s
    public final void a(t tVar) {
        s sVar = this.b;
        sVar.getClass();
        sVar.a(this);
    }

    @Override // o4.n0
    public final boolean b() {
        return this.a.b();
    }

    public final boolean c() {
        return this.d != -9223372036854775807L;
    }

    @Override // o4.t
    public final long d(long j10, h2 h2Var) {
        long j11 = this.e;
        if (j10 == j11) {
            return j11;
        }
        long i10 = h5.d0.i(h2Var.a, 0L, j10 - j11);
        long j12 = h2Var.b;
        long j13 = this.f;
        long i11 = h5.d0.i(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (i10 != h2Var.a || i11 != h2Var.b) {
            h2Var = new h2(i10, i11);
        }
        return this.a.d(j10, h2Var);
    }

    @Override // o4.n0
    public final long e() {
        long e6 = this.a.e();
        if (e6 != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || e6 < j10) {
                return e6;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o4.t
    public final void f(s sVar, long j10) {
        this.b = sVar;
        this.a.f(this, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x011c, code lost:
    
        if (r10 > r2) goto L93;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00e2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    @Override // o4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
        long j11;
        c5.e e6;
        int a2;
        this.c = new c[l0VarArr.length];
        l0[] l0VarArr2 = new l0[l0VarArr.length];
        int i10 = 0;
        while (true) {
            l0 l0Var = null;
            if (i10 >= l0VarArr.length) {
                break;
            }
            c[] cVarArr2 = this.c;
            c cVar = (c) l0VarArr[i10];
            cVarArr2[i10] = cVar;
            if (cVar != null) {
                l0Var = cVar.a;
            }
            l0VarArr2[i10] = l0Var;
            i10++;
        }
        long g10 = this.a.g(cVarArr, zArr, l0VarArr2, zArr2, j10);
        boolean z4 = true;
        if (c()) {
            long j12 = this.e;
            if (j10 == j12 && j12 != 0) {
                for (f5.c cVar2 : cVarArr) {
                    if (cVar2 != null) {
                        j3.n0 g11 = cVar2.g();
                        String str = g11.C;
                        String str2 = g11.r;
                        ArrayList arrayList = h5.o.a;
                        if (str != null) {
                            switch (str) {
                                case "audio/mp4a-latm":
                                    if (str2 != null && (e6 = h5.o.e(str2)) != null && (a2 = e6.a()) != 0 && a2 != 16) {
                                        break;
                                    }
                                    break;
                            }
                            this.d = j11;
                            if (g10 != j10) {
                                if (g10 >= this.e) {
                                    long j13 = this.f;
                                    if (j13 != Long.MIN_VALUE) {
                                    }
                                }
                                z4 = false;
                            }
                            h5.a.i(z4);
                            for (int i11 = 0; i11 < l0VarArr.length; i11++) {
                                l0 l0Var2 = l0VarArr2[i11];
                                if (l0Var2 == null) {
                                    this.c[i11] = null;
                                } else {
                                    c[] cVarArr3 = this.c;
                                    c cVar3 = cVarArr3[i11];
                                    if (cVar3 == null || cVar3.a != l0Var2) {
                                        cVarArr3[i11] = new c(this, l0Var2);
                                    }
                                }
                                l0VarArr[i11] = this.c[i11];
                            }
                            return g10;
                        }
                        j11 = g10;
                        this.d = j11;
                        if (g10 != j10) {
                        }
                        h5.a.i(z4);
                        while (i11 < l0VarArr.length) {
                        }
                        return g10;
                    }
                }
            }
        }
        j11 = -9223372036854775807L;
        this.d = j11;
        if (g10 != j10) {
        }
        h5.a.i(z4);
        while (i11 < l0VarArr.length) {
        }
        return g10;
    }

    @Override // o4.t
    public final void i() {
        this.a.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r7) goto L17;
     */
    @Override // o4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j(long j10) {
        this.d = -9223372036854775807L;
        boolean z4 = false;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long j11 = this.a.j(j10);
        if (j11 != j10) {
            if (j11 >= this.e) {
                long j12 = this.f;
                if (j12 != Long.MIN_VALUE) {
                }
            }
            h5.a.i(z4);
            return j11;
        }
        z4 = true;
        h5.a.i(z4);
        return j11;
    }

    @Override // o4.t
    public final void k(long j10) {
        this.a.k(j10);
    }

    @Override // o4.n0
    public final boolean m(long j10) {
        return this.a.m(j10);
    }

    @Override // o4.t
    public final long n() {
        if (c()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long n10 = n();
            return n10 != -9223372036854775807L ? n10 : j10;
        }
        long n11 = this.a.n();
        if (n11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        h5.a.i(n11 >= this.e);
        long j11 = this.f;
        h5.a.i(j11 == Long.MIN_VALUE || n11 <= j11);
        return n11;
    }

    @Override // o4.t
    public final t0 o() {
        return this.a.o();
    }

    @Override // o4.n0
    public final long r() {
        long r10 = this.a.r();
        if (r10 != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || r10 < j10) {
                return r10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o4.m0
    public final void s(n0 n0Var) {
        s sVar = this.b;
        sVar.getClass();
        sVar.s(this);
    }

    @Override // o4.n0
    public final void t(long j10) {
        this.a.t(j10);
    }
}
