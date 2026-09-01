package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ls0 extends pn0 {
    public final /* synthetic */ zu0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, zu0 zu0Var) {
        super(i10, j10, context, p2Var, g6Var);
        this.F = zu0Var;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void b(boolean z4) {
        os0 os0Var = this.F.F0;
        os0Var.setAlpha(1.0f - this.B);
        os0Var.setPivotX(os0Var.getWidth() / 2.0f);
        os0Var.setScaleX(((1.0f - this.B) * 0.2f) + 0.8f);
        os0Var.setPivotY(AndroidUtilities.dp(48.0f));
        os0Var.setScaleY(((1.0f - this.B) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.pn0
    public final boolean f(ng.q0 q0Var) {
        et0 et0Var;
        zu0 zu0Var = this.F;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.k0;
        if (w0Var == null) {
            return false;
        }
        zu0Var.T0 = q0Var;
        String obj = w0Var.getSearchField().getText().toString();
        zu0Var.R0 = (obj.length() == 0 && zu0Var.T0 == null) ? false : true;
        zu0Var.m1(false);
        int i10 = zu0Var.h0[0].C;
        if (i10 == 11) {
            ku0 ku0Var = zu0Var.P;
            if (ku0Var != null) {
                ku0Var.E(zu0Var.T0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (et0Var = zu0Var.Q) != null) {
            org.telegram.ui.yn ynVar = et0Var.a;
            org.telegram.ui.vk vkVar = ynVar.l1;
            if (vkVar != null) {
                vkVar.e(q0Var, true);
            }
            boolean z4 = (TextUtils.isEmpty(ynVar.q3) && ynVar.n3 == null) ? false : true;
            ynVar.p3 = z4;
            ynVar.l0 = z4;
            ynVar.hc(false);
            ynVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void h(boolean z4) {
        super.h(z4);
        zu0 zu0Var = this.F;
        ls0 ls0Var = zu0Var.G0;
        g(zu0Var.S0 && (zu0Var.getSelectedTab() == 11 || zu0Var.getSelectedTab() == 12) && ls0Var.a());
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.j0;
        if (w0Var != null) {
            int i10 = (a() && zu0Var.s1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            lj0 lj0Var = w0Var.x;
            if (lj0Var != null && w0Var.y != i10) {
                if (z4) {
                    w0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(lj0Var, i10);
                } else {
                    w0Var.y = i10;
                    lj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = zu0Var.k0;
        if (w0Var2 != null) {
            w0Var2.setSearchFieldHint(LocaleController.getString((ls0Var != null && ls0Var.a() && zu0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
