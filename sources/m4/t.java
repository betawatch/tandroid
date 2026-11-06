package m4;

import a8.ia;
import e2.s0;
import e2.t0;
import f3.j0;
import java.util.Collections;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class t implements i {
    public final String a;
    public final int b;
    public final h2.x c;
    public final d4.f d;
    public j0 e;
    public String f;
    public e2.u g;
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

    public t(String str, int i7) {
        this.a = str;
        this.b = i7;
        h2.x xVar = new h2.x(1024);
        this.c = xVar;
        byte[] bArr = xVar.a;
        this.d = new d4.f(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01a0, code lost:
    
        if (r23.m == false) goto L89;
     */
    @Override // m4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h2.x xVar) {
        int j3;
        boolean i7;
        this.e.getClass();
        while (xVar.a() > 0) {
            int i10 = this.h;
            if (i10 != 0) {
                if (i10 != 1) {
                    h2.x xVar2 = this.c;
                    d4.f fVar = this.d;
                    if (i10 == 2) {
                        int A = ((this.k & (-225)) << 8) | xVar.A();
                        this.j = A;
                        if (A > xVar2.a.length) {
                            xVar2.K(A);
                            byte[] bArr = xVar2.a;
                            fVar.getClass();
                            fVar.H(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(xVar.a(), this.j - this.i);
                        xVar.k(this.i, min, (byte[]) fVar.b);
                        int i11 = this.i + min;
                        this.i = i11;
                        if (i11 == this.j) {
                            fVar.J(0);
                            if (!fVar.i()) {
                                this.m = true;
                                int j10 = fVar.j(1);
                                int j11 = j10 == 1 ? fVar.j(1) : 0;
                                this.n = j11;
                                if (j11 != 0) {
                                    throw t0.a(null, null);
                                }
                                if (j10 == 1) {
                                    fVar.j((fVar.j(2) + 1) * 8);
                                }
                                if (!fVar.i()) {
                                    throw t0.a(null, null);
                                }
                                this.o = fVar.j(6);
                                int j12 = fVar.j(4);
                                int j13 = fVar.j(3);
                                if (j12 != 0 || j13 != 0) {
                                    throw t0.a(null, null);
                                }
                                if (j10 == 0) {
                                    int f10 = fVar.f();
                                    int b10 = fVar.b();
                                    f3.a n10 = f3.b.n(fVar, true);
                                    this.v = n10.a;
                                    this.s = n10.b;
                                    this.u = n10.c;
                                    int b11 = b10 - fVar.b();
                                    fVar.J(f10);
                                    byte[] bArr2 = new byte[(b11 + 7) / 8];
                                    fVar.k(b11, bArr2);
                                    e2.t tVar = new e2.t();
                                    tVar.a = this.f;
                                    tVar.q = s0.n("video/mp2t");
                                    tVar.r = s0.n("audio/mp4a-latm");
                                    tVar.j = this.v;
                                    tVar.J = this.u;
                                    tVar.K = this.s;
                                    tVar.u = Collections.singletonList(bArr2);
                                    tVar.d = this.a;
                                    tVar.f = this.b;
                                    e2.u uVar = new e2.u(tVar);
                                    if (!uVar.equals(this.g)) {
                                        this.g = uVar;
                                        this.t = 1024000000 / uVar.L;
                                        this.e.g(uVar);
                                    }
                                } else {
                                    int b12 = fVar.b();
                                    f3.a n11 = f3.b.n(fVar, true);
                                    this.v = n11.a;
                                    this.s = n11.b;
                                    this.u = n11.c;
                                    fVar.L(fVar.j((fVar.j(2) + 1) * 8) - (b12 - fVar.b()));
                                }
                                int j14 = fVar.j(3);
                                this.p = j14;
                                if (j14 == 0) {
                                    fVar.L(8);
                                } else if (j14 == 1) {
                                    fVar.L(9);
                                } else if (j14 == 3 || j14 == 4 || j14 == 5) {
                                    fVar.L(6);
                                } else {
                                    if (j14 != 6 && j14 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    fVar.L(1);
                                }
                                boolean i12 = fVar.i();
                                this.q = i12;
                                this.r = 0L;
                                if (i12) {
                                    if (j10 == 1) {
                                        this.r = fVar.j((fVar.j(2) + 1) * 8);
                                    } else {
                                        do {
                                            i7 = fVar.i();
                                            this.r = (this.r << 8) + fVar.j(8);
                                        } while (i7);
                                    }
                                }
                                if (fVar.i()) {
                                    fVar.L(8);
                                }
                            }
                            if (this.n != 0) {
                                throw t0.a(null, null);
                            }
                            if (this.o != 0) {
                                throw t0.a(null, null);
                            }
                            if (this.p != 0) {
                                throw t0.a(null, null);
                            }
                            int i13 = 0;
                            do {
                                j3 = fVar.j(8);
                                i13 += j3;
                            } while (j3 == 255);
                            int f11 = fVar.f();
                            if ((f11 & 7) == 0) {
                                xVar2.N(f11 >> 3);
                            } else {
                                fVar.k(i13 * 8, xVar2.a);
                                xVar2.N(0);
                            }
                            this.e.b(i13, xVar2);
                            ia.p(this.l != -9223372036854775807L);
                            this.e.c(this.l, 1, i13, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                fVar.L((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int A2 = xVar.A();
                    if ((A2 & qs.B3) == 224) {
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

    @Override // m4.i
    public final void d() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // m4.i
    public final void f(int i7, long j3) {
        this.l = j3;
    }

    @Override // m4.i
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.e = qVar.O1(g0Var.c, 1);
        g0Var.c();
        this.f = (String) g0Var.e;
    }

    @Override // m4.i
    public final void e(boolean z9) {
    }
}
