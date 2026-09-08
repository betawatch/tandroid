package j4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import b2.s0;
import e9.a1;
import e9.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.q8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d0 implements c3.o {
    public final int a;
    public final int b;
    public final List c;
    public final e2.v d;
    public final SparseIntArray e;
    public final f f;
    public final z3.k g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final x k;
    public h3.a l;
    public c3.q m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public g0 r;
    public int s;
    public int t;

    public d0(int i10, int i11, z3.k kVar, e2.b0 b0Var, f fVar) {
        this.f = fVar;
        this.a = i10;
        this.b = i11;
        this.g = kVar;
        if (i10 == 1 || i10 == 2) {
            this.c = Collections.singletonList(b0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(b0Var);
        }
        this.d = new e2.v(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new x(1);
        this.m = c3.q.m;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (g0) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new b0(new pf.b(this)));
        this.r = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(c3.p pVar) {
        byte[] bArr = this.d.a;
        c3.l lVar = (c3.l) pVar;
        lVar.j(bArr, 0, 940, false);
        int i10 = 0;
        while (i10 < 188) {
            for (int i11 = 0; i11 < 5; i11++) {
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
            }
            lVar.i(i10, false);
            return true;
        }
        return false;
    }

    @Override // c3.o
    public final void g(c3.q qVar) {
        if ((this.b & 1) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.g);
        }
        this.m = qVar;
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        h3.a aVar;
        e2.d.g(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            e2.b0 b0Var = (e2.b0) list.get(i10);
            boolean z10 = b0Var.e() == -9223372036854775807L;
            if (!z10) {
                long d = b0Var.d();
                z10 = (d == -9223372036854775807L || d == 0 || d == j10) ? false : true;
            }
            if (z10) {
                b0Var.g(j10);
            }
        }
        if (j10 != 0 && (aVar = this.l) != null) {
            aVar.d(j10);
        }
        this.d.G(0);
        this.e.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i11 >= sparseArray.size()) {
                this.s = 0;
                return;
            } else {
                ((g0) sparseArray.valueAt(i11)).d();
                i11++;
            }
        }
    }

    @Override // c3.o
    public final List i() {
        e9.g0 g0Var = i0.b;
        return a1.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // c3.o
    public final int m(c3.p pVar, c3.s sVar) {
        c3.p pVar2;
        int i10;
        ?? r12;
        int i11;
        int i12;
        boolean z10;
        int i13;
        long length = pVar.getLength();
        int i14 = this.a;
        boolean z11 = i14 == 2;
        if (this.o) {
            long j3 = -9223372036854775807L;
            x xVar = this.k;
            if (length != -1 && !z11 && !xVar.d) {
                int i15 = this.t;
                e2.b0 b0Var = xVar.b;
                e2.v vVar = xVar.c;
                if (i15 <= 0) {
                    xVar.a(pVar);
                    return 0;
                }
                if (xVar.f) {
                    if (xVar.h == -9223372036854775807L) {
                        xVar.a(pVar);
                        return 0;
                    }
                    if (xVar.e) {
                        long j10 = xVar.g;
                        if (j10 == -9223372036854775807L) {
                            xVar.a(pVar);
                            return 0;
                        }
                        xVar.i = b0Var.c(xVar.h) - b0Var.b(j10);
                        xVar.a(pVar);
                        return 0;
                    }
                    int min = (int) Math.min(112800, pVar.getLength());
                    long j11 = 0;
                    if (pVar.getPosition() != j11) {
                        sVar.a = j11;
                        return 1;
                    }
                    vVar.G(min);
                    pVar.q();
                    pVar.b(0, min, vVar.a);
                    int i16 = vVar.b;
                    int i17 = vVar.c;
                    while (true) {
                        if (i16 >= i17) {
                            break;
                        }
                        if (vVar.a[i16] == 71) {
                            long a2 = q8.a(vVar, i16, i15);
                            if (a2 != -9223372036854775807L) {
                                j3 = a2;
                                break;
                            }
                        }
                        i16++;
                    }
                    xVar.g = j3;
                    xVar.e = true;
                    return 0;
                }
                long length2 = pVar.getLength();
                int min2 = (int) Math.min(112800, length2);
                long j12 = length2 - min2;
                if (pVar.getPosition() != j12) {
                    sVar.a = j12;
                    return 1;
                }
                vVar.G(min2);
                pVar.q();
                pVar.b(0, min2, vVar.a);
                int i18 = vVar.b;
                int i19 = vVar.c;
                int i20 = i19 - 188;
                while (true) {
                    if (i20 < i18) {
                        break;
                    }
                    byte[] bArr = vVar.a;
                    int i21 = -4;
                    int i22 = 0;
                    while (true) {
                        if (i21 > 4) {
                            break;
                        }
                        int i23 = (i21 * 188) + i20;
                        if (i23 < i18 || i23 >= i19 || bArr[i23] != 71) {
                            i22 = 0;
                        } else {
                            i22++;
                            if (i22 == 5) {
                                long a10 = q8.a(vVar, i20, i15);
                                if (a10 != -9223372036854775807L) {
                                    j3 = a10;
                                    break;
                                }
                            }
                        }
                        i21++;
                    }
                    i20--;
                }
                xVar.h = j3;
                xVar.f = true;
                return 0;
            }
            if (this.p) {
                i10 = i14;
                z10 = false;
                i13 = 1;
            } else {
                this.p = true;
                long j13 = xVar.i;
                if (j13 != -9223372036854775807L) {
                    i10 = i14;
                    z10 = false;
                    i13 = 1;
                    h3.a aVar = new h3.a(new na.d(), new a5.a(this.t, xVar.b), j13, j13 + 1, 0L, length, 188L, 940);
                    this.l = aVar;
                    this.m.P1(aVar.a);
                } else {
                    i10 = i14;
                    z10 = false;
                    i13 = 1;
                    this.m.P1(new c3.t(j13));
                }
            }
            if (this.q) {
                this.q = z10;
                h(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.a = 0L;
                    return i13;
                }
            }
            h3.a aVar2 = this.l;
            if (aVar2 != null && aVar2.c != null) {
                return aVar2.b(pVar, sVar);
            }
            pVar2 = pVar;
            r12 = z10;
        } else {
            pVar2 = pVar;
            i10 = i14;
            r12 = 0;
        }
        e2.v vVar2 = this.d;
        byte[] bArr2 = vVar2.a;
        if (9400 - vVar2.b < 188) {
            int a11 = vVar2.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, vVar2.b, bArr2, r12, a11);
            }
            vVar2.H(a11, bArr2);
        }
        while (true) {
            int a12 = vVar2.a();
            SparseArray sparseArray = this.h;
            if (a12 >= 188) {
                int i24 = vVar2.b;
                int i25 = vVar2.c;
                byte[] bArr3 = vVar2.a;
                int i26 = i24;
                while (i26 < i25 && bArr3[i26] != 71) {
                    i26++;
                }
                vVar2.J(i26);
                int i27 = i26 + 188;
                if (i27 > i25) {
                    int i28 = (i26 - i24) + this.s;
                    this.s = i28;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i28 > 376) {
                        throw s0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.s = r12;
                }
                int i29 = vVar2.c;
                if (i27 > i29) {
                    return r12;
                }
                int j14 = vVar2.j();
                if ((8388608 & j14) != 0) {
                    vVar2.J(i27);
                    return r12;
                }
                int i30 = (4194304 & j14) != 0 ? 1 : 0;
                int i31 = (2096896 & j14) >> 8;
                boolean z12 = (j14 & 32) != 0;
                g0 g0Var = (j14 & 16) != 0 ? (g0) sparseArray.get(i31) : null;
                if (g0Var == null) {
                    vVar2.J(i27);
                    return r12;
                }
                if (i11 != i12) {
                    int i32 = j14 & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i33 = sparseIntArray.get(i31, i32 - 1);
                    sparseIntArray.put(i31, i32);
                    if (i33 == i32) {
                        vVar2.J(i27);
                        return r12;
                    }
                    if (i32 != ((i33 + 1) & 15)) {
                        g0Var.d();
                    }
                }
                if (z12) {
                    int x10 = vVar2.x();
                    i30 |= (vVar2.x() & 64) != 0 ? 2 : 0;
                    vVar2.K(x10 - 1);
                }
                boolean z13 = this.o;
                if (i11 == i12 || z13 || !this.j.get(i31, r12)) {
                    vVar2.I(i27);
                    g0Var.a(i30, vVar2);
                    vVar2.I(i29);
                }
                if (i11 != i12 && !z13 && this.o && length != -1) {
                    this.q = true;
                }
                vVar2.J(i27);
                return r12;
            }
            int i34 = vVar2.c;
            int read = pVar2.read(bArr2, i34, 9400 - i34);
            if (read == -1) {
                for (int i35 = 0; i35 < sparseArray.size(); i35++) {
                    g0 g0Var2 = (g0) sparseArray.valueAt(i35);
                    if (g0Var2 instanceof w) {
                        w wVar = (w) g0Var2;
                        boolean z14 = !z11 || wVar.e();
                        if (wVar.c == 3 && wVar.j == -1 && ((!z11 || !(wVar.a instanceof k)) && z14)) {
                            wVar.a(1, new e2.v());
                        }
                    }
                }
                return -1;
            }
            vVar2.I(i34 + read);
        }
    }

    @Override // c3.o
    public final c3.o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
