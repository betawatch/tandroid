package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cs0 extends en0 {
    public final /* synthetic */ qu0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var, qu0 qu0Var) {
        super(i10, j10, context, o2Var, c6Var);
        this.E = qu0Var;
    }

    @Override // org.telegram.ui.Components.en0
    public final void b(boolean z10) {
        fs0 fs0Var = this.E.E0;
        fs0Var.setAlpha(1.0f - this.A);
        fs0Var.setPivotX(fs0Var.getWidth() / 2.0f);
        fs0Var.setScaleX(((1.0f - this.A) * 0.2f) + 0.8f);
        fs0Var.setPivotY(AndroidUtilities.dp(48.0f));
        fs0Var.setScaleY(((1.0f - this.A) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.en0
    public final boolean f(kg.q0 q0Var) {
        vs0 vs0Var;
        qu0 qu0Var = this.E;
        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.j0;
        if (w0Var == null) {
            return false;
        }
        qu0Var.S0 = q0Var;
        String obj = w0Var.getSearchField().getText().toString();
        qu0Var.Q0 = (obj.length() == 0 && qu0Var.S0 == null) ? false : true;
        qu0Var.m1(false);
        int i10 = qu0Var.g0[0].B;
        if (i10 == 11) {
            bu0 bu0Var = qu0Var.O;
            if (bu0Var != null) {
                bu0Var.E(qu0Var.S0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (vs0Var = qu0Var.P) != null) {
            org.telegram.ui.un unVar = vs0Var.a;
            org.telegram.ui.pk pkVar = unVar.k1;
            if (pkVar != null) {
                pkVar.e(q0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(unVar.p3) && unVar.m3 == null) ? false : true;
            unVar.o3 = z10;
            unVar.k0 = z10;
            unVar.hc(false);
            unVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.en0
    public final void h(boolean z10) {
        super.h(z10);
        qu0 qu0Var = this.E;
        cs0 cs0Var = qu0Var.F0;
        g(qu0Var.R0 && (qu0Var.getSelectedTab() == 11 || qu0Var.getSelectedTab() == 12) && cs0Var.a());
        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.i0;
        if (w0Var != null) {
            int i10 = (a() && qu0Var.r1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            aj0 aj0Var = w0Var.x;
            if (aj0Var != null && w0Var.y != i10) {
                if (z10) {
                    w0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(aj0Var, i10);
                } else {
                    w0Var.y = i10;
                    aj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = qu0Var.j0;
        if (w0Var2 != null) {
            w0Var2.setSearchFieldHint(LocaleController.getString((cs0Var != null && cs0Var.a() && qu0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
