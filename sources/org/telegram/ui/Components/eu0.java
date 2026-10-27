package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class eu0 extends org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ bw0 a;

    public eu0(bw0 bw0Var) {
        this.a = bw0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void g() {
        this.a.p0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        bw0 bw0Var = this.a;
        st0 st0Var = bw0Var.L0;
        ImageView imageView = bw0Var.t0;
        bw0Var.X0 = false;
        bw0Var.Y0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = bw0Var.o0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && bw0Var.h0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (st0Var != null) {
            st0Var.d.M(new org.telegram.ui.cr(2));
            st0Var.h = 0L;
            st0Var.g(false);
        }
        gu0 gu0Var = bw0Var.V;
        if (gu0Var != null) {
            org.telegram.ui.xn xnVar = gu0Var.a;
            org.telegram.ui.on onVar = xnVar.Oc;
            if (onVar != null) {
                onVar.h();
            }
            xnVar.E3 = false;
            xnVar.o0 = false;
            xnVar.yc(false);
            xnVar.Zc();
        }
        bw0Var.W0 = false;
        bw0Var.setSearchItemVisibility(0);
        bw0Var.i0.G(null, true);
        bw0Var.k0.G(null, true);
        bw0Var.j0.G(null, true);
        bw0Var.l0.F(null, true);
        nv0 nv0Var = bw0Var.U;
        if (nv0Var != null) {
            nv0Var.E(null, null);
        }
        bw0Var.R0(false);
        bk0 bk0Var = bw0Var.u0;
        if (bk0Var != null) {
            bk0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(ds.h).start();
        }
        if (bw0Var.B0) {
            bw0Var.B0 = false;
        } else {
            bw0Var.v1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
        bw0 bw0Var = this.a;
        bw0Var.X0 = true;
        st0 st0Var = bw0Var.L0;
        if (st0Var != null) {
            st0Var.g((bw0Var.getSelectedTab() == 11 || bw0Var.getSelectedTab() == 12) && st0Var.a());
        }
        ImageView imageView = bw0Var.t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = bw0Var.o0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        bw0Var.setSearchItemVisibility(8);
        bw0Var.R0(true);
        bk0 bk0Var = bw0Var.u0;
        if (bk0Var != null) {
            bk0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(ds.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        gu0 gu0Var = this.a.V;
        if (gu0Var != null) {
            gu0Var.a.z9();
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        nv0 nv0Var;
        String obj = editText.getText().toString();
        bw0 bw0Var = this.a;
        gu0 gu0Var = bw0Var.V;
        if (gu0Var != null) {
            org.telegram.ui.xn xnVar = gu0Var.a;
            org.telegram.ui.ActionBar.w0 w0Var = xnVar.j0;
            if (w0Var != null) {
                xnVar.F3 = obj;
                w0Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && bw0Var.Y0 == null) {
                org.telegram.ui.xn xnVar2 = gu0Var.a;
                org.telegram.ui.on onVar = xnVar2.Oc;
                if (onVar != null) {
                    onVar.h();
                }
                xnVar2.E3 = false;
                xnVar2.o0 = false;
                xnVar2.yc(false);
                xnVar2.Zc();
            }
        }
        bw0Var.setSearchItemVisibility(8);
        bw0Var.W0 = (obj.length() == 0 && bw0Var.Y0 == null) ? false : true;
        bw0Var.post(new np0(this, 6));
        int i10 = bw0Var.m0[0].E;
        if (i10 == 1) {
            xu0 xu0Var = bw0Var.i0;
            if (xu0Var == null) {
                return;
            }
            xu0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            xu0 xu0Var2 = bw0Var.k0;
            if (xu0Var2 == null) {
                return;
            }
            xu0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            xu0 xu0Var3 = bw0Var.j0;
            if (xu0Var3 == null) {
                return;
            }
            xu0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            su0 su0Var = bw0Var.l0;
            if (su0Var == null) {
                return;
            }
            su0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (nv0Var = bw0Var.U) == null) {
            return;
        }
        nv0Var.E(bw0Var.Y0, obj);
    }
}
