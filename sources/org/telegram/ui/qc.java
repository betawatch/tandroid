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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qc extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final jo0 a;
    public final pc b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ xc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(xc xcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.h = xcVar;
        Context context = getContext();
        c6Var = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
        jo0 jo0Var = new jo0(context, c6Var);
        this.a = jo0Var;
        jo0Var.setProgressToGradient(1.0f);
        jo0Var.A = true;
        addView(jo0Var, h7.z5.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount;
        long j10 = xcVar.a;
        c6Var2 = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
        pc pcVar = new pc(this, context2, i10, j10, c6Var2);
        this.b = pcVar;
        boolean z10 = xcVar.d;
        addView(pcVar, h7.z5.d(-1, z10 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f));
        if (xcVar instanceof c60) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.c = h5Var;
            h5Var.setGravity(19);
            int i11 = org.telegram.ui.ActionBar.g6.A8;
            h5Var.setTextColor(xcVar.getThemedColor(i11));
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            h5Var.setAlpha(0.0f);
            a();
            addView(h5Var, h7.z5.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(pcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((xcVar.d && xcVar.s == -1) ? xcVar.getThemedColor(i11) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xcVar.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, h7.z5.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, h7.z5.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f10;
        boolean z10 = getResources().getConfiguration().orientation == 2;
        int i10 = (AndroidUtilities.isTablet() || !z10) ? 20 : 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        h5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f10 = -2.0f;
        } else {
            f10 = z10 ? 4 : 0;
        }
        h5Var.setTranslationY(AndroidUtilities.dp(f10));
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        if (h5Var != null) {
            xc xcVar = this.h;
            int i10 = -1;
            h5Var.setTextColor((!xcVar.d || xcVar.s == -1) ? xcVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8) : -1);
            if (xcVar.d && xcVar.s == -1) {
                i10 = xcVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
