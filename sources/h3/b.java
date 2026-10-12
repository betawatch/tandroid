package h3;

import a4.g;
import b2.u0;
import b2.w;
import b2.w0;
import b2.x0;
import c3.b0;
import c3.i0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import c3.u;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import i2.d;
import java.util.Arrays;
import java.util.List;
import k6.h;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class b implements o {
    public q e;
    public i0 f;
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
        u0 r10 = new h(10).r(pVar, q3.h.b, 0);
        if (r10 != null) {
            int length = r10.a.length;
        }
        x xVar = new x(4);
        ((l) pVar).j(xVar.a, 0, 4, false);
        return xVar.C() == 1716281667;
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.e = qVar;
        this.f = qVar.a0(0, 1);
        qVar.D();
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
            pVar.q();
            long k10 = pVar.k();
            u0 r10 = new h(10).r(pVar, !this.c ? null : q3.h.b, 0);
            if (r10 != null && r10.a.length != 0) {
                u0Var = r10;
            }
            pVar.r((int) (pVar.k() - k10));
            this.h = u0Var;
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
            x xVar = new x(4);
            pVar.readFully(xVar.a, 0, 4);
            if (xVar.C() != 1716281667) {
                throw x0.a(null, "Failed to read FLAC stream marker.");
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
                pVar.q();
                byte[] bArr2 = new byte[i12];
                g gVar = new g(bArr2, i12);
                int i16 = i15;
                pVar.a(i16, i12, bArr2);
                boolean f7 = gVar.f();
                int g10 = gVar.g(r10);
                int g11 = gVar.g(24) + i12;
                if (g10 == 0) {
                    byte[] bArr3 = new byte[38];
                    pVar.readFully(bArr3, i16, 38);
                    uVar2 = new u(bArr3, i12);
                } else {
                    if (uVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    u0 u0Var2 = uVar2.l;
                    if (g10 == i13) {
                        x xVar2 = new x(g11);
                        pVar.readFully(xVar2.a, i16, g11);
                        uVar2 = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, c3.b.t(xVar2), uVar2.l);
                    } else {
                        if (g10 == i12) {
                            x xVar3 = new x(g11);
                            pVar.readFully(xVar3.a, 0, g11);
                            xVar3.O(i12);
                            u0 r11 = c3.b.r(Arrays.asList(c3.b.u(xVar3, false, false).a));
                            if (u0Var2 != null) {
                                r11 = u0Var2.b(r11);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, r11);
                        } else if (g10 == i14) {
                            x xVar4 = new x(g11);
                            pVar.readFully(xVar4.a, 0, g11);
                            xVar4.O(4);
                            u0 u0Var3 = new u0(n0.y(o3.a.d(xVar4)));
                            if (u0Var2 != null) {
                                u0Var3 = u0Var2.b(u0Var3);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, u0Var3);
                        } else {
                            pVar.r(g11);
                        }
                        uVar2 = uVar;
                    }
                }
                String str = m0.a;
                this.i = uVar2;
                z11 = f7;
                i12 = 4;
                i13 = 3;
                r10 = 7;
                i14 = 6;
                i15 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            b2.x c10 = this.i.c(bArr, this.h);
            i0 i0Var = this.f;
            w a2 = c10.a();
            a2.q = w0.n("audio/flac");
            d.s(a2, i0Var);
            this.f.e(this.i.b());
            this.g = 4;
            return 0;
        }
        long j13 = 0;
        if (i11 == 4) {
            pVar.q();
            x xVar5 = new x(2);
            pVar.a(0, 2, xVar5.a);
            int H = xVar5.H();
            if ((H >> 2) != 16382) {
                pVar.q();
                throw x0.a(null, "First frame does not start with sync code.");
            }
            pVar.q();
            this.k = H;
            q qVar = this.e;
            String str2 = m0.a;
            long position = pVar.getPosition();
            long length = pVar.getLength();
            this.i.getClass();
            u uVar3 = this.i;
            qf.b bVar = uVar3.k;
            if (bVar != null && ((long[]) bVar.b).length > 0) {
                tVar = new t(uVar3, position, 0);
                i10 = 0;
            } else if (length == -1 || uVar3.j <= 0) {
                i10 = 0;
                tVar = new t(uVar3.b());
            } else {
                int i17 = this.k;
                int i18 = uVar3.c;
                f1.a aVar = new f1.a(uVar3, 4);
                a5.a aVar2 = new a5.a(uVar3, i17);
                long b10 = uVar3.b();
                long j14 = uVar3.j;
                int i19 = uVar3.d;
                if (i19 > 0) {
                    i10 = 0;
                    j10 = ((i19 + i18) / 2) + 1;
                } else {
                    i10 = 0;
                    int i20 = uVar3.a;
                    j10 = 64 + (((((i20 != uVar3.b || i20 <= 0) ? 4096L : i20) * uVar3.g) * uVar3.h) / 8);
                }
                a aVar3 = new a(aVar, aVar2, b10, j14, position, length, j10, Math.max(6, i18));
                this.l = aVar3;
                tVar = aVar3.a;
            }
            qVar.K(tVar);
            this.g = 5;
            return i10;
        }
        if (i11 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        a aVar4 = this.l;
        if (aVar4 != null && aVar4.c != null) {
            return aVar4.b(pVar, sVar);
        }
        if (this.n == -1) {
            u uVar4 = this.i;
            pVar.q();
            pVar.l(1);
            byte[] bArr4 = new byte[1];
            pVar.a(0, 1, bArr4);
            boolean z12 = (bArr4[0] & 1) == 1;
            pVar.l(2);
            r10 = z12 ? 7 : 6;
            x xVar6 = new x(r10);
            byte[] bArr5 = xVar6.a;
            int i21 = 0;
            while (i21 < r10) {
                int f10 = pVar.f(i21, r10 - i21, bArr5);
                if (f10 == -1) {
                    break;
                }
                i21 += f10;
            }
            xVar6.M(i21);
            pVar.q();
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
                    throw x0.a(null, null);
                }
                this.n = j13;
            }
            r4 = false;
            if (r4) {
            }
        } else {
            x xVar7 = this.b;
            int i22 = xVar7.c;
            if (i22 < 32768) {
                int read = pVar.read(xVar7.a, i22, 32768 - i22);
                r4 = read == -1;
                if (!r4) {
                    xVar7.M(i22 + read);
                } else if (xVar7.a() == 0) {
                    long j15 = this.n * 1000000;
                    u uVar5 = this.i;
                    String str3 = m0.a;
                    this.f.c(j15 / uVar5.e, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r4 = false;
            }
            int i23 = xVar7.b;
            int i24 = this.m;
            int i25 = this.j;
            if (i24 < i25) {
                xVar7.O(Math.min(i25 - i24, xVar7.a()));
            }
            this.i.getClass();
            int i26 = xVar7.b;
            while (true) {
                int i27 = xVar7.c - 16;
                s sVar2 = this.d;
                if (i26 <= i27) {
                    xVar7.N(i26);
                    if (c3.b.a(xVar7, this.i, this.k, sVar2)) {
                        xVar7.N(i26);
                        j11 = sVar2.a;
                        break;
                    }
                    i26++;
                } else {
                    if (r4) {
                        while (true) {
                            int i28 = xVar7.c;
                            if (i26 > i28 - this.j) {
                                xVar7.N(i28);
                                break;
                            }
                            xVar7.N(i26);
                            try {
                                z10 = c3.b.a(xVar7, this.i, this.k, sVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (xVar7.b > xVar7.c) {
                                z10 = false;
                            }
                            if (z10) {
                                xVar7.N(i26);
                                j11 = sVar2.a;
                                break;
                            }
                            i26++;
                        }
                    } else {
                        xVar7.N(i26);
                    }
                    j11 = -1;
                }
            }
            int i29 = xVar7.b - i23;
            xVar7.N(i23);
            this.f.d(i29, xVar7);
            int i30 = this.m + i29;
            this.m = i30;
            if (j11 != -1) {
                long j16 = this.n * 1000000;
                u uVar6 = this.i;
                String str4 = m0.a;
                this.f.c(j16 / uVar6.e, 1, i30, 0, null);
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
