package b4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j3.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.jb;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f0 implements r3.k {
    public final int a;
    public final List b;
    public final h5.w c;
    public final SparseIntArray d;
    public final f e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final y i;
    public x j;
    public r3.m k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public i0 p;
    public int q;
    public int r;

    public f0(int i10, h5.c0 c0Var, f fVar) {
        this.e = fVar;
        this.a = i10;
        if (i10 == 1 || i10 == 2) {
            this.b = Collections.singletonList(c0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(c0Var);
        }
        this.c = new h5.w(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.d = new SparseIntArray();
        this.i = new y(1);
        this.k = r3.m.A;
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (i0) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new c0(new bf.b(this)));
        this.p = null;
    }

    @Override // r3.k
    public final void d(long j10, long j11) {
        x xVar;
        h5.a.i(this.a != 2);
        List list = this.b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            h5.c0 c0Var = (h5.c0) list.get(i10);
            boolean z4 = c0Var.d() == -9223372036854775807L;
            if (!z4) {
                long c3 = c0Var.c();
                z4 = (c3 == -9223372036854775807L || c3 == 0 || c3 == j11) ? false : true;
            }
            if (z4) {
                c0Var.f(j11);
            }
        }
        if (j11 != 0 && (xVar = this.j) != null) {
            xVar.d(j11);
        }
        this.c.C(0);
        this.d.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i11 >= sparseArray.size()) {
                this.q = 0;
                return;
            } else {
                ((i0) sparseArray.valueAt(i11)).b();
                i11++;
            }
        }
    }

    @Override // r3.k
    public final void e(r3.m mVar) {
        this.k = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // r3.k
    public final int h(r3.l lVar, jb jbVar) {
        r3.l lVar2;
        int i10;
        ?? r32;
        int i11;
        long j10;
        boolean z4;
        int i12;
        long j11 = ((r3.h) lVar).c;
        boolean z10 = this.m;
        int i13 = this.a;
        if (z10) {
            long j12 = -9223372036854775807L;
            y yVar = this.i;
            if (j11 != -1 && i13 != 2 && !yVar.d) {
                int i14 = this.r;
                h5.c0 c0Var = yVar.b;
                h5.w wVar = yVar.c;
                if (i14 <= 0) {
                    yVar.a(lVar);
                    return 0;
                }
                if (!yVar.f) {
                    r3.h hVar = (r3.h) lVar;
                    long j13 = hVar.c;
                    int min = (int) Math.min(112800, j13);
                    long j14 = j13 - min;
                    if (hVar.d != j14) {
                        jbVar.a = j14;
                        return 1;
                    }
                    wVar.C(min);
                    hVar.f = 0;
                    hVar.f(wVar.a, 0, min, false);
                    int i15 = wVar.b;
                    int i16 = wVar.c;
                    int i17 = i16 - 188;
                    while (true) {
                        if (i17 < i15) {
                            break;
                        }
                        byte[] bArr = wVar.a;
                        int i18 = -4;
                        int i19 = 0;
                        while (true) {
                            if (i18 > 4) {
                                break;
                            }
                            int i20 = (i18 * 188) + i17;
                            if (i20 < i15 || i20 >= i16 || bArr[i20] != 71) {
                                i19 = 0;
                            } else {
                                i19++;
                                if (i19 == 5) {
                                    long a2 = j7.d0.a(wVar, i17, i14);
                                    if (a2 != -9223372036854775807L) {
                                        j12 = a2;
                                        break;
                                    }
                                }
                            }
                            i18++;
                        }
                        i17--;
                    }
                    yVar.h = j12;
                    yVar.f = true;
                    return 0;
                }
                if (yVar.h == -9223372036854775807L) {
                    yVar.a(lVar);
                    return 0;
                }
                if (yVar.e) {
                    long j15 = yVar.g;
                    if (j15 == -9223372036854775807L) {
                        yVar.a(lVar);
                        return 0;
                    }
                    long b10 = c0Var.b(yVar.h) - c0Var.b(j15);
                    yVar.i = b10;
                    if (b10 < 0) {
                        h5.a.K("TsDurationReader", "Invalid duration: " + yVar.i + ". Using TIME_UNSET instead.");
                        yVar.i = -9223372036854775807L;
                    }
                    yVar.a(lVar);
                    return 0;
                }
                r3.h hVar2 = (r3.h) lVar;
                int min2 = (int) Math.min(112800, hVar2.c);
                long j16 = 0;
                if (hVar2.d != j16) {
                    jbVar.a = j16;
                    return 1;
                }
                wVar.C(min2);
                hVar2.f = 0;
                hVar2.f(wVar.a, 0, min2, false);
                int i21 = wVar.b;
                int i22 = wVar.c;
                while (true) {
                    if (i21 >= i22) {
                        break;
                    }
                    if (wVar.a[i21] == 71) {
                        long a10 = j7.d0.a(wVar, i21, i14);
                        if (a10 != -9223372036854775807L) {
                            j12 = a10;
                            break;
                        }
                    }
                    i21++;
                }
                yVar.g = j12;
                yVar.e = true;
                return 0;
            }
            if (this.n) {
                i10 = i13;
                j10 = 0;
                z4 = false;
                i12 = 1;
            } else {
                this.n = true;
                long j17 = yVar.i;
                if (j17 != -9223372036854775807L) {
                    h5.c0 c0Var2 = yVar.b;
                    i10 = i13;
                    j10 = 0;
                    z4 = false;
                    i12 = 1;
                    x xVar = new x(new cb.b(21), new e0(this.r, c0Var2), j17, j17 + 1, 0L, j11, 188L, 940);
                    this.j = xVar;
                    this.k.m2(xVar.a);
                } else {
                    i10 = i13;
                    j10 = 0;
                    z4 = false;
                    i12 = 1;
                    this.k.m2(new r3.n(j17));
                }
            }
            if (this.o) {
                this.o = z4;
                d(j10, j10);
                if (((r3.h) lVar).d != j10) {
                    jbVar.a = j10;
                    return i12;
                }
            }
            x xVar2 = this.j;
            if (xVar2 != null && xVar2.c != null) {
                return xVar2.b(lVar, jbVar);
            }
            lVar2 = lVar;
            r32 = z4;
        } else {
            lVar2 = lVar;
            i10 = i13;
            r32 = 0;
        }
        h5.w wVar2 = this.c;
        byte[] bArr2 = wVar2.a;
        if (9400 - wVar2.b < 188) {
            int a11 = wVar2.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, wVar2.b, bArr2, r32, a11);
            }
            wVar2.D(a11, bArr2);
        }
        while (wVar2.a() < 188) {
            int i23 = wVar2.c;
            int read = ((r3.h) lVar2).read(bArr2, i23, 9400 - i23);
            if (read == -1) {
                return -1;
            }
            wVar2.E(i23 + read);
        }
        int i24 = wVar2.b;
        int i25 = wVar2.c;
        byte[] bArr3 = wVar2.a;
        int i26 = i24;
        while (i26 < i25 && bArr3[i26] != 71) {
            i26++;
        }
        wVar2.F(i26);
        int i27 = i26 + 188;
        if (i27 > i25) {
            int i28 = (i26 - i24) + this.q;
            this.q = i28;
            i11 = i10;
            if (i11 == 2 && i28 > 376) {
                throw r1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i11 = i10;
            this.q = r32;
        }
        int i29 = wVar2.c;
        if (i27 > i29) {
            return r32;
        }
        int g10 = wVar2.g();
        if ((8388608 & g10) != 0) {
            wVar2.F(i27);
            return r32;
        }
        int i30 = (4194304 & g10) != 0 ? 1 : 0;
        int i31 = (2096896 & g10) >> 8;
        boolean z11 = (g10 & 32) != 0;
        i0 i0Var = (g10 & 16) != 0 ? (i0) this.f.get(i31) : null;
        if (i0Var == null) {
            wVar2.F(i27);
            return r32;
        }
        if (i11 != 2) {
            int i32 = g10 & 15;
            SparseIntArray sparseIntArray = this.d;
            int i33 = sparseIntArray.get(i31, i32 - 1);
            sparseIntArray.put(i31, i32);
            if (i33 == i32) {
                wVar2.F(i27);
                return r32;
            }
            if (i32 != ((i33 + 1) & 15)) {
                i0Var.b();
            }
        }
        if (z11) {
            int u10 = wVar2.u();
            i30 |= (wVar2.u() & 64) != 0 ? 2 : 0;
            wVar2.G(u10 - 1);
        }
        boolean z12 = this.m;
        if (i11 == 2 || z12 || !this.h.get(i31, r32)) {
            wVar2.E(i27);
            i0Var.a(i30, wVar2);
            wVar2.E(i29);
        }
        if (i11 != 2 && !z12 && this.m && j11 != -1) {
            this.o = true;
        }
        wVar2.F(i27);
        return r32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(r3.l lVar) {
        byte[] bArr = this.c.a;
        r3.h hVar = (r3.h) lVar;
        hVar.f(bArr, 0, 940, false);
        int i10 = 0;
        while (i10 < 188) {
            for (int i11 = 0; i11 < 5; i11++) {
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
            }
            hVar.s(i10);
            return true;
        }
        return false;
    }

    @Override // r3.k
    public final void release() {
    }
}
