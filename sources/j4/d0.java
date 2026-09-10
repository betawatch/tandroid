package j4;

import b2.r0;
import hi.y1;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d0 {
    public final /* synthetic */ int a;
    public final List b;
    public final c3.h0[] c;
    public final e2.c d;

    public d0(int i10, List list) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = list;
                this.c = new c3.h0[list.size()];
                e2.c cVar = new e2.c(new y1(this, 19));
                this.d = cVar;
                cVar.k(3);
                break;
            default:
                this.b = list;
                this.c = new c3.h0[list.size()];
                this.d = new e2.c(new y1(this, 18));
                break;
        }
    }

    public void a(long j3, e2.v vVar) {
        if (vVar.a() < 9) {
            return;
        }
        int j10 = vVar.j();
        int j11 = vVar.j();
        int x10 = vVar.x();
        if (j10 == 434 && j11 == 1195456820 && x10 == 3) {
            this.d.a(j3, vVar);
        }
    }

    public final void b(c3.q qVar, g0 g0Var) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                while (true) {
                    c3.h0[] h0VarArr = this.c;
                    if (i10 >= h0VarArr.length) {
                        break;
                    } else {
                        g0Var.a();
                        g0Var.b();
                        c3.h0 I = qVar.I(g0Var.d, 3);
                        b2.s sVar = (b2.s) this.b.get(i10);
                        String str = sVar.r;
                        e2.d.a("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = sVar.a;
                        if (str2 == null) {
                            g0Var.b();
                            str2 = g0Var.e;
                        }
                        b2.r rVar = new b2.r();
                        rVar.a = str2;
                        rVar.p = r0.n("video/mp2t");
                        rVar.q = r0.n(str);
                        rVar.e = sVar.e;
                        rVar.d = sVar.d;
                        rVar.N = sVar.O;
                        rVar.t = sVar.u;
                        hc.b.u(rVar, I);
                        h0VarArr[i10] = I;
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    c3.h0[] h0VarArr2 = this.c;
                    if (i11 >= h0VarArr2.length) {
                        break;
                    } else {
                        g0Var.a();
                        g0Var.b();
                        c3.h0 I2 = qVar.I(g0Var.d, 3);
                        b2.s sVar2 = (b2.s) this.b.get(i11);
                        String str3 = sVar2.r;
                        e2.d.a("Invalid closed caption MIME type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        b2.r rVar2 = new b2.r();
                        g0Var.b();
                        rVar2.a = g0Var.e;
                        rVar2.p = r0.n("video/mp2t");
                        rVar2.q = r0.n(str3);
                        rVar2.e = sVar2.e;
                        rVar2.d = sVar2.d;
                        rVar2.N = sVar2.O;
                        rVar2.t = sVar2.u;
                        hc.b.u(rVar2, I2);
                        h0VarArr2[i11] = I2;
                        i11++;
                    }
                }
                break;
        }
    }
}
