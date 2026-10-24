package j4;

import b2.v0;
import b2.w0;
import c3.l0;
import java.util.Collections;
import org.telegram.messenger.MediaController;
import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class t implements i {
    public final String a;
    public final int b;
    public final e2.x c;
    public final a4.g d;
    public l0 e;
    public String f;
    public b2.w g;
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

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019f, code lost:
    
        if (r23.m == false) goto L89;
     */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(e2.x xVar) {
        int g10;
        boolean f7;
        this.e.getClass();
        while (xVar.a() > 0) {
            int i10 = this.h;
            if (i10 != 0) {
                if (i10 != 1) {
                    e2.x xVar2 = this.c;
                    a4.g gVar = this.d;
                    if (i10 == 2) {
                        int A = ((this.k & (-225)) << 8) | xVar.A();
                        this.j = A;
                        if (A > xVar2.a.length) {
                            xVar2.K(A);
                            byte[] bArr = xVar2.a;
                            gVar.getClass();
                            gVar.k(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(xVar.a(), this.j - this.i);
                        xVar.k(this.i, min, gVar.b);
                        int i11 = this.i + min;
                        this.i = i11;
                        if (i11 == this.j) {
                            gVar.m(0);
                            if (!gVar.f()) {
                                this.m = true;
                                int g11 = gVar.g(1);
                                int g12 = g11 == 1 ? gVar.g(1) : 0;
                                this.n = g12;
                                if (g12 != 0) {
                                    throw w0.a(null, null);
                                }
                                if (g11 == 1) {
                                    gVar.g((gVar.g(2) + 1) * 8);
                                }
                                if (!gVar.f()) {
                                    throw w0.a(null, null);
                                }
                                this.o = gVar.g(6);
                                int g13 = gVar.g(4);
                                int g14 = gVar.g(3);
                                if (g13 != 0 || g14 != 0) {
                                    throw w0.a(null, null);
                                }
                                if (g11 == 0) {
                                    int e = gVar.e();
                                    int b10 = gVar.b();
                                    c3.a n10 = c3.b.n(gVar, true);
                                    this.v = n10.a;
                                    this.s = n10.b;
                                    this.u = n10.c;
                                    int b11 = b10 - gVar.b();
                                    gVar.m(e);
                                    byte[] bArr2 = new byte[(b11 + 7) / 8];
                                    gVar.h(b11, bArr2);
                                    b2.v vVar = new b2.v();
                                    vVar.a = this.f;
                                    vVar.q = v0.n("video/mp2t");
                                    vVar.r = v0.n(MediaController.AUDIO_MIME_TYPE);
                                    vVar.j = this.v;
                                    vVar.J = this.u;
                                    vVar.K = this.s;
                                    vVar.u = Collections.singletonList(bArr2);
                                    vVar.d = this.a;
                                    vVar.f = this.b;
                                    b2.w wVar = new b2.w(vVar);
                                    if (!wVar.equals(this.g)) {
                                        this.g = wVar;
                                        this.t = 1024000000 / wVar.L;
                                        this.e.b(wVar);
                                    }
                                } else {
                                    int b12 = gVar.b();
                                    c3.a n11 = c3.b.n(gVar, true);
                                    this.v = n11.a;
                                    this.s = n11.b;
                                    this.u = n11.c;
                                    gVar.o(gVar.g((gVar.g(2) + 1) * 8) - (b12 - gVar.b()));
                                }
                                int g15 = gVar.g(3);
                                this.p = g15;
                                if (g15 == 0) {
                                    gVar.o(8);
                                } else if (g15 == 1) {
                                    gVar.o(9);
                                } else if (g15 == 3 || g15 == 4 || g15 == 5) {
                                    gVar.o(6);
                                } else {
                                    if (g15 != 6 && g15 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    gVar.o(1);
                                }
                                boolean f10 = gVar.f();
                                this.q = f10;
                                this.r = 0L;
                                if (f10) {
                                    if (g11 == 1) {
                                        this.r = gVar.g((gVar.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            f7 = gVar.f();
                                            this.r = (this.r << 8) + gVar.g(8);
                                        } while (f7);
                                    }
                                }
                                if (gVar.f()) {
                                    gVar.o(8);
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
                            int i12 = 0;
                            do {
                                g10 = gVar.g(8);
                                i12 += g10;
                            } while (g10 == 255);
                            int e7 = gVar.e();
                            if ((e7 & 7) == 0) {
                                xVar2.N(e7 >> 3);
                            } else {
                                gVar.h(i12 * 8, xVar2.a);
                                xVar2.N(0);
                            }
                            this.e.d(i12, xVar2);
                            u6.p(this.l != -9223372036854775807L);
                            this.e.c(this.l, 1, i12, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                gVar.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int A2 = xVar.A();
                    if ((A2 & 224) == 224) {
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
    public final void c() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // j4.i
    public final void d(c3.s sVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.e = sVar.j0(f0Var.c, 1);
        f0Var.c();
        this.f = (String) f0Var.e;
    }

    @Override // j4.i
    public final void f(int i10, long j10) {
        this.l = j10;
    }

    @Override // j4.i
    public final void e(boolean z10) {
    }
}
