package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vs0 extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ yu0 f;

    public vs0(yu0 yu0Var) {
        this.f = yu0Var;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void l() {
        this.f.k0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        yu0 yu0Var = this.f;
        ks0 ks0Var = yu0Var.G0;
        ImageView imageView = yu0Var.o0;
        yu0Var.S0 = false;
        yu0Var.T0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.j0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && yu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ks0Var != null) {
            ks0Var.d.M(new org.telegram.ui.fr(2));
            ks0Var.h = 0L;
            ks0Var.g(false);
        }
        dt0 dt0Var = yu0Var.Q;
        if (dt0Var != null) {
            org.telegram.ui.yn ynVar = dt0Var.a;
            org.telegram.ui.pn pnVar = ynVar.lc;
            if (pnVar != null) {
                pnVar.m();
            }
            ynVar.p3 = false;
            ynVar.l0 = false;
            ynVar.hc(false);
            ynVar.Ic();
        }
        yu0Var.R0 = false;
        yu0Var.k0.setVisibility(0);
        yu0Var.d0.G(null, true);
        yu0Var.f0.G(null, true);
        yu0Var.e0.G(null, true);
        yu0Var.g0.F(null, true);
        ju0 ju0Var = yu0Var.P;
        if (ju0Var != null) {
            ju0Var.E(null, null);
        }
        yu0Var.K0(false);
        jj0 jj0Var = yu0Var.p0;
        if (jj0Var != null) {
            jj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(nr.h).start();
        }
        if (yu0Var.w0) {
            yu0Var.w0 = false;
        } else {
            yu0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
        yu0 yu0Var = this.f;
        yu0Var.S0 = true;
        ks0 ks0Var = yu0Var.G0;
        if (ks0Var != null) {
            ks0Var.g((yu0Var.getSelectedTab() == 11 || yu0Var.getSelectedTab() == 12) && ks0Var.a());
        }
        ImageView imageView = yu0Var.o0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.j0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        yu0Var.k0.setVisibility(8);
        yu0Var.K0(true);
        jj0 jj0Var = yu0Var.p0;
        if (jj0Var != null) {
            jj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(nr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void p(kg.f fVar) {
        dt0 dt0Var = this.f.Q;
        if (dt0Var != null) {
            dt0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        ju0 ju0Var;
        String obj = editText.getText().toString();
        yu0 yu0Var = this.f;
        dt0 dt0Var = yu0Var.Q;
        if (dt0Var != null) {
            org.telegram.ui.yn ynVar = dt0Var.a;
            org.telegram.ui.ActionBar.w0 w0Var = ynVar.g0;
            if (w0Var != null) {
                ynVar.q3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && yu0Var.T0 == null) {
                org.telegram.ui.yn ynVar2 = dt0Var.a;
                org.telegram.ui.pn pnVar = ynVar2.lc;
                if (pnVar != null) {
                    pnVar.m();
                }
                ynVar2.p3 = false;
                ynVar2.l0 = false;
                ynVar2.hc(false);
                ynVar2.Ic();
            }
        }
        yu0Var.k0.setVisibility(8);
        yu0Var.R0 = (obj.length() == 0 && yu0Var.T0 == null) ? false : true;
        yu0Var.post(new nq0(this, 2));
        int i10 = yu0Var.h0[0].C;
        if (i10 == 1) {
            tt0 tt0Var = yu0Var.d0;
            if (tt0Var == null) {
                return;
            }
            tt0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            tt0 tt0Var2 = yu0Var.f0;
            if (tt0Var2 == null) {
                return;
            }
            tt0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            tt0 tt0Var3 = yu0Var.e0;
            if (tt0Var3 == null) {
                return;
            }
            tt0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            ot0 ot0Var = yu0Var.g0;
            if (ot0Var == null) {
                return;
            }
            ot0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (ju0Var = yu0Var.P) == null) {
            return;
        }
        ju0Var.E(yu0Var.T0, obj);
    }
}
