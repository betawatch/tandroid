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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ad extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final mp0 a;
    public final zc b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ hd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(hd hdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.h = hdVar;
        Context context = getContext();
        c6Var = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
        mp0 mp0Var = new mp0(context, c6Var);
        this.a = mp0Var;
        mp0Var.setProgressToGradient(1.0f);
        mp0Var.F = true;
        addView(mp0Var, w7.a6.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.m2) hdVar).currentAccount;
        long j10 = hdVar.a;
        c6Var2 = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
        zc zcVar = new zc(this, context2, i10, j10, c6Var2);
        this.b = zcVar;
        boolean z10 = hdVar.d;
        addView(zcVar, w7.a6.a(z10 ? 230.0f : 190.0f, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f, -1, 80));
        if (hdVar instanceof x60) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.c = h5Var;
            h5Var.setGravity(19);
            int i11 = org.telegram.ui.ActionBar.g6.A8;
            h5Var.setTextColor(hdVar.getThemedColor(i11));
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            h5Var.setAlpha(0.0f);
            a();
            addView(h5Var, w7.a6.a(-2.0f, 72.0f, 0.0f, 0.0f, 16.0f, -1, 80));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.g6.h0(org.telegram.ui.ActionBar.g6.m1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(zcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((hdVar.d && hdVar.s == -1) ? hdVar.getThemedColor(i11) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = hdVar.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, w7.a6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, w7.a6.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f7;
        boolean z10 = getResources().getConfiguration().orientation == 2;
        int i10 = (AndroidUtilities.isTablet() || !z10) ? 20 : 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        h5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f7 = -2.0f;
        } else {
            f7 = z10 ? 4 : 0;
        }
        h5Var.setTranslationY(AndroidUtilities.dp(f7));
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        if (h5Var != null) {
            hd hdVar = this.h;
            int i10 = -1;
            h5Var.setTextColor((!hdVar.d || hdVar.s == -1) ? hdVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8) : -1);
            if (hdVar.d && hdVar.s == -1) {
                i10 = hdVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
