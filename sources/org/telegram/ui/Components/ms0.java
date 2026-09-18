package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ms0 extends jn0 {
    public final /* synthetic */ zu0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(int i10, long j3, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f6 f6Var, zu0 zu0Var) {
        super(i10, j3, context, o2Var, f6Var);
        this.I = zu0Var;
    }

    @Override // org.telegram.ui.Components.jn0
    public final void b(boolean z10) {
        ps0 ps0Var = this.I.I0;
        ps0Var.setAlpha(1.0f - this.E);
        ps0Var.setPivotX(ps0Var.getWidth() / 2.0f);
        ps0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        ps0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ps0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.jn0
    public final boolean f(zg.p0 p0Var) {
        ft0 ft0Var;
        zu0 zu0Var = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.n0;
        if (w0Var == null) {
            return false;
        }
        zu0Var.W0 = p0Var;
        String obj = w0Var.getSearchField().getText().toString();
        zu0Var.U0 = (obj.length() == 0 && zu0Var.W0 == null) ? false : true;
        zu0Var.m1(false);
        int i10 = zu0Var.k0[0].F;
        if (i10 == 11) {
            ku0 ku0Var = zu0Var.S;
            if (ku0Var != null) {
                ku0Var.E(zu0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (ft0Var = zu0Var.T) != null) {
            org.telegram.ui.co coVar = ft0Var.a;
            org.telegram.ui.zk zkVar = coVar.o1;
            if (zkVar != null) {
                zkVar.e(p0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(coVar.t3) && coVar.q3 == null) ? false : true;
            coVar.s3 = z10;
            coVar.o0 = z10;
            coVar.hc(false);
            coVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.jn0
    public final void h(boolean z10) {
        super.h(z10);
        zu0 zu0Var = this.I;
        ms0 ms0Var = zu0Var.J0;
        g(zu0Var.V0 && (zu0Var.getSelectedTab() == 11 || zu0Var.getSelectedTab() == 12) && ms0Var.a());
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.m0;
        if (w0Var != null) {
            int i10 = (a() && zu0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            bj0 bj0Var = w0Var.x;
            if (bj0Var != null && w0Var.y != i10) {
                if (z10) {
                    w0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(bj0Var, i10);
                } else {
                    w0Var.y = i10;
                    bj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = zu0Var.n0;
        if (w0Var2 != null) {
            w0Var2.setSearchFieldHint(LocaleController.getString((ms0Var != null && ms0Var.a() && zu0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
