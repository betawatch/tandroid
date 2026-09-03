package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ks0 extends on0 {
    public final /* synthetic */ yu0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, yu0 yu0Var) {
        super(i10, j10, context, p2Var, g6Var);
        this.F = yu0Var;
    }

    @Override // org.telegram.ui.Components.on0
    public final void b(boolean z4) {
        ns0 ns0Var = this.F.F0;
        ns0Var.setAlpha(1.0f - this.B);
        ns0Var.setPivotX(ns0Var.getWidth() / 2.0f);
        ns0Var.setScaleX(((1.0f - this.B) * 0.2f) + 0.8f);
        ns0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ns0Var.setScaleY(((1.0f - this.B) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.on0
    public final boolean f(ng.q0 q0Var) {
        dt0 dt0Var;
        yu0 yu0Var = this.F;
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.k0;
        if (w0Var == null) {
            return false;
        }
        yu0Var.T0 = q0Var;
        String obj = w0Var.getSearchField().getText().toString();
        yu0Var.R0 = (obj.length() == 0 && yu0Var.T0 == null) ? false : true;
        yu0Var.m1(false);
        int i10 = yu0Var.h0[0].C;
        if (i10 == 11) {
            ju0 ju0Var = yu0Var.P;
            if (ju0Var != null) {
                ju0Var.E(yu0Var.T0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (dt0Var = yu0Var.Q) != null) {
            org.telegram.ui.yn ynVar = dt0Var.a;
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

    @Override // org.telegram.ui.Components.on0
    public final void h(boolean z4) {
        super.h(z4);
        yu0 yu0Var = this.F;
        ks0 ks0Var = yu0Var.G0;
        g(yu0Var.S0 && (yu0Var.getSelectedTab() == 11 || yu0Var.getSelectedTab() == 12) && ks0Var.a());
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.j0;
        if (w0Var != null) {
            int i10 = (a() && yu0Var.s1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            kj0 kj0Var = w0Var.x;
            if (kj0Var != null && w0Var.y != i10) {
                if (z4) {
                    w0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(kj0Var, i10);
                } else {
                    w0Var.y = i10;
                    kj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = yu0Var.k0;
        if (w0Var2 != null) {
            w0Var2.setSearchFieldHint(LocaleController.getString((ks0Var != null && ks0Var.a() && yu0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
