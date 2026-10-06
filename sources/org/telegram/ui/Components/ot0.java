package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ot0 extends org.telegram.ui.ActionBar.f5 {
    public final /* synthetic */ qv0 f;

    public ot0(qv0 qv0Var) {
        this.f = qv0Var;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void l() {
        this.f.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        qv0 qv0Var = this.f;
        dt0 dt0Var = qv0Var.J0;
        ImageView imageView = qv0Var.r0;
        qv0Var.V0 = false;
        qv0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = qv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && qv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (dt0Var != null) {
            dt0Var.d.M(new org.telegram.ui.hr(2));
            dt0Var.h = 0L;
            dt0Var.g(false);
        }
        wt0 wt0Var = qv0Var.T;
        if (wt0Var != null) {
            org.telegram.ui.zn znVar = wt0Var.a;
            org.telegram.ui.qn qnVar = znVar.lc;
            if (qnVar != null) {
                qnVar.m();
            }
            znVar.q3 = false;
            znVar.m0 = false;
            znVar.gc(false);
            znVar.Hc();
        }
        qv0Var.U0 = false;
        qv0Var.n0.setVisibility(0);
        qv0Var.g0.G(null, true);
        qv0Var.i0.G(null, true);
        qv0Var.h0.G(null, true);
        qv0Var.j0.F(null, true);
        bv0 bv0Var = qv0Var.S;
        if (bv0Var != null) {
            bv0Var.E(null, null);
        }
        qv0Var.K0(false);
        nj0 nj0Var = qv0Var.s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(tr.h).start();
        }
        if (qv0Var.z0) {
            qv0Var.z0 = false;
        } else {
            qv0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
        qv0 qv0Var = this.f;
        qv0Var.V0 = true;
        dt0 dt0Var = qv0Var.J0;
        if (dt0Var != null) {
            dt0Var.g((qv0Var.getSelectedTab() == 11 || qv0Var.getSelectedTab() == 12) && dt0Var.a());
        }
        ImageView imageView = qv0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = qv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        qv0Var.n0.setVisibility(8);
        qv0Var.K0(true);
        nj0 nj0Var = qv0Var.s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(tr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void p(ci.h2 h2Var) {
        wt0 wt0Var = this.f.T;
        if (wt0Var != null) {
            wt0Var.a.n9();
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        bv0 bv0Var;
        String obj = editText.getText().toString();
        qv0 qv0Var = this.f;
        wt0 wt0Var = qv0Var.T;
        if (wt0Var != null) {
            org.telegram.ui.zn znVar = wt0Var.a;
            org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
            if (v0Var != null) {
                znVar.r3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && qv0Var.W0 == null) {
                org.telegram.ui.zn znVar2 = wt0Var.a;
                org.telegram.ui.qn qnVar = znVar2.lc;
                if (qnVar != null) {
                    qnVar.m();
                }
                znVar2.q3 = false;
                znVar2.m0 = false;
                znVar2.gc(false);
                znVar2.Hc();
            }
        }
        qv0Var.n0.setVisibility(8);
        qv0Var.U0 = (obj.length() == 0 && qv0Var.W0 == null) ? false : true;
        qv0Var.post(new gq0(this, 4));
        int i10 = qv0Var.k0[0].F;
        if (i10 == 1) {
            mu0 mu0Var = qv0Var.g0;
            if (mu0Var == null) {
                return;
            }
            mu0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            mu0 mu0Var2 = qv0Var.i0;
            if (mu0Var2 == null) {
                return;
            }
            mu0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            mu0 mu0Var3 = qv0Var.h0;
            if (mu0Var3 == null) {
                return;
            }
            mu0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            hu0 hu0Var = qv0Var.j0;
            if (hu0Var == null) {
                return;
            }
            hu0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (bv0Var = qv0Var.S) == null) {
            return;
        }
        bv0Var.E(qv0Var.W0, obj);
    }
}
