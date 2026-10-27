package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class st0 extends po0 {
    public final /* synthetic */ bw0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st0(int i10, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, bw0 bw0Var) {
        super(i10, j10, context, r2Var, u6Var);
        this.I = bw0Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final void b(boolean z10) {
        vt0 vt0Var = this.I.K0;
        vt0Var.setAlpha(1.0f - this.E);
        vt0Var.setPivotX(vt0Var.getWidth() / 2.0f);
        vt0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        vt0Var.setPivotY(AndroidUtilities.dp(48.0f));
        vt0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.po0
    public final boolean f(bh.x0 x0Var) {
        gu0 gu0Var;
        bw0 bw0Var = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = bw0Var.p0;
        if (w0Var == null) {
            return false;
        }
        bw0Var.Y0 = x0Var;
        String obj = w0Var.getSearchField().getText().toString();
        bw0Var.W0 = (obj.length() == 0 && bw0Var.Y0 == null) ? false : true;
        bw0Var.v1(false);
        int i10 = bw0Var.m0[0].E;
        if (i10 == 11) {
            nv0 nv0Var = bw0Var.U;
            if (nv0Var != null) {
                nv0Var.E(bw0Var.Y0, obj);
            }
            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (gu0Var = bw0Var.V) != null) {
            org.telegram.ui.xn xnVar = gu0Var.a;
            org.telegram.ui.uk ukVar = xnVar.A1;
            if (ukVar != null) {
                ukVar.e(x0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(xnVar.F3) && xnVar.C3 == null) ? false : true;
            xnVar.E3 = z10;
            xnVar.o0 = z10;
            xnVar.yc(false);
            xnVar.Zc();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.po0
    public final void h(boolean z10) {
        super.h(z10);
        bw0 bw0Var = this.I;
        st0 st0Var = bw0Var.L0;
        g(bw0Var.X0 && (bw0Var.getSelectedTab() == 11 || bw0Var.getSelectedTab() == 12) && st0Var.a());
        org.telegram.ui.ActionBar.w0 w0Var = bw0Var.o0;
        if (w0Var != null) {
            int i10 = (a() && bw0Var.x1.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            bk0 bk0Var = w0Var.x;
            if (bk0Var != null && w0Var.y != i10) {
                if (z10) {
                    w0Var.y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(bk0Var, i10);
                } else {
                    w0Var.y = i10;
                    bk0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = bw0Var.p0;
        if (w0Var2 != null) {
            w0Var2.setSearchFieldHint(LocaleController.getString((st0Var != null && st0Var.a() && bw0Var.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
    }
}
