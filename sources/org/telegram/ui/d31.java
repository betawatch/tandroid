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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d31 extends org.telegram.ui.Components.xa {
    public final LinearLayout T;
    public org.telegram.ui.Components.k51 U;

    public d31(Context context, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, Utilities.Callback callback) {
        super(context, null, false, false, false, 1, c6Var);
        org.telegram.ui.ActionBar.c6 c6Var2;
        fixNavigationBar();
        this.v = 0.2f;
        final int i10 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        aj0Var.setScaleType(scaleType);
        aj0Var.setImageResource(R.drawable.large_ads_info);
        aj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        aj0Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        frameLayout.addView(aj0Var, i7.f6.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (callback != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.r5, false));
            imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 1, -1));
            c6Var2 = c6Var;
            imageView.setOnClickListener(new ih.u3(this, callback, c6Var, imageView, 13));
            frameLayout.addView(imageView, i7.f6.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            c6Var2 = c6Var;
        }
        linearLayout.addView(frameLayout, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        b.m(i13, c6Var2, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView i14 = th.i(linearLayout, textView, i7.f6.t(-2, -2, 1, 22, 14, 22, 0), context);
        i14.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        i14.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
        i14.setTextSize(1, 14.0f);
        i14.setGravity(1);
        linearLayout.addView(i14, i7.f6.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new bh.d(this, context, R.drawable.menu_privacy, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1TitleBot : R.string.RevenueSharingAdsInfo1Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1SubtitleBot : R.string.RevenueSharingAdsInfo1Subtitle)), i7.f6.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new bh.d(this, context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2TitleBot : R.string.RevenueSharingAdsInfo2Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2SubtitleBot : R.string.RevenueSharingAdsInfo2Subtitle)), i7.f6.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String formatString = LocaleController.formatString(z10 ? R.string.RevenueSharingAdsInfo3SubtitleBot : R.string.RevenueSharingAdsInfo3Subtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i15 = org.telegram.ui.ActionBar.g6.gc;
        linearLayout.addView(new bh.d(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(formatString, i15, 0, new Runnable(this) { // from class: org.telegram.ui.c31
            public final /* synthetic */ d31 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        d31 d31Var = this.b;
                        d31Var.getClass();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            d31Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        d31 d31Var2 = this.b;
                        d31Var2.dismiss();
                        ye.d.s(d31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        })), i7.f6.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4TitleBot : R.string.RevenueSharingAdsInfo4Title));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4Subtitle2Bot : R.string.RevenueSharingAdsInfo4Subtitle2));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i15, 0, new Runnable(this) { // from class: org.telegram.ui.c31
            public final /* synthetic */ d31 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        d31 d31Var = this.b;
                        d31Var.getClass();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            d31Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        d31 d31Var2 = this.b;
                        d31Var2.dismiss();
                        ye.d.s(d31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.attach_arrow_right, 0);
        iqVar.setOverrideColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        iqVar.setScale(0.7f, 0.7f);
        iqVar.setWidth(AndroidUtilities.dp(12.0f));
        iqVar.setTranslateY(1.0f);
        spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", replaceTags, replaceSingleTag), spannableString);
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, null);
        y80Var.setText(replaceCharSequence);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setGravity(1);
        y80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(y80Var, i7.f6.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var2));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{6.0f}, org.telegram.ui.ActionBar.g6.v0(i11, c6Var2)));
        textView3.setOnClickListener(new w21(this, i10));
        linearLayout.addView(textView3, i7.f6.t(-1, 48, 0, 14, 22, 14, 14));
        this.U.N(false);
    }

    public static d31 T(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, ih.b1 b1Var) {
        d31 d31Var = new d31(context, z10, c6Var, b1Var);
        if (o2Var == null) {
            d31Var.show();
            return d31Var;
        }
        if (o2Var.getParentActivity() != null) {
            o2Var.showDialog(d31Var);
        }
        return d31Var;
    }

    public static void U(Context context, org.telegram.ui.ActionBar.c6 c6Var, tn tnVar) {
        T(context, tnVar, false, c6Var, null);
    }

    @Override // org.telegram.ui.Components.xa
    public final org.telegram.ui.Components.il0 v(org.telegram.ui.Components.jl0 jl0Var) {
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(jl0Var, getContext(), this.currentAccount, 0, true, new b5(this, 20), this.resourcesProvider);
        this.U = k51Var;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
