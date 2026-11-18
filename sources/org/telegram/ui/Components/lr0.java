package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class lr0 extends org.telegram.ui.ActionBar.n0 {
    public final /* synthetic */ gt0 a;

    public lr0(gt0 gt0Var) {
        this.a = gt0Var;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void g() {
        this.a.q0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void h() {
        gt0 gt0Var = this.a;
        ar0 ar0Var = gt0Var.M0;
        ImageView imageView = gt0Var.u0;
        gt0Var.Y0 = false;
        gt0Var.Z0 = null;
        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.p0;
        if (r0Var != null) {
            r0Var.setVisibility(0);
        }
        if (imageView != null && gt0Var.k0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ar0Var != null) {
            ar0Var.d.M(new org.telegram.ui.hq(2));
            ar0Var.h = 0L;
            ar0Var.g(false);
        }
        or0 or0Var = gt0Var.W;
        if (or0Var != null) {
            org.telegram.ui.cn cnVar = or0Var.a;
            org.telegram.ui.tm tmVar = cnVar.Vc;
            if (tmVar != null) {
                tmVar.h();
            }
            cnVar.H3 = false;
            cnVar.r0 = false;
            cnVar.Pc(false);
            cnVar.qd();
        }
        gt0Var.X0 = false;
        gt0Var.setSearchItemVisibility(0);
        gt0Var.j0.G(null, true);
        gt0Var.l0.G(null, true);
        gt0Var.k0.G(null, true);
        gt0Var.m0.F(null, true);
        ss0 ss0Var = gt0Var.V;
        if (ss0Var != null) {
            ss0Var.E(null, null);
        }
        gt0Var.X0(false);
        ph0 ph0Var = gt0Var.v0;
        if (ph0Var != null) {
            ph0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(lr.h).start();
        }
        if (gt0Var.C0) {
            gt0Var.C0 = false;
        } else {
            gt0Var.B1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void i() {
        gt0 gt0Var = this.a;
        gt0Var.Y0 = true;
        ar0 ar0Var = gt0Var.M0;
        if (ar0Var != null) {
            ar0Var.g((gt0Var.getSelectedTab() == 11 || gt0Var.getSelectedTab() == 12) && ar0Var.a());
        }
        ImageView imageView = gt0Var.u0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.p0;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        gt0Var.setSearchItemVisibility(8);
        gt0Var.X0(true);
        ph0 ph0Var = gt0Var.v0;
        if (ph0Var != null) {
            ph0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(lr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        or0 or0Var = this.a.W;
        if (or0Var != null) {
            or0Var.a.L9();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void l(EditText editText) {
        ss0 ss0Var;
        String obj = editText.getText().toString();
        gt0 gt0Var = this.a;
        or0 or0Var = gt0Var.W;
        if (or0Var != null) {
            org.telegram.ui.cn cnVar = or0Var.a;
            org.telegram.ui.ActionBar.r0 r0Var = cnVar.k0;
            if (r0Var != null) {
                cnVar.I3 = obj;
                r0Var.Q(obj, false);
            }
            if (TextUtils.isEmpty(obj) && gt0Var.Z0 == null) {
                org.telegram.ui.cn cnVar2 = or0Var.a;
                org.telegram.ui.tm tmVar = cnVar2.Vc;
                if (tmVar != null) {
                    tmVar.h();
                }
                cnVar2.H3 = false;
                cnVar2.r0 = false;
                cnVar2.Pc(false);
                cnVar2.qd();
            }
        }
        gt0Var.setSearchItemVisibility(8);
        gt0Var.X0 = (obj.length() == 0 && gt0Var.Z0 == null) ? false : true;
        gt0Var.post(new ap0(this, 2));
        int i7 = gt0Var.n0[0].F;
        if (i7 == 1) {
            ds0 ds0Var = gt0Var.j0;
            if (ds0Var == null) {
                return;
            }
            ds0Var.G(obj, true);
            return;
        }
        if (i7 == 3) {
            ds0 ds0Var2 = gt0Var.l0;
            if (ds0Var2 == null) {
                return;
            }
            ds0Var2.G(obj, true);
            return;
        }
        if (i7 == 4) {
            ds0 ds0Var3 = gt0Var.k0;
            if (ds0Var3 == null) {
                return;
            }
            ds0Var3.G(obj, true);
            return;
        }
        if (i7 == 7) {
            zr0 zr0Var = gt0Var.m0;
            if (zr0Var == null) {
                return;
            }
            zr0Var.F(obj, true);
            return;
        }
        if (i7 != 11 || (ss0Var = gt0Var.V) == null) {
            return;
        }
        ss0Var.E(gt0Var.Z0, obj);
    }
}
