package m4;

import a8.la;
import e2.s0;
import f3.i0;
import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class c0 {
    public final /* synthetic */ int a;
    public final List b;
    public final i0[] c;
    public final h2.c d;

    public c0(int i7, List list) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = list;
                this.c = new i0[list.size()];
                h2.c cVar = new h2.c(new ki.e(this, 15));
                this.d = cVar;
                cVar.C(3);
                break;
            default:
                this.b = list;
                this.c = new i0[list.size()];
                this.d = new h2.c(new ki.e(this, 14));
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

    public final void b(f3.q qVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                int i7 = 0;
                while (true) {
                    i0[] i0VarArr = this.c;
                    if (i7 >= i0VarArr.length) {
                        break;
                    } else {
                        f0Var.b();
                        f0Var.c();
                        i0 d2 = qVar.d2(f0Var.c, 3);
                        e2.u uVar = (e2.u) this.b.get(i7);
                        String str = uVar.s;
                        la.h("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                        String str2 = uVar.a;
                        if (str2 == null) {
                            f0Var.c();
                            str2 = (String) f0Var.e;
                        }
                        e2.t tVar = new e2.t();
                        tVar.a = str2;
                        tVar.q = s0.n("video/mp2t");
                        tVar.r = s0.n(str);
                        tVar.e = uVar.e;
                        tVar.d = uVar.d;
                        tVar.O = uVar.P;
                        tVar.u = uVar.v;
                        p5.c.r(tVar, d2);
                        i0VarArr[i7] = d2;
                        i7++;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    i0[] i0VarArr2 = this.c;
                    if (i10 >= i0VarArr2.length) {
                        break;
                    } else {
                        f0Var.b();
                        f0Var.c();
                        i0 d22 = qVar.d2(f0Var.c, 3);
                        e2.u uVar2 = (e2.u) this.b.get(i10);
                        String str3 = uVar2.s;
                        la.h("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                        e2.t tVar2 = new e2.t();
                        f0Var.c();
                        tVar2.a = (String) f0Var.e;
                        tVar2.q = s0.n("video/mp2t");
                        tVar2.r = s0.n(str3);
                        tVar2.e = uVar2.e;
                        tVar2.d = uVar2.d;
                        tVar2.O = uVar2.P;
                        tVar2.u = uVar2.v;
                        p5.c.r(tVar2, d22);
                        i0VarArr2[i10] = d22;
                        i10++;
                    }
                }
                break;
        }
    }
}
