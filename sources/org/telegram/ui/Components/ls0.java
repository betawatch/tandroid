package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ls0 extends hn0 {
    public final /* synthetic */ yu0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, yu0 yu0Var) {
        super(i10, j3, context, n2Var, e6Var);
        this.I = yu0Var;
    }

    @Override // org.telegram.ui.Components.hn0
    public final void b(boolean z10) {
        os0 os0Var = this.I.I0;
        os0Var.setAlpha(1.0f - this.E);
        os0Var.setPivotX(os0Var.getWidth() / 2.0f);
        os0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        os0Var.setPivotY(AndroidUtilities.dp(48.0f));
        os0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.hn0
    public final boolean f(zg.p0 p0Var) {
        et0 et0Var;
        yu0 yu0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.n0;
        if (v0Var == null) {
            return false;
        }
        yu0Var.W0 = p0Var;
        String obj = v0Var.getSearchField().getText().toString();
        yu0Var.U0 = (obj.length() == 0 && yu0Var.W0 == null) ? false : true;
        yu0Var.m1(false);
        int i10 = yu0Var.k0[0].F;
        if (i10 == 11) {
            ju0 ju0Var = yu0Var.S;
            if (ju0Var != null) {
                ju0Var.E(yu0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (et0Var = yu0Var.T) != null) {
            org.telegram.ui.co coVar = et0Var.a;
            org.telegram.ui.yk ykVar = coVar.o1;
            if (ykVar != null) {
                ykVar.e(p0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(coVar.t3) && coVar.q3 == null) ? false : true;
            coVar.s3 = z10;
            coVar.o0 = z10;
            coVar.hc(false);
            coVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.hn0
    public final void h(boolean z10) {
        super.h(z10);
        yu0 yu0Var = this.I;
        ls0 ls0Var = yu0Var.J0;
        g(yu0Var.V0 && (yu0Var.getSelectedTab() == 11 || yu0Var.getSelectedTab() == 12) && ls0Var.a());
        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.m0;
        if (v0Var != null) {
            int i10 = (a() && yu0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
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
        org.telegram.ui.ActionBar.v0 v0Var2 = yu0Var.n0;
        if (v0Var2 != null) {
            v0Var2.setSearchFieldHint(LocaleController.getString((ls0Var != null && ls0Var.a() && yu0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
