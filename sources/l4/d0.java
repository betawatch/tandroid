package l4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import b8.kg;
import b8.ud;
import b8.zb;
import d2.v0;
import g2.l0;
import g9.i0;
import g9.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d0 implements e3.o {
    public final int a;
    public final int b;
    public final List c;
    public final g2.y d;
    public final SparseIntArray e;
    public final f f;
    public final b4.k g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final x k;
    public j3.a l;
    public e3.q m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public g0 r;
    public int s;
    public int t;

    public d0(int i3, int i10, b4.k kVar, l0 l0Var, f fVar) {
        this.f = fVar;
        this.a = i3;
        this.b = i10;
        this.g = kVar;
        if (i3 == 1 || i3 == 2) {
            this.c = Collections.singletonList(l0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(l0Var);
        }
        this.d = new g2.y(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new x(1);
        this.m = e3.q.k;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (g0) sparseArray2.valueAt(i11));
        }
        tf.b bVar = new tf.b();
        bVar.b = this;
        bVar.a = new c4.f(new byte[4], 4);
        sparseArray.put(0, new b0(bVar));
        this.r = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(e3.p pVar) {
        byte[] bArr = this.d.a;
        e3.l lVar = (e3.l) pVar;
        lVar.h(bArr, 0, 940, false);
        int i3 = 0;
        while (i3 < 188) {
            for (int i10 = 0; i10 < 5; i10++) {
                if (bArr[(i10 * hs.S2) + i3] != 71) {
                    break;
                }
            }
            lVar.g(i3, false);
            return true;
        }
        return false;
    }

    @Override // e3.o
    public final void c(e3.q qVar) {
        if ((this.b & 1) == 0) {
            qVar = new b4.n(qVar, this.g);
        }
        this.m = qVar;
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        j3.a aVar;
        zb.p(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            l0 l0Var = (l0) list.get(i3);
            boolean z10 = l0Var.e() == -9223372036854775807L;
            if (!z10) {
                long d = l0Var.d();
                z10 = (d == -9223372036854775807L || d == 0 || d == j11) ? false : true;
            }
            if (z10) {
                l0Var.g(j11);
            }
        }
        if (j11 != 0 && (aVar = this.l) != null) {
            aVar.d(j11);
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
                ((g0) sparseArray.valueAt(i10)).a();
                i10++;
            }
        }
    }

    @Override // e3.o
    public final List e() {
        g9.g0 g0Var = i0.b;
        return s1.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // e3.o
    public final int f(e3.p pVar, e3.s sVar) {
        e3.p pVar2;
        ?? r12;
        int i3;
        int i10;
        int i11;
        int i12;
        boolean z10;
        long length = pVar.getLength();
        int i13 = this.a;
        boolean z11 = i13 == 2;
        if (this.o) {
            long j10 = -9223372036854775807L;
            x xVar = this.k;
            if (length != -1 && !z11 && !xVar.d) {
                int i14 = this.t;
                l0 l0Var = xVar.b;
                g2.y yVar = xVar.c;
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
                        long j11 = xVar.g;
                        if (j11 == -9223372036854775807L) {
                            xVar.a(pVar);
                            return 0;
                        }
                        xVar.i = l0Var.c(xVar.h) - l0Var.b(j11);
                        xVar.a(pVar);
                        return 0;
                    }
                    int min = (int) Math.min(112800, pVar.getLength());
                    long j12 = 0;
                    if (pVar.getPosition() != j12) {
                        sVar.a = j12;
                        return 1;
                    }
                    yVar.K(min);
                    pVar.o();
                    pVar.c(0, min, yVar.a);
                    int i15 = yVar.b;
                    int i16 = yVar.c;
                    while (true) {
                        if (i15 >= i16) {
                            break;
                        }
                        if (yVar.a[i15] == 71) {
                            long a10 = ud.a(yVar, i15, i14);
                            if (a10 != -9223372036854775807L) {
                                j10 = a10;
                                break;
                            }
                        }
                        i15++;
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
                yVar.K(min2);
                pVar.o();
                pVar.c(0, min2, yVar.a);
                int i17 = yVar.b;
                int i18 = yVar.c;
                int i19 = i18 - 188;
                while (true) {
                    if (i19 < i17) {
                        break;
                    }
                    byte[] bArr = yVar.a;
                    int i20 = -4;
                    int i21 = 0;
                    while (true) {
                        if (i20 > 4) {
                            break;
                        }
                        int i22 = (i20 * hs.S2) + i19;
                        if (i22 < i17 || i22 >= i18 || bArr[i22] != 71) {
                            i21 = 0;
                        } else {
                            i21++;
                            if (i21 == 5) {
                                long a11 = ud.a(yVar, i19, i14);
                                if (a11 != -9223372036854775807L) {
                                    j10 = a11;
                                    break;
                                }
                            }
                        }
                        i20++;
                    }
                    i19--;
                }
                xVar.h = j10;
                xVar.f = true;
                return 0;
            }
            if (this.p) {
                i3 = 1;
                z10 = false;
                i10 = i13;
            } else {
                this.p = true;
                long j14 = xVar.i;
                if (j14 != -9223372036854775807L) {
                    i3 = 1;
                    z10 = false;
                    i10 = i13;
                    j3.a aVar = new j3.a(new v7.s(5), new kg(this.t, xVar.b), j14, 1 + j14, 0L, length, 188L, 940);
                    this.l = aVar;
                    this.m.f(aVar.a);
                } else {
                    i3 = 1;
                    z10 = false;
                    i10 = i13;
                    this.m.f(new e3.t(j14));
                }
            }
            if (this.q) {
                this.q = z10;
                d(0L, 0L);
                if (pVar.getPosition() != 0) {
                    sVar.a = 0L;
                    return i3;
                }
            }
            j3.a aVar2 = this.l;
            if (aVar2 != null && aVar2.c != null) {
                return aVar2.b(pVar, sVar);
            }
            pVar2 = pVar;
            r12 = z10;
        } else {
            pVar2 = pVar;
            r12 = 0;
            i3 = 1;
            i10 = i13;
        }
        g2.y yVar2 = this.d;
        byte[] bArr2 = yVar2.a;
        if (9400 - yVar2.b < 188) {
            int a12 = yVar2.a();
            if (a12 > 0) {
                System.arraycopy(bArr2, yVar2.b, bArr2, r12, a12);
            }
            yVar2.L(a12, bArr2);
        }
        while (true) {
            int a13 = yVar2.a();
            SparseArray sparseArray = this.h;
            if (a13 >= 188) {
                int i23 = yVar2.b;
                int i24 = yVar2.c;
                byte[] bArr3 = yVar2.a;
                int i25 = i23;
                while (i25 < i24 && bArr3[i25] != 71) {
                    i25++;
                }
                yVar2.N(i25);
                int i26 = i25 + hs.S2;
                if (i26 > i24) {
                    int i27 = (i25 - i23) + this.s;
                    this.s = i27;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i27 > 376) {
                        throw v0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.s = r12;
                }
                int i28 = yVar2.c;
                if (i26 > i28) {
                    return r12;
                }
                int m10 = yVar2.m();
                if ((8388608 & m10) != 0) {
                    yVar2.N(i26);
                    return r12;
                }
                int i29 = (4194304 & m10) != 0 ? 1 : r12;
                int i30 = (2096896 & m10) >> 8;
                boolean z12 = (m10 & 32) != 0 ? true : r12;
                g0 g0Var = (m10 & 16) != 0 ? (g0) sparseArray.get(i30) : null;
                if (g0Var == null) {
                    yVar2.N(i26);
                    return r12;
                }
                if (i11 != i12) {
                    int i31 = m10 & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i32 = sparseIntArray.get(i30, i31 - 1);
                    sparseIntArray.put(i30, i31);
                    if (i32 == i31) {
                        yVar2.N(i26);
                        return r12;
                    }
                    if (i31 != ((i32 + 1) & 15)) {
                        g0Var.a();
                    }
                }
                if (z12) {
                    int A = yVar2.A();
                    i29 |= (yVar2.A() & 64) != 0 ? i12 : r12;
                    yVar2.O(A - 1);
                }
                boolean z13 = this.o;
                if (i11 == i12 || z13 || !this.j.get(i30, r12)) {
                    yVar2.M(i26);
                    g0Var.c(i29, yVar2);
                    yVar2.M(i28);
                }
                if (i11 != i12 && !z13 && this.o && length != -1) {
                    this.q = true;
                }
                yVar2.N(i26);
                return r12;
            }
            int i33 = yVar2.c;
            int read = pVar2.read(bArr2, i33, 9400 - i33);
            if (read == -1) {
                int i34 = r12;
                while (i34 < sparseArray.size()) {
                    g0 g0Var2 = (g0) sparseArray.valueAt(i34);
                    if (g0Var2 instanceof w) {
                        w wVar = (w) g0Var2;
                        int i35 = (!z11 || wVar.e()) ? i3 : r12;
                        if (wVar.c == 3 && wVar.j == -1 && ((!z11 || !(wVar.a instanceof k)) && i35 != 0)) {
                            wVar.c(i3, new g2.y());
                        }
                    }
                    i34++;
                    i3 = 1;
                }
                return -1;
            }
            yVar2.M(i33 + read);
            i3 = 1;
        }
    }

    @Override // e3.o
    public final e3.o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
