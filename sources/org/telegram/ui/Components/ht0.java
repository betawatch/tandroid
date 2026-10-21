package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ht0 extends go0 {
    public final /* synthetic */ uv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, uv0 uv0Var) {
        super(i10, j10, context, n2Var, d6Var);
        this.I = uv0Var;
    }

    @Override // org.telegram.ui.Components.go0
    public final void b(boolean z10) {
        kt0 kt0Var = this.I.I0;
        kt0Var.setAlpha(1.0f - this.E);
        kt0Var.setPivotX(kt0Var.getWidth() / 2.0f);
        kt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        kt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        kt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.go0
    public final boolean f(ah.i1 i1Var) {
        au0 au0Var;
        uv0 uv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.n0;
        if (u0Var == null) {
            return false;
        }
        uv0Var.W0 = i1Var;
        String obj = u0Var.getSearchField().getText().toString();
        uv0Var.U0 = (obj.length() == 0 && uv0Var.W0 == null) ? false : true;
        uv0Var.o1(false);
        int i10 = uv0Var.k0[0].F;
        if (i10 == 11) {
            fv0 fv0Var = uv0Var.S;
            if (fv0Var != null) {
                fv0Var.E(uv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (au0Var = uv0Var.T) != null) {
            org.telegram.ui.rn rnVar = au0Var.a;
            org.telegram.ui.qk qkVar = rnVar.o1;
            if (qkVar != null) {
                qkVar.e(i1Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(rnVar.t3) && rnVar.q3 == null) ? false : true;
            rnVar.s3 = z10;
            rnVar.o0 = z10;
            rnVar.mc(false);
            rnVar.Nc();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.go0
    public final void h(boolean z10) {
        super.h(z10);
        uv0 uv0Var = this.I;
        ht0 ht0Var = uv0Var.J0;
        g(uv0Var.V0 && (uv0Var.getSelectedTab() == 11 || uv0Var.getSelectedTab() == 12) && ht0Var.a());
        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.m0;
        if (u0Var != null) {
            int i10 = (a() && uv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            yj0 yj0Var = u0Var.x;
            if (yj0Var != null && u0Var.y != i10) {
                if (z10) {
                    u0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(yj0Var, i10);
                } else {
                    u0Var.y = i10;
                    yj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = uv0Var.n0;
        if (u0Var2 != null) {
            u0Var2.setSearchFieldHint(LocaleController.getString((ht0Var != null && ht0Var.a() && uv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
