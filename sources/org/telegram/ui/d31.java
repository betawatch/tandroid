package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
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
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d31 extends org.telegram.ui.Components.sa {
    public final LinearLayout T;
    public org.telegram.ui.Components.z41 U;

    public d31(Context context, boolean z10, org.telegram.ui.ActionBar.b6 b6Var, Utilities.Callback callback) {
        super(context, null, false, false, false, 1, b6Var);
        org.telegram.ui.ActionBar.b6 b6Var2;
        fixNavigationBar();
        this.v = 0.2f;
        final int i9 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        final int i11 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        pi0Var.setScaleType(scaleType);
        pi0Var.setImageResource(R.drawable.large_ads_info);
        pi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        pi0Var.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        frameLayout.addView(pi0Var, g7.e6.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (callback != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.r5, false));
            imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 1, -1));
            b6Var2 = b6Var;
            imageView.setOnClickListener(new fh.g4(this, callback, b6Var, imageView, 16));
            frameLayout.addView(imageView, g7.e6.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            b6Var2 = b6Var;
        }
        linearLayout.addView(frameLayout, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.messenger.ll.n(i12, b6Var2, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.t(-2, -2, 1, 22, 14, 22, 0), context);
        h.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        h.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var2));
        h.setTextSize(1, 14.0f);
        h.setGravity(1);
        linearLayout.addView(h, g7.e6.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new dh.g(this, context, R.drawable.menu_privacy, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1TitleBot : R.string.RevenueSharingAdsInfo1Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1SubtitleBot : R.string.RevenueSharingAdsInfo1Subtitle)), g7.e6.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new dh.g(this, context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2TitleBot : R.string.RevenueSharingAdsInfo2Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2SubtitleBot : R.string.RevenueSharingAdsInfo2Subtitle)), g7.e6.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String formatString = LocaleController.formatString(z10 ? R.string.RevenueSharingAdsInfo3SubtitleBot : R.string.RevenueSharingAdsInfo3Subtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i13 = org.telegram.ui.ActionBar.f6.gc;
        linearLayout.addView(new dh.g(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(formatString, i13, 0, new Runnable(this) { // from class: org.telegram.ui.c31
            public final /* synthetic */ d31 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        d31 d31Var = this.b;
                        d31Var.getClass();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.k0(3)));
                            d31Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        d31 d31Var2 = this.b;
                        d31Var2.dismiss();
                        ve.e.s(d31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        })), g7.e6.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, b6Var2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4TitleBot : R.string.RevenueSharingAdsInfo4Title));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var2));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4Subtitle2Bot : R.string.RevenueSharingAdsInfo4Subtitle2));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i13, 0, new Runnable(this) { // from class: org.telegram.ui.c31
            public final /* synthetic */ d31 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        d31 d31Var = this.b;
                        d31Var.getClass();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.k0(3)));
                            d31Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        d31 d31Var2 = this.b;
                        d31Var2.dismiss();
                        ve.e.s(d31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.attach_arrow_right, 0);
        eqVar.setOverrideColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        eqVar.setScale(0.7f, 0.7f);
        eqVar.setWidth(AndroidUtilities.dp(12.0f));
        eqVar.setTranslateY(1.0f);
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", replaceTags, replaceSingleTag), spannableString);
        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(context, null);
        l80Var.setText(replaceCharSequence);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var2));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setGravity(1);
        l80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(l80Var, g7.e6.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, b6Var2));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        textView3.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{6.0f}, org.telegram.ui.ActionBar.f6.v0(i10, b6Var2)));
        textView3.setOnClickListener(new w21(this, i9));
        linearLayout.addView(textView3, g7.e6.t(-1, 48, 0, 14, 22, 14, 14));
        this.U.N(false);
    }

    public static d31 S(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.b6 b6Var, df dfVar) {
        d31 d31Var = new d31(context, z10, b6Var, dfVar);
        if (o2Var == null) {
            d31Var.show();
            return d31Var;
        }
        if (o2Var.getParentActivity() != null) {
            o2Var.showDialog(d31Var);
        }
        return d31Var;
    }

    public static void T(Context context, org.telegram.ui.ActionBar.b6 b6Var, qn qnVar) {
        S(context, qnVar, false, b6Var, null);
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.vk0 v(org.telegram.ui.Components.wk0 wk0Var) {
        org.telegram.ui.Components.z41 z41Var = new org.telegram.ui.Components.z41(wk0Var, getContext(), this.currentAccount, 0, true, new a5(this, 20), this.resourcesProvider);
        this.U = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
