package b4;

import android.util.SparseArray;
import j3.m0;
import j3.n0;
import java.util.ArrayList;
import java.util.Arrays;
import k7.t6;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q implements i {
    public final d0 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public r3.v j;
    public p k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final v d = new v(7);
    public final v e = new v(8);
    public final v f = new v(6);
    public long m = -9223372036854775807L;
    public final h5.w o = new h5.w();

    public q(d0 d0Var, boolean z4, boolean z10) {
        this.a = d0Var;
        this.b = z4;
        this.c = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01fb, code lost:
    
        if (r5.j == r7.j) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0205, code lost:
    
        if (r11 != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0217, code lost:
    
        if (r5.n == r7.n) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0228, code lost:
    
        if (r5.p == r7.p) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0236, code lost:
    
        if (r5.l == r7.l) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0291 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c6 A[ADDED_TO_REGION] */
    @Override // b4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(h5.w wVar) {
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        long j10;
        v vVar;
        p pVar;
        boolean z4;
        long j11;
        boolean z10;
        p pVar2;
        int i13;
        h5.a.j(this.j);
        int i14 = h5.d0.a;
        int i15 = wVar.b;
        int i16 = wVar.c;
        byte[] bArr2 = wVar.a;
        this.g += wVar.a();
        this.j.d(wVar.a(), wVar);
        while (true) {
            int r10 = h5.a.r(bArr2, i15, i16, this.h);
            if (r10 == i16) {
                f(i15, i16, bArr2);
                return;
            }
            int i17 = r10 + 3;
            int i18 = bArr2[i17] & 31;
            int i19 = r10 - i15;
            if (i19 > 0) {
                f(i15, r10, bArr2);
            }
            int i20 = i16 - r10;
            long j12 = this.g - i20;
            int i21 = i19 < 0 ? -i19 : 0;
            long j13 = this.m;
            boolean z11 = this.l;
            v vVar2 = this.d;
            v vVar3 = this.e;
            if (!z11 || this.k.c) {
                vVar2.e(i21);
                vVar3.e(i21);
                if (this.l) {
                    i10 = i20;
                    i11 = i16;
                    bArr = bArr2;
                    i12 = i17;
                    j10 = j12;
                    if (vVar2.e) {
                        h5.r C = h5.a.C(3, vVar2.c, (byte[]) vVar2.f);
                        this.k.d.append(C.d, C);
                        vVar2.f();
                    } else if (vVar3.e) {
                        h5.v vVar4 = new h5.v((byte[]) vVar3.f, 4, vVar3.c);
                        int l10 = vVar4.l();
                        int l11 = vVar4.l();
                        vVar4.r();
                        this.k.e.append(l10, new h5.q(l10, l11, vVar4.h()));
                        vVar3.f();
                    }
                } else if (vVar2.e && vVar3.e) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf((byte[]) vVar2.f, vVar2.c));
                    arrayList.add(Arrays.copyOf((byte[]) vVar3.f, vVar3.c));
                    i10 = i20;
                    h5.r C2 = h5.a.C(3, vVar2.c, (byte[]) vVar2.f);
                    i11 = i16;
                    bArr = bArr2;
                    h5.v vVar5 = new h5.v((byte[]) vVar3.f, 4, vVar3.c);
                    int l12 = vVar5.l();
                    int l13 = vVar5.l();
                    vVar5.r();
                    h5.q qVar = new h5.q(l12, l13, vVar5.h());
                    String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(C2.a), Integer.valueOf(C2.b), Integer.valueOf(C2.c));
                    r3.v vVar6 = this.j;
                    i12 = i17;
                    m0 m0Var = new m0();
                    j10 = j12;
                    m0Var.a = this.i;
                    m0Var.o = MediaController.VIDEO_MIME_TYPE;
                    m0Var.h = format;
                    m0Var.t = C2.e;
                    m0Var.u = C2.f;
                    m0Var.x = C2.g;
                    m0Var.q = arrayList;
                    vVar6.b(new n0(m0Var));
                    this.l = true;
                    this.k.d.append(C2.d, C2);
                    this.k.e.append(l12, qVar);
                    vVar2.f();
                    vVar3.f();
                }
                vVar = this.f;
                if (vVar.e(i21)) {
                    int J = h5.a.J(vVar.c, (byte[]) vVar.f);
                    byte[] bArr3 = (byte[]) vVar.f;
                    h5.w wVar2 = this.o;
                    wVar2.D(J, bArr3);
                    wVar2.F(4);
                    t6.a(j13, wVar2, this.a.c);
                }
                pVar = this.k;
                z4 = this.l;
                boolean z12 = this.n;
                if (pVar.i != 9) {
                    if (pVar.c) {
                        o oVar = pVar.n;
                        o oVar2 = pVar.m;
                        if (oVar.a) {
                            if (oVar2.a) {
                                h5.r rVar = oVar.c;
                                h5.a.j(rVar);
                                h5.r rVar2 = oVar2.c;
                                h5.a.j(rVar2);
                                int i22 = rVar2.k;
                                if (oVar.f == oVar2.f) {
                                    if (oVar.g == oVar2.g) {
                                        if (oVar.h == oVar2.h) {
                                            if (oVar.i) {
                                                if (oVar2.i) {
                                                }
                                            }
                                            int i23 = oVar.d;
                                            int i24 = oVar2.d;
                                            if (i23 != i24) {
                                                if (i23 != 0) {
                                                }
                                            }
                                            int i25 = rVar.k;
                                            if (i25 == 0) {
                                                if (i22 == 0) {
                                                    if (oVar.m == oVar2.m) {
                                                    }
                                                }
                                            }
                                            if (i25 == 1) {
                                                if (i22 == 1) {
                                                    if (oVar.o == oVar2.o) {
                                                    }
                                                }
                                            }
                                            boolean z13 = oVar.k;
                                            if (z13 == oVar2.k) {
                                                if (z13) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (pVar.b) {
                        o oVar3 = pVar.n;
                        z12 = oVar3.b && ((i13 = oVar3.e) == 7 || i13 == 2);
                    }
                    boolean z14 = pVar.r;
                    int i26 = pVar.i;
                    z10 = z14 | (i26 != 5 || (z12 && i26 == 1));
                    pVar.r = z10;
                    if (z10) {
                        this.n = false;
                    }
                    long j14 = this.m;
                    if (this.l || this.k.c) {
                        vVar2.g(i18);
                        vVar3.g(i18);
                    }
                    vVar.g(i18);
                    pVar2 = this.k;
                    pVar2.i = i18;
                    pVar2.l = j14;
                    pVar2.j = j10;
                    if ((pVar2.b && i18 == 1) || (pVar2.c && (i18 == 5 || i18 == 1 || i18 == 2))) {
                        o oVar4 = pVar2.m;
                        pVar2.m = pVar2.n;
                        pVar2.n = oVar4;
                        oVar4.b = false;
                        oVar4.a = false;
                        pVar2.h = 0;
                        pVar2.k = true;
                    }
                    i16 = i11;
                    bArr2 = bArr;
                    i15 = i12;
                }
                if (z4 && pVar.o) {
                    long j15 = pVar.j;
                    int i27 = i10 + ((int) (j10 - j15));
                    j11 = pVar.q;
                    if (j11 != -9223372036854775807L) {
                        pVar.a.c(j11, pVar.r ? 1 : 0, (int) (j15 - pVar.p), i27, null);
                    }
                }
                pVar.p = pVar.j;
                pVar.q = pVar.l;
                pVar.r = false;
                pVar.o = true;
                if (pVar.b) {
                }
                boolean z142 = pVar.r;
                int i262 = pVar.i;
                z10 = z142 | (i262 != 5 || (z12 && i262 == 1));
                pVar.r = z10;
                if (z10) {
                }
                long j142 = this.m;
                if (this.l) {
                }
                vVar2.g(i18);
                vVar3.g(i18);
                vVar.g(i18);
                pVar2 = this.k;
                pVar2.i = i18;
                pVar2.l = j142;
                pVar2.j = j10;
                if (pVar2.b) {
                    o oVar42 = pVar2.m;
                    pVar2.m = pVar2.n;
                    pVar2.n = oVar42;
                    oVar42.b = false;
                    oVar42.a = false;
                    pVar2.h = 0;
                    pVar2.k = true;
                    i16 = i11;
                    bArr2 = bArr;
                    i15 = i12;
                }
                o oVar422 = pVar2.m;
                pVar2.m = pVar2.n;
                pVar2.n = oVar422;
                oVar422.b = false;
                oVar422.a = false;
                pVar2.h = 0;
                pVar2.k = true;
                i16 = i11;
                bArr2 = bArr;
                i15 = i12;
            }
            i10 = i20;
            i11 = i16;
            bArr = bArr2;
            i12 = i17;
            j10 = j12;
            vVar = this.f;
            if (vVar.e(i21)) {
            }
            pVar = this.k;
            z4 = this.l;
            boolean z122 = this.n;
            if (pVar.i != 9) {
            }
            if (z4) {
                long j152 = pVar.j;
                int i272 = i10 + ((int) (j10 - j152));
                j11 = pVar.q;
                if (j11 != -9223372036854775807L) {
                }
            }
            pVar.p = pVar.j;
            pVar.q = pVar.l;
            pVar.r = false;
            pVar.o = true;
            if (pVar.b) {
            }
            boolean z1422 = pVar.r;
            int i2622 = pVar.i;
            z10 = z1422 | (i2622 != 5 || (z122 && i2622 == 1));
            pVar.r = z10;
            if (z10) {
            }
            long j1422 = this.m;
            if (this.l) {
            }
            vVar2.g(i18);
            vVar3.g(i18);
            vVar.g(i18);
            pVar2 = this.k;
            pVar2.i = i18;
            pVar2.l = j1422;
            pVar2.j = j10;
            if (pVar2.b) {
            }
            o oVar4222 = pVar2.m;
            pVar2.m = pVar2.n;
            pVar2.n = oVar4222;
            oVar4222.b = false;
            oVar4222.a = false;
            pVar2.h = 0;
            pVar2.k = true;
            i16 = i11;
            bArr2 = bArr;
            i15 = i12;
        }
    }

    @Override // b4.i
    public final void b() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        h5.a.m(this.h);
        this.d.f();
        this.e.f();
        this.f.f();
        p pVar = this.k;
        if (pVar != null) {
            pVar.k = false;
            pVar.o = false;
            o oVar = pVar.n;
            oVar.b = false;
            oVar.a = false;
        }
    }

    @Override // b4.i
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.i = h0Var.e;
        h0Var.b();
        r3.v i22 = mVar.i2(h0Var.d, 2);
        this.j = i22;
        this.k = new p(i22, this.b, this.c);
        this.a.b(mVar, h0Var);
    }

    @Override // b4.i
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.m = j10;
        }
        this.n = ((i10 & 2) != 0) | this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, int i11, byte[] bArr) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (!this.l || this.k.c) {
            this.d.a(i10, i11, bArr);
            this.e.a(i10, i11, bArr);
        }
        this.f.a(i10, i11, bArr);
        p pVar = this.k;
        SparseArray sparseArray = pVar.e;
        h5.v vVar = pVar.f;
        if (pVar.k) {
            int i18 = i11 - i10;
            byte[] bArr2 = pVar.g;
            int length = bArr2.length;
            int i19 = pVar.h + i18;
            if (length < i19) {
                pVar.g = Arrays.copyOf(bArr2, i19 * 2);
            }
            System.arraycopy(bArr, i10, pVar.g, pVar.h, i18);
            int i20 = pVar.h + i18;
            pVar.h = i20;
            vVar.b = pVar.g;
            vVar.d = 0;
            vVar.c = i20;
            vVar.e = 0;
            vVar.a();
            if (vVar.d(8)) {
                vVar.r();
                int i21 = vVar.i(2);
                vVar.s(5);
                if (vVar.e()) {
                    vVar.l();
                    if (vVar.e()) {
                        int l10 = vVar.l();
                        if (!pVar.c) {
                            pVar.k = false;
                            o oVar = pVar.n;
                            oVar.e = l10;
                            oVar.b = true;
                            return;
                        }
                        if (vVar.e()) {
                            int l11 = vVar.l();
                            if (sparseArray.indexOfKey(l11) < 0) {
                                pVar.k = false;
                                return;
                            }
                            h5.q qVar = (h5.q) sparseArray.get(l11);
                            SparseArray sparseArray2 = pVar.d;
                            int i22 = qVar.a;
                            boolean z13 = qVar.b;
                            h5.r rVar = (h5.r) sparseArray2.get(i22);
                            boolean z14 = rVar.h;
                            int i23 = rVar.l;
                            int i24 = rVar.j;
                            if (z14) {
                                if (!vVar.d(2)) {
                                    return;
                                } else {
                                    vVar.s(2);
                                }
                            }
                            if (vVar.d(i24)) {
                                int i25 = vVar.i(i24);
                                if (rVar.i) {
                                    z4 = false;
                                } else {
                                    if (!vVar.d(1)) {
                                        return;
                                    }
                                    z4 = vVar.h();
                                    if (z4) {
                                        if (vVar.d(1)) {
                                            z10 = vVar.h();
                                            z11 = true;
                                            z12 = pVar.i != 5;
                                            if (z12) {
                                                i12 = 0;
                                            } else if (!vVar.e()) {
                                                return;
                                            } else {
                                                i12 = vVar.l();
                                            }
                                            i13 = rVar.k;
                                            if (i13 != 0) {
                                                if (!vVar.d(i23)) {
                                                    return;
                                                }
                                                i16 = vVar.i(i23);
                                                if (!z13 || z4) {
                                                    i14 = 0;
                                                } else if (!vVar.e()) {
                                                    return;
                                                } else {
                                                    i14 = vVar.m();
                                                }
                                                i15 = 0;
                                            } else {
                                                if (i13 == 1 && !rVar.m) {
                                                    if (vVar.e()) {
                                                        int m9 = vVar.m();
                                                        if (!z13 || z4) {
                                                            i17 = m9;
                                                            i14 = 0;
                                                            i15 = 0;
                                                        } else {
                                                            if (!vVar.e()) {
                                                                return;
                                                            }
                                                            i15 = vVar.m();
                                                            i17 = m9;
                                                            i14 = 0;
                                                        }
                                                        i16 = 0;
                                                        o oVar2 = pVar.n;
                                                        oVar2.c = rVar;
                                                        oVar2.d = i21;
                                                        oVar2.e = l10;
                                                        oVar2.f = i25;
                                                        oVar2.g = l11;
                                                        oVar2.h = z4;
                                                        oVar2.i = z11;
                                                        oVar2.j = z10;
                                                        oVar2.k = z12;
                                                        oVar2.l = i12;
                                                        oVar2.m = i16;
                                                        oVar2.n = i14;
                                                        oVar2.o = i17;
                                                        oVar2.p = i15;
                                                        oVar2.a = true;
                                                        oVar2.b = true;
                                                        pVar.k = false;
                                                    }
                                                    return;
                                                }
                                                i14 = 0;
                                                i15 = 0;
                                                i16 = 0;
                                            }
                                            i17 = 0;
                                            o oVar22 = pVar.n;
                                            oVar22.c = rVar;
                                            oVar22.d = i21;
                                            oVar22.e = l10;
                                            oVar22.f = i25;
                                            oVar22.g = l11;
                                            oVar22.h = z4;
                                            oVar22.i = z11;
                                            oVar22.j = z10;
                                            oVar22.k = z12;
                                            oVar22.l = i12;
                                            oVar22.m = i16;
                                            oVar22.n = i14;
                                            oVar22.o = i17;
                                            oVar22.p = i15;
                                            oVar22.a = true;
                                            oVar22.b = true;
                                            pVar.k = false;
                                        }
                                        return;
                                    }
                                }
                                z10 = false;
                                z11 = false;
                                if (pVar.i != 5) {
                                }
                                if (z12) {
                                }
                                i13 = rVar.k;
                                if (i13 != 0) {
                                }
                                i17 = 0;
                                o oVar222 = pVar.n;
                                oVar222.c = rVar;
                                oVar222.d = i21;
                                oVar222.e = l10;
                                oVar222.f = i25;
                                oVar222.g = l11;
                                oVar222.h = z4;
                                oVar222.i = z11;
                                oVar222.j = z10;
                                oVar222.k = z12;
                                oVar222.l = i12;
                                oVar222.m = i16;
                                oVar222.n = i14;
                                oVar222.o = i17;
                                oVar222.p = i15;
                                oVar222.a = true;
                                oVar222.b = true;
                                pVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // b4.i
    public final void d() {
    }
}
