package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ks0 extends nn0 {
    public final /* synthetic */ yu0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, yu0 yu0Var) {
        super(i10, j10, context, p2Var, f6Var);
        this.F = yu0Var;
    }

    @Override // org.telegram.ui.Components.nn0
    public final void b(boolean z4) {
        ns0 ns0Var = this.F.F0;
        ns0Var.setAlpha(1.0f - this.B);
        ns0Var.setPivotX(ns0Var.getWidth() / 2.0f);
        ns0Var.setScaleX(((1.0f - this.B) * 0.2f) + 0.8f);
        ns0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ns0Var.setScaleY(((1.0f - this.B) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.nn0
    public final boolean f(mg.q0 q0Var) {
        dt0 dt0Var;
        yu0 yu0Var = this.F;
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.k0;
        if (w0Var == null) {
            return false;
        }
        yu0Var.T0 = q0Var;
        String obj = w0Var.getSearchField().getText().toString();
        yu0Var.R0 = (obj.length() == 0 && yu0Var.T0 == null) ? false : true;
        yu0Var.m1(false);
        int i10 = yu0Var.h0[0].C;
        if (i10 == 11) {
            ju0 ju0Var = yu0Var.P;
            if (ju0Var != null) {
                ju0Var.E(yu0Var.T0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (dt0Var = yu0Var.Q) != null) {
            org.telegram.ui.ao aoVar = dt0Var.a;
            org.telegram.ui.xk xkVar = aoVar.l1;
            if (xkVar != null) {
                xkVar.e(q0Var, true);
            }
            boolean z4 = (TextUtils.isEmpty(aoVar.q3) && aoVar.n3 == null) ? false : true;
            aoVar.p3 = z4;
            aoVar.l0 = z4;
            aoVar.hc(false);
            aoVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nn0
    public final void h(boolean z4) {
        super.h(z4);
        yu0 yu0Var = this.F;
        ks0 ks0Var = yu0Var.G0;
        g(yu0Var.S0 && (yu0Var.getSelectedTab() == 11 || yu0Var.getSelectedTab() == 12) && ks0Var.a());
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.j0;
        if (w0Var != null) {
            int i10 = (a() && yu0Var.s1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            jj0 jj0Var = w0Var.x;
            if (jj0Var != null && w0Var.y != i10) {
                if (z4) {
                    w0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(jj0Var, i10);
                } else {
                    w0Var.y = i10;
                    jj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = yu0Var.k0;
        if (w0Var2 != null) {
            w0Var2.setSearchFieldHint(LocaleController.getString((ks0Var != null && ks0Var.a() && yu0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
