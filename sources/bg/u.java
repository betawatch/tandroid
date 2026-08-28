package bg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vt;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class u {
    public static void a(org.telegram.ui.ActionBar.c2 c2Var, boolean z10) {
        dh.u uVar = c2Var.f;
        if (uVar != null) {
            uVar.setTextSize(1, 20);
        }
        vt vtVar = c2Var.n;
        if (vtVar != null) {
            vtVar.setTextSize(1, 14);
        }
        vt vtVar2 = c2Var.n;
        if (vtVar2 != null) {
            vtVar2.setLineSpacing(AndroidUtilities.dp(2.5f), 1.0f);
        }
        if (z10) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) c2Var.p0.getLayoutParams()).topMargin = AndroidUtilities.dp(-14.0f);
    }

    public static String b(MessageObject messageObject) {
        if (messageObject == null) {
            return "";
        }
        String forwardedName = messageObject.getForwardedName();
        if (forwardedName != null) {
            return forwardedName;
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-MessageObject.getPeerId(messageObject.messageOwner.peer_id)));
        return chat != null ? chat.title : "";
    }

    public static void c(TLRPC.TL_error tL_error, FrameLayout frameLayout, b6 b6Var, Runnable runnable) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null) {
            return;
        }
        if (!str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
            j(frameLayout.getContext(), tL_error);
            return;
        }
        String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumActivateErrorText", R.string.GiftPremiumActivateErrorText), f6.Gi, 0, runnable);
        oc ocVar = new oc(frameLayout, b6Var);
        int i9 = R.raw.chats_infotip;
        ocVar.M(LocaleController.getString(R.string.GiftPremiumActivateErrorTitle), AndroidUtilities.replaceCharSequence("%1$s", replaceSingleTag, AndroidUtilities.replaceTags("**" + format + "**")), i9).j();
        try {
            frameLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void d(boolean z10, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, b6 b6Var) {
        String str2;
        char c10;
        int i9 = tL_messageMediaGiveaway.quantity;
        String formatPluralString = LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway.months, new Object[0]);
        String format = LocaleController.getInstance().getFormatterGiveawayMonthDay().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = LocaleController.getInstance().getFormatterDay().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        String format3 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        boolean z11 = tL_messageMediaGiveaway.channels.size() > 1;
        boolean z12 = (tL_messageMediaGiveaway.flags & 32) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        String string = LocaleController.getString("BoostingGiveAwayAbout", R.string.BoostingGiveAwayAbout);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            str2 = format;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z10 ? "BoostingStarsGiveawayHowItWorksText" : "BoostingStarsGiveawayHowItWorksTextGroup", (int) tL_messageMediaGiveaway.stars, str)));
            c10 = 0;
        } else {
            str2 = format;
            c10 = 0;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString(z10 ? "BoostingGiveawayHowItWorksText" : "BoostingGiveawayHowItWorksTextGroup", i9, str, Integer.valueOf(i9), formatPluralString)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str3 = tL_messageMediaGiveaway.prize_description;
        if (str3 != null && !str3.isEmpty()) {
            String str4 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[c10] = str;
            objArr[1] = str4;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksIncludeText", i9, objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                int size = tL_messageMediaGiveaway.channels.size() - 1;
                Object[] objArr2 = new Object[2];
                objArr2[c10] = format2;
                objArr2[1] = format3;
                String formatPluralString2 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral2", size, objArr2);
                Integer valueOf = Integer.valueOf(i9);
                Object[] objArr3 = new Object[4];
                objArr3[c10] = str2;
                objArr3[1] = valueOf;
                objArr3[2] = str;
                objArr3[3] = formatPluralString2;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral1", i9, objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i9);
                Object[] objArr4 = new Object[5];
                objArr4[c10] = str2;
                objArr4[1] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDate", i9, objArr4)));
            }
        } else if (z11) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral1", i9, str2, Integer.valueOf(i9), str, LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral2", tL_messageMediaGiveaway.channels.size() - 1, new Object[0]))));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubText", i9, str2, Integer.valueOf(i9), str)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (!tL_payments_giveawayInfo.participating) {
            String str5 = tL_payments_giveawayInfo.disallowed_country;
            if (str5 != null && !str5.isEmpty()) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayNotEligibleCountry", R.string.BoostingGiveawayNotEligibleCountry)));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.BoostingGiveawayNotEligibleAdmin : R.string.BoostingGiveawayNotEligibleAdminGroup, chat != null ? chat.title : "")));
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayNotEligible", R.string.BoostingGiveawayNotEligible, LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(tL_payments_giveawayInfo.joined_too_early_date * 1000)))));
            } else if (z11) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayTakePartMultiPlural", tL_messageMediaGiveaway.channels.size() - 1, str, str2)));
            } else {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayTakePart", R.string.BoostingGiveawayTakePart, str, str2)));
            }
        } else if (z11) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayParticipantMultiPlural", tL_messageMediaGiveaway.channels.size() - 1, str)));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayParticipant", R.string.BoostingGiveawayParticipant, str)));
        }
        c2Var.P = spannableStringBuilder;
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new a9.b(7));
        a(alertDialog$Builder.o(), false);
    }

    public static void e(boolean z10, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, b6 b6Var) {
        String str2;
        char c10;
        String string;
        if (tL_messageMediaGiveaway.until_date == 0) {
            tL_messageMediaGiveaway.until_date = tL_payments_giveawayInfoResults.finish_date;
        }
        int i9 = tL_messageMediaGiveaway.quantity;
        String formatPluralString = LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway.months, new Object[0]);
        String format = LocaleController.getInstance().getFormatterGiveawayMonthDay().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = LocaleController.getInstance().getFormatterDay().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        boolean z11 = tL_messageMediaGiveaway.channels.size() > 1;
        boolean z12 = (tL_messageMediaGiveaway.flags & 32) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        String string2 = LocaleController.getString("BoostingGiveawayEnd", R.string.BoostingGiveawayEnd);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            str2 = format;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z10 ? "BoostingStarsGiveawayHowItWorksTextEnd" : "BoostingStarsGiveawayHowItWorksTextEndGroup", (int) tL_messageMediaGiveaway.stars, str)));
            c10 = 1;
        } else {
            str2 = format;
            c10 = 1;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString(z10 ? "BoostingGiveawayHowItWorksTextEnd" : "BoostingGiveawayHowItWorksTextEndGroup", i9, str, Integer.valueOf(i9), formatPluralString)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str3 = tL_messageMediaGiveaway.prize_description;
        if (str3 != null && !str3.isEmpty()) {
            String str4 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str4;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksIncludeText", i9, objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                int size = tL_messageMediaGiveaway.channels.size() - 1;
                Object[] objArr2 = new Object[2];
                objArr2[0] = format2;
                objArr2[c10] = format3;
                String formatPluralString2 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral2", size, objArr2);
                Integer valueOf = Integer.valueOf(i9);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[c10] = valueOf;
                objArr3[2] = str;
                objArr3[3] = formatPluralString2;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", i9, objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i9);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[c10] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateEnd", i9, objArr4)));
            }
        } else if (z11) {
            String formatPluralString3 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral2", tL_messageMediaGiveaway.channels.size() - 1, new Object[0]);
            Integer valueOf3 = Integer.valueOf(i9);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[c10] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = formatPluralString3;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveralEnd1", i9, objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i9);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[c10] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextEnd", i9, objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i10 = tL_payments_giveawayInfoResults.activated_count;
        if (i10 > 0) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayUsedLinksPlural", i10, new Object[0])));
        }
        int i11 = 7;
        if (tL_payments_giveawayInfoResults.refunded) {
            String string3 = LocaleController.getString("BoostingGiveawayCanceledByPayment", R.string.BoostingGiveawayCanceledByPayment);
            TextView g10 = org.telegram.messenger.l0.g(context, 1, 14.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setGravity(17);
            g10.setText(string3);
            int i12 = f6.p7;
            g10.setTextColor(f6.v0(i12, b6Var));
            g10.setBackground(f6.c0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), f6.l1(0.1f, f6.v0(i12, b6Var))));
            g10.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            c2Var.c = g10;
            c2Var.P = spannableStringBuilder;
            alertDialog$Builder.k(LocaleController.getString("Close", R.string.Close), new a9.b(i11));
            a(alertDialog$Builder.o(), true);
            return;
        }
        c2Var.P = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            string = LocaleController.getString(R.string.BoostingGiveawayYouWon);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.k(LocaleController.getString("BoostingGiveawayViewPrize", R.string.BoostingGiveawayViewPrize), new a1.c(tL_payments_giveawayInfoResults, 3));
            }
            alertDialog$Builder.h(LocaleController.getString("Close", R.string.Close), new a9.b(i11));
        } else {
            string = LocaleController.getString("BoostingGiveawayYouNotWon", R.string.BoostingGiveawayYouNotWon);
            alertDialog$Builder.k(LocaleController.getString("Close", R.string.Close), new a9.b(i11));
        }
        vt vtVar = new vt(context);
        NotificationCenter.listenEmojiLoading(vtVar);
        vtVar.setTextColor(f6.v0(f6.j5, b6Var));
        vtVar.setTextSize(1, 14.0f);
        vtVar.setGravity(17);
        vtVar.setText(string);
        vtVar.setBackground(f6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f6.v0(f6.yh, b6Var)));
        vtVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f));
        c2Var.d = vtVar;
        a(alertDialog$Builder.o(), false);
    }

    public static void f(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.Chat chat, boolean z10) {
        if (o2Var == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new d(oc.a0(o2Var), z10, chat, o2Var.getResourceProvider(), 0), 300L);
    }

    public static void g(int i9) {
        String str;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (i9 < 60) {
            str = LocaleController.formatPluralString("Seconds", i9, new Object[0]);
        } else if (i9 < 3600) {
            str = LocaleController.formatPluralString("Minutes", i9 / 60, new Object[0]);
        } else {
            int i10 = (i9 / 60) / 60;
            if (i10 > 2) {
                str = LocaleController.formatPluralString("Hours", i10, new Object[0]);
            } else {
                str = LocaleController.formatPluralString("Hours", i10, new Object[0]) + " " + LocaleController.formatPluralString("Minutes", i9 % 60, new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
        String string = LocaleController.getString(R.string.CantBoostTooOften);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("CantBoostTooOftenDescription", R.string.CantBoostTooOftenDescription, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new a9.b(11));
        alertDialog$Builder.o();
    }

    public static void h(long j10) {
        SpannableStringBuilder replaceTags;
        if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingGiftLinkForwardedToSavedMsg));
        } else if (DialogObject.isChatDialog(j10)) {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiftLinkForwardedTo", R.string.BoostingGiftLinkForwardedTo, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10)).title));
        } else {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiftLinkForwardedTo", R.string.BoostingGiftLinkForwardedTo, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10)))));
        }
        AndroidUtilities.runOnUIThread(new af.e(replaceTags, 8), 450L);
    }

    public static void i(long j10, zf.j0 j0Var) {
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
        String string = LocaleController.getString(R.string.BoostingMoreBoostsNeeded);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGetMoreBoostByGiftingCount", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat.title));
        alertDialog$Builder.h(LocaleController.getString("GiftPremium", R.string.GiftPremium), new e(j0Var, 0));
        alertDialog$Builder.k(LocaleController.getString("Close", R.string.Close), new a9.b(7));
        alertDialog$Builder.o();
    }

    public static void j(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null || TextUtils.isEmpty(str)) {
            return;
        }
        Toast.makeText(context, tL_error.text, 1).show();
    }
}
