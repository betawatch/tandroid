package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zt0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ bw0 f;

    public zt0(bw0 bw0Var) {
        this.f = bw0Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void l() {
        this.f.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        bw0 bw0Var = this.f;
        ot0 ot0Var = bw0Var.J0;
        ImageView imageView = bw0Var.r0;
        bw0Var.V0 = false;
        bw0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = bw0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && bw0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ot0Var != null) {
            ot0Var.d.M(new org.telegram.ui.ir(2));
            ot0Var.h = 0L;
            ot0Var.g(false);
        }
        hu0 hu0Var = bw0Var.T;
        if (hu0Var != null) {
            org.telegram.ui.ao aoVar = hu0Var.a;
            org.telegram.ui.rn rnVar = aoVar.oc;
            if (rnVar != null) {
                rnVar.m();
            }
            aoVar.s3 = false;
            aoVar.o0 = false;
            aoVar.lc(false);
            aoVar.Mc();
        }
        bw0Var.U0 = false;
        bw0Var.n0.setVisibility(0);
        bw0Var.g0.G(null, true);
        bw0Var.i0.G(null, true);
        bw0Var.h0.G(null, true);
        bw0Var.j0.F(null, true);
        mv0 mv0Var = bw0Var.S;
        if (mv0Var != null) {
            mv0Var.E(null, null);
        }
        bw0Var.K0(false);
        fk0 fk0Var = bw0Var.s0;
        if (fk0Var != null) {
            fk0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(hs.h).start();
        }
        if (bw0Var.z0) {
            bw0Var.z0 = false;
        } else {
            bw0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        bw0 bw0Var = this.f;
        bw0Var.V0 = true;
        ot0 ot0Var = bw0Var.J0;
        if (ot0Var != null) {
            ot0Var.g((bw0Var.getSelectedTab() == 11 || bw0Var.getSelectedTab() == 12) && ot0Var.a());
        }
        ImageView imageView = bw0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = bw0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        bw0Var.n0.setVisibility(8);
        bw0Var.K0(true);
        fk0 fk0Var = bw0Var.s0;
        if (fk0Var != null) {
            fk0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(hs.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ci.g2 g2Var) {
        hu0 hu0Var = this.f.T;
        if (hu0Var != null) {
            hu0Var.a.r9();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        mv0 mv0Var;
        String obj = editText.getText().toString();
        bw0 bw0Var = this.f;
        hu0 hu0Var = bw0Var.T;
        if (hu0Var != null) {
            org.telegram.ui.ao aoVar = hu0Var.a;
            org.telegram.ui.ActionBar.v0 v0Var = aoVar.j0;
            if (v0Var != null) {
                aoVar.t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && bw0Var.W0 == null) {
                org.telegram.ui.ao aoVar2 = hu0Var.a;
                org.telegram.ui.rn rnVar = aoVar2.oc;
                if (rnVar != null) {
                    rnVar.m();
                }
                aoVar2.s3 = false;
                aoVar2.o0 = false;
                aoVar2.lc(false);
                aoVar2.Mc();
            }
        }
        bw0Var.n0.setVisibility(8);
        bw0Var.U0 = (obj.length() == 0 && bw0Var.W0 == null) ? false : true;
        bw0Var.post(new or0(this, 2));
        int i10 = bw0Var.k0[0].F;
        if (i10 == 1) {
            xu0 xu0Var = bw0Var.g0;
            if (xu0Var == null) {
                return;
            }
            xu0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            xu0 xu0Var2 = bw0Var.i0;
            if (xu0Var2 == null) {
                return;
            }
            xu0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            xu0 xu0Var3 = bw0Var.h0;
            if (xu0Var3 == null) {
                return;
            }
            xu0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            su0 su0Var = bw0Var.j0;
            if (su0Var == null) {
                return;
            }
            su0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (mv0Var = bw0Var.S) == null) {
            return;
        }
        mv0Var.E(bw0Var.W0, obj);
    }
}
