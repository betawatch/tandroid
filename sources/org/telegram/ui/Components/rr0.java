package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rr0 extends sm0 {
    public final /* synthetic */ eu0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr0(int i9, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var, eu0 eu0Var) {
        super(i9, j10, context, o2Var, b6Var);
        this.E = eu0Var;
    }

    @Override // org.telegram.ui.Components.sm0
    public final void b(boolean z10) {
        ur0 ur0Var = this.E.E0;
        ur0Var.setAlpha(1.0f - this.A);
        ur0Var.setPivotX(ur0Var.getWidth() / 2.0f);
        ur0Var.setScaleX(((1.0f - this.A) * 0.2f) + 0.8f);
        ur0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ur0Var.setScaleY(((1.0f - this.A) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.sm0
    public final boolean f(hg.r0 r0Var) {
        ks0 ks0Var;
        eu0 eu0Var = this.E;
        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.j0;
        if (w0Var == null) {
            return false;
        }
        eu0Var.S0 = r0Var;
        String obj = w0Var.getSearchField().getText().toString();
        eu0Var.Q0 = (obj.length() == 0 && eu0Var.S0 == null) ? false : true;
        eu0Var.m1(false);
        int i9 = eu0Var.g0[0].B;
        if (i9 == 11) {
            pt0 pt0Var = eu0Var.O;
            if (pt0Var != null) {
                pt0Var.E(eu0Var.S0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i9 == 12 && (ks0Var = eu0Var.P) != null) {
            org.telegram.ui.rn rnVar = ks0Var.a;
            org.telegram.ui.mk mkVar = rnVar.k1;
            if (mkVar != null) {
                mkVar.e(r0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(rnVar.p3) && rnVar.m3 == null) ? false : true;
            rnVar.o3 = z10;
            rnVar.k0 = z10;
            rnVar.hc(false);
            rnVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.sm0
    public final void h(boolean z10) {
        super.h(z10);
        eu0 eu0Var = this.E;
        rr0 rr0Var = eu0Var.F0;
        g(eu0Var.R0 && (eu0Var.getSelectedTab() == 11 || eu0Var.getSelectedTab() == 12) && rr0Var.a());
        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.i0;
        if (w0Var != null) {
            int i9 = (a() && eu0Var.r1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            pi0 pi0Var = w0Var.x;
            if (pi0Var != null && w0Var.y != i9) {
                if (z10) {
                    w0Var.y = i9;
                    AndroidUtilities.updateImageViewImageAnimated(pi0Var, i9);
                } else {
                    w0Var.y = i9;
                    pi0Var.setImageResource(i9);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = eu0Var.j0;
        if (w0Var2 != null) {
            w0Var2.setSearchFieldHint(LocaleController.getString((rr0Var != null && rr0Var.a() && eu0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
