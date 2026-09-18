package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xs0 extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ zu0 f;

    public xs0(zu0 zu0Var) {
        this.f = zu0Var;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void l() {
        this.f.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        zu0 zu0Var = this.f;
        ms0 ms0Var = zu0Var.J0;
        ImageView imageView = zu0Var.r0;
        zu0Var.V0 = false;
        zu0Var.W0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.m0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && zu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ms0Var != null) {
            ms0Var.d.N(new org.telegram.ui.kr(2));
            ms0Var.h = 0L;
            ms0Var.g(false);
        }
        ft0 ft0Var = zu0Var.T;
        if (ft0Var != null) {
            org.telegram.ui.co coVar = ft0Var.a;
            org.telegram.ui.tn tnVar = coVar.nc;
            if (tnVar != null) {
                tnVar.m();
            }
            coVar.s3 = false;
            coVar.o0 = false;
            coVar.hc(false);
            coVar.Ic();
        }
        zu0Var.U0 = false;
        zu0Var.n0.setVisibility(0);
        zu0Var.g0.G(null, true);
        zu0Var.i0.G(null, true);
        zu0Var.h0.G(null, true);
        zu0Var.j0.F(null, true);
        ku0 ku0Var = zu0Var.S;
        if (ku0Var != null) {
            ku0Var.E(null, null);
        }
        zu0Var.K0(false);
        bj0 bj0Var = zu0Var.s0;
        if (bj0Var != null) {
            bj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
        if (zu0Var.z0) {
            zu0Var.z0 = false;
        } else {
            zu0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
        zu0 zu0Var = this.f;
        zu0Var.V0 = true;
        ms0 ms0Var = zu0Var.J0;
        if (ms0Var != null) {
            ms0Var.g((zu0Var.getSelectedTab() == 11 || zu0Var.getSelectedTab() == 12) && ms0Var.a());
        }
        ImageView imageView = zu0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.m0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        zu0Var.n0.setVisibility(8);
        zu0Var.K0(true);
        bj0 bj0Var = zu0Var.s0;
        if (bj0Var != null) {
            bj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void p(ci.h2 h2Var) {
        ft0 ft0Var = this.f.T;
        if (ft0Var != null) {
            ft0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        ku0 ku0Var;
        String obj = editText.getText().toString();
        zu0 zu0Var = this.f;
        ft0 ft0Var = zu0Var.T;
        if (ft0Var != null) {
            org.telegram.ui.co coVar = ft0Var.a;
            org.telegram.ui.ActionBar.w0 w0Var = coVar.j0;
            if (w0Var != null) {
                coVar.t3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && zu0Var.W0 == null) {
                org.telegram.ui.co coVar2 = ft0Var.a;
                org.telegram.ui.tn tnVar = coVar2.nc;
                if (tnVar != null) {
                    tnVar.m();
                }
                coVar2.s3 = false;
                coVar2.o0 = false;
                coVar2.hc(false);
                coVar2.Ic();
            }
        }
        zu0Var.n0.setVisibility(8);
        zu0Var.U0 = (obj.length() == 0 && zu0Var.W0 == null) ? false : true;
        zu0Var.post(new kq0(this, 2));
        int i10 = zu0Var.k0[0].F;
        if (i10 == 1) {
            vt0 vt0Var = zu0Var.g0;
            if (vt0Var == null) {
                return;
            }
            vt0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            vt0 vt0Var2 = zu0Var.i0;
            if (vt0Var2 == null) {
                return;
            }
            vt0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            vt0 vt0Var3 = zu0Var.h0;
            if (vt0Var3 == null) {
                return;
            }
            vt0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            qt0 qt0Var = zu0Var.j0;
            if (qt0Var == null) {
                return;
            }
            qt0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (ku0Var = zu0Var.S) == null) {
            return;
        }
        ku0Var.E(zu0Var.W0, obj);
    }
}
