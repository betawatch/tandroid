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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class n41 extends org.telegram.ui.Components.db {
    public final LinearLayout X;
    public org.telegram.ui.Components.a71 Y;

    public n41(Context context, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, Utilities.Callback callback) {
        super(context, null, false, false, c6Var);
        org.telegram.ui.ActionBar.c6 c6Var2;
        fixNavigationBar();
        this.v = 0.2f;
        final int i10 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        bk0Var.setScaleType(scaleType);
        bk0Var.setImageResource(R.drawable.large_ads_info);
        bk0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        bk0Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(i11, c6Var)));
        frameLayout.addView(bk0Var, w7.z5.a(80.0f, 0.0f, 20.0f, 0.0f, 0.0f, 80, 1));
        if (callback != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.r5, false));
            imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i6, false), 1, -1));
            c6Var2 = c6Var;
            imageView.setOnClickListener(new bi.b5(this, callback, c6Var, imageView, 15));
            frameLayout.addView(imageView, w7.z5.a(24.0f, 12.0f, 14.0f, 14.0f, 12.0f, 24, 53));
        } else {
            c6Var2 = c6Var;
        }
        linearLayout.addView(frameLayout, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.messenger.sk.o(i13, c6Var2, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView i14 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-2, -2, 1, 22, 14, 22, 0), context);
        i14.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        i14.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var2));
        i14.setTextSize(1, 14.0f);
        i14.setGravity(1);
        linearLayout.addView(i14, w7.z5.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new bi.i5(this, context, R.drawable.menu_privacy, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1TitleBot : R.string.RevenueSharingAdsInfo1Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1SubtitleBot : R.string.RevenueSharingAdsInfo1Subtitle)), w7.z5.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new bi.i5(this, context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2TitleBot : R.string.RevenueSharingAdsInfo2Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2SubtitleBot : R.string.RevenueSharingAdsInfo2Subtitle)), w7.z5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String formatString = LocaleController.formatString(z10 ? R.string.RevenueSharingAdsInfo3SubtitleBot : R.string.RevenueSharingAdsInfo3Subtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i15 = org.telegram.ui.ActionBar.g6.gc;
        linearLayout.addView(new bi.i5(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(formatString, i15, 0, new Runnable(this) { // from class: org.telegram.ui.m41
            public final /* synthetic */ n41 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        n41 n41Var = this.b;
                        n41Var.getClass();
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            n41Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        n41 n41Var2 = this.b;
                        n41Var2.dismiss();
                        pf.d.r(n41Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        })), w7.z5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d7, c6Var2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4TitleBot : R.string.RevenueSharingAdsInfo4Title));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var2));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4Subtitle2Bot : R.string.RevenueSharingAdsInfo4Subtitle2));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i15, 0, new Runnable(this) { // from class: org.telegram.ui.m41
            public final /* synthetic */ n41 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        n41 n41Var = this.b;
                        n41Var.getClass();
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            n41Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        n41 n41Var2 = this.b;
                        n41Var2.dismiss();
                        pf.d.r(n41Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.attach_arrow_right, 0);
        brVar.setOverrideColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        brVar.setScale(0.7f, 0.7f);
        brVar.setWidth(AndroidUtilities.dp(12.0f));
        brVar.setTranslateY(1.0f);
        spannableString.setSpan(brVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", replaceTags, replaceSingleTag), spannableString);
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(context, null);
        da0Var.setText(replaceCharSequence);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var2));
        da0Var.setTextSize(1, 14.0f);
        da0Var.setGravity(1);
        da0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(da0Var, w7.z5.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, c6Var2));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{6.0f}, org.telegram.ui.ActionBar.g6.w0(i11, c6Var2)));
        textView3.setOnClickListener(new t60(this, 29));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 0, 14, 22, 14, 14));
        this.Y.N(false);
    }

    public static n41 U(Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, uc ucVar) {
        n41 n41Var = new n41(context, z10, c6Var, ucVar);
        if (m2Var == null) {
            n41Var.show();
            return n41Var;
        }
        if (m2Var.getParentActivity() != null) {
            m2Var.showDialog(n41Var);
        }
        return n41Var;
    }

    public static void V(Context context, org.telegram.ui.ActionBar.c6 c6Var, fo foVar) {
        U(context, foVar, false, c6Var, null);
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence B() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }

    @Override // org.telegram.ui.Components.db
    public final org.telegram.ui.Components.lm0 x(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(mm0Var, getContext(), this.currentAccount, 0, true, new f5(this, 20), this.resourcesProvider);
        this.Y = a71Var;
        return a71Var;
    }
}
