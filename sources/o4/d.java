package o4;

import j3.h2;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public final void E1(t tVar) {
        s sVar = this.b;
        sVar.getClass();
        sVar.E1(this);
    }

    @Override // o4.n0
    public final long H() {
        long H = this.a.H();
        if (H != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || H < j10) {
                return H;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o4.t
    public final void J(s sVar, long j10) {
        this.b = sVar;
        this.a.J(this, j10);
    }

    @Override // o4.m0
    public final void X1(n0 n0Var) {
        s sVar = this.b;
        sVar.getClass();
        sVar.X1(this);
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
    public final long Y(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
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
        long Y = this.a.Y(cVarArr, zArr, l0VarArr2, zArr2, j10);
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
                            if (Y != j10) {
                                if (Y >= this.e) {
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
                            return Y;
                        }
                        j11 = Y;
                        this.d = j11;
                        if (Y != j10) {
                        }
                        h5.a.i(z4);
                        while (i11 < l0VarArr.length) {
                        }
                        return Y;
                    }
                }
            }
        }
        j11 = -9223372036854775807L;
        this.d = j11;
        if (Y != j10) {
        }
        h5.a.i(z4);
        while (i11 < l0VarArr.length) {
        }
        return Y;
    }

    public final boolean a() {
        return this.d != -9223372036854775807L;
    }

    @Override // o4.t
    public final long a1() {
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long a12 = a1();
            return a12 != -9223372036854775807L ? a12 : j10;
        }
        long a13 = this.a.a1();
        if (a13 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        h5.a.i(a13 >= this.e);
        long j11 = this.f;
        h5.a.i(j11 == Long.MIN_VALUE || a13 <= j11);
        return a13;
    }

    @Override // o4.n0
    public final boolean b() {
        return this.a.b();
    }

    @Override // o4.t
    public final void d0() {
        this.a.d0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r7) goto L17;
     */
    @Override // o4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j0(long j10) {
        this.d = -9223372036854775807L;
        boolean z4 = false;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long j02 = this.a.j0(j10);
        if (j02 != j10) {
            if (j02 >= this.e) {
                long j11 = this.f;
                if (j11 != Long.MIN_VALUE) {
                }
            }
            h5.a.i(z4);
            return j02;
        }
        z4 = true;
        h5.a.i(z4);
        return j02;
    }

    @Override // o4.n0
    public final void k2(long j10) {
        this.a.k2(j10);
    }

    @Override // o4.t
    public final void m0(long j10) {
        this.a.m0(j10);
    }

    @Override // o4.n0
    public final boolean n0(long j10) {
        return this.a.n0(j10);
    }

    @Override // o4.t
    public final t0 o1() {
        return this.a.o1();
    }

    @Override // o4.n0
    public final long y1() {
        long y12 = this.a.y1();
        if (y12 != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || y12 < j10) {
                return y12;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o4.t
    public final long z(long j10, h2 h2Var) {
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
        return this.a.z(j10, h2Var);
    }
}
