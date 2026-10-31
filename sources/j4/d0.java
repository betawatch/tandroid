package j4;

import b2.v0;
import c3.k0;
import java.util.List;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d0 {
    public final /* synthetic */ int a;
    public final List b;
    public final k0[] c;
    public final e2.c d;

    public d0(int i10, List list) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = list;
                this.c = new k0[list.size()];
                e2.c cVar = new e2.c(new ig.c0(this, 7));
                this.d = cVar;
                cVar.p(3);
                break;
            default:
                this.b = list;
                this.c = new k0[list.size()];
                this.d = new e2.c(new ig.c0(this, 6));
                break;
        }
    }

    public void a(long j10, e2.x xVar) {
        if (xVar.a() < 9) {
            return;
        }
        int m10 = xVar.m();
        int m11 = xVar.m();
        int A = xVar.A();
        if (m10 == 434 && m11 == 1195456820 && A == 3) {
            this.d.a(j10, xVar);
        }
    }

    public final void b(c3.q qVar, g0 g0Var) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                while (true) {
                    k0[] k0VarArr = this.c;
                    if (i10 >= k0VarArr.length) {
                        break;
                    } else {
                        g0Var.b();
                        g0Var.c();
                        k0 I1 = qVar.I1(g0Var.c, 3);
                        b2.x xVar = (b2.x) this.b.get(i10);
                        String str = xVar.s;
                        t6.h("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                        String str2 = xVar.a;
                        if (str2 == null) {
                            g0Var.c();
                            str2 = (String) g0Var.e;
                        }
                        b2.w wVar = new b2.w();
                        wVar.a = str2;
                        wVar.q = v0.n("video/mp2t");
                        wVar.r = v0.n(str);
                        wVar.e = xVar.e;
                        wVar.d = xVar.d;
                        wVar.O = xVar.P;
                        wVar.u = xVar.v;
                        i0.a.r(wVar, I1);
                        k0VarArr[i10] = I1;
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    k0[] k0VarArr2 = this.c;
                    if (i11 >= k0VarArr2.length) {
                        break;
                    } else {
                        g0Var.b();
                        g0Var.c();
                        k0 I12 = qVar.I1(g0Var.c, 3);
                        b2.x xVar2 = (b2.x) this.b.get(i11);
                        String str3 = xVar2.s;
                        t6.h("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                        b2.w wVar2 = new b2.w();
                        g0Var.c();
                        wVar2.a = (String) g0Var.e;
                        wVar2.q = v0.n("video/mp2t");
                        wVar2.r = v0.n(str3);
                        wVar2.e = xVar2.e;
                        wVar2.d = xVar2.d;
                        wVar2.O = xVar2.P;
                        wVar2.u = xVar2.v;
                        i0.a.r(wVar2, I12);
                        k0VarArr2[i11] = I12;
                        i11++;
                    }
                }
                break;
        }
    }
}
