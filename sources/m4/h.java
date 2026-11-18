package m4;

import a8.la;
import e2.s0;
import f3.i0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        this.g = new i0[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // m4.i
    public final void c(h2.x xVar) {
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
                    int i7 = xVar.b;
                    int a10 = xVar.a();
                    for (i0 i0Var : (i0[]) this.g) {
                        xVar.N(i7);
                        i0Var.b(a10, xVar);
                    }
                    this.e += a10;
                    break;
                }
                break;
            default:
                h2.x xVar2 = (h2.x) this.f;
                ((i0) this.g).getClass();
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
                    ((i0) this.g).b(min2, xVar);
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
    public final void e(boolean z10) {
        int i7;
        switch (this.a) {
            case 0:
                if (this.b) {
                    la.p(this.c != -9223372036854775807L);
                    for (i0 i0Var : (i0[]) this.g) {
                        i0Var.c(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                ((i0) this.g).getClass();
                if (this.b && (i7 = this.d) != 0 && this.e == i7) {
                    la.p(this.c != -9223372036854775807L);
                    ((i0) this.g).c(this.c, 1, this.d, 0, null);
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
    public final void g(f3.q qVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                i0[] i0VarArr = (i0[]) this.g;
                for (int i7 = 0; i7 < i0VarArr.length; i7++) {
                    e0 e0Var = (e0) ((List) this.f).get(i7);
                    f0Var.b();
                    f0Var.c();
                    i0 d2 = qVar.d2(f0Var.c, 3);
                    e2.t tVar = new e2.t();
                    f0Var.c();
                    tVar.a = (String) f0Var.e;
                    tVar.q = s0.n("video/mp2t");
                    tVar.r = s0.n("application/dvbsubs");
                    tVar.u = Collections.singletonList(e0Var.b);
                    tVar.d = e0Var.a;
                    p5.c.r(tVar, d2);
                    i0VarArr[i7] = d2;
                }
                break;
            default:
                f0Var.b();
                f0Var.c();
                i0 d22 = qVar.d2(f0Var.c, 5);
                this.g = d22;
                e2.t tVar2 = new e2.t();
                f0Var.c();
                tVar2.a = (String) f0Var.e;
                tVar2.q = s0.n("video/mp2t");
                tVar2.r = s0.n("application/id3");
                p5.c.r(tVar2, d22);
                break;
        }
    }

    public h() {
        this.a = 1;
        this.f = new h2.x(10);
        this.c = -9223372036854775807L;
    }
}
