package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ks0 extends hn0 {
    public final /* synthetic */ xu0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, xu0 xu0Var) {
        super(i10, j3, context, n2Var, f6Var);
        this.I = xu0Var;
    }

    @Override // org.telegram.ui.Components.hn0
    public final void b(boolean z10) {
        ns0 ns0Var = this.I.I0;
        ns0Var.setAlpha(1.0f - this.E);
        ns0Var.setPivotX(ns0Var.getWidth() / 2.0f);
        ns0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        ns0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ns0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.hn0
    public final boolean f(ah.j1 j1Var) {
        dt0 dt0Var;
        xu0 xu0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = xu0Var.n0;
        if (v0Var == null) {
            return false;
        }
        xu0Var.W0 = j1Var;
        String obj = v0Var.getSearchField().getText().toString();
        xu0Var.U0 = (obj.length() == 0 && xu0Var.W0 == null) ? false : true;
        xu0Var.m1(false);
        int i10 = xu0Var.k0[0].F;
        if (i10 == 11) {
            iu0 iu0Var = xu0Var.S;
            if (iu0Var != null) {
                iu0Var.E(xu0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (dt0Var = xu0Var.T) != null) {
            org.telegram.ui.eo eoVar = dt0Var.a;
            org.telegram.ui.yk ykVar = eoVar.o1;
            if (ykVar != null) {
                ykVar.e(j1Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(eoVar.t3) && eoVar.q3 == null) ? false : true;
            eoVar.s3 = z10;
            eoVar.o0 = z10;
            eoVar.hc(false);
            eoVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.hn0
    public final void h(boolean z10) {
        super.h(z10);
        xu0 xu0Var = this.I;
        ks0 ks0Var = xu0Var.J0;
        g(xu0Var.V0 && (xu0Var.getSelectedTab() == 11 || xu0Var.getSelectedTab() == 12) && ks0Var.a());
        org.telegram.ui.ActionBar.v0 v0Var = xu0Var.m0;
        if (v0Var != null) {
            int i10 = (a() && xu0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            aj0 aj0Var = v0Var.x;
            if (aj0Var != null && v0Var.y != i10) {
                if (z10) {
                    v0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(aj0Var, i10);
                } else {
                    v0Var.y = i10;
                    aj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = xu0Var.n0;
        if (v0Var2 != null) {
            v0Var2.setSearchFieldHint(LocaleController.getString((ks0Var != null && ks0Var.a() && xu0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
