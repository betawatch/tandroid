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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class e20 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity, int i10, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.g6 g6Var) {
        String str2;
        String str3;
        org.telegram.ui.ActionBar.h3 h3Var;
        String formatString;
        String b10;
        String str4;
        String str5;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.h3 h3Var2;
        dt dtVar;
        org.telegram.ui.ActionBar.h3 h3Var3 = new org.telegram.ui.ActionBar.h3(activity, g6Var, false, false);
        h3Var3.fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
        linearLayout.addView(frameLayout, k7.c6.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(activity);
        lj0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = i10 == 0 ? 70 : 78;
        lj0Var.f(i10 == 0 ? R.raw.fragment_username : R.raw.fragment, i11, i11, null);
        lj0Var.d();
        lj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i10 == 0) {
            lj0Var.setScaleX(0.86f);
            lj0Var.setScaleY(0.86f);
        } else {
            lj0Var.setTranslationY(AndroidUtilities.dp(2.0f));
        }
        frameLayout.addView(lj0Var, k7.c6.q(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str3 = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = "";
                String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                if (i10 != 0) {
                    h3Var = h3Var3;
                    String formatString2 = LocaleController.formatString(R.string.FragmentUsernameTitle, yh.k("@", str));
                    formatString = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : android.support.v4.media.a.o("(", formatCurrency, ")"));
                    b10 = android.support.v4.media.a.p(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
                    str4 = formatString2;
                } else {
                    h3Var = h3Var3;
                    if (i10 != 1) {
                        return;
                    }
                    String formatString3 = LocaleController.formatString(R.string.FragmentPhoneTitle, se.b.c().b("+" + str));
                    formatString = LocaleController.formatString(R.string.FragmentPhoneMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : android.support.v4.media.a.o("(", formatCurrency, ")"));
                    b10 = se.b.c().b("+" + str);
                    str4 = formatString3;
                }
                String str6 = formatString;
                str5 = b10;
                if (str5 == null) {
                    g6Var2 = g6Var;
                    org.telegram.ui.ActionBar.h3 h3Var4 = h3Var;
                    dtVar = new dt(str5, i10, h3Var4, g6Var2, 1);
                    h3Var2 = h3Var4;
                } else {
                    g6Var2 = g6Var;
                    h3Var2 = h3Var;
                    dtVar = null;
                }
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(str4, dtVar);
                SpannableString spannableString = new SpannableString("TON");
                org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_gram_16, 0);
                oqVar.setWidth(AndroidUtilities.dp(13.0f));
                spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
                SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str6), spannableString);
                org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(activity, null);
                g90Var.setTypeface(AndroidUtilities.bold());
                g90Var.setGravity(17);
                int i12 = org.telegram.ui.ActionBar.k6.j5;
                g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var2));
                g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.o6, g6Var2));
                g90Var.setTextSize(1, 16.0f);
                g90Var.setText(replaceSingleTag);
                linearLayout.addView(g90Var, k7.c6.t(-1, -2, 1, 42, 0, 42, 0));
                FrameLayout frameLayout2 = new FrameLayout(activity);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ci, g6Var2)));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
                p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
                z8Var.p(tLObject);
                p9Var.e(tLObject, z8Var);
                frameLayout2.addView(p9Var, k7.c6.e(28, 28, 51));
                TextView textView = new TextView(activity);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var2));
                textView.setTextSize(1, 13.0f);
                textView.setSingleLine();
                textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                frameLayout2.addView(textView, k7.c6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
                linearLayout.addView(frameLayout2, k7.c6.t(-2, 28, 1, 42, 10, 42, 18));
                TextView textView2 = new TextView(activity);
                textView2.setGravity(17);
                b.l(i12, g6Var2, textView2, 1, 14.0f);
                textView2.setText(replaceCharSequence);
                linearLayout.addView(textView2, k7.c6.t(-1, -2, 1, 32, 0, 32, 19));
                qh.d dVar = new qh.d(activity, g6Var2, true);
                dVar.setRoundRadius(24);
                dVar.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
                dVar.setOnClickListener(new org.telegram.ui.Components.sx0(22, activity, tL_collectibleInfo));
                linearLayout.addView(dVar, k7.c6.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
                if (dtVar != null) {
                    qh.d dVar2 = new qh.d(activity, g6Var2, true);
                    dVar2.setRoundRadius(24);
                    dVar2.d();
                    dVar2.g(LocaleController.getString(i10 == 0 ? R.string.FragmentUsernameCopy : R.string.FragmentPhoneCopy), false, true);
                    dVar2.setOnClickListener(new org.telegram.ui.Components.sx0(23, dtVar, h3Var2));
                    linearLayout.addView(dVar2, k7.c6.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
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
        SpannableStringBuilder replaceSingleTag2 = AndroidUtilities.replaceSingleTag(str4, dtVar);
        SpannableString spannableString2 = new SpannableString("TON");
        org.telegram.ui.Components.oq oqVar2 = new org.telegram.ui.Components.oq(R.drawable.mini_gram_16, 0);
        oqVar2.setWidth(AndroidUtilities.dp(13.0f));
        spannableString2.setSpan(oqVar2, 0, spannableString2.length(), 33);
        SpannableStringBuilder replaceCharSequence2 = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str62), spannableString2);
        org.telegram.ui.Components.g90 g90Var2 = new org.telegram.ui.Components.g90(activity, null);
        g90Var2.setTypeface(AndroidUtilities.bold());
        g90Var2.setGravity(17);
        int i122 = org.telegram.ui.ActionBar.k6.j5;
        g90Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i122, g6Var2));
        g90Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.o6, g6Var2));
        g90Var2.setTextSize(1, 16.0f);
        g90Var2.setText(replaceSingleTag2);
        linearLayout.addView(g90Var2, k7.c6.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout22 = new FrameLayout(activity);
        frameLayout22.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ci, g6Var2)));
        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(activity);
        p9Var2.setRoundRadius(AndroidUtilities.dp(28.0f));
        org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        z8Var2.p(tLObject);
        p9Var2.e(tLObject, z8Var2);
        frameLayout22.addView(p9Var2, k7.c6.e(28, 28, 51));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i122, g6Var2));
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(Emoji.replaceEmoji(str2, textView3.getPaint().getFontMetricsInt(), false));
        frameLayout22.addView(textView3, k7.c6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout22, k7.c6.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView22 = new TextView(activity);
        textView22.setGravity(17);
        b.l(i122, g6Var2, textView22, 1, 14.0f);
        textView22.setText(replaceCharSequence2);
        linearLayout.addView(textView22, k7.c6.t(-1, -2, 1, 32, 0, 32, 19));
        qh.d dVar3 = new qh.d(activity, g6Var2, true);
        dVar3.setRoundRadius(24);
        dVar3.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        dVar3.setOnClickListener(new org.telegram.ui.Components.sx0(22, activity, tL_collectibleInfo));
        linearLayout.addView(dVar3, k7.c6.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (dtVar != null) {
        }
        h3Var2.setCustomView(linearLayout);
        h3Var2.show();
    }
}
