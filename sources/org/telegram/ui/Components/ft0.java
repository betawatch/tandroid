package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ft0 extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ iv0 f;

    public ft0(iv0 iv0Var) {
        this.f = iv0Var;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void l() {
        this.f.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        iv0 iv0Var = this.f;
        us0 us0Var = iv0Var.J0;
        ImageView imageView = iv0Var.r0;
        iv0Var.V0 = false;
        iv0Var.W0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.m0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && iv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (us0Var != null) {
            us0Var.d.M(new org.telegram.ui.mr(2));
            us0Var.h = 0L;
            us0Var.g(false);
        }
        nt0 nt0Var = iv0Var.T;
        if (nt0Var != null) {
            org.telegram.ui.fo foVar = nt0Var.a;
            org.telegram.ui.vn vnVar = foVar.oc;
            if (vnVar != null) {
                vnVar.m();
            }
            foVar.s3 = false;
            foVar.o0 = false;
            foVar.hc(false);
            foVar.Ic();
        }
        iv0Var.U0 = false;
        iv0Var.n0.setVisibility(0);
        iv0Var.g0.G(null, true);
        iv0Var.i0.G(null, true);
        iv0Var.h0.G(null, true);
        iv0Var.j0.F(null, true);
        tu0 tu0Var = iv0Var.S;
        if (tu0Var != null) {
            tu0Var.E(null, null);
        }
        iv0Var.K0(false);
        kj0 kj0Var = iv0Var.s0;
        if (kj0Var != null) {
            kj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(wr.h).start();
        }
        if (iv0Var.z0) {
            iv0Var.z0 = false;
        } else {
            iv0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
        iv0 iv0Var = this.f;
        iv0Var.V0 = true;
        us0 us0Var = iv0Var.J0;
        if (us0Var != null) {
            us0Var.g((iv0Var.getSelectedTab() == 11 || iv0Var.getSelectedTab() == 12) && us0Var.a());
        }
        ImageView imageView = iv0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.m0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        iv0Var.n0.setVisibility(8);
        iv0Var.K0(true);
        kj0 kj0Var = iv0Var.s0;
        if (kj0Var != null) {
            kj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(wr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void p(bi.t2 t2Var) {
        nt0 nt0Var = this.f.T;
        if (nt0Var != null) {
            nt0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        tu0 tu0Var;
        String obj = editText.getText().toString();
        iv0 iv0Var = this.f;
        nt0 nt0Var = iv0Var.T;
        if (nt0Var != null) {
            org.telegram.ui.fo foVar = nt0Var.a;
            org.telegram.ui.ActionBar.w0 w0Var = foVar.j0;
            if (w0Var != null) {
                foVar.t3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && iv0Var.W0 == null) {
                org.telegram.ui.fo foVar2 = nt0Var.a;
                org.telegram.ui.vn vnVar = foVar2.oc;
                if (vnVar != null) {
                    vnVar.m();
                }
                foVar2.s3 = false;
                foVar2.o0 = false;
                foVar2.hc(false);
                foVar2.Ic();
            }
        }
        iv0Var.n0.setVisibility(8);
        iv0Var.U0 = (obj.length() == 0 && iv0Var.W0 == null) ? false : true;
        iv0Var.post(new uq0(this, 2));
        int i10 = iv0Var.k0[0].F;
        if (i10 == 1) {
            du0 du0Var = iv0Var.g0;
            if (du0Var == null) {
                return;
            }
            du0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            du0 du0Var2 = iv0Var.i0;
            if (du0Var2 == null) {
                return;
            }
            du0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            du0 du0Var3 = iv0Var.h0;
            if (du0Var3 == null) {
                return;
            }
            du0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            yt0 yt0Var = iv0Var.j0;
            if (yt0Var == null) {
                return;
            }
            yt0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (tu0Var = iv0Var.S) == null) {
            return;
        }
        tu0Var.E(iv0Var.W0, obj);
    }
}
