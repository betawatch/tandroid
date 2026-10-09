package j4;

import android.util.SparseArray;
import e9.a1;
import e9.i0;
import java.util.List;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class z implements c3.o {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public h3.a i;
    public c3.q j;
    public boolean k;
    public final e2.b0 a = new e2.b0(0);
    public final e2.v c = new e2.v(4096);
    public final SparseArray b = new SparseArray();
    public final x d = new x(0);

    @Override // c3.o
    public final boolean a(c3.p pVar) {
        byte[] bArr = new byte[14];
        c3.l lVar = (c3.l) pVar;
        lVar.h(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.v(bArr[13] & 7, false);
            lVar.h(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // c3.o
    public final void g(c3.q qVar) {
        this.j = qVar;
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        e2.b0 b0Var = this.a;
        boolean z10 = b0Var.e() == -9223372036854775807L;
        if (!z10) {
            long d = b0Var.d();
            z10 = (d == -9223372036854775807L || d == 0 || d == j10) ? false : true;
        }
        if (z10) {
            b0Var.g(j10);
        }
        h3.a aVar = this.i;
        if (aVar != null) {
            aVar.d(j10);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            y yVar = (y) sparseArray.valueAt(i10);
            yVar.f = false;
            yVar.a.c();
            i10++;
        }
    }

    @Override // c3.o
    public final List i() {
        e9.g0 g0Var = i0.b;
        return a1.e;
    }

    @Override // c3.o
    public final int m(c3.p pVar, c3.s sVar) {
        int i10;
        int i11;
        long j3;
        i iVar;
        long j10;
        e2.d.h(this.j);
        long length = pVar.getLength();
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = -9223372036854775807L;
        x xVar = this.d;
        if (i12 != 0 && !xVar.d) {
            e2.b0 b0Var = xVar.b;
            e2.v vVar = xVar.c;
            if (!xVar.f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j12 = length2 - min;
                if (pVar.getPosition() != j12) {
                    sVar.a = j12;
                    return 1;
                }
                vVar.G(min);
                pVar.q();
                pVar.a(0, min, vVar.a);
                int i13 = vVar.b;
                int i14 = vVar.c - 4;
                while (true) {
                    if (i14 < i13) {
                        break;
                    }
                    if (x.b(i14, vVar.a) == 442) {
                        vVar.J(i14 + 4);
                        long c10 = x.c(vVar);
                        if (c10 != -9223372036854775807L) {
                            j11 = c10;
                            break;
                        }
                    }
                    i14--;
                }
                xVar.h = j11;
                xVar.f = true;
                return 0;
            }
            if (xVar.h == -9223372036854775807L) {
                xVar.a(pVar);
                return 0;
            }
            if (xVar.e) {
                long j13 = xVar.g;
                if (j13 == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                }
                xVar.i = b0Var.c(xVar.h) - b0Var.b(j13);
                xVar.a(pVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, pVar.getLength());
            long j14 = 0;
            if (pVar.getPosition() != j14) {
                sVar.a = j14;
                return 1;
            }
            vVar.G(min2);
            pVar.q();
            pVar.a(0, min2, vVar.a);
            int i15 = vVar.b;
            int i16 = vVar.c;
            while (true) {
                if (i15 >= i16 - 3) {
                    j10 = -9223372036854775807L;
                    break;
                }
                if (x.b(i15, vVar.a) == 442) {
                    vVar.J(i15 + 4);
                    long c11 = x.c(vVar);
                    if (c11 != -9223372036854775807L) {
                        j10 = c11;
                        break;
                    }
                }
                i15++;
            }
            xVar.g = j10;
            xVar.e = true;
            return 0;
        }
        if (this.k) {
            i10 = i12;
            i11 = 4;
        } else {
            this.k = true;
            long j15 = xVar.i;
            if (j15 != -9223372036854775807L) {
                i10 = i12;
                i11 = 4;
                h3.a aVar = new h3.a(new t7.t(), new n4.x(xVar.b), j15, j15 + 1, 0L, length, 188L, MediaDataController.MAX_STYLE_RUNS_COUNT);
                this.i = aVar;
                this.j.d2(aVar.a);
            } else {
                i10 = i12;
                i11 = 4;
                this.j.d2(new c3.t(j15));
            }
        }
        h3.a aVar2 = this.i;
        if (aVar2 != null && aVar2.c != null) {
            return aVar2.b(pVar, sVar);
        }
        pVar.q();
        long j16 = i10 != 0 ? length - pVar.j() : -1L;
        if (j16 != -1 && j16 < 4) {
            return -1;
        }
        e2.v vVar2 = this.c;
        if (!pVar.h(vVar2.a, 0, i11, true)) {
            return -1;
        }
        vVar2.J(0);
        int j17 = vVar2.j();
        if (j17 == 441) {
            return -1;
        }
        if (j17 == 442) {
            pVar.a(0, 10, vVar2.a);
            vVar2.J(9);
            pVar.r((vVar2.x() & 7) + 14);
            return 0;
        }
        if (j17 == 443) {
            pVar.a(0, 2, vVar2.a);
            vVar2.J(0);
            pVar.r(vVar2.D() + 6);
            return 0;
        }
        if (((j17 & (-256)) >> 8) != 1) {
            pVar.r(1);
            return 0;
        }
        int i17 = j17 & 255;
        SparseArray sparseArray = this.b;
        y yVar = (y) sparseArray.get(i17);
        if (!this.e) {
            if (yVar == null) {
                if (i17 == 189) {
                    iVar = new b("video/mp2p");
                    this.f = true;
                    this.h = pVar.getPosition();
                } else if ((j17 & 224) == 192) {
                    iVar = new u(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = pVar.getPosition();
                } else if ((j17 & 240) == 224) {
                    iVar = new k(null, "video/mp2p");
                    this.g = true;
                    this.h = pVar.getPosition();
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    iVar.d(this.j, new f0(i17, 256));
                    yVar = new y(iVar, this.a);
                    sparseArray.put(i17, yVar);
                }
            }
            if (pVar.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.k1();
            }
        }
        pVar.a(0, 2, vVar2.a);
        vVar2.J(0);
        int D = vVar2.D() + 6;
        if (yVar == null) {
            pVar.r(D);
            return 0;
        }
        vVar2.G(D);
        pVar.readFully(vVar2.a, 0, D);
        vVar2.J(6);
        i iVar2 = yVar.a;
        a4.g gVar = yVar.c;
        vVar2.h(0, 3, gVar.b);
        gVar.q(0);
        gVar.t(8);
        yVar.d = gVar.h();
        yVar.e = gVar.h();
        gVar.t(6);
        vVar2.h(0, gVar.i(8), gVar.b);
        gVar.q(0);
        e2.b0 b0Var2 = yVar.b;
        yVar.g = 0L;
        if (yVar.d) {
            gVar.t(4);
            gVar.t(1);
            gVar.t(1);
            long i18 = (gVar.i(3) << 30) | (gVar.i(15) << 15) | gVar.i(15);
            gVar.t(1);
            if (yVar.f || !yVar.e) {
                j3 = i18;
            } else {
                gVar.t(4);
                gVar.t(1);
                gVar.t(1);
                gVar.t(1);
                b0Var2.b((gVar.i(15) << 15) | (gVar.i(3) << 30) | gVar.i(15));
                yVar.f = true;
                j3 = i18;
            }
            yVar.g = b0Var2.b(j3);
        }
        iVar2.f(4, yVar.g);
        iVar2.a(vVar2);
        iVar2.e(false);
        vVar2.I(vVar2.a.length);
        return 0;
    }

    @Override // c3.o
    public final c3.o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
