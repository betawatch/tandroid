package m4;

import a8.ia;
import e2.s0;
import f3.j0;
import java.util.List;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class c0 {
    public final /* synthetic */ int a;
    public final List b;
    public final j0[] c;
    public final h2.c d;

    public c0(int i7, List list) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = list;
                this.c = new j0[list.size()];
                h2.c cVar = new h2.c(new l2.y(this, 18));
                this.d = cVar;
                cVar.C(3);
                break;
            default:
                this.b = list;
                this.c = new j0[list.size()];
                this.d = new h2.c(new l2.y(this, 17));
                break;
        }
    }

    public void a(long j3, h2.x xVar) {
        if (xVar.a() < 9) {
            return;
        }
        int m10 = xVar.m();
        int m11 = xVar.m();
        int A = xVar.A();
        if (m10 == 434 && m11 == 1195456820 && A == 3) {
            this.d.a(j3, xVar);
        }
    }

    public final void b(f3.q qVar, g0 g0Var) {
        switch (this.a) {
            case 0:
                int i7 = 0;
                while (true) {
                    j0[] j0VarArr = this.c;
                    if (i7 >= j0VarArr.length) {
                        break;
                    } else {
                        g0Var.b();
                        g0Var.c();
                        j0 O1 = qVar.O1(g0Var.c, 3);
                        e2.u uVar = (e2.u) this.b.get(i7);
                        String str = uVar.s;
                        ia.h("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                        String str2 = uVar.a;
                        if (str2 == null) {
                            g0Var.c();
                            str2 = (String) g0Var.e;
                        }
                        e2.t tVar = new e2.t();
                        tVar.a = str2;
                        tVar.q = s0.n("video/mp2t");
                        tVar.r = s0.n(str);
                        tVar.e = uVar.e;
                        tVar.d = uVar.d;
                        tVar.O = uVar.P;
                        tVar.u = uVar.v;
                        f1.s(tVar, O1);
                        j0VarArr[i7] = O1;
                        i7++;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    j0[] j0VarArr2 = this.c;
                    if (i10 >= j0VarArr2.length) {
                        break;
                    } else {
                        g0Var.b();
                        g0Var.c();
                        j0 O12 = qVar.O1(g0Var.c, 3);
                        e2.u uVar2 = (e2.u) this.b.get(i10);
                        String str3 = uVar2.s;
                        ia.h("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                        e2.t tVar2 = new e2.t();
                        g0Var.c();
                        tVar2.a = (String) g0Var.e;
                        tVar2.q = s0.n("video/mp2t");
                        tVar2.r = s0.n(str3);
                        tVar2.e = uVar2.e;
                        tVar2.d = uVar2.d;
                        tVar2.O = uVar2.P;
                        tVar2.u = uVar2.v;
                        f1.s(tVar2, O12);
                        j0VarArr2[i10] = O12;
                        i10++;
                    }
                }
                break;
        }
    }
}
