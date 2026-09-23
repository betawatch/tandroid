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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a41 extends org.telegram.ui.Components.bb {
    public final LinearLayout X;
    public org.telegram.ui.Components.v51 Y;

    public a41(Context context, boolean z10, org.telegram.ui.ActionBar.d6 d6Var, Utilities.Callback callback) {
        super(context, null, false, false, d6Var);
        org.telegram.ui.ActionBar.d6 d6Var2;
        fixNavigationBar();
        this.v = 0.2f;
        final int i10 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        bj0Var.setScaleType(scaleType);
        bj0Var.setImageResource(R.drawable.large_ads_info);
        bj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        bj0Var.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
        frameLayout.addView(bj0Var, w7.x5.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (callback != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.r5, false));
            imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.i6, false), 1, -1));
            d6Var2 = d6Var;
            imageView.setOnClickListener(new ai.o5(this, callback, d6Var, imageView, 15));
            frameLayout.addView(imageView, w7.x5.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            d6Var2 = d6Var;
        }
        linearLayout.addView(frameLayout, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.messenger.ul.o(i13, d6Var2, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-2, -2, 1, 22, 14, 22, 0), context);
        h.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        h.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, d6Var2));
        h.setTextSize(1, 14.0f);
        h.setGravity(1);
        linearLayout.addView(h, w7.x5.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new ai.w5(this, context, R.drawable.menu_privacy, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1TitleBot : R.string.RevenueSharingAdsInfo1Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1SubtitleBot : R.string.RevenueSharingAdsInfo1Subtitle)), w7.x5.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new ai.w5(this, context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2TitleBot : R.string.RevenueSharingAdsInfo2Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2SubtitleBot : R.string.RevenueSharingAdsInfo2Subtitle)), w7.x5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String formatString = LocaleController.formatString(z10 ? R.string.RevenueSharingAdsInfo3SubtitleBot : R.string.RevenueSharingAdsInfo3Subtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i14 = org.telegram.ui.ActionBar.h6.gc;
        linearLayout.addView(new ai.w5(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(formatString, i14, 0, new Runnable(this) { // from class: org.telegram.ui.y31
            public final /* synthetic */ a41 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        a41 a41Var = this.b;
                        a41Var.getClass();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            a41Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        a41 a41Var2 = this.b;
                        a41Var2.dismiss();
                        nf.f.s(a41Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        })), w7.x5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d7, d6Var2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4TitleBot : R.string.RevenueSharingAdsInfo4Title));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, d6Var2));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4Subtitle2Bot : R.string.RevenueSharingAdsInfo4Subtitle2));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i14, 0, new Runnable(this) { // from class: org.telegram.ui.y31
            public final /* synthetic */ a41 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        a41 a41Var = this.b;
                        a41Var.getClass();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            a41Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        a41 a41Var2 = this.b;
                        a41Var2.dismiss();
                        nf.f.s(a41Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(R.drawable.attach_arrow_right, 0);
        pqVar.setOverrideColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        pqVar.setScale(0.7f, 0.7f);
        pqVar.setWidth(AndroidUtilities.dp(12.0f));
        pqVar.setTranslateY(1.0f);
        spannableString.setSpan(pqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", replaceTags, replaceSingleTag), spannableString);
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, null);
        d90Var.setText(replaceCharSequence);
        d90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, d6Var2));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setGravity(1);
        d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(d90Var, w7.x5.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, d6Var2));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        textView3.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{6.0f}, org.telegram.ui.ActionBar.h6.v0(i11, d6Var2)));
        textView3.setOnClickListener(new z31(this, i12));
        linearLayout.addView(textView3, w7.x5.t(-1, 48, 0, 14, 22, 14, 14));
        this.Y.N(false);
    }

    public static a41 T(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.d6 d6Var, oc ocVar) {
        a41 a41Var = new a41(context, z10, d6Var, ocVar);
        if (n2Var == null) {
            a41Var.show();
            return a41Var;
        }
        if (n2Var.getParentActivity() != null) {
            n2Var.showDialog(a41Var);
        }
        return a41Var;
    }

    public static void U(Context context, org.telegram.ui.ActionBar.d6 d6Var, xn xnVar) {
        T(context, xnVar, false, d6Var, null);
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.ll0 v(org.telegram.ui.Components.ml0 ml0Var) {
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(ml0Var, getContext(), this.currentAccount, 0, true, new c5(this, 20), this.resourcesProvider);
        this.Y = v51Var;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
