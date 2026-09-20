package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ws0 extends un0 {
    public final /* synthetic */ jv0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, jv0 jv0Var) {
        super(i10, j3, context, n2Var, f6Var);
        this.I = jv0Var;
    }

    @Override // org.telegram.ui.Components.un0
    public final void b(boolean z10) {
        zs0 zs0Var = this.I.I0;
        zs0Var.setAlpha(1.0f - this.E);
        zs0Var.setPivotX(zs0Var.getWidth() / 2.0f);
        zs0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        zs0Var.setPivotY(AndroidUtilities.dp(48.0f));
        zs0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.un0
    public final boolean f(zg.o0 o0Var) {
        pt0 pt0Var;
        jv0 jv0Var = this.I;
        org.telegram.ui.ActionBar.v0 v0Var = jv0Var.n0;
        if (v0Var == null) {
            return false;
        }
        jv0Var.W0 = o0Var;
        String obj = v0Var.getSearchField().getText().toString();
        jv0Var.U0 = (obj.length() == 0 && jv0Var.W0 == null) ? false : true;
        jv0Var.m1(false);
        int i10 = jv0Var.k0[0].F;
        if (i10 == 11) {
            uu0 uu0Var = jv0Var.S;
            if (uu0Var != null) {
                uu0Var.E(jv0Var.W0, obj);
            }
            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (pt0Var = jv0Var.T) != null) {
            org.telegram.ui.ao aoVar = pt0Var.a;
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

    @Override // org.telegram.ui.Components.un0
    public final void h(boolean z10) {
        super.h(z10);
        jv0 jv0Var = this.I;
        ws0 ws0Var = jv0Var.J0;
        g(jv0Var.V0 && (jv0Var.getSelectedTab() == 11 || jv0Var.getSelectedTab() == 12) && ws0Var.a());
        org.telegram.ui.ActionBar.v0 v0Var = jv0Var.m0;
        if (v0Var != null) {
            int i10 = (a() && jv0Var.v1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            kj0 kj0Var = v0Var.x;
            if (kj0Var != null && v0Var.y != i10) {
                if (z10) {
                    v0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(kj0Var, i10);
                } else {
                    v0Var.y = i10;
                    kj0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = jv0Var.n0;
        if (v0Var2 != null) {
            v0Var2.setSearchFieldHint(LocaleController.getString((ws0Var != null && ws0Var.a() && jv0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
