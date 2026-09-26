package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ws0 extends un0 {
    public final /* synthetic */ jv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, jv0 jv0Var) {
        super(i10, j3, context, m2Var, d6Var);
        this.I = jv0Var;
    }

    @Override // org.telegram.ui.Components.un0
    public final void b(boolean z10) {
        zs0 zs0Var = this.I.I0;
        zs0Var.setAlpha(1.0f - this.E);
        zs0Var.setPivotX(zs0Var.getWidth() / 2.0f);
        zs0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        zs0Var.setPivotY(AndroidUtilities.dp(48.0f));
        zs0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.un0
    public final boolean f(zg.o0 o0Var) {
        pt0 pt0Var;
        jv0 jv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = jv0Var.n0;
        if (u0Var == null) {
            return false;
        }
        jv0Var.W0 = o0Var;
        String obj = u0Var.getSearchField().getText().toString();
        jv0Var.U0 = (obj.length() == 0 && jv0Var.W0 == null) ? false : true;
        jv0Var.m1(false);
        int i10 = jv0Var.k0[0].F;
        if (i10 == 11) {
            uu0 uu0Var = jv0Var.S;
            if (uu0Var != null) {
                uu0Var.E(jv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (pt0Var = jv0Var.T) != null) {
            org.telegram.ui.xn xnVar = pt0Var.a;
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

    @Override // org.telegram.ui.Components.un0
    public final void h(boolean z10) {
        super.h(z10);
        jv0 jv0Var = this.I;
        ws0 ws0Var = jv0Var.J0;
        g(jv0Var.V0 && (jv0Var.getSelectedTab() == 11 || jv0Var.getSelectedTab() == 12) && ws0Var.a());
        org.telegram.ui.ActionBar.u0 u0Var = jv0Var.m0;
        if (u0Var != null) {
            int i10 = (a() && jv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            lj0 lj0Var = u0Var.x;
            if (lj0Var != null && u0Var.y != i10) {
                if (z10) {
                    u0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(lj0Var, i10);
                } else {
                    u0Var.y = i10;
                    lj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = jv0Var.n0;
        if (u0Var2 != null) {
            u0Var2.setSearchFieldHint(LocaleController.getString((ws0Var != null && ws0Var.a() && jv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
