package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class xs0 extends vn0 {
    public final /* synthetic */ kv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, kv0 kv0Var) {
        super(i10, j3, context, n2Var, e6Var);
        this.I = kv0Var;
    }

    @Override // org.telegram.ui.Components.vn0
    public final void b(boolean z10) {
        at0 at0Var = this.I.I0;
        at0Var.setAlpha(1.0f - this.E);
        at0Var.setPivotX(at0Var.getWidth() / 2.0f);
        at0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        at0Var.setPivotY(AndroidUtilities.dp(48.0f));
        at0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.vn0
    public final boolean f(zg.o0 o0Var) {
        qt0 qt0Var;
        kv0 kv0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = kv0Var.n0;
        if (v0Var == null) {
            return false;
        }
        kv0Var.W0 = o0Var;
        String obj = v0Var.getSearchField().getText().toString();
        kv0Var.U0 = (obj.length() == 0 && kv0Var.W0 == null) ? false : true;
        kv0Var.m1(false);
        int i10 = kv0Var.k0[0].F;
        if (i10 == 11) {
            vu0 vu0Var = kv0Var.S;
            if (vu0Var != null) {
                vu0Var.E(kv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (qt0Var = kv0Var.T) != null) {
            org.telegram.ui.ao aoVar = qt0Var.a;
            org.telegram.ui.xk xkVar = aoVar.o1;
            if (xkVar != null) {
                xkVar.e(o0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(aoVar.t3) && aoVar.q3 == null) ? false : true;
            aoVar.s3 = z10;
            aoVar.o0 = z10;
            aoVar.hc(false);
            aoVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.vn0
    public final void h(boolean z10) {
        super.h(z10);
        kv0 kv0Var = this.I;
        xs0 xs0Var = kv0Var.J0;
        g(kv0Var.V0 && (kv0Var.getSelectedTab() == 11 || kv0Var.getSelectedTab() == 12) && xs0Var.a());
        org.telegram.ui.ActionBar.v0 v0Var = kv0Var.m0;
        if (v0Var != null) {
            int i10 = (a() && kv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            lj0 lj0Var = v0Var.x;
            if (lj0Var != null && v0Var.y != i10) {
                if (z10) {
                    v0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(lj0Var, i10);
                } else {
                    v0Var.y = i10;
                    lj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = kv0Var.n0;
        if (v0Var2 != null) {
            v0Var2.setSearchFieldHint(LocaleController.getString((xs0Var != null && xs0Var.a() && kv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
