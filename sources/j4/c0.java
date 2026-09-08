package j4;

import b2.r0;
import c3.h0;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c0 {
    public final /* synthetic */ int a;
    public final List b;
    public final h0[] c;
    public final e2.c d;

    public c0(int i10, List list) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = list;
                this.c = new h0[list.size()];
                e2.c cVar = new e2.c(new fi.f(this, 20));
                this.d = cVar;
                cVar.k(3);
                break;
            default:
                this.b = list;
                this.c = new h0[list.size()];
                this.d = new e2.c(new fi.f(this, 19));
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

    public final void b(c3.q qVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                while (true) {
                    h0[] h0VarArr = this.c;
                    if (i10 >= h0VarArr.length) {
                        break;
                    } else {
                        f0Var.a();
                        f0Var.b();
                        h0 R1 = qVar.R1(f0Var.d, 3);
                        b2.s sVar = (b2.s) this.b.get(i10);
                        String str = sVar.r;
                        e2.d.a("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = sVar.a;
                        if (str2 == null) {
                            f0Var.b();
                            str2 = f0Var.e;
                        }
                        b2.r rVar = new b2.r();
                        rVar.a = str2;
                        rVar.p = r0.n("video/mp2t");
                        rVar.q = r0.n(str);
                        rVar.e = sVar.e;
                        rVar.d = sVar.d;
                        rVar.N = sVar.O;
                        rVar.t = sVar.u;
                        i2.g.u(rVar, R1);
                        h0VarArr[i10] = R1;
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    h0[] h0VarArr2 = this.c;
                    if (i11 >= h0VarArr2.length) {
                        break;
                    } else {
                        f0Var.a();
                        f0Var.b();
                        h0 R12 = qVar.R1(f0Var.d, 3);
                        b2.s sVar2 = (b2.s) this.b.get(i11);
                        String str3 = sVar2.r;
                        e2.d.a("Invalid closed caption MIME type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        b2.r rVar2 = new b2.r();
                        f0Var.b();
                        rVar2.a = f0Var.e;
                        rVar2.p = r0.n("video/mp2t");
                        rVar2.q = r0.n(str3);
                        rVar2.e = sVar2.e;
                        rVar2.d = sVar2.d;
                        rVar2.N = sVar2.O;
                        rVar2.t = sVar2.u;
                        i2.g.u(rVar2, R12);
                        h0VarArr2[i11] = R12;
                        i11++;
                    }
                }
                break;
        }
    }
}
