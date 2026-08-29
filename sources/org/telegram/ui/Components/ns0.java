package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ns0 extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ qu0 f;

    public ns0(qu0 qu0Var) {
        this.f = qu0Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void l() {
        this.f.j0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        qu0 qu0Var = this.f;
        cs0 cs0Var = qu0Var.F0;
        ImageView imageView = qu0Var.n0;
        qu0Var.R0 = false;
        qu0Var.S0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.i0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && qu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (cs0Var != null) {
            cs0Var.d.M(new org.telegram.ui.zq(2));
            cs0Var.h = 0L;
            cs0Var.g(false);
        }
        vs0 vs0Var = qu0Var.P;
        if (vs0Var != null) {
            org.telegram.ui.un unVar = vs0Var.a;
            org.telegram.ui.ln lnVar = unVar.kc;
            if (lnVar != null) {
                lnVar.m();
            }
            unVar.o3 = false;
            unVar.k0 = false;
            unVar.hc(false);
            unVar.Ic();
        }
        qu0Var.Q0 = false;
        qu0Var.j0.setVisibility(0);
        qu0Var.c0.G(null, true);
        qu0Var.e0.G(null, true);
        qu0Var.d0.G(null, true);
        qu0Var.f0.F(null, true);
        bu0 bu0Var = qu0Var.O;
        if (bu0Var != null) {
            bu0Var.E(null, null);
        }
        qu0Var.K0(false);
        aj0 aj0Var = qu0Var.o0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(jr.h).start();
        }
        if (qu0Var.v0) {
            qu0Var.v0 = false;
        } else {
            qu0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        qu0 qu0Var = this.f;
        qu0Var.R0 = true;
        cs0 cs0Var = qu0Var.F0;
        if (cs0Var != null) {
            cs0Var.g((qu0Var.getSelectedTab() == 11 || qu0Var.getSelectedTab() == 12) && cs0Var.a());
        }
        ImageView imageView = qu0Var.n0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.i0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        qu0Var.j0.setVisibility(8);
        qu0Var.K0(true);
        aj0 aj0Var = qu0Var.o0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(jr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(ig.f fVar) {
        vs0 vs0Var = this.f.P;
        if (vs0Var != null) {
            vs0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        bu0 bu0Var;
        String obj = editText.getText().toString();
        qu0 qu0Var = this.f;
        vs0 vs0Var = qu0Var.P;
        if (vs0Var != null) {
            org.telegram.ui.un unVar = vs0Var.a;
            org.telegram.ui.ActionBar.w0 w0Var = unVar.f0;
            if (w0Var != null) {
                unVar.p3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && qu0Var.S0 == null) {
                org.telegram.ui.un unVar2 = vs0Var.a;
                org.telegram.ui.ln lnVar = unVar2.kc;
                if (lnVar != null) {
                    lnVar.m();
                }
                unVar2.o3 = false;
                unVar2.k0 = false;
                unVar2.hc(false);
                unVar2.Ic();
            }
        }
        qu0Var.j0.setVisibility(8);
        qu0Var.Q0 = (obj.length() == 0 && qu0Var.S0 == null) ? false : true;
        qu0Var.post(new fq0(this, 2));
        int i10 = qu0Var.g0[0].B;
        if (i10 == 1) {
            lt0 lt0Var = qu0Var.c0;
            if (lt0Var == null) {
                return;
            }
            lt0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            lt0 lt0Var2 = qu0Var.e0;
            if (lt0Var2 == null) {
                return;
            }
            lt0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            lt0 lt0Var3 = qu0Var.d0;
            if (lt0Var3 == null) {
                return;
            }
            lt0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            gt0 gt0Var = qu0Var.f0;
            if (gt0Var == null) {
                return;
            }
            gt0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (bu0Var = qu0Var.O) == null) {
            return;
        }
        bu0Var.E(qu0Var.S0, obj);
    }
}
