package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ys0 extends wn0 {
    public final /* synthetic */ lv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, lv0 lv0Var) {
        super(i10, j3, context, m2Var, d6Var);
        this.I = lv0Var;
    }

    @Override // org.telegram.ui.Components.wn0
    public final void b(boolean z10) {
        bt0 bt0Var = this.I.I0;
        bt0Var.setAlpha(1.0f - this.E);
        bt0Var.setPivotX(bt0Var.getWidth() / 2.0f);
        bt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        bt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        bt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.wn0
    public final boolean f(zg.o0 o0Var) {
        rt0 rt0Var;
        lv0 lv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = lv0Var.n0;
        if (u0Var == null) {
            return false;
        }
        lv0Var.W0 = o0Var;
        String obj = u0Var.getSearchField().getText().toString();
        lv0Var.U0 = (obj.length() == 0 && lv0Var.W0 == null) ? false : true;
        lv0Var.m1(false);
        int i10 = lv0Var.k0[0].F;
        if (i10 == 11) {
            wu0 wu0Var = lv0Var.S;
            if (wu0Var != null) {
                wu0Var.E(lv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (rt0Var = lv0Var.T) != null) {
            org.telegram.ui.xn xnVar = rt0Var.a;
            org.telegram.ui.vk vkVar = xnVar.o1;
            if (vkVar != null) {
                vkVar.e(o0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(xnVar.t3) && xnVar.q3 == null) ? false : true;
            xnVar.s3 = z10;
            xnVar.o0 = z10;
            xnVar.hc(false);
            xnVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wn0
    public final void h(boolean z10) {
        super.h(z10);
        lv0 lv0Var = this.I;
        ys0 ys0Var = lv0Var.J0;
        g(lv0Var.V0 && (lv0Var.getSelectedTab() == 11 || lv0Var.getSelectedTab() == 12) && ys0Var.a());
        org.telegram.ui.ActionBar.u0 u0Var = lv0Var.m0;
        if (u0Var != null) {
            int i10 = (a() && lv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            nj0 nj0Var = u0Var.x;
            if (nj0Var != null && u0Var.y != i10) {
                if (z10) {
                    u0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(nj0Var, i10);
                } else {
                    u0Var.y = i10;
                    nj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = lv0Var.n0;
        if (u0Var2 != null) {
            u0Var2.setSearchFieldHint(LocaleController.getString((ys0Var != null && ys0Var.a() && lv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
