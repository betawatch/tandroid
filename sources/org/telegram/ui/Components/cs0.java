package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cs0 extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ eu0 f;

    public cs0(eu0 eu0Var) {
        this.f = eu0Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void l() {
        this.f.j0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        eu0 eu0Var = this.f;
        rr0 rr0Var = eu0Var.F0;
        ImageView imageView = eu0Var.n0;
        eu0Var.R0 = false;
        eu0Var.S0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.i0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && eu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (rr0Var != null) {
            rr0Var.d.M(new org.telegram.ui.yq(2));
            rr0Var.h = 0L;
            rr0Var.g(false);
        }
        ks0 ks0Var = eu0Var.P;
        if (ks0Var != null) {
            org.telegram.ui.rn rnVar = ks0Var.a;
            org.telegram.ui.in inVar = rnVar.kc;
            if (inVar != null) {
                inVar.m();
            }
            rnVar.o3 = false;
            rnVar.k0 = false;
            rnVar.hc(false);
            rnVar.Ic();
        }
        eu0Var.Q0 = false;
        eu0Var.j0.setVisibility(0);
        eu0Var.c0.G(null, true);
        eu0Var.e0.G(null, true);
        eu0Var.d0.G(null, true);
        eu0Var.f0.F(null, true);
        pt0 pt0Var = eu0Var.O;
        if (pt0Var != null) {
            pt0Var.E(null, null);
        }
        eu0Var.K0(false);
        pi0 pi0Var = eu0Var.o0;
        if (pi0Var != null) {
            pi0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
        if (eu0Var.v0) {
            eu0Var.v0 = false;
        } else {
            eu0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        eu0 eu0Var = this.f;
        eu0Var.R0 = true;
        rr0 rr0Var = eu0Var.F0;
        if (rr0Var != null) {
            rr0Var.g((eu0Var.getSelectedTab() == 11 || eu0Var.getSelectedTab() == 12) && rr0Var.a());
        }
        ImageView imageView = eu0Var.n0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.i0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        eu0Var.j0.setVisibility(8);
        eu0Var.K0(true);
        pi0 pi0Var = eu0Var.o0;
        if (pi0Var != null) {
            pi0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(fg.g gVar) {
        ks0 ks0Var = this.f.P;
        if (ks0Var != null) {
            ks0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        pt0 pt0Var;
        String obj = editText.getText().toString();
        eu0 eu0Var = this.f;
        ks0 ks0Var = eu0Var.P;
        if (ks0Var != null) {
            org.telegram.ui.rn rnVar = ks0Var.a;
            org.telegram.ui.ActionBar.w0 w0Var = rnVar.f0;
            if (w0Var != null) {
                rnVar.p3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && eu0Var.S0 == null) {
                org.telegram.ui.rn rnVar2 = ks0Var.a;
                org.telegram.ui.in inVar = rnVar2.kc;
                if (inVar != null) {
                    inVar.m();
                }
                rnVar2.o3 = false;
                rnVar2.k0 = false;
                rnVar2.hc(false);
                rnVar2.Ic();
            }
        }
        eu0Var.j0.setVisibility(8);
        eu0Var.Q0 = (obj.length() == 0 && eu0Var.S0 == null) ? false : true;
        eu0Var.post(new tp0(this, 2));
        int i9 = eu0Var.g0[0].B;
        if (i9 == 1) {
            at0 at0Var = eu0Var.c0;
            if (at0Var == null) {
                return;
            }
            at0Var.G(obj, true);
            return;
        }
        if (i9 == 3) {
            at0 at0Var2 = eu0Var.e0;
            if (at0Var2 == null) {
                return;
            }
            at0Var2.G(obj, true);
            return;
        }
        if (i9 == 4) {
            at0 at0Var3 = eu0Var.d0;
            if (at0Var3 == null) {
                return;
            }
            at0Var3.G(obj, true);
            return;
        }
        if (i9 == 7) {
            vs0 vs0Var = eu0Var.f0;
            if (vs0Var == null) {
                return;
            }
            vs0Var.F(obj, true);
            return;
        }
        if (i9 != 11 || (pt0Var = eu0Var.O) == null) {
            return;
        }
        pt0Var.E(eu0Var.S0, obj);
    }
}
