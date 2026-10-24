package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vt0 extends org.telegram.ui.ActionBar.k5 {
    public final /* synthetic */ xv0 r;

    public vt0(xv0 xv0Var) {
        this.r = xv0Var;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void l() {
        this.r.n0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void m() {
        xv0 xv0Var = this.r;
        kt0 kt0Var = xv0Var.J0;
        ImageView imageView = xv0Var.r0;
        xv0Var.V0 = false;
        xv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && xv0Var.b0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (kt0Var != null) {
            kt0Var.d.M(new org.telegram.ui.zq(2));
            kt0Var.h = 0L;
            kt0Var.g(false);
        }
        du0 du0Var = xv0Var.T;
        if (du0Var != null) {
            org.telegram.ui.tn tnVar = du0Var.a;
            org.telegram.ui.kn knVar = tnVar.Bc;
            if (knVar != null) {
                knVar.m();
            }
            tnVar.E3 = false;
            tnVar.o0 = false;
            tnVar.oc(false);
            tnVar.Pc();
        }
        xv0Var.U0 = false;
        xv0Var.n0.setVisibility(0);
        xv0Var.g0.G(null, true);
        xv0Var.i0.G(null, true);
        xv0Var.h0.G(null, true);
        xv0Var.j0.F(null, true);
        iv0 iv0Var = xv0Var.S;
        if (iv0Var != null) {
            iv0Var.E(null, null);
        }
        xv0Var.N0(false);
        bk0 bk0Var = xv0Var.s0;
        if (bk0Var != null) {
            bk0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
        if (xv0Var.z0) {
            xv0Var.z0 = false;
        } else {
            xv0Var.p1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void n() {
        xv0 xv0Var = this.r;
        xv0Var.V0 = true;
        kt0 kt0Var = xv0Var.J0;
        if (kt0Var != null) {
            kt0Var.g((xv0Var.getSelectedTab() == 11 || xv0Var.getSelectedTab() == 12) && kt0Var.a());
        }
        ImageView imageView = xv0Var.r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        xv0Var.n0.setVisibility(8);
        xv0Var.N0(true);
        bk0 bk0Var = xv0Var.s0;
        if (bk0Var != null) {
            bk0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void p(ei.e2 e2Var) {
        du0 du0Var = this.r.T;
        if (du0Var != null) {
            du0Var.a.r9();
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void q(EditText editText) {
        iv0 iv0Var;
        String obj = editText.getText().toString();
        xv0 xv0Var = this.r;
        du0 du0Var = xv0Var.T;
        if (du0Var != null) {
            org.telegram.ui.tn tnVar = du0Var.a;
            org.telegram.ui.ActionBar.u0 u0Var = tnVar.j0;
            if (u0Var != null) {
                tnVar.F3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && xv0Var.W0 == null) {
                org.telegram.ui.tn tnVar2 = du0Var.a;
                org.telegram.ui.kn knVar = tnVar2.Bc;
                if (knVar != null) {
                    knVar.m();
                }
                tnVar2.E3 = false;
                tnVar2.o0 = false;
                tnVar2.oc(false);
                tnVar2.Pc();
            }
        }
        xv0Var.n0.setVisibility(8);
        xv0Var.U0 = (obj.length() == 0 && xv0Var.W0 == null) ? false : true;
        xv0Var.post(new kr0(this, 3));
        int i10 = xv0Var.k0[0].F;
        if (i10 == 1) {
            tu0 tu0Var = xv0Var.g0;
            if (tu0Var == null) {
                return;
            }
            tu0Var.G(obj, true);
            return;
        }
        if (i10 == 3) {
            tu0 tu0Var2 = xv0Var.i0;
            if (tu0Var2 == null) {
                return;
            }
            tu0Var2.G(obj, true);
            return;
        }
        if (i10 == 4) {
            tu0 tu0Var3 = xv0Var.h0;
            if (tu0Var3 == null) {
                return;
            }
            tu0Var3.G(obj, true);
            return;
        }
        if (i10 == 7) {
            ou0 ou0Var = xv0Var.j0;
            if (ou0Var == null) {
                return;
            }
            ou0Var.F(obj, true);
            return;
        }
        if (i10 != 11 || (iv0Var = xv0Var.S) == null) {
            return;
        }
        iv0Var.E(xv0Var.W0, obj);
    }
}
