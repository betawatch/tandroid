package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ft0 extends fo0 {
    public final /* synthetic */ sv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, sv0 sv0Var) {
        super(i10, j10, context, n2Var, d6Var);
        this.I = sv0Var;
    }

    @Override // org.telegram.ui.Components.fo0
    public final void b(boolean z10) {
        it0 it0Var = this.I.I0;
        it0Var.setAlpha(1.0f - this.E);
        it0Var.setPivotX(it0Var.getWidth() / 2.0f);
        it0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        it0Var.setPivotY(AndroidUtilities.dp(48.0f));
        it0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.fo0
    public final boolean f(ah.i1 i1Var) {
        yt0 yt0Var;
        sv0 sv0Var = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = sv0Var.n0;
        if (u0Var == null) {
            return false;
        }
        sv0Var.W0 = i1Var;
        String obj = u0Var.getSearchField().getText().toString();
        sv0Var.U0 = (obj.length() == 0 && sv0Var.W0 == null) ? false : true;
        sv0Var.o1(false);
        int i10 = sv0Var.k0[0].F;
        if (i10 == 11) {
            dv0 dv0Var = sv0Var.S;
            if (dv0Var != null) {
                dv0Var.E(sv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (yt0Var = sv0Var.T) != null) {
            org.telegram.ui.tn tnVar = yt0Var.a;
            org.telegram.ui.sk skVar = tnVar.o1;
            if (skVar != null) {
                skVar.e(i1Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(tnVar.t3) && tnVar.q3 == null) ? false : true;
            tnVar.s3 = z10;
            tnVar.o0 = z10;
            tnVar.lc(false);
            tnVar.Mc();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fo0
    public final void h(boolean z10) {
        super.h(z10);
        sv0 sv0Var = this.I;
        ft0 ft0Var = sv0Var.J0;
        g(sv0Var.V0 && (sv0Var.getSelectedTab() == 11 || sv0Var.getSelectedTab() == 12) && ft0Var.a());
        org.telegram.ui.ActionBar.u0 u0Var = sv0Var.m0;
        if (u0Var != null) {
            int i10 = (a() && sv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            xj0 xj0Var = u0Var.x;
            if (xj0Var != null && u0Var.y != i10) {
                if (z10) {
                    u0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(xj0Var, i10);
                } else {
                    u0Var.y = i10;
                    xj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = sv0Var.n0;
        if (u0Var2 != null) {
            u0Var2.setSearchFieldHint(LocaleController.getString((ft0Var != null && ft0Var.a() && sv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
