package l4;

import b8.zb;
import d2.u0;
import e3.i0;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // l4.i
    public final void a() {
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

    @Override // l4.i
    public final void c(g2.y yVar) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (yVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (yVar.A() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z11 = this.b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.d == 1) {
                        if (yVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (yVar.A() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z10 = this.b;
                        }
                        if (!z10) {
                        }
                    }
                    int i3 = yVar.b;
                    int a10 = yVar.a();
                    for (i0 i0Var : (i0[]) this.g) {
                        yVar.N(i3);
                        i0Var.e(a10, yVar);
                    }
                    this.e += a10;
                    break;
                }
                break;
            default:
                g2.y yVar2 = (g2.y) this.f;
                ((i0) this.g).getClass();
                if (this.b) {
                    int a11 = yVar.a();
                    int i10 = this.e;
                    if (i10 < 10) {
                        int min = Math.min(a11, 10 - i10);
                        System.arraycopy(yVar.a, yVar.b, yVar2.a, this.e, min);
                        if (this.e + min == 10) {
                            yVar2.N(0);
                            if (73 != yVar2.A() || 68 != yVar2.A() || 51 != yVar2.A()) {
                                g2.a.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                yVar2.O(3);
                                this.d = yVar2.z() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a11, this.d - this.e);
                    ((i0) this.g).e(min2, yVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // l4.i
    public final void d(boolean z10) {
        int i3;
        switch (this.a) {
            case 0:
                if (this.b) {
                    zb.p(this.c != -9223372036854775807L);
                    for (i0 i0Var : (i0[]) this.g) {
                        i0Var.d(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                ((i0) this.g).getClass();
                if (this.b && (i3 = this.d) != 0 && this.e == i3) {
                    zb.p(this.c != -9223372036854775807L);
                    ((i0) this.g).d(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // l4.i
    public final void e(int i3, long j10) {
        switch (this.a) {
            case 0:
                if ((i3 & 4) != 0) {
                    this.b = true;
                    this.c = j10;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i3 & 4) != 0) {
                    this.b = true;
                    this.c = j10;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // l4.i
    public final void f(e3.q qVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                i0[] i0VarArr = (i0[]) this.g;
                for (int i3 = 0; i3 < i0VarArr.length; i3++) {
                    e0 e0Var = (e0) ((List) this.f).get(i3);
                    f0Var.b();
                    f0Var.c();
                    i0 i02 = qVar.i0(f0Var.c, 3);
                    d2.u uVar = new d2.u();
                    f0Var.c();
                    uVar.a = (String) f0Var.e;
                    uVar.q = u0.n("video/mp2t");
                    uVar.r = u0.n("application/dvbsubs");
                    uVar.u = Collections.singletonList(e0Var.b);
                    uVar.d = e0Var.a;
                    f1.w(uVar, i02);
                    i0VarArr[i3] = i02;
                }
                break;
            default:
                f0Var.b();
                f0Var.c();
                i0 i03 = qVar.i0(f0Var.c, 5);
                this.g = i03;
                d2.u uVar2 = new d2.u();
                f0Var.c();
                uVar2.a = (String) f0Var.e;
                uVar2.q = u0.n("video/mp2t");
                uVar2.r = u0.n("application/id3");
                f1.w(uVar2, i03);
                break;
        }
    }

    public h() {
        this.a = 1;
        this.f = new g2.y(10);
        this.c = -9223372036854775807L;
    }
}
