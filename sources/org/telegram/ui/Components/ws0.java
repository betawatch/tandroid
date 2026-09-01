package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ws0 extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ zu0 f;

    public ws0(zu0 zu0Var) {
        this.f = zu0Var;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void l() {
        this.f.k0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        zu0 zu0Var = this.f;
        ls0 ls0Var = zu0Var.G0;
        ImageView imageView = zu0Var.o0;
        zu0Var.S0 = false;
        zu0Var.T0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.j0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && zu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ls0Var != null) {
            ls0Var.d.M(new org.telegram.ui.gr(2));
            ls0Var.h = 0L;
            ls0Var.g(false);
        }
        et0 et0Var = zu0Var.Q;
        if (et0Var != null) {
            org.telegram.ui.yn ynVar = et0Var.a;
            org.telegram.ui.pn pnVar = ynVar.lc;
            if (pnVar != null) {
                pnVar.m();
            }
            ynVar.p3 = false;
            ynVar.l0 = false;
            ynVar.hc(false);
            ynVar.Ic();
        }
        zu0Var.R0 = false;
        zu0Var.k0.setVisibility(0);
        zu0Var.d0.G(null, true);
        zu0Var.f0.G(null, true);
        zu0Var.e0.G(null, true);
        zu0Var.g0.F(null, true);
        ku0 ku0Var = zu0Var.P;
        if (ku0Var != null) {
            ku0Var.E(null, null);
        }
        zu0Var.K0(false);
        lj0 lj0Var = zu0Var.p0;
        if (lj0Var != null) {
            lj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(pr.h).start();
        }
        if (zu0Var.w0) {
            zu0Var.w0 = false;
        } else {
            zu0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
        zu0 zu0Var = this.f;
        zu0Var.S0 = true;
        ls0 ls0Var = zu0Var.G0;
        if (ls0Var != null) {
            ls0Var.g((zu0Var.getSelectedTab() == 11 || zu0Var.getSelectedTab() == 12) && ls0Var.a());
        }
        ImageView imageView = zu0Var.o0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.j0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        zu0Var.k0.setVisibility(8);
        zu0Var.K0(true);
        lj0 lj0Var = zu0Var.p0;
        if (lj0Var != null) {
            lj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(pr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void p(lg.f fVar) {
        et0 et0Var = this.f.Q;
        if (et0Var != null) {
            et0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        ku0 ku0Var;
        String obj = editText.getText().toString();
        zu0 zu0Var = this.f;
        et0 et0Var = zu0Var.Q;
        if (et0Var != null) {
            org.telegram.ui.yn ynVar = et0Var.a;
            org.telegram.ui.ActionBar.w0 w0Var = ynVar.g0;
            if (w0Var != null) {
                ynVar.q3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && zu0Var.T0 == null) {
                org.telegram.ui.yn ynVar2 = et0Var.a;
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
        zu0Var.k0.setVisibility(8);
        zu0Var.R0 = (obj.length() == 0 && zu0Var.T0 == null) ? false : true;
        zu0Var.post(new oq0(this, 2));
        int i10 = zu0Var.h0[0].C;
        if (i10 == 1) {
            ut0 ut0Var = zu0Var.d0;
            if (ut0Var == null) {
                return;
            }
            ut0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            ut0 ut0Var2 = zu0Var.f0;
            if (ut0Var2 == null) {
                return;
            }
            ut0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            ut0 ut0Var3 = zu0Var.e0;
            if (ut0Var3 == null) {
                return;
            }
            ut0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            pt0 pt0Var = zu0Var.g0;
            if (pt0Var == null) {
                return;
            }
            pt0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (ku0Var = zu0Var.P) == null) {
            return;
        }
        ku0Var.E(zu0Var.T0, obj);
    }
}
