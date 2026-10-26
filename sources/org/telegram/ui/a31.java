package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a31 extends org.telegram.ui.Components.bb {
    public final LinearLayout X;
    public final org.telegram.ui.Components.zq Y;
    public final org.telegram.ui.Components.z90 Z;
    public org.telegram.ui.Components.j71 a0;

    public a31(Context context, boolean z10, org.telegram.ui.ActionBar.u6 u6Var, Utilities.Callback callback) {
        super(context, null, false, false, u6Var);
        org.telegram.ui.ActionBar.u6 u6Var2;
        fixNavigationBar();
        this.v = 0.2f;
        final int i10 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ak0Var.setScaleType(scaleType);
        ak0Var.setImageResource(R.drawable.large_ads_info);
        ak0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        ak0Var.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(ak0Var, K, N, null, u6Var);
        frameLayout.addView(ak0Var, org.telegram.ui.Components.gb1.h(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (callback != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.r5, null, PorterDuff.Mode.SRC_ATOP);
            int i13 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i13, false), 1, -1);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
            imageView.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N2, null);
            u6Var2 = u6Var;
            imageView.setOnClickListener(new di.c4(this, callback, u6Var, imageView, 15));
            frameLayout.addView(imageView, org.telegram.ui.Components.gb1.h(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            u6Var2 = u6Var;
        }
        linearLayout.addView(frameLayout, org.telegram.ui.Components.gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i14 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i14, u6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView e = org.telegram.messenger.vh.e(linearLayout, textView, org.telegram.ui.Components.gb1.x(-2, -2, 1, 22, 14, 22, 0), context);
        e.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        org.telegram.ui.ActionBar.f7.V(e, i14, u6Var2);
        e.setTextSize(1, 14.0f);
        e.setGravity(1);
        linearLayout.addView(e, org.telegram.ui.Components.gb1.x(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new di.i4(this, context, R.drawable.menu_privacy, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1TitleBot : R.string.RevenueSharingAdsInfo1Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1SubtitleBot : R.string.RevenueSharingAdsInfo1Subtitle)), org.telegram.ui.Components.gb1.t(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new di.i4(this, context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2TitleBot : R.string.RevenueSharingAdsInfo2Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2SubtitleBot : R.string.RevenueSharingAdsInfo2Subtitle)), org.telegram.ui.Components.gb1.t(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String formatString = LocaleController.formatString(z10 ? R.string.RevenueSharingAdsInfo3SubtitleBot : R.string.RevenueSharingAdsInfo3Subtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i15 = org.telegram.ui.ActionBar.y6.gc;
        linearLayout.addView(new di.i4(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(formatString, i15, 0, new Runnable(this) { // from class: org.telegram.ui.z21
            public final /* synthetic */ a31 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        a31 a31Var = this.b;
                        a31Var.getClass();
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(3)));
                            a31Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        a31 a31Var2 = this.b;
                        a31Var2.dismiss();
                        qf.d.r(a31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        })), org.telegram.ui.Components.gb1.t(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view, u6Var2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4TitleBot : R.string.RevenueSharingAdsInfo4Title));
        textView2.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.V(textView2, i14, u6Var2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, org.telegram.ui.Components.gb1.x(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4Subtitle2Bot : R.string.RevenueSharingAdsInfo4Subtitle2));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i15, 0, new Runnable(this) { // from class: org.telegram.ui.z21
            public final /* synthetic */ a31 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        a31 a31Var = this.b;
                        a31Var.getClass();
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(3)));
                            a31Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        a31 a31Var2 = this.b;
                        a31Var2.dismiss();
                        qf.d.r(a31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.attach_arrow_right, 0);
        this.Y = zqVar;
        zqVar.setOverrideColor(org.telegram.ui.ActionBar.y6.x0(null, i15, false));
        zqVar.setScale(0.7f, 0.7f);
        zqVar.setWidth(AndroidUtilities.dp(12.0f));
        zqVar.setTranslateY(1.0f);
        spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", replaceTags, replaceSingleTag), spannableString);
        org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(context, null);
        this.Z = z90Var;
        z90Var.setText(replaceCharSequence);
        org.telegram.ui.ActionBar.f7.V(z90Var, i14, u6Var2);
        z90Var.setTextSize(1, 14.0f);
        z90Var.setGravity(1);
        z90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(z90Var, org.telegram.ui.Components.gb1.x(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, u6Var2);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.o6.e(new float[]{6.0f}, org.telegram.ui.ActionBar.y6.w0(i11, u6Var2));
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.b7 f7 = org.telegram.ui.ActionBar.f7.f(i11);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.f7.k(textView3, e10, N3, f7, u6Var2);
        textView3.setOnClickListener(new t21(this, i10));
        linearLayout.addView(textView3, org.telegram.ui.Components.gb1.x(-1, 48, 0, 14, 22, 14, 14));
        this.a0.O(false);
    }

    public static a31 T(Context context, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, org.telegram.ui.ActionBar.u6 u6Var, li.s2 s2Var) {
        a31 a31Var = new a31(context, z10, u6Var, s2Var);
        if (r2Var == null) {
            a31Var.show();
            return a31Var;
        }
        if (r2Var.getParentActivity() != null) {
            r2Var.showDialog(a31Var);
        }
        return a31Var;
    }

    public static void U(Context context, org.telegram.ui.ActionBar.u6 u6Var, un unVar) {
        T(context, unVar, false, u6Var, null);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.zq zqVar = this.Y;
            if (zqVar != null) {
                zqVar.setOverrideColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
                org.telegram.ui.Components.z90 z90Var = this.Z;
                if (z90Var != null) {
                    z90Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.lm0 v(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(mm0Var, getContext(), this.currentAccount, 0, true, new e5(this, 20), this.resourcesProvider);
        this.a0 = j71Var;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
