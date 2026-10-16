package j4;

import b2.w0;
import c3.i0;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class c0 {
    public final /* synthetic */ int a;
    public final List b;
    public final i0[] c;
    public final e2.c d;

    public c0(int i10, List list) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = list;
                this.c = new i0[list.size()];
                e2.c cVar = new e2.c(new f1.a(this, 20));
                this.d = cVar;
                cVar.k(3);
                break;
            default:
                this.b = list;
                this.c = new i0[list.size()];
                this.d = new e2.c(new f1.a(this, 19));
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

    public final void b(c3.q qVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                while (true) {
                    i0[] i0VarArr = this.c;
                    if (i10 >= i0VarArr.length) {
                        break;
                    } else {
                        f0Var.b();
                        f0Var.c();
                        i0 W = qVar.W(f0Var.c, 3);
                        b2.x xVar = (b2.x) this.b.get(i10);
                        String str = xVar.s;
                        u6.h("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                        String str2 = xVar.a;
                        if (str2 == null) {
                            f0Var.c();
                            str2 = (String) f0Var.e;
                        }
                        b2.w wVar = new b2.w();
                        wVar.a = str2;
                        wVar.q = w0.n("video/mp2t");
                        wVar.r = w0.n(str);
                        wVar.e = xVar.e;
                        wVar.d = xVar.d;
                        wVar.O = xVar.P;
                        wVar.u = xVar.v;
                        i2.d.u(wVar, W);
                        i0VarArr[i10] = W;
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    i0[] i0VarArr2 = this.c;
                    if (i11 >= i0VarArr2.length) {
                        break;
                    } else {
                        f0Var.b();
                        f0Var.c();
                        i0 W2 = qVar.W(f0Var.c, 3);
                        b2.x xVar2 = (b2.x) this.b.get(i11);
                        String str3 = xVar2.s;
                        u6.h("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                        b2.w wVar2 = new b2.w();
                        f0Var.c();
                        wVar2.a = (String) f0Var.e;
                        wVar2.q = w0.n("video/mp2t");
                        wVar2.r = w0.n(str3);
                        wVar2.e = xVar2.e;
                        wVar2.d = xVar2.d;
                        wVar2.O = xVar2.P;
                        wVar2.u = xVar2.v;
                        i2.d.u(wVar2, W2);
                        i0VarArr2[i11] = W2;
                        i11++;
                    }
                }
                break;
        }
    }
}
