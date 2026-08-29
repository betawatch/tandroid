package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o31 extends org.telegram.ui.Components.xa {
    public final LinearLayout T;
    public org.telegram.ui.Components.k51 U;

    public o31(Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ii0 ii0Var) {
        super(context, null, false, false, false, 1, c6Var);
        fixNavigationBar();
        this.v = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(getContext());
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.setImageResource(R.drawable.large_ads_info);
        aj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        aj0Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        frameLayout.addView(aj0Var, i7.f6.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SearchAdsAboutTitle));
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        b.m(i11, c6Var, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView i12 = th.i(linearLayout, textView, i7.f6.t(-2, -2, 1, 22, 14, 22, 0), context);
        i12.setText(LocaleController.getString(R.string.SearchAdsAboutSubtitle));
        i12.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        i12.setTextSize(1, 14.0f);
        i12.setGravity(1);
        linearLayout.addView(i12, i7.f6.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new n31(this, context, R.drawable.menu_privacy, LocaleController.getString(R.string.SearchAdsAbout1Title), LocaleController.getString(R.string.SearchAdsAbout1Subtitle)), i7.f6.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        linearLayout.addView(new n31(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.SearchAdsAbout2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(isPremium ? R.string.SearchAdsAbout2SubtitlePremium : R.string.SearchAdsAbout2Subtitle), new mp0(this, isPremium, ii0Var, 5)), true)), i7.f6.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.SearchAdsAboutLaunchTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.SearchAdsAboutLaunchSubtitle)), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SearchAdsAboutLaunchLearnMore), new ky0(this, 12)), true));
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, null);
        y80Var.setText(replaceCharSequence);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setGravity(1);
        y80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(y80Var, i7.f6.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.SearchAdsAboutUnderstood));
        textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        textView3.setOnClickListener(new w21(this, 3));
        linearLayout.addView(textView3, i7.f6.t(-1, 48, 0, 14, 22, 14, 14));
        this.U.N(false);
    }

    public static void P(o31 o31Var, boolean z10, org.telegram.ui.Components.ii0 ii0Var) {
        if (z10) {
            MessagesController.getInstance(o31Var.currentAccount).disableAds(true);
            ii0Var.run();
        } else {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U == null) {
                return;
            } else {
                U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
            }
        }
        o31Var.dismiss();
    }

    @Override // org.telegram.ui.Components.xa
    public final org.telegram.ui.Components.il0 v(org.telegram.ui.Components.jl0 jl0Var) {
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(jl0Var, getContext(), this.currentAccount, 0, true, new b5(this, 21), this.resourcesProvider);
        this.U = k51Var;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
