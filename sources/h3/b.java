package h3;

import a1.c;
import a4.g;
import a6.i;
import b2.u0;
import b2.v0;
import b2.w;
import b2.w0;
import c3.b0;
import c3.k0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import c3.u;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements o {
    public q e;
    public k0 f;
    public u0 h;
    public u i;
    public int j;
    public int k;
    public a l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final x b = new x(new byte[32768], 0);
    public final boolean c = false;
    public final s d = new s();
    public int g = 0;

    @Override // c3.o
    public final boolean a(p pVar) {
        u0 m0 = new i(12).m0(pVar, q3.i.b, 0);
        if (m0 != null) {
            int length = m0.a.length;
        }
        x xVar = new x(4);
        ((l) pVar).j(xVar.a, 0, 4, false);
        return xVar.C() == 1716281667;
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.e = qVar;
        this.f = qVar.I1(0, 1);
        qVar.Q0();
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.g = 0;
        } else {
            a aVar = this.l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        this.n = j11 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.K(0);
    }

    @Override // c3.o
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        u uVar;
        int i10;
        b0 tVar;
        long j10;
        long j11;
        boolean z10;
        long I;
        long j12;
        int i11 = this.g;
        u0 u0Var = null;
        if (i11 == 0) {
            pVar.m();
            long k10 = pVar.k();
            u0 m0 = new i(12).m0(pVar, !this.c ? null : q3.i.b, 0);
            if (m0 != null && m0.a.length != 0) {
                u0Var = m0;
            }
            pVar.q((int) (pVar.k() - k10));
            this.h = u0Var;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i11 == 1) {
            pVar.b(0, bArr.length, bArr);
            pVar.m();
            this.g = 2;
            return 0;
        }
        int i12 = 4;
        int i13 = 3;
        if (i11 == 2) {
            x xVar = new x(4);
            pVar.readFully(xVar.a, 0, 4);
            if (xVar.C() != 1716281667) {
                throw w0.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i14 = 6;
        if (i11 == 3) {
            int i15 = 0;
            u uVar2 = this.i;
            boolean z11 = false;
            while (!z11) {
                pVar.m();
                byte[] bArr2 = new byte[i12];
                g gVar = new g(bArr2, i12);
                int i16 = i15;
                pVar.b(i16, i12, bArr2);
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
                    u0 u0Var2 = uVar2.l;
                    if (i17 == i13) {
                        x xVar2 = new x(i18);
                        pVar.readFully(xVar2.a, i16, i18);
                        uVar2 = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, c3.b.t(xVar2), uVar2.l);
                    } else {
                        if (i17 == i12) {
                            x xVar3 = new x(i18);
                            pVar.readFully(xVar3.a, 0, i18);
                            xVar3.O(i12);
                            u0 r10 = c3.b.r(Arrays.asList((String[]) c3.b.u(xVar3, false, false).b));
                            if (u0Var2 != null) {
                                r10 = u0Var2.b(r10);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, r10);
                        } else if (i17 == i14) {
                            x xVar4 = new x(i18);
                            pVar.readFully(xVar4.a, 0, i18);
                            xVar4.O(4);
                            u0 u0Var3 = new u0(n0.y(o3.a.d(xVar4)));
                            if (u0Var2 != null) {
                                u0Var3 = u0Var2.b(u0Var3);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, u0Var3);
                        } else {
                            pVar.q(i18);
                        }
                        uVar2 = uVar;
                    }
                }
                String str = e2.l0.a;
                this.i = uVar2;
                z11 = h;
                i12 = 4;
                i13 = 3;
                r10 = 7;
                i14 = 6;
                i15 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            b2.x c10 = this.i.c(bArr, this.h);
            k0 k0Var = this.f;
            w a2 = c10.a();
            a2.q = v0.n("audio/flac");
            i0.a.r(a2, k0Var);
            this.f.e(this.i.b());
            this.g = 4;
            return 0;
        }
        long j13 = 0;
        if (i11 == 4) {
            pVar.m();
            x xVar5 = new x(2);
            pVar.b(0, 2, xVar5.a);
            int H = xVar5.H();
            if ((H >> 2) != 16382) {
                pVar.m();
                throw w0.a(null, "First frame does not start with sync code.");
            }
            pVar.m();
            this.k = H;
            q qVar = this.e;
            String str2 = e2.l0.a;
            long position = pVar.getPosition();
            long length = pVar.getLength();
            this.i.getClass();
            u uVar3 = this.i;
            hf.b bVar = uVar3.k;
            if (bVar != null && ((long[]) bVar.b).length > 0) {
                tVar = new t(uVar3, position, 0);
                i10 = 0;
            } else if (length == -1 || uVar3.j <= 0) {
                i10 = 0;
                tVar = new t(uVar3.b());
            } else {
                int i19 = this.k;
                int i20 = uVar3.c;
                c cVar = new c(uVar3, 23);
                a5.a aVar = new a5.a(uVar3, i19);
                long b10 = uVar3.b();
                long j14 = uVar3.j;
                int i21 = uVar3.d;
                if (i21 > 0) {
                    i10 = 0;
                    j10 = ((i21 + i20) / 2) + 1;
                } else {
                    i10 = 0;
                    int i22 = uVar3.a;
                    j10 = 64 + (((((i22 != uVar3.b || i22 <= 0) ? 4096L : i22) * uVar3.g) * uVar3.h) / 8);
                }
                a aVar2 = new a(cVar, aVar, b10, j14, position, length, j10, Math.max(6, i20));
                this.l = aVar2;
                tVar = aVar2.a;
            }
            qVar.G1(tVar);
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
            pVar.m();
            pVar.l(1);
            byte[] bArr4 = new byte[1];
            pVar.b(0, 1, bArr4);
            boolean z12 = (bArr4[0] & 1) == 1;
            pVar.l(2);
            r10 = z12 ? 7 : 6;
            x xVar6 = new x(r10);
            byte[] bArr5 = xVar6.a;
            int i23 = 0;
            while (i23 < r10) {
                int h10 = pVar.h(i23, r10 - i23, bArr5);
                if (h10 == -1) {
                    break;
                }
                i23 += h10;
            }
            xVar6.M(i23);
            pVar.m();
            try {
                I = xVar6.I();
                if (!z12) {
                    I *= uVar4.b;
                }
                j12 = uVar4.j;
            } catch (NumberFormatException unused) {
            }
            if (j12 == 0 || I <= j12) {
                j13 = I;
                if (r4) {
                    throw w0.a(null, null);
                }
                this.n = j13;
            }
            r4 = false;
            if (r4) {
            }
        } else {
            x xVar7 = this.b;
            int i24 = xVar7.c;
            if (i24 < 32768) {
                int read = pVar.read(xVar7.a, i24, 32768 - i24);
                r4 = read == -1;
                if (!r4) {
                    xVar7.M(i24 + read);
                } else if (xVar7.a() == 0) {
                    long j15 = this.n * 1000000;
                    u uVar5 = this.i;
                    String str3 = e2.l0.a;
                    this.f.c(j15 / uVar5.e, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r4 = false;
            }
            int i25 = xVar7.b;
            int i26 = this.m;
            int i27 = this.j;
            if (i26 < i27) {
                xVar7.O(Math.min(i27 - i26, xVar7.a()));
            }
            this.i.getClass();
            int i28 = xVar7.b;
            while (true) {
                int i29 = xVar7.c - 16;
                s sVar2 = this.d;
                if (i28 <= i29) {
                    xVar7.N(i28);
                    if (c3.b.a(xVar7, this.i, this.k, sVar2)) {
                        xVar7.N(i28);
                        j11 = sVar2.a;
                        break;
                    }
                    i28++;
                } else {
                    if (r4) {
                        while (true) {
                            int i30 = xVar7.c;
                            if (i28 > i30 - this.j) {
                                xVar7.N(i30);
                                break;
                            }
                            xVar7.N(i28);
                            try {
                                z10 = c3.b.a(xVar7, this.i, this.k, sVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (xVar7.b > xVar7.c) {
                                z10 = false;
                            }
                            if (z10) {
                                xVar7.N(i28);
                                j11 = sVar2.a;
                                break;
                            }
                            i28++;
                        }
                    } else {
                        xVar7.N(i28);
                    }
                    j11 = -1;
                }
            }
            int i31 = xVar7.b - i25;
            xVar7.N(i25);
            this.f.d(i31, xVar7);
            int i32 = this.m + i31;
            this.m = i32;
            if (j11 != -1) {
                long j16 = this.n * 1000000;
                u uVar6 = this.i;
                String str4 = e2.l0.a;
                this.f.c(j16 / uVar6.e, 1, i32, 0, null);
                this.m = 0;
                this.n = j11;
            }
            int length2 = xVar7.a.length - xVar7.c;
            if (xVar7.a() < 16 && length2 < 16) {
                int a10 = xVar7.a();
                byte[] bArr6 = xVar7.a;
                System.arraycopy(bArr6, xVar7.b, bArr6, 0, a10);
                xVar7.N(0);
                xVar7.M(a10);
            }
        }
        return 0;
    }

    @Override // c3.o
    public final o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
