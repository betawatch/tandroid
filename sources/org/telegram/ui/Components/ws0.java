package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ws0 extends org.telegram.ui.ActionBar.f5 {
    public final /* synthetic */ yu0 f;

    public ws0(yu0 yu0Var) {
        this.f = yu0Var;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void l() {
        this.f.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.f5
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
            ls0Var.d.M(new org.telegram.ui.gr(2));
            ls0Var.h = 0L;
            ls0Var.g(false);
        }
        et0 et0Var = yu0Var.T;
        if (et0Var != null) {
            org.telegram.ui.yn ynVar = et0Var.a;
            org.telegram.ui.pn pnVar = ynVar.nc;
            if (pnVar != null) {
                pnVar.m();
            }
            ynVar.s3 = false;
            ynVar.o0 = false;
            ynVar.hc(false);
            ynVar.Ic();
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
        bj0 bj0Var = yu0Var.s0;
        if (bj0Var != null) {
            bj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(rr.h).start();
        }
        if (yu0Var.z0) {
            yu0Var.z0 = false;
        } else {
            yu0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
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
        bj0 bj0Var = yu0Var.s0;
        if (bj0Var != null) {
            bj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(rr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void p(ci.h2 h2Var) {
        et0 et0Var = this.f.T;
        if (et0Var != null) {
            et0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        ju0 ju0Var;
        String obj = editText.getText().toString();
        yu0 yu0Var = this.f;
        et0 et0Var = yu0Var.T;
        if (et0Var != null) {
            org.telegram.ui.yn ynVar = et0Var.a;
            org.telegram.ui.ActionBar.v0 v0Var = ynVar.j0;
            if (v0Var != null) {
                ynVar.t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && yu0Var.W0 == null) {
                org.telegram.ui.yn ynVar2 = et0Var.a;
                org.telegram.ui.pn pnVar = ynVar2.nc;
                if (pnVar != null) {
                    pnVar.m();
                }
                ynVar2.s3 = false;
                ynVar2.o0 = false;
                ynVar2.hc(false);
                ynVar2.Ic();
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
