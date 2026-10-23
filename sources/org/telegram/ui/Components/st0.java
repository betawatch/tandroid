package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class st0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ uv0 r;

    public st0(uv0 uv0Var) {
        this.r = uv0Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void l() {
        this.r.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        uv0 uv0Var = this.r;
        ht0 ht0Var = uv0Var.J0;
        ImageView imageView = uv0Var.r0;
        uv0Var.V0 = false;
        uv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && uv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ht0Var != null) {
            ht0Var.d.M(new org.telegram.ui.xq(2));
            ht0Var.h = 0L;
            ht0Var.g(false);
        }
        au0 au0Var = uv0Var.T;
        if (au0Var != null) {
            org.telegram.ui.rn rnVar = au0Var.a;
            org.telegram.ui.in inVar = rnVar.oc;
            if (inVar != null) {
                inVar.m();
            }
            rnVar.s3 = false;
            rnVar.o0 = false;
            rnVar.mc(false);
            rnVar.Nc();
        }
        uv0Var.U0 = false;
        uv0Var.n0.setVisibility(0);
        uv0Var.g0.G(null, true);
        uv0Var.i0.G(null, true);
        uv0Var.h0.G(null, true);
        uv0Var.j0.F(null, true);
        fv0 fv0Var = uv0Var.S;
        if (fv0Var != null) {
            fv0Var.E(null, null);
        }
        uv0Var.M0(false);
        yj0 yj0Var = uv0Var.s0;
        if (yj0Var != null) {
            yj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
        if (uv0Var.z0) {
            uv0Var.z0 = false;
        } else {
            uv0Var.o1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        uv0 uv0Var = this.r;
        uv0Var.V0 = true;
        ht0 ht0Var = uv0Var.J0;
        if (ht0Var != null) {
            ht0Var.g((uv0Var.getSelectedTab() == 11 || uv0Var.getSelectedTab() == 12) && ht0Var.a());
        }
        ImageView imageView = uv0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        uv0Var.n0.setVisibility(8);
        uv0Var.M0(true);
        yj0 yj0Var = uv0Var.s0;
        if (yj0Var != null) {
            yj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ei.e2 e2Var) {
        au0 au0Var = this.r.T;
        if (au0Var != null) {
            au0Var.a.r9();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        fv0 fv0Var;
        String obj = editText.getText().toString();
        uv0 uv0Var = this.r;
        au0 au0Var = uv0Var.T;
        if (au0Var != null) {
            org.telegram.ui.rn rnVar = au0Var.a;
            org.telegram.ui.ActionBar.u0 u0Var = rnVar.j0;
            if (u0Var != null) {
                rnVar.t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && uv0Var.W0 == null) {
                org.telegram.ui.rn rnVar2 = au0Var.a;
                org.telegram.ui.in inVar = rnVar2.oc;
                if (inVar != null) {
                    inVar.m();
                }
                rnVar2.s3 = false;
                rnVar2.o0 = false;
                rnVar2.mc(false);
                rnVar2.Nc();
            }
        }
        uv0Var.n0.setVisibility(8);
        uv0Var.U0 = (obj.length() == 0 && uv0Var.W0 == null) ? false : true;
        uv0Var.post(new hr0(this, 2));
        int i10 = uv0Var.k0[0].F;
        if (i10 == 1) {
            qu0 qu0Var = uv0Var.g0;
            if (qu0Var == null) {
                return;
            }
            qu0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            qu0 qu0Var2 = uv0Var.i0;
            if (qu0Var2 == null) {
                return;
            }
            qu0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            qu0 qu0Var3 = uv0Var.h0;
            if (qu0Var3 == null) {
                return;
            }
            qu0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            lu0 lu0Var = uv0Var.j0;
            if (lu0Var == null) {
                return;
            }
            lu0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (fv0Var = uv0Var.S) == null) {
            return;
        }
        fv0Var.E(uv0Var.W0, obj);
    }
}
