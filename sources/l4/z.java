package l4;

import android.util.SparseArray;
import g2.l0;
import g9.i0;
import g9.s1;
import java.util.List;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z implements e3.o {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public j3.a i;
    public e3.q j;
    public boolean k;
    public final l0 a = new l0(0);
    public final g2.y c = new g2.y(TLObject.FLAG_12);
    public final SparseArray b = new SparseArray();
    public final x d = new x(0);

    @Override // e3.o
    public final boolean b(e3.p pVar) {
        byte[] bArr = new byte[14];
        e3.l lVar = (e3.l) pVar;
        lVar.h(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.w(bArr[13] & 7, false);
            lVar.h(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // e3.o
    public final void c(e3.q qVar) {
        this.j = qVar;
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        l0 l0Var = this.a;
        boolean z10 = l0Var.e() == -9223372036854775807L;
        if (!z10) {
            long d = l0Var.d();
            z10 = (d == -9223372036854775807L || d == 0 || d == j11) ? false : true;
        }
        if (z10) {
            l0Var.g(j11);
        }
        j3.a aVar = this.i;
        if (aVar != null) {
            aVar.d(j11);
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i3 >= sparseArray.size()) {
                return;
            }
            y yVar = (y) sparseArray.valueAt(i3);
            yVar.f = false;
            yVar.a.a();
            i3++;
        }
    }

    @Override // e3.o
    public final List e() {
        g9.g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // e3.o
    public final int f(e3.p pVar, e3.s sVar) {
        int i3;
        int i10;
        long j10;
        i iVar;
        long j11;
        this.j.getClass();
        long length = pVar.getLength();
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j12 = -9223372036854775807L;
        x xVar = this.d;
        if (i11 != 0 && !xVar.d) {
            l0 l0Var = xVar.b;
            g2.y yVar = xVar.c;
            if (!xVar.f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j13 = length2 - min;
                if (pVar.getPosition() != j13) {
                    sVar.a = j13;
                    return 1;
                }
                yVar.K(min);
                pVar.o();
                pVar.c(0, min, yVar.a);
                int i12 = yVar.b;
                int i13 = yVar.c - 4;
                while (true) {
                    if (i13 < i12) {
                        break;
                    }
                    if (x.b(i13, yVar.a) == 442) {
                        yVar.N(i13 + 4);
                        long c2 = x.c(yVar);
                        if (c2 != -9223372036854775807L) {
                            j12 = c2;
                            break;
                        }
                    }
                    i13--;
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
                xVar.i = l0Var.c(xVar.h) - l0Var.b(j14);
                xVar.a(pVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, pVar.getLength());
            long j15 = 0;
            if (pVar.getPosition() != j15) {
                sVar.a = j15;
                return 1;
            }
            yVar.K(min2);
            pVar.o();
            pVar.c(0, min2, yVar.a);
            int i14 = yVar.b;
            int i15 = yVar.c;
            while (true) {
                if (i14 >= i15 - 3) {
                    j11 = -9223372036854775807L;
                    break;
                }
                if (x.b(i14, yVar.a) == 442) {
                    yVar.N(i14 + 4);
                    long c10 = x.c(yVar);
                    if (c10 != -9223372036854775807L) {
                        j11 = c10;
                        break;
                    }
                }
                i14++;
            }
            xVar.g = j11;
            xVar.e = true;
            return 0;
        }
        if (this.k) {
            i3 = i11;
            i10 = 4;
        } else {
            this.k = true;
            long j16 = xVar.i;
            if (j16 != -9223372036854775807L) {
                l0 l0Var2 = xVar.b;
                v7.s sVar2 = new v7.s(5);
                p4.q qVar = new p4.q();
                qVar.a = l0Var2;
                qVar.b = new g2.y();
                i3 = i11;
                i10 = 4;
                j3.a aVar = new j3.a(sVar2, qVar, j16, j16 + 1, 0L, length, 188L, 1000);
                this.i = aVar;
                this.j.f(aVar.a);
            } else {
                i3 = i11;
                i10 = 4;
                this.j.f(new e3.t(j16));
            }
        }
        j3.a aVar2 = this.i;
        if (aVar2 != null && aVar2.c != null) {
            return aVar2.b(pVar, sVar);
        }
        pVar.o();
        long k10 = i3 != 0 ? length - pVar.k() : -1L;
        if (k10 != -1 && k10 < 4) {
            return -1;
        }
        g2.y yVar2 = this.c;
        if (!pVar.h(yVar2.a, 0, i10, true)) {
            return -1;
        }
        yVar2.N(0);
        int m10 = yVar2.m();
        if (m10 == 441) {
            return -1;
        }
        if (m10 == 442) {
            pVar.c(0, 10, yVar2.a);
            yVar2.N(9);
            pVar.u((yVar2.A() & 7) + 14);
            return 0;
        }
        if (m10 == 443) {
            pVar.c(0, 2, yVar2.a);
            yVar2.N(0);
            pVar.u(yVar2.H() + 6);
            return 0;
        }
        if (((m10 & (-256)) >> 8) != 1) {
            pVar.u(1);
            return 0;
        }
        int i16 = m10 & hs.e4;
        SparseArray sparseArray = this.b;
        y yVar3 = (y) sparseArray.get(i16);
        if (!this.e) {
            if (yVar3 == null) {
                if (i16 == 189) {
                    iVar = new b("video/mp2p");
                    this.f = true;
                    this.h = pVar.getPosition();
                } else if ((m10 & hs.B3) == 192) {
                    iVar = new u(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = pVar.getPosition();
                } else if ((m10 & hs.P3) == 224) {
                    iVar = new k(null, "video/mp2p");
                    this.g = true;
                    this.h = pVar.getPosition();
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    iVar.f(this.j, new f0(i16, 256));
                    yVar3 = new y(iVar, this.a);
                    sparseArray.put(i16, yVar3);
                }
            }
            if (pVar.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.L();
            }
        }
        pVar.c(0, 2, yVar2.a);
        yVar2.N(0);
        int H = yVar2.H() + 6;
        if (yVar3 == null) {
            pVar.u(H);
            return 0;
        }
        yVar2.K(H);
        pVar.readFully(yVar2.a, 0, H);
        yVar2.N(6);
        i iVar2 = yVar3.a;
        c4.f fVar = yVar3.c;
        yVar2.k(0, 3, (byte[]) fVar.b);
        fVar.J(0);
        fVar.L(8);
        yVar3.d = fVar.i();
        yVar3.e = fVar.i();
        fVar.L(6);
        yVar2.k(0, fVar.j(8), (byte[]) fVar.b);
        fVar.J(0);
        l0 l0Var3 = yVar3.b;
        yVar3.g = 0L;
        if (yVar3.d) {
            fVar.L(4);
            fVar.L(1);
            fVar.L(1);
            long j17 = (fVar.j(3) << 30) | (fVar.j(15) << 15) | fVar.j(15);
            fVar.L(1);
            if (yVar3.f || !yVar3.e) {
                j10 = j17;
            } else {
                fVar.L(4);
                fVar.L(1);
                fVar.L(1);
                fVar.L(1);
                l0Var3.b((fVar.j(15) << 15) | (fVar.j(3) << 30) | fVar.j(15));
                yVar3.f = true;
                j10 = j17;
            }
            yVar3.g = l0Var3.b(j10);
        }
        iVar2.e(4, yVar3.g);
        iVar2.c(yVar2);
        iVar2.d(false);
        yVar2.M(yVar2.a.length);
        return 0;
    }

    @Override // e3.o
    public final e3.o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
