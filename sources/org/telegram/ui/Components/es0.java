package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class es0 extends org.telegram.ui.ActionBar.p0 {
    public final /* synthetic */ au0 a;

    public es0(au0 au0Var) {
        this.a = au0Var;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void g() {
        this.a.p0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void h() {
        au0 au0Var = this.a;
        sr0 sr0Var = au0Var.L0;
        ImageView imageView = au0Var.t0;
        au0Var.X0 = false;
        au0Var.Y0 = null;
        org.telegram.ui.ActionBar.t0 t0Var = au0Var.o0;
        if (t0Var != null) {
            t0Var.setVisibility(0);
        }
        if (imageView != null && au0Var.j0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (sr0Var != null) {
            sr0Var.d.M(new org.telegram.ui.fr(2));
            sr0Var.h = 0L;
            sr0Var.g(false);
        }
        gs0 gs0Var = au0Var.V;
        if (gs0Var != null) {
            org.telegram.ui.vn vnVar = gs0Var.a;
            org.telegram.ui.mn mnVar = vnVar.Kc;
            if (mnVar != null) {
                mnVar.h();
            }
            vnVar.G3 = false;
            vnVar.q0 = false;
            vnVar.Gc(false);
            vnVar.hd();
        }
        au0Var.W0 = false;
        au0Var.setSearchItemVisibility(0);
        au0Var.i0.G(null, true);
        au0Var.k0.G(null, true);
        au0Var.j0.G(null, true);
        au0Var.l0.F(null, true);
        mt0 mt0Var = au0Var.U;
        if (mt0Var != null) {
            mt0Var.E(null, null);
        }
        au0Var.T0(false);
        fi0 fi0Var = au0Var.u0;
        if (fi0Var != null) {
            fi0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
        if (au0Var.B0) {
            au0Var.B0 = false;
        } else {
            au0Var.x1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void i() {
        au0 au0Var = this.a;
        au0Var.X0 = true;
        sr0 sr0Var = au0Var.L0;
        if (sr0Var != null) {
            sr0Var.g((au0Var.getSelectedTab() == 11 || au0Var.getSelectedTab() == 12) && sr0Var.a());
        }
        ImageView imageView = au0Var.t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.t0 t0Var = au0Var.o0;
        if (t0Var != null) {
            t0Var.setVisibility(8);
        }
        au0Var.setSearchItemVisibility(8);
        au0Var.T0(true);
        fi0 fi0Var = au0Var.u0;
        if (fi0Var != null) {
            fi0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        gs0 gs0Var = this.a.V;
        if (gs0Var != null) {
            gs0Var.a.E9();
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void l(EditText editText) {
        mt0 mt0Var;
        String obj = editText.getText().toString();
        au0 au0Var = this.a;
        gs0 gs0Var = au0Var.V;
        if (gs0Var != null) {
            org.telegram.ui.vn vnVar = gs0Var.a;
            org.telegram.ui.ActionBar.t0 t0Var = vnVar.j0;
            if (t0Var != null) {
                vnVar.H3 = obj;
                t0Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && au0Var.Y0 == null) {
                org.telegram.ui.vn vnVar2 = gs0Var.a;
                org.telegram.ui.mn mnVar = vnVar2.Kc;
                if (mnVar != null) {
                    mnVar.h();
                }
                vnVar2.G3 = false;
                vnVar2.q0 = false;
                vnVar2.Gc(false);
                vnVar2.hd();
            }
        }
        au0Var.setSearchItemVisibility(8);
        au0Var.W0 = (obj.length() == 0 && au0Var.Y0 == null) ? false : true;
        au0Var.post(new vo0(this, 4));
        int i10 = au0Var.m0[0].E;
        if (i10 == 1) {
            vs0 vs0Var = au0Var.i0;
            if (vs0Var == null) {
                return;
            }
            vs0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            vs0 vs0Var2 = au0Var.k0;
            if (vs0Var2 == null) {
                return;
            }
            vs0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            vs0 vs0Var3 = au0Var.j0;
            if (vs0Var3 == null) {
                return;
            }
            vs0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            rs0 rs0Var = au0Var.l0;
            if (rs0Var == null) {
                return;
            }
            rs0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (mt0Var = au0Var.U) == null) {
            return;
        }
        mt0Var.E(obj, au0Var.Y0);
    }
}
