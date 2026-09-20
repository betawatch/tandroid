package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ht0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ jv0 f;

    public ht0(jv0 jv0Var) {
        this.f = jv0Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void l() {
        this.f.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        jv0 jv0Var = this.f;
        ws0 ws0Var = jv0Var.J0;
        ImageView imageView = jv0Var.r0;
        jv0Var.V0 = false;
        jv0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = jv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && jv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ws0Var != null) {
            ws0Var.d.N(new org.telegram.ui.ir(2));
            ws0Var.h = 0L;
            ws0Var.g(false);
        }
        pt0 pt0Var = jv0Var.T;
        if (pt0Var != null) {
            org.telegram.ui.ao aoVar = pt0Var.a;
            org.telegram.ui.rn rnVar = aoVar.nc;
            if (rnVar != null) {
                rnVar.m();
            }
            aoVar.s3 = false;
            aoVar.o0 = false;
            aoVar.hc(false);
            aoVar.Ic();
        }
        jv0Var.U0 = false;
        jv0Var.n0.setVisibility(0);
        jv0Var.g0.G(null, true);
        jv0Var.i0.G(null, true);
        jv0Var.h0.G(null, true);
        jv0Var.j0.F(null, true);
        uu0 uu0Var = jv0Var.S;
        if (uu0Var != null) {
            uu0Var.E(null, null);
        }
        jv0Var.K0(false);
        kj0 kj0Var = jv0Var.s0;
        if (kj0Var != null) {
            kj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
        if (jv0Var.z0) {
            jv0Var.z0 = false;
        } else {
            jv0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        jv0 jv0Var = this.f;
        jv0Var.V0 = true;
        ws0 ws0Var = jv0Var.J0;
        if (ws0Var != null) {
            ws0Var.g((jv0Var.getSelectedTab() == 11 || jv0Var.getSelectedTab() == 12) && ws0Var.a());
        }
        ImageView imageView = jv0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = jv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        jv0Var.n0.setVisibility(8);
        jv0Var.K0(true);
        kj0 kj0Var = jv0Var.s0;
        if (kj0Var != null) {
            kj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ci.h2 h2Var) {
        pt0 pt0Var = this.f.T;
        if (pt0Var != null) {
            pt0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        uu0 uu0Var;
        String obj = editText.getText().toString();
        jv0 jv0Var = this.f;
        pt0 pt0Var = jv0Var.T;
        if (pt0Var != null) {
            org.telegram.ui.ao aoVar = pt0Var.a;
            org.telegram.ui.ActionBar.v0 v0Var = aoVar.j0;
            if (v0Var != null) {
                aoVar.t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && jv0Var.W0 == null) {
                org.telegram.ui.ao aoVar2 = pt0Var.a;
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
        jv0Var.n0.setVisibility(8);
        jv0Var.U0 = (obj.length() == 0 && jv0Var.W0 == null) ? false : true;
        jv0Var.post(new wq0(this, 2));
        int i10 = jv0Var.k0[0].F;
        if (i10 == 1) {
            fu0 fu0Var = jv0Var.g0;
            if (fu0Var == null) {
                return;
            }
            fu0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            fu0 fu0Var2 = jv0Var.i0;
            if (fu0Var2 == null) {
                return;
            }
            fu0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            fu0 fu0Var3 = jv0Var.h0;
            if (fu0Var3 == null) {
                return;
            }
            fu0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            au0 au0Var = jv0Var.j0;
            if (au0Var == null) {
                return;
            }
            au0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (uu0Var = jv0Var.S) == null) {
            return;
        }
        uu0Var.E(jv0Var.W0, obj);
    }
}
