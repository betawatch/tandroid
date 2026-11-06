package m4;

import a8.ia;
import a8.wa;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c8.o9;
import e2.t0;
import h2.k0;
import h9.i0;
import h9.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e0 implements f3.o {
    public final int a;
    public final int b;
    public final List c;
    public final h2.x d;
    public final SparseIntArray e;
    public final f f;
    public final c4.k g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final x k;
    public k3.a l;
    public f3.q m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public h0 r;
    public int s;
    public int t;

    public e0(int i7, int i10, c4.k kVar, k0 k0Var, f fVar) {
        this.f = fVar;
        this.a = i7;
        this.b = i10;
        this.g = kVar;
        if (i7 == 1 || i7 == 2) {
            this.c = Collections.singletonList(k0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(k0Var);
        }
        this.d = new h2.x(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new x(1);
        this.m = f3.q.q;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (h0) sparseArray2.valueAt(i11));
        }
        d0 d0Var = new d0();
        d0Var.b = this;
        d0Var.a = new d4.f(new byte[4], 4);
        sparseArray.put(0, new b0(d0Var));
        this.r = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(f3.p pVar) {
        byte[] bArr = this.d.a;
        f3.l lVar = (f3.l) pVar;
        lVar.k(bArr, 0, 940, false);
        int i7 = 0;
        while (i7 < 188) {
            for (int i10 = 0; i10 < 5; i10++) {
                if (bArr[(i10 * qs.S2) + i7] != 71) {
                    break;
                }
            }
            lVar.j(i7, false);
            return true;
        }
        return false;
    }

    @Override // f3.o
    public final void c(f3.q qVar) {
        if ((this.b & 1) == 0) {
            qVar = new ab.q(qVar, this.g);
        }
        this.m = qVar;
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        k3.a aVar;
        ia.p(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            k0 k0Var = (k0) list.get(i7);
            boolean z9 = k0Var.e() == -9223372036854775807L;
            if (!z9) {
                long d = k0Var.d();
                z9 = (d == -9223372036854775807L || d == 0 || d == j10) ? false : true;
            }
            if (z9) {
                k0Var.g(j10);
            }
        }
        if (j10 != 0 && (aVar = this.l) != null) {
            aVar.d(j10);
        }
        this.d.K(0);
        this.e.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i10 >= sparseArray.size()) {
                this.s = 0;
                return;
            } else {
                ((h0) sparseArray.valueAt(i10)).d();
                i10++;
            }
        }
    }

    @Override // f3.o
    public final List e() {
        h9.g0 g0Var = i0.b;
        return t1.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // f3.o
    public final int f(f3.p pVar, f3.s sVar) {
        f3.p pVar2;
        ?? r12;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z9;
        long length = pVar.getLength();
        int i13 = this.a;
        boolean z10 = i13 == 2;
        if (this.o) {
            long j3 = -9223372036854775807L;
            x xVar = this.k;
            if (length != -1 && !z10 && !xVar.d) {
                int i14 = this.t;
                k0 k0Var = xVar.b;
                h2.x xVar2 = xVar.c;
                if (i14 <= 0) {
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
                        xVar.i = k0Var.c(xVar.h) - k0Var.b(j10);
                        xVar.a(pVar);
                        return 0;
                    }
                    int min = (int) Math.min(112800, pVar.getLength());
                    long j11 = 0;
                    if (pVar.getPosition() != j11) {
                        sVar.a = j11;
                        return 1;
                    }
                    xVar2.K(min);
                    pVar.q();
                    pVar.b(0, min, xVar2.a);
                    int i15 = xVar2.b;
                    int i16 = xVar2.c;
                    while (true) {
                        if (i15 >= i16) {
                            break;
                        }
                        if (xVar2.a[i15] == 71) {
                            long a10 = o9.a(xVar2, i15, i14);
                            if (a10 != -9223372036854775807L) {
                                j3 = a10;
                                break;
                            }
                        }
                        i15++;
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
                xVar2.K(min2);
                pVar.q();
                pVar.b(0, min2, xVar2.a);
                int i17 = xVar2.b;
                int i18 = xVar2.c;
                int i19 = i18 - 188;
                while (true) {
                    if (i19 < i17) {
                        break;
                    }
                    byte[] bArr = xVar2.a;
                    int i20 = -4;
                    int i21 = 0;
                    while (true) {
                        if (i20 > 4) {
                            break;
                        }
                        int i22 = (i20 * qs.S2) + i19;
                        if (i22 < i17 || i22 >= i18 || bArr[i22] != 71) {
                            i21 = 0;
                        } else {
                            i21++;
                            if (i21 == 5) {
                                long a11 = o9.a(xVar2, i19, i14);
                                if (a11 != -9223372036854775807L) {
                                    j3 = a11;
                                    break;
                                }
                            }
                        }
                        i20++;
                    }
                    i19--;
                }
                xVar.h = j3;
                xVar.f = true;
                return 0;
            }
            if (this.p) {
                i7 = 1;
                z9 = false;
                i10 = i13;
            } else {
                this.p = true;
                long j13 = xVar.i;
                if (j13 != -9223372036854775807L) {
                    i7 = 1;
                    z9 = false;
                    i10 = i13;
                    k3.a aVar = new k3.a(new nb.a(8), new wa(this.t, xVar.b), j13, 1 + j13, 0L, length, 188L, 940);
                    this.l = aVar;
                    this.m.f(aVar.a);
                } else {
                    i7 = 1;
                    z9 = false;
                    i10 = i13;
                    this.m.f(new f3.t(j13));
                }
            }
            if (this.q) {
                this.q = z9;
                d(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.a = 0L;
                    return i7;
                }
            }
            k3.a aVar2 = this.l;
            if (aVar2 != null && aVar2.c != null) {
                return aVar2.b(pVar, sVar);
            }
            pVar2 = pVar;
            r12 = z9;
        } else {
            pVar2 = pVar;
            r12 = 0;
            i7 = 1;
            i10 = i13;
        }
        h2.x xVar3 = this.d;
        byte[] bArr2 = xVar3.a;
        if (9400 - xVar3.b < 188) {
            int a12 = xVar3.a();
            if (a12 > 0) {
                System.arraycopy(bArr2, xVar3.b, bArr2, r12, a12);
            }
            xVar3.L(a12, bArr2);
        }
        while (true) {
            int a13 = xVar3.a();
            SparseArray sparseArray = this.h;
            if (a13 >= 188) {
                int i23 = xVar3.b;
                int i24 = xVar3.c;
                byte[] bArr3 = xVar3.a;
                int i25 = i23;
                while (i25 < i24 && bArr3[i25] != 71) {
                    i25++;
                }
                xVar3.N(i25);
                int i26 = i25 + qs.S2;
                if (i26 > i24) {
                    int i27 = (i25 - i23) + this.s;
                    this.s = i27;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i27 > 376) {
                        throw t0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.s = r12;
                }
                int i28 = xVar3.c;
                if (i26 > i28) {
                    return r12;
                }
                int m10 = xVar3.m();
                if ((8388608 & m10) != 0) {
                    xVar3.N(i26);
                    return r12;
                }
                int i29 = (4194304 & m10) != 0 ? 1 : r12;
                int i30 = (2096896 & m10) >> 8;
                boolean z11 = (m10 & 32) != 0 ? true : r12;
                h0 h0Var = (m10 & 16) != 0 ? (h0) sparseArray.get(i30) : null;
                if (h0Var == null) {
                    xVar3.N(i26);
                    return r12;
                }
                if (i11 != i12) {
                    int i31 = m10 & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i32 = sparseIntArray.get(i30, i31 - 1);
                    sparseIntArray.put(i30, i31);
                    if (i32 == i31) {
                        xVar3.N(i26);
                        return r12;
                    }
                    if (i31 != ((i32 + 1) & 15)) {
                        h0Var.d();
                    }
                }
                if (z11) {
                    int A = xVar3.A();
                    i29 |= (xVar3.A() & 64) != 0 ? i12 : r12;
                    xVar3.O(A - 1);
                }
                boolean z12 = this.o;
                if (i11 == i12 || z12 || !this.j.get(i30, r12)) {
                    xVar3.M(i26);
                    h0Var.a(i29, xVar3);
                    xVar3.M(i28);
                }
                if (i11 != i12 && !z12 && this.o && length != -1) {
                    this.q = true;
                }
                xVar3.N(i26);
                return r12;
            }
            int i33 = xVar3.c;
            int read = pVar2.read(bArr2, i33, 9400 - i33);
            if (read == -1) {
                int i34 = r12;
                while (i34 < sparseArray.size()) {
                    h0 h0Var2 = (h0) sparseArray.valueAt(i34);
                    if (h0Var2 instanceof w) {
                        w wVar = (w) h0Var2;
                        int i35 = (!z10 || wVar.e()) ? i7 : r12;
                        if (wVar.c == 3 && wVar.j == -1 && ((!z10 || !(wVar.a instanceof k)) && i35 != 0)) {
                            wVar.a(i7, new h2.x());
                        }
                    }
                    i34++;
                    i7 = 1;
                }
                return -1;
            }
            xVar3.M(i33 + read);
            i7 = 1;
        }
    }

    @Override // f3.o
    public final f3.o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
