package o4;

import j3.h2;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    @Override // o4.t
    public final void B(long j10) {
        this.a.B(j10);
    }

    @Override // o4.n0
    public final boolean C(long j10) {
        return this.a.C(j10);
    }

    @Override // o4.t
    public final long K() {
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long K = K();
            return K != -9223372036854775807L ? K : j10;
        }
        long K2 = this.a.K();
        if (K2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        h5.a.i(K2 >= this.e);
        long j11 = this.f;
        h5.a.i(j11 == Long.MIN_VALUE || K2 <= j11);
        return K2;
    }

    @Override // o4.t
    public final t0 V() {
        return this.a.V();
    }

    @Override // o4.n0
    public final long X() {
        long X = this.a.X();
        if (X != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || X < j10) {
                return X;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o4.m0
    public final void Z(n0 n0Var) {
        s sVar = this.b;
        sVar.getClass();
        sVar.Z(this);
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    @Override // o4.n0
    public final boolean b() {
        return this.a.b();
    }

    @Override // o4.n0
    public final void f0(long j10) {
        this.a.f0(j10);
    }

    @Override // o4.t
    public final long h(long j10, h2 h2Var) {
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
        return this.a.h(j10, h2Var);
    }

    @Override // o4.n0
    public final long l() {
        long l10 = this.a.l();
        if (l10 != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || l10 < j10) {
                return l10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o4.s
    public final void n(t tVar) {
        s sVar = this.b;
        sVar.getClass();
        sVar.n(this);
    }

    @Override // o4.t
    public final void p(s sVar, long j10) {
        this.b = sVar;
        this.a.p(this, j10);
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
    public final long v(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
        long j11;
        c5.e e;
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
        long v = this.a.v(cVarArr, zArr, l0VarArr2, zArr2, j10);
        boolean z4 = true;
        if (a()) {
            long j12 = this.e;
            if (j10 == j12 && j12 != 0) {
                for (f5.c cVar2 : cVarArr) {
                    if (cVar2 != null) {
                        j3.n0 g10 = cVar2.g();
                        String str = g10.C;
                        String str2 = g10.r;
                        ArrayList arrayList = h5.o.a;
                        if (str != null) {
                            switch (str) {
                                case "audio/mp4a-latm":
                                    if (str2 != null && (e = h5.o.e(str2)) != null && (a2 = e.a()) != 0 && a2 != 16) {
                                        break;
                                    }
                                    break;
                            }
                            this.d = j11;
                            if (v != j10) {
                                if (v >= this.e) {
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
                            return v;
                        }
                        j11 = v;
                        this.d = j11;
                        if (v != j10) {
                        }
                        h5.a.i(z4);
                        while (i11 < l0VarArr.length) {
                        }
                        return v;
                    }
                }
            }
        }
        j11 = -9223372036854775807L;
        this.d = j11;
        if (v != j10) {
        }
        h5.a.i(z4);
        while (i11 < l0VarArr.length) {
        }
        return v;
    }

    @Override // o4.t
    public final void x() {
        this.a.x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r7) goto L17;
     */
    @Override // o4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long z(long j10) {
        this.d = -9223372036854775807L;
        boolean z4 = false;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long z10 = this.a.z(j10);
        if (z10 != j10) {
            if (z10 >= this.e) {
                long j11 = this.f;
                if (j11 != Long.MIN_VALUE) {
                }
            }
            h5.a.i(z4);
            return z10;
        }
        z4 = true;
        h5.a.i(z4);
        return z10;
    }
}
