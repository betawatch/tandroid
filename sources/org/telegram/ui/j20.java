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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class j20 {
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
        org.telegram.ui.ActionBar.h3 h3Var;
        String formatString;
        String b10;
        String str4;
        String str5;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.h3 h3Var2;
        org.telegram.ui.Components.g21 g21Var;
        org.telegram.ui.ActionBar.h3 h3Var3 = new org.telegram.ui.ActionBar.h3(1, (Context) activity, f6Var, false);
        h3Var3.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        linearLayout.addView(frameLayout, w7.a6.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(activity);
        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = i10 == 0 ? 70 : 78;
        kj0Var.f(i10 == 0 ? R.raw.fragment_username : R.raw.fragment, i11, i11, null);
        kj0Var.d();
        kj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i10 == 0) {
            kj0Var.setScaleX(0.86f);
            kj0Var.setScaleY(0.86f);
        } else {
            kj0Var.setTranslationY(AndroidUtilities.dp(2.0f));
        }
        frameLayout.addView(kj0Var, w7.a6.q(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str3 = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = "";
                String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                if (i10 != 0) {
                    h3Var = h3Var3;
                    String formatString2 = LocaleController.formatString(R.string.FragmentUsernameTitle, org.telegram.ui.Cells.r6.i("@", str));
                    formatString = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : a4.a.p("(", formatCurrency, ")"));
                    b10 = a4.a.q(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
                    str4 = formatString2;
                } else {
                    h3Var = h3Var3;
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
                    org.telegram.ui.ActionBar.h3 h3Var4 = h3Var;
                    g21Var = new org.telegram.ui.Components.g21(str5, i10, h3Var4, f6Var2, 2);
                    h3Var2 = h3Var4;
                } else {
                    f6Var2 = f6Var;
                    h3Var2 = h3Var;
                    g21Var = null;
                }
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(str4, g21Var);
                SpannableString spannableString = new SpannableString("TON");
                org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.mini_gram_16, 0);
                uqVar.setWidth(AndroidUtilities.dp(13.0f));
                spannableString.setSpan(uqVar, 0, spannableString.length(), 33);
                SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str6), spannableString);
                org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(activity, null);
                m90Var.setTypeface(AndroidUtilities.bold());
                m90Var.setGravity(17);
                int i12 = org.telegram.ui.ActionBar.j6.j5;
                m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
                m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.o6, f6Var2));
                m90Var.setTextSize(1, 16.0f);
                m90Var.setText(replaceSingleTag);
                linearLayout.addView(m90Var, w7.a6.t(-1, -2, 1, 42, 0, 42, 0));
                FrameLayout frameLayout2 = new FrameLayout(activity);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ci, f6Var2)));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
                w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                g9Var.p(tLObject);
                w9Var.e(tLObject, g9Var);
                frameLayout2.addView(w9Var, w7.a6.e(28, 28, 51));
                TextView textView = new TextView(activity);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
                textView.setTextSize(1, 13.0f);
                textView.setSingleLine();
                textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                frameLayout2.addView(textView, w7.a6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
                linearLayout.addView(frameLayout2, w7.a6.t(-2, 28, 1, 42, 10, 42, 18));
                TextView textView2 = new TextView(activity);
                textView2.setGravity(17);
                org.telegram.messenger.em.n(i12, f6Var2, textView2, 1, 14.0f);
                textView2.setText(replaceCharSequence);
                linearLayout.addView(textView2, w7.a6.t(-1, -2, 1, 32, 0, 32, 19));
                bi.d dVar = new bi.d(activity, f6Var2, true);
                dVar.setRoundRadius(24);
                dVar.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
                dVar.setOnClickListener(new ow(4, activity, tL_collectibleInfo));
                linearLayout.addView(dVar, w7.a6.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
                if (g21Var != null) {
                    bi.d dVar2 = new bi.d(activity, f6Var2, true);
                    dVar2.setRoundRadius(24);
                    dVar2.d();
                    dVar2.g(LocaleController.getString(i10 == 0 ? R.string.FragmentUsernameCopy : R.string.FragmentPhoneCopy), false, true);
                    dVar2.setOnClickListener(new ow(5, g21Var, h3Var2));
                    linearLayout.addView(dVar2, w7.a6.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
                }
                h3Var2.setCustomView(linearLayout);
                h3Var2.show();
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
        SpannableStringBuilder replaceSingleTag2 = AndroidUtilities.replaceSingleTag(str4, g21Var);
        SpannableString spannableString2 = new SpannableString("TON");
        org.telegram.ui.Components.uq uqVar2 = new org.telegram.ui.Components.uq(R.drawable.mini_gram_16, 0);
        uqVar2.setWidth(AndroidUtilities.dp(13.0f));
        spannableString2.setSpan(uqVar2, 0, spannableString2.length(), 33);
        SpannableStringBuilder replaceCharSequence2 = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str62), spannableString2);
        org.telegram.ui.Components.m90 m90Var2 = new org.telegram.ui.Components.m90(activity, null);
        m90Var2.setTypeface(AndroidUtilities.bold());
        m90Var2.setGravity(17);
        int i122 = org.telegram.ui.ActionBar.j6.j5;
        m90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i122, f6Var2));
        m90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.o6, f6Var2));
        m90Var2.setTextSize(1, 16.0f);
        m90Var2.setText(replaceSingleTag2);
        linearLayout.addView(m90Var2, w7.a6.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout22 = new FrameLayout(activity);
        frameLayout22.setBackground(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ci, f6Var2)));
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(activity);
        w9Var2.setRoundRadius(AndroidUtilities.dp(28.0f));
        org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        g9Var2.p(tLObject);
        w9Var2.e(tLObject, g9Var2);
        frameLayout22.addView(w9Var2, w7.a6.e(28, 28, 51));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i122, f6Var2));
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(Emoji.replaceEmoji(str2, textView3.getPaint().getFontMetricsInt(), false));
        frameLayout22.addView(textView3, w7.a6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout22, w7.a6.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView22 = new TextView(activity);
        textView22.setGravity(17);
        org.telegram.messenger.em.n(i122, f6Var2, textView22, 1, 14.0f);
        textView22.setText(replaceCharSequence2);
        linearLayout.addView(textView22, w7.a6.t(-1, -2, 1, 32, 0, 32, 19));
        bi.d dVar3 = new bi.d(activity, f6Var2, true);
        dVar3.setRoundRadius(24);
        dVar3.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        dVar3.setOnClickListener(new ow(4, activity, tL_collectibleInfo));
        linearLayout.addView(dVar3, w7.a6.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (g21Var != null) {
        }
        h3Var2.setCustomView(linearLayout);
        h3Var2.show();
    }
}
