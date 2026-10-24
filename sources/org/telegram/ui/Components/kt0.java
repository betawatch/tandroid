package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class kt0 extends jo0 {
    public final /* synthetic */ xv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt0(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var, xv0 xv0Var) {
        super(i10, j10, context, o2Var, g6Var);
        this.I = xv0Var;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void b(boolean z10) {
        nt0 nt0Var = this.I.I0;
        nt0Var.setAlpha(1.0f - this.E);
        nt0Var.setPivotX(nt0Var.getWidth() / 2.0f);
        nt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        nt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        nt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.jo0
    public final boolean f(ah.i1 i1Var) {
        du0 du0Var;
        xv0 xv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.n0;
        if (u0Var == null) {
            return false;
        }
        xv0Var.W0 = i1Var;
        String obj = u0Var.getSearchField().getText().toString();
        xv0Var.U0 = (obj.length() == 0 && xv0Var.W0 == null) ? false : true;
        xv0Var.p1(false);
        int i10 = xv0Var.k0[0].F;
        if (i10 == 11) {
            iv0 iv0Var = xv0Var.S;
            if (iv0Var != null) {
                iv0Var.E(xv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (du0Var = xv0Var.T) != null) {
            org.telegram.ui.tn tnVar = du0Var.a;
            org.telegram.ui.rk rkVar = tnVar.A1;
            if (rkVar != null) {
                rkVar.e(i1Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(tnVar.F3) && tnVar.C3 == null) ? false : true;
            tnVar.E3 = z10;
            tnVar.o0 = z10;
            tnVar.oc(false);
            tnVar.Pc();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void h(boolean z10) {
        super.h(z10);
        xv0 xv0Var = this.I;
        kt0 kt0Var = xv0Var.J0;
        g(xv0Var.V0 && (xv0Var.getSelectedTab() == 11 || xv0Var.getSelectedTab() == 12) && kt0Var.a());
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.m0;
        if (u0Var != null) {
            int i10 = (a() && xv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            bk0 bk0Var = u0Var.x;
            if (bk0Var != null && u0Var.y != i10) {
                if (z10) {
                    u0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(bk0Var, i10);
                } else {
                    u0Var.y = i10;
                    bk0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = xv0Var.n0;
        if (u0Var2 != null) {
            u0Var2.setSearchFieldHint(LocaleController.getString((kt0Var != null && kt0Var.a() && xv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
