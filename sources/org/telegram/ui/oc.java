package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oc extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final ho0 a;
    public final nc b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ vc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(vc vcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.h = vcVar;
        Context context = getContext();
        c6Var = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
        ho0 ho0Var = new ho0(context, c6Var);
        this.a = ho0Var;
        ho0Var.setProgressToGradient(1.0f);
        ho0Var.A = true;
        addView(ho0Var, i7.f6.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
        long j10 = vcVar.a;
        c6Var2 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
        nc ncVar = new nc(this, context2, i10, j10, c6Var2);
        this.b = ncVar;
        boolean z10 = vcVar.d;
        addView(ncVar, i7.f6.d(-1, z10 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f));
        if (vcVar instanceof a60) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.c = h5Var;
            h5Var.setGravity(19);
            int i11 = org.telegram.ui.ActionBar.g6.A8;
            h5Var.setTextColor(vcVar.getThemedColor(i11));
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            h5Var.setAlpha(0.0f);
            a();
            addView(h5Var, i7.f6.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(ncVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((vcVar.d && vcVar.s == -1) ? vcVar.getThemedColor(i11) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = vcVar.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, i7.f6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, i7.f6.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f9;
        boolean z10 = getResources().getConfiguration().orientation == 2;
        int i10 = (AndroidUtilities.isTablet() || !z10) ? 20 : 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        h5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f9 = -2.0f;
        } else {
            f9 = z10 ? 4 : 0;
        }
        h5Var.setTranslationY(AndroidUtilities.dp(f9));
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        if (h5Var != null) {
            vc vcVar = this.h;
            int i10 = -1;
            h5Var.setTextColor((!vcVar.d || vcVar.s == -1) ? vcVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8) : -1);
            if (vcVar.d && vcVar.s == -1) {
                i10 = vcVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
