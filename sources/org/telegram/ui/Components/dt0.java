package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class dt0 extends ao0 {
    public final /* synthetic */ qv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, qv0 qv0Var) {
        super(i10, j3, context, n2Var, d6Var);
        this.I = qv0Var;
    }

    @Override // org.telegram.ui.Components.ao0
    public final void b(boolean z10) {
        gt0 gt0Var = this.I.I0;
        gt0Var.setAlpha(1.0f - this.E);
        gt0Var.setPivotX(gt0Var.getWidth() / 2.0f);
        gt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        gt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        gt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.ao0
    public final boolean f(zg.m0 m0Var) {
        wt0 wt0Var;
        qv0 qv0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = qv0Var.n0;
        if (v0Var == null) {
            return false;
        }
        qv0Var.W0 = m0Var;
        String obj = v0Var.getSearchField().getText().toString();
        qv0Var.U0 = (obj.length() == 0 && qv0Var.W0 == null) ? false : true;
        qv0Var.m1(false);
        int i10 = qv0Var.k0[0].F;
        if (i10 == 11) {
            bv0 bv0Var = qv0Var.S;
            if (bv0Var != null) {
                bv0Var.E(qv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (wt0Var = qv0Var.T) != null) {
            org.telegram.ui.zn znVar = wt0Var.a;
            org.telegram.ui.vk vkVar = znVar.m1;
            if (vkVar != null) {
                vkVar.e(m0Var, true);
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
        qv0 qv0Var = this.I;
        dt0 dt0Var = qv0Var.J0;
        g(qv0Var.V0 && (qv0Var.getSelectedTab() == 11 || qv0Var.getSelectedTab() == 12) && dt0Var.a());
        org.telegram.ui.ActionBar.v0 v0Var = qv0Var.m0;
        if (v0Var != null) {
            int i10 = (a() && qv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
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
        org.telegram.ui.ActionBar.v0 v0Var2 = qv0Var.n0;
        if (v0Var2 != null) {
            v0Var2.setSearchFieldHint(LocaleController.getString((dt0Var != null && dt0Var.a() && qv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
