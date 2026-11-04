package l4;

import android.util.SparseArray;
import d2.u0;
import e3.i0;
import g2.n0;
import java.util.ArrayList;
import java.util.Arrays;
import k2.o0;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final o0 d = new o0(7);
    public final o0 e = new o0(8);
    public final o0 f = new o0(6);
    public long m = -9223372036854775807L;
    public final g2.y o = new g2.y();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.a = c0Var;
        this.b = z10;
        this.c = z11;
    }

    @Override // l4.i
    public final void a() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        h2.o.b(this.h);
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
    public final void b(long j10, long j11, int i3, int i10) {
        int i11;
        boolean z10;
        o0 o0Var;
        p pVar;
        boolean z11;
        long j12;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i13;
        g2.d dVar = this.a.d;
        if (!this.l || this.k.c) {
            o0 o0Var2 = this.d;
            o0Var2.e(i10);
            o0 o0Var3 = this.e;
            o0Var3.e(i10);
            if (this.l) {
                i11 = 2;
                z10 = false;
                if (o0Var2.d) {
                    h2.n m10 = h2.o.m(3, o0Var2.e, (byte[]) o0Var2.f);
                    dVar.C(m10.s);
                    this.k.d.append(m10.d, m10);
                    o0Var2.g();
                } else if (o0Var3.d) {
                    h2.s sVar = new h2.s((byte[]) o0Var3.f, 4, o0Var3.e);
                    int f10 = sVar.f();
                    int f11 = sVar.f();
                    sVar.i();
                    this.k.e.append(f10, new h2.m(f10, f11, sVar.d()));
                    o0Var3.g();
                }
            } else if (o0Var2.d && o0Var3.d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) o0Var2.f, o0Var2.e));
                arrayList.add(Arrays.copyOf((byte[]) o0Var3.f, o0Var3.e));
                h2.n m11 = h2.o.m(3, o0Var2.e, (byte[]) o0Var2.f);
                int i14 = m11.s;
                h2.s sVar2 = new h2.s((byte[]) o0Var3.f, 4, o0Var3.e);
                int f12 = sVar2.f();
                int f13 = sVar2.f();
                sVar2.i();
                i11 = 2;
                h2.m mVar = new h2.m(f12, f13, sVar2.d());
                int i15 = m11.a;
                int i16 = m11.b;
                z10 = false;
                int i17 = m11.c;
                byte[] bArr = g2.h.a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17));
                i0 i0Var = this.j;
                d2.u uVar = new d2.u();
                uVar.a = this.i;
                uVar.q = u0.n("video/mp2t");
                uVar.r = u0.n("video/avc");
                uVar.j = format;
                uVar.y = m11.e;
                uVar.z = m11.f;
                uVar.H = new d2.n(m11.p, m11.q, m11.r, null, m11.h + 8, m11.i + 8);
                uVar.E = m11.g;
                uVar.u = arrayList;
                uVar.t = i14;
                f1.w(uVar, i0Var);
                this.l = true;
                dVar.C(i14);
                this.k.d.append(m11.d, m11);
                this.k.e.append(f12, mVar);
                o0Var2.g();
                o0Var3.g();
            }
            o0Var = this.f;
            if (o0Var.e(i10)) {
                int p10 = h2.o.p(o0Var.e, (byte[]) o0Var.f);
                byte[] bArr2 = (byte[]) o0Var.f;
                g2.y yVar = this.o;
                yVar.L(p10, bArr2);
                yVar.N(4);
                dVar.a(j11, yVar);
            }
            pVar = this.k;
            z11 = this.l;
            if (pVar.i != 9) {
                if (pVar.c) {
                    o oVar = pVar.n;
                    o oVar2 = pVar.m;
                    if (oVar.a) {
                        if (oVar2.a) {
                            h2.n nVar = oVar.c;
                            nVar.getClass();
                            h2.n nVar2 = oVar2.c;
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
                long j13 = pVar.j;
                int i22 = i3 + ((int) (j10 - j13));
                j12 = pVar.q;
                if (j12 != -9223372036854775807L) {
                    long j14 = pVar.p;
                    if (j13 != j14) {
                        pVar.a.d(j12, pVar.r ? 1 : 0, (int) (j13 - j14), i22, null);
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
        o0Var = this.f;
        if (o0Var.e(i10)) {
        }
        pVar = this.k;
        z11 = this.l;
        if (pVar.i != 9) {
        }
        if (z11) {
            long j132 = pVar.j;
            int i222 = i3 + ((int) (j10 - j132));
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

    @Override // l4.i
    public final void c(g2.y yVar) {
        int i3;
        this.j.getClass();
        String str = n0.a;
        int i10 = yVar.b;
        int i11 = yVar.c;
        byte[] bArr = yVar.a;
        this.g += yVar.a();
        this.j.e(yVar.a(), yVar);
        while (true) {
            int c2 = h2.o.c(bArr, i10, i11, this.h);
            if (c2 == i11) {
                g(i10, i11, bArr);
                return;
            }
            int i12 = bArr[c2 + 3] & 31;
            if (c2 <= 0 || bArr[c2 - 1] != 0) {
                i3 = 3;
            } else {
                c2--;
                i3 = 4;
            }
            int i13 = c2;
            int i14 = i3;
            int i15 = i13 - i10;
            if (i15 > 0) {
                g(i10, i13, bArr);
            }
            int i16 = i11 - i13;
            long j10 = this.g - i16;
            b(j10, this.m, i16, i15 < 0 ? -i15 : 0);
            h(j10, i12, this.m);
            i10 = i13 + i14;
        }
    }

    @Override // l4.i
    public final void d(boolean z10) {
        this.j.getClass();
        String str = n0.a;
        if (z10) {
            this.a.d.r(0);
            b(this.g, this.m, 0, 0);
            h(this.g, 9, this.m);
            b(this.g, this.m, 0, 0);
        }
    }

    @Override // l4.i
    public final void e(int i3, long j10) {
        this.m = j10;
        this.n = ((i3 & 2) != 0) | this.n;
    }

    @Override // l4.i
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.i = (String) f0Var.e;
        f0Var.c();
        i0 i02 = qVar.i0(f0Var.c, 2);
        this.j = i02;
        this.k = new p(i02, this.b, this.c);
        this.a.b(qVar, f0Var);
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
    public final void g(int i3, int i10, byte[] bArr) {
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
            this.d.a(i3, i10, bArr);
            this.e.a(i3, i10, bArr);
        }
        this.f.a(i3, i10, bArr);
        p pVar = this.k;
        SparseArray sparseArray = pVar.e;
        h2.s sVar = pVar.f;
        if (pVar.k) {
            int i17 = i10 - i3;
            byte[] bArr2 = pVar.g;
            int length = bArr2.length;
            int i18 = pVar.h + i17;
            if (length < i18) {
                pVar.g = Arrays.copyOf(bArr2, i18 * 2);
            }
            System.arraycopy(bArr, i3, pVar.g, pVar.h, i17);
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
                            h2.m mVar = (h2.m) sparseArray.get(f11);
                            SparseArray sparseArray2 = pVar.d;
                            int i20 = mVar.a;
                            boolean z14 = mVar.b;
                            h2.n nVar = (h2.n) sparseArray2.get(i20);
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
                                                        int g7 = sVar.g();
                                                        if (!z14 || z10) {
                                                            i16 = g7;
                                                            i13 = 0;
                                                            i14 = 0;
                                                        } else {
                                                            if (!sVar.c()) {
                                                                return;
                                                            }
                                                            i14 = sVar.g();
                                                            i16 = g7;
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

    public final void h(long j10, int i3, long j11) {
        if (!this.l || this.k.c) {
            this.d.h(i3);
            this.e.h(i3);
        }
        this.f.h(i3);
        p pVar = this.k;
        boolean z10 = this.n;
        pVar.i = i3;
        pVar.l = j11;
        pVar.j = j10;
        pVar.s = z10;
        if (!pVar.b || i3 != 1) {
            if (!pVar.c) {
                return;
            }
            if (i3 != 5 && i3 != 1 && i3 != 2) {
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
