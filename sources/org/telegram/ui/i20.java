package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class i20 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity, int i10, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.f6 f6Var) {
        String str2;
        String str3;
        org.telegram.ui.ActionBar.f3 f3Var;
        String formatString;
        String b10;
        String str4;
        String str5;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f3 f3Var2;
        org.telegram.ui.Components.r11 r11Var;
        org.telegram.ui.ActionBar.f3 f3Var3 = new org.telegram.ui.ActionBar.f3(1, (Context) activity, f6Var, false);
        f3Var3.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        linearLayout.addView(frameLayout, w7.x5.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(activity);
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = i10 == 0 ? 70 : 78;
        aj0Var.f(i10 == 0 ? R.raw.fragment_username : R.raw.fragment, i11, i11, null);
        aj0Var.d();
        aj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i10 == 0) {
            aj0Var.setScaleX(0.86f);
            aj0Var.setScaleY(0.86f);
        } else {
            aj0Var.setTranslationY(AndroidUtilities.dp(2.0f));
        }
        frameLayout.addView(aj0Var, w7.x5.q(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str3 = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = "";
                String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                if (i10 != 0) {
                    f3Var = f3Var3;
                    String formatString2 = LocaleController.formatString(R.string.FragmentUsernameTitle, org.telegram.ui.Cells.p6.i("@", str));
                    formatString = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : a4.a.p("(", formatCurrency, ")"));
                    b10 = a4.a.q(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
                    str4 = formatString2;
                } else {
                    f3Var = f3Var3;
                    if (i10 != 1) {
                        return;
                    }
                    String formatString3 = LocaleController.formatString(R.string.FragmentPhoneTitle, gf.b.c().b("+" + str));
                    formatString = LocaleController.formatString(R.string.FragmentPhoneMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : a4.a.p("(", formatCurrency, ")"));
                    b10 = gf.b.c().b("+" + str);
                    str4 = formatString3;
                }
                String str6 = formatString;
                str5 = b10;
                if (str5 == null) {
                    f6Var2 = f6Var;
                    org.telegram.ui.ActionBar.f3 f3Var4 = f3Var;
                    r11Var = new org.telegram.ui.Components.r11(str5, i10, f3Var4, f6Var2, 2);
                    f3Var2 = f3Var4;
                } else {
                    f6Var2 = f6Var;
                    f3Var2 = f3Var;
                    r11Var = null;
                }
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(str4, r11Var);
                SpannableString spannableString = new SpannableString("TON");
                org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.mini_gram_16, 0);
                nqVar.setWidth(AndroidUtilities.dp(13.0f));
                spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
                SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str6), spannableString);
                org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(activity, null);
                d90Var.setTypeface(AndroidUtilities.bold());
                d90Var.setGravity(17);
                int i12 = org.telegram.ui.ActionBar.j6.j5;
                d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
                d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.o6, f6Var2));
                d90Var.setTextSize(1, 16.0f);
                d90Var.setText(replaceSingleTag);
                linearLayout.addView(d90Var, w7.x5.t(-1, -2, 1, 42, 0, 42, 0));
                FrameLayout frameLayout2 = new FrameLayout(activity);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ci, f6Var2)));
                org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(activity);
                x9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
                i9Var.p(tLObject);
                x9Var.e(tLObject, i9Var);
                frameLayout2.addView(x9Var, w7.x5.e(28, 28, 51));
                TextView textView = new TextView(activity);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
                textView.setTextSize(1, 13.0f);
                textView.setSingleLine();
                textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                frameLayout2.addView(textView, w7.x5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
                linearLayout.addView(frameLayout2, w7.x5.t(-2, 28, 1, 42, 10, 42, 18));
                TextView textView2 = new TextView(activity);
                textView2.setGravity(17);
                org.telegram.messenger.wl.n(i12, f6Var2, textView2, 1, 14.0f);
                textView2.setText(replaceCharSequence);
                linearLayout.addView(textView2, w7.x5.t(-1, -2, 1, 32, 0, 32, 19));
                di.d dVar = new di.d(activity, f6Var2, true);
                dVar.setRoundRadius(24);
                dVar.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
                dVar.setOnClickListener(new tv(7, activity, tL_collectibleInfo));
                linearLayout.addView(dVar, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
                if (r11Var != null) {
                    di.d dVar2 = new di.d(activity, f6Var2, true);
                    dVar2.setRoundRadius(24);
                    dVar2.d();
                    dVar2.g(LocaleController.getString(i10 == 0 ? R.string.FragmentUsernameCopy : R.string.FragmentPhoneCopy), false, true);
                    dVar2.setOnClickListener(new tv(8, r11Var, f3Var2));
                    linearLayout.addView(dVar2, w7.x5.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
                }
                f3Var2.setCustomView(linearLayout);
                f3Var2.show();
            }
            str3 = ((TLRPC.Chat) tLObject).title;
        }
        str2 = str3;
        String formatCurrency3 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String formatCurrency22 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i10 != 0) {
        }
        String str62 = formatString;
        str5 = b10;
        if (str5 == null) {
        }
        SpannableStringBuilder replaceSingleTag2 = AndroidUtilities.replaceSingleTag(str4, r11Var);
        SpannableString spannableString2 = new SpannableString("TON");
        org.telegram.ui.Components.nq nqVar2 = new org.telegram.ui.Components.nq(R.drawable.mini_gram_16, 0);
        nqVar2.setWidth(AndroidUtilities.dp(13.0f));
        spannableString2.setSpan(nqVar2, 0, spannableString2.length(), 33);
        SpannableStringBuilder replaceCharSequence2 = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str62), spannableString2);
        org.telegram.ui.Components.d90 d90Var2 = new org.telegram.ui.Components.d90(activity, null);
        d90Var2.setTypeface(AndroidUtilities.bold());
        d90Var2.setGravity(17);
        int i122 = org.telegram.ui.ActionBar.j6.j5;
        d90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i122, f6Var2));
        d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.o6, f6Var2));
        d90Var2.setTextSize(1, 16.0f);
        d90Var2.setText(replaceSingleTag2);
        linearLayout.addView(d90Var2, w7.x5.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout22 = new FrameLayout(activity);
        frameLayout22.setBackground(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ci, f6Var2)));
        org.telegram.ui.Components.x9 x9Var2 = new org.telegram.ui.Components.x9(activity);
        x9Var2.setRoundRadius(AndroidUtilities.dp(28.0f));
        org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        i9Var2.p(tLObject);
        x9Var2.e(tLObject, i9Var2);
        frameLayout22.addView(x9Var2, w7.x5.e(28, 28, 51));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i122, f6Var2));
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(Emoji.replaceEmoji(str2, textView3.getPaint().getFontMetricsInt(), false));
        frameLayout22.addView(textView3, w7.x5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout22, w7.x5.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView22 = new TextView(activity);
        textView22.setGravity(17);
        org.telegram.messenger.wl.n(i122, f6Var2, textView22, 1, 14.0f);
        textView22.setText(replaceCharSequence2);
        linearLayout.addView(textView22, w7.x5.t(-1, -2, 1, 32, 0, 32, 19));
        di.d dVar3 = new di.d(activity, f6Var2, true);
        dVar3.setRoundRadius(24);
        dVar3.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        dVar3.setOnClickListener(new tv(7, activity, tL_collectibleInfo));
        linearLayout.addView(dVar3, w7.x5.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (r11Var != null) {
        }
        f3Var2.setCustomView(linearLayout);
        f3Var2.show();
    }
}
