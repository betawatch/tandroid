package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class cr0 extends org.telegram.ui.ActionBar.n0 {
    public final /* synthetic */ xs0 a;

    public cr0(xs0 xs0Var) {
        this.a = xs0Var;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void g() {
        this.a.p0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void h() {
        xs0 xs0Var = this.a;
        qq0 qq0Var = xs0Var.L0;
        ImageView imageView = xs0Var.t0;
        xs0Var.X0 = false;
        xs0Var.Y0 = null;
        org.telegram.ui.ActionBar.r0 r0Var = xs0Var.o0;
        if (r0Var != null) {
            r0Var.setVisibility(0);
        }
        if (imageView != null && xs0Var.k0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (qq0Var != null) {
            qq0Var.d.M(new org.telegram.ui.eq(2));
            qq0Var.h = 0L;
            qq0Var.g(false);
        }
        er0 er0Var = xs0Var.V;
        if (er0Var != null) {
            org.telegram.ui.bn bnVar = er0Var.a;
            org.telegram.ui.sm smVar = bnVar.Rc;
            if (smVar != null) {
                smVar.h();
            }
            bnVar.G3 = false;
            bnVar.q0 = false;
            bnVar.Lc(false);
            bnVar.md();
        }
        xs0Var.W0 = false;
        xs0Var.setSearchItemVisibility(0);
        xs0Var.i0.G(null, true);
        xs0Var.k0.G(null, true);
        xs0Var.j0.G(null, true);
        xs0Var.l0.F(null, true);
        js0 js0Var = xs0Var.U;
        if (js0Var != null) {
            js0Var.E(null, null);
        }
        xs0Var.V0(false);
        ch0 ch0Var = xs0Var.u0;
        if (ch0Var != null) {
            ch0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(xq.h).start();
        }
        if (xs0Var.B0) {
            xs0Var.B0 = false;
        } else {
            xs0Var.z1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void i() {
        xs0 xs0Var = this.a;
        xs0Var.X0 = true;
        qq0 qq0Var = xs0Var.L0;
        if (qq0Var != null) {
            qq0Var.g((xs0Var.getSelectedTab() == 11 || xs0Var.getSelectedTab() == 12) && qq0Var.a());
        }
        ImageView imageView = xs0Var.t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.r0 r0Var = xs0Var.o0;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        xs0Var.setSearchItemVisibility(8);
        xs0Var.V0(true);
        ch0 ch0Var = xs0Var.u0;
        if (ch0Var != null) {
            ch0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(xq.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        er0 er0Var = this.a.V;
        if (er0Var != null) {
            er0Var.a.J9();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void l(EditText editText) {
        js0 js0Var;
        String obj = editText.getText().toString();
        xs0 xs0Var = this.a;
        er0 er0Var = xs0Var.V;
        if (er0Var != null) {
            org.telegram.ui.bn bnVar = er0Var.a;
            org.telegram.ui.ActionBar.r0 r0Var = bnVar.j0;
            if (r0Var != null) {
                bnVar.H3 = obj;
                r0Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && xs0Var.Y0 == null) {
                org.telegram.ui.bn bnVar2 = er0Var.a;
                org.telegram.ui.sm smVar = bnVar2.Rc;
                if (smVar != null) {
                    smVar.h();
                }
                bnVar2.G3 = false;
                bnVar2.q0 = false;
                bnVar2.Lc(false);
                bnVar2.md();
            }
        }
        xs0Var.setSearchItemVisibility(8);
        xs0Var.W0 = (obj.length() == 0 && xs0Var.Y0 == null) ? false : true;
        xs0Var.post(new ob0(this, 29));
        int i7 = xs0Var.m0[0].E;
        if (i7 == 1) {
            ur0 ur0Var = xs0Var.i0;
            if (ur0Var == null) {
                return;
            }
            ur0Var.G(obj, true);
            return;
        }
        if (i7 == 3) {
            ur0 ur0Var2 = xs0Var.k0;
            if (ur0Var2 == null) {
                return;
            }
            ur0Var2.G(obj, true);
            return;
        }
        if (i7 == 4) {
            ur0 ur0Var3 = xs0Var.j0;
            if (ur0Var3 == null) {
                return;
            }
            ur0Var3.G(obj, true);
            return;
        }
        if (i7 == 7) {
            qr0 qr0Var = xs0Var.l0;
            if (qr0Var == null) {
                return;
            }
            qr0Var.F(obj, true);
            return;
        }
        if (i7 != 11 || (js0Var = xs0Var.U) == null) {
            return;
        }
        js0Var.E(xs0Var.Y0, obj);
    }
}
