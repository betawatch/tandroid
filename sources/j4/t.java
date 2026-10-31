package j4;

import b2.v0;
import b2.w0;
import c3.k0;
import java.util.Collections;
import org.telegram.messenger.zs;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t implements i {
    public final String a;
    public final int b;
    public final e2.x c;
    public final a4.g d;
    public k0 e;
    public String f;
    public b2.x g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public t(String str, int i10) {
        this.a = str;
        this.b = i10;
        e2.x xVar = new e2.x(1024);
        this.c = xVar;
        byte[] bArr = xVar.a;
        this.d = new a4.g(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01a0, code lost:
    
        if (r23.m == false) goto L89;
     */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(e2.x xVar) {
        int i10;
        boolean h;
        this.e.getClass();
        while (xVar.a() > 0) {
            int i11 = this.h;
            if (i11 != 0) {
                if (i11 != 1) {
                    e2.x xVar2 = this.c;
                    a4.g gVar = this.d;
                    if (i11 == 2) {
                        int A = ((this.k & (-225)) << 8) | xVar.A();
                        this.j = A;
                        if (A > xVar2.a.length) {
                            xVar2.K(A);
                            byte[] bArr = xVar2.a;
                            gVar.getClass();
                            gVar.b0(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(xVar.a(), this.j - this.i);
                        xVar.k(this.i, min, (byte[]) gVar.b);
                        int i12 = this.i + min;
                        this.i = i12;
                        if (i12 == this.j) {
                            gVar.d0(0);
                            if (!gVar.h()) {
                                this.m = true;
                                int i13 = gVar.i(1);
                                int i14 = i13 == 1 ? gVar.i(1) : 0;
                                this.n = i14;
                                if (i14 != 0) {
                                    throw w0.a(null, null);
                                }
                                if (i13 == 1) {
                                    gVar.i((gVar.i(2) + 1) * 8);
                                }
                                if (!gVar.h()) {
                                    throw w0.a(null, null);
                                }
                                this.o = gVar.i(6);
                                int i15 = gVar.i(4);
                                int i16 = gVar.i(3);
                                if (i15 != 0 || i16 != 0) {
                                    throw w0.a(null, null);
                                }
                                if (i13 == 0) {
                                    int f7 = gVar.f();
                                    int b10 = gVar.b();
                                    c3.a n10 = c3.b.n(gVar, true);
                                    this.v = n10.a;
                                    this.s = n10.b;
                                    this.u = n10.c;
                                    int b11 = b10 - gVar.b();
                                    gVar.d0(f7);
                                    byte[] bArr2 = new byte[(b11 + 7) / 8];
                                    gVar.j(b11, bArr2);
                                    b2.w wVar = new b2.w();
                                    wVar.a = this.f;
                                    wVar.q = v0.n("video/mp2t");
                                    wVar.r = v0.n("audio/mp4a-latm");
                                    wVar.j = this.v;
                                    wVar.J = this.u;
                                    wVar.K = this.s;
                                    wVar.u = Collections.singletonList(bArr2);
                                    wVar.d = this.a;
                                    wVar.f = this.b;
                                    b2.x xVar3 = new b2.x(wVar);
                                    if (!xVar3.equals(this.g)) {
                                        this.g = xVar3;
                                        this.t = 1024000000 / xVar3.L;
                                        this.e.b(xVar3);
                                    }
                                } else {
                                    int b12 = gVar.b();
                                    c3.a n11 = c3.b.n(gVar, true);
                                    this.v = n11.a;
                                    this.s = n11.b;
                                    this.u = n11.c;
                                    gVar.f0(gVar.i((gVar.i(2) + 1) * 8) - (b12 - gVar.b()));
                                }
                                int i17 = gVar.i(3);
                                this.p = i17;
                                if (i17 == 0) {
                                    gVar.f0(8);
                                } else if (i17 == 1) {
                                    gVar.f0(9);
                                } else if (i17 == 3 || i17 == 4 || i17 == 5) {
                                    gVar.f0(6);
                                } else {
                                    if (i17 != 6 && i17 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    gVar.f0(1);
                                }
                                boolean h10 = gVar.h();
                                this.q = h10;
                                this.r = 0L;
                                if (h10) {
                                    if (i13 == 1) {
                                        this.r = gVar.i((gVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            h = gVar.h();
                                            this.r = (this.r << 8) + gVar.i(8);
                                        } while (h);
                                    }
                                }
                                if (gVar.h()) {
                                    gVar.f0(8);
                                }
                            }
                            if (this.n != 0) {
                                throw w0.a(null, null);
                            }
                            if (this.o != 0) {
                                throw w0.a(null, null);
                            }
                            if (this.p != 0) {
                                throw w0.a(null, null);
                            }
                            int i18 = 0;
                            do {
                                i10 = gVar.i(8);
                                i18 += i10;
                            } while (i10 == 255);
                            int f10 = gVar.f();
                            if ((f10 & 7) == 0) {
                                xVar2.N(f10 >> 3);
                            } else {
                                gVar.j(i18 * 8, xVar2.a);
                                xVar2.N(0);
                            }
                            this.e.d(i18, xVar2);
                            t6.p(this.l != -9223372036854775807L);
                            this.e.c(this.l, 1, i18, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                gVar.f0((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int A2 = xVar.A();
                    if ((A2 & zs.B3) == 224) {
                        this.k = A2;
                        this.h = 2;
                    } else if (A2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (xVar.A() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // j4.i
    public final void e() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // j4.i
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.e = qVar.I1(g0Var.c, 1);
        g0Var.c();
        this.f = (String) g0Var.e;
    }

    @Override // j4.i
    public final void h(int i10, long j10) {
        this.l = j10;
    }

    @Override // j4.i
    public final void g(boolean z10) {
    }
}
