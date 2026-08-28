package org.telegram.ui;

import android.app.Activity;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class p10 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity, int i9, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.b6 b6Var) {
        String str2;
        String str3;
        org.telegram.ui.ActionBar.f3 f3Var;
        String formatString;
        String b10;
        String str4;
        String str5;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.f3 f3Var2;
        org.telegram.ui.Components.y01 y01Var;
        org.telegram.ui.ActionBar.f3 f3Var3 = new org.telegram.ui.ActionBar.f3(activity, b6Var, false, false);
        f3Var3.fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
        linearLayout.addView(frameLayout, g7.e6.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(activity);
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = i9 == 0 ? 70 : 78;
        pi0Var.f(i9 == 0 ? R.raw.fragment_username : R.raw.fragment, i10, i10, null);
        pi0Var.d();
        pi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i9 == 0) {
            pi0Var.setScaleX(0.86f);
            pi0Var.setScaleY(0.86f);
        } else {
            pi0Var.setTranslationY(AndroidUtilities.dp(2.0f));
        }
        frameLayout.addView(pi0Var, g7.e6.q(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str3 = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = "";
                String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                if (i9 != 0) {
                    f3Var = f3Var3;
                    String formatString2 = LocaleController.formatString(R.string.FragmentUsernameTitle, ta.b.d("@", str));
                    formatString = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : aa.d.o("(", formatCurrency, ")"));
                    b10 = aa.d.p(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
                    str4 = formatString2;
                } else {
                    f3Var = f3Var3;
                    if (i9 != 1) {
                        return;
                    }
                    String formatString3 = LocaleController.formatString(R.string.FragmentPhoneTitle, ne.b.c().b("+" + str));
                    formatString = LocaleController.formatString(R.string.FragmentPhoneMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : aa.d.o("(", formatCurrency, ")"));
                    b10 = ne.b.c().b("+" + str);
                    str4 = formatString3;
                }
                String str6 = formatString;
                str5 = b10;
                if (str5 == null) {
                    b6Var2 = b6Var;
                    org.telegram.ui.ActionBar.f3 f3Var4 = f3Var;
                    y01Var = new org.telegram.ui.Components.y01(str5, i9, f3Var4, b6Var2, 2);
                    f3Var2 = f3Var4;
                } else {
                    b6Var2 = b6Var;
                    f3Var2 = f3Var;
                    y01Var = null;
                }
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(str4, y01Var);
                SpannableString spannableString = new SpannableString("TON");
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.mini_gram_16, 0);
                eqVar.setWidth(AndroidUtilities.dp(13.0f));
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
                SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str6), spannableString);
                org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(activity, null);
                l80Var.setTypeface(AndroidUtilities.bold());
                l80Var.setGravity(17);
                int i11 = org.telegram.ui.ActionBar.f6.j5;
                l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var2));
                l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.o6, b6Var2));
                l80Var.setTextSize(1, 16.0f);
                l80Var.setText(replaceSingleTag);
                linearLayout.addView(l80Var, g7.e6.t(-1, -2, 1, 42, 0, 42, 0));
                FrameLayout frameLayout2 = new FrameLayout(activity);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ci, b6Var2)));
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(activity);
                o9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                z8Var.p(tLObject);
                o9Var.e(tLObject, z8Var);
                frameLayout2.addView(o9Var, g7.e6.e(28, 28, 51));
                TextView textView = new TextView(activity);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var2));
                textView.setTextSize(1, 13.0f);
                textView.setSingleLine();
                textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                frameLayout2.addView(textView, g7.e6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
                linearLayout.addView(frameLayout2, g7.e6.t(-2, 28, 1, 42, 10, 42, 18));
                TextView textView2 = new TextView(activity);
                textView2.setGravity(17);
                org.telegram.messenger.ll.n(i11, b6Var2, textView2, 1, 14.0f);
                textView2.setText(replaceCharSequence);
                linearLayout.addView(textView2, g7.e6.t(-1, -2, 1, 32, 0, 32, 19));
                kh.d dVar = new kh.d(activity, b6Var2, true);
                dVar.setRoundRadius(24);
                dVar.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
                dVar.setOnClickListener(new org.telegram.ui.Components.vh0(activity, tL_collectibleInfo, false, 24));
                linearLayout.addView(dVar, g7.e6.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
                if (y01Var != null) {
                    kh.d dVar2 = new kh.d(activity, b6Var2, true);
                    dVar2.setRoundRadius(24);
                    dVar2.d();
                    dVar2.g(LocaleController.getString(i9 == 0 ? R.string.FragmentUsernameCopy : R.string.FragmentPhoneCopy), false, true);
                    dVar2.setOnClickListener(new org.telegram.ui.Components.vh0(25, y01Var, f3Var2));
                    linearLayout.addView(dVar2, g7.e6.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
                }
                f3Var2.setCustomView(linearLayout);
                f3Var2.show();
            }
            str3 = ((TLRPC.Chat) tLObject).title;
        }
        str2 = str3;
        String formatCurrency3 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String formatCurrency22 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i9 != 0) {
        }
        String str62 = formatString;
        str5 = b10;
        if (str5 == null) {
        }
        SpannableStringBuilder replaceSingleTag2 = AndroidUtilities.replaceSingleTag(str4, y01Var);
        SpannableString spannableString2 = new SpannableString("TON");
        org.telegram.ui.Components.eq eqVar2 = new org.telegram.ui.Components.eq(R.drawable.mini_gram_16, 0);
        eqVar2.setWidth(AndroidUtilities.dp(13.0f));
        spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
        SpannableStringBuilder replaceCharSequence2 = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str62), spannableString2);
        org.telegram.ui.Components.l80 l80Var2 = new org.telegram.ui.Components.l80(activity, null);
        l80Var2.setTypeface(AndroidUtilities.bold());
        l80Var2.setGravity(17);
        int i112 = org.telegram.ui.ActionBar.f6.j5;
        l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i112, b6Var2));
        l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.o6, b6Var2));
        l80Var2.setTextSize(1, 16.0f);
        l80Var2.setText(replaceSingleTag2);
        linearLayout.addView(l80Var2, g7.e6.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout22 = new FrameLayout(activity);
        frameLayout22.setBackground(org.telegram.ui.ActionBar.f6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ci, b6Var2)));
        org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(activity);
        o9Var2.setRoundRadius(AndroidUtilities.dp(28.0f));
        org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var2.p(tLObject);
        o9Var2.e(tLObject, z8Var2);
        frameLayout22.addView(o9Var2, g7.e6.e(28, 28, 51));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i112, b6Var2));
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(Emoji.replaceEmoji(str2, textView3.getPaint().getFontMetricsInt(), false));
        frameLayout22.addView(textView3, g7.e6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout22, g7.e6.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView22 = new TextView(activity);
        textView22.setGravity(17);
        org.telegram.messenger.ll.n(i112, b6Var2, textView22, 1, 14.0f);
        textView22.setText(replaceCharSequence2);
        linearLayout.addView(textView22, g7.e6.t(-1, -2, 1, 32, 0, 32, 19));
        kh.d dVar3 = new kh.d(activity, b6Var2, true);
        dVar3.setRoundRadius(24);
        dVar3.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        dVar3.setOnClickListener(new org.telegram.ui.Components.vh0(activity, tL_collectibleInfo, false, 24));
        linearLayout.addView(dVar3, g7.e6.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (y01Var != null) {
        }
        f3Var2.setCustomView(linearLayout);
        f3Var2.show();
    }
}
