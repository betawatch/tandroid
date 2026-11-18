package k3;

import a8.xa;
import d4.f;
import di.c7;
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
import h9.t1;
import java.util.Arrays;
import java.util.List;
import ob.c;
import t3.h;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        q0 M = new c(19).M(pVar, h.b, 0);
        if (M != null) {
            int length = M.a.length;
        }
        x xVar = new x(4);
        ((l) pVar).g(xVar.a, 0, 4, false);
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
        return t1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
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
        boolean z10;
        long I;
        long j11;
        int i10 = this.g;
        q0 q0Var = null;
        if (i10 == 0) {
            pVar.n();
            long l10 = pVar.l();
            q0 M = new c(19).M(pVar, !this.c ? null : h.b, 0);
            if (M != null && M.a.length != 0) {
                q0Var = M;
            }
            pVar.r((int) (pVar.l() - l10));
            this.h = q0Var;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i10 == 1) {
            pVar.b(0, bArr.length, bArr);
            pVar.n();
            this.g = 2;
            return 0;
        }
        int i11 = 4;
        int i12 = 3;
        if (i10 == 2) {
            x xVar = new x(4);
            pVar.readFully(xVar.a, 0, 4);
            if (xVar.C() != 1716281667) {
                throw t0.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i13 = 6;
        if (i10 == 3) {
            int i14 = 0;
            u uVar2 = this.i;
            boolean z11 = false;
            while (!z11) {
                pVar.n();
                byte[] bArr2 = new byte[i11];
                f fVar = new f(bArr2, i11);
                int i15 = i14;
                pVar.b(i15, i11, bArr2);
                boolean i16 = fVar.i();
                int j12 = fVar.j(r10);
                int j13 = fVar.j(24) + i11;
                if (j12 == 0) {
                    byte[] bArr3 = new byte[38];
                    pVar.readFully(bArr3, i15, 38);
                    uVar2 = new u(bArr3, i11);
                } else {
                    if (uVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    q0 q0Var2 = uVar2.l;
                    if (j12 == i12) {
                        x xVar2 = new x(j13);
                        pVar.readFully(xVar2.a, i15, j13);
                        uVar2 = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, f3.b.t(xVar2), uVar2.l);
                    } else {
                        if (j12 == i11) {
                            x xVar3 = new x(j13);
                            pVar.readFully(xVar3.a, 0, j13);
                            xVar3.O(i11);
                            q0 r10 = f3.b.r(Arrays.asList(f3.b.u(xVar3, false, false).a));
                            if (q0Var2 != null) {
                                r10 = q0Var2.b(r10);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, r10);
                        } else if (j12 == i13) {
                            x xVar4 = new x(j13);
                            pVar.readFully(xVar4.a, 0, j13);
                            xVar4.O(4);
                            q0 q0Var3 = new q0(h9.i0.u(r3.a.d(xVar4)));
                            if (q0Var2 != null) {
                                q0Var3 = q0Var2.b(q0Var3);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, q0Var3);
                        } else {
                            pVar.r(j13);
                        }
                        uVar2 = uVar;
                    }
                }
                String str = l0.a;
                this.i = uVar2;
                z11 = i16;
                i11 = 4;
                i12 = 3;
                r10 = 7;
                i13 = 6;
                i14 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            e2.u c10 = this.i.c(bArr, this.h);
            i0 i0Var = this.f;
            t a10 = c10.a();
            a10.q = s0.n("audio/flac");
            p5.c.r(a10, i0Var);
            this.f.d(this.i.b());
            this.g = 4;
            return 0;
        }
        long j14 = 0;
        if (i10 == 4) {
            pVar.n();
            x xVar5 = new x(2);
            pVar.b(0, 2, xVar5.a);
            int H = xVar5.H();
            if ((H >> 2) != 16382) {
                pVar.n();
                throw t0.a(null, "First frame does not start with sync code.");
            }
            pVar.n();
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
                int i17 = this.k;
                int i18 = uVar3.c;
                c7 c7Var = new c7(uVar3, 25);
                xa xaVar = new xa(uVar3, i17);
                long b10 = uVar3.b();
                long j15 = uVar3.j;
                int i19 = uVar3.d;
                if (i19 > 0) {
                    i7 = 0;
                    j3 = ((i19 + i18) / 2) + 1;
                } else {
                    i7 = 0;
                    int i20 = uVar3.a;
                    j3 = 64 + (((((i20 != uVar3.b || i20 <= 0) ? 4096L : i20) * uVar3.g) * uVar3.h) / 8);
                }
                a aVar = new a(c7Var, xaVar, b10, j15, position, length, j3, Math.max(6, i18));
                this.l = aVar;
                tVar = aVar.a;
            }
            qVar.j(tVar);
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
            pVar.n();
            pVar.m(1);
            byte[] bArr4 = new byte[1];
            pVar.b(0, 1, bArr4);
            boolean z12 = (bArr4[0] & 1) == 1;
            pVar.m(2);
            r10 = z12 ? 7 : 6;
            x xVar6 = new x(r10);
            byte[] bArr5 = xVar6.a;
            int i21 = 0;
            while (i21 < r10) {
                int d = pVar.d(i21, r10 - i21, bArr5);
                if (d == -1) {
                    break;
                }
                i21 += d;
            }
            xVar6.M(i21);
            pVar.n();
            try {
                I = xVar6.I();
                if (!z12) {
                    I *= uVar4.b;
                }
                j11 = uVar4.j;
            } catch (NumberFormatException unused) {
            }
            if (j11 == 0 || I <= j11) {
                j14 = I;
                if (r4) {
                    throw t0.a(null, null);
                }
                this.n = j14;
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
                    long j16 = this.n * 1000000;
                    u uVar5 = this.i;
                    String str3 = l0.a;
                    this.f.c(j16 / uVar5.e, 1, this.m, 0, null);
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
                    if (f3.b.a(xVar7, this.i, this.k, sVar2)) {
                        xVar7.N(i26);
                        j10 = sVar2.a;
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
                                z10 = f3.b.a(xVar7, this.i, this.k, sVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (xVar7.b > xVar7.c) {
                                z10 = false;
                            }
                            if (z10) {
                                xVar7.N(i26);
                                j10 = sVar2.a;
                                break;
                            }
                            i26++;
                        }
                    } else {
                        xVar7.N(i26);
                    }
                    j10 = -1;
                }
            }
            int i29 = xVar7.b - i23;
            xVar7.N(i23);
            this.f.b(i29, xVar7);
            int i30 = this.m + i29;
            this.m = i30;
            if (j10 != -1) {
                long j17 = this.n * 1000000;
                u uVar6 = this.i;
                String str4 = l0.a;
                this.f.c(j17 / uVar6.e, 1, i30, 0, null);
                this.m = 0;
                this.n = j10;
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
