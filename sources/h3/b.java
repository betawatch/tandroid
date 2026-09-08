package h3;

import a4.h;
import b2.p0;
import b2.r;
import b2.r0;
import b2.s0;
import c3.b0;
import c3.h0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import c3.u;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import fi.f;
import i2.g;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b implements o {
    public q e;
    public h0 f;
    public p0 h;
    public u i;
    public int j;
    public int k;
    public a l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final v b = new v(new byte[32768], 0);
    public final boolean c = false;
    public final s d = new s();
    public int g = 0;

    @Override // c3.o
    public final boolean b(p pVar) {
        c3.b.s(pVar, false);
        v vVar = new v(4);
        ((l) pVar).j(vVar.a, 0, 4, false);
        return vVar.z() == 1716281667;
    }

    @Override // c3.o
    public final void g(q qVar) {
        this.e = qVar;
        this.f = qVar.R1(0, 1);
        qVar.Z0();
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.g = 0;
        } else {
            a aVar = this.l;
            if (aVar != null) {
                aVar.d(j10);
            }
        }
        this.n = j10 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.G(0);
    }

    @Override // c3.o
    public final List i() {
        g0 g0Var = i0.b;
        return a1.e;
    }

    @Override // c3.o
    public final int m(p pVar, s sVar) {
        u uVar;
        int i10;
        b0 tVar;
        long j3;
        long j10;
        boolean z10;
        int i11 = this.g;
        if (i11 == 0) {
            boolean z11 = !this.c;
            pVar.q();
            long k10 = pVar.k();
            p0 s10 = c3.b.s(pVar, z11);
            pVar.r((int) (pVar.k() - k10));
            this.h = s10;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i11 == 1) {
            pVar.b(0, bArr.length, bArr);
            pVar.q();
            this.g = 2;
            return 0;
        }
        int i12 = 4;
        int i13 = 3;
        if (i11 == 2) {
            v vVar = new v(4);
            pVar.readFully(vVar.a, 0, 4);
            if (vVar.z() != 1716281667) {
                throw s0.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i14 = 6;
        if (i11 == 3) {
            u uVar2 = this.i;
            boolean z12 = false;
            while (!z12) {
                pVar.q();
                byte[] bArr2 = new byte[i12];
                h hVar = new h(bArr2, i12);
                pVar.b(0, i12, bArr2);
                boolean h = hVar.h();
                int i15 = hVar.i(r10);
                int i16 = hVar.i(24) + i12;
                if (i15 == 0) {
                    byte[] bArr3 = new byte[38];
                    pVar.readFully(bArr3, 0, 38);
                    uVar2 = new u(bArr3, i12);
                } else {
                    if (uVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    p0 p0Var = uVar2.l;
                    if (i15 == i13) {
                        v vVar2 = new v(i16);
                        pVar.readFully(vVar2.a, 0, i16);
                        uVar2 = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, c3.b.u(vVar2), uVar2.l);
                    } else {
                        if (i15 == i12) {
                            v vVar3 = new v(i16);
                            pVar.readFully(vVar3.a, 0, i16);
                            vVar3.K(i12);
                            p0 r10 = c3.b.r(Arrays.asList(c3.b.v(vVar3, false, false).a));
                            if (p0Var != null) {
                                r10 = p0Var.b(r10);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, r10);
                        } else if (i15 == i14) {
                            v vVar4 = new v(i16);
                            pVar.readFully(vVar4.a, 0, i16);
                            vVar4.K(4);
                            p0 p0Var2 = new p0(i0.z(o3.a.d(vVar4)));
                            if (p0Var != null) {
                                p0Var2 = p0Var.b(p0Var2);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, p0Var2);
                        } else {
                            pVar.r(i16);
                        }
                        uVar2 = uVar;
                    }
                }
                String str = d0.a;
                this.i = uVar2;
                z12 = h;
                i12 = 4;
                i13 = 3;
                r10 = 7;
                i14 = 6;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            b2.s c10 = this.i.c(bArr, this.h);
            h0 h0Var = this.f;
            r a2 = c10.a();
            a2.p = r0.n("audio/flac");
            g.u(a2, h0Var);
            h0 h0Var2 = this.f;
            this.i.b();
            h0Var2.getClass();
            this.g = 4;
            return 0;
        }
        long j11 = 0;
        if (i11 == 4) {
            pVar.q();
            v vVar5 = new v(2);
            pVar.b(0, 2, vVar5.a);
            int D = vVar5.D();
            if ((D >> 2) != 16382) {
                pVar.q();
                throw s0.a(null, "First frame does not start with sync code.");
            }
            pVar.q();
            this.k = D;
            q qVar = this.e;
            String str2 = d0.a;
            long position = pVar.getPosition();
            long length = pVar.getLength();
            this.i.getClass();
            u uVar3 = this.i;
            pf.b bVar = uVar3.k;
            if (bVar != null && ((long[]) bVar.b).length > 0) {
                tVar = new t(uVar3, position, 0);
                i10 = 0;
            } else if (length == -1 || uVar3.j <= 0) {
                i10 = 0;
                tVar = new t(uVar3.b());
            } else {
                int i17 = this.k;
                int i18 = uVar3.c;
                f fVar = new f(uVar3, 3);
                a5.a aVar = new a5.a(uVar3, i17);
                long b10 = uVar3.b();
                long j12 = uVar3.j;
                int i19 = uVar3.d;
                if (i19 > 0) {
                    i10 = 0;
                    j3 = ((i19 + i18) / 2) + 1;
                } else {
                    i10 = 0;
                    int i20 = uVar3.a;
                    j3 = 64 + (((((i20 != uVar3.b || i20 <= 0) ? 4096L : i20) * uVar3.g) * uVar3.h) / 8);
                }
                a aVar2 = new a(fVar, aVar, b10, j12, position, length, j3, Math.max(6, i18));
                this.l = aVar2;
                tVar = aVar2.a;
            }
            qVar.P1(tVar);
            this.g = 5;
            return i10;
        }
        if (i11 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        a aVar3 = this.l;
        if (aVar3 != null && aVar3.c != null) {
            return aVar3.b(pVar, sVar);
        }
        if (this.n == -1) {
            u uVar4 = this.i;
            pVar.q();
            pVar.l(1);
            byte[] bArr4 = new byte[1];
            pVar.b(0, 1, bArr4);
            boolean z13 = (bArr4[0] & 1) == 1;
            pVar.l(2);
            r10 = z13 ? 7 : 6;
            v vVar6 = new v(r10);
            byte[] bArr5 = vVar6.a;
            int i21 = 0;
            while (i21 < r10) {
                int h10 = pVar.h(i21, r10 - i21, bArr5);
                if (h10 == -1) {
                    break;
                }
                i21 += h10;
            }
            vVar6.I(i21);
            pVar.q();
            try {
                long E = vVar6.E();
                if (!z13) {
                    E *= uVar4.b;
                }
                j11 = E;
            } catch (NumberFormatException unused) {
                r3 = false;
            }
            if (!r3) {
                throw s0.a(null, null);
            }
            this.n = j11;
        } else {
            v vVar7 = this.b;
            int i22 = vVar7.c;
            if (i22 < 32768) {
                int read = pVar.read(vVar7.a, i22, 32768 - i22);
                r3 = read == -1;
                if (!r3) {
                    vVar7.I(i22 + read);
                } else if (vVar7.a() == 0) {
                    long j13 = this.n * 1000000;
                    u uVar5 = this.i;
                    String str3 = d0.a;
                    this.f.c(j13 / uVar5.e, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i23 = vVar7.b;
            int i24 = this.m;
            int i25 = this.j;
            if (i24 < i25) {
                vVar7.K(Math.min(i25 - i24, vVar7.a()));
            }
            this.i.getClass();
            int i26 = vVar7.b;
            while (true) {
                int i27 = vVar7.c - 16;
                s sVar2 = this.d;
                if (i26 <= i27) {
                    vVar7.J(i26);
                    if (c3.b.b(vVar7, this.i, this.k, sVar2)) {
                        vVar7.J(i26);
                        j10 = sVar2.a;
                        break;
                    }
                    i26++;
                } else {
                    if (r3) {
                        while (true) {
                            int i28 = vVar7.c;
                            if (i26 > i28 - this.j) {
                                vVar7.J(i28);
                                break;
                            }
                            vVar7.J(i26);
                            try {
                                z10 = c3.b.b(vVar7, this.i, this.k, sVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (vVar7.b > vVar7.c) {
                                z10 = false;
                            }
                            if (z10) {
                                vVar7.J(i26);
                                j10 = sVar2.a;
                                break;
                            }
                            i26++;
                        }
                    } else {
                        vVar7.J(i26);
                    }
                    j10 = -1;
                }
            }
            int i29 = vVar7.b - i23;
            vVar7.J(i23);
            this.f.d(i29, vVar7);
            int i30 = this.m + i29;
            this.m = i30;
            if (j10 != -1) {
                long j14 = this.n * 1000000;
                u uVar6 = this.i;
                String str4 = d0.a;
                this.f.c(j14 / uVar6.e, 1, i30, 0, null);
                this.m = 0;
                this.n = j10;
            }
            int length2 = vVar7.a.length - vVar7.c;
            if (vVar7.a() < 16 && length2 < 16) {
                int a10 = vVar7.a();
                byte[] bArr6 = vVar7.a;
                System.arraycopy(bArr6, vVar7.b, bArr6, 0, a10);
                vVar7.J(0);
                vVar7.I(a10);
            }
        }
        return 0;
    }

    @Override // c3.o
    public final o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
