package j4;

import a8.yb;
import b2.w0;
import c3.j0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // j4.i
    public final void a(e2.x xVar) {
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
                    for (j0 j0Var : (j0[]) this.g) {
                        xVar.N(i10);
                        j0Var.d(a2, xVar);
                    }
                    this.e += a2;
                    break;
                }
                break;
            default:
                e2.x xVar2 = (e2.x) this.f;
                ((j0) this.g).getClass();
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
                    ((j0) this.g).d(min2, xVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // j4.i
    public final void c() {
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
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                j0[] j0VarArr = (j0[]) this.g;
                for (int i10 = 0; i10 < j0VarArr.length; i10++) {
                    e0 e0Var = (e0) ((List) this.f).get(i10);
                    f0Var.b();
                    f0Var.c();
                    j0 F1 = qVar.F1(f0Var.c, 3);
                    b2.w wVar = new b2.w();
                    f0Var.c();
                    wVar.a = (String) f0Var.e;
                    wVar.q = w0.n("video/mp2t");
                    wVar.r = w0.n("application/dvbsubs");
                    wVar.u = Collections.singletonList(e0Var.b);
                    wVar.d = e0Var.a;
                    ic.a.u(wVar, F1);
                    j0VarArr[i10] = F1;
                }
                break;
            default:
                f0Var.b();
                f0Var.c();
                j0 F12 = qVar.F1(f0Var.c, 5);
                this.g = F12;
                b2.w wVar2 = new b2.w();
                f0Var.c();
                wVar2.a = (String) f0Var.e;
                wVar2.q = w0.n("video/mp2t");
                wVar2.r = w0.n("application/id3");
                ic.a.u(wVar2, F12);
                break;
        }
    }

    @Override // j4.i
    public final void e(boolean z10) {
        int i10;
        switch (this.a) {
            case 0:
                if (this.b) {
                    yb.p(this.c != -9223372036854775807L);
                    for (j0 j0Var : (j0[]) this.g) {
                        j0Var.c(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                ((j0) this.g).getClass();
                if (this.b && (i10 = this.d) != 0 && this.e == i10) {
                    yb.p(this.c != -9223372036854775807L);
                    ((j0) this.g).c(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // j4.i
    public final void f(int i10, long j10) {
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
