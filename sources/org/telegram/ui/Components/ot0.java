package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ot0 extends no0 {
    public final /* synthetic */ bw0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, bw0 bw0Var) {
        super(i10, j3, context, n2Var, e6Var);
        this.I = bw0Var;
    }

    @Override // org.telegram.ui.Components.no0
    public final void b(boolean z10) {
        rt0 rt0Var = this.I.I0;
        rt0Var.setAlpha(1.0f - this.E);
        rt0Var.setPivotX(rt0Var.getWidth() / 2.0f);
        rt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        rt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        rt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.no0
    public final boolean f(zg.n0 n0Var) {
        hu0 hu0Var;
        bw0 bw0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = bw0Var.n0;
        if (v0Var == null) {
            return false;
        }
        bw0Var.W0 = n0Var;
        String obj = v0Var.getSearchField().getText().toString();
        bw0Var.U0 = (obj.length() == 0 && bw0Var.W0 == null) ? false : true;
        bw0Var.m1(false);
        int i10 = bw0Var.k0[0].F;
        if (i10 == 11) {
            mv0 mv0Var = bw0Var.S;
            if (mv0Var != null) {
                mv0Var.E(bw0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (hu0Var = bw0Var.T) != null) {
            org.telegram.ui.ao aoVar = hu0Var.a;
            org.telegram.ui.zk zkVar = aoVar.o1;
            if (zkVar != null) {
                zkVar.e(n0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(aoVar.t3) && aoVar.q3 == null) ? false : true;
            aoVar.s3 = z10;
            aoVar.o0 = z10;
            aoVar.lc(false);
            aoVar.Mc();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.no0
    public final void h(boolean z10) {
        super.h(z10);
        bw0 bw0Var = this.I;
        ot0 ot0Var = bw0Var.J0;
        g(bw0Var.V0 && (bw0Var.getSelectedTab() == 11 || bw0Var.getSelectedTab() == 12) && ot0Var.a());
        org.telegram.ui.ActionBar.v0 v0Var = bw0Var.m0;
        if (v0Var != null) {
            int i10 = (a() && bw0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            fk0 fk0Var = v0Var.x;
            if (fk0Var != null && v0Var.y != i10) {
                if (z10) {
                    v0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(fk0Var, i10);
                } else {
                    v0Var.y = i10;
                    fk0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = bw0Var.n0;
        if (v0Var2 != null) {
            v0Var2.setSearchFieldHint(LocaleController.getString((ot0Var != null && ot0Var.a() && bw0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
