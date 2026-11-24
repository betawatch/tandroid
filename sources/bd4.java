// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bd4 extends ka {
    public final /* synthetic */ cd4 d;

    public bd4(cd4 cd4Var) {
        this.d = cd4Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 8 || i == 7;
    }

    public final w39 F() {
        return this.d.n1.getAdapter();
    }

    @Override // w39
    public final int b() {
        return this.d.Z1.size();
    }

    @Override // w39
    public final int d(int i) {
        return ((gd4) this.d.Z1.get(i)).a;
    }

    @Override // w39
    public final void f() {
        F().f();
    }

    @Override // w39
    public final void g(int i) {
        F().g(i + 1);
    }

    @Override // w39
    public final void j(int i, int i2) {
        F().j(i + 1, i2);
    }

    @Override // w39
    public final void l(int i, int i2) {
        F().l(i + 1, i2);
    }

    @Override // w39
    public final void n(int i, int i2, Object obj) {
        F().n(i + 1, i2, obj);
    }

    @Override // w39
    public final void p(int i, int i2) {
        F().p(i + 1, i2);
    }

    @Override // w39
    public final void q(int i, int i2) {
        F().q(i + 1, i2);
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3 = s49Var.f;
        View view = s49Var.a;
        ArrayList arrayList = this.d.Z1;
        gd4 gd4Var = (gd4) arrayList.get(i);
        int i4 = i + 1;
        boolean z = (i4 >= arrayList.size() || (i2 = ((gd4) arrayList.get(i4)).a) == 3 || i2 == 6) ? false : true;
        if (i3 == 7) {
            ((jd4) view).e(gd4Var.m, z);
            return;
        }
        if (i3 == 6 || i3 == 3) {
            mhb mhbVar = (mhb) view;
            if (i3 == 6) {
                mhbVar.setFixedSize(0);
                mhbVar.setText(gd4Var.d);
                return;
            } else {
                mhbVar.setFixedSize(12);
                mhbVar.setText("");
                return;
            }
        }
        if (i3 == 0 || i3 != 8) {
            return;
        }
        yc4 yc4Var = (yc4) view;
        yc4Var.a.setText(k96.M0(2131751702, null));
        if (yc4Var.c != z) {
            yc4Var.c = z;
            yc4Var.setWillNotDraw(!z);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View mhbVar;
        cd4 cd4Var = this.d;
        if (i == 8) {
            mhbVar = new yc4(cd4Var.getContext());
            zkb.h(bkb.g5, null, mhbVar);
        } else if (i == 7) {
            ad4 ad4Var = new ad4(this, cd4Var.getContext(), cd4Var.a, cd4Var.T1.a);
            zkb.h(bkb.g5, null, ad4Var);
            mhbVar = ad4Var;
        } else if (i == 6 || i == 3) {
            mhbVar = new mhb(cd4Var.getContext());
            zkb.h(bkb.Z6, null, mhbVar);
        } else {
            mhbVar = new yc(cd4Var, cd4Var.getContext());
        }
        return new y29(mhbVar);
    }
}
