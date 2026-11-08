package m4;

import a8.ia;
import e2.s0;
import f3.j0;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        this.g = new j0[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // m4.i
    public final void c(h2.x xVar) {
        boolean z9;
        boolean z10;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (xVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (xVar.A() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z10 = this.b;
                        }
                        if (!z10) {
                        }
                    }
                    if (this.d == 1) {
                        if (xVar.a() == 0) {
                            z9 = false;
                        } else {
                            if (xVar.A() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z9 = this.b;
                        }
                        if (!z9) {
                        }
                    }
                    int i7 = xVar.b;
                    int a10 = xVar.a();
                    for (j0 j0Var : (j0[]) this.g) {
                        xVar.N(i7);
                        j0Var.b(a10, xVar);
                    }
                    this.e += a10;
                    break;
                }
                break;
            default:
                h2.x xVar2 = (h2.x) this.f;
                ((j0) this.g).getClass();
                if (this.b) {
                    int a11 = xVar.a();
                    int i10 = this.e;
                    if (i10 < 10) {
                        int min = Math.min(a11, 10 - i10);
                        System.arraycopy(xVar.a, xVar.b, xVar2.a, this.e, min);
                        if (this.e + min == 10) {
                            xVar2.N(0);
                            if (73 != xVar2.A() || 68 != xVar2.A() || 51 != xVar2.A()) {
                                h2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                xVar2.O(3);
                                this.d = xVar2.z() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a11, this.d - this.e);
                    ((j0) this.g).b(min2, xVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // m4.i
    public final void d() {
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

    @Override // m4.i
    public final void e(boolean z9) {
        int i7;
        switch (this.a) {
            case 0:
                if (this.b) {
                    ia.p(this.c != -9223372036854775807L);
                    for (j0 j0Var : (j0[]) this.g) {
                        j0Var.c(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                ((j0) this.g).getClass();
                if (this.b && (i7 = this.d) != 0 && this.e == i7) {
                    ia.p(this.c != -9223372036854775807L);
                    ((j0) this.g).c(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // m4.i
    public final void f(int i7, long j3) {
        switch (this.a) {
            case 0:
                if ((i7 & 4) != 0) {
                    this.b = true;
                    this.c = j3;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i7 & 4) != 0) {
                    this.b = true;
                    this.c = j3;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // m4.i
    public final void g(f3.q qVar, g0 g0Var) {
        switch (this.a) {
            case 0:
                j0[] j0VarArr = (j0[]) this.g;
                for (int i7 = 0; i7 < j0VarArr.length; i7++) {
                    f0 f0Var = (f0) ((List) this.f).get(i7);
                    g0Var.b();
                    g0Var.c();
                    j0 O1 = qVar.O1(g0Var.c, 3);
                    e2.t tVar = new e2.t();
                    g0Var.c();
                    tVar.a = (String) g0Var.e;
                    tVar.q = s0.n("video/mp2t");
                    tVar.r = s0.n("application/dvbsubs");
                    tVar.u = Collections.singletonList(f0Var.b);
                    tVar.d = f0Var.a;
                    f1.s(tVar, O1);
                    j0VarArr[i7] = O1;
                }
                break;
            default:
                g0Var.b();
                g0Var.c();
                j0 O12 = qVar.O1(g0Var.c, 5);
                this.g = O12;
                e2.t tVar2 = new e2.t();
                g0Var.c();
                tVar2.a = (String) g0Var.e;
                tVar2.q = s0.n("video/mp2t");
                tVar2.r = s0.n("application/id3");
                f1.s(tVar2, O12);
                break;
        }
    }

    public h() {
        this.a = 1;
        this.f = new h2.x(10);
        this.c = -9223372036854775807L;
    }
}
