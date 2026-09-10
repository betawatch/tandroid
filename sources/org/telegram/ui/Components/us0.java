package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class us0 extends rn0 {
    public final /* synthetic */ iv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(int i10, long j3, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, iv0 iv0Var) {
        super(i10, j3, context, p2Var, f6Var);
        this.I = iv0Var;
    }

    @Override // org.telegram.ui.Components.rn0
    public final void b(boolean z10) {
        xs0 xs0Var = this.I.I0;
        xs0Var.setAlpha(1.0f - this.E);
        xs0Var.setPivotX(xs0Var.getWidth() / 2.0f);
        xs0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        xs0Var.setPivotY(AndroidUtilities.dp(48.0f));
        xs0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.rn0
    public final boolean f(yg.p0 p0Var) {
        nt0 nt0Var;
        iv0 iv0Var = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.n0;
        if (w0Var == null) {
            return false;
        }
        iv0Var.W0 = p0Var;
        String obj = w0Var.getSearchField().getText().toString();
        iv0Var.U0 = (obj.length() == 0 && iv0Var.W0 == null) ? false : true;
        iv0Var.m1(false);
        int i10 = iv0Var.k0[0].F;
        if (i10 == 11) {
            tu0 tu0Var = iv0Var.S;
            if (tu0Var != null) {
                tu0Var.E(iv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (nt0Var = iv0Var.T) != null) {
            org.telegram.ui.fo foVar = nt0Var.a;
            org.telegram.ui.al alVar = foVar.o1;
            if (alVar != null) {
                alVar.e(p0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(foVar.t3) && foVar.q3 == null) ? false : true;
            foVar.s3 = z10;
            foVar.o0 = z10;
            foVar.hc(false);
            foVar.Ic();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.rn0
    public final void h(boolean z10) {
        super.h(z10);
        iv0 iv0Var = this.I;
        us0 us0Var = iv0Var.J0;
        g(iv0Var.V0 && (iv0Var.getSelectedTab() == 11 || iv0Var.getSelectedTab() == 12) && us0Var.a());
        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.m0;
        if (w0Var != null) {
            int i10 = (a() && iv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            kj0 kj0Var = w0Var.x;
            if (kj0Var != null && w0Var.y != i10) {
                if (z10) {
                    w0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(kj0Var, i10);
                } else {
                    w0Var.y = i10;
                    kj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = iv0Var.n0;
        if (w0Var2 != null) {
            w0Var2.setSearchFieldHint(LocaleController.getString((us0Var != null && us0Var.a() && iv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
