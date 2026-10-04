package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class nt0 extends org.telegram.ui.ActionBar.f5 {
    public final /* synthetic */ pv0 f;

    public nt0(pv0 pv0Var) {
        this.f = pv0Var;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void l() {
        this.f.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        pv0 pv0Var = this.f;
        ct0 ct0Var = pv0Var.J0;
        ImageView imageView = pv0Var.r0;
        pv0Var.V0 = false;
        pv0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = pv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && pv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ct0Var != null) {
            ct0Var.d.M(new org.telegram.ui.hr(2));
            ct0Var.h = 0L;
            ct0Var.g(false);
        }
        vt0 vt0Var = pv0Var.T;
        if (vt0Var != null) {
            org.telegram.ui.zn znVar = vt0Var.a;
            org.telegram.ui.qn qnVar = znVar.lc;
            if (qnVar != null) {
                qnVar.m();
            }
            znVar.q3 = false;
            znVar.m0 = false;
            znVar.gc(false);
            znVar.Hc();
        }
        pv0Var.U0 = false;
        pv0Var.n0.setVisibility(0);
        pv0Var.g0.G(null, true);
        pv0Var.i0.G(null, true);
        pv0Var.h0.G(null, true);
        pv0Var.j0.F(null, true);
        av0 av0Var = pv0Var.S;
        if (av0Var != null) {
            av0Var.E(null, null);
        }
        pv0Var.K0(false);
        nj0 nj0Var = pv0Var.s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(tr.h).start();
        }
        if (pv0Var.z0) {
            pv0Var.z0 = false;
        } else {
            pv0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
        pv0 pv0Var = this.f;
        pv0Var.V0 = true;
        ct0 ct0Var = pv0Var.J0;
        if (ct0Var != null) {
            ct0Var.g((pv0Var.getSelectedTab() == 11 || pv0Var.getSelectedTab() == 12) && ct0Var.a());
        }
        ImageView imageView = pv0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = pv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        pv0Var.n0.setVisibility(8);
        pv0Var.K0(true);
        nj0 nj0Var = pv0Var.s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(tr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void p(ci.h2 h2Var) {
        vt0 vt0Var = this.f.T;
        if (vt0Var != null) {
            vt0Var.a.n9();
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        av0 av0Var;
        String obj = editText.getText().toString();
        pv0 pv0Var = this.f;
        vt0 vt0Var = pv0Var.T;
        if (vt0Var != null) {
            org.telegram.ui.zn znVar = vt0Var.a;
            org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
            if (v0Var != null) {
                znVar.r3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && pv0Var.W0 == null) {
                org.telegram.ui.zn znVar2 = vt0Var.a;
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
        pv0Var.n0.setVisibility(8);
        pv0Var.U0 = (obj.length() == 0 && pv0Var.W0 == null) ? false : true;
        pv0Var.post(new br0(this, 3));
        int i10 = pv0Var.k0[0].F;
        if (i10 == 1) {
            lu0 lu0Var = pv0Var.g0;
            if (lu0Var == null) {
                return;
            }
            lu0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            lu0 lu0Var2 = pv0Var.i0;
            if (lu0Var2 == null) {
                return;
            }
            lu0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            lu0 lu0Var3 = pv0Var.h0;
            if (lu0Var3 == null) {
                return;
            }
            lu0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            gu0 gu0Var = pv0Var.j0;
            if (gu0Var == null) {
                return;
            }
            gu0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (av0Var = pv0Var.S) == null) {
            return;
        }
        av0Var.E(pv0Var.W0, obj);
    }
}
