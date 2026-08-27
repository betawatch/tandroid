package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sr0 extends um0 {
    public final /* synthetic */ hu0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var, hu0 hu0Var) {
        super(i10, j10, context, n2Var, c6Var);
        this.E = hu0Var;
    }

    @Override // org.telegram.ui.Components.um0
    public final void b(boolean z10) {
        vr0 vr0Var = this.E.E0;
        vr0Var.setAlpha(1.0f - this.A);
        vr0Var.setPivotX(vr0Var.getWidth() / 2.0f);
        vr0Var.setScaleX(((1.0f - this.A) * 0.2f) + 0.8f);
        vr0Var.setPivotY(AndroidUtilities.dp(48.0f));
        vr0Var.setScaleY(((1.0f - this.A) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.um0
    public final boolean f(ig.q0 q0Var) {
        ms0 ms0Var;
        hu0 hu0Var = this.E;
        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.j0;
        if (v0Var == null) {
            return false;
        }
        hu0Var.S0 = q0Var;
        String obj = v0Var.getSearchField().getText().toString();
        hu0Var.Q0 = (obj.length() == 0 && hu0Var.S0 == null) ? false : true;
        hu0Var.m1(false);
        int i10 = hu0Var.g0[0].B;
        if (i10 == 11) {
            st0 st0Var = hu0Var.O;
            if (st0Var != null) {
                st0Var.E(hu0Var.S0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (ms0Var = hu0Var.P) != null) {
            org.telegram.ui.sn snVar = ms0Var.a;
            org.telegram.ui.ok okVar = snVar.k1;
            if (okVar != null) {
                okVar.e(q0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(snVar.p3) && snVar.m3 == null) ? false : true;
            snVar.o3 = z10;
            snVar.k0 = z10;
            snVar.hc(false);
            snVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.um0
    public final void h(boolean z10) {
        super.h(z10);
        hu0 hu0Var = this.E;
        sr0 sr0Var = hu0Var.F0;
        g(hu0Var.R0 && (hu0Var.getSelectedTab() == 11 || hu0Var.getSelectedTab() == 12) && sr0Var.a());
        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.i0;
        if (v0Var != null) {
            int i10 = (a() && hu0Var.r1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            ri0 ri0Var = v0Var.x;
            if (ri0Var != null && v0Var.y != i10) {
                if (z10) {
                    v0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(ri0Var, i10);
                } else {
                    v0Var.y = i10;
                    ri0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = hu0Var.j0;
        if (v0Var2 != null) {
            v0Var2.setSearchFieldHint(LocaleController.getString((sr0Var != null && sr0Var.a() && hu0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
