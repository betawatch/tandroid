package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class gt0 extends fo0 {
    public final /* synthetic */ tv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, tv0 tv0Var) {
        super(i10, j10, context, n2Var, d6Var);
        this.I = tv0Var;
    }

    @Override // org.telegram.ui.Components.fo0
    public final void b(boolean z10) {
        jt0 jt0Var = this.I.I0;
        jt0Var.setAlpha(1.0f - this.E);
        jt0Var.setPivotX(jt0Var.getWidth() / 2.0f);
        jt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        jt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        jt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.fo0
    public final boolean f(ah.i1 i1Var) {
        zt0 zt0Var;
        tv0 tv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.n0;
        if (u0Var == null) {
            return false;
        }
        tv0Var.W0 = i1Var;
        String obj = u0Var.getSearchField().getText().toString();
        tv0Var.U0 = (obj.length() == 0 && tv0Var.W0 == null) ? false : true;
        tv0Var.o1(false);
        int i10 = tv0Var.k0[0].F;
        if (i10 == 11) {
            ev0 ev0Var = tv0Var.S;
            if (ev0Var != null) {
                ev0Var.E(tv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (zt0Var = tv0Var.T) != null) {
            org.telegram.ui.rn rnVar = zt0Var.a;
            org.telegram.ui.qk qkVar = rnVar.o1;
            if (qkVar != null) {
                qkVar.e(i1Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(rnVar.t3) && rnVar.q3 == null) ? false : true;
            rnVar.s3 = z10;
            rnVar.o0 = z10;
            rnVar.lc(false);
            rnVar.Mc();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fo0
    public final void h(boolean z10) {
        super.h(z10);
        tv0 tv0Var = this.I;
        gt0 gt0Var = tv0Var.J0;
        g(tv0Var.V0 && (tv0Var.getSelectedTab() == 11 || tv0Var.getSelectedTab() == 12) && gt0Var.a());
        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.m0;
        if (u0Var != null) {
            int i10 = (a() && tv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            xj0 xj0Var = u0Var.x;
            if (xj0Var != null && u0Var.y != i10) {
                if (z10) {
                    u0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(xj0Var, i10);
                } else {
                    u0Var.y = i10;
                    xj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = tv0Var.n0;
        if (u0Var2 != null) {
            u0Var2.setSearchFieldHint(LocaleController.getString((gt0Var != null && gt0Var.a() && tv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
