package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class mr0 extends org.telegram.ui.ActionBar.m0 {
    public final /* synthetic */ it0 a;

    public mr0(it0 it0Var) {
        this.a = it0Var;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void g() {
        this.a.q0.setTranslationX(((View) r0.getParent()).getMeasuredWidth() - r0.getRight());
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void h() {
        it0 it0Var = this.a;
        br0 br0Var = it0Var.M0;
        ImageView imageView = it0Var.u0;
        it0Var.Y0 = false;
        it0Var.Z0 = null;
        org.telegram.ui.ActionBar.q0 q0Var = it0Var.p0;
        if (q0Var != null) {
            q0Var.setVisibility(0);
        }
        if (imageView != null && it0Var.k0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (br0Var != null) {
            br0Var.d.M(new org.telegram.ui.hq(2));
            br0Var.h = 0L;
            br0Var.g(false);
        }
        pr0 pr0Var = it0Var.W;
        if (pr0Var != null) {
            org.telegram.ui.cn cnVar = pr0Var.a;
            org.telegram.ui.tm tmVar = cnVar.Vc;
            if (tmVar != null) {
                tmVar.h();
            }
            cnVar.H3 = false;
            cnVar.r0 = false;
            cnVar.Pc(false);
            cnVar.qd();
        }
        it0Var.X0 = false;
        it0Var.setSearchItemVisibility(0);
        it0Var.j0.G(null, true);
        it0Var.l0.G(null, true);
        it0Var.k0.G(null, true);
        it0Var.m0.F(null, true);
        us0 us0Var = it0Var.V;
        if (us0Var != null) {
            us0Var.E(null, null);
        }
        it0Var.X0(false);
        qh0 qh0Var = it0Var.v0;
        if (qh0Var != null) {
            qh0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(kr.h).start();
        }
        if (it0Var.C0) {
            it0Var.C0 = false;
        } else {
            it0Var.B1(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void i() {
        it0 it0Var = this.a;
        it0Var.Y0 = true;
        br0 br0Var = it0Var.M0;
        if (br0Var != null) {
            br0Var.g((it0Var.getSelectedTab() == 11 || it0Var.getSelectedTab() == 12) && br0Var.a());
        }
        ImageView imageView = it0Var.u0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.q0 q0Var = it0Var.p0;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        it0Var.setSearchItemVisibility(8);
        it0Var.X0(true);
        qh0 qh0Var = it0Var.v0;
        if (qh0Var != null) {
            qh0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(kr.h).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        pr0 pr0Var = this.a.W;
        if (pr0Var != null) {
            pr0Var.a.L9();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void l(EditText editText) {
        us0 us0Var;
        String obj = editText.getText().toString();
        it0 it0Var = this.a;
        pr0 pr0Var = it0Var.W;
        if (pr0Var != null) {
            org.telegram.ui.cn cnVar = pr0Var.a;
            org.telegram.ui.ActionBar.q0 q0Var = cnVar.k0;
            if (q0Var != null) {
                cnVar.I3 = obj;
                q0Var.Q(obj, false);
            }
            if (TextUtils.isEmpty(obj) && it0Var.Z0 == null) {
                org.telegram.ui.cn cnVar2 = pr0Var.a;
                org.telegram.ui.tm tmVar = cnVar2.Vc;
                if (tmVar != null) {
                    tmVar.h();
                }
                cnVar2.H3 = false;
                cnVar2.r0 = false;
                cnVar2.Pc(false);
                cnVar2.qd();
            }
        }
        it0Var.setSearchItemVisibility(8);
        it0Var.X0 = (obj.length() == 0 && it0Var.Z0 == null) ? false : true;
        it0Var.post(new bp0(this, 2));
        int i7 = it0Var.n0[0].F;
        if (i7 == 1) {
            fs0 fs0Var = it0Var.j0;
            if (fs0Var == null) {
                return;
            }
            fs0Var.G(obj, true);
            return;
        }
        if (i7 == 3) {
            fs0 fs0Var2 = it0Var.l0;
            if (fs0Var2 == null) {
                return;
            }
            fs0Var2.G(obj, true);
            return;
        }
        if (i7 == 4) {
            fs0 fs0Var3 = it0Var.k0;
            if (fs0Var3 == null) {
                return;
            }
            fs0Var3.G(obj, true);
            return;
        }
        if (i7 == 7) {
            bs0 bs0Var = it0Var.m0;
            if (bs0Var == null) {
                return;
            }
            bs0Var.F(obj, true);
            return;
        }
        if (i7 != 11 || (us0Var = it0Var.V) == null) {
            return;
        }
        us0Var.E(it0Var.Z0, obj);
    }
}
