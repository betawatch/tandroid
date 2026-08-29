package l4;

import j3.j2;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements z, y {
    public final z a;
    public y b;
    public c[] c = new c[0];
    public long d;
    public long e;
    public long f;
    public f h;

    public d(z zVar, boolean z10, long j10, long j11) {
        this.a = zVar;
        this.d = z10 ? j10 : -9223372036854775807L;
        this.e = j10;
        this.f = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x011c, code lost:
    
        if (r10 > r2) goto L93;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00e2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    @Override // l4.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long A(d5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        long j11;
        a5.e e10;
        int a2;
        this.c = new c[c1VarArr.length];
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i10 = 0;
        while (true) {
            c1 c1Var = null;
            if (i10 >= c1VarArr.length) {
                break;
            }
            c[] cVarArr = this.c;
            c cVar = (c) c1VarArr[i10];
            cVarArr[i10] = cVar;
            if (cVar != null) {
                c1Var = cVar.a;
            }
            c1VarArr2[i10] = c1Var;
            i10++;
        }
        long A = this.a.A(rVarArr, zArr, c1VarArr2, zArr2, j10);
        boolean z10 = true;
        if (d()) {
            long j12 = this.e;
            if (j10 == j12 && j12 != 0) {
                for (d5.r rVar : rVarArr) {
                    if (rVar != null) {
                        j3.t0 n10 = rVar.n();
                        String str = n10.B;
                        String str2 = n10.r;
                        ArrayList arrayList = f5.o.a;
                        if (str != null) {
                            switch (str) {
                                case "audio/mp4a-latm":
                                    if (str2 != null && (e10 = f5.o.e(str2)) != null && (a2 = e10.a()) != 0 && a2 != 16) {
                                        break;
                                    }
                                    break;
                            }
                            this.d = j11;
                            if (A != j10) {
                                if (A >= this.e) {
                                    long j13 = this.f;
                                    if (j13 != Long.MIN_VALUE) {
                                    }
                                }
                                z10 = false;
                            }
                            f5.a.i(z10);
                            for (int i11 = 0; i11 < c1VarArr.length; i11++) {
                                c1 c1Var2 = c1VarArr2[i11];
                                if (c1Var2 == null) {
                                    this.c[i11] = null;
                                } else {
                                    c[] cVarArr2 = this.c;
                                    c cVar2 = cVarArr2[i11];
                                    if (cVar2 == null || cVar2.a != c1Var2) {
                                        cVarArr2[i11] = new c(this, c1Var2);
                                    }
                                }
                                c1VarArr[i11] = this.c[i11];
                            }
                            return A;
                        }
                        j11 = A;
                        this.d = j11;
                        if (A != j10) {
                        }
                        f5.a.i(z10);
                        while (i11 < c1VarArr.length) {
                        }
                        return A;
                    }
                }
            }
        }
        j11 = -9223372036854775807L;
        this.d = j11;
        if (A != j10) {
        }
        f5.a.i(z10);
        while (i11 < c1VarArr.length) {
        }
        return A;
    }

    @Override // l4.z
    public final long E() {
        if (d()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long E = E();
            return E != -9223372036854775807L ? E : j10;
        }
        long E2 = this.a.E();
        if (E2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        f5.a.i(E2 >= this.e);
        long j11 = this.f;
        f5.a.i(j11 == Long.MIN_VALUE || E2 <= j11);
        return E2;
    }

    @Override // l4.z
    public final k1 J() {
        return this.a.J();
    }

    @Override // l4.e1
    public final long L() {
        long L = this.a.L();
        if (L != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || L < j10) {
                return L;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // l4.e1
    public final void U(long j10) {
        this.a.U(j10);
    }

    @Override // l4.d1
    public final void a(e1 e1Var) {
        y yVar = this.b;
        yVar.getClass();
        yVar.a(this);
    }

    @Override // l4.e1
    public final boolean b() {
        return this.a.b();
    }

    @Override // l4.y
    public final void c(z zVar) {
        if (this.h != null) {
            return;
        }
        y yVar = this.b;
        yVar.getClass();
        yVar.c(this);
    }

    public final boolean d() {
        return this.d != -9223372036854775807L;
    }

    @Override // l4.z
    public final long f(long j10, j2 j2Var) {
        long j11 = this.e;
        if (j10 == j11) {
            return j11;
        }
        long i10 = f5.d0.i(j2Var.a, 0L, j10 - j11);
        long j12 = j2Var.b;
        long j13 = this.f;
        long i11 = f5.d0.i(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (i10 != j2Var.a || i11 != j2Var.b) {
            j2Var = new j2(i10, i11);
        }
        return this.a.f(j10, j2Var);
    }

    @Override // l4.e1
    public final long h() {
        long h = this.a.h();
        if (h != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || h < j10) {
                return h;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // l4.z
    public final void n(y yVar, long j10) {
        this.b = yVar;
        this.a.n(this, j10);
    }

    @Override // l4.z
    public final void o() {
        f fVar = this.h;
        if (fVar != null) {
            throw fVar;
        }
        this.a.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r7) goto L17;
     */
    @Override // l4.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long p(long j10) {
        this.d = -9223372036854775807L;
        boolean z10 = false;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long p10 = this.a.p(j10);
        if (p10 != j10) {
            if (p10 >= this.e) {
                long j11 = this.f;
                if (j11 != Long.MIN_VALUE) {
                }
            }
            f5.a.i(z10);
            return p10;
        }
        z10 = true;
        f5.a.i(z10);
        return p10;
    }

    @Override // l4.z
    public final void r(long j10) {
        this.a.r(j10);
    }

    @Override // l4.e1
    public final boolean s(long j10) {
        return this.a.s(j10);
    }
}
