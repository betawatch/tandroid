package j4;

import b2.r0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h implements i {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public h(List list) {
        this.a = 0;
        this.f = list;
        this.g = new c3.h0[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // j4.i
    public final void a(e2.v vVar) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (vVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (vVar.x() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z11 = this.b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.d == 1) {
                        if (vVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (vVar.x() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z10 = this.b;
                        }
                        if (!z10) {
                        }
                    }
                    int i10 = vVar.b;
                    int a2 = vVar.a();
                    for (c3.h0 h0Var : (c3.h0[]) this.g) {
                        vVar.J(i10);
                        h0Var.d(a2, vVar);
                    }
                    this.e += a2;
                    break;
                }
                break;
            default:
                e2.v vVar2 = (e2.v) this.f;
                e2.d.h((c3.h0) this.g);
                if (this.b) {
                    int a10 = vVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(vVar.a, vVar.b, vVar2.a, this.e, min);
                        if (this.e + min == 10) {
                            vVar2.J(0);
                            if (73 != vVar2.x() || 68 != vVar2.x() || 51 != vVar2.x()) {
                                e2.a.n("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                vVar2.K(3);
                                this.d = vVar2.w() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.e);
                    ((c3.h0) this.g).d(min2, vVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // j4.i
    public final void b() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // j4.i
    public final void c(c3.q qVar, g0 g0Var) {
        switch (this.a) {
            case 0:
                c3.h0[] h0VarArr = (c3.h0[]) this.g;
                for (int i10 = 0; i10 < h0VarArr.length; i10++) {
                    f0 f0Var = (f0) ((List) this.f).get(i10);
                    g0Var.a();
                    g0Var.b();
                    c3.h0 I = qVar.I(g0Var.d, 3);
                    b2.r rVar = new b2.r();
                    g0Var.b();
                    rVar.a = g0Var.e;
                    rVar.p = r0.n("video/mp2t");
                    rVar.q = r0.n("application/dvbsubs");
                    rVar.t = Collections.singletonList(f0Var.b);
                    rVar.d = f0Var.a;
                    hc.b.u(rVar, I);
                    h0VarArr[i10] = I;
                }
                break;
            default:
                g0Var.a();
                g0Var.b();
                c3.h0 I2 = qVar.I(g0Var.d, 5);
                this.g = I2;
                b2.r rVar2 = new b2.r();
                g0Var.b();
                rVar2.a = g0Var.e;
                rVar2.p = r0.n("video/mp2t");
                rVar2.q = r0.n("application/id3");
                hc.b.u(rVar2, I2);
                break;
        }
    }

    @Override // j4.i
    public final void d(boolean z10) {
        int i10;
        switch (this.a) {
            case 0:
                if (this.b) {
                    e2.d.g(this.c != -9223372036854775807L);
                    for (c3.h0 h0Var : (c3.h0[]) this.g) {
                        h0Var.c(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                e2.d.h((c3.h0) this.g);
                if (this.b && (i10 = this.d) != 0 && this.e == i10) {
                    e2.d.g(this.c != -9223372036854775807L);
                    ((c3.h0) this.g).c(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // j4.i
    public final void e(int i10, long j3) {
        switch (this.a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.b = true;
                    this.c = j3;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.b = true;
                    this.c = j3;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    public h() {
        this.a = 1;
        this.f = new e2.v(10);
        this.c = -9223372036854775807L;
    }
}
