package k3;

import a8.xa;
import d4.f;
import d6.i;
import di.z6;
import e2.q0;
import e2.s0;
import e2.t;
import e2.t0;
import f3.b0;
import f3.i0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.u;
import h2.l0;
import h2.x;
import h9.g0;
import h9.s1;
import java.util.Arrays;
import java.util.List;
import t3.h;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b implements o {
    public q e;
    public i0 f;
    public q0 h;
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

    @Override // f3.o
    public final boolean b(p pVar) {
        q0 U = new i().U(pVar, h.b, 0);
        if (U != null) {
            int length = U.a.length;
        }
        x xVar = new x(4);
        ((l) pVar).h(xVar.a, 0, 4, false);
        return xVar.C() == 1716281667;
    }

    @Override // f3.o
    public final void c(q qVar) {
        this.e = qVar;
        this.f = qVar.d2(0, 1);
        qVar.d1();
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
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
        this.b.K(0);
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = h9.i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        u uVar;
        int i7;
        b0 tVar;
        long j3;
        long j10;
        long j11;
        long j12;
        boolean z10;
        long I;
        long j13;
        int i10 = this.g;
        q0 q0Var = null;
        if (i10 == 0) {
            pVar.l();
            long j14 = pVar.j();
            q0 U = new i().U(pVar, !this.c ? null : h.b, 0);
            if (U != null && U.a.length != 0) {
                q0Var = U;
            }
            pVar.m((int) (pVar.j() - j14));
            this.h = q0Var;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i10 == 1) {
            pVar.c(0, bArr.length, bArr);
            pVar.l();
            this.g = 2;
            return 0;
        }
        if (i10 == 2) {
            x xVar = new x(4);
            pVar.readFully(xVar.a, 0, 4);
            if (xVar.C() != 1716281667) {
                throw t0.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i11 = 24;
        if (i10 == 3) {
            int i12 = 0;
            u uVar2 = this.i;
            boolean z11 = false;
            while (!z11) {
                pVar.l();
                byte[] bArr2 = new byte[4];
                f fVar = new f(bArr2, 4);
                int i13 = i12;
                pVar.c(i13, 4, bArr2);
                boolean i14 = fVar.i();
                int j15 = fVar.j(r11);
                int j16 = fVar.j(i11) + 4;
                if (j15 == 0) {
                    byte[] bArr3 = new byte[38];
                    pVar.readFully(bArr3, i13, 38);
                    uVar2 = new u(bArr3, 4);
                } else {
                    if (uVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    q0 q0Var2 = uVar2.l;
                    if (j15 == 3) {
                        x xVar2 = new x(j16);
                        pVar.readFully(xVar2.a, i13, j16);
                        uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, f3.b.t(xVar2), uVar2.l);
                    } else if (j15 == 4) {
                        x xVar3 = new x(j16);
                        pVar.readFully(xVar3.a, 0, j16);
                        xVar3.O(4);
                        q0 r10 = f3.b.r(Arrays.asList(f3.b.u(xVar3, false, false).a));
                        if (q0Var2 != null) {
                            r10 = q0Var2.b(r10);
                        }
                        uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, r10);
                    } else if (j15 == 6) {
                        x xVar4 = new x(j16);
                        pVar.readFully(xVar4.a, 0, j16);
                        xVar4.O(4);
                        q0 q0Var3 = new q0(h9.i0.u(r3.a.d(xVar4)));
                        if (q0Var2 != null) {
                            q0Var3 = q0Var2.b(q0Var3);
                        }
                        uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, q0Var3);
                    } else {
                        pVar.m(j16);
                    }
                    uVar2 = uVar;
                }
                String str = l0.a;
                this.i = uVar2;
                z11 = i14;
                i11 = 24;
                r11 = 7;
                i12 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            e2.u c10 = this.i.c(bArr, this.h);
            i0 i0Var = this.f;
            t a10 = c10.a();
            a10.q = s0.n("audio/flac");
            r.b.s(a10, i0Var);
            this.f.d(this.i.b());
            this.g = 4;
            return 0;
        }
        long j17 = 0;
        if (i10 == 4) {
            pVar.l();
            x xVar5 = new x(2);
            pVar.c(0, 2, xVar5.a);
            int H = xVar5.H();
            if ((H >> 2) != 16382) {
                pVar.l();
                throw t0.a(null, "First frame does not start with sync code.");
            }
            pVar.l();
            this.k = H;
            q qVar = this.e;
            String str2 = l0.a;
            long position = pVar.getPosition();
            long length = pVar.getLength();
            this.i.getClass();
            u uVar3 = this.i;
            wf.b bVar = uVar3.k;
            if (bVar != null && ((long[]) bVar.b).length > 0) {
                tVar = new f3.t(uVar3, position, 0);
                i7 = 0;
            } else if (length == -1 || uVar3.j <= 0) {
                i7 = 0;
                tVar = new f3.t(uVar3.b());
            } else {
                int i15 = this.k;
                int i16 = uVar3.c;
                z6 z6Var = new z6(uVar3, i11);
                xa xaVar = new xa(uVar3, i15);
                long b10 = uVar3.b();
                long j18 = uVar3.j;
                int i17 = uVar3.d;
                if (i17 > 0) {
                    i7 = 0;
                    j3 = j18;
                    j10 = (i17 + i16) / 2;
                    j11 = 1;
                } else {
                    i7 = 0;
                    j3 = j18;
                    int i18 = uVar3.a;
                    j10 = ((((i18 != uVar3.b || i18 <= 0) ? 4096L : i18) * uVar3.g) * uVar3.h) / 8;
                    j11 = 64;
                }
                a aVar = new a(z6Var, xaVar, b10, j3, position, length, j10 + j11, Math.max(6, i16));
                this.l = aVar;
                tVar = aVar.a;
            }
            qVar.f(tVar);
            this.g = 5;
            return i7;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        a aVar2 = this.l;
        if (aVar2 != null && aVar2.c != null) {
            return aVar2.b(pVar, sVar);
        }
        if (this.n == -1) {
            u uVar4 = this.i;
            pVar.l();
            pVar.k(1);
            byte[] bArr4 = new byte[1];
            pVar.c(0, 1, bArr4);
            boolean z12 = (bArr4[0] & 1) == 1;
            pVar.k(2);
            r11 = z12 ? 7 : 6;
            x xVar6 = new x(r11);
            byte[] bArr5 = xVar6.a;
            int i19 = 0;
            while (i19 < r11) {
                int e10 = pVar.e(i19, r11 - i19, bArr5);
                if (e10 == -1) {
                    break;
                }
                i19 += e10;
            }
            xVar6.M(i19);
            pVar.l();
            try {
                I = xVar6.I();
                if (!z12) {
                    I *= uVar4.b;
                }
                j13 = uVar4.j;
            } catch (NumberFormatException unused) {
            }
            if (j13 == 0 || I <= j13) {
                j17 = I;
                if (r4) {
                    throw t0.a(null, null);
                }
                this.n = j17;
            }
            r4 = false;
            if (r4) {
            }
        } else {
            x xVar7 = this.b;
            int i20 = xVar7.c;
            if (i20 < 32768) {
                int read = pVar.read(xVar7.a, i20, 32768 - i20);
                r4 = read == -1;
                if (!r4) {
                    xVar7.M(i20 + read);
                } else if (xVar7.a() == 0) {
                    long j19 = this.n * 1000000;
                    u uVar5 = this.i;
                    String str3 = l0.a;
                    this.f.c(j19 / uVar5.e, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r4 = false;
            }
            int i21 = xVar7.b;
            int i22 = this.m;
            int i23 = this.j;
            if (i22 < i23) {
                xVar7.O(Math.min(i23 - i22, xVar7.a()));
            }
            this.i.getClass();
            int i24 = xVar7.b;
            while (true) {
                int i25 = xVar7.c - 16;
                s sVar2 = this.d;
                if (i24 <= i25) {
                    xVar7.N(i24);
                    if (f3.b.a(xVar7, this.i, this.k, sVar2)) {
                        xVar7.N(i24);
                        j12 = sVar2.a;
                        break;
                    }
                    i24++;
                } else {
                    if (r4) {
                        while (true) {
                            int i26 = xVar7.c;
                            if (i24 > i26 - this.j) {
                                xVar7.N(i26);
                                break;
                            }
                            xVar7.N(i24);
                            try {
                                z10 = f3.b.a(xVar7, this.i, this.k, sVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (xVar7.b > xVar7.c) {
                                z10 = false;
                            }
                            if (z10) {
                                xVar7.N(i24);
                                j12 = sVar2.a;
                                break;
                            }
                            i24++;
                        }
                    } else {
                        xVar7.N(i24);
                    }
                    j12 = -1;
                }
            }
            int i27 = xVar7.b - i21;
            xVar7.N(i21);
            this.f.b(i27, xVar7);
            int i28 = this.m + i27;
            this.m = i28;
            if (j12 != -1) {
                long j20 = this.n * 1000000;
                u uVar6 = this.i;
                String str4 = l0.a;
                this.f.c(j20 / uVar6.e, 1, i28, 0, null);
                this.m = 0;
                this.n = j12;
            }
            int length2 = xVar7.a.length - xVar7.c;
            if (xVar7.a() < 16 && length2 < 16) {
                int a11 = xVar7.a();
                byte[] bArr6 = xVar7.a;
                System.arraycopy(bArr6, xVar7.b, bArr6, 0, a11);
                xVar7.N(0);
                xVar7.M(a11);
            }
        }
        return 0;
    }

    @Override // f3.o
    public final o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
