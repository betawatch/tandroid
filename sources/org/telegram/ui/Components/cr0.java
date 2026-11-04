package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cr0 extends org.telegram.ui.ActionBar.m0 {
    public final /* synthetic */ ws0 a;

    public cr0(ws0 ws0Var) {
        this.a = ws0Var;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void g() {
        this.a.q0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void h() {
        ws0 ws0Var = this.a;
        qq0 qq0Var = ws0Var.M0;
        ImageView imageView = ws0Var.u0;
        ws0Var.Y0 = false;
        ws0Var.Z0 = null;
        org.telegram.ui.ActionBar.q0 q0Var = ws0Var.p0;
        if (q0Var != null) {
            q0Var.setVisibility(0);
        }
        if (imageView != null && ws0Var.k0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (qq0Var != null) {
            qq0Var.d.M(new org.telegram.ui.cq(2));
            qq0Var.h = 0L;
            qq0Var.g(false);
        }
        er0 er0Var = ws0Var.W;
        if (er0Var != null) {
            org.telegram.ui.xm xmVar = er0Var.a;
            org.telegram.ui.om omVar = xmVar.Sc;
            if (omVar != null) {
                omVar.h();
            }
            xmVar.H3 = false;
            xmVar.r0 = false;
            xmVar.Lc(false);
            xmVar.md();
        }
        ws0Var.X0 = false;
        ws0Var.setSearchItemVisibility(0);
        ws0Var.j0.G(null, true);
        ws0Var.l0.G(null, true);
        ws0Var.k0.G(null, true);
        ws0Var.m0.F(null, true);
        is0 is0Var = ws0Var.V;
        if (is0Var != null) {
            is0Var.E(null, null);
        }
        ws0Var.V0(false);
        fh0 fh0Var = ws0Var.v0;
        if (fh0Var != null) {
            fh0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(xq.h).start();
        }
        if (ws0Var.C0) {
            ws0Var.C0 = false;
        } else {
            ws0Var.z1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void i() {
        ws0 ws0Var = this.a;
        ws0Var.Y0 = true;
        qq0 qq0Var = ws0Var.M0;
        if (qq0Var != null) {
            qq0Var.g((ws0Var.getSelectedTab() == 11 || ws0Var.getSelectedTab() == 12) && qq0Var.a());
        }
        ImageView imageView = ws0Var.u0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.q0 q0Var = ws0Var.p0;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        ws0Var.setSearchItemVisibility(8);
        ws0Var.V0(true);
        fh0 fh0Var = ws0Var.v0;
        if (fh0Var != null) {
            fh0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(xq.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        er0 er0Var = this.a.W;
        if (er0Var != null) {
            er0Var.a.J9();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void l(EditText editText) {
        is0 is0Var;
        String obj = editText.getText().toString();
        ws0 ws0Var = this.a;
        er0 er0Var = ws0Var.W;
        if (er0Var != null) {
            org.telegram.ui.xm xmVar = er0Var.a;
            org.telegram.ui.ActionBar.q0 q0Var = xmVar.k0;
            if (q0Var != null) {
                xmVar.I3 = obj;
                q0Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && ws0Var.Z0 == null) {
                org.telegram.ui.xm xmVar2 = er0Var.a;
                org.telegram.ui.om omVar = xmVar2.Sc;
                if (omVar != null) {
                    omVar.h();
                }
                xmVar2.H3 = false;
                xmVar2.r0 = false;
                xmVar2.Lc(false);
                xmVar2.md();
            }
        }
        ws0Var.setSearchItemVisibility(8);
        ws0Var.X0 = (obj.length() == 0 && ws0Var.Z0 == null) ? false : true;
        ws0Var.post(new sp0(this, 1));
        int i3 = ws0Var.n0[0].F;
        if (i3 == 1) {
            tr0 tr0Var = ws0Var.j0;
            if (tr0Var == null) {
                return;
            }
            tr0Var.G(obj, true);
            return;
        }
        if (i3 == 3) {
            tr0 tr0Var2 = ws0Var.l0;
            if (tr0Var2 == null) {
                return;
            }
            tr0Var2.G(obj, true);
            return;
        }
        if (i3 == 4) {
            tr0 tr0Var3 = ws0Var.k0;
            if (tr0Var3 == null) {
                return;
            }
            tr0Var3.G(obj, true);
            return;
        }
        if (i3 == 7) {
            pr0 pr0Var = ws0Var.m0;
            if (pr0Var == null) {
                return;
            }
            pr0Var.F(obj, true);
            return;
        }
        if (i3 != 11 || (is0Var = ws0Var.V) == null) {
            return;
        }
        is0Var.E(ws0Var.Z0, obj);
    }
}
