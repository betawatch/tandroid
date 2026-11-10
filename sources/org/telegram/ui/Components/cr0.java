package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cr0 extends org.telegram.ui.ActionBar.n0 {
    public final /* synthetic */ ys0 a;

    public cr0(ys0 ys0Var) {
        this.a = ys0Var;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void g() {
        this.a.p0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void h() {
        ys0 ys0Var = this.a;
        rq0 rq0Var = ys0Var.L0;
        ImageView imageView = ys0Var.t0;
        ys0Var.X0 = false;
        ys0Var.Y0 = null;
        org.telegram.ui.ActionBar.r0 r0Var = ys0Var.o0;
        if (r0Var != null) {
            r0Var.setVisibility(0);
        }
        if (imageView != null && ys0Var.k0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (rq0Var != null) {
            rq0Var.d.M(new org.telegram.ui.hq(2));
            rq0Var.h = 0L;
            rq0Var.g(false);
        }
        fr0 fr0Var = ys0Var.V;
        if (fr0Var != null) {
            org.telegram.ui.dn dnVar = fr0Var.a;
            org.telegram.ui.um umVar = dnVar.Tc;
            if (umVar != null) {
                umVar.h();
            }
            dnVar.G3 = false;
            dnVar.q0 = false;
            dnVar.Oc(false);
            dnVar.pd();
        }
        ys0Var.W0 = false;
        ys0Var.setSearchItemVisibility(0);
        ys0Var.i0.G(null, true);
        ys0Var.k0.G(null, true);
        ys0Var.j0.G(null, true);
        ys0Var.l0.F(null, true);
        ks0 ks0Var = ys0Var.U;
        if (ks0Var != null) {
            ks0Var.E(null, null);
        }
        ys0Var.X0(false);
        ch0 ch0Var = ys0Var.u0;
        if (ch0Var != null) {
            ch0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(wq.h).start();
        }
        if (ys0Var.B0) {
            ys0Var.B0 = false;
        } else {
            ys0Var.B1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void i() {
        ys0 ys0Var = this.a;
        ys0Var.X0 = true;
        rq0 rq0Var = ys0Var.L0;
        if (rq0Var != null) {
            rq0Var.g((ys0Var.getSelectedTab() == 11 || ys0Var.getSelectedTab() == 12) && rq0Var.a());
        }
        ImageView imageView = ys0Var.t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.r0 r0Var = ys0Var.o0;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        ys0Var.setSearchItemVisibility(8);
        ys0Var.X0(true);
        ch0 ch0Var = ys0Var.u0;
        if (ch0Var != null) {
            ch0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(wq.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        fr0 fr0Var = this.a.V;
        if (fr0Var != null) {
            fr0Var.a.K9();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void l(EditText editText) {
        ks0 ks0Var;
        String obj = editText.getText().toString();
        ys0 ys0Var = this.a;
        fr0 fr0Var = ys0Var.V;
        if (fr0Var != null) {
            org.telegram.ui.dn dnVar = fr0Var.a;
            org.telegram.ui.ActionBar.r0 r0Var = dnVar.j0;
            if (r0Var != null) {
                dnVar.H3 = obj;
                r0Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && ys0Var.Y0 == null) {
                org.telegram.ui.dn dnVar2 = fr0Var.a;
                org.telegram.ui.um umVar = dnVar2.Tc;
                if (umVar != null) {
                    umVar.h();
                }
                dnVar2.G3 = false;
                dnVar2.q0 = false;
                dnVar2.Oc(false);
                dnVar2.pd();
            }
        }
        ys0Var.setSearchItemVisibility(8);
        ys0Var.W0 = (obj.length() == 0 && ys0Var.Y0 == null) ? false : true;
        ys0Var.post(new ob0(this, 29));
        int i7 = ys0Var.m0[0].E;
        if (i7 == 1) {
            vr0 vr0Var = ys0Var.i0;
            if (vr0Var == null) {
                return;
            }
            vr0Var.G(obj, true);
            return;
        }
        if (i7 == 3) {
            vr0 vr0Var2 = ys0Var.k0;
            if (vr0Var2 == null) {
                return;
            }
            vr0Var2.G(obj, true);
            return;
        }
        if (i7 == 4) {
            vr0 vr0Var3 = ys0Var.j0;
            if (vr0Var3 == null) {
                return;
            }
            vr0Var3.G(obj, true);
            return;
        }
        if (i7 == 7) {
            rr0 rr0Var = ys0Var.l0;
            if (rr0Var == null) {
                return;
            }
            rr0Var.F(obj, true);
            return;
        }
        if (i7 != 11 || (ks0Var = ys0Var.U) == null) {
            return;
        }
        ks0Var.E(ys0Var.Y0, obj);
    }
}
