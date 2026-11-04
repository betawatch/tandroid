package j3;

import b8.kg;
import bb.c;
import c4.f;
import d2.s0;
import d2.u0;
import d2.v;
import d2.v0;
import e3.b0;
import e3.i0;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.t;
import e3.u;
import ei.y8;
import g2.n0;
import g2.y;
import g9.g0;
import g9.s1;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.Cells.f1;
import s3.h;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements o {
    public q e;
    public i0 f;
    public s0 h;
    public u i;
    public int j;
    public int k;
    public a l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final y b = new y(new byte[32768], 0);
    public final boolean c = false;
    public final s d = new s();
    public int g = 0;

    @Override // e3.o
    public final boolean b(p pVar) {
        s0 h = new c(19).h(pVar, h.b, 0);
        if (h != null) {
            int length = h.a.length;
        }
        y yVar = new y(4);
        ((l) pVar).h(yVar.a, 0, 4, false);
        return yVar.C() == 1716281667;
    }

    @Override // e3.o
    public final void c(q qVar) {
        this.e = qVar;
        this.f = qVar.i0(0, 1);
        qVar.L();
    }

    @Override // e3.o
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

    @Override // e3.o
    public final List e() {
        g0 g0Var = g9.i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        u uVar;
        int i3;
        b0 tVar;
        long j10;
        long j11;
        boolean z10;
        long I;
        long j12;
        int i10 = this.g;
        s0 s0Var = null;
        if (i10 == 0) {
            pVar.o();
            long k10 = pVar.k();
            s0 h = new c(19).h(pVar, !this.c ? null : h.b, 0);
            if (h != null && h.a.length != 0) {
                s0Var = h;
            }
            pVar.u((int) (pVar.k() - k10));
            this.h = s0Var;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i10 == 1) {
            pVar.c(0, bArr.length, bArr);
            pVar.o();
            this.g = 2;
            return 0;
        }
        int i11 = 4;
        int i12 = 3;
        if (i10 == 2) {
            y yVar = new y(4);
            pVar.readFully(yVar.a, 0, 4);
            if (yVar.C() != 1716281667) {
                throw v0.a(null, "Failed to read FLAC stream marker.");
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
                pVar.o();
                byte[] bArr2 = new byte[i11];
                f fVar = new f(bArr2, i11);
                int i15 = i14;
                pVar.c(i15, i11, bArr2);
                boolean i16 = fVar.i();
                int j13 = fVar.j(r10);
                int j14 = fVar.j(24) + i11;
                if (j13 == 0) {
                    byte[] bArr3 = new byte[38];
                    pVar.readFully(bArr3, i15, 38);
                    uVar2 = new u(bArr3, i11);
                } else {
                    if (uVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    s0 s0Var2 = uVar2.l;
                    if (j13 == i12) {
                        y yVar2 = new y(j14);
                        pVar.readFully(yVar2.a, i15, j14);
                        uVar2 = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, e3.b.t(yVar2), uVar2.l);
                    } else {
                        if (j13 == i11) {
                            y yVar3 = new y(j14);
                            pVar.readFully(yVar3.a, 0, j14);
                            yVar3.O(i11);
                            s0 r5 = e3.b.r(Arrays.asList(e3.b.u(yVar3, false, false).a));
                            if (s0Var2 != null) {
                                r5 = s0Var2.b(r5);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, r5);
                        } else if (j13 == i13) {
                            y yVar4 = new y(j14);
                            pVar.readFully(yVar4.a, 0, j14);
                            yVar4.O(4);
                            s0 s0Var3 = new s0(g9.i0.u(q3.a.d(yVar4)));
                            if (s0Var2 != null) {
                                s0Var3 = s0Var2.b(s0Var3);
                            }
                            uVar = new u(uVar2.a, uVar2.b, uVar2.c, uVar2.d, uVar2.e, uVar2.g, uVar2.h, uVar2.j, uVar2.k, s0Var3);
                        } else {
                            pVar.u(j14);
                        }
                        uVar2 = uVar;
                    }
                }
                String str = n0.a;
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
            v c2 = this.i.c(bArr, this.h);
            i0 i0Var = this.f;
            d2.u a10 = c2.a();
            a10.q = u0.n("audio/flac");
            f1.w(a10, i0Var);
            this.f.b(this.i.b());
            this.g = 4;
            return 0;
        }
        long j15 = 0;
        if (i10 == 4) {
            pVar.o();
            y yVar5 = new y(2);
            pVar.c(0, 2, yVar5.a);
            int H = yVar5.H();
            if ((H >> 2) != 16382) {
                pVar.o();
                throw v0.a(null, "First frame does not start with sync code.");
            }
            pVar.o();
            this.k = H;
            q qVar = this.e;
            String str2 = n0.a;
            long position = pVar.getPosition();
            long length = pVar.getLength();
            this.i.getClass();
            u uVar3 = this.i;
            tf.b bVar = uVar3.k;
            if (bVar != null && ((long[]) bVar.a).length > 0) {
                tVar = new t(uVar3, position, 0);
                i3 = 0;
            } else if (length == -1 || uVar3.j <= 0) {
                i3 = 0;
                tVar = new t(uVar3.b());
            } else {
                int i17 = this.k;
                int i18 = uVar3.c;
                y8 y8Var = new y8(uVar3, 17);
                kg kgVar = new kg(uVar3, i17);
                long b10 = uVar3.b();
                long j16 = uVar3.j;
                int i19 = uVar3.d;
                if (i19 > 0) {
                    i3 = 0;
                    j10 = ((i19 + i18) / 2) + 1;
                } else {
                    i3 = 0;
                    int i20 = uVar3.a;
                    j10 = 64 + (((((i20 != uVar3.b || i20 <= 0) ? 4096L : i20) * uVar3.g) * uVar3.h) / 8);
                }
                a aVar = new a(y8Var, kgVar, b10, j16, position, length, j10, Math.max(6, i18));
                this.l = aVar;
                tVar = aVar.a;
            }
            qVar.f(tVar);
            this.g = 5;
            return i3;
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
            pVar.o();
            pVar.n(1);
            byte[] bArr4 = new byte[1];
            pVar.c(0, 1, bArr4);
            boolean z12 = (bArr4[0] & 1) == 1;
            pVar.n(2);
            r10 = z12 ? 7 : 6;
            y yVar6 = new y(r10);
            byte[] bArr5 = yVar6.a;
            int i21 = 0;
            while (i21 < r10) {
                int e10 = pVar.e(i21, r10 - i21, bArr5);
                if (e10 == -1) {
                    break;
                }
                i21 += e10;
            }
            yVar6.M(i21);
            pVar.o();
            try {
                I = yVar6.I();
                if (!z12) {
                    I *= uVar4.b;
                }
                j12 = uVar4.j;
            } catch (NumberFormatException unused) {
            }
            if (j12 == 0 || I <= j12) {
                j15 = I;
                if (r4) {
                    throw v0.a(null, null);
                }
                this.n = j15;
            }
            r4 = false;
            if (r4) {
            }
        } else {
            y yVar7 = this.b;
            int i22 = yVar7.c;
            if (i22 < 32768) {
                int read = pVar.read(yVar7.a, i22, 32768 - i22);
                r4 = read == -1;
                if (!r4) {
                    yVar7.M(i22 + read);
                } else if (yVar7.a() == 0) {
                    long j17 = this.n * 1000000;
                    u uVar5 = this.i;
                    String str3 = n0.a;
                    this.f.d(j17 / uVar5.e, 1, this.m, 0, null);
                    return -1;
                }
            } else {
                r4 = false;
            }
            int i23 = yVar7.b;
            int i24 = this.m;
            int i25 = this.j;
            if (i24 < i25) {
                yVar7.O(Math.min(i25 - i24, yVar7.a()));
            }
            this.i.getClass();
            int i26 = yVar7.b;
            while (true) {
                int i27 = yVar7.c - 16;
                s sVar2 = this.d;
                if (i26 <= i27) {
                    yVar7.N(i26);
                    if (e3.b.a(yVar7, this.i, this.k, sVar2)) {
                        yVar7.N(i26);
                        j11 = sVar2.a;
                        break;
                    }
                    i26++;
                } else {
                    if (r4) {
                        while (true) {
                            int i28 = yVar7.c;
                            if (i26 > i28 - this.j) {
                                yVar7.N(i28);
                                break;
                            }
                            yVar7.N(i26);
                            try {
                                z10 = e3.b.a(yVar7, this.i, this.k, sVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (yVar7.b > yVar7.c) {
                                z10 = false;
                            }
                            if (z10) {
                                yVar7.N(i26);
                                j11 = sVar2.a;
                                break;
                            }
                            i26++;
                        }
                    } else {
                        yVar7.N(i26);
                    }
                    j11 = -1;
                }
            }
            int i29 = yVar7.b - i23;
            yVar7.N(i23);
            this.f.e(i29, yVar7);
            int i30 = this.m + i29;
            this.m = i30;
            if (j11 != -1) {
                long j18 = this.n * 1000000;
                u uVar6 = this.i;
                String str4 = n0.a;
                this.f.d(j18 / uVar6.e, 1, i30, 0, null);
                this.m = 0;
                this.n = j11;
            }
            int length2 = yVar7.a.length - yVar7.c;
            if (yVar7.a() < 16 && length2 < 16) {
                int a11 = yVar7.a();
                byte[] bArr6 = yVar7.a;
                System.arraycopy(bArr6, yVar7.b, bArr6, 0, a11);
                yVar7.N(0);
                yVar7.M(a11);
            }
        }
        return 0;
    }

    @Override // e3.o
    public final o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
