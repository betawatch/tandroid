// default package

import android.util.Pair;
import java.io.IOException;
import java.io.Serializable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class f07 implements zz6, nr3 {
    public final h07 a;
    public final /* synthetic */ i07 b;

    public f07(i07 i07Var, h07 h07Var) {
        this.b = i07Var;
        this.a = h07Var;
    }

    @Override // nr3
    public final void I(int i, vz6 vz6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new e07(this, a, (byte) 0));
        }
    }

    @Override // nr3
    public final void N(int i, vz6 vz6Var, rj2 rj2Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new yg6(this, a, rj2Var, (byte) 13));
        }
    }

    @Override // zz6
    public final void O(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var, int i2) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new l77((Object) this, (Object) a, (Object) ja6Var, (Object) jt6Var, i2, (byte) 21));
        }
    }

    public final Pair a(int i, vz6 vz6Var) {
        vz6 vz6Var2;
        h07 h07Var = this.a;
        vz6 vz6Var3 = null;
        if (vz6Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= h07Var.c.size()) {
                    vz6Var2 = null;
                    break;
                }
                if (((vz6) h07Var.c.get(i2)).d == vz6Var.d) {
                    Object obj = vz6Var.a;
                    Object obj2 = h07Var.b;
                    int i3 = rg8.n;
                    vz6Var2 = vz6Var.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (vz6Var2 == null) {
                return null;
            }
            vz6Var3 = vz6Var2;
        }
        return Pair.create(Integer.valueOf(i + h07Var.d), vz6Var3);
    }

    @Override // nr3
    public final void i(int i, vz6 vz6Var, Exception exc) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new yg6(this, a, exc, (byte) 14));
        }
    }

    @Override // zz6
    public final void j(int i, vz6 vz6Var, jt6 jt6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new c07(this, a, jt6Var, (byte) 1));
        }
    }

    @Override // zz6
    public final void k(int i, vz6 vz6Var, jt6 jt6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new c07(this, a, jt6Var, (byte) 0));
        }
    }

    @Override // nr3
    public final void n(int i, vz6 vz6Var, int i2) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new sb4((Object) this, (Object) a, i2, (byte) 9));
        }
    }

    @Override // zz6
    public final void s(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new d07(this, a, ja6Var, jt6Var, (byte) 0));
        }
    }

    @Override // zz6
    public final void u(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new d07(this, a, ja6Var, jt6Var, (byte) 1));
        }
    }

    @Override // zz6
    public final void w(int i, vz6 vz6Var, ja6 ja6Var, jt6 jt6Var, IOException iOException, boolean z) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new y6a((Object) this, (Object) a, (Object) ja6Var, (Object) jt6Var, (Serializable) iOException, z, (byte) 10));
        }
    }

    @Override // nr3
    public final void y(int i, vz6 vz6Var) {
        Pair a = a(i, vz6Var);
        if (a != null) {
            this.b.j.e(new e07(this, a, (byte) 1));
        }
    }
}
