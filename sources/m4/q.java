package m4;

import android.util.SparseArray;
import e2.s0;
import f3.i0;
import java.util.ArrayList;
import java.util.Arrays;
import l2.l0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class q implements i {
    public final c0 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public i0 j;
    public p k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 e = new l0(8);
    public final l0 f = new l0(6);
    public long m = -9223372036854775807L;
    public final h2.x o = new h2.x();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.a = c0Var;
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
    public final void a(long j3, long j10, int i7, int i10) {
        int i11;
        boolean z10;
        l0 l0Var;
        p pVar;
        boolean z11;
        long j11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i13;
        h2.c cVar = this.a.d;
        if (!this.l || this.k.c) {
            l0 l0Var2 = this.d;
            l0Var2.e(i10);
            l0 l0Var3 = this.e;
            l0Var3.e(i10);
            if (this.l) {
                i11 = 2;
                z10 = false;
                if (l0Var2.d) {
                    i2.n m10 = i2.o.m(3, l0Var2.e, (byte[]) l0Var2.f);
                    cVar.C(m10.s);
                    this.k.d.append(m10.d, m10);
                    l0Var2.g();
                } else if (l0Var3.d) {
                    i2.s sVar = new i2.s((byte[]) l0Var3.f, 4, l0Var3.e);
                    int f10 = sVar.f();
                    int f11 = sVar.f();
                    sVar.i();
                    this.k.e.append(f10, new i2.m(f10, f11, sVar.d()));
                    l0Var3.g();
                }
            } else if (l0Var2.d && l0Var3.d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) l0Var2.f, l0Var2.e));
                arrayList.add(Arrays.copyOf((byte[]) l0Var3.f, l0Var3.e));
                i2.n m11 = i2.o.m(3, l0Var2.e, (byte[]) l0Var2.f);
                int i14 = m11.s;
                i2.s sVar2 = new i2.s((byte[]) l0Var3.f, 4, l0Var3.e);
                int f12 = sVar2.f();
                int f13 = sVar2.f();
                sVar2.i();
                i11 = 2;
                i2.m mVar = new i2.m(f12, f13, sVar2.d());
                int i15 = m11.a;
                int i16 = m11.b;
                z10 = false;
                int i17 = m11.c;
                byte[] bArr = h2.g.a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17));
                i0 i0Var = this.j;
                e2.t tVar = new e2.t();
                tVar.a = this.i;
                tVar.q = s0.n("video/mp2t");
                tVar.r = s0.n("video/avc");
                tVar.j = format;
                tVar.y = m11.e;
                tVar.z = m11.f;
                tVar.H = new e2.m(m11.p, m11.q, m11.r, null, m11.h + 8, m11.i + 8);
                tVar.E = m11.g;
                tVar.u = arrayList;
                tVar.t = i14;
                r.b.s(tVar, i0Var);
                this.l = true;
                cVar.C(i14);
                this.k.d.append(m11.d, m11);
                this.k.e.append(f12, mVar);
                l0Var2.g();
                l0Var3.g();
            }
            l0Var = this.f;
            if (l0Var.e(i10)) {
                int p10 = i2.o.p(l0Var.e, (byte[]) l0Var.f);
                byte[] bArr2 = (byte[]) l0Var.f;
                h2.x xVar = this.o;
                xVar.L(p10, bArr2);
                xVar.N(4);
                cVar.a(j10, xVar);
            }
            pVar = this.k;
            z11 = this.l;
            if (pVar.i != 9) {
                if (pVar.c) {
                    o oVar = pVar.n;
                    o oVar2 = pVar.m;
                    if (oVar.a) {
                        if (oVar2.a) {
                            i2.n nVar = oVar.c;
                            nVar.getClass();
                            i2.n nVar2 = oVar2.c;
                            nVar2.getClass();
                            int i18 = nVar2.m;
                            if (oVar.f == oVar2.f) {
                                if (oVar.g == oVar2.g) {
                                    if (oVar.h == oVar2.h) {
                                        if (oVar.i) {
                                            if (oVar2.i) {
                                            }
                                        }
                                        int i19 = oVar.d;
                                        int i20 = oVar2.d;
                                        if (i19 != i20) {
                                            if (i19 != 0) {
                                            }
                                        }
                                        int i21 = nVar.m;
                                        if (i21 == 0) {
                                            if (i18 == 0) {
                                                if (oVar.m == oVar2.m) {
                                                }
                                            }
                                        }
                                        if (i21 == 1) {
                                            if (i18 == 1) {
                                                if (oVar.o == oVar2.o) {
                                                }
                                            }
                                        }
                                        boolean z16 = oVar.k;
                                        if (z16 == oVar2.k) {
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
                    o oVar3 = pVar.n;
                    z12 = oVar3.b && ((i13 = oVar3.e) == 7 || i13 == i11);
                } else {
                    z12 = pVar.s;
                }
                boolean z17 = pVar.r;
                i12 = pVar.i;
                if (i12 != 5) {
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
                long j12 = pVar.j;
                int i22 = i7 + ((int) (j3 - j12));
                j11 = pVar.q;
                if (j11 != -9223372036854775807L) {
                    long j13 = pVar.p;
                    if (j12 != j13) {
                        pVar.a.c(j11, pVar.r ? 1 : 0, (int) (j12 - j13), i22, null);
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
            i12 = pVar.i;
            if (i12 != 5) {
            }
            z13 = z15;
            z14 = z172 | z13;
            pVar.r = z14;
            pVar.i = 24;
            if (z14) {
            }
        }
        i11 = 2;
        z10 = false;
        l0Var = this.f;
        if (l0Var.e(i10)) {
        }
        pVar = this.k;
        z11 = this.l;
        if (pVar.i != 9) {
        }
        if (z11) {
            long j122 = pVar.j;
            int i222 = i7 + ((int) (j3 - j122));
            j11 = pVar.q;
            if (j11 != -9223372036854775807L) {
            }
        }
        pVar.p = pVar.j;
        pVar.q = pVar.l;
        pVar.r = z10;
        pVar.o = true;
        if (pVar.b) {
        }
        boolean z1722 = pVar.r;
        i12 = pVar.i;
        if (i12 != 5) {
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
    public final void b(int i7, int i10, byte[] bArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (!this.l || this.k.c) {
            this.d.a(i7, i10, bArr);
            this.e.a(i7, i10, bArr);
        }
        this.f.a(i7, i10, bArr);
        p pVar = this.k;
        SparseArray sparseArray = pVar.e;
        i2.s sVar = pVar.f;
        if (pVar.k) {
            int i17 = i10 - i7;
            byte[] bArr2 = pVar.g;
            int length = bArr2.length;
            int i18 = pVar.h + i17;
            if (length < i18) {
                pVar.g = Arrays.copyOf(bArr2, i18 * 2);
            }
            System.arraycopy(bArr, i7, pVar.g, pVar.h, i17);
            int i19 = pVar.h + i17;
            pVar.h = i19;
            sVar.e = pVar.g;
            sVar.b = 0;
            sVar.c = 0;
            sVar.a = i19;
            sVar.d = 0;
            sVar.a();
            if (sVar.b(8)) {
                sVar.i();
                int e10 = sVar.e(2);
                sVar.j(5);
                if (sVar.c()) {
                    sVar.f();
                    if (sVar.c()) {
                        int f10 = sVar.f();
                        if (!pVar.c) {
                            pVar.k = false;
                            o oVar = pVar.n;
                            oVar.e = f10;
                            oVar.b = true;
                            return;
                        }
                        if (sVar.c()) {
                            int f11 = sVar.f();
                            if (sparseArray.indexOfKey(f11) < 0) {
                                pVar.k = false;
                                return;
                            }
                            i2.m mVar = (i2.m) sparseArray.get(f11);
                            SparseArray sparseArray2 = pVar.d;
                            int i20 = mVar.a;
                            boolean z14 = mVar.b;
                            i2.n nVar = (i2.n) sparseArray2.get(i20);
                            boolean z15 = nVar.j;
                            int i21 = nVar.n;
                            int i22 = nVar.l;
                            if (z15) {
                                if (!sVar.b(2)) {
                                    return;
                                } else {
                                    sVar.j(2);
                                }
                            }
                            if (sVar.b(i22)) {
                                int e11 = sVar.e(i22);
                                if (nVar.k) {
                                    z10 = false;
                                    z11 = false;
                                } else {
                                    if (!sVar.b(1)) {
                                        return;
                                    }
                                    z10 = sVar.d();
                                    if (z10) {
                                        if (sVar.b(1)) {
                                            z11 = sVar.d();
                                            z12 = true;
                                            z13 = pVar.i != 5;
                                            if (z13) {
                                                i11 = 0;
                                            } else if (!sVar.c()) {
                                                return;
                                            } else {
                                                i11 = sVar.f();
                                            }
                                            i12 = nVar.m;
                                            if (i12 != 0) {
                                                if (!sVar.b(i21)) {
                                                    return;
                                                }
                                                i15 = sVar.e(i21);
                                                if (!z14 || z10) {
                                                    i13 = 0;
                                                } else if (!sVar.c()) {
                                                    return;
                                                } else {
                                                    i13 = sVar.g();
                                                }
                                                i14 = 0;
                                            } else {
                                                if (i12 == 1 && !nVar.o) {
                                                    if (sVar.c()) {
                                                        int g10 = sVar.g();
                                                        if (!z14 || z10) {
                                                            i16 = g10;
                                                            i13 = 0;
                                                            i14 = 0;
                                                        } else {
                                                            if (!sVar.c()) {
                                                                return;
                                                            }
                                                            i14 = sVar.g();
                                                            i16 = g10;
                                                            i13 = 0;
                                                        }
                                                        i15 = 0;
                                                        o oVar2 = pVar.n;
                                                        oVar2.c = nVar;
                                                        oVar2.d = e10;
                                                        oVar2.e = f10;
                                                        oVar2.f = e11;
                                                        oVar2.g = f11;
                                                        oVar2.h = z10;
                                                        oVar2.i = z12;
                                                        oVar2.j = z11;
                                                        oVar2.k = z13;
                                                        oVar2.l = i11;
                                                        oVar2.m = i15;
                                                        oVar2.n = i13;
                                                        oVar2.o = i16;
                                                        oVar2.p = i14;
                                                        oVar2.a = true;
                                                        oVar2.b = true;
                                                        pVar.k = false;
                                                    }
                                                    return;
                                                }
                                                i13 = 0;
                                                i14 = 0;
                                                i15 = 0;
                                            }
                                            i16 = 0;
                                            o oVar22 = pVar.n;
                                            oVar22.c = nVar;
                                            oVar22.d = e10;
                                            oVar22.e = f10;
                                            oVar22.f = e11;
                                            oVar22.g = f11;
                                            oVar22.h = z10;
                                            oVar22.i = z12;
                                            oVar22.j = z11;
                                            oVar22.k = z13;
                                            oVar22.l = i11;
                                            oVar22.m = i15;
                                            oVar22.n = i13;
                                            oVar22.o = i16;
                                            oVar22.p = i14;
                                            oVar22.a = true;
                                            oVar22.b = true;
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
                                i12 = nVar.m;
                                if (i12 != 0) {
                                }
                                i16 = 0;
                                o oVar222 = pVar.n;
                                oVar222.c = nVar;
                                oVar222.d = e10;
                                oVar222.e = f10;
                                oVar222.f = e11;
                                oVar222.g = f11;
                                oVar222.h = z10;
                                oVar222.i = z12;
                                oVar222.j = z11;
                                oVar222.k = z13;
                                oVar222.l = i11;
                                oVar222.m = i15;
                                oVar222.n = i13;
                                oVar222.o = i16;
                                oVar222.p = i14;
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

    @Override // m4.i
    public final void c(h2.x xVar) {
        int i7;
        this.j.getClass();
        String str = h2.l0.a;
        int i10 = xVar.b;
        int i11 = xVar.c;
        byte[] bArr = xVar.a;
        this.g += xVar.a();
        this.j.b(xVar.a(), xVar);
        while (true) {
            int c10 = i2.o.c(bArr, i10, i11, this.h);
            if (c10 == i11) {
                b(i10, i11, bArr);
                return;
            }
            int i12 = bArr[c10 + 3] & 31;
            if (c10 <= 0 || bArr[c10 - 1] != 0) {
                i7 = 3;
            } else {
                c10--;
                i7 = 4;
            }
            int i13 = c10;
            int i14 = i7;
            int i15 = i13 - i10;
            if (i15 > 0) {
                b(i10, i13, bArr);
            }
            int i16 = i11 - i13;
            long j3 = this.g - i16;
            a(j3, this.m, i16, i15 < 0 ? -i15 : 0);
            h(j3, i12, this.m);
            i10 = i13 + i14;
        }
    }

    @Override // m4.i
    public final void d() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        i2.o.b(this.h);
        this.d.g();
        this.e.g();
        this.f.g();
        this.a.d.r(0);
        p pVar = this.k;
        if (pVar != null) {
            pVar.k = false;
            pVar.o = false;
            o oVar = pVar.n;
            oVar.b = false;
            oVar.a = false;
        }
    }

    @Override // m4.i
    public final void e(boolean z10) {
        this.j.getClass();
        String str = h2.l0.a;
        if (z10) {
            this.a.d.r(0);
            a(this.g, this.m, 0, 0);
            h(this.g, 9, this.m);
            a(this.g, this.m, 0, 0);
        }
    }

    @Override // m4.i
    public final void f(int i7, long j3) {
        this.m = j3;
        this.n = ((i7 & 2) != 0) | this.n;
    }

    @Override // m4.i
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.i = (String) f0Var.e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.c, 2);
        this.j = d2;
        this.k = new p(d2, this.b, this.c);
        this.a.b(qVar, f0Var);
    }

    public final void h(long j3, int i7, long j10) {
        if (!this.l || this.k.c) {
            this.d.h(i7);
            this.e.h(i7);
        }
        this.f.h(i7);
        p pVar = this.k;
        boolean z10 = this.n;
        pVar.i = i7;
        pVar.l = j10;
        pVar.j = j3;
        pVar.s = z10;
        if (!pVar.b || i7 != 1) {
            if (!pVar.c) {
                return;
            }
            if (i7 != 5 && i7 != 1 && i7 != 2) {
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
}
