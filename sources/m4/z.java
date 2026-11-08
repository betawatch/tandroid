package m4;

import android.util.SparseArray;
import h2.k0;
import h9.i0;
import h9.t1;
import java.util.List;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class z implements f3.o {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public k3.a i;
    public f3.q j;
    public boolean k;
    public final k0 a = new k0(0);
    public final h2.x c = new h2.x(TLObject.FLAG_12);
    public final SparseArray b = new SparseArray();
    public final x d = new x(0);

    @Override // f3.o
    public final boolean b(f3.p pVar) {
        byte[] bArr = new byte[14];
        f3.l lVar = (f3.l) pVar;
        lVar.k(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.v(bArr[13] & 7, false);
            lVar.k(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // f3.o
    public final void c(f3.q qVar) {
        this.j = qVar;
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        k0 k0Var = this.a;
        boolean z9 = k0Var.e() == -9223372036854775807L;
        if (!z9) {
            long d = k0Var.d();
            z9 = (d == -9223372036854775807L || d == 0 || d == j10) ? false : true;
        }
        if (z9) {
            k0Var.g(j10);
        }
        k3.a aVar = this.i;
        if (aVar != null) {
            aVar.d(j10);
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i7 >= sparseArray.size()) {
                return;
            }
            y yVar = (y) sparseArray.valueAt(i7);
            yVar.f = false;
            yVar.a.d();
            i7++;
        }
    }

    @Override // f3.o
    public final List e() {
        h9.g0 g0Var = i0.b;
        return t1.e;
    }

    @Override // f3.o
    public final int f(f3.p pVar, f3.s sVar) {
        int i7;
        int i10;
        long j3;
        i iVar;
        long j10;
        this.j.getClass();
        long length = pVar.getLength();
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = -9223372036854775807L;
        x xVar = this.d;
        if (i11 != 0 && !xVar.d) {
            k0 k0Var = xVar.b;
            h2.x xVar2 = xVar.c;
            if (!xVar.f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j12 = length2 - min;
                if (pVar.getPosition() != j12) {
                    sVar.a = j12;
                    return 1;
                }
                xVar2.K(min);
                pVar.q();
                pVar.b(0, min, xVar2.a);
                int i12 = xVar2.b;
                int i13 = xVar2.c - 4;
                while (true) {
                    if (i13 < i12) {
                        break;
                    }
                    if (x.b(i13, xVar2.a) == 442) {
                        xVar2.N(i13 + 4);
                        long c10 = x.c(xVar2);
                        if (c10 != -9223372036854775807L) {
                            j11 = c10;
                            break;
                        }
                    }
                    i13--;
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
                xVar.i = k0Var.c(xVar.h) - k0Var.b(j13);
                xVar.a(pVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, pVar.getLength());
            long j14 = 0;
            if (pVar.getPosition() != j14) {
                sVar.a = j14;
                return 1;
            }
            xVar2.K(min2);
            pVar.q();
            pVar.b(0, min2, xVar2.a);
            int i14 = xVar2.b;
            int i15 = xVar2.c;
            while (true) {
                if (i14 >= i15 - 3) {
                    j10 = -9223372036854775807L;
                    break;
                }
                if (x.b(i14, xVar2.a) == 442) {
                    xVar2.N(i14 + 4);
                    long c11 = x.c(xVar2);
                    if (c11 != -9223372036854775807L) {
                        j10 = c11;
                        break;
                    }
                }
                i14++;
            }
            xVar.g = j10;
            xVar.e = true;
            return 0;
        }
        if (this.k) {
            i7 = i11;
            i10 = 4;
        } else {
            this.k = true;
            long j15 = xVar.i;
            if (j15 != -9223372036854775807L) {
                i7 = i11;
                i10 = 4;
                k3.a aVar = new k3.a(new nb.a(8), new j2.n(xVar.b), j15, j15 + 1, 0L, length, 188L, 1000);
                this.i = aVar;
                this.j.f(aVar.a);
            } else {
                i7 = i11;
                i10 = 4;
                this.j.f(new f3.t(j15));
            }
        }
        k3.a aVar2 = this.i;
        if (aVar2 != null && aVar2.c != null) {
            return aVar2.b(pVar, sVar);
        }
        pVar.q();
        long l10 = i7 != 0 ? length - pVar.l() : -1L;
        if (l10 != -1 && l10 < 4) {
            return -1;
        }
        h2.x xVar3 = this.c;
        if (!pVar.k(xVar3.a, 0, i10, true)) {
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
            pVar.s((xVar3.A() & 7) + 14);
            return 0;
        }
        if (m10 == 443) {
            pVar.b(0, 2, xVar3.a);
            xVar3.N(0);
            pVar.s(xVar3.H() + 6);
            return 0;
        }
        if (((m10 & (-256)) >> 8) != 1) {
            pVar.s(1);
            return 0;
        }
        int i16 = m10 & qs.e4;
        SparseArray sparseArray = this.b;
        y yVar = (y) sparseArray.get(i16);
        if (!this.e) {
            if (yVar == null) {
                if (i16 == 189) {
                    iVar = new b("video/mp2p");
                    this.f = true;
                    this.h = pVar.getPosition();
                } else if ((m10 & qs.B3) == 192) {
                    iVar = new u(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = pVar.getPosition();
                } else if ((m10 & qs.P3) == 224) {
                    iVar = new k(null, "video/mp2p");
                    this.g = true;
                    this.h = pVar.getPosition();
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    iVar.g(this.j, new g0(i16, 256));
                    yVar = new y(iVar, this.a);
                    sparseArray.put(i16, yVar);
                }
            }
            if (pVar.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.U0();
            }
        }
        pVar.b(0, 2, xVar3.a);
        xVar3.N(0);
        int H = xVar3.H() + 6;
        if (yVar == null) {
            pVar.s(H);
            return 0;
        }
        xVar3.K(H);
        pVar.readFully(xVar3.a, 0, H);
        xVar3.N(6);
        i iVar2 = yVar.a;
        d4.f fVar = yVar.c;
        xVar3.k(0, 3, (byte[]) fVar.b);
        fVar.J(0);
        fVar.L(8);
        yVar.d = fVar.i();
        yVar.e = fVar.i();
        fVar.L(6);
        xVar3.k(0, fVar.j(8), (byte[]) fVar.b);
        fVar.J(0);
        k0 k0Var2 = yVar.b;
        yVar.g = 0L;
        if (yVar.d) {
            fVar.L(4);
            fVar.L(1);
            fVar.L(1);
            long j16 = (fVar.j(3) << 30) | (fVar.j(15) << 15) | fVar.j(15);
            fVar.L(1);
            if (yVar.f || !yVar.e) {
                j3 = j16;
            } else {
                fVar.L(4);
                fVar.L(1);
                fVar.L(1);
                fVar.L(1);
                k0Var2.b((fVar.j(15) << 15) | (fVar.j(3) << 30) | fVar.j(15));
                yVar.f = true;
                j3 = j16;
            }
            yVar.g = k0Var2.b(j3);
        }
        iVar2.f(4, yVar.g);
        iVar2.c(xVar3);
        iVar2.e(false);
        xVar3.M(xVar3.a.length);
        return 0;
    }

    @Override // f3.o
    public final f3.o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
