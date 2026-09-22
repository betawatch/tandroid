package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class jt0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ lv0 f;

    public jt0(lv0 lv0Var) {
        this.f = lv0Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void l() {
        this.f.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        lv0 lv0Var = this.f;
        ys0 ys0Var = lv0Var.J0;
        ImageView imageView = lv0Var.r0;
        lv0Var.V0 = false;
        lv0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = lv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && lv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ys0Var != null) {
            ys0Var.d.N(new org.telegram.ui.ir(2));
            ys0Var.h = 0L;
            ys0Var.g(false);
        }
        rt0 rt0Var = lv0Var.T;
        if (rt0Var != null) {
            org.telegram.ui.ao aoVar = rt0Var.a;
            org.telegram.ui.rn rnVar = aoVar.nc;
            if (rnVar != null) {
                rnVar.m();
            }
            aoVar.s3 = false;
            aoVar.o0 = false;
            aoVar.hc(false);
            aoVar.Ic();
        }
        lv0Var.U0 = false;
        lv0Var.n0.setVisibility(0);
        lv0Var.g0.G(null, true);
        lv0Var.i0.G(null, true);
        lv0Var.h0.G(null, true);
        lv0Var.j0.F(null, true);
        wu0 wu0Var = lv0Var.S;
        if (wu0Var != null) {
            wu0Var.E(null, null);
        }
        lv0Var.K0(false);
        nj0 nj0Var = lv0Var.s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
        if (lv0Var.z0) {
            lv0Var.z0 = false;
        } else {
            lv0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        lv0 lv0Var = this.f;
        lv0Var.V0 = true;
        ys0 ys0Var = lv0Var.J0;
        if (ys0Var != null) {
            ys0Var.g((lv0Var.getSelectedTab() == 11 || lv0Var.getSelectedTab() == 12) && ys0Var.a());
        }
        ImageView imageView = lv0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = lv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        lv0Var.n0.setVisibility(8);
        lv0Var.K0(true);
        nj0 nj0Var = lv0Var.s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ci.h2 h2Var) {
        rt0 rt0Var = this.f.T;
        if (rt0Var != null) {
            rt0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        wu0 wu0Var;
        String obj = editText.getText().toString();
        lv0 lv0Var = this.f;
        rt0 rt0Var = lv0Var.T;
        if (rt0Var != null) {
            org.telegram.ui.ao aoVar = rt0Var.a;
            org.telegram.ui.ActionBar.v0 v0Var = aoVar.j0;
            if (v0Var != null) {
                aoVar.t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && lv0Var.W0 == null) {
                org.telegram.ui.ao aoVar2 = rt0Var.a;
                org.telegram.ui.rn rnVar = aoVar2.nc;
                if (rnVar != null) {
                    rnVar.m();
                }
                aoVar2.s3 = false;
                aoVar2.o0 = false;
                aoVar2.hc(false);
                aoVar2.Ic();
            }
        }
        lv0Var.n0.setVisibility(8);
        lv0Var.U0 = (obj.length() == 0 && lv0Var.W0 == null) ? false : true;
        lv0Var.post(new yq0(this, 3));
        int i10 = lv0Var.k0[0].F;
        if (i10 == 1) {
            hu0 hu0Var = lv0Var.g0;
            if (hu0Var == null) {
                return;
            }
            hu0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            hu0 hu0Var2 = lv0Var.i0;
            if (hu0Var2 == null) {
                return;
            }
            hu0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            hu0 hu0Var3 = lv0Var.h0;
            if (hu0Var3 == null) {
                return;
            }
            hu0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            cu0 cu0Var = lv0Var.j0;
            if (cu0Var == null) {
                return;
            }
            cu0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (wu0Var = lv0Var.S) == null) {
            return;
        }
        wu0Var.E(lv0Var.W0, obj);
    }
}
