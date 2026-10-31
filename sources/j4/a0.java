package j4;

import android.util.SparseArray;
import e2.k0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 implements c3.o {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public h3.a i;
    public c3.q j;
    public boolean k;
    public final k0 a = new k0(0);
    public final e2.x c = new e2.x(TLObject.FLAG_12);
    public final SparseArray b = new SparseArray();
    public final y d = new y(0);

    @Override // c3.o
    public final boolean a(c3.p pVar) {
        byte[] bArr = new byte[14];
        c3.l lVar = (c3.l) pVar;
        lVar.j(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.r(bArr[13] & 7, false);
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
            z zVar = (z) sparseArray.valueAt(i10);
            zVar.f = false;
            zVar.a.e();
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
        y yVar = this.d;
        if (i12 != 0 && !yVar.d) {
            k0 k0Var = yVar.b;
            e2.x xVar = yVar.c;
            if (!yVar.f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j13 = length2 - min;
                if (pVar.getPosition() != j13) {
                    sVar.a = j13;
                    return 1;
                }
                xVar.K(min);
                pVar.m();
                pVar.b(0, min, xVar.a);
                int i13 = xVar.b;
                int i14 = xVar.c - 4;
                while (true) {
                    if (i14 < i13) {
                        break;
                    }
                    if (y.b(i14, xVar.a) == 442) {
                        xVar.N(i14 + 4);
                        long c10 = y.c(xVar);
                        if (c10 != -9223372036854775807L) {
                            j12 = c10;
                            break;
                        }
                    }
                    i14--;
                }
                yVar.h = j12;
                yVar.f = true;
                return 0;
            }
            if (yVar.h == -9223372036854775807L) {
                yVar.a(pVar);
                return 0;
            }
            if (yVar.e) {
                long j14 = yVar.g;
                if (j14 == -9223372036854775807L) {
                    yVar.a(pVar);
                    return 0;
                }
                yVar.i = k0Var.c(yVar.h) - k0Var.b(j14);
                yVar.a(pVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, pVar.getLength());
            long j15 = 0;
            if (pVar.getPosition() != j15) {
                sVar.a = j15;
                return 1;
            }
            xVar.K(min2);
            pVar.m();
            pVar.b(0, min2, xVar.a);
            int i15 = xVar.b;
            int i16 = xVar.c;
            while (true) {
                if (i15 >= i16 - 3) {
                    j11 = -9223372036854775807L;
                    break;
                }
                if (y.b(i15, xVar.a) == 442) {
                    xVar.N(i15 + 4);
                    long c11 = y.c(xVar);
                    if (c11 != -9223372036854775807L) {
                        j11 = c11;
                        break;
                    }
                }
                i15++;
            }
            yVar.g = j11;
            yVar.e = true;
            return 0;
        }
        if (this.k) {
            i10 = i12;
            i11 = 4;
        } else {
            this.k = true;
            long j16 = yVar.i;
            if (j16 != -9223372036854775807L) {
                k0 k0Var2 = yVar.b;
                hb.a aVar = new hb.a(4);
                n4.q qVar = new n4.q();
                qVar.a = k0Var2;
                qVar.b = new e2.x();
                i10 = i12;
                i11 = 4;
                h3.a aVar2 = new h3.a(aVar, qVar, j16, j16 + 1, 0L, length, 188L, 1000);
                this.i = aVar2;
                this.j.G1(aVar2.a);
            } else {
                i10 = i12;
                i11 = 4;
                this.j.G1(new c3.t(j16));
            }
        }
        h3.a aVar3 = this.i;
        if (aVar3 != null && aVar3.c != null) {
            return aVar3.b(pVar, sVar);
        }
        pVar.m();
        long k10 = i10 != 0 ? length - pVar.k() : -1L;
        if (k10 != -1 && k10 < 4) {
            return -1;
        }
        e2.x xVar2 = this.c;
        if (!pVar.j(xVar2.a, 0, i11, true)) {
            return -1;
        }
        xVar2.N(0);
        int m10 = xVar2.m();
        if (m10 == 441) {
            return -1;
        }
        if (m10 == 442) {
            pVar.b(0, 10, xVar2.a);
            xVar2.N(9);
            pVar.q((xVar2.A() & 7) + 14);
            return 0;
        }
        if (m10 == 443) {
            pVar.b(0, 2, xVar2.a);
            xVar2.N(0);
            pVar.q(xVar2.H() + 6);
            return 0;
        }
        if (((m10 & (-256)) >> 8) != 1) {
            pVar.q(1);
            return 0;
        }
        int i17 = m10 & zs.e4;
        SparseArray sparseArray = this.b;
        z zVar = (z) sparseArray.get(i17);
        if (!this.e) {
            if (zVar == null) {
                if (i17 == 189) {
                    iVar = new b("video/mp2p");
                    this.f = true;
                    this.h = pVar.getPosition();
                } else if ((m10 & zs.B3) == 192) {
                    iVar = new u(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = pVar.getPosition();
                } else if ((m10 & zs.P3) == 224) {
                    iVar = new k(null, "video/mp2p");
                    this.g = true;
                    this.h = pVar.getPosition();
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    iVar.f(this.j, new g0(i17, 256));
                    zVar = new z(iVar, this.a);
                    sparseArray.put(i17, zVar);
                }
            }
            if (pVar.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.Q0();
            }
        }
        pVar.b(0, 2, xVar2.a);
        xVar2.N(0);
        int H = xVar2.H() + 6;
        if (zVar == null) {
            pVar.q(H);
            return 0;
        }
        xVar2.K(H);
        pVar.readFully(xVar2.a, 0, H);
        xVar2.N(6);
        i iVar2 = zVar.a;
        a4.g gVar = zVar.c;
        xVar2.k(0, 3, (byte[]) gVar.b);
        gVar.d0(0);
        gVar.f0(8);
        zVar.d = gVar.h();
        zVar.e = gVar.h();
        gVar.f0(6);
        xVar2.k(0, gVar.i(8), (byte[]) gVar.b);
        gVar.d0(0);
        k0 k0Var3 = zVar.b;
        zVar.g = 0L;
        if (zVar.d) {
            gVar.f0(4);
            gVar.f0(1);
            gVar.f0(1);
            long i18 = (gVar.i(3) << 30) | (gVar.i(15) << 15) | gVar.i(15);
            gVar.f0(1);
            if (zVar.f || !zVar.e) {
                j10 = i18;
            } else {
                gVar.f0(4);
                gVar.f0(1);
                gVar.f0(1);
                gVar.f0(1);
                k0Var3.b((gVar.i(15) << 15) | (gVar.i(3) << 30) | gVar.i(15));
                zVar.f = true;
                j10 = i18;
            }
            zVar.g = k0Var3.b(j10);
        }
        iVar2.h(4, zVar.g);
        iVar2.c(xVar2);
        iVar2.g(false);
        xVar2.M(xVar2.a.length);
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
