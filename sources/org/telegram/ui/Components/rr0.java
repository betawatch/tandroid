package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rr0 extends rm0 {
    public final /* synthetic */ zt0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr0(zt0 zt0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, k2Var, i10, j10, p6Var);
        this.I = zt0Var;
    }

    @Override // org.telegram.ui.Components.rm0
    public final void b(boolean z10) {
        ur0 ur0Var = this.I.K0;
        ur0Var.setAlpha(1.0f - this.E);
        ur0Var.setPivotX(ur0Var.getWidth() / 2.0f);
        ur0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        ur0Var.setPivotY(org.telegram.messenger.i0.L(48.0f));
        ur0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.rm0
    public final boolean f(sg.o0 o0Var) {
        fs0 fs0Var;
        zt0 zt0Var = this.I;
        org.telegram.ui.ActionBar.t0 t0Var = zt0Var.p0;
        if (t0Var == null) {
            return false;
        }
        zt0Var.Y0 = o0Var;
        String obj = t0Var.getSearchField().getText().toString();
        zt0Var.W0 = (obj.length() == 0 && zt0Var.Y0 == null) ? false : true;
        zt0Var.w1(false);
        int i10 = zt0Var.m0[0].E;
        if (i10 == 11) {
            lt0 lt0Var = zt0Var.U;
            if (lt0Var != null) {
                lt0Var.E(obj, zt0Var.Y0);
            }
            org.telegram.messenger.i0.v1(t0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (fs0Var = zt0Var.V) != null) {
            org.telegram.ui.vn vnVar = fs0Var.a;
            org.telegram.ui.wk wkVar = vnVar.C1;
            if (wkVar != null) {
                wkVar.e(o0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(vnVar.H3) && vnVar.E3 == null) ? false : true;
            vnVar.G3 = z10;
            vnVar.q0 = z10;
            vnVar.Bc(false);
            vnVar.cd();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.rm0
    public final void h(boolean z10) {
        super.h(z10);
        zt0 zt0Var = this.I;
        rr0 rr0Var = zt0Var.L0;
        g(zt0Var.X0 && (zt0Var.getSelectedTab() == 11 || zt0Var.getSelectedTab() == 12) && rr0Var.a());
        org.telegram.ui.ActionBar.t0 t0Var = zt0Var.o0;
        if (t0Var != null) {
            int i10 = (a() && zt0Var.x1.getUserConfig().q()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            ei0 ei0Var = t0Var.y;
            if (ei0Var != null && t0Var.D != i10) {
                if (z10) {
                    t0Var.D = i10;
                    org.telegram.messenger.i0.Q3(ei0Var, i10);
                } else {
                    t0Var.D = i10;
                    ei0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var2 = zt0Var.p0;
        if (t0Var2 != null) {
            t0Var2.setSearchFieldHint(org.telegram.messenger.cd.L0((rr0Var != null && rr0Var.a() && zt0Var.getSelectedTab() == 11) ? 2131745885 : 2131745853, null));
        }
    }
}
