package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rt0 extends oo0 {
    public final /* synthetic */ aw0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt0(int i10, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, aw0 aw0Var) {
        super(i10, j10, context, r2Var, u6Var);
        this.I = aw0Var;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void b(boolean z10) {
        ut0 ut0Var = this.I.K0;
        ut0Var.setAlpha(1.0f - this.E);
        ut0Var.setPivotX(ut0Var.getWidth() / 2.0f);
        ut0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        ut0Var.setPivotY(AndroidUtilities.dp(48.0f));
        ut0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.oo0
    public final boolean f(bh.x0 x0Var) {
        fu0 fu0Var;
        aw0 aw0Var = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = aw0Var.p0;
        if (w0Var == null) {
            return false;
        }
        aw0Var.Y0 = x0Var;
        String obj = w0Var.getSearchField().getText().toString();
        aw0Var.W0 = (obj.length() == 0 && aw0Var.Y0 == null) ? false : true;
        aw0Var.v1(false);
        int i10 = aw0Var.m0[0].E;
        if (i10 == 11) {
            mv0 mv0Var = aw0Var.U;
            if (mv0Var != null) {
                mv0Var.E(aw0Var.Y0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (fu0Var = aw0Var.V) != null) {
            org.telegram.ui.vn vnVar = fu0Var.a;
            org.telegram.ui.sk skVar = vnVar.A1;
            if (skVar != null) {
                skVar.e(x0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(vnVar.F3) && vnVar.C3 == null) ? false : true;
            vnVar.E3 = z10;
            vnVar.o0 = z10;
            vnVar.uc(false);
            vnVar.Vc();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void h(boolean z10) {
        super.h(z10);
        aw0 aw0Var = this.I;
        rt0 rt0Var = aw0Var.L0;
        g(aw0Var.X0 && (aw0Var.getSelectedTab() == 11 || aw0Var.getSelectedTab() == 12) && rt0Var.a());
        org.telegram.ui.ActionBar.w0 w0Var = aw0Var.o0;
        if (w0Var != null) {
            int i10 = (a() && aw0Var.x1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            ak0 ak0Var = w0Var.x;
            if (ak0Var != null && w0Var.y != i10) {
                if (z10) {
                    w0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(ak0Var, i10);
                } else {
                    w0Var.y = i10;
                    ak0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = aw0Var.p0;
        if (w0Var2 != null) {
            w0Var2.setSearchFieldHint(LocaleController.getString((rt0Var != null && rt0Var.a() && aw0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
