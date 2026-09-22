package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ws0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ yu0 f;

    public ws0(yu0 yu0Var) {
        this.f = yu0Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void l() {
        this.f.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        yu0 yu0Var = this.f;
        ls0 ls0Var = yu0Var.J0;
        ImageView imageView = yu0Var.r0;
        yu0Var.V0 = false;
        yu0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && yu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ls0Var != null) {
            ls0Var.d.M(new org.telegram.ui.kr(2));
            ls0Var.h = 0L;
            ls0Var.g(false);
        }
        et0 et0Var = yu0Var.T;
        if (et0Var != null) {
            org.telegram.ui.co coVar = et0Var.a;
            org.telegram.ui.tn tnVar = coVar.nc;
            if (tnVar != null) {
                tnVar.m();
            }
            coVar.s3 = false;
            coVar.o0 = false;
            coVar.hc(false);
            coVar.Ic();
        }
        yu0Var.U0 = false;
        yu0Var.n0.setVisibility(0);
        yu0Var.g0.G(null, true);
        yu0Var.i0.G(null, true);
        yu0Var.h0.G(null, true);
        yu0Var.j0.F(null, true);
        ju0 ju0Var = yu0Var.S;
        if (ju0Var != null) {
            ju0Var.E(null, null);
        }
        yu0Var.K0(false);
        aj0 aj0Var = yu0Var.s0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
        if (yu0Var.z0) {
            yu0Var.z0 = false;
        } else {
            yu0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        yu0 yu0Var = this.f;
        yu0Var.V0 = true;
        ls0 ls0Var = yu0Var.J0;
        if (ls0Var != null) {
            ls0Var.g((yu0Var.getSelectedTab() == 11 || yu0Var.getSelectedTab() == 12) && ls0Var.a());
        }
        ImageView imageView = yu0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        yu0Var.n0.setVisibility(8);
        yu0Var.K0(true);
        aj0 aj0Var = yu0Var.s0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ci.h2 h2Var) {
        et0 et0Var = this.f.T;
        if (et0Var != null) {
            et0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        ju0 ju0Var;
        String obj = editText.getText().toString();
        yu0 yu0Var = this.f;
        et0 et0Var = yu0Var.T;
        if (et0Var != null) {
            org.telegram.ui.co coVar = et0Var.a;
            org.telegram.ui.ActionBar.v0 v0Var = coVar.j0;
            if (v0Var != null) {
                coVar.t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && yu0Var.W0 == null) {
                org.telegram.ui.co coVar2 = et0Var.a;
                org.telegram.ui.tn tnVar = coVar2.nc;
                if (tnVar != null) {
                    tnVar.m();
                }
                coVar2.s3 = false;
                coVar2.o0 = false;
                coVar2.hc(false);
                coVar2.Ic();
            }
        }
        yu0Var.n0.setVisibility(8);
        yu0Var.U0 = (obj.length() == 0 && yu0Var.W0 == null) ? false : true;
        yu0Var.post(new jq0(this, 2));
        int i10 = yu0Var.k0[0].F;
        if (i10 == 1) {
            ut0 ut0Var = yu0Var.g0;
            if (ut0Var == null) {
                return;
            }
            ut0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            ut0 ut0Var2 = yu0Var.i0;
            if (ut0Var2 == null) {
                return;
            }
            ut0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            ut0 ut0Var3 = yu0Var.h0;
            if (ut0Var3 == null) {
                return;
            }
            ut0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            pt0 pt0Var = yu0Var.j0;
            if (pt0Var == null) {
                return;
            }
            pt0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (ju0Var = yu0Var.S) == null) {
            return;
        }
        ju0Var.E(yu0Var.W0, obj);
    }
}
