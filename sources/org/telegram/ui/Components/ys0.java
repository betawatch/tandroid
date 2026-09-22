package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ys0 extends wn0 {
    public final /* synthetic */ lv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, lv0 lv0Var) {
        super(i10, j3, context, n2Var, f6Var);
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
    public final boolean f(zg.p0 p0Var) {
        rt0 rt0Var;
        lv0 lv0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = lv0Var.n0;
        if (v0Var == null) {
            return false;
        }
        lv0Var.W0 = p0Var;
        String obj = v0Var.getSearchField().getText().toString();
        lv0Var.U0 = (obj.length() == 0 && lv0Var.W0 == null) ? false : true;
        lv0Var.m1(false);
        int i10 = lv0Var.k0[0].F;
        if (i10 == 11) {
            wu0 wu0Var = lv0Var.S;
            if (wu0Var != null) {
                wu0Var.E(lv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (rt0Var = lv0Var.T) != null) {
            org.telegram.ui.ao aoVar = rt0Var.a;
            org.telegram.ui.yk ykVar = aoVar.o1;
            if (ykVar != null) {
                ykVar.e(p0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(aoVar.t3) && aoVar.q3 == null) ? false : true;
            aoVar.s3 = z10;
            aoVar.o0 = z10;
            aoVar.hc(false);
            aoVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wn0
    public final void h(boolean z10) {
        super.h(z10);
        lv0 lv0Var = this.I;
        ys0 ys0Var = lv0Var.J0;
        g(lv0Var.V0 && (lv0Var.getSelectedTab() == 11 || lv0Var.getSelectedTab() == 12) && ys0Var.a());
        org.telegram.ui.ActionBar.v0 v0Var = lv0Var.m0;
        if (v0Var != null) {
            int i10 = (a() && lv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
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
        org.telegram.ui.ActionBar.v0 v0Var2 = lv0Var.n0;
        if (v0Var2 != null) {
            v0Var2.setSearchFieldHint(LocaleController.getString((ys0Var != null && ys0Var.a() && lv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
