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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class k41 extends org.telegram.ui.Components.bb {
    public final LinearLayout X;
    public org.telegram.ui.Components.v51 Y;

    public k41(Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.oy oyVar) {
        super(context, null, false, false, d6Var);
        fixNavigationBar();
        this.v = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(getContext());
        bj0Var.setScaleType(ImageView.ScaleType.CENTER);
        bj0Var.setImageResource(R.drawable.large_ads_info);
        bj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        bj0Var.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.v0(i10, d6Var)));
        frameLayout.addView(bj0Var, w7.x5.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SearchAdsAboutTitle));
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.messenger.ul.o(i11, d6Var, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-2, -2, 1, 22, 14, 22, 0), context);
        h.setText(LocaleController.getString(R.string.SearchAdsAboutSubtitle));
        h.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        h.setTextSize(1, 14.0f);
        h.setGravity(1);
        linearLayout.addView(h, w7.x5.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new ai.w5(this, context, R.drawable.menu_privacy, LocaleController.getString(R.string.SearchAdsAbout1Title), LocaleController.getString(R.string.SearchAdsAbout1Subtitle)), w7.x5.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        linearLayout.addView(new ai.w5(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.SearchAdsAbout2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(isPremium ? R.string.SearchAdsAbout2SubtitlePremium : R.string.SearchAdsAbout2Subtitle), new vl0(this, isPremium, oyVar, 7)), true)), w7.x5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d7, d6Var));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.SearchAdsAboutLaunchTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.SearchAdsAboutLaunchSubtitle)), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SearchAdsAboutLaunchLearnMore), new xz0(this, 10)), true));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, null);
        d90Var.setText(replaceCharSequence);
        d90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setGravity(1);
        d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(d90Var, w7.x5.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.SearchAdsAboutUnderstood));
        textView3.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.h6.v0(i10, d6Var)));
        textView3.setOnClickListener(new z31(this, 2));
        linearLayout.addView(textView3, w7.x5.t(-1, 48, 0, 14, 22, 14, 14));
        this.Y.N(false);
    }

    public static void P(k41 k41Var, boolean z10, org.telegram.ui.Components.oy oyVar) {
        if (z10) {
            MessagesController.getInstance(k41Var.currentAccount).disableAds(true);
            oyVar.run();
        } else {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U == null) {
                return;
            } else {
                U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
            }
        }
        k41Var.dismiss();
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.ll0 v(org.telegram.ui.Components.ml0 ml0Var) {
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(ml0Var, getContext(), this.currentAccount, 0, true, new c5(this, 21), this.resourcesProvider);
        this.Y = v51Var;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
