package b4;

import android.util.SparseArray;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.jb;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a0 implements r3.k {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public x i;
    public r3.m j;
    public boolean k;
    public final h5.c0 a = new h5.c0(0);
    public final h5.w c = new h5.w(4096);
    public final SparseArray b = new SparseArray();
    public final y d = new y(0);

    @Override // r3.k
    public final void d(long j10, long j11) {
        h5.c0 c0Var = this.a;
        boolean z4 = c0Var.d() == -9223372036854775807L;
        if (!z4) {
            long c3 = c0Var.c();
            z4 = (c3 == -9223372036854775807L || c3 == 0 || c3 == j11) ? false : true;
        }
        if (z4) {
            c0Var.f(j11);
        }
        x xVar = this.i;
        if (xVar != null) {
            xVar.d(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            z zVar = (z) sparseArray.valueAt(i10);
            zVar.f = false;
            zVar.a.b();
            i10++;
        }
    }

    @Override // r3.k
    public final void e(r3.m mVar) {
        this.j = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0231  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(r3.l lVar, jb jbVar) {
        ?? r32;
        i kVar;
        long j10;
        long j11;
        h5.a.j(this.j);
        long j12 = ((r3.h) lVar).c;
        y yVar = this.d;
        if (j12 != -1 && !yVar.d) {
            h5.c0 c0Var = yVar.b;
            h5.w wVar = yVar.c;
            if (!yVar.f) {
                r3.h hVar = (r3.h) lVar;
                long j13 = hVar.c;
                int min = (int) Math.min(20000L, j13);
                long j14 = j13 - min;
                if (hVar.d != j14) {
                    jbVar.a = j14;
                    return 1;
                }
                wVar.C(min);
                hVar.f = 0;
                hVar.h(wVar.a, 0, min, false);
                int i10 = wVar.b;
                int i11 = wVar.c - 4;
                while (true) {
                    if (i11 < i10) {
                        j11 = -9223372036854775807L;
                        break;
                    }
                    if (y.b(i11, wVar.a) == 442) {
                        wVar.F(i11 + 4);
                        long c3 = y.c(wVar);
                        if (c3 != -9223372036854775807L) {
                            j11 = c3;
                            break;
                        }
                    }
                    i11--;
                }
                yVar.h = j11;
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
                    h5.a.K("PsDurationReader", "Invalid duration: " + yVar.i + ". Using TIME_UNSET instead.");
                    yVar.i = -9223372036854775807L;
                }
                yVar.a(lVar);
                return 0;
            }
            r3.h hVar2 = (r3.h) lVar;
            int min2 = (int) Math.min(20000L, hVar2.c);
            long j16 = 0;
            if (hVar2.d != j16) {
                jbVar.a = j16;
                return 1;
            }
            wVar.C(min2);
            hVar2.f = 0;
            hVar2.h(wVar.a, 0, min2, false);
            int i12 = wVar.b;
            int i13 = wVar.c;
            while (true) {
                if (i12 >= i13 - 3) {
                    j10 = -9223372036854775807L;
                    break;
                }
                if (y.b(i12, wVar.a) == 442) {
                    wVar.F(i12 + 4);
                    long c10 = y.c(wVar);
                    if (c10 != -9223372036854775807L) {
                        j10 = c10;
                        break;
                    }
                }
                i12++;
            }
            yVar.g = j10;
            yVar.e = true;
            return 0;
        }
        if (this.k) {
            r32 = 0;
        } else {
            this.k = true;
            long j17 = yVar.i;
            if (j17 != -9223372036854775807L) {
                r32 = 0;
                x xVar = new x(new cb.b(21), new bf.b(yVar.b), j17, j17 + 1, 0L, j12, 188L, MediaDataController.MAX_STYLE_RUNS_COUNT);
                this.i = xVar;
                this.j.g2(xVar.a);
            } else {
                r32 = 0;
                this.j.g2(new r3.n(j17));
            }
        }
        x xVar2 = this.i;
        if (xVar2 != null && xVar2.c != null) {
            return xVar2.b(lVar, jbVar);
        }
        r3.h hVar3 = (r3.h) lVar;
        hVar3.f = r32;
        long i14 = j12 != -1 ? j12 - hVar3.i() : -1L;
        if (i14 != -1 && i14 < 4) {
            return -1;
        }
        h5.w wVar2 = this.c;
        if (!hVar3.h(wVar2.a, r32, 4, true)) {
            return -1;
        }
        wVar2.F(r32);
        int g10 = wVar2.g();
        if (g10 == 441) {
            return -1;
        }
        if (g10 == 442) {
            hVar3.h(wVar2.a, r32, 10, r32);
            wVar2.F(9);
            hVar3.u((wVar2.u() & 7) + 14);
            return r32;
        }
        if (g10 == 443) {
            hVar3.h(wVar2.a, r32, 2, r32);
            wVar2.F(r32);
            hVar3.u(wVar2.z() + 6);
            return r32;
        }
        if (((g10 & (-256)) >> 8) != 1) {
            hVar3.u(1);
            return r32;
        }
        int i15 = g10 & 255;
        SparseArray sparseArray = this.b;
        z zVar = (z) sparseArray.get(i15);
        if (!this.e) {
            if (zVar == null) {
                i iVar = null;
                if (i15 == 189) {
                    kVar = new b(null, 0);
                    this.f = true;
                    this.h = hVar3.d;
                } else if ((g10 & 224) == 192) {
                    kVar = new u(null);
                    this.f = true;
                    this.h = hVar3.d;
                } else {
                    if ((g10 & 240) == 224) {
                        kVar = new k(null);
                        this.g = true;
                        this.h = hVar3.d;
                    }
                    if (iVar != null) {
                        iVar.c(this.j, new h0(i15, 256));
                        zVar = new z(iVar, this.a);
                        sparseArray.put(i15, zVar);
                    }
                }
                iVar = kVar;
                if (iVar != null) {
                }
            }
            if (hVar3.d > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.f1();
            }
        }
        hVar3.h(wVar2.a, r32, 2, r32);
        wVar2.F(r32);
        int z4 = wVar2.z() + 6;
        if (zVar == null) {
            hVar3.u(z4);
            return r32;
        }
        wVar2.C(z4);
        hVar3.d(wVar2.a, r32, z4, r32);
        wVar2.F(6);
        i iVar2 = zVar.a;
        h5.v vVar = zVar.c;
        wVar2.e(r32, 3, vVar.b);
        vVar.p(r32);
        vVar.s(8);
        zVar.d = vVar.h();
        zVar.e = vVar.h();
        vVar.s(6);
        wVar2.e(r32, vVar.i(8), vVar.b);
        vVar.p(r32);
        h5.c0 c0Var2 = zVar.b;
        zVar.g = 0L;
        if (zVar.d) {
            vVar.s(4);
            vVar.s(1);
            vVar.s(1);
            long i16 = (vVar.i(3) << 30) | (vVar.i(15) << 15) | vVar.i(15);
            vVar.s(1);
            if (!zVar.f && zVar.e) {
                vVar.s(4);
                vVar.s(1);
                vVar.s(1);
                vVar.s(1);
                c0Var2.b(vVar.i(15) | (vVar.i(3) << 30) | (vVar.i(15) << 15));
                zVar.f = true;
            }
            zVar.g = c0Var2.b(i16);
        }
        iVar2.e(4, zVar.g);
        iVar2.a(wVar2);
        iVar2.d();
        wVar2.E(wVar2.a.length);
        return r32;
    }

    @Override // r3.k
    public final boolean i(r3.l lVar) {
        byte[] bArr = new byte[14];
        r3.h hVar = (r3.h) lVar;
        hVar.h(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hVar.a(bArr[13] & 7, false);
            hVar.h(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // r3.k
    public final void release() {
    }
}
