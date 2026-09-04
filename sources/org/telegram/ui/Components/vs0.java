package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class vs0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ xu0 f;

    public vs0(xu0 xu0Var) {
        this.f = xu0Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void l() {
        this.f.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        xu0 xu0Var = this.f;
        ks0 ks0Var = xu0Var.J0;
        ImageView imageView = xu0Var.r0;
        xu0Var.V0 = false;
        xu0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = xu0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && xu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ks0Var != null) {
            ks0Var.d.M(new org.telegram.ui.lr(2));
            ks0Var.h = 0L;
            ks0Var.g(false);
        }
        dt0 dt0Var = xu0Var.T;
        if (dt0Var != null) {
            org.telegram.ui.eo eoVar = dt0Var.a;
            org.telegram.ui.un unVar = eoVar.oc;
            if (unVar != null) {
                unVar.m();
            }
            eoVar.s3 = false;
            eoVar.o0 = false;
            eoVar.hc(false);
            eoVar.Ic();
        }
        xu0Var.U0 = false;
        xu0Var.n0.setVisibility(0);
        xu0Var.g0.G(null, true);
        xu0Var.i0.G(null, true);
        xu0Var.h0.G(null, true);
        xu0Var.j0.F(null, true);
        iu0 iu0Var = xu0Var.S;
        if (iu0Var != null) {
            iu0Var.E(null, null);
        }
        xu0Var.K0(false);
        aj0 aj0Var = xu0Var.s0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(pr.h).start();
        }
        if (xu0Var.z0) {
            xu0Var.z0 = false;
        } else {
            xu0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        xu0 xu0Var = this.f;
        xu0Var.V0 = true;
        ks0 ks0Var = xu0Var.J0;
        if (ks0Var != null) {
            ks0Var.g((xu0Var.getSelectedTab() == 11 || xu0Var.getSelectedTab() == 12) && ks0Var.a());
        }
        ImageView imageView = xu0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = xu0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        xu0Var.n0.setVisibility(8);
        xu0Var.K0(true);
        aj0 aj0Var = xu0Var.s0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(pr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(di.h2 h2Var) {
        dt0 dt0Var = this.f.T;
        if (dt0Var != null) {
            dt0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        iu0 iu0Var;
        String obj = editText.getText().toString();
        xu0 xu0Var = this.f;
        dt0 dt0Var = xu0Var.T;
        if (dt0Var != null) {
            org.telegram.ui.eo eoVar = dt0Var.a;
            org.telegram.ui.ActionBar.v0 v0Var = eoVar.j0;
            if (v0Var != null) {
                eoVar.t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && xu0Var.W0 == null) {
                org.telegram.ui.eo eoVar2 = dt0Var.a;
                org.telegram.ui.un unVar = eoVar2.oc;
                if (unVar != null) {
                    unVar.m();
                }
                eoVar2.s3 = false;
                eoVar2.o0 = false;
                eoVar2.hc(false);
                eoVar2.Ic();
            }
        }
        xu0Var.n0.setVisibility(8);
        xu0Var.U0 = (obj.length() == 0 && xu0Var.W0 == null) ? false : true;
        xu0Var.post(new jq0(this, 2));
        int i10 = xu0Var.k0[0].F;
        if (i10 == 1) {
            tt0 tt0Var = xu0Var.g0;
            if (tt0Var == null) {
                return;
            }
            tt0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            tt0 tt0Var2 = xu0Var.i0;
            if (tt0Var2 == null) {
                return;
            }
            tt0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            tt0 tt0Var3 = xu0Var.h0;
            if (tt0Var3 == null) {
                return;
            }
            tt0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            ot0 ot0Var = xu0Var.j0;
            if (ot0Var == null) {
                return;
            }
            ot0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (iu0Var = xu0Var.S) == null) {
            return;
        }
        iu0Var.E(xu0Var.W0, obj);
    }
}
