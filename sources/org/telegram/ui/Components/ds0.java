package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ds0 extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ hu0 f;

    public ds0(hu0 hu0Var) {
        this.f = hu0Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void l() {
        this.f.j0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        hu0 hu0Var = this.f;
        sr0 sr0Var = hu0Var.F0;
        ImageView imageView = hu0Var.n0;
        hu0Var.R0 = false;
        hu0Var.S0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.i0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && hu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (sr0Var != null) {
            sr0Var.d.M(new org.telegram.ui.ar(2));
            sr0Var.h = 0L;
            sr0Var.g(false);
        }
        ms0 ms0Var = hu0Var.P;
        if (ms0Var != null) {
            org.telegram.ui.sn snVar = ms0Var.a;
            org.telegram.ui.jn jnVar = snVar.kc;
            if (jnVar != null) {
                jnVar.m();
            }
            snVar.o3 = false;
            snVar.k0 = false;
            snVar.hc(false);
            snVar.Ic();
        }
        hu0Var.Q0 = false;
        hu0Var.j0.setVisibility(0);
        hu0Var.c0.G(null, true);
        hu0Var.e0.G(null, true);
        hu0Var.d0.G(null, true);
        hu0Var.f0.F(null, true);
        st0 st0Var = hu0Var.O;
        if (st0Var != null) {
            st0Var.E(null, null);
        }
        hu0Var.K0(false);
        ri0 ri0Var = hu0Var.o0;
        if (ri0Var != null) {
            ri0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(er.h).start();
        }
        if (hu0Var.v0) {
            hu0Var.v0 = false;
        } else {
            hu0Var.m1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        hu0 hu0Var = this.f;
        hu0Var.R0 = true;
        sr0 sr0Var = hu0Var.F0;
        if (sr0Var != null) {
            sr0Var.g((hu0Var.getSelectedTab() == 11 || hu0Var.getSelectedTab() == 12) && sr0Var.a());
        }
        ImageView imageView = hu0Var.n0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.i0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        hu0Var.j0.setVisibility(8);
        hu0Var.K0(true);
        ri0 ri0Var = hu0Var.o0;
        if (ri0Var != null) {
            ri0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(er.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(gg.g gVar) {
        ms0 ms0Var = this.f.P;
        if (ms0Var != null) {
            ms0Var.a.m9();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        st0 st0Var;
        String obj = editText.getText().toString();
        hu0 hu0Var = this.f;
        ms0 ms0Var = hu0Var.P;
        if (ms0Var != null) {
            org.telegram.ui.sn snVar = ms0Var.a;
            org.telegram.ui.ActionBar.v0 v0Var = snVar.f0;
            if (v0Var != null) {
                snVar.p3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && hu0Var.S0 == null) {
                org.telegram.ui.sn snVar2 = ms0Var.a;
                org.telegram.ui.jn jnVar = snVar2.kc;
                if (jnVar != null) {
                    jnVar.m();
                }
                snVar2.o3 = false;
                snVar2.k0 = false;
                snVar2.hc(false);
                snVar2.Ic();
            }
        }
        hu0Var.j0.setVisibility(8);
        hu0Var.Q0 = (obj.length() == 0 && hu0Var.S0 == null) ? false : true;
        hu0Var.post(new up0(this, 2));
        int i10 = hu0Var.g0[0].B;
        if (i10 == 1) {
            ct0 ct0Var = hu0Var.c0;
            if (ct0Var == null) {
                return;
            }
            ct0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            ct0 ct0Var2 = hu0Var.e0;
            if (ct0Var2 == null) {
                return;
            }
            ct0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            ct0 ct0Var3 = hu0Var.d0;
            if (ct0Var3 == null) {
                return;
            }
            ct0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            xs0 xs0Var = hu0Var.f0;
            if (xs0Var == null) {
                return;
            }
            xs0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (st0Var = hu0Var.O) == null) {
            return;
        }
        st0Var.E(hu0Var.S0, obj);
    }
}
