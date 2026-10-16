package j4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import b2.x0;
import e2.k0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.m8;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class d0 implements c3.o {
    public final int a;
    public final int b;
    public final List c;
    public final e2.x d;
    public final SparseIntArray e;
    public final f f;
    public final z3.l g;
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

    public d0(int i10, int i11, z3.l lVar, k0 k0Var, f fVar) {
        this.f = fVar;
        this.a = i10;
        this.b = i11;
        this.g = lVar;
        if (i10 == 1 || i10 == 2) {
            this.c = Collections.singletonList(k0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(k0Var);
        }
        this.d = new e2.x(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new x(1);
        this.m = c3.q.i;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (g0) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new b0(new qf.b(this)));
        this.r = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(c3.p pVar) {
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
    public final void c(c3.q qVar) {
        if ((this.b & 1) == 0) {
            qVar = new c2.b(qVar, this.g);
        }
        this.m = qVar;
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        h3.a aVar;
        u6.p(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            k0 k0Var = (k0) list.get(i10);
            boolean z10 = k0Var.e() == -9223372036854775807L;
            if (!z10) {
                long d = k0Var.d();
                z10 = (d == -9223372036854775807L || d == 0 || d == j11) ? false : true;
            }
            if (z10) {
                k0Var.g(j11);
            }
        }
        if (j11 != 0 && (aVar = this.l) != null) {
            aVar.d(j11);
        }
        this.d.K(0);
        this.e.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i11 >= sparseArray.size()) {
                this.s = 0;
                return;
            } else {
                ((g0) sparseArray.valueAt(i11)).c();
                i11++;
            }
        }
    }

    @Override // c3.o
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // c3.o
    public final int f(c3.p pVar, c3.s sVar) {
        c3.p pVar2;
        ?? r12;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        long length = pVar.getLength();
        int i14 = this.a;
        boolean z11 = i14 == 2;
        if (this.o) {
            long j10 = -9223372036854775807L;
            x xVar = this.k;
            if (length != -1 && !z11 && !xVar.d) {
                int i15 = this.t;
                k0 k0Var = xVar.b;
                e2.x xVar2 = xVar.c;
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
                        long j11 = xVar.g;
                        if (j11 == -9223372036854775807L) {
                            xVar.a(pVar);
                            return 0;
                        }
                        xVar.i = k0Var.c(xVar.h) - k0Var.b(j11);
                        xVar.a(pVar);
                        return 0;
                    }
                    int min = (int) Math.min(112800, pVar.getLength());
                    long j12 = 0;
                    if (pVar.getPosition() != j12) {
                        sVar.a = j12;
                        return 1;
                    }
                    xVar2.K(min);
                    pVar.q();
                    pVar.b(0, min, xVar2.a);
                    int i16 = xVar2.b;
                    int i17 = xVar2.c;
                    while (true) {
                        if (i16 >= i17) {
                            break;
                        }
                        if (xVar2.a[i16] == 71) {
                            long a2 = m8.a(xVar2, i16, i15);
                            if (a2 != -9223372036854775807L) {
                                j10 = a2;
                                break;
                            }
                        }
                        i16++;
                    }
                    xVar.g = j10;
                    xVar.e = true;
                    return 0;
                }
                long length2 = pVar.getLength();
                int min2 = (int) Math.min(112800, length2);
                long j13 = length2 - min2;
                if (pVar.getPosition() != j13) {
                    sVar.a = j13;
                    return 1;
                }
                xVar2.K(min2);
                pVar.q();
                pVar.b(0, min2, xVar2.a);
                int i18 = xVar2.b;
                int i19 = xVar2.c;
                int i20 = i19 - 188;
                while (true) {
                    if (i20 < i18) {
                        break;
                    }
                    byte[] bArr = xVar2.a;
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
                                long a10 = m8.a(xVar2, i20, i15);
                                if (a10 != -9223372036854775807L) {
                                    j10 = a10;
                                    break;
                                }
                            }
                        }
                        i21++;
                    }
                    i20--;
                }
                xVar.h = j10;
                xVar.f = true;
                return 0;
            }
            if (this.p) {
                i10 = 1;
                z10 = false;
                i11 = i14;
            } else {
                this.p = true;
                long j14 = xVar.i;
                if (j14 != -9223372036854775807L) {
                    i10 = 1;
                    z10 = false;
                    i11 = i14;
                    h3.a aVar = new h3.a(new t7.u(3), new a5.a(this.t, xVar.b), j14, 1 + j14, 0L, length, 188L, 940);
                    this.l = aVar;
                    this.m.K(aVar.a);
                } else {
                    i10 = 1;
                    z10 = false;
                    i11 = i14;
                    this.m.K(new c3.t(j14));
                }
            }
            if (this.q) {
                this.q = z10;
                d(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.a = 0L;
                    return i10;
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
            r12 = 0;
            i10 = 1;
            i11 = i14;
        }
        e2.x xVar3 = this.d;
        byte[] bArr2 = xVar3.a;
        if (9400 - xVar3.b < 188) {
            int a11 = xVar3.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, xVar3.b, bArr2, r12, a11);
            }
            xVar3.L(a11, bArr2);
        }
        while (true) {
            int a12 = xVar3.a();
            SparseArray sparseArray = this.h;
            if (a12 >= 188) {
                int i24 = xVar3.b;
                int i25 = xVar3.c;
                byte[] bArr3 = xVar3.a;
                int i26 = i24;
                while (i26 < i25 && bArr3[i26] != 71) {
                    i26++;
                }
                xVar3.N(i26);
                int i27 = i26 + 188;
                if (i27 > i25) {
                    int i28 = (i26 - i24) + this.s;
                    this.s = i28;
                    i12 = i11;
                    i13 = 2;
                    if (i12 == 2 && i28 > 376) {
                        throw x0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i12 = i11;
                    i13 = 2;
                    this.s = r12;
                }
                int i29 = xVar3.c;
                if (i27 > i29) {
                    return r12;
                }
                int m10 = xVar3.m();
                if ((8388608 & m10) != 0) {
                    xVar3.N(i27);
                    return r12;
                }
                int i30 = (4194304 & m10) != 0 ? 1 : r12;
                int i31 = (2096896 & m10) >> 8;
                boolean z12 = (m10 & 32) != 0 ? true : r12;
                g0 g0Var = (m10 & 16) != 0 ? (g0) sparseArray.get(i31) : null;
                if (g0Var == null) {
                    xVar3.N(i27);
                    return r12;
                }
                if (i12 != i13) {
                    int i32 = m10 & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i33 = sparseIntArray.get(i31, i32 - 1);
                    sparseIntArray.put(i31, i32);
                    if (i33 == i32) {
                        xVar3.N(i27);
                        return r12;
                    }
                    if (i32 != ((i33 + 1) & 15)) {
                        g0Var.c();
                    }
                }
                if (z12) {
                    int A = xVar3.A();
                    i30 |= (xVar3.A() & 64) != 0 ? i13 : r12;
                    xVar3.O(A - 1);
                }
                boolean z13 = this.o;
                if (i12 == i13 || z13 || !this.j.get(i31, r12)) {
                    xVar3.M(i27);
                    g0Var.a(i30, xVar3);
                    xVar3.M(i29);
                }
                if (i12 != i13 && !z13 && this.o && length != -1) {
                    this.q = true;
                }
                xVar3.N(i27);
                return r12;
            }
            int i34 = xVar3.c;
            int read = pVar2.read(bArr2, i34, 9400 - i34);
            if (read == -1) {
                int i35 = r12;
                while (i35 < sparseArray.size()) {
                    g0 g0Var2 = (g0) sparseArray.valueAt(i35);
                    if (g0Var2 instanceof w) {
                        w wVar = (w) g0Var2;
                        int i36 = (!z11 || wVar.e()) ? i10 : r12;
                        if (wVar.c == 3 && wVar.j == -1 && ((!z11 || !(wVar.a instanceof k)) && i36 != 0)) {
                            wVar.a(i10, new e2.x());
                        }
                    }
                    i35++;
                    i10 = 1;
                }
                return -1;
            }
            xVar3.M(i34 + read);
            i10 = 1;
        }
    }

    @Override // c3.o
    public final c3.o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
