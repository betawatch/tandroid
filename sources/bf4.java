// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bf4 extends ka {
    public final /* synthetic */ cf4 d;

    public bf4(cf4 cf4Var) {
        this.d = cf4Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 8 || i == 7;
    }

    public final y59 F() {
        return this.d.n1.getAdapter();
    }

    @Override // y59
    public final int b() {
        return this.d.Z1.size();
    }

    @Override // y59
    public final int d(int i) {
        return ((gf4) this.d.Z1.get(i)).a;
    }

    @Override // y59
    public final void f() {
        F().f();
    }

    @Override // y59
    public final void g(int i) {
        F().g(i + 1);
    }

    @Override // y59
    public final void j(int i, int i2) {
        F().j(i + 1, i2);
    }

    @Override // y59
    public final void l(int i, int i2) {
        F().l(i + 1, i2);
    }

    @Override // y59
    public final void n(int i, int i2, Object obj) {
        F().n(i + 1, i2, obj);
    }

    @Override // y59
    public final void p(int i, int i2) {
        F().p(i + 1, i2);
    }

    @Override // y59
    public final void q(int i, int i2) {
        F().q(i + 1, i2);
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3 = u69Var.f;
        View view = u69Var.a;
        ArrayList arrayList = this.d.Z1;
        gf4 gf4Var = (gf4) arrayList.get(i);
        int i4 = i + 1;
        boolean z = (i4 >= arrayList.size() || (i2 = ((gf4) arrayList.get(i4)).a) == 3 || i2 == 6) ? false : true;
        if (i3 == 7) {
            ((kf4) view).e(gf4Var.m, z);
            return;
        }
        if (i3 == 6 || i3 == 3) {
            njb njbVar = (njb) view;
            if (i3 == 6) {
                njbVar.setFixedSize(0);
                njbVar.setText(gf4Var.d);
                return;
            } else {
                njbVar.setFixedSize(12);
                njbVar.setText("");
                return;
            }
        }
        if (i3 == 0 || i3 != 8) {
            return;
        }
        ye4 ye4Var = (ye4) view;
        ye4Var.a.setText(jb6.M0(2131751651, null));
        if (ye4Var.c != z) {
            ye4Var.c = z;
            ye4Var.setWillNotDraw(!z);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View njbVar;
        cf4 cf4Var = this.d;
        if (i == 8) {
            njbVar = new ye4(cf4Var.getContext());
            anb.h(cmb.g5, null, njbVar);
        } else if (i == 7) {
            af4 af4Var = new af4(this, cf4Var.getContext(), cf4Var.a, cf4Var.T1.a);
            anb.h(cmb.g5, null, af4Var);
            njbVar = af4Var;
        } else if (i == 6 || i == 3) {
            njbVar = new njb(cf4Var.getContext());
            anb.h(cmb.Z6, null, njbVar);
        } else {
            njbVar = new yd(cf4Var, cf4Var.getContext());
        }
        return new b59(njbVar);
    }
}
