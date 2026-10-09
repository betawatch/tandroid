package h3;

import a4.g;
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
import ei.c5;
import hg.c;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    public final boolean a(p pVar) {
        c3.b.s(pVar, false);
        v vVar = new v(4);
        ((l) pVar).h(vVar.a, 0, 4, false);
        return vVar.z() == 1716281667;
    }

    @Override // c3.o
    public final void g(q qVar) {
        this.e = qVar;
        this.f = qVar.f2(0, 1);
        qVar.k1();
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
            long j11 = pVar.j();
            p0 s10 = c3.b.s(pVar, z11);
            pVar.r((int) (pVar.j() - j11));
            this.h = s10;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i11 == 1) {
            pVar.a(0, bArr.length, bArr);
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
            int i15 = 0;
            u uVar2 = this.i;
            boolean z12 = false;
            while (!z12) {
                pVar.q();
                byte[] bArr2 = new byte[i12];
                g gVar = new g(bArr2, i12);
                int i16 = i15;
                pVar.a(i16, i12, bArr2);
                boolean h = gVar.h();
                int i17 = gVar.i(r10);
                int i18 = gVar.i(24) + i12;
                if (i17 == 0) {
                    byte[] bArr3 = new byte[38];
                    pVar.readFully(bArr3, i16, 38);
                    uVar2 = new u(bArr3, i12);
                } else {
                    if (uVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    p0 p0Var = uVar2.l;
                    if (i17 == i13) {
                        v vVar2 = new v(i18);
                        pVar.readFully(vVar2.a, i16, i18);
                        uVar2 = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, c3.b.u(vVar2), uVar2.l);
                    } else {
                        if (i17 == i12) {
                            v vVar3 = new v(i18);
                            pVar.readFully(vVar3.a, 0, i18);
                            vVar3.K(i12);
                            p0 r10 = c3.b.r(Arrays.asList((String[]) c3.b.v(vVar3, false, false).b));
                            if (p0Var != null) {
                                r10 = p0Var.b(r10);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, r10);
                        } else if (i17 == i14) {
                            v vVar4 = new v(i18);
                            pVar.readFully(vVar4.a, 0, i18);
                            vVar4.K(4);
                            p0 p0Var2 = new p0(i0.z(o3.a.d(vVar4)));
                            if (p0Var != null) {
                                p0Var2 = p0Var.b(p0Var2);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, p0Var2);
                        } else {
                            pVar.r(i18);
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
                i15 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            b2.s c10 = this.i.c(bArr, this.h);
            h0 h0Var = this.f;
            r a2 = c10.a();
            a2.p = r0.n("audio/flac");
            c.s(a2, h0Var);
            h0 h0Var2 = this.f;
            this.i.b();
            h0Var2.getClass();
            this.g = 4;
            return 0;
        }
        long j12 = 0;
        if (i11 == 4) {
            pVar.q();
            v vVar5 = new v(2);
            pVar.a(0, 2, vVar5.a);
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
                int i19 = this.k;
                int i20 = uVar3.c;
                c5 c5Var = new c5(uVar3, 2);
                a5.a aVar = new a5.a(uVar3, i19);
                long b10 = uVar3.b();
                long j13 = uVar3.j;
                int i21 = uVar3.d;
                if (i21 > 0) {
                    i10 = 0;
                    j3 = ((i21 + i20) / 2) + 1;
                } else {
                    i10 = 0;
                    int i22 = uVar3.a;
                    j3 = 64 + (((((i22 != uVar3.b || i22 <= 0) ? 4096L : i22) * uVar3.g) * uVar3.h) / 8);
                }
                a aVar2 = new a(c5Var, aVar, b10, j13, position, length, j3, Math.max(6, i20));
                this.l = aVar2;
                tVar = aVar2.a;
            }
            qVar.d2(tVar);
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
            pVar.a(0, 1, bArr4);
            boolean z13 = (bArr4[0] & 1) == 1;
            pVar.l(2);
            r10 = z13 ? 7 : 6;
            v vVar6 = new v(r10);
            byte[] bArr5 = vVar6.a;
            int i23 = 0;
            while (i23 < r10) {
                int e7 = pVar.e(i23, r10 - i23, bArr5);
                if (e7 == -1) {
                    break;
                }
                i23 += e7;
            }
            vVar6.I(i23);
            pVar.q();
            try {
                long E = vVar6.E();
                if (!z13) {
                    E *= uVar4.b;
                }
                j12 = E;
            } catch (NumberFormatException unused) {
                r3 = false;
            }
            if (!r3) {
                throw s0.a(null, null);
            }
            this.n = j12;
        } else {
            v vVar7 = this.b;
            int i24 = vVar7.c;
            if (i24 < 32768) {
                int read = pVar.read(vVar7.a, i24, 32768 - i24);
                r3 = read == -1;
                if (!r3) {
                    vVar7.I(i24 + read);
                } else if (vVar7.a() == 0) {
                    long j14 = this.n * 1000000;
                    u uVar5 = this.i;
                    String str3 = d0.a;
                    this.f.c(j14 / uVar5.e, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r3 = false;
            }
            int i25 = vVar7.b;
            int i26 = this.m;
            int i27 = this.j;
            if (i26 < i27) {
                vVar7.K(Math.min(i27 - i26, vVar7.a()));
            }
            this.i.getClass();
            int i28 = vVar7.b;
            while (true) {
                int i29 = vVar7.c - 16;
                s sVar2 = this.d;
                if (i28 <= i29) {
                    vVar7.J(i28);
                    if (c3.b.b(vVar7, this.i, this.k, sVar2)) {
                        vVar7.J(i28);
                        j10 = sVar2.a;
                        break;
                    }
                    i28++;
                } else {
                    if (r3) {
                        while (true) {
                            int i30 = vVar7.c;
                            if (i28 > i30 - this.j) {
                                vVar7.J(i30);
                                break;
                            }
                            vVar7.J(i28);
                            try {
                                z10 = c3.b.b(vVar7, this.i, this.k, sVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (vVar7.b > vVar7.c) {
                                z10 = false;
                            }
                            if (z10) {
                                vVar7.J(i28);
                                j10 = sVar2.a;
                                break;
                            }
                            i28++;
                        }
                    } else {
                        vVar7.J(i28);
                    }
                    j10 = -1;
                }
            }
            int i31 = vVar7.b - i25;
            vVar7.J(i25);
            this.f.d(i31, vVar7);
            int i32 = this.m + i31;
            this.m = i32;
            if (j10 != -1) {
                long j15 = this.n * 1000000;
                u uVar6 = this.i;
                String str4 = d0.a;
                this.f.c(j15 / uVar6.e, 1, i32, 0, null);
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
