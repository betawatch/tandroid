package j4;

import h3.j2;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // j4.z
    public final long B(long j10, j2 j2Var) {
        long j11 = this.e;
        if (j10 == j11) {
            return j11;
        }
        long i10 = d5.g0.i(j2Var.a, 0L, j10 - j11);
        long j12 = j2Var.b;
        long j13 = this.f;
        long i11 = d5.g0.i(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (i10 != j2Var.a || i11 != j2Var.b) {
            j2Var = new j2(i10, i11);
        }
        return this.a.B(j10, j2Var);
    }

    @Override // j4.d1
    public final long D() {
        long D = this.a.D();
        if (D != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || D < j10) {
                return D;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // j4.z
    public final void E(y yVar, long j10) {
        this.b = yVar;
        this.a.E(this, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x011c, code lost:
    
        if (r10 > r2) goto L93;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00e2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    @Override // j4.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long F(b5.s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        long j11;
        d5.p e9;
        int a2;
        this.c = new c[b1VarArr.length];
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i10 = 0;
        while (true) {
            b1 b1Var = null;
            if (i10 >= b1VarArr.length) {
                break;
            }
            c[] cVarArr = this.c;
            c cVar = (c) b1VarArr[i10];
            cVarArr[i10] = cVar;
            if (cVar != null) {
                b1Var = cVar.a;
            }
            b1VarArr2[i10] = b1Var;
            i10++;
        }
        long F = this.a.F(sVarArr, zArr, b1VarArr2, zArr2, j10);
        boolean z10 = true;
        if (c()) {
            long j12 = this.e;
            if (j10 == j12 && j12 != 0) {
                for (b5.s sVar : sVarArr) {
                    if (sVar != null) {
                        h3.t0 o10 = sVar.o();
                        String str = o10.B;
                        String str2 = o10.r;
                        ArrayList arrayList = d5.q.a;
                        if (str != null) {
                            switch (str) {
                                case "audio/mp4a-latm":
                                    if (str2 != null && (e9 = d5.q.e(str2)) != null && (a2 = e9.a()) != 0 && a2 != 16) {
                                        break;
                                    }
                                    break;
                            }
                            this.d = j11;
                            if (F != j10) {
                                if (F >= this.e) {
                                    long j13 = this.f;
                                    if (j13 != Long.MIN_VALUE) {
                                    }
                                }
                                z10 = false;
                            }
                            d5.a.i(z10);
                            for (int i11 = 0; i11 < b1VarArr.length; i11++) {
                                b1 b1Var2 = b1VarArr2[i11];
                                if (b1Var2 == null) {
                                    this.c[i11] = null;
                                } else {
                                    c[] cVarArr2 = this.c;
                                    c cVar2 = cVarArr2[i11];
                                    if (cVar2 == null || cVar2.a != b1Var2) {
                                        cVarArr2[i11] = new c(this, b1Var2);
                                    }
                                }
                                b1VarArr[i11] = this.c[i11];
                            }
                            return F;
                        }
                        j11 = F;
                        this.d = j11;
                        if (F != j10) {
                        }
                        d5.a.i(z10);
                        while (i11 < b1VarArr.length) {
                        }
                        return F;
                    }
                }
            }
        }
        j11 = -9223372036854775807L;
        this.d = j11;
        if (F != j10) {
        }
        d5.a.i(z10);
        while (i11 < b1VarArr.length) {
        }
        return F;
    }

    @Override // j4.d1
    public final void I(long j10) {
        this.a.I(j10);
    }

    @Override // j4.c1
    public final void a(d1 d1Var) {
        y yVar = this.b;
        yVar.getClass();
        yVar.a(this);
    }

    @Override // j4.d1
    public final boolean b() {
        return this.a.b();
    }

    public final boolean c() {
        return this.d != -9223372036854775807L;
    }

    @Override // j4.y
    public final void e(z zVar) {
        if (this.h != null) {
            return;
        }
        y yVar = this.b;
        yVar.getClass();
        yVar.e(this);
    }

    @Override // j4.d1
    public final long g() {
        long g10 = this.a.g();
        if (g10 != Long.MIN_VALUE) {
            long j10 = this.f;
            if (j10 == Long.MIN_VALUE || g10 < j10) {
                return g10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // j4.z
    public final void m() {
        f fVar = this.h;
        if (fVar != null) {
            throw fVar;
        }
        this.a.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r7) goto L17;
     */
    @Override // j4.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o(long j10) {
        this.d = -9223372036854775807L;
        boolean z10 = false;
        for (c cVar : this.c) {
            if (cVar != null) {
                cVar.b = false;
            }
        }
        long o10 = this.a.o(j10);
        if (o10 != j10) {
            if (o10 >= this.e) {
                long j11 = this.f;
                if (j11 != Long.MIN_VALUE) {
                }
            }
            d5.a.i(z10);
            return o10;
        }
        z10 = true;
        d5.a.i(z10);
        return o10;
    }

    @Override // j4.z
    public final void p(long j10) {
        this.a.p(j10);
    }

    @Override // j4.d1
    public final boolean q(long j10) {
        return this.a.q(j10);
    }

    @Override // j4.z
    public final long w() {
        if (c()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long w10 = w();
            return w10 != -9223372036854775807L ? w10 : j10;
        }
        long w11 = this.a.w();
        if (w11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        d5.a.i(w11 >= this.e);
        long j11 = this.f;
        d5.a.i(j11 == Long.MIN_VALUE || w11 <= j11);
        return w11;
    }

    @Override // j4.z
    public final j1 z() {
        return this.a.z();
    }
}
