package h3;

import a4.g;
import b2.t0;
import b2.v;
import b2.v0;
import b2.w0;
import c3.a0;
import c3.e0;
import c3.l;
import c3.l0;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import c3.w;
import e1.c;
import e2.m0;
import e2.x;
import e9.n0;
import e9.x1;
import i2.o1;
import java.util.Arrays;
import java.util.List;
import q3.h;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class b implements q {
    public s e;
    public l0 f;
    public t0 h;
    public w i;
    public int j;
    public int k;
    public a l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final x b = new x(new byte[32768], 0);
    public final boolean c = false;
    public final u d = new u();
    public int g = 0;

    @Override // c3.q
    public final boolean a(r rVar) {
        t0 b10 = new a0(0).b(rVar, h.b, 0);
        if (b10 != null) {
            int length = b10.a.length;
        }
        x xVar = new x(4);
        ((l) rVar).j(xVar.a, 0, 4, false);
        return xVar.C() == 1716281667;
    }

    @Override // c3.q
    public final void c(s sVar) {
        this.e = sVar;
        this.f = sVar.j0(0, 1);
        sVar.C();
    }

    @Override // c3.q
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

    @Override // c3.q
    public final List e() {
        e9.l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    @Override // c3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(r rVar, u uVar) {
        w wVar;
        int i10;
        e0 vVar;
        long j10;
        long j11;
        boolean z10;
        long I;
        long j12;
        int i11 = this.g;
        t0 t0Var = null;
        if (i11 == 0) {
            rVar.q();
            long k10 = rVar.k();
            t0 b10 = new a0(0).b(rVar, !this.c ? null : h.b, 0);
            if (b10 != null && b10.a.length != 0) {
                t0Var = b10;
            }
            rVar.r((int) (rVar.k() - k10));
            this.h = t0Var;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i11 == 1) {
            rVar.a(0, bArr.length, bArr);
            rVar.q();
            this.g = 2;
            return 0;
        }
        int i12 = 4;
        int i13 = 3;
        if (i11 == 2) {
            x xVar = new x(4);
            rVar.readFully(xVar.a, 0, 4);
            if (xVar.C() != 1716281667) {
                throw w0.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i14 = 6;
        if (i11 == 3) {
            int i15 = 0;
            w wVar2 = this.i;
            boolean z11 = false;
            while (!z11) {
                rVar.q();
                byte[] bArr2 = new byte[i12];
                g gVar = new g(bArr2, i12);
                int i16 = i15;
                rVar.a(i16, i12, bArr2);
                boolean f7 = gVar.f();
                int g10 = gVar.g(r10);
                int g11 = gVar.g(24) + i12;
                if (g10 == 0) {
                    byte[] bArr3 = new byte[38];
                    rVar.readFully(bArr3, i16, 38);
                    wVar2 = new w(bArr3, i12);
                } else {
                    if (wVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    t0 t0Var2 = wVar2.l;
                    if (g10 == i13) {
                        x xVar2 = new x(g11);
                        rVar.readFully(xVar2.a, i16, g11);
                        wVar2 = new w(wVar2.a, wVar2.b, wVar2.c, wVar2.d, wVar2.e, wVar2.g, wVar2.h, wVar2.j, c3.b.t(xVar2), wVar2.l);
                    } else {
                        if (g10 == i12) {
                            x xVar3 = new x(g11);
                            rVar.readFully(xVar3.a, 0, g11);
                            xVar3.O(i12);
                            t0 r10 = c3.b.r(Arrays.asList(c3.b.u(xVar3, false, false).a));
                            if (t0Var2 != null) {
                                r10 = t0Var2.b(r10);
                            }
                            wVar = new w(wVar2.a, wVar2.b, wVar2.c, wVar2.d, wVar2.e, wVar2.g, wVar2.h, wVar2.j, wVar2.k, r10);
                        } else if (g10 == i14) {
                            x xVar4 = new x(g11);
                            rVar.readFully(xVar4.a, 0, g11);
                            xVar4.O(4);
                            t0 t0Var3 = new t0(n0.y(o3.a.d(xVar4)));
                            if (t0Var2 != null) {
                                t0Var3 = t0Var2.b(t0Var3);
                            }
                            wVar = new w(wVar2.a, wVar2.b, wVar2.c, wVar2.d, wVar2.e, wVar2.g, wVar2.h, wVar2.j, wVar2.k, t0Var3);
                        } else {
                            rVar.r(g11);
                        }
                        wVar2 = wVar;
                    }
                }
                String str = m0.a;
                this.i = wVar2;
                z11 = f7;
                i12 = 4;
                i13 = 3;
                r10 = 7;
                i14 = 6;
                i15 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            b2.w c10 = this.i.c(bArr, this.h);
            l0 l0Var = this.f;
            v a2 = c10.a();
            a2.q = v0.n("audio/flac");
            o1.v(a2, l0Var);
            this.f.e(this.i.b());
            this.g = 4;
            return 0;
        }
        long j13 = 0;
        if (i11 == 4) {
            rVar.q();
            x xVar5 = new x(2);
            rVar.a(0, 2, xVar5.a);
            int H = xVar5.H();
            if ((H >> 2) != 16382) {
                rVar.q();
                throw w0.a(null, "First frame does not start with sync code.");
            }
            rVar.q();
            this.k = H;
            s sVar = this.e;
            String str2 = m0.a;
            long position = rVar.getPosition();
            long length = rVar.getLength();
            this.i.getClass();
            w wVar3 = this.i;
            n4.s sVar2 = wVar3.k;
            if (sVar2 != null && ((long[]) sVar2.b).length > 0) {
                vVar = new c3.v(wVar3, position, 0);
                i10 = 0;
            } else if (length == -1 || wVar3.j <= 0) {
                i10 = 0;
                vVar = new c3.v(wVar3.b());
            } else {
                int i17 = this.k;
                int i18 = wVar3.c;
                c cVar = new c(wVar3, 13);
                a5.a aVar = new a5.a(wVar3, i17);
                long b11 = wVar3.b();
                long j14 = wVar3.j;
                int i19 = wVar3.d;
                if (i19 > 0) {
                    i10 = 0;
                    j10 = ((i19 + i18) / 2) + 1;
                } else {
                    i10 = 0;
                    int i20 = wVar3.a;
                    j10 = 64 + (((((i20 != wVar3.b || i20 <= 0) ? 4096L : i20) * wVar3.g) * wVar3.h) / 8);
                }
                a aVar2 = new a(cVar, aVar, b11, j14, position, length, j10, Math.max(6, i18));
                this.l = aVar2;
                vVar = aVar2.a;
            }
            sVar.g0(vVar);
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
            return aVar3.b(rVar, uVar);
        }
        if (this.n == -1) {
            w wVar4 = this.i;
            rVar.q();
            rVar.l(1);
            byte[] bArr4 = new byte[1];
            rVar.a(0, 1, bArr4);
            boolean z12 = (bArr4[0] & 1) == 1;
            rVar.l(2);
            r10 = z12 ? 7 : 6;
            x xVar6 = new x(r10);
            byte[] bArr5 = xVar6.a;
            int i21 = 0;
            while (i21 < r10) {
                int h = rVar.h(i21, r10 - i21, bArr5);
                if (h == -1) {
                    break;
                }
                i21 += h;
            }
            xVar6.M(i21);
            rVar.q();
            try {
                I = xVar6.I();
                if (!z12) {
                    I *= wVar4.b;
                }
                j12 = wVar4.j;
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
            int i22 = xVar7.c;
            if (i22 < 32768) {
                int read = rVar.read(xVar7.a, i22, 32768 - i22);
                r4 = read == -1;
                if (!r4) {
                    xVar7.M(i22 + read);
                } else if (xVar7.a() == 0) {
                    long j15 = this.n * 1000000;
                    w wVar5 = this.i;
                    String str3 = m0.a;
                    this.f.c(j15 / wVar5.e, 1, this.m, 0, null);
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
                u uVar2 = this.d;
                if (i26 <= i27) {
                    xVar7.N(i26);
                    if (c3.b.a(xVar7, this.i, this.k, uVar2)) {
                        xVar7.N(i26);
                        j11 = uVar2.a;
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
                                z10 = c3.b.a(xVar7, this.i, this.k, uVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (xVar7.b > xVar7.c) {
                                z10 = false;
                            }
                            if (z10) {
                                xVar7.N(i26);
                                j11 = uVar2.a;
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
                w wVar6 = this.i;
                String str4 = m0.a;
                this.f.c(j16 / wVar6.e, 1, i30, 0, null);
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

    @Override // c3.q
    public final q b() {
        return this;
    }

    @Override // c3.q
    public final void release() {
    }
}
