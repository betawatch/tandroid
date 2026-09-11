package j4;

import b2.r0;
import c3.h0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        this.g = new h0[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // j4.i
    public final void b(e2.v vVar) {
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
                    for (h0 h0Var : (h0[]) this.g) {
                        vVar.J(i10);
                        h0Var.d(a2, vVar);
                    }
                    this.e += a2;
                    break;
                }
                break;
            default:
                e2.v vVar2 = (e2.v) this.f;
                e2.d.h((h0) this.g);
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
                    ((h0) this.g).d(min2, vVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // j4.i
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

    @Override // j4.i
    public final void e(c3.q qVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                h0[] h0VarArr = (h0[]) this.g;
                for (int i10 = 0; i10 < h0VarArr.length; i10++) {
                    e0 e0Var = (e0) ((List) this.f).get(i10);
                    f0Var.a();
                    f0Var.b();
                    h0 R1 = qVar.R1(f0Var.d, 3);
                    b2.r rVar = new b2.r();
                    f0Var.b();
                    rVar.a = f0Var.e;
                    rVar.p = r0.n("video/mp2t");
                    rVar.q = r0.n("application/dvbsubs");
                    rVar.t = Collections.singletonList(e0Var.b);
                    rVar.d = e0Var.a;
                    i2.g.u(rVar, R1);
                    h0VarArr[i10] = R1;
                }
                break;
            default:
                f0Var.a();
                f0Var.b();
                h0 R12 = qVar.R1(f0Var.d, 5);
                this.g = R12;
                b2.r rVar2 = new b2.r();
                f0Var.b();
                rVar2.a = f0Var.e;
                rVar2.p = r0.n("video/mp2t");
                rVar2.q = r0.n("application/id3");
                i2.g.u(rVar2, R12);
                break;
        }
    }

    @Override // j4.i
    public final void f(boolean z10) {
        int i10;
        switch (this.a) {
            case 0:
                if (this.b) {
                    e2.d.g(this.c != -9223372036854775807L);
                    for (h0 h0Var : (h0[]) this.g) {
                        h0Var.c(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                e2.d.h((h0) this.g);
                if (this.b && (i10 = this.d) != 0 && this.e == i10) {
                    e2.d.g(this.c != -9223372036854775807L);
                    ((h0) this.g).c(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // j4.i
    public final void g(int i10, long j3) {
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
