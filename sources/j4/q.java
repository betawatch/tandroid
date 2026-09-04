package j4;

import android.util.SparseArray;
import b2.r0;
import c3.h0;
import i2.l0;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class q implements i {
    public final c0 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public h0 j;
    public p k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final l0 d = new l0(7);
    public final l0 e = new l0(8);
    public final l0 f = new l0(6);
    public long m = -9223372036854775807L;
    public final e2.v o = new e2.v();

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.a = c0Var;
        this.b = z10;
        this.c = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01cd, code lost:
    
        if (r3.j == r4.j) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d7, code lost:
    
        if (r8 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e9, code lost:
    
        if (r3.n == r4.n) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01fa, code lost:
    
        if (r3.p == r4.p) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0208, code lost:
    
        if (r3.l == r4.l) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j3, int i10, int i11, long j10) {
        l0 l0Var;
        p pVar;
        boolean z10;
        long j11;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        int i13;
        e2.c cVar = this.a.d;
        if (!this.l || this.k.c) {
            l0 l0Var2 = this.d;
            l0Var2.e(i11);
            l0 l0Var3 = this.e;
            l0Var3.e(i11);
            if (this.l) {
                if (l0Var2.d) {
                    f2.o j12 = f2.p.j(3, l0Var2.e, (byte[]) l0Var2.f);
                    cVar.k(j12.s);
                    this.k.d.append(j12.d, j12);
                    l0Var2.g();
                } else if (l0Var3.d) {
                    a4.h hVar = new a4.h((byte[]) l0Var3.f, 4, l0Var3.e);
                    int m10 = hVar.m();
                    int m11 = hVar.m();
                    hVar.s();
                    this.k.e.append(m10, new f2.n(m10, m11, hVar.h()));
                    l0Var3.g();
                }
            } else if (l0Var2.d && l0Var3.d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) l0Var2.f, l0Var2.e));
                arrayList.add(Arrays.copyOf((byte[]) l0Var3.f, l0Var3.e));
                f2.o j13 = f2.p.j(3, l0Var2.e, (byte[]) l0Var2.f);
                int i14 = j13.s;
                a4.h hVar2 = new a4.h((byte[]) l0Var3.f, 4, l0Var3.e);
                int m12 = hVar2.m();
                int m13 = hVar2.m();
                hVar2.s();
                f2.n nVar = new f2.n(m12, m13, hVar2.h());
                int i15 = j13.a;
                int i16 = j13.b;
                int i17 = j13.c;
                byte[] bArr = e2.e.a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17));
                h0 h0Var = this.j;
                b2.r rVar = new b2.r();
                rVar.a = this.i;
                rVar.p = r0.n("video/mp2t");
                rVar.q = r0.n(MediaController.VIDEO_MIME_TYPE);
                rVar.j = format;
                rVar.x = j13.e;
                rVar.y = j13.f;
                rVar.G = new b2.j(j13.p, j13.q, j13.r, null, j13.h + 8, j13.i + 8);
                rVar.D = j13.g;
                rVar.t = arrayList;
                rVar.s = i14;
                i2.g.u(rVar, h0Var);
                this.l = true;
                cVar.k(i14);
                this.k.d.append(j13.d, j13);
                this.k.e.append(m12, nVar);
                l0Var2.g();
                l0Var3.g();
            }
            l0Var = this.f;
            if (l0Var.e(i11)) {
                int m14 = f2.p.m(l0Var.e, (byte[]) l0Var.f);
                byte[] bArr2 = (byte[]) l0Var.f;
                e2.v vVar = this.o;
                vVar.H(m14, bArr2);
                vVar.J(4);
                cVar.a(j10, vVar);
            }
            pVar = this.k;
            z10 = this.l;
            if (pVar.i != 9) {
                if (pVar.c) {
                    o oVar = pVar.n;
                    o oVar2 = pVar.m;
                    if (oVar.a) {
                        if (oVar2.a) {
                            f2.o oVar3 = oVar.c;
                            e2.d.h(oVar3);
                            f2.o oVar4 = oVar2.c;
                            e2.d.h(oVar4);
                            int i18 = oVar4.m;
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
                                        int i21 = oVar3.m;
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
                                        boolean z14 = oVar.k;
                                        if (z14 == oVar2.k) {
                                            if (z14) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (pVar.b) {
                    o oVar5 = pVar.n;
                    z11 = oVar5.b && ((i13 = oVar5.e) == 7 || i13 == 2);
                } else {
                    z11 = pVar.s;
                }
                boolean z15 = pVar.r;
                i12 = pVar.i;
                if (i12 == 5 && (!z11 || i12 != 1)) {
                    z12 = false;
                    z13 = z15 | z12;
                    pVar.r = z13;
                    pVar.i = 24;
                    if (z13) {
                        this.n = false;
                        return;
                    }
                    return;
                }
                z12 = true;
                z13 = z15 | z12;
                pVar.r = z13;
                pVar.i = 24;
                if (z13) {
                }
            }
            if (z10 && pVar.o) {
                long j14 = pVar.j;
                int i22 = i10 + ((int) (j3 - j14));
                j11 = pVar.q;
                if (j11 != -9223372036854775807L) {
                    long j15 = pVar.p;
                    if (j14 != j15) {
                        pVar.a.c(j11, pVar.r ? 1 : 0, (int) (j14 - j15), i22, null);
                    }
                }
            }
            pVar.p = pVar.j;
            pVar.q = pVar.l;
            pVar.r = false;
            pVar.o = true;
            if (pVar.b) {
            }
            boolean z152 = pVar.r;
            i12 = pVar.i;
            if (i12 == 5) {
                z12 = false;
                z13 = z152 | z12;
                pVar.r = z13;
                pVar.i = 24;
                if (z13) {
                }
            }
            z12 = true;
            z13 = z152 | z12;
            pVar.r = z13;
            pVar.i = 24;
            if (z13) {
            }
        }
        l0Var = this.f;
        if (l0Var.e(i11)) {
        }
        pVar = this.k;
        z10 = this.l;
        if (pVar.i != 9) {
        }
        if (z10) {
            long j142 = pVar.j;
            int i222 = i10 + ((int) (j3 - j142));
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
        boolean z1522 = pVar.r;
        i12 = pVar.i;
        if (i12 == 5) {
        }
        z12 = true;
        z13 = z1522 | z12;
        pVar.r = z13;
        pVar.i = 24;
        if (z13) {
        }
    }

    @Override // j4.i
    public final void b(e2.v vVar) {
        int i10;
        e2.d.h(this.j);
        String str = e2.d0.a;
        int i11 = vVar.b;
        int i12 = vVar.c;
        byte[] bArr = vVar.a;
        this.g += vVar.a();
        this.j.d(vVar.a(), vVar);
        while (true) {
            int b10 = f2.p.b(bArr, i11, i12, this.h);
            if (b10 == i12) {
                c(i11, i12, bArr);
                return;
            }
            int i13 = bArr[b10 + 3] & 31;
            if (b10 <= 0 || bArr[b10 - 1] != 0) {
                i10 = 3;
            } else {
                b10--;
                i10 = 4;
            }
            int i14 = b10 - i11;
            if (i14 > 0) {
                c(i11, b10, bArr);
            }
            int i15 = i12 - b10;
            long j3 = this.g - i15;
            a(j3, i15, i14 < 0 ? -i14 : 0, this.m);
            h(i13, j3, this.m);
            i11 = b10 + i10;
        }
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
    public final void c(int i10, int i11, byte[] bArr) {
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
        a4.h hVar = pVar.f;
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
            hVar.b = pVar.g;
            hVar.d = 0;
            hVar.c = i20;
            hVar.e = 0;
            hVar.a();
            if (hVar.d(8)) {
                hVar.s();
                int i21 = hVar.i(2);
                hVar.t(5);
                if (hVar.e()) {
                    hVar.m();
                    if (hVar.e()) {
                        int m10 = hVar.m();
                        if (!pVar.c) {
                            pVar.k = false;
                            o oVar = pVar.n;
                            oVar.e = m10;
                            oVar.b = true;
                            return;
                        }
                        if (hVar.e()) {
                            int m11 = hVar.m();
                            if (sparseArray.indexOfKey(m11) < 0) {
                                pVar.k = false;
                                return;
                            }
                            f2.n nVar = (f2.n) sparseArray.get(m11);
                            SparseArray sparseArray2 = pVar.d;
                            int i22 = nVar.a;
                            boolean z14 = nVar.b;
                            f2.o oVar2 = (f2.o) sparseArray2.get(i22);
                            boolean z15 = oVar2.j;
                            int i23 = oVar2.n;
                            int i24 = oVar2.l;
                            if (z15) {
                                if (!hVar.d(2)) {
                                    return;
                                } else {
                                    hVar.t(2);
                                }
                            }
                            if (hVar.d(i24)) {
                                int i25 = hVar.i(i24);
                                if (oVar2.k) {
                                    z10 = false;
                                } else {
                                    if (!hVar.d(1)) {
                                        return;
                                    }
                                    z10 = hVar.h();
                                    if (z10) {
                                        if (hVar.d(1)) {
                                            z11 = hVar.h();
                                            z12 = true;
                                            z13 = pVar.i != 5;
                                            if (z13) {
                                                i12 = 0;
                                            } else if (!hVar.e()) {
                                                return;
                                            } else {
                                                i12 = hVar.m();
                                            }
                                            i13 = oVar2.m;
                                            if (i13 != 0) {
                                                if (!hVar.d(i23)) {
                                                    return;
                                                }
                                                i16 = hVar.i(i23);
                                                if (!z14 || z10) {
                                                    i14 = 0;
                                                } else if (!hVar.e()) {
                                                    return;
                                                } else {
                                                    i14 = hVar.n();
                                                }
                                                i15 = 0;
                                            } else {
                                                if (i13 == 1 && !oVar2.o) {
                                                    if (hVar.e()) {
                                                        int n10 = hVar.n();
                                                        if (!z14 || z10) {
                                                            i17 = n10;
                                                            i14 = 0;
                                                            i15 = 0;
                                                        } else {
                                                            if (!hVar.e()) {
                                                                return;
                                                            }
                                                            i15 = hVar.n();
                                                            i17 = n10;
                                                            i14 = 0;
                                                        }
                                                        i16 = 0;
                                                        o oVar3 = pVar.n;
                                                        oVar3.c = oVar2;
                                                        oVar3.d = i21;
                                                        oVar3.e = m10;
                                                        oVar3.f = i25;
                                                        oVar3.g = m11;
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
                                            oVar32.c = oVar2;
                                            oVar32.d = i21;
                                            oVar32.e = m10;
                                            oVar32.f = i25;
                                            oVar32.g = m11;
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
                                }
                                z11 = false;
                                z12 = false;
                                if (pVar.i != 5) {
                                }
                                if (z13) {
                                }
                                i13 = oVar2.m;
                                if (i13 != 0) {
                                }
                                i17 = 0;
                                o oVar322 = pVar.n;
                                oVar322.c = oVar2;
                                oVar322.d = i21;
                                oVar322.e = m10;
                                oVar322.f = i25;
                                oVar322.g = m11;
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
    public final void d() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        f2.p.a(this.h);
        this.d.g();
        this.e.g();
        this.f.g();
        this.a.d.c(0);
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
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.i = f0Var.e;
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 2);
        this.j = R1;
        this.k = new p(R1, this.b, this.c);
        this.a.b(qVar, f0Var);
    }

    @Override // j4.i
    public final void f(boolean z10) {
        e2.d.h(this.j);
        String str = e2.d0.a;
        if (z10) {
            this.a.d.c(0);
            a(this.g, 0, 0, this.m);
            h(9, this.g, this.m);
            a(this.g, 0, 0, this.m);
        }
    }

    @Override // j4.i
    public final void g(int i10, long j3) {
        this.m = j3;
        this.n = ((i10 & 2) != 0) | this.n;
    }

    public final void h(int i10, long j3, long j10) {
        if (!this.l || this.k.c) {
            this.d.h(i10);
            this.e.h(i10);
        }
        this.f.h(i10);
        p pVar = this.k;
        boolean z10 = this.n;
        pVar.i = i10;
        pVar.l = j10;
        pVar.j = j3;
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
}
