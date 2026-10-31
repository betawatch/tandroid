package j4;

import android.util.SparseArray;
import b2.v0;
import c3.k0;
import e2.l0;
import i2.p0;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q implements i {
    public final d0 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public k0 j;
    public p k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final p0 d = new p0(7);
    public final p0 e = new p0(8);
    public final p0 f = new p0(6);
    public long m = -9223372036854775807L;
    public final e2.x o = new e2.x();

    public q(d0 d0Var, boolean z10, boolean z11) {
        this.a = d0Var;
        this.b = z10;
        this.c = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01cb, code lost:
    
        if (r3.j == r4.j) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d5, code lost:
    
        if (r8 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e7, code lost:
    
        if (r3.n == r4.n) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f8, code lost:
    
        if (r3.p == r4.p) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0206, code lost:
    
        if (r3.l == r4.l) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0263, code lost:
    
        if (r3 == 1) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j10, long j11, int i10, int i11) {
        int i12;
        boolean z10;
        p0 p0Var;
        p pVar;
        boolean z11;
        long j12;
        boolean z12;
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        int i14;
        e2.c cVar = this.a.d;
        if (!this.l || this.k.c) {
            p0 p0Var2 = this.d;
            p0Var2.e(i11);
            p0 p0Var3 = this.e;
            p0Var3.e(i11);
            if (this.l) {
                i12 = 2;
                z10 = false;
                if (p0Var2.d) {
                    f2.p m10 = f2.q.m(3, p0Var2.e, (byte[]) p0Var2.f);
                    cVar.p(m10.s);
                    this.k.d.append(m10.d, m10);
                    p0Var2.g();
                } else if (p0Var3.d) {
                    f2.u uVar = new f2.u((byte[]) p0Var3.f, 4, p0Var3.e);
                    int f7 = uVar.f();
                    int f10 = uVar.f();
                    uVar.i();
                    this.k.e.append(f7, new f2.o(f7, f10, uVar.d()));
                    p0Var3.g();
                }
            } else if (p0Var2.d && p0Var3.d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) p0Var2.f, p0Var2.e));
                arrayList.add(Arrays.copyOf((byte[]) p0Var3.f, p0Var3.e));
                f2.p m11 = f2.q.m(3, p0Var2.e, (byte[]) p0Var2.f);
                int i15 = m11.s;
                f2.u uVar2 = new f2.u((byte[]) p0Var3.f, 4, p0Var3.e);
                int f11 = uVar2.f();
                int f12 = uVar2.f();
                uVar2.i();
                i12 = 2;
                f2.o oVar = new f2.o(f11, f12, uVar2.d());
                int i16 = m11.a;
                int i17 = m11.b;
                z10 = false;
                int i18 = m11.c;
                byte[] bArr = e2.g.a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18));
                k0 k0Var = this.j;
                b2.w wVar = new b2.w();
                wVar.a = this.i;
                wVar.q = v0.n("video/mp2t");
                wVar.r = v0.n("video/avc");
                wVar.j = format;
                wVar.y = m11.e;
                wVar.z = m11.f;
                wVar.H = new b2.o(m11.p, m11.q, m11.r, null, m11.h + 8, m11.i + 8);
                wVar.E = m11.g;
                wVar.u = arrayList;
                wVar.t = i15;
                i0.a.r(wVar, k0Var);
                this.l = true;
                cVar.p(i15);
                this.k.d.append(m11.d, m11);
                this.k.e.append(f11, oVar);
                p0Var2.g();
                p0Var3.g();
            }
            p0Var = this.f;
            if (p0Var.e(i11)) {
                int p5 = f2.q.p(p0Var.e, (byte[]) p0Var.f);
                byte[] bArr2 = (byte[]) p0Var.f;
                e2.x xVar = this.o;
                xVar.L(p5, bArr2);
                xVar.N(4);
                cVar.a(j11, xVar);
            }
            pVar = this.k;
            z11 = this.l;
            if (pVar.i != 9) {
                if (pVar.c) {
                    o oVar2 = pVar.n;
                    o oVar3 = pVar.m;
                    if (oVar2.a) {
                        if (oVar3.a) {
                            f2.p pVar2 = oVar2.c;
                            pVar2.getClass();
                            f2.p pVar3 = oVar3.c;
                            pVar3.getClass();
                            int i19 = pVar3.m;
                            if (oVar2.f == oVar3.f) {
                                if (oVar2.g == oVar3.g) {
                                    if (oVar2.h == oVar3.h) {
                                        if (oVar2.i) {
                                            if (oVar3.i) {
                                            }
                                        }
                                        int i20 = oVar2.d;
                                        int i21 = oVar3.d;
                                        if (i20 != i21) {
                                            if (i20 != 0) {
                                            }
                                        }
                                        int i22 = pVar2.m;
                                        if (i22 == 0) {
                                            if (i19 == 0) {
                                                if (oVar2.m == oVar3.m) {
                                                }
                                            }
                                        }
                                        if (i22 == 1) {
                                            if (i19 == 1) {
                                                if (oVar2.o == oVar3.o) {
                                                }
                                            }
                                        }
                                        boolean z16 = oVar2.k;
                                        if (z16 == oVar3.k) {
                                            if (z16) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (pVar.b) {
                    o oVar4 = pVar.n;
                    z12 = oVar4.b && ((i14 = oVar4.e) == 7 || i14 == i12);
                } else {
                    z12 = pVar.s;
                }
                boolean z17 = pVar.r;
                i13 = pVar.i;
                if (i13 != 5) {
                    z15 = z12 ? true : true;
                    z13 = false;
                    z14 = z17 | z13;
                    pVar.r = z14;
                    pVar.i = 24;
                    if (z14) {
                        return;
                    }
                    this.n = false;
                    return;
                }
                z13 = z15;
                z14 = z17 | z13;
                pVar.r = z14;
                pVar.i = 24;
                if (z14) {
                }
            }
            if (z11 && pVar.o) {
                long j13 = pVar.j;
                int i23 = i10 + ((int) (j10 - j13));
                j12 = pVar.q;
                if (j12 != -9223372036854775807L) {
                    long j14 = pVar.p;
                    if (j13 != j14) {
                        pVar.a.c(j12, pVar.r ? 1 : 0, (int) (j13 - j14), i23, null);
                    }
                }
            }
            pVar.p = pVar.j;
            pVar.q = pVar.l;
            pVar.r = z10;
            pVar.o = true;
            if (pVar.b) {
            }
            boolean z172 = pVar.r;
            i13 = pVar.i;
            if (i13 != 5) {
            }
            z13 = z15;
            z14 = z172 | z13;
            pVar.r = z14;
            pVar.i = 24;
            if (z14) {
            }
        }
        i12 = 2;
        z10 = false;
        p0Var = this.f;
        if (p0Var.e(i11)) {
        }
        pVar = this.k;
        z11 = this.l;
        if (pVar.i != 9) {
        }
        if (z11) {
            long j132 = pVar.j;
            int i232 = i10 + ((int) (j10 - j132));
            j12 = pVar.q;
            if (j12 != -9223372036854775807L) {
            }
        }
        pVar.p = pVar.j;
        pVar.q = pVar.l;
        pVar.r = z10;
        pVar.o = true;
        if (pVar.b) {
        }
        boolean z1722 = pVar.r;
        i13 = pVar.i;
        if (i13 != 5) {
        }
        z13 = z15;
        z14 = z1722 | z13;
        pVar.r = z14;
        pVar.i = 24;
        if (z14) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10, int i11, byte[] bArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
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
        f2.u uVar = pVar.f;
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
            uVar.e = pVar.g;
            uVar.b = 0;
            uVar.c = 0;
            uVar.a = i20;
            uVar.d = 0;
            uVar.a();
            if (uVar.b(8)) {
                uVar.i();
                int e = uVar.e(2);
                uVar.j(5);
                if (uVar.c()) {
                    uVar.f();
                    if (uVar.c()) {
                        int f7 = uVar.f();
                        if (!pVar.c) {
                            pVar.k = false;
                            o oVar = pVar.n;
                            oVar.e = f7;
                            oVar.b = true;
                            return;
                        }
                        if (uVar.c()) {
                            int f10 = uVar.f();
                            if (sparseArray.indexOfKey(f10) < 0) {
                                pVar.k = false;
                                return;
                            }
                            f2.o oVar2 = (f2.o) sparseArray.get(f10);
                            SparseArray sparseArray2 = pVar.d;
                            int i21 = oVar2.a;
                            boolean z14 = oVar2.b;
                            f2.p pVar2 = (f2.p) sparseArray2.get(i21);
                            boolean z15 = pVar2.j;
                            int i22 = pVar2.n;
                            int i23 = pVar2.l;
                            if (z15) {
                                if (!uVar.b(2)) {
                                    return;
                                } else {
                                    uVar.j(2);
                                }
                            }
                            if (uVar.b(i23)) {
                                int e7 = uVar.e(i23);
                                if (pVar2.k) {
                                    z10 = false;
                                    z11 = false;
                                } else {
                                    if (!uVar.b(1)) {
                                        return;
                                    }
                                    z10 = uVar.d();
                                    if (z10) {
                                        if (uVar.b(1)) {
                                            z11 = uVar.d();
                                            z12 = true;
                                            z13 = pVar.i != 5;
                                            if (z13) {
                                                i12 = 0;
                                            } else if (!uVar.c()) {
                                                return;
                                            } else {
                                                i12 = uVar.f();
                                            }
                                            i13 = pVar2.m;
                                            if (i13 != 0) {
                                                if (!uVar.b(i22)) {
                                                    return;
                                                }
                                                i16 = uVar.e(i22);
                                                if (!z14 || z10) {
                                                    i14 = 0;
                                                } else if (!uVar.c()) {
                                                    return;
                                                } else {
                                                    i14 = uVar.g();
                                                }
                                                i15 = 0;
                                            } else {
                                                if (i13 == 1 && !pVar2.o) {
                                                    if (uVar.c()) {
                                                        int g10 = uVar.g();
                                                        if (!z14 || z10) {
                                                            i17 = g10;
                                                            i14 = 0;
                                                            i15 = 0;
                                                        } else {
                                                            if (!uVar.c()) {
                                                                return;
                                                            }
                                                            i15 = uVar.g();
                                                            i17 = g10;
                                                            i14 = 0;
                                                        }
                                                        i16 = 0;
                                                        o oVar3 = pVar.n;
                                                        oVar3.c = pVar2;
                                                        oVar3.d = e;
                                                        oVar3.e = f7;
                                                        oVar3.f = e7;
                                                        oVar3.g = f10;
                                                        oVar3.h = z10;
                                                        oVar3.i = z12;
                                                        oVar3.j = z11;
                                                        oVar3.k = z13;
                                                        oVar3.l = i12;
                                                        oVar3.m = i16;
                                                        oVar3.n = i14;
                                                        oVar3.o = i17;
                                                        oVar3.p = i15;
                                                        oVar3.a = true;
                                                        oVar3.b = true;
                                                        pVar.k = false;
                                                    }
                                                    return;
                                                }
                                                i14 = 0;
                                                i15 = 0;
                                                i16 = 0;
                                            }
                                            i17 = 0;
                                            o oVar32 = pVar.n;
                                            oVar32.c = pVar2;
                                            oVar32.d = e;
                                            oVar32.e = f7;
                                            oVar32.f = e7;
                                            oVar32.g = f10;
                                            oVar32.h = z10;
                                            oVar32.i = z12;
                                            oVar32.j = z11;
                                            oVar32.k = z13;
                                            oVar32.l = i12;
                                            oVar32.m = i16;
                                            oVar32.n = i14;
                                            oVar32.o = i17;
                                            oVar32.p = i15;
                                            oVar32.a = true;
                                            oVar32.b = true;
                                            pVar.k = false;
                                        }
                                        return;
                                    }
                                    z11 = false;
                                }
                                z12 = z11;
                                if (pVar.i != 5) {
                                }
                                if (z13) {
                                }
                                i13 = pVar2.m;
                                if (i13 != 0) {
                                }
                                i17 = 0;
                                o oVar322 = pVar.n;
                                oVar322.c = pVar2;
                                oVar322.d = e;
                                oVar322.e = f7;
                                oVar322.f = e7;
                                oVar322.g = f10;
                                oVar322.h = z10;
                                oVar322.i = z12;
                                oVar322.j = z11;
                                oVar322.k = z13;
                                oVar322.l = i12;
                                oVar322.m = i16;
                                oVar322.n = i14;
                                oVar322.o = i17;
                                oVar322.p = i15;
                                oVar322.a = true;
                                oVar322.b = true;
                                pVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // j4.i
    public final void c(e2.x xVar) {
        int i10;
        this.j.getClass();
        String str = l0.a;
        int i11 = xVar.b;
        int i12 = xVar.c;
        byte[] bArr = xVar.a;
        this.g += xVar.a();
        this.j.d(xVar.a(), xVar);
        while (true) {
            int c10 = f2.q.c(bArr, i11, i12, this.h);
            if (c10 == i12) {
                b(i11, i12, bArr);
                return;
            }
            int i13 = bArr[c10 + 3] & 31;
            if (c10 <= 0 || bArr[c10 - 1] != 0) {
                i10 = 3;
            } else {
                c10--;
                i10 = 4;
            }
            int i14 = c10;
            int i15 = i10;
            int i16 = i14 - i11;
            if (i16 > 0) {
                b(i11, i14, bArr);
            }
            int i17 = i12 - i14;
            long j10 = this.g - i17;
            a(j10, this.m, i17, i16 < 0 ? -i16 : 0);
            d(j10, i13, this.m);
            i11 = i14 + i15;
        }
    }

    public final void d(long j10, int i10, long j11) {
        if (!this.l || this.k.c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f.h(i10);
        p pVar = this.k;
        boolean z10 = this.n;
        pVar.i = i10;
        pVar.l = j11;
        pVar.j = j10;
        pVar.s = z10;
        if (!pVar.b || i10 != 1) {
            if (!pVar.c) {
                return;
            }
            if (i10 != 5 && i10 != 1 && i10 != 2) {
                return;
            }
        }
        o oVar = pVar.m;
        pVar.m = pVar.n;
        pVar.n = oVar;
        oVar.b = false;
        oVar.a = false;
        pVar.h = 0;
        pVar.k = true;
    }

    @Override // j4.i
    public final void e() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        f2.q.b(this.h);
        this.d.g();
        this.e.g();
        this.f.g();
        this.a.d.e(0);
        p pVar = this.k;
        if (pVar != null) {
            pVar.k = false;
            pVar.o = false;
            o oVar = pVar.n;
            oVar.b = false;
            oVar.a = false;
        }
    }

    @Override // j4.i
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.i = (String) g0Var.e;
        g0Var.c();
        k0 I1 = qVar.I1(g0Var.c, 2);
        this.j = I1;
        this.k = new p(I1, this.b, this.c);
        this.a.b(qVar, g0Var);
    }

    @Override // j4.i
    public final void g(boolean z10) {
        this.j.getClass();
        String str = l0.a;
        if (z10) {
            this.a.d.e(0);
            a(this.g, this.m, 0, 0);
            d(this.g, 9, this.m);
            a(this.g, this.m, 0, 0);
        }
    }

    @Override // j4.i
    public final void h(int i10, long j10) {
        this.m = j10;
        this.n = ((i10 & 2) != 0) | this.n;
    }
}
