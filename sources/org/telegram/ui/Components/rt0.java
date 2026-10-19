package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class rt0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ tv0 r;

    public rt0(tv0 tv0Var) {
        this.r = tv0Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void l() {
        this.r.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        tv0 tv0Var = this.r;
        gt0 gt0Var = tv0Var.J0;
        ImageView imageView = tv0Var.r0;
        tv0Var.V0 = false;
        tv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && tv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (gt0Var != null) {
            gt0Var.d.M(new org.telegram.ui.xq(2));
            gt0Var.h = 0L;
            gt0Var.g(false);
        }
        zt0 zt0Var = tv0Var.T;
        if (zt0Var != null) {
            org.telegram.ui.rn rnVar = zt0Var.a;
            org.telegram.ui.in inVar = rnVar.oc;
            if (inVar != null) {
                inVar.m();
            }
            rnVar.s3 = false;
            rnVar.o0 = false;
            rnVar.lc(false);
            rnVar.Mc();
        }
        tv0Var.U0 = false;
        tv0Var.n0.setVisibility(0);
        tv0Var.g0.G(null, true);
        tv0Var.i0.G(null, true);
        tv0Var.h0.G(null, true);
        tv0Var.j0.F(null, true);
        ev0 ev0Var = tv0Var.S;
        if (ev0Var != null) {
            ev0Var.E(null, null);
        }
        tv0Var.M0(false);
        xj0 xj0Var = tv0Var.s0;
        if (xj0Var != null) {
            xj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
        if (tv0Var.z0) {
            tv0Var.z0 = false;
        } else {
            tv0Var.o1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        tv0 tv0Var = this.r;
        tv0Var.V0 = true;
        gt0 gt0Var = tv0Var.J0;
        if (gt0Var != null) {
            gt0Var.g((tv0Var.getSelectedTab() == 11 || tv0Var.getSelectedTab() == 12) && gt0Var.a());
        }
        ImageView imageView = tv0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        tv0Var.n0.setVisibility(8);
        tv0Var.M0(true);
        xj0 xj0Var = tv0Var.s0;
        if (xj0Var != null) {
            xj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ei.e2 e2Var) {
        zt0 zt0Var = this.r.T;
        if (zt0Var != null) {
            zt0Var.a.r9();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        ev0 ev0Var;
        String obj = editText.getText().toString();
        tv0 tv0Var = this.r;
        zt0 zt0Var = tv0Var.T;
        if (zt0Var != null) {
            org.telegram.ui.rn rnVar = zt0Var.a;
            org.telegram.ui.ActionBar.u0 u0Var = rnVar.j0;
            if (u0Var != null) {
                rnVar.t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && tv0Var.W0 == null) {
                org.telegram.ui.rn rnVar2 = zt0Var.a;
                org.telegram.ui.in inVar = rnVar2.oc;
                if (inVar != null) {
                    inVar.m();
                }
                rnVar2.s3 = false;
                rnVar2.o0 = false;
                rnVar2.lc(false);
                rnVar2.Mc();
            }
        }
        tv0Var.n0.setVisibility(8);
        tv0Var.U0 = (obj.length() == 0 && tv0Var.W0 == null) ? false : true;
        tv0Var.post(new gr0(this, 2));
        int i10 = tv0Var.k0[0].F;
        if (i10 == 1) {
            pu0 pu0Var = tv0Var.g0;
            if (pu0Var == null) {
                return;
            }
            pu0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            pu0 pu0Var2 = tv0Var.i0;
            if (pu0Var2 == null) {
                return;
            }
            pu0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            pu0 pu0Var3 = tv0Var.h0;
            if (pu0Var3 == null) {
                return;
            }
            pu0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            ku0 ku0Var = tv0Var.j0;
            if (ku0Var == null) {
                return;
            }
            ku0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (ev0Var = tv0Var.S) == null) {
            return;
        }
        ev0Var.E(tv0Var.W0, obj);
    }
}
