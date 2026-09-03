package b4;

import j3.m0;
import j3.n0;
import java.util.Collections;
import k7.t6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s implements i {
    public final d0 a;
    public String b;
    public r3.v c;
    public r d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final v g = new v(32);
    public final v h = new v(33);
    public final v i = new v(34);
    public final v j = new v(39);
    public final v k = new v(40);
    public long m = -9223372036854775807L;
    public final h5.w n = new h5.w();

    public s(d0 d0Var) {
        this.a = d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023b A[SYNTHETIC] */
    @Override // b4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(h5.w wVar) {
        int i10;
        byte[] bArr;
        int i11;
        int i12;
        long j10;
        int i13;
        boolean e;
        v vVar;
        int i14;
        v vVar2;
        boolean z4;
        boolean z10;
        h5.w wVar2 = wVar;
        h5.a.j(this.c);
        int i15 = h5.d0.a;
        while (wVar2.a() > 0) {
            int i16 = wVar2.b;
            int i17 = wVar2.c;
            byte[] bArr2 = wVar2.a;
            this.l += wVar2.a();
            this.c.d(wVar2.a(), wVar2);
            while (i16 < i17) {
                int r10 = h5.a.r(bArr2, i16, i17, this.f);
                if (r10 == i17) {
                    f(i16, i17, bArr2);
                    return;
                }
                int i18 = r10 + 3;
                int i19 = (bArr2[i18] & 126) >> 1;
                int i20 = r10 - i16;
                if (i20 > 0) {
                    f(i16, r10, bArr2);
                }
                int i21 = i17 - r10;
                long j11 = this.l - i21;
                int i22 = i20 < 0 ? -i20 : 0;
                long j12 = this.m;
                r3.v[] vVarArr = this.a.c;
                r rVar = this.d;
                boolean z11 = this.e;
                if (rVar.j && rVar.g) {
                    rVar.m = rVar.c;
                    rVar.j = false;
                } else if (rVar.h || rVar.g) {
                    if (z11 && rVar.i) {
                        long j13 = rVar.b;
                        int i23 = i21 + ((int) (j11 - j13));
                        long j14 = rVar.l;
                        if (j14 != -9223372036854775807L) {
                            rVar.a.c(j14, rVar.m ? 1 : 0, (int) (j13 - rVar.k), i23, null);
                        }
                    }
                    rVar.k = rVar.b;
                    rVar.l = rVar.e;
                    rVar.m = rVar.c;
                    rVar.i = true;
                }
                boolean z12 = this.e;
                v vVar3 = this.g;
                v vVar4 = this.h;
                v vVar5 = this.i;
                if (!z12) {
                    vVar3.e(i22);
                    vVar4.e(i22);
                    vVar5.e(i22);
                    if (vVar3.e && vVar4.e && vVar5.e) {
                        r3.v vVar6 = this.c;
                        i10 = i17;
                        String str = this.b;
                        bArr = bArr2;
                        int i24 = vVar3.c;
                        i11 = i18;
                        byte[] bArr3 = new byte[vVar4.c + i24 + vVar5.c];
                        i13 = i21;
                        i12 = i19;
                        System.arraycopy((byte[]) vVar3.f, 0, bArr3, 0, i24);
                        j10 = j11;
                        System.arraycopy((byte[]) vVar4.f, 0, bArr3, vVar3.c, vVar4.c);
                        System.arraycopy((byte[]) vVar5.f, 0, bArr3, vVar3.c + vVar4.c, vVar5.c);
                        h5.p B = h5.a.B(3, vVar4.c, (byte[]) vVar4.f);
                        String d = h5.a.d(B.a, B.c, B.d, B.f, B.b, B.e);
                        m0 m0Var = new m0();
                        m0Var.a = str;
                        m0Var.o = "video/hevc";
                        m0Var.h = d;
                        m0Var.t = B.g;
                        m0Var.u = B.h;
                        m0Var.x = B.i;
                        m0Var.q = Collections.singletonList(bArr3);
                        vVar6.b(new n0(m0Var));
                        this.e = true;
                        v vVar7 = this.j;
                        e = vVar7.e(i22);
                        h5.w wVar3 = this.n;
                        if (e) {
                            wVar3.D(h5.a.J(vVar7.c, (byte[]) vVar7.f), (byte[]) vVar7.f);
                            wVar3.G(5);
                            t6.a(j12, wVar3, vVarArr);
                        }
                        vVar = this.k;
                        if (vVar.e(i22)) {
                            wVar3.D(h5.a.J(vVar.c, (byte[]) vVar.f), (byte[]) vVar.f);
                            wVar3.G(5);
                            t6.a(j12, wVar3, vVarArr);
                        }
                        long j15 = this.m;
                        r rVar2 = this.d;
                        boolean z13 = this.e;
                        rVar2.g = false;
                        rVar2.h = false;
                        rVar2.e = j15;
                        rVar2.d = 0;
                        long j16 = j10;
                        rVar2.b = j16;
                        i14 = i12;
                        if (i14 >= 32 || i14 == 40) {
                            vVar2 = vVar5;
                            z4 = false;
                        } else {
                            if (!rVar2.i || rVar2.j) {
                                vVar2 = vVar5;
                                z4 = false;
                            } else {
                                if (z13) {
                                    long j17 = rVar2.l;
                                    if (j17 != -9223372036854775807L) {
                                        vVar2 = vVar5;
                                        rVar2.a.c(j17, rVar2.m ? 1 : 0, (int) (j16 - rVar2.k), i13, null);
                                        z4 = false;
                                        rVar2.i = false;
                                    }
                                }
                                vVar2 = vVar5;
                                z4 = false;
                                rVar2.i = false;
                            }
                            if ((32 <= i14 && i14 <= 35) || i14 == 39) {
                                rVar2.h = !rVar2.j;
                                rVar2.j = true;
                                z10 = i14 < 16 && i14 <= 21;
                                rVar2.c = z10;
                                if (!z10 || i14 <= 9) {
                                    z4 = true;
                                }
                                rVar2.f = z4;
                                if (!this.e) {
                                    vVar3.g(i14);
                                    vVar4.g(i14);
                                    vVar2.g(i14);
                                }
                                vVar7.g(i14);
                                vVar.g(i14);
                                i17 = i10;
                                bArr2 = bArr;
                                i16 = i11;
                            }
                        }
                        if (i14 < 16) {
                        }
                        rVar2.c = z10;
                        if (!z10) {
                        }
                        z4 = true;
                        rVar2.f = z4;
                        if (!this.e) {
                        }
                        vVar7.g(i14);
                        vVar.g(i14);
                        i17 = i10;
                        bArr2 = bArr;
                        i16 = i11;
                    }
                }
                i10 = i17;
                bArr = bArr2;
                i11 = i18;
                i12 = i19;
                j10 = j11;
                i13 = i21;
                v vVar72 = this.j;
                e = vVar72.e(i22);
                h5.w wVar32 = this.n;
                if (e) {
                }
                vVar = this.k;
                if (vVar.e(i22)) {
                }
                long j152 = this.m;
                r rVar22 = this.d;
                boolean z132 = this.e;
                rVar22.g = false;
                rVar22.h = false;
                rVar22.e = j152;
                rVar22.d = 0;
                long j162 = j10;
                rVar22.b = j162;
                i14 = i12;
                if (i14 >= 32) {
                }
                vVar2 = vVar5;
                z4 = false;
                if (i14 < 16) {
                }
                rVar22.c = z10;
                if (!z10) {
                }
                z4 = true;
                rVar22.f = z4;
                if (!this.e) {
                }
                vVar72.g(i14);
                vVar.g(i14);
                i17 = i10;
                bArr2 = bArr;
                i16 = i11;
            }
            wVar2 = wVar;
        }
    }

    @Override // b4.i
    public final void b() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        h5.a.m(this.f);
        this.g.f();
        this.h.f();
        this.i.f();
        this.j.f();
        this.k.f();
        r rVar = this.d;
        if (rVar != null) {
            rVar.f = false;
            rVar.g = false;
            rVar.h = false;
            rVar.i = false;
            rVar.j = false;
        }
    }

    @Override // b4.i
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.b = h0Var.e;
        h0Var.b();
        r3.v d22 = mVar.d2(h0Var.d, 2);
        this.c = d22;
        this.d = new r(d22);
        this.a.b(mVar, h0Var);
    }

    @Override // b4.i
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.m = j10;
        }
    }

    public final void f(int i10, int i11, byte[] bArr) {
        r rVar = this.d;
        if (rVar.f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                rVar.g = (bArr[i13] & 128) != 0;
                rVar.f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.i.a(i10, i11, bArr);
        }
        this.j.a(i10, i11, bArr);
        this.k.a(i10, i11, bArr);
    }

    @Override // b4.i
    public final void d() {
    }
}
