package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class it0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ kv0 f;

    public it0(kv0 kv0Var) {
        this.f = kv0Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void l() {
        this.f.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        kv0 kv0Var = this.f;
        xs0 xs0Var = kv0Var.J0;
        ImageView imageView = kv0Var.r0;
        kv0Var.V0 = false;
        kv0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = kv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && kv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (xs0Var != null) {
            xs0Var.d.N(new org.telegram.ui.ir(2));
            xs0Var.h = 0L;
            xs0Var.g(false);
        }
        qt0 qt0Var = kv0Var.T;
        if (qt0Var != null) {
            org.telegram.ui.ao aoVar = qt0Var.a;
            org.telegram.ui.rn rnVar = aoVar.nc;
            if (rnVar != null) {
                rnVar.m();
            }
            aoVar.s3 = false;
            aoVar.o0 = false;
            aoVar.hc(false);
            aoVar.Ic();
        }
        kv0Var.U0 = false;
        kv0Var.n0.setVisibility(0);
        kv0Var.g0.G(null, true);
        kv0Var.i0.G(null, true);
        kv0Var.h0.G(null, true);
        kv0Var.j0.F(null, true);
        vu0 vu0Var = kv0Var.S;
        if (vu0Var != null) {
            vu0Var.E(null, null);
        }
        kv0Var.K0(false);
        lj0 lj0Var = kv0Var.s0;
        if (lj0Var != null) {
            lj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
        if (kv0Var.z0) {
            kv0Var.z0 = false;
        } else {
            kv0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        kv0 kv0Var = this.f;
        kv0Var.V0 = true;
        xs0 xs0Var = kv0Var.J0;
        if (xs0Var != null) {
            xs0Var.g((kv0Var.getSelectedTab() == 11 || kv0Var.getSelectedTab() == 12) && xs0Var.a());
        }
        ImageView imageView = kv0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = kv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        kv0Var.n0.setVisibility(8);
        kv0Var.K0(true);
        lj0 lj0Var = kv0Var.s0;
        if (lj0Var != null) {
            lj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ci.h2 h2Var) {
        qt0 qt0Var = this.f.T;
        if (qt0Var != null) {
            qt0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        vu0 vu0Var;
        String obj = editText.getText().toString();
        kv0 kv0Var = this.f;
        qt0 qt0Var = kv0Var.T;
        if (qt0Var != null) {
            org.telegram.ui.ao aoVar = qt0Var.a;
            org.telegram.ui.ActionBar.v0 v0Var = aoVar.j0;
            if (v0Var != null) {
                aoVar.t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && kv0Var.W0 == null) {
                org.telegram.ui.ao aoVar2 = qt0Var.a;
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
        kv0Var.n0.setVisibility(8);
        kv0Var.U0 = (obj.length() == 0 && kv0Var.W0 == null) ? false : true;
        kv0Var.post(new xq0(this, 2));
        int i10 = kv0Var.k0[0].F;
        if (i10 == 1) {
            gu0 gu0Var = kv0Var.g0;
            if (gu0Var == null) {
                return;
            }
            gu0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            gu0 gu0Var2 = kv0Var.i0;
            if (gu0Var2 == null) {
                return;
            }
            gu0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            gu0 gu0Var3 = kv0Var.h0;
            if (gu0Var3 == null) {
                return;
            }
            gu0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            bu0 bu0Var = kv0Var.j0;
            if (bu0Var == null) {
                return;
            }
            bu0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (vu0Var = kv0Var.S) == null) {
            return;
        }
        vu0Var.E(kv0Var.W0, obj);
    }
}
