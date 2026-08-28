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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pc extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final io0 a;
    public final oc b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ xc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(xc xcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.b6 b6Var;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var2;
        this.h = xcVar;
        Context context = getContext();
        b6Var = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
        io0 io0Var = new io0(context, b6Var);
        this.a = io0Var;
        io0Var.setProgressToGradient(1.0f);
        io0Var.A = true;
        addView(io0Var, g7.e6.e(-1, -1, 119));
        Context context2 = getContext();
        i9 = ((org.telegram.ui.ActionBar.o2) xcVar).currentAccount;
        long j10 = xcVar.a;
        b6Var2 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
        oc ocVar = new oc(this, context2, i9, j10, b6Var2);
        this.b = ocVar;
        boolean z10 = xcVar.d;
        addView(ocVar, g7.e6.d(-1, z10 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f));
        if (xcVar instanceof y50) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.c = h5Var;
            h5Var.setGravity(19);
            int i10 = org.telegram.ui.ActionBar.f6.A8;
            h5Var.setTextColor(xcVar.getThemedColor(i10));
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            h5Var.setAlpha(0.0f);
            a();
            addView(h5Var, g7.e6.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.f6.g0(org.telegram.ui.ActionBar.f6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(ocVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((xcVar.d && xcVar.s == -1) ? xcVar.getThemedColor(i10) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xcVar.c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, g7.e6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, g7.e6.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f10;
        boolean z10 = getResources().getConfiguration().orientation == 2;
        int i9 = (AndroidUtilities.isTablet() || !z10) ? 20 : 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        h5Var.setTextSize(i9);
        if (AndroidUtilities.isTablet()) {
            f10 = -2.0f;
        } else {
            f10 = z10 ? 4 : 0;
        }
        h5Var.setTranslationY(AndroidUtilities.dp(f10));
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        if (h5Var != null) {
            xc xcVar = this.h;
            int i9 = -1;
            h5Var.setTextColor((!xcVar.d || xcVar.s == -1) ? xcVar.getThemedColor(org.telegram.ui.ActionBar.f6.A8) : -1);
            if (xcVar.d && xcVar.s == -1) {
                i9 = xcVar.getThemedColor(org.telegram.ui.ActionBar.f6.A8);
            }
            this.e.setTextColor(i9);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
