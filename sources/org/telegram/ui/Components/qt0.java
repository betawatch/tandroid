package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class qt0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ sv0 r;

    public qt0(sv0 sv0Var) {
        this.r = sv0Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void l() {
        this.r.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        sv0 sv0Var = this.r;
        ft0 ft0Var = sv0Var.J0;
        ImageView imageView = sv0Var.r0;
        sv0Var.V0 = false;
        sv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = sv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && sv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ft0Var != null) {
            ft0Var.d.M(new org.telegram.ui.zq(2));
            ft0Var.h = 0L;
            ft0Var.g(false);
        }
        yt0 yt0Var = sv0Var.T;
        if (yt0Var != null) {
            org.telegram.ui.tn tnVar = yt0Var.a;
            org.telegram.ui.kn knVar = tnVar.oc;
            if (knVar != null) {
                knVar.m();
            }
            tnVar.s3 = false;
            tnVar.o0 = false;
            tnVar.lc(false);
            tnVar.Mc();
        }
        sv0Var.U0 = false;
        sv0Var.n0.setVisibility(0);
        sv0Var.g0.G(null, true);
        sv0Var.i0.G(null, true);
        sv0Var.h0.G(null, true);
        sv0Var.j0.F(null, true);
        dv0 dv0Var = sv0Var.S;
        if (dv0Var != null) {
            dv0Var.E(null, null);
        }
        sv0Var.M0(false);
        xj0 xj0Var = sv0Var.s0;
        if (xj0Var != null) {
            xj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
        if (sv0Var.z0) {
            sv0Var.z0 = false;
        } else {
            sv0Var.o1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        sv0 sv0Var = this.r;
        sv0Var.V0 = true;
        ft0 ft0Var = sv0Var.J0;
        if (ft0Var != null) {
            ft0Var.g((sv0Var.getSelectedTab() == 11 || sv0Var.getSelectedTab() == 12) && ft0Var.a());
        }
        ImageView imageView = sv0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = sv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        sv0Var.n0.setVisibility(8);
        sv0Var.M0(true);
        xj0 xj0Var = sv0Var.s0;
        if (xj0Var != null) {
            xj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ei.e2 e2Var) {
        yt0 yt0Var = this.r.T;
        if (yt0Var != null) {
            yt0Var.a.r9();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        dv0 dv0Var;
        String obj = editText.getText().toString();
        sv0 sv0Var = this.r;
        yt0 yt0Var = sv0Var.T;
        if (yt0Var != null) {
            org.telegram.ui.tn tnVar = yt0Var.a;
            org.telegram.ui.ActionBar.u0 u0Var = tnVar.j0;
            if (u0Var != null) {
                tnVar.t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && sv0Var.W0 == null) {
                org.telegram.ui.tn tnVar2 = yt0Var.a;
                org.telegram.ui.kn knVar = tnVar2.oc;
                if (knVar != null) {
                    knVar.m();
                }
                tnVar2.s3 = false;
                tnVar2.o0 = false;
                tnVar2.lc(false);
                tnVar2.Mc();
            }
        }
        sv0Var.n0.setVisibility(8);
        sv0Var.U0 = (obj.length() == 0 && sv0Var.W0 == null) ? false : true;
        sv0Var.post(new fr0(this, 2));
        int i10 = sv0Var.k0[0].F;
        if (i10 == 1) {
            ou0 ou0Var = sv0Var.g0;
            if (ou0Var == null) {
                return;
            }
            ou0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            ou0 ou0Var2 = sv0Var.i0;
            if (ou0Var2 == null) {
                return;
            }
            ou0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            ou0 ou0Var3 = sv0Var.h0;
            if (ou0Var3 == null) {
                return;
            }
            ou0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            ju0 ju0Var = sv0Var.j0;
            if (ju0Var == null) {
                return;
            }
            ju0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (dv0Var = sv0Var.S) == null) {
            return;
        }
        dv0Var.E(sv0Var.W0, obj);
    }
}
