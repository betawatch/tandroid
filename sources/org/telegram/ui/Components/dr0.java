package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class dr0 extends org.telegram.ui.ActionBar.n0 {
    public final /* synthetic */ zs0 a;

    public dr0(zs0 zs0Var) {
        this.a = zs0Var;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void g() {
        this.a.p0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void h() {
        zs0 zs0Var = this.a;
        sq0 sq0Var = zs0Var.L0;
        ImageView imageView = zs0Var.t0;
        zs0Var.X0 = false;
        zs0Var.Y0 = null;
        org.telegram.ui.ActionBar.r0 r0Var = zs0Var.o0;
        if (r0Var != null) {
            r0Var.setVisibility(0);
        }
        if (imageView != null && zs0Var.k0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (sq0Var != null) {
            sq0Var.d.M(new org.telegram.ui.gq(2));
            sq0Var.h = 0L;
            sq0Var.g(false);
        }
        gr0 gr0Var = zs0Var.V;
        if (gr0Var != null) {
            org.telegram.ui.dn dnVar = gr0Var.a;
            org.telegram.ui.um umVar = dnVar.Tc;
            if (umVar != null) {
                umVar.h();
            }
            dnVar.G3 = false;
            dnVar.q0 = false;
            dnVar.Oc(false);
            dnVar.pd();
        }
        zs0Var.W0 = false;
        zs0Var.setSearchItemVisibility(0);
        zs0Var.i0.G(null, true);
        zs0Var.k0.G(null, true);
        zs0Var.j0.G(null, true);
        zs0Var.l0.F(null, true);
        ls0 ls0Var = zs0Var.U;
        if (ls0Var != null) {
            ls0Var.E(null, null);
        }
        zs0Var.X0(false);
        dh0 dh0Var = zs0Var.u0;
        if (dh0Var != null) {
            dh0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(xq.h).start();
        }
        if (zs0Var.B0) {
            zs0Var.B0 = false;
        } else {
            zs0Var.B1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void i() {
        zs0 zs0Var = this.a;
        zs0Var.X0 = true;
        sq0 sq0Var = zs0Var.L0;
        if (sq0Var != null) {
            sq0Var.g((zs0Var.getSelectedTab() == 11 || zs0Var.getSelectedTab() == 12) && sq0Var.a());
        }
        ImageView imageView = zs0Var.t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.r0 r0Var = zs0Var.o0;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        zs0Var.setSearchItemVisibility(8);
        zs0Var.X0(true);
        dh0 dh0Var = zs0Var.u0;
        if (dh0Var != null) {
            dh0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(xq.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        gr0 gr0Var = this.a.V;
        if (gr0Var != null) {
            gr0Var.a.K9();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void l(EditText editText) {
        ls0 ls0Var;
        String obj = editText.getText().toString();
        zs0 zs0Var = this.a;
        gr0 gr0Var = zs0Var.V;
        if (gr0Var != null) {
            org.telegram.ui.dn dnVar = gr0Var.a;
            org.telegram.ui.ActionBar.r0 r0Var = dnVar.j0;
            if (r0Var != null) {
                dnVar.H3 = obj;
                r0Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && zs0Var.Y0 == null) {
                org.telegram.ui.dn dnVar2 = gr0Var.a;
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
        zs0Var.setSearchItemVisibility(8);
        zs0Var.W0 = (obj.length() == 0 && zs0Var.Y0 == null) ? false : true;
        zs0Var.post(new pb0(this, 29));
        int i7 = zs0Var.m0[0].E;
        if (i7 == 1) {
            wr0 wr0Var = zs0Var.i0;
            if (wr0Var == null) {
                return;
            }
            wr0Var.G(obj, true);
            return;
        }
        if (i7 == 3) {
            wr0 wr0Var2 = zs0Var.k0;
            if (wr0Var2 == null) {
                return;
            }
            wr0Var2.G(obj, true);
            return;
        }
        if (i7 == 4) {
            wr0 wr0Var3 = zs0Var.j0;
            if (wr0Var3 == null) {
                return;
            }
            wr0Var3.G(obj, true);
            return;
        }
        if (i7 == 7) {
            sr0 sr0Var = zs0Var.l0;
            if (sr0Var == null) {
                return;
            }
            sr0Var.F(obj, true);
            return;
        }
        if (i7 != 11 || (ls0Var = zs0Var.U) == null) {
            return;
        }
        ls0Var.E(zs0Var.Y0, obj);
    }
}
