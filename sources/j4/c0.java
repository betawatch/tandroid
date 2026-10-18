package j4;

import b2.v0;
import c3.j0;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class c0 {
    public final /* synthetic */ int a;
    public final List b;
    public final j0[] c;
    public final e2.c d;

    public c0(int i10, List list) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = list;
                this.c = new j0[list.size()];
                e2.c cVar = new e2.c(new e1.c(this, 29));
                this.d = cVar;
                cVar.k(3);
                break;
            default:
                this.b = list;
                this.c = new j0[list.size()];
                this.d = new e2.c(new e1.c(this, 28));
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
                    j0[] j0VarArr = this.c;
                    if (i10 >= j0VarArr.length) {
                        break;
                    } else {
                        f0Var.b();
                        f0Var.c();
                        j0 j02 = qVar.j0(f0Var.c, 3);
                        b2.w wVar = (b2.w) this.b.get(i10);
                        String str = wVar.s;
                        u6.h("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                        String str2 = wVar.a;
                        if (str2 == null) {
                            f0Var.c();
                            str2 = (String) f0Var.e;
                        }
                        b2.v vVar = new b2.v();
                        vVar.a = str2;
                        vVar.q = v0.n("video/mp2t");
                        vVar.r = v0.n(str);
                        vVar.e = wVar.e;
                        vVar.d = wVar.d;
                        vVar.O = wVar.P;
                        vVar.u = wVar.v;
                        i2.d.u(vVar, j02);
                        j0VarArr[i10] = j02;
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    j0[] j0VarArr2 = this.c;
                    if (i11 >= j0VarArr2.length) {
                        break;
                    } else {
                        f0Var.b();
                        f0Var.c();
                        j0 j03 = qVar.j0(f0Var.c, 3);
                        b2.w wVar2 = (b2.w) this.b.get(i11);
                        String str3 = wVar2.s;
                        u6.h("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                        b2.v vVar2 = new b2.v();
                        f0Var.c();
                        vVar2.a = (String) f0Var.e;
                        vVar2.q = v0.n("video/mp2t");
                        vVar2.r = v0.n(str3);
                        vVar2.e = wVar2.e;
                        vVar2.d = wVar2.d;
                        vVar2.O = wVar2.P;
                        vVar2.u = wVar2.v;
                        i2.d.u(vVar2, j03);
                        j0VarArr2[i11] = j03;
                        i11++;
                    }
                }
                break;
        }
    }
}
