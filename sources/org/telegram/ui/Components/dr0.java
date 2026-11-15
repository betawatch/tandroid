package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class dr0 extends org.telegram.ui.ActionBar.m0 {
    public final /* synthetic */ ys0 a;

    public dr0(ys0 ys0Var) {
        this.a = ys0Var;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void g() {
        this.a.q0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void h() {
        ys0 ys0Var = this.a;
        sq0 sq0Var = ys0Var.M0;
        ImageView imageView = ys0Var.u0;
        ys0Var.Y0 = false;
        ys0Var.Z0 = null;
        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.p0;
        if (q0Var != null) {
            q0Var.setVisibility(0);
        }
        if (imageView != null && ys0Var.k0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (sq0Var != null) {
            sq0Var.d.M(new org.telegram.ui.gq(2));
            sq0Var.h = 0L;
            sq0Var.g(false);
        }
        gr0 gr0Var = ys0Var.W;
        if (gr0Var != null) {
            org.telegram.ui.bn bnVar = gr0Var.a;
            org.telegram.ui.sm smVar = bnVar.Uc;
            if (smVar != null) {
                smVar.h();
            }
            bnVar.H3 = false;
            bnVar.r0 = false;
            bnVar.Pc(false);
            bnVar.qd();
        }
        ys0Var.X0 = false;
        ys0Var.setSearchItemVisibility(0);
        ys0Var.j0.G(null, true);
        ys0Var.l0.G(null, true);
        ys0Var.k0.G(null, true);
        ys0Var.m0.F(null, true);
        ks0 ks0Var = ys0Var.V;
        if (ks0Var != null) {
            ks0Var.E(null, null);
        }
        ys0Var.X0(false);
        fh0 fh0Var = ys0Var.v0;
        if (fh0Var != null) {
            fh0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(er.h).start();
        }
        if (ys0Var.C0) {
            ys0Var.C0 = false;
        } else {
            ys0Var.B1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void i() {
        ys0 ys0Var = this.a;
        ys0Var.Y0 = true;
        sq0 sq0Var = ys0Var.M0;
        if (sq0Var != null) {
            sq0Var.g((ys0Var.getSelectedTab() == 11 || ys0Var.getSelectedTab() == 12) && sq0Var.a());
        }
        ImageView imageView = ys0Var.u0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.p0;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        ys0Var.setSearchItemVisibility(8);
        ys0Var.X0(true);
        fh0 fh0Var = ys0Var.v0;
        if (fh0Var != null) {
            fh0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(er.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        gr0 gr0Var = this.a.W;
        if (gr0Var != null) {
            gr0Var.a.L9();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void l(EditText editText) {
        ks0 ks0Var;
        String obj = editText.getText().toString();
        ys0 ys0Var = this.a;
        gr0 gr0Var = ys0Var.W;
        if (gr0Var != null) {
            org.telegram.ui.bn bnVar = gr0Var.a;
            org.telegram.ui.ActionBar.q0 q0Var = bnVar.k0;
            if (q0Var != null) {
                bnVar.I3 = obj;
                q0Var.Q(obj, false);
            }
            if (TextUtils.isEmpty(obj) && ys0Var.Z0 == null) {
                org.telegram.ui.bn bnVar2 = gr0Var.a;
                org.telegram.ui.sm smVar = bnVar2.Uc;
                if (smVar != null) {
                    smVar.h();
                }
                bnVar2.H3 = false;
                bnVar2.r0 = false;
                bnVar2.Pc(false);
                bnVar2.qd();
            }
        }
        ys0Var.setSearchItemVisibility(8);
        ys0Var.X0 = (obj.length() == 0 && ys0Var.Z0 == null) ? false : true;
        ys0Var.post(new ro0(this, 2));
        int i7 = ys0Var.n0[0].F;
        if (i7 == 1) {
            vr0 vr0Var = ys0Var.j0;
            if (vr0Var == null) {
                return;
            }
            vr0Var.G(obj, true);
            return;
        }
        if (i7 == 3) {
            vr0 vr0Var2 = ys0Var.l0;
            if (vr0Var2 == null) {
                return;
            }
            vr0Var2.G(obj, true);
            return;
        }
        if (i7 == 4) {
            vr0 vr0Var3 = ys0Var.k0;
            if (vr0Var3 == null) {
                return;
            }
            vr0Var3.G(obj, true);
            return;
        }
        if (i7 == 7) {
            rr0 rr0Var = ys0Var.m0;
            if (rr0Var == null) {
                return;
            }
            rr0Var.F(obj, true);
            return;
        }
        if (i7 != 11 || (ks0Var = ys0Var.V) == null) {
            return;
        }
        ks0Var.E(ys0Var.Z0, obj);
    }
}
