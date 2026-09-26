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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class d20 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity, int i10, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.d6 d6Var) {
        String str2;
        String str3;
        org.telegram.ui.ActionBar.e3 e3Var;
        String formatString;
        String b10;
        String str4;
        String str5;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.e3 e3Var2;
        org.telegram.ui.Components.f21 f21Var;
        org.telegram.ui.ActionBar.e3 e3Var3 = new org.telegram.ui.ActionBar.e3(1, (Context) activity, d6Var, false);
        e3Var3.fixNavigationBar(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, d6Var));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
        linearLayout.addView(frameLayout, w7.y5.t(80, 80, 1, 0, 16, 0, 16));
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
        frameLayout.addView(lj0Var, w7.y5.q(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str3 = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = "";
                String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                if (i10 != 0) {
                    e3Var = e3Var3;
                    String formatString2 = LocaleController.formatString(R.string.FragmentUsernameTitle, v7.j.g("@", str));
                    formatString = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : a4.a.q("(", formatCurrency, ")"));
                    b10 = a4.a.r(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
                    str4 = formatString2;
                } else {
                    e3Var = e3Var3;
                    if (i10 != 1) {
                        return;
                    }
                    String formatString3 = LocaleController.formatString(R.string.FragmentPhoneTitle, gf.b.c().b("+" + str));
                    formatString = LocaleController.formatString(R.string.FragmentPhoneMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : a4.a.q("(", formatCurrency, ")"));
                    b10 = gf.b.c().b("+" + str);
                    str4 = formatString3;
                }
                String str6 = formatString;
                str5 = b10;
                if (str5 == null) {
                    d6Var2 = d6Var;
                    org.telegram.ui.ActionBar.e3 e3Var4 = e3Var;
                    f21Var = new org.telegram.ui.Components.f21(str5, i10, e3Var4, d6Var2, 2);
                    e3Var2 = e3Var4;
                } else {
                    d6Var2 = d6Var;
                    e3Var2 = e3Var;
                    f21Var = null;
                }
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(str4, f21Var);
                SpannableString spannableString = new SpannableString("TON");
                org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(R.drawable.mini_gram_16, 0);
                pqVar.setWidth(AndroidUtilities.dp(13.0f));
                spannableString.setSpan(pqVar, 0, spannableString.length(), 33);
                SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str6), spannableString);
                org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(activity, null);
                n90Var.setTypeface(AndroidUtilities.bold());
                n90Var.setGravity(17);
                int i12 = org.telegram.ui.ActionBar.h6.j5;
                n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var2));
                n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.o6, d6Var2));
                n90Var.setTextSize(1, 16.0f);
                n90Var.setText(replaceSingleTag);
                linearLayout.addView(n90Var, w7.y5.t(-1, -2, 1, 42, 0, 42, 0));
                FrameLayout frameLayout2 = new FrameLayout(activity);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ci, d6Var2)));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
                w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                h9Var.p(tLObject);
                w9Var.e(tLObject, h9Var);
                frameLayout2.addView(w9Var, w7.y5.e(28, 28, 51));
                TextView textView = new TextView(activity);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var2));
                textView.setTextSize(1, 13.0f);
                textView.setSingleLine();
                textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                frameLayout2.addView(textView, w7.y5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
                linearLayout.addView(frameLayout2, w7.y5.t(-2, 28, 1, 42, 10, 42, 18));
                TextView textView2 = new TextView(activity);
                textView2.setGravity(17);
                org.telegram.messenger.ok.n(i12, d6Var2, textView2, 1, 14.0f);
                textView2.setText(replaceCharSequence);
                linearLayout.addView(textView2, w7.y5.t(-1, -2, 1, 32, 0, 32, 19));
                ci.d dVar = new ci.d(activity, d6Var2, true);
                dVar.setRoundRadius(24);
                dVar.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
                dVar.setOnClickListener(new ov(7, activity, tL_collectibleInfo));
                linearLayout.addView(dVar, w7.y5.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
                if (f21Var != null) {
                    ci.d dVar2 = new ci.d(activity, d6Var2, true);
                    dVar2.setRoundRadius(24);
                    dVar2.d();
                    dVar2.g(LocaleController.getString(i10 == 0 ? R.string.FragmentUsernameCopy : R.string.FragmentPhoneCopy), false, true);
                    dVar2.setOnClickListener(new ov(8, f21Var, e3Var2));
                    linearLayout.addView(dVar2, w7.y5.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
                }
                e3Var2.setCustomView(linearLayout);
                e3Var2.show();
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
        SpannableStringBuilder replaceSingleTag2 = AndroidUtilities.replaceSingleTag(str4, f21Var);
        SpannableString spannableString2 = new SpannableString("TON");
        org.telegram.ui.Components.pq pqVar2 = new org.telegram.ui.Components.pq(R.drawable.mini_gram_16, 0);
        pqVar2.setWidth(AndroidUtilities.dp(13.0f));
        spannableString2.setSpan(pqVar2, 0, spannableString2.length(), 33);
        SpannableStringBuilder replaceCharSequence2 = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str62), spannableString2);
        org.telegram.ui.Components.n90 n90Var2 = new org.telegram.ui.Components.n90(activity, null);
        n90Var2.setTypeface(AndroidUtilities.bold());
        n90Var2.setGravity(17);
        int i122 = org.telegram.ui.ActionBar.h6.j5;
        n90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i122, d6Var2));
        n90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.o6, d6Var2));
        n90Var2.setTextSize(1, 16.0f);
        n90Var2.setText(replaceSingleTag2);
        linearLayout.addView(n90Var2, w7.y5.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout22 = new FrameLayout(activity);
        frameLayout22.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ci, d6Var2)));
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(activity);
        w9Var2.setRoundRadius(AndroidUtilities.dp(28.0f));
        org.telegram.ui.Components.h9 h9Var2 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var2.p(tLObject);
        w9Var2.e(tLObject, h9Var2);
        frameLayout22.addView(w9Var2, w7.y5.e(28, 28, 51));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.v0(i122, d6Var2));
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(Emoji.replaceEmoji(str2, textView3.getPaint().getFontMetricsInt(), false));
        frameLayout22.addView(textView3, w7.y5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout22, w7.y5.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView22 = new TextView(activity);
        textView22.setGravity(17);
        org.telegram.messenger.ok.n(i122, d6Var2, textView22, 1, 14.0f);
        textView22.setText(replaceCharSequence2);
        linearLayout.addView(textView22, w7.y5.t(-1, -2, 1, 32, 0, 32, 19));
        ci.d dVar3 = new ci.d(activity, d6Var2, true);
        dVar3.setRoundRadius(24);
        dVar3.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        dVar3.setOnClickListener(new ov(7, activity, tL_collectibleInfo));
        linearLayout.addView(dVar3, w7.y5.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (f21Var != null) {
        }
        e3Var2.setCustomView(linearLayout);
        e3Var2.show();
    }
}
