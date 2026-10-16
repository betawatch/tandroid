package j4;

import android.util.SparseArray;
import e2.k0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class z implements c3.o {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public h3.a i;
    public c3.q j;
    public boolean k;
    public final k0 a = new k0(0);
    public final e2.x c = new e2.x(4096);
    public final SparseArray b = new SparseArray();
    public final x d = new x(0);

    @Override // c3.o
    public final boolean a(c3.p pVar) {
        byte[] bArr = new byte[14];
        c3.l lVar = (c3.l) pVar;
        lVar.j(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.v(bArr[13] & 7, false);
            lVar.j(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // c3.o
    public final void c(c3.q qVar) {
        this.j = qVar;
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        k0 k0Var = this.a;
        boolean z10 = k0Var.e() == -9223372036854775807L;
        if (!z10) {
            long d = k0Var.d();
            z10 = (d == -9223372036854775807L || d == 0 || d == j11) ? false : true;
        }
        if (z10) {
            k0Var.g(j11);
        }
        h3.a aVar = this.i;
        if (aVar != null) {
            aVar.d(j11);
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
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // c3.o
    public final int f(c3.p pVar, c3.s sVar) {
        int i10;
        int i11;
        long j10;
        i iVar;
        long j11;
        this.j.getClass();
        long length = pVar.getLength();
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j12 = -9223372036854775807L;
        x xVar = this.d;
        if (i12 != 0 && !xVar.d) {
            k0 k0Var = xVar.b;
            e2.x xVar2 = xVar.c;
            if (!xVar.f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j13 = length2 - min;
                if (pVar.getPosition() != j13) {
                    sVar.a = j13;
                    return 1;
                }
                xVar2.K(min);
                pVar.q();
                pVar.b(0, min, xVar2.a);
                int i13 = xVar2.b;
                int i14 = xVar2.c - 4;
                while (true) {
                    if (i14 < i13) {
                        break;
                    }
                    if (x.b(i14, xVar2.a) == 442) {
                        xVar2.N(i14 + 4);
                        long c10 = x.c(xVar2);
                        if (c10 != -9223372036854775807L) {
                            j12 = c10;
                            break;
                        }
                    }
                    i14--;
                }
                xVar.h = j12;
                xVar.f = true;
                return 0;
            }
            if (xVar.h == -9223372036854775807L) {
                xVar.a(pVar);
                return 0;
            }
            if (xVar.e) {
                long j14 = xVar.g;
                if (j14 == -9223372036854775807L) {
                    xVar.a(pVar);
                    return 0;
                }
                xVar.i = k0Var.c(xVar.h) - k0Var.b(j14);
                xVar.a(pVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, pVar.getLength());
            long j15 = 0;
            if (pVar.getPosition() != j15) {
                sVar.a = j15;
                return 1;
            }
            xVar2.K(min2);
            pVar.q();
            pVar.b(0, min2, xVar2.a);
            int i15 = xVar2.b;
            int i16 = xVar2.c;
            while (true) {
                if (i15 >= i16 - 3) {
                    j11 = -9223372036854775807L;
                    break;
                }
                if (x.b(i15, xVar2.a) == 442) {
                    xVar2.N(i15 + 4);
                    long c11 = x.c(xVar2);
                    if (c11 != -9223372036854775807L) {
                        j11 = c11;
                        break;
                    }
                }
                i15++;
            }
            xVar.g = j11;
            xVar.e = true;
            return 0;
        }
        if (this.k) {
            i10 = i12;
            i11 = 4;
        } else {
            this.k = true;
            long j16 = xVar.i;
            if (j16 != -9223372036854775807L) {
                i10 = i12;
                i11 = 4;
                h3.a aVar = new h3.a(new t7.u(3), new n4.s(xVar.b), j16, j16 + 1, 0L, length, 188L, MediaDataController.MAX_STYLE_RUNS_COUNT);
                this.i = aVar;
                this.j.K(aVar.a);
            } else {
                i10 = i12;
                i11 = 4;
                this.j.K(new c3.t(j16));
            }
        }
        h3.a aVar2 = this.i;
        if (aVar2 != null && aVar2.c != null) {
            return aVar2.b(pVar, sVar);
        }
        pVar.q();
        long k10 = i10 != 0 ? length - pVar.k() : -1L;
        if (k10 != -1 && k10 < 4) {
            return -1;
        }
        e2.x xVar3 = this.c;
        if (!pVar.j(xVar3.a, 0, i11, true)) {
            return -1;
        }
        xVar3.N(0);
        int m10 = xVar3.m();
        if (m10 == 441) {
            return -1;
        }
        if (m10 == 442) {
            pVar.b(0, 10, xVar3.a);
            xVar3.N(9);
            pVar.r((xVar3.A() & 7) + 14);
            return 0;
        }
        if (m10 == 443) {
            pVar.b(0, 2, xVar3.a);
            xVar3.N(0);
            pVar.r(xVar3.H() + 6);
            return 0;
        }
        if (((m10 & (-256)) >> 8) != 1) {
            pVar.r(1);
            return 0;
        }
        int i17 = m10 & 255;
        SparseArray sparseArray = this.b;
        y yVar = (y) sparseArray.get(i17);
        if (!this.e) {
            if (yVar == null) {
                if (i17 == 189) {
                    iVar = new b("video/mp2p");
                    this.f = true;
                    this.h = pVar.getPosition();
                } else if ((m10 & 224) == 192) {
                    iVar = new u(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = pVar.getPosition();
                } else if ((m10 & 240) == 224) {
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
                this.j.D();
            }
        }
        pVar.b(0, 2, xVar3.a);
        xVar3.N(0);
        int H = xVar3.H() + 6;
        if (yVar == null) {
            pVar.r(H);
            return 0;
        }
        xVar3.K(H);
        pVar.readFully(xVar3.a, 0, H);
        xVar3.N(6);
        i iVar2 = yVar.a;
        a4.g gVar = yVar.c;
        xVar3.k(0, 3, gVar.b);
        gVar.m(0);
        gVar.o(8);
        yVar.d = gVar.f();
        yVar.e = gVar.f();
        gVar.o(6);
        xVar3.k(0, gVar.g(8), gVar.b);
        gVar.m(0);
        k0 k0Var2 = yVar.b;
        yVar.g = 0L;
        if (yVar.d) {
            gVar.o(4);
            gVar.o(1);
            gVar.o(1);
            long g10 = (gVar.g(3) << 30) | (gVar.g(15) << 15) | gVar.g(15);
            gVar.o(1);
            if (yVar.f || !yVar.e) {
                j10 = g10;
            } else {
                gVar.o(4);
                gVar.o(1);
                gVar.o(1);
                gVar.o(1);
                k0Var2.b((gVar.g(15) << 15) | (gVar.g(3) << 30) | gVar.g(15));
                yVar.f = true;
                j10 = g10;
            }
            yVar.g = k0Var2.b(j10);
        }
        iVar2.f(4, yVar.g);
        iVar2.a(xVar3);
        iVar2.e(false);
        xVar3.M(xVar3.a.length);
        return 0;
    }

    @Override // c3.o
    public final c3.o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
