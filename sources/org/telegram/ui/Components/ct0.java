package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ct0 extends ao0 {
    public final /* synthetic */ pv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, pv0 pv0Var) {
        super(i10, j3, context, n2Var, d6Var);
        this.I = pv0Var;
    }

    @Override // org.telegram.ui.Components.ao0
    public final void b(boolean z10) {
        ft0 ft0Var = this.I.I0;
        ft0Var.setAlpha(1.0f - this.E);
        ft0Var.setPivotX(ft0Var.getWidth() / 2.0f);
        ft0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        ft0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ft0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.ao0
    public final boolean f(zg.o0 o0Var) {
        vt0 vt0Var;
        pv0 pv0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = pv0Var.n0;
        if (v0Var == null) {
            return false;
        }
        pv0Var.W0 = o0Var;
        String obj = v0Var.getSearchField().getText().toString();
        pv0Var.U0 = (obj.length() == 0 && pv0Var.W0 == null) ? false : true;
        pv0Var.m1(false);
        int i10 = pv0Var.k0[0].F;
        if (i10 == 11) {
            av0 av0Var = pv0Var.S;
            if (av0Var != null) {
                av0Var.E(pv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (vt0Var = pv0Var.T) != null) {
            org.telegram.ui.zn znVar = vt0Var.a;
            org.telegram.ui.vk vkVar = znVar.m1;
            if (vkVar != null) {
                vkVar.e(o0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(znVar.r3) && znVar.o3 == null) ? false : true;
            znVar.q3 = z10;
            znVar.m0 = z10;
            znVar.gc(false);
            znVar.Hc();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ao0
    public final void h(boolean z10) {
        super.h(z10);
        pv0 pv0Var = this.I;
        ct0 ct0Var = pv0Var.J0;
        g(pv0Var.V0 && (pv0Var.getSelectedTab() == 11 || pv0Var.getSelectedTab() == 12) && ct0Var.a());
        org.telegram.ui.ActionBar.v0 v0Var = pv0Var.m0;
        if (v0Var != null) {
            int i10 = (a() && pv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            nj0 nj0Var = v0Var.x;
            if (nj0Var != null && v0Var.y != i10) {
                if (z10) {
                    v0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(nj0Var, i10);
                } else {
                    v0Var.y = i10;
                    nj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = pv0Var.n0;
        if (v0Var2 != null) {
            v0Var2.setSearchFieldHint(LocaleController.getString((ct0Var != null && ct0Var.a() && pv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
