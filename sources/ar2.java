// default package

import j$.util.Objects;
import java.io.IOException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ar2 implements zz6, nr3 {
    public final Integer a;
    public lp b;
    public mr3 c;
    public final /* synthetic */ cr2 d;

    public ar2(cr2 cr2Var, Integer num) {
        this.d = cr2Var;
        this.b = cr2Var.b(null);
        this.c = new mr3(cr2Var.d.c, 0, null);
        this.a = num;
    }

    @Override // nr3
    public final void I(int i, vz6 vz6Var) {
        if (a(i, vz6Var)) {
            this.c.e();
        }
    }

    @Override // nr3
    public final void N(int i, vz6 vz6Var, rj2 rj2Var) {
        if (a(i, vz6Var)) {
            this.c.a(rj2Var);
        }
    }

    @Override // zz6
    public final void O(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var, int i2) {
        if (a(i, vz6Var)) {
            lp lpVar = this.b;
            lpVar.h(new an((Object) lpVar, (Object) ja6Var, (Object) b(jt6Var, vz6Var), i2, (byte) 5));
        }
    }

    public final boolean a(int i, vz6 vz6Var) {
        vz6 vz6Var2;
        Integer num = this.a;
        cr2 cr2Var = this.d;
        if (vz6Var != null) {
            vz6Var2 = cr2Var.u(num, vz6Var);
            if (vz6Var2 == null) {
                return false;
            }
        } else {
            vz6Var2 = null;
        }
        int w = cr2Var.w(i, num);
        lp lpVar = this.b;
        if (lpVar.b != w || !Objects.equals((vz6) lpVar.c, vz6Var2)) {
            this.b = new lp(cr2Var.c.d, w, (Object) vz6Var2, (byte) 9);
        }
        mr3 mr3Var = this.c;
        if (mr3Var.a == w && Objects.equals(mr3Var.b, vz6Var2)) {
            return true;
        }
        this.c = new mr3(cr2Var.d.c, w, vz6Var2);
        return true;
    }

    public final jt6 b(jt6 jt6Var, vz6 vz6Var) {
        long j = jt6Var.f;
        cr2 cr2Var = this.d;
        Integer num = this.a;
        long v = cr2Var.v(j, num);
        long j2 = jt6Var.g;
        long v2 = cr2Var.v(j2, num);
        return (v == j && v2 == j2) ? jt6Var : new jt6(jt6Var.a, jt6Var.b, jt6Var.c, jt6Var.d, jt6Var.e, v, v2);
    }

    @Override // nr3
    public final void i(int i, vz6 vz6Var, Exception exc) {
        if (a(i, vz6Var)) {
            this.c.d(exc);
        }
    }

    @Override // zz6
    public final void j(int i, vz6 vz6Var, jt6 jt6Var) {
        if (a(i, vz6Var)) {
            lp lpVar = this.b;
            lpVar.h(new rm6(lpVar, b(jt6Var, vz6Var), (byte) 7));
        }
    }

    @Override // zz6
    public final void k(int i, vz6 vz6Var, jt6 jt6Var) {
        if (a(i, vz6Var)) {
            lp lpVar = this.b;
            jt6 b = b(jt6Var, vz6Var);
            vz6 vz6Var2 = (vz6) lpVar.c;
            vz6Var2.getClass();
            lpVar.h(new fu2((Object) lpVar, (Object) vz6Var2, (Object) b, (byte) 18));
        }
    }

    @Override // nr3
    public final void n(int i, vz6 vz6Var, int i2) {
        if (a(i, vz6Var)) {
            this.c.c(i2);
        }
    }

    @Override // zz6
    public final void s(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var) {
        if (a(i, vz6Var)) {
            lp lpVar = this.b;
            lpVar.h(new xz6(lpVar, ja6Var, b(jt6Var, vz6Var), (byte) 1));
        }
    }

    @Override // zz6
    public final void u(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var) {
        if (a(i, vz6Var)) {
            lp lpVar = this.b;
            lpVar.h(new xz6(lpVar, ja6Var, b(jt6Var, vz6Var), (byte) 0));
        }
    }

    @Override // zz6
    public final void w(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var, IOException iOException, boolean z) {
        if (a(i, vz6Var)) {
            lp lpVar = this.b;
            lpVar.h(new sf(lpVar, ja6Var, b(jt6Var, vz6Var), iOException, z));
        }
    }

    @Override // nr3
    public final void y(int i, vz6 vz6Var) {
        if (a(i, vz6Var)) {
            this.c.b();
        }
    }
}
