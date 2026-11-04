package l4;

import b8.zb;
import d2.u0;
import d2.v0;
import e3.i0;
import java.util.Collections;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t implements i {
    public final String a;
    public final int b;
    public final g2.y c;
    public final c4.f d;
    public i0 e;
    public String f;
    public d2.v g;
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

    public t(String str, int i3) {
        this.a = str;
        this.b = i3;
        g2.y yVar = new g2.y(1024);
        this.c = yVar;
        byte[] bArr = yVar.a;
        this.d = new c4.f(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    @Override // l4.i
    public final void a() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01a0, code lost:
    
        if (r23.m == false) goto L89;
     */
    @Override // l4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(g2.y yVar) {
        int j10;
        boolean i3;
        this.e.getClass();
        while (yVar.a() > 0) {
            int i10 = this.h;
            if (i10 != 0) {
                if (i10 != 1) {
                    g2.y yVar2 = this.c;
                    c4.f fVar = this.d;
                    if (i10 == 2) {
                        int A = ((this.k & (-225)) << 8) | yVar.A();
                        this.j = A;
                        if (A > yVar2.a.length) {
                            yVar2.K(A);
                            byte[] bArr = yVar2.a;
                            fVar.getClass();
                            fVar.H(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(yVar.a(), this.j - this.i);
                        yVar.k(this.i, min, (byte[]) fVar.b);
                        int i11 = this.i + min;
                        this.i = i11;
                        if (i11 == this.j) {
                            fVar.J(0);
                            if (!fVar.i()) {
                                this.m = true;
                                int j11 = fVar.j(1);
                                int j12 = j11 == 1 ? fVar.j(1) : 0;
                                this.n = j12;
                                if (j12 != 0) {
                                    throw v0.a(null, null);
                                }
                                if (j11 == 1) {
                                    fVar.j((fVar.j(2) + 1) * 8);
                                }
                                if (!fVar.i()) {
                                    throw v0.a(null, null);
                                }
                                this.o = fVar.j(6);
                                int j13 = fVar.j(4);
                                int j14 = fVar.j(3);
                                if (j13 != 0 || j14 != 0) {
                                    throw v0.a(null, null);
                                }
                                if (j11 == 0) {
                                    int f10 = fVar.f();
                                    int b10 = fVar.b();
                                    e3.a n4 = e3.b.n(fVar, true);
                                    this.v = n4.a;
                                    this.s = n4.b;
                                    this.u = n4.c;
                                    int b11 = b10 - fVar.b();
                                    fVar.J(f10);
                                    byte[] bArr2 = new byte[(b11 + 7) / 8];
                                    fVar.k(b11, bArr2);
                                    d2.u uVar = new d2.u();
                                    uVar.a = this.f;
                                    uVar.q = u0.n("video/mp2t");
                                    uVar.r = u0.n("audio/mp4a-latm");
                                    uVar.j = this.v;
                                    uVar.J = this.u;
                                    uVar.K = this.s;
                                    uVar.u = Collections.singletonList(bArr2);
                                    uVar.d = this.a;
                                    uVar.f = this.b;
                                    d2.v vVar = new d2.v(uVar);
                                    if (!vVar.equals(this.g)) {
                                        this.g = vVar;
                                        this.t = 1024000000 / vVar.L;
                                        this.e.g(vVar);
                                    }
                                } else {
                                    int b12 = fVar.b();
                                    e3.a n10 = e3.b.n(fVar, true);
                                    this.v = n10.a;
                                    this.s = n10.b;
                                    this.u = n10.c;
                                    fVar.L(fVar.j((fVar.j(2) + 1) * 8) - (b12 - fVar.b()));
                                }
                                int j15 = fVar.j(3);
                                this.p = j15;
                                if (j15 == 0) {
                                    fVar.L(8);
                                } else if (j15 == 1) {
                                    fVar.L(9);
                                } else if (j15 == 3 || j15 == 4 || j15 == 5) {
                                    fVar.L(6);
                                } else {
                                    if (j15 != 6 && j15 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    fVar.L(1);
                                }
                                boolean i12 = fVar.i();
                                this.q = i12;
                                this.r = 0L;
                                if (i12) {
                                    if (j11 == 1) {
                                        this.r = fVar.j((fVar.j(2) + 1) * 8);
                                    } else {
                                        do {
                                            i3 = fVar.i();
                                            this.r = (this.r << 8) + fVar.j(8);
                                        } while (i3);
                                    }
                                }
                                if (fVar.i()) {
                                    fVar.L(8);
                                }
                            }
                            if (this.n != 0) {
                                throw v0.a(null, null);
                            }
                            if (this.o != 0) {
                                throw v0.a(null, null);
                            }
                            if (this.p != 0) {
                                throw v0.a(null, null);
                            }
                            int i13 = 0;
                            do {
                                j10 = fVar.j(8);
                                i13 += j10;
                            } while (j10 == 255);
                            int f11 = fVar.f();
                            if ((f11 & 7) == 0) {
                                yVar2.N(f11 >> 3);
                            } else {
                                fVar.k(i13 * 8, yVar2.a);
                                yVar2.N(0);
                            }
                            this.e.e(i13, yVar2);
                            zb.p(this.l != -9223372036854775807L);
                            this.e.d(this.l, 1, i13, 0, null);
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
                    int A2 = yVar.A();
                    if ((A2 & hs.B3) == 224) {
                        this.k = A2;
                        this.h = 2;
                    } else if (A2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (yVar.A() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // l4.i
    public final void e(int i3, long j10) {
        this.l = j10;
    }

    @Override // l4.i
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.e = qVar.i0(f0Var.c, 1);
        f0Var.c();
        this.f = (String) f0Var.e;
    }

    @Override // l4.i
    public final void d(boolean z10) {
    }
}
