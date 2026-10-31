package j4;

import b2.v0;
import c3.k0;
import java.util.Collections;
import java.util.List;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        this.g = new k0[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // j4.i
    public final void c(e2.x xVar) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (xVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (xVar.A() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z11 = this.b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.d == 1) {
                        if (xVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (xVar.A() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z10 = this.b;
                        }
                        if (!z10) {
                        }
                    }
                    int i10 = xVar.b;
                    int a2 = xVar.a();
                    for (k0 k0Var : (k0[]) this.g) {
                        xVar.N(i10);
                        k0Var.d(a2, xVar);
                    }
                    this.e += a2;
                    break;
                }
                break;
            default:
                e2.x xVar2 = (e2.x) this.f;
                ((k0) this.g).getClass();
                if (this.b) {
                    int a10 = xVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(xVar.a, xVar.b, xVar2.a, this.e, min);
                        if (this.e + min == 10) {
                            xVar2.N(0);
                            if (73 != xVar2.A() || 68 != xVar2.A() || 51 != xVar2.A()) {
                                e2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                xVar2.O(3);
                                this.d = xVar2.z() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.e);
                    ((k0) this.g).d(min2, xVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // j4.i
    public final void e() {
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
    public final void f(c3.q qVar, g0 g0Var) {
        switch (this.a) {
            case 0:
                k0[] k0VarArr = (k0[]) this.g;
                for (int i10 = 0; i10 < k0VarArr.length; i10++) {
                    f0 f0Var = (f0) ((List) this.f).get(i10);
                    g0Var.b();
                    g0Var.c();
                    k0 I1 = qVar.I1(g0Var.c, 3);
                    b2.w wVar = new b2.w();
                    g0Var.c();
                    wVar.a = (String) g0Var.e;
                    wVar.q = v0.n("video/mp2t");
                    wVar.r = v0.n("application/dvbsubs");
                    wVar.u = Collections.singletonList(f0Var.b);
                    wVar.d = f0Var.a;
                    i0.a.r(wVar, I1);
                    k0VarArr[i10] = I1;
                }
                break;
            default:
                g0Var.b();
                g0Var.c();
                k0 I12 = qVar.I1(g0Var.c, 5);
                this.g = I12;
                b2.w wVar2 = new b2.w();
                g0Var.c();
                wVar2.a = (String) g0Var.e;
                wVar2.q = v0.n("video/mp2t");
                wVar2.r = v0.n("application/id3");
                i0.a.r(wVar2, I12);
                break;
        }
    }

    @Override // j4.i
    public final void g(boolean z10) {
        int i10;
        switch (this.a) {
            case 0:
                if (this.b) {
                    t6.p(this.c != -9223372036854775807L);
                    for (k0 k0Var : (k0[]) this.g) {
                        k0Var.c(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                ((k0) this.g).getClass();
                if (this.b && (i10 = this.d) != 0 && this.e == i10) {
                    t6.p(this.c != -9223372036854775807L);
                    ((k0) this.g).c(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // j4.i
    public final void h(int i10, long j10) {
        switch (this.a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.b = true;
                    this.c = j10;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.b = true;
                    this.c = j10;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    public h() {
        this.a = 1;
        this.f = new e2.x(10);
        this.c = -9223372036854775807L;
    }
}
