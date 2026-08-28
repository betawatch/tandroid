package gh;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c70;
import org.telegram.ui.ho;
import org.telegram.ui.qn;
import org.telegram.ui.ta1;
import org.telegram.ui.w10;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class oa extends x10 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat d0;
    public static DecimalFormat e0;
    public FrameLayout L;
    public ag.j M;
    public na N;
    public fh.l2 O;
    public c00 P;
    public LinearLayout Q;
    public SpannableStringBuilder R;
    public org.telegram.ui.Components.j6 S;
    public TextView T;
    public kh.d U;
    public fh.d2 V;
    public kh.d W;
    public ta1 X;
    public kh.d Y;
    public kh.d Z;
    public boolean a0;
    public boolean b0;
    public o9 c0;

    public oa() {
        this.I = true;
    }

    public static /* synthetic */ void A0(oa oaVar, Context context) {
        if (MessagesController.getInstance(oaVar.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(oaVar.currentAccount);
        } else {
            new fa(context, oaVar.resourceProvider).show();
        }
    }

    public static void E0(wy0 wy0Var, int i9, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.b6 b6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((ty0) wy0Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        q80 q80Var = new q80(textView, AndroidUtilities.dp(90.0f), 0, b6Var);
        q80Var.a(org.telegram.ui.ActionBar.f6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.f6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(q80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                int i10 = starGift.availability_remains;
                textView.setText(i10 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i10, LocaleController.formatNumber(starGift.availability_total, ',')));
                return;
            }
            if (starGift.availability_remains <= 0) {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
            return;
        }
        final v7 y10 = v7.y(i9, false);
        final long j10 = starGift.id;
        final bg.i iVar = new bg.i(textView, 16);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() { // from class: gh.b7
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                int i13;
                v7 v7Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i11 != (i13 = NotificationCenter.starGiftsLoaded) || (J = (v7Var = v7.this).J(j10)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(v7Var.a).removeObserver(notificationCenterDelegateArr[0], i13);
                iVar.run(J);
            }
        };
        int i11 = y10.a;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
        int i12 = NotificationCenter.starGiftsLoaded;
        notificationCenter.addObserver(notificationCenterDelegate, i12);
        TL_stars.StarGift J = y10.J(j10);
        if (J != null) {
            zArr[0] = true;
            NotificationCenter.getInstance(i11).removeObserver(notificationCenterDelegateArr[0], i12);
            iVar.run(J);
        }
    }

    public static void F0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new l9(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder H0(TL_stars.StarsAmount starsAmount) {
        return I0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i9;
        if (e0 == null) {
            e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(starsAmount.negative() ? "-" : "");
                sb2.append(LocaleController.formatNumber(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
            String format = e0.format(j10 / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            boolean z10 = false;
            if (i10 < 0 && j11 > 0) {
                d = 1.0E9d;
                i9 = -1;
            } else if (i10 <= 0 || j11 >= 0) {
                d = 1.0E9d;
                i9 = 0;
            } else {
                d = 1.0E9d;
                i9 = 1;
            }
            long j12 = i9 + j11;
            if (j11 != 0 ? j11 < 0 : i10 < 0) {
                z10 = true;
            }
            if (i10 == 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(LocaleController.formatNumber(Math.abs(j12), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(LocaleController.formatNumber(Math.abs(j12), c10));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = e0;
            int i11 = starsAmount.nanos;
            double d9 = i11;
            if (i11 < 0) {
                d9 += d;
            }
            String format2 = decimalFormat.format(d9 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
        double d;
        int i9;
        if (e0 == null) {
            e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = e0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i10 = starsAmount.nanos;
            if (i10 < 0 && j10 > 0) {
                i9 = -1;
                d = 1.0E9d;
            } else if (i10 <= 0 || j10 >= 0) {
                d = 1.0E9d;
                i9 = 0;
            } else {
                d = 1.0E9d;
                i9 = 1;
            }
            long j11 = i9 + j10;
            boolean z10 = j10 != 0 ? j10 < 0 : i10 < 0;
            if (Math.abs(j11) > 1000 || starsAmount.nanos == 0) {
                if (starsAmount.amount <= 1000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(z10 ? "-" : "");
                    sb2.append(LocaleController.formatNumber(Math.abs(j11), c10));
                    spannableStringBuilder.append((CharSequence) sb2.toString());
                    return spannableStringBuilder;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(AndroidUtilities.formatWholeNumber((int) Math.abs(j11), 0));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(LocaleController.formatNumber(Math.abs(j11), c10));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = e0;
            int i11 = starsAmount.nanos;
            double d9 = i11;
            if (i11 < 0) {
                d9 += d;
            }
            String format2 = decimalFormat.format(d9 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                String substring = format2.substring(indexOf2);
                if (substring.length() > 1) {
                    spannableStringBuilder.append((CharSequence) substring.substring(0, Math.min(substring.length(), 3)));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i9;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (e0 == null) {
                e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = e0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = starsAmount.amount;
        int i10 = starsAmount.nanos;
        boolean z10 = false;
        if (i10 < 0 && j10 > 0) {
            i9 = -1;
            d = 1.0E9d;
        } else if (i10 <= 0 || j10 >= 0) {
            d = 1.0E9d;
            i9 = 0;
        } else {
            d = 1.0E9d;
            i9 = 1;
        }
        long j11 = i9 + j10;
        if (j10 != 0 ? j10 < 0 : i10 < 0) {
            z10 = true;
        }
        if (i10 == 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", (int) j10));
            return spannableStringBuilder;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "-" : "");
        sb2.append(LocaleController.formatNumber(Math.abs(j11), ','));
        spannableStringBuilder.append((CharSequence) sb2.toString());
        if (e0 == null) {
            e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        DecimalFormat decimalFormat = e0;
        int i11 = starsAmount.nanos;
        double d9 = i11;
        if (i11 < 0) {
            d9 += d;
        }
        String format2 = decimalFormat.format(d9 / d);
        int indexOf2 = format2.indexOf(".");
        if (indexOf2 >= 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StarsNano));
        return spannableStringBuilder;
    }

    public static String M0(long j10) {
        if (d0 == null) {
            d0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return d0.format(j10 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10 < 0 ? "-" : "");
        sb2.append(LocaleController.formatNumber(Math.abs(j10 / 1000000000), ','));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0184, code lost:
    
        r5 = org.telegram.messenger.R.string.StarsTransactionFragment;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String N0(int i9, boolean z10, TL_stars.StarsTransaction starsTransaction) {
        if (starsTransaction.stargift_drop_original_details) {
            return LocaleController.getString(R.string.StarsTransactionRemovedDescription);
        }
        if (starsTransaction.posts_search) {
            return LocaleController.getString(R.string.StarsTransactionPostsSearch);
        }
        if (starsTransaction.premium_gift) {
            return LocaleController.getString(R.string.StarsTransactionPremiumGift);
        }
        if (starsTransaction.phonegroup_message) {
            return LocaleController.getString(starsTransaction.reaction ? R.string.StarsTransactionLiveStoryReactionFee : R.string.StarsTransactionLiveStoryMessageFee);
        }
        if (starsTransaction.paid_message) {
            return LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return LocaleController.getString(R.string.StarsTransactionFloodskip);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return LocaleController.getString(R.string.StarMediaPurchase);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        int i10 = starsTransaction.flags;
        if ((131072 & i10) == 0 && (65536 & i10) != 0) {
            return LocaleController.formatString(R.string.StarTransactionCommission, mh.l.F0(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return LocaleController.getString(R.string.Gift2TransactionPrepaidUpgrade);
            }
            if (starsTransaction.refund) {
                return LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionRefundedAuctionBid : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent : R.string.Gift2TransactionRefundedConverted);
            }
            return LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionAuctionBid : starsAmount.amount > 0 ? R.string.Gift2TransactionConverted : starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent);
        }
        if (starsTransaction.subscription) {
            int i11 = starsTransaction.subscription_period;
            if (i11 == 2592000) {
                return LocaleController.getString(R.string.StarSubscriptionPurchase);
            }
            if (i11 == 300) {
                return "5-minute subscription fee";
            }
            if (i11 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i10 & 8192) != 0) {
            return LocaleController.getString(R.string.StarsGiveawayPrizeReceived);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return LocaleController.getString(UserObject.isUserSelf(MessagesController.getInstance(i9).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction.sent_by)))) ? R.string.StarsGiftSent : R.string.StarsGiftReceived);
            }
            return LocaleController.getString(R.string.StarsGiftReceived);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
        if (peerDialogId != 0) {
            if (peerDialogId >= 0) {
                return UserObject.getUserName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(peerDialogId)));
            }
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-peerDialogId));
            return chat == null ? "" : chat.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? LocaleController.getString(R.string.StarsTransactionBot) : starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds ? LocaleController.getString(R.string.StarsTransactionAds) : LocaleController.getString(R.string.StarsTransactionUnsupported);
        }
        if (!z10) {
            if (starsTransaction.refund) {
            }
            return LocaleController.getString(r5);
        }
        int i12 = R.string.StarsTransactionWithdrawFragment;
        return LocaleController.getString(i12);
    }

    public static SpannableStringBuilder O0(CharSequence charSequence, float f10) {
        return P0(charSequence, f10, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder P0(CharSequence charSequence, float f10, float f11, float f12) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        eq eqVar = new eq(R.drawable.diamond, 0);
        eqVar.recolorDrawable = false;
        eqVar.translate(0.0f, f11);
        eqVar.spaceScaleX = f12;
        eqVar.setScale(f10, f10);
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence) {
        return R0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f10, eq[] eqVarArr) {
        return U0(false, charSequence, f10, eqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z10) {
        return U0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z10, CharSequence charSequence, float f10, eq[] eqVarArr, float f11, float f12) {
        eq eqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (eqVarArr == null || (eqVar = eqVarArr[0]) == null) {
            eqVar = new eq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (eqVarArr != null) {
                eqVarArr[0] = eqVar;
            }
        }
        eqVar.translate(0.0f, f11);
        eqVar.spaceScaleX = f12;
        if (z10) {
            float f13 = f10 * 0.2f;
            eqVar.setScale(f13, f13);
        } else {
            eqVar.setScale(f10, f10);
        }
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z10, String str, eq[] eqVarArr) {
        eq eqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (eqVarArr == null || (eqVar = eqVarArr[0]) == null) {
            eqVar = new eq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            eqVar.setScale(z10 ? 0.222f : 1.13f, z10 ? 0.222f : 1.13f);
        }
        if (eqVarArr != null) {
            eqVarArr[0] = eqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, eq[] eqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, eqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f10, eq[] eqVarArr) {
        eq eqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i9 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (eqVarArr == null || (eqVar = eqVarArr[0]) == null) {
            if (eqVarArr == null || eqVarArr.length <= 0) {
                eqVar = new eq(i9, 0);
            } else {
                eqVar = new eq(i9, 0);
                eqVarArr[0] = eqVar;
            }
        }
        if (z10) {
            f10 *= 0.33f;
        } else {
            eqVar.recolorDrawable = false;
        }
        eqVar.setScale(f10, f10);
        spannableString.setSpan(eqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static o8 Y0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final m8 m8Var = new m8(z10, currentAccount, str, imageReceiver, new boolean[1]);
        m8Var.run();
        final int i9 = 0;
        final int i10 = 1;
        return new o8(NotificationCenter.getInstance(currentAccount).listen(view, z10 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: gh.n8
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i9) {
                    case 0:
                        m8Var.run();
                        break;
                    default:
                        m8Var.run();
                        break;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: gh.n8
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        m8Var.run();
                        break;
                    default:
                        m8Var.run();
                        break;
                }
            }
        }), 0);
    }

    public static void Z0(ImageReceiver imageReceiver, TLRPC.Document document, int i9) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i9);
        imageReceiver.setImage(ImageLocation.getForDocument(document), e2.c.l(i9, "_", i9), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.l(i9, "_", i9), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.a7, 0.35f), 0L, null, null, 0);
    }

    public static void a1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i9) {
        Z0(imageReceiver, starGift == null ? null : starGift.getDocument(), i9);
    }

    public static void b1(org.telegram.ui.Components.o9 o9Var, ImageReceiver imageReceiver, long j10) {
        Y0(o9Var, imageReceiver, j10 <= 1000 ? "2⃣" : j10 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static o8 c1(org.telegram.ui.Components.o9 o9Var, ImageReceiver imageReceiver, int i9) {
        return Y0(o9Var, imageReceiver, i9 != 3 ? i9 != 6 ? i9 != 12 ? i9 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void d1(org.telegram.ui.Components.o9 o9Var, ImageReceiver imageReceiver, long j10) {
        Y0(o9Var, imageReceiver, j10 <= 10000000000L ? "2⃣" : j10 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void e1(Context context, int i9, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.b6 b6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 j11 = ll.j(context, b6Var, false, false);
        LinearLayout f10 = ll.f(context, 1);
        f10.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, g7.e6.t(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 7, 0, 0, 0, 10));
        n9 n9Var = new n9(context, 70, 0);
        frameLayout.addView(n9Var, g7.e6.c(-1.0f, -1));
        int i10 = 2;
        ag.j jVar = new ag.j(context, 1, 2);
        ag.a aVar = jVar.b;
        aVar.w = org.telegram.ui.ActionBar.f6.fk;
        aVar.x = org.telegram.ui.ActionBar.f6.gk;
        aVar.b();
        jVar.setStarParticlesView(n9Var);
        frameLayout.addView(jVar, g7.e6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        jVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.j5, b6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView h = j3.r0.h(f10, textView, g7.e6.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(20.0f), -6915073));
        h.setTextColor(-1);
        h.setTextSize(1, 11.33f);
        h.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        h.setGravity(17);
        h.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i11 = boost.multiplier;
        if (i11 == 0) {
            i11 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i11));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        eq eqVar = new eq(R.drawable.mini_boost_badge, 2);
        eqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
        h.setText(spannableStringBuilder);
        f10.addView(h, g7.e6.t(-2, 20, 17, 20, 4, 20, 4));
        wy0 wy0Var = new wy0(context, b6Var);
        wy0Var.k(LocaleController.getString(R.string.BoostFrom), i9, j10, new y7(f3VarArr, j10, i10));
        wy0Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            e5.w wVar = new e5.w(f3VarArr, j10, boost, 4);
            f3VarArr = f3VarArr;
            wy0Var.g(string, string2, wVar);
        }
        wy0Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        wy0Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        f10.addView(wy0Var, g7.e6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        l80 l80Var = new l80(context, b6Var);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.f(context, 7)));
        l80Var.setGravity(17);
        f10.addView(l80Var, g7.e6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new e8(f3VarArr, 1));
        f10.addView(dVar, g7.e6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        j11.customView = f10;
        f3VarArr[0] = j11;
        j11.useBackgroundTopPadding = false;
        j11.fixNavigationBar();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            f3VarArr[0].makeAttached(U);
        }
        jVar.setPaused(false);
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new fh.o1(jVar, 16));
    }

    public static x0 f1(Context context, int i9, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.b6 b6Var) {
        gf.b bVar = gf.b.a;
        x0 x0Var = new x0(context, b6Var, i9, tL_starGiftUnique == null ? gf.a.g(MessagesController.getInstance(i9).config.starsStarGiftResaleAmountMin.get(), bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(gf.b.b) : tL_starGiftUnique.getResellAmount(bVar), new fh.f1(8, callback2, r8));
        x0[] x0VarArr = {x0Var};
        x0Var.show();
        return x0VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.b6 b6Var) {
        kh.d dVar;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        Object[] objArr = 0;
        org.telegram.ui.ActionBar.f3 j11 = ll.j(context, b6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        linearLayout.addView(textView, g7.e6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        fc0 fc0Var = new fc0(context, b6Var);
        fc0Var.setForceForceUseCenter(true);
        fc0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        fc0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        int i10 = 2;
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.uf, b6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vf, b6Var));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new q8(fc0Var, editTextBoldCursor, objArr == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, g7.e6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, g7.e6.o(-1, -2, 1.0f, 119));
        fc0Var.e(editTextBoldCursor);
        fc0Var.addView(linearLayout2, g7.e6.e(-1, -2, 48));
        linearLayout.addView(fc0Var, g7.e6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A6, false));
        fc0Var.addView(textView2, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        l80 l80Var = new l80(context, null);
        l80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new e2.f(context, 8)), true));
        l80Var.setTextSize(1, 12.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var));
        linearLayout.addView(l80Var, g7.e6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final kh.d i11 = ll.i(24, context, b6Var, true);
        i11.g(LocaleController.getString(j10 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(i11, g7.e6.n(-1, 48));
        if (j10 <= 0 || !z10) {
            dVar = null;
        } else {
            dVar = ll.i(24, context, b6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, g7.e6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        j11.customView = linearLayout;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2 = {j11};
        editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
        editTextBoldCursor.addTextChangedListener(new m9(editTextBoldCursor, fc0Var, j10, z10, i11, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gh.r8
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i12, KeyEvent keyEvent) {
                if (i12 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                i11.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new t8(editTextBoldCursor2, f3VarArr2, 2));
                return true;
            }
        });
        i11.setOnClickListener(new s8(zArr, callback2, editTextBoldCursor, i11, f3VarArr2));
        if (dVar != null) {
            kh.d dVar2 = dVar;
            f3VarArr = f3VarArr2;
            dVar2.setOnClickListener(new s8(zArr, callback2, dVar2, editTextBoldCursor, f3VarArr2));
        } else {
            f3VarArr = f3VarArr2;
        }
        f3VarArr[0].fixNavigationBar();
        f3VarArr[0].setOnDismissListener(new eh.l(editTextBoldCursor, i10));
        f3VarArr[0].show();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new t8(f3VarArr, editTextBoldCursor), R instanceof qn ? ((qn) R).P9() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0fad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0fe3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x102b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x1088  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x10c0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x10e2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x10cb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x1092  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x1076  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0e9e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0da9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0db7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0dc8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0e6c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0ea4 A[LOOP:0: B:68:0x0e17->B:77:0x0ea4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0eb0 A[EDGE_INSN: B:78:0x0eb0->B:79:0x0eb0 BREAK  A[LOOP:0: B:68:0x0e17->B:77:0x0ea4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0f27 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f39  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0f3c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0f4c  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.f3 h1(final Context context, final boolean z10, final long j10, final int i9, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.b6 b6Var) {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        boolean z11;
        Context context2;
        int i10;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z12;
        char c10;
        boolean z13;
        long j11;
        org.telegram.ui.ActionBar.b6 b6Var2;
        TLRPC.Peer peer;
        long j12;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        int i11;
        String str2;
        org.telegram.ui.ActionBar.f3[] f3VarArr2;
        float f10;
        int i12;
        String string;
        TL_stars.StarGift starGift;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.b6 b6Var3;
        int i13;
        org.telegram.ui.ActionBar.f3[] f3VarArr3;
        TL_stars.StarsTransaction starsTransaction3;
        Context context3;
        final org.telegram.ui.ActionBar.f3[] f3VarArr4;
        wy0 wy0Var;
        wy0 wy0Var2;
        wy0 wy0Var3;
        wy0 wy0Var4;
        wy0 wy0Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z14;
        TL_stars.StarGift starGift2;
        Context context4;
        org.telegram.ui.ActionBar.o2 U;
        TLRPC.Chat chat;
        int i14;
        ImageLocation imageLocation2;
        ImageLocation forDocument2;
        final Context context5;
        wy0 wy0Var6;
        wy0 wy0Var7;
        final int i15;
        wy0 wy0Var8;
        final org.telegram.ui.ActionBar.f3[] f3VarArr5;
        long j13;
        wy0 wy0Var9;
        String str3;
        TL_stars.StarsAmount starsAmount;
        wy0 wy0Var10;
        wy0 wy0Var11;
        TL_stars.StarsTransaction starsTransaction4;
        ViewGroup viewGroup2;
        int i16;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z15 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i17 = starsTransaction.flags;
        boolean z16 = (i17 & 8192) != 0;
        boolean z17 = ((131072 & i17) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z18 = (z17 || (i17 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        org.telegram.ui.ActionBar.f3 j14 = ll.j(context, b6Var, false, false);
        org.telegram.ui.ActionBar.f3[] f3VarArr6 = new org.telegram.ui.ActionBar.f3[1];
        final LinearLayout f11 = ll.f(context, 1);
        f11.setPadding(0, AndroidUtilities.dp((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        f11.setClipChildren(false);
        f11.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                f3VarArr = f3VarArr6;
                f3Var = j14;
                r9 r9Var = new r9(context, matrix, radialGradient, paint, i5Var);
                i5Var.l(r9Var);
                i5Var.i(stargiftattributepattern.document, false);
                r9Var.setOrientation(1);
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                a1(o9Var.getImageReceiver(), starsTransaction.stargift, 160);
                r9Var.addView(o9Var, g7.e6.t(160, 160, 17, 0, 20, 0, 0));
                if (TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    i16 = 2;
                } else {
                    g7.g6.a(o9Var);
                    i16 = 2;
                    o9Var.setOnClickListener(new fh.a3(context, i9, tL_starGiftUnique, i16));
                }
                TextView b10 = g7.i6.b(context, 20.0f, 0, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                r9Var.addView(b10, g7.e6.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = g7.i6.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                r9Var.addView(b11, g7.e6.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = g7.i6.b(context, 18.0f, 0, true, null);
                b12.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                str2 = positive ? "+" : "";
                SpannableStringBuilder H0 = H0(starsAmount3);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = str2;
                charSequenceArr[1] = H0;
                charSequenceArr[i16] = " ⭐️";
                b12.setText(T0(starsAmount3, TextUtils.concat(charSequenceArr)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b12.getText());
                if (starsTransaction.refund) {
                    F0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction.failed) {
                    F0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction.pending) {
                    F0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsPending));
                }
                b12.setText(spannableStringBuilder);
                r9Var.addView(b12, g7.e6.t(-2, -2, 17, 0, 11, 0, 17));
                f11.addView(r9Var, g7.e6.n(-1, -2));
                b6Var2 = b6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = f11;
                str = "";
                z12 = z18;
                f3VarArr2 = f3VarArr;
                f10 = 16.0f;
                wy0 wy0Var12 = new wy0(context2, b6Var2);
                starGift = starsTransaction2.stargift;
                int i18 = 6;
                if (starGift != null) {
                    TL_stars.StarsTransaction starsTransaction5 = starsTransaction2;
                    viewGroup = linearLayout;
                    wy0 wy0Var13 = wy0Var12;
                    final org.telegram.ui.ActionBar.f3[] f3VarArr7 = f3VarArr2;
                    b6Var3 = b6Var2;
                    TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction5.peer;
                    if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                        final long peerDialogId = DialogObject.getPeerDialogId(starsTransactionPeer2.peer);
                        if (starsTransaction5.paid_message) {
                            wy0Var13.k(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i9, peerDialogId, new y7(f3VarArr7, peerDialogId, 3));
                            if (starsTransaction5.starref_amount != null && starsTransaction5.starref_commission_permille > 0) {
                                wy0Var13.d(X0(starsTransaction5.amount instanceof TL_stars.TL_starsTonAmount, j3.r0.n(Math.abs(Math.round(starsTransaction5.starref_amount.toDouble() + starsTransaction5.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            }
                            i13 = i9;
                            wy0Var4 = wy0Var13;
                        } else if (z11) {
                            long peerDialogId2 = DialogObject.getPeerDialogId(starsTransaction5.starref_peer);
                            wy0Var13.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new y7(f3VarArr7, j10, 4));
                            wy0Var13.k(LocaleController.getString(R.string.StarAffiliate), i9, peerDialogId2, new y7(f3VarArr7, peerDialogId2, 5));
                            i13 = i9;
                            wy0Var13.k(LocaleController.getString(R.string.StarAffiliateReferredUser), i13, peerDialogId, new y7(f3VarArr7, peerDialogId, 6));
                            wy0Var13.d(mh.l.F0(starsTransaction5.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                            f3VarArr3 = f3VarArr7;
                            wy0Var3 = wy0Var13;
                            starsTransaction3 = starsTransaction5;
                            context3 = context;
                            wy0Var2 = wy0Var3;
                            wy0Var5 = wy0Var2;
                        } else if (z12) {
                            wy0Var13.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new w7(i9, context, j10, peerDialogId, f3VarArr7, b6Var3));
                            i13 = i9;
                            wy0 wy0Var14 = wy0Var13;
                            wy0Var14.k(LocaleController.getString(R.string.StarAffiliateMiniApp), i13, peerDialogId, new y7(f3VarArr7, peerDialogId, 0));
                            wy0Var4 = wy0Var14;
                        } else {
                            if (z19) {
                                wy0Var13.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i9, peerDialogId, new z7(f3VarArr7, starsTransaction5, peerDialogId, 0));
                                final int i19 = 0;
                                wy0Var13.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i9, UserConfig.getInstance(i9).getClientUserId(), new Runnable() { // from class: gh.a8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                f3VarArr7[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", UserConfig.getInstance(i9).getClientUserId());
                                                    bundle.putBoolean("my_profile", true);
                                                    U2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                f3VarArr7[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putLong("user_id", UserConfig.getInstance(i9).getClientUserId());
                                                    bundle2.putBoolean("my_profile", true);
                                                    bundle2.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(bundle2, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr7[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                if (U4 != null) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("user_id", UserConfig.getInstance(i9).getClientUserId());
                                                    bundle3.putBoolean("my_profile", true);
                                                    bundle3.putBoolean("open_gifts", true);
                                                    U4.presentFragment(new ProfileActivity(bundle3, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                String string2 = LocaleController.getString(R.string.StarGiveawayReason);
                                String string3 = LocaleController.getString(R.string.StarGiveawayReasonLink);
                                Runnable z7Var = new z7(f3VarArr7, starsTransaction, peerDialogId, 1);
                                starsTransaction3 = starsTransaction;
                                wy0Var13.g(string2, string3, z7Var);
                                wy0Var13.d(L0(starsTransaction3.amount), LocaleController.getString(R.string.StarGiveawayGift));
                                context3 = context;
                                i13 = i9;
                                f3VarArr3 = f3VarArr7;
                                wy0Var2 = wy0Var13;
                            } else {
                                starsTransaction3 = starsTransaction5;
                                if (!starsTransaction3.subscription || z10) {
                                    f3VarArr4 = f3VarArr7;
                                    if (starsTransaction3.premium_gift) {
                                        final int i20 = 1;
                                        wy0Var13.k(LocaleController.getString(R.string.Gift2To), i9, peerDialogId, new Runnable() { // from class: gh.b8
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        f3VarArr4[0].dismiss();
                                                        long j15 = peerDialogId;
                                                        if (!UserObject.isService(j15)) {
                                                            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                U2.presentFragment(qn.R9(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            ve.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        f3VarArr4[0].dismiss();
                                                        long j16 = peerDialogId;
                                                        if (!UserObject.isService(j16)) {
                                                            org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                            if (U3 != null) {
                                                                U3.presentFragment(qn.R9(j16));
                                                                break;
                                                            }
                                                        } else {
                                                            ve.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        f3VarArr4[0].dismiss();
                                                        long j17 = peerDialogId;
                                                        if (!UserObject.isService(j17)) {
                                                            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                            if (U4 != null) {
                                                                U4.presentFragment(qn.R9(j17));
                                                                break;
                                                            }
                                                        } else {
                                                            ve.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        wy0Var13.d(LocaleController.formatPluralStringComma("Months", starsTransaction3.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                                    } else if (!starsTransaction3.posts_search) {
                                        final int i21 = 2;
                                        f3VarArr3 = f3VarArr4;
                                        context3 = context;
                                        wy0 wy0Var15 = wy0Var13;
                                        i13 = i9;
                                        wy0Var15.k(LocaleController.getString(R.string.StarsTransactionRecipient), i13, peerDialogId, new Runnable() { // from class: gh.b8
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i21) {
                                                    case 0:
                                                        f3VarArr4[0].dismiss();
                                                        long j15 = peerDialogId;
                                                        if (!UserObject.isService(j15)) {
                                                            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                U2.presentFragment(qn.R9(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            ve.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        f3VarArr4[0].dismiss();
                                                        long j16 = peerDialogId;
                                                        if (!UserObject.isService(j16)) {
                                                            org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                            if (U3 != null) {
                                                                U3.presentFragment(qn.R9(j16));
                                                                break;
                                                            }
                                                        } else {
                                                            ve.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        f3VarArr4[0].dismiss();
                                                        long j17 = peerDialogId;
                                                        if (!UserObject.isService(j17)) {
                                                            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                            if (U4 != null) {
                                                                U4.presentFragment(qn.R9(j17));
                                                                break;
                                                            }
                                                        } else {
                                                            ve.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        wy0Var2 = wy0Var15;
                                    }
                                    context3 = context;
                                    i13 = i9;
                                    wy0Var = wy0Var13;
                                } else {
                                    final int i22 = 0;
                                    f3VarArr4 = f3VarArr7;
                                    wy0 wy0Var16 = wy0Var13;
                                    i13 = i9;
                                    wy0Var16.k(LocaleController.getString(R.string.StarSubscriptionTo), i13, peerDialogId, new Runnable() { // from class: gh.b8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    f3VarArr7[0].dismiss();
                                                    long j15 = peerDialogId;
                                                    if (!UserObject.isService(j15)) {
                                                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            U2.presentFragment(qn.R9(j15));
                                                            break;
                                                        }
                                                    } else {
                                                        ve.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    f3VarArr7[0].dismiss();
                                                    long j16 = peerDialogId;
                                                    if (!UserObject.isService(j16)) {
                                                        org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                        if (U3 != null) {
                                                            U3.presentFragment(qn.R9(j16));
                                                            break;
                                                        }
                                                    } else {
                                                        ve.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    f3VarArr7[0].dismiss();
                                                    long j17 = peerDialogId;
                                                    if (!UserObject.isService(j17)) {
                                                        org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                        if (U4 != null) {
                                                            U4.presentFragment(qn.R9(j17));
                                                            break;
                                                        }
                                                    } else {
                                                        ve.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    context3 = context;
                                    wy0Var = wy0Var16;
                                }
                                f3VarArr3 = f3VarArr4;
                                wy0Var2 = wy0Var;
                            }
                            wy0Var5 = wy0Var2;
                        }
                        f3VarArr3 = f3VarArr7;
                        wy0Var3 = wy0Var4;
                        starsTransaction3 = starsTransaction5;
                        context3 = context;
                        wy0Var2 = wy0Var3;
                        wy0Var5 = wy0Var2;
                    } else {
                        i13 = i9;
                        f3VarArr3 = f3VarArr7;
                        starsTransaction3 = starsTransaction5;
                        context3 = context;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction3.gift) {
                                l80 l80Var = new l80(context3, b6Var3);
                                l80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                l80Var.setEllipsize(TextUtils.TruncateAt.END);
                                int i23 = org.telegram.ui.ActionBar.f6.gc;
                                l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i23, b6Var3));
                                l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i23, b6Var3));
                                l80Var.setTextSize(1, 14.0f);
                                l80Var.setSingleLine(true);
                                l80Var.setDisablePaddingsOffsetY(true);
                                org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(l80Var, 24.0f, i13);
                                String string4 = LocaleController.getString(z15 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                                fq a2 = ja.a(24, "fragment");
                                int dp = AndroidUtilities.dp(f10);
                                int dp2 = AndroidUtilities.dp(f10);
                                a2.e = dp;
                                a2.f = dp2;
                                f5Var.b.setImageBitmap(a2);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) string4));
                                spannableStringBuilder2.setSpan(f5Var, 0, 1, 33);
                                spannableStringBuilder2.setSpan(new g9(f3VarArr3, context3, z15), 3, spannableStringBuilder2.length(), 33);
                                l80Var.setText(spannableStringBuilder2);
                                wy0Var13.i(l80Var, LocaleController.getString(R.string.StarsTransactionRecipient));
                                wy0Var5 = wy0Var13;
                            } else {
                                wy0Var13.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                                wy0Var5 = wy0Var13;
                            }
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            wy0Var13.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                            wy0Var5 = wy0Var13;
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            wy0Var13.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                            wy0Var5 = wy0Var13;
                        } else {
                            wy0Var5 = wy0Var13;
                            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                wy0Var13.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                                wy0Var5 = wy0Var13;
                            }
                        }
                    }
                } else if (starsTransaction2.stargift_upgrade) {
                    if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                        starsTransaction4 = starsTransaction2;
                        viewGroup2 = linearLayout;
                    } else {
                        qc qcVar = (qc) ((ty0) wy0Var12.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                        tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                        viewGroup2 = linearLayout;
                        Context context6 = context2;
                        starsTransaction4 = starsTransaction;
                        v7.w(i9).M(tL_inputSavedStarGiftUser, new g8(qcVar, i9, context6, b6Var2, 0));
                    }
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction4.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        long peerDialogId3 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                        String string5 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                        Runnable y7Var = new y7(f3VarArr2, peerDialogId3, 1);
                        context5 = context;
                        i13 = i9;
                        wy0 wy0Var17 = wy0Var12;
                        org.telegram.ui.ActionBar.f3[] f3VarArr8 = f3VarArr2;
                        b6Var3 = b6Var;
                        wy0Var17.k(string5, i13, peerDialogId3, y7Var);
                        starsTransaction3 = starsTransaction4;
                        viewGroup = viewGroup2;
                        f3VarArr3 = f3VarArr8;
                        wy0Var10 = wy0Var17;
                        context3 = context5;
                        wy0Var5 = wy0Var10;
                    } else {
                        org.telegram.ui.ActionBar.f3[] f3VarArr9 = f3VarArr2;
                        i13 = i9;
                        b6Var3 = b6Var;
                        wy0Var11 = wy0Var12;
                        starsTransaction3 = starsTransaction4;
                        viewGroup = viewGroup2;
                        f3VarArr3 = f3VarArr9;
                        context3 = context;
                        wy0Var5 = wy0Var11;
                    }
                } else {
                    final org.telegram.ui.ActionBar.f3[] f3VarArr10 = f3VarArr2;
                    context5 = context2;
                    TL_stars.StarsTransaction starsTransaction6 = starsTransaction2;
                    b6Var3 = b6Var2;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        String str4 = starGift.slug;
                        if (!TextUtils.isEmpty(str4)) {
                            wy0Var12.g(LocaleController.getString(R.string.Gift2Gift), starsTransaction6.stargift.title + " #" + starsTransaction6.stargift.num, new d5.i(context5, i9, str4, i18));
                        }
                        final long clientUserId = UserConfig.getInstance(i9).getClientUserId();
                        long peerDialogId4 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction6.peer).peer);
                        if (!starsTransaction6.offer) {
                            if (starsTransaction6.stargift_resale) {
                                if (negative) {
                                    wy0Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                                } else {
                                    wy0Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                    j13 = clientUserId;
                                }
                            } else if (starsTransaction6.stargift_drop_original_details) {
                                wy0Var12.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                                j13 = clientUserId;
                                peerDialogId4 = j13;
                            } else {
                                wy0Var12.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                            }
                            j13 = peerDialogId4;
                            peerDialogId4 = clientUserId;
                        } else if (negative) {
                            wy0Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                            j13 = peerDialogId4;
                            peerDialogId4 = clientUserId;
                        } else {
                            wy0Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                            j13 = clientUserId;
                        }
                        if (peerDialogId4 != clientUserId) {
                            String string6 = LocaleController.getString(R.string.Gift2From);
                            final int i24 = 0;
                            wy0Var9 = wy0Var12;
                            str3 = "⭐️ ";
                            viewGroup = linearLayout;
                            final long j15 = peerDialogId4;
                            Runnable runnable = new Runnable() { // from class: gh.h8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i24) {
                                        case 0:
                                            f3VarArr10[0].dismiss();
                                            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                long j16 = j15;
                                                Bundle g10 = e2.c.g(j16, "user_id");
                                                if (j16 == clientUserId) {
                                                    g10.putBoolean("my_profile", true);
                                                }
                                                g10.putBoolean("open_gifts", true);
                                                U2.presentFragment(new ProfileActivity(g10, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            f3VarArr10[0].dismiss();
                                            org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                            if (U3 != null) {
                                                long j17 = j15;
                                                Bundle g11 = e2.c.g(j17, "user_id");
                                                if (j17 == clientUserId) {
                                                    g11.putBoolean("my_profile", true);
                                                }
                                                g11.putBoolean("open_gifts", true);
                                                U3.presentFragment(new ProfileActivity(g11, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            clientUserId = clientUserId;
                            wy0Var9.k(string6, i9, j15, runnable);
                        } else {
                            wy0Var9 = wy0Var12;
                            str3 = "⭐️ ";
                            viewGroup = linearLayout;
                        }
                        if (j13 != clientUserId) {
                            final long j16 = clientUserId;
                            final int i25 = 1;
                            final long j17 = j13;
                            wy0Var9.k(LocaleController.getString(R.string.Gift2To), i9, j17, new Runnable() { // from class: gh.h8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i25) {
                                        case 0:
                                            f3VarArr10[0].dismiss();
                                            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                long j162 = j17;
                                                Bundle g10 = e2.c.g(j162, "user_id");
                                                if (j162 == j16) {
                                                    g10.putBoolean("my_profile", true);
                                                }
                                                g10.putBoolean("open_gifts", true);
                                                U2.presentFragment(new ProfileActivity(g10, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            f3VarArr10[0].dismiss();
                                            org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                            if (U3 != null) {
                                                long j172 = j17;
                                                Bundle g11 = e2.c.g(j172, "user_id");
                                                if (j172 == j16) {
                                                    g11.putBoolean("my_profile", true);
                                                }
                                                g11.putBoolean("open_gifts", true);
                                                U3.presentFragment(new ProfileActivity(g11, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        wy0 wy0Var18 = wy0Var9;
                        if ((peerDialogId4 == clientUserId || starsTransaction6.stargift_resale) && (starsAmount = starsTransaction6.starref_amount) != null && starsTransaction6.starref_commission_permille > 0) {
                            TL_stars.StarsAmount starsAmount4 = starsTransaction6.amount;
                            if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                tL_starsTonAmount.amount = starsTransaction6.amount.amount + starsTransaction6.starref_amount.amount;
                                eq[] eqVarArr = new eq[1];
                                wy0Var18.d(W0(starsTransaction6.amount, str3 + ((Object) H0(tL_starsTonAmount)), eqVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                eq eqVar = eqVarArr[0];
                                if (eqVar != null) {
                                    eqVar.setOverrideColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var3));
                                }
                            } else {
                                wy0Var18.d(X0(starsTransaction6.amount instanceof TL_stars.TL_starsTonAmount, j3.r0.n(Math.abs(Math.round(starsTransaction6.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder(str3)), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            }
                        }
                        i13 = i9;
                        wy0Var10 = wy0Var18;
                        starsTransaction3 = starsTransaction6;
                        f3VarArr3 = f3VarArr10;
                        context3 = context5;
                        wy0Var5 = wy0Var10;
                    } else {
                        viewGroup = linearLayout;
                        if (starsTransaction6.refund) {
                            i13 = i9;
                            wy0Var6 = wy0Var12;
                        } else {
                            long clientUserId2 = j10 == 0 ? UserConfig.getInstance(i9).getClientUserId() : j10;
                            final long peerDialogId5 = DialogObject.getPeerDialogId(starsTransaction6.peer.peer);
                            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId5));
                            if (positive) {
                                if (peerDialogId5 != clientUserId2) {
                                    CharSequence string7 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                    Runnable z7Var2 = new z7(f3VarArr10, starsTransaction6, peerDialogId5, 3);
                                    String string8 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId5)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                    final int i26 = 0;
                                    i15 = i9;
                                    Runnable runnable2 = new Runnable() { // from class: gh.c8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.f3 f3Var2 = f3VarArr10[0];
                                                    Objects.requireNonNull(f3Var2);
                                                    new fh.p2(context5, i15, peerDialogId5, null, new bg.i(f3Var2, 15)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.f3 f3Var3 = f3VarArr10[0];
                                                    Objects.requireNonNull(f3Var3);
                                                    new fh.p2(context5, i15, peerDialogId5, null, new bg.i(f3Var3, 15)).show();
                                                    break;
                                            }
                                        }
                                    };
                                    wy0 wy0Var19 = wy0Var12;
                                    f3VarArr5 = f3VarArr10;
                                    wy0Var19.j(string7, i15, peerDialogId5, z7Var2, string8, runnable2);
                                    wy0Var8 = wy0Var19;
                                } else {
                                    i15 = i9;
                                    wy0Var8 = wy0Var12;
                                    f3VarArr5 = f3VarArr10;
                                }
                                final int i27 = 1;
                                wy0Var8.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i15, clientUserId2, new Runnable() { // from class: gh.a8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i27) {
                                            case 0:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", UserConfig.getInstance(i15).getClientUserId());
                                                    bundle.putBoolean("my_profile", true);
                                                    U2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putLong("user_id", UserConfig.getInstance(i15).getClientUserId());
                                                    bundle2.putBoolean("my_profile", true);
                                                    bundle2.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(bundle2, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                if (U4 != null) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("user_id", UserConfig.getInstance(i15).getClientUserId());
                                                    bundle3.putBoolean("my_profile", true);
                                                    bundle3.putBoolean("open_gifts", true);
                                                    U4.presentFragment(new ProfileActivity(bundle3, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                starsTransaction6 = starsTransaction;
                                f3VarArr10 = f3VarArr5;
                                wy0Var7 = wy0Var8;
                            } else {
                                long j18 = clientUserId2;
                                if (peerDialogId5 != j18) {
                                    final int i28 = 2;
                                    wy0Var12.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i9, j18, new Runnable() { // from class: gh.a8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
                                                case 0:
                                                    f3VarArr10[0].dismiss();
                                                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", UserConfig.getInstance(i9).getClientUserId());
                                                        bundle.putBoolean("my_profile", true);
                                                        U2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    f3VarArr10[0].dismiss();
                                                    org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", UserConfig.getInstance(i9).getClientUserId());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        U3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    f3VarArr10[0].dismiss();
                                                    org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", UserConfig.getInstance(i9).getClientUserId());
                                                        bundle3.putBoolean("my_profile", true);
                                                        bundle3.putBoolean("open_gifts", true);
                                                        U4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                }
                                CharSequence string9 = LocaleController.getString(R.string.StarGiveawayPrizeTo);
                                Runnable z7Var3 = new z7(f3VarArr10, starsTransaction, peerDialogId5, 4);
                                starsTransaction6 = starsTransaction;
                                String string10 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId5)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                final int i29 = 1;
                                Runnable runnable3 = new Runnable() { // from class: gh.c8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i29) {
                                            case 0:
                                                org.telegram.ui.ActionBar.f3 f3Var2 = f3VarArr10[0];
                                                Objects.requireNonNull(f3Var2);
                                                new fh.p2(context, i9, peerDialogId5, null, new bg.i(f3Var2, 15)).show();
                                                break;
                                            default:
                                                org.telegram.ui.ActionBar.f3 f3Var3 = f3VarArr10[0];
                                                Objects.requireNonNull(f3Var3);
                                                new fh.p2(context, i9, peerDialogId5, null, new bg.i(f3Var3, 15)).show();
                                                break;
                                        }
                                    }
                                };
                                wy0 wy0Var20 = wy0Var12;
                                f3VarArr10 = f3VarArr10;
                                wy0Var20.j(string9, i9, peerDialogId5, z7Var3, string10, runnable3);
                                wy0Var7 = wy0Var20;
                            }
                            i13 = i9;
                            wy0Var6 = wy0Var7;
                        }
                        starsTransaction3 = starsTransaction6;
                        f3VarArr3 = f3VarArr10;
                        wy0Var11 = wy0Var6;
                        context3 = context;
                        wy0Var5 = wy0Var11;
                    }
                }
                starsTransactionPeer = starsTransaction3.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction3.flags & 256) != 0) {
                    long peerDialogId6 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                    if (z10) {
                        peerDialogId6 = j10;
                    }
                    chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-peerDialogId6));
                    if (chat != null) {
                        l80 l80Var2 = new l80(context3, b6Var3);
                        l80Var2.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                        l80Var2.setEllipsize(TextUtils.TruncateAt.END);
                        int i30 = org.telegram.ui.ActionBar.f6.gc;
                        l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i30, b6Var3));
                        l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i30, b6Var3));
                        l80Var2.setTextSize(1, 14.0f);
                        l80Var2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        if (starsTransaction3.extended_media.isEmpty()) {
                            z14 = z15;
                        } else {
                            ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction3.extended_media;
                            int size = arrayList.size();
                            z14 = z15;
                            int i31 = 0;
                            int i32 = 0;
                            while (i31 < size) {
                                TLRPC.MessageMedia messageMedia = arrayList.get(i31);
                                int i33 = i31 + 1;
                                TLRPC.MessageMedia messageMedia2 = messageMedia;
                                ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                int i34 = size;
                                c70 c70Var = new c70(l80Var2, 24.0f, i13);
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                    i14 = i32;
                                    forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia2.photo);
                                } else {
                                    i14 = i32;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                        forDocument2 = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia2.document);
                                    } else {
                                        imageLocation2 = null;
                                        if (imageLocation2 == null) {
                                            c70Var.a(6.0f);
                                            c70Var.b.setImage(imageLocation2, "24_24", null, null, null, 0);
                                            SpannableString spannableString = new SpannableString("x");
                                            spannableString.setSpan(c70Var, 0, spannableString.length(), 33);
                                            spannableStringBuilder3.append((CharSequence) spannableString);
                                            spannableStringBuilder3.append((CharSequence) " ");
                                            i32 = i14 + 1;
                                        } else {
                                            i32 = i14;
                                        }
                                        if (i32 < 3) {
                                            break;
                                        }
                                        i31 = i33;
                                        size = i34;
                                        arrayList = arrayList2;
                                    }
                                }
                                imageLocation2 = forDocument2;
                                if (imageLocation2 == null) {
                                }
                                if (i32 < 3) {
                                }
                            }
                        }
                        spannableStringBuilder3.append((CharSequence) " ");
                        int length = spannableStringBuilder3.length();
                        String publicUsername = ChatObject.getPublicUsername(chat);
                        if (TextUtils.isEmpty(publicUsername)) {
                            spannableStringBuilder3.append((CharSequence) chat.title);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            j3.r0.A(sb2, MessagesController.getInstance(i13).linkPrefix, "/", publicUsername, "/");
                            sb2.append(starsTransaction3.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb2.toString());
                        }
                        z7 z7Var4 = new z7(f3VarArr3, peerDialogId6, starsTransaction3);
                        spannableStringBuilder3.setSpan(new h9(z7Var4), length, spannableStringBuilder3.length(), 33);
                        l80Var2.setSingleLine(true);
                        l80Var2.setEllipsize(TextUtils.TruncateAt.END);
                        l80Var2.setText(spannableStringBuilder3);
                        l80Var2.setOnClickListener(new androidx.mediarouter.app.c(z7Var4, 16));
                        wy0Var5.i(l80Var2, LocaleController.getString(starsTransaction3.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                        if (!TextUtils.isEmpty(starsTransaction3.id) && !z19) {
                            String string11 = LocaleController.getString(R.string.StarsTransactionID);
                            String str5 = starsTransaction3.id;
                            wy0Var5.h(string11, str5, str5.length() <= 25 ? 9 : 10, new e5.u(26, f3VarArr3, b6Var3));
                        }
                        if (starsTransaction3.floodskip && starsTransaction3.floodskip_number > 0) {
                            wy0Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction3.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                        }
                        wy0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                        starGift2 = starsTransaction3.stargift;
                        if (starGift2 != null) {
                            if (starGift2.limited) {
                                E0(wy0Var5, i13, starGift2, b6Var3);
                            }
                            if (!TextUtils.isEmpty(starsTransaction3.description)) {
                                wy0Var5.a(new SpannableStringBuilder(starsTransaction3.description));
                            }
                        }
                        ViewGroup viewGroup3 = viewGroup;
                        viewGroup3.addView(wy0Var5, g7.e6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                        if ((starsTransaction3.flags & 32) != 0) {
                            wy0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.transaction_date * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
                        }
                        if (z14) {
                            context4 = context;
                        } else {
                            context4 = context;
                            l80 l80Var3 = new l80(context4, b6Var3);
                            l80Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var3));
                            l80Var3.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var3));
                            l80Var3.setTextSize(1, 14.0f);
                            l80Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.f(context4, 4)));
                            l80Var3.setGravity(17);
                            viewGroup3.addView(l80Var3, g7.e6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                        }
                        kh.d dVar = new kh.d(context4, b6Var3);
                        dVar.e();
                        if ((starsTransaction3.flags & 32) != 0) {
                            dVar.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer));
                        } else {
                            dVar.h(LocaleController.getString(R.string.OK));
                        }
                        viewGroup3.addView(dVar, g7.e6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                        org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                        f3Var2.customView = viewGroup3;
                        int i35 = 0;
                        f3VarArr3[0] = f3Var2;
                        f3Var2.useBackgroundTopPadding = false;
                        if ((starsTransaction3.flags & 32) != 0) {
                            dVar.setOnClickListener(new bg.u1(20, context4, starsTransaction3));
                        } else {
                            dVar.setOnClickListener(new e8(f3VarArr3, i35));
                        }
                        f3VarArr3[0].fixNavigationBar();
                        U = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                            f3VarArr3[0].makeAttached(U);
                        }
                        f3VarArr3[0].show();
                        return f3VarArr3[0];
                    }
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    String string112 = LocaleController.getString(R.string.StarsTransactionID);
                    String str52 = starsTransaction3.id;
                    wy0Var5.h(string112, str52, str52.length() <= 25 ? 9 : 10, new e5.u(26, f3VarArr3, b6Var3));
                }
                if (starsTransaction3.floodskip) {
                    wy0Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction3.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                }
                wy0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup32 = viewGroup;
                viewGroup32.addView(wy0Var5, g7.e6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z14) {
                }
                kh.d dVar2 = new kh.d(context4, b6Var3);
                dVar2.e();
                if ((starsTransaction3.flags & 32) != 0) {
                }
                viewGroup32.addView(dVar2, g7.e6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.f3 f3Var22 = f3Var;
                f3Var22.customView = viewGroup32;
                int i352 = 0;
                f3VarArr3[0] = f3Var22;
                f3Var22.useBackgroundTopPadding = false;
                if ((starsTransaction3.flags & 32) != 0) {
                }
                f3VarArr3[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                    f3VarArr3[0].makeAttached(U);
                }
                f3VarArr3[0].show();
                return f3VarArr3[0];
            }
        }
        f3Var = j14;
        f3VarArr = f3VarArr6;
        z11 = z17;
        final org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(context);
        if (starsTransaction.premium_gift) {
            c1(o9Var2, o9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            f11.addView(o9Var2, g7.e6.t(160, 160, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            fq a3 = org.telegram.ui.Cells.t6.a(100, "search");
            int dp3 = AndroidUtilities.dp(40.0f);
            int dp4 = AndroidUtilities.dp(40.0f);
            a3.e = dp3;
            a3.f = dp4;
            o9Var2.setImageDrawable(a3);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z19 || starsTransaction.gift) {
                    context2 = context;
                    i10 = i9;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f11;
                    str = "";
                    z12 = z18;
                    c10 = 2;
                    z13 = z10;
                    j11 = j10;
                    b6Var2 = b6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        d1(o9Var2, o9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        b1(o9Var2, o9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(o9Var2, g7.e6.t(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i10 = i9;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f11;
                    c10 = 2;
                    z13 = z10;
                    j11 = j10;
                    b6Var2 = b6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            o9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            z12 = z18;
                            o9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                            str = "";
                        } else {
                            z12 = z18;
                            o9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            if (z12) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z13) {
                                j12 = j11;
                                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8();
                                if (j12 < 0) {
                                    str = "";
                                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j12));
                                    z8Var.r(user2);
                                    o9Var2.e(user2, z8Var);
                                } else {
                                    str = "";
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j12));
                                    z8Var.q(chat2);
                                    o9Var2.e(chat2, z8Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            j12 = DialogObject.getPeerDialogId(peer);
                            org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8();
                            if (j12 < 0) {
                            }
                        }
                        linearLayout.addView(o9Var2, g7.e6.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z12 = z18;
                        fq a10 = org.telegram.ui.Cells.t6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int dp5 = AndroidUtilities.dp(40.0f);
                        int dp6 = AndroidUtilities.dp(40.0f);
                        a10.e = dp5;
                        a10.f = dp6;
                        o9Var2.setImageDrawable(a10);
                    }
                } else {
                    o9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia3.document);
                    } else {
                        imageLocation = null;
                        o9Var2.l(imageLocation, "100_100", null, null, null, 0);
                        f11.addView(o9Var2, g7.e6.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        c10 = 2;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: gh.x7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                                long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction7.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i36 = 0; i36 < starsTransaction7.extended_media.size(); i36++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i36);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction7.msg_id;
                                    tL_message.dialog_id = peerDialogId7;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j19 = -peerDialogId7;
                                    tL_peerChannel.channel_id = j19;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j19;
                                    tL_message.date = starsTransaction7.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new MessageObject(i9, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.t1().K2(null, LaunchActivity.R(), b6Var);
                                PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new s9(o9Var2, f11, peerDialogId7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        b6Var2 = b6Var;
                        i10 = i9;
                        linearLayout = f11;
                        j11 = j10;
                        o9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z12 = z18;
                    }
                    imageLocation = forDocument;
                    o9Var2.l(imageLocation, "100_100", null, null, null, 0);
                    f11.addView(o9Var2, g7.e6.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    c10 = 2;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: gh.x7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z10;
                            TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                            long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction7.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i36 = 0; i36 < starsTransaction7.extended_media.size(); i36++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i36);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction7.msg_id;
                                tL_message.dialog_id = peerDialogId7;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j19 = -peerDialogId7;
                                tL_peerChannel.channel_id = j19;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j19;
                                tL_message.date = starsTransaction7.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new MessageObject(i9, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.t1().K2(null, LaunchActivity.R(), b6Var);
                            PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new s9(o9Var2, f11, peerDialogId7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    b6Var2 = b6Var;
                    i10 = i9;
                    linearLayout = f11;
                    j11 = j10;
                    o9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z18;
                }
                TextView textView = new TextView(context2);
                i11 = org.telegram.ui.ActionBar.f6.j5;
                org.telegram.ui.Cells.j2.o(i11, b6Var2, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(N0(i10, z13, starsTransaction2));
                TextView h = j3.r0.h(linearLayout, textView, g7.e6.t(-1, -2, 17, 36, 0, 36, 4), context2);
                h.setTextSize(1, 18.0f);
                h.setTypeface(AndroidUtilities.bold());
                h.setGravity(17);
                h.setTextColor(org.telegram.ui.ActionBar.f6.v0(!positive ? org.telegram.ui.ActionBar.f6.uj : org.telegram.ui.ActionBar.f6.wj, b6Var2));
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                str2 = positive ? "+" : str;
                SpannableStringBuilder H02 = H0(starsAmount5);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[0] = str2;
                charSequenceArr2[1] = H02;
                charSequenceArr2[c10] = " ⭐️";
                h.setText(X0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(charSequenceArr2), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(h.getText());
                if (!starsTransaction2.refund) {
                    F0(spannableStringBuilder4, h, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    h.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.wj, b6Var2));
                    F0(spannableStringBuilder4, h, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    h.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.yj, b6Var2));
                    F0(spannableStringBuilder4, h, LocaleController.getString(R.string.StarsPending));
                }
                h.setText(spannableStringBuilder4);
                linearLayout.addView(h, g7.e6.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    l80 l80Var4 = new l80(context2);
                    l80Var4.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var2));
                    l80Var4.setTextSize(1, 14.0f);
                    l80Var4.setGravity(17);
                    l80Var4.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var2));
                    l80Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, mh.l.F0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j11 == UserConfig.getInstance(i10).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j11)), 2)) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new d8(j11, i10, 0)), true));
                    }
                    l80Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(l80Var4, g7.e6.t(-1, -2, 17, 36, 0, 36, 4));
                    f3VarArr2 = f3VarArr;
                    f10 = 16.0f;
                    wy0 wy0Var122 = new wy0(context2, b6Var2);
                    starGift = starsTransaction2.stargift;
                    int i182 = 6;
                    if (starGift != null) {
                    }
                    starsTransactionPeer = starsTransaction3.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    }
                    if (starsTransaction3.floodskip) {
                    }
                    wy0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction3.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322 = viewGroup;
                    viewGroup322.addView(wy0Var5, g7.e6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    kh.d dVar22 = new kh.d(context4, b6Var3);
                    dVar22.e();
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    viewGroup322.addView(dVar22, g7.e6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var222 = f3Var;
                    f3Var222.customView = viewGroup322;
                    int i3522 = 0;
                    f3VarArr3[0] = f3Var222;
                    f3Var222.useBackgroundTopPadding = false;
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    f3VarArr3[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    f3VarArr3[0].show();
                    return f3VarArr3[0];
                }
                if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z19 || starsTransaction2.gift)) {
                    TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i10).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                    TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i10).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                    boolean isUserSelf = UserObject.isUserSelf(user3);
                    if (isUserSelf) {
                        h.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var2));
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i12 = 1;
                        h.setText(X0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(H0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i12 = 1;
                    }
                    l80 l80Var5 = new l80(context2);
                    l80Var5.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var2));
                    f10 = 16.0f;
                    l80Var5.setTextSize(i12, 16.0f);
                    l80Var5.setGravity(17);
                    l80Var5.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var2));
                    l80Var5.setDisablePaddingsOffsetY(i12);
                    if (isUserSelf) {
                        int i36 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i12];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i36, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    f3VarArr2 = f3VarArr;
                    l80Var5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new f8(context2, f3VarArr2)), true)));
                    linearLayout.addView(l80Var5, g7.e6.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    f3VarArr2 = f3VarArr;
                    f10 = 16.0f;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        ll.n(i11, b6Var2, textView2, 1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, g7.e6.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                wy0 wy0Var1222 = new wy0(context2, b6Var2);
                starGift = starsTransaction2.stargift;
                int i1822 = 6;
                if (starGift != null) {
                }
                starsTransactionPeer = starsTransaction3.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    long peerDialogId62 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                    if (z10) {
                    }
                    chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-peerDialogId62));
                    if (chat != null) {
                    }
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                }
                if (starsTransaction3.floodskip) {
                }
                wy0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup3222 = viewGroup;
                viewGroup3222.addView(wy0Var5, g7.e6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z14) {
                }
                kh.d dVar222 = new kh.d(context4, b6Var3);
                dVar222.e();
                if ((starsTransaction3.flags & 32) != 0) {
                }
                viewGroup3222.addView(dVar222, g7.e6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.f3 f3Var2222 = f3Var;
                f3Var2222.customView = viewGroup3222;
                int i35222 = 0;
                f3VarArr3[0] = f3Var2222;
                f3Var2222.useBackgroundTopPadding = false;
                if ((starsTransaction3.flags & 32) != 0) {
                }
                f3VarArr3[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                f3VarArr3[0].show();
                return f3VarArr3[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                o9Var2.setImageDrawable(new x4(o9Var2, starsTransaction.stargift, 94, 0.44f));
                f11.addView(o9Var2, g7.e6.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                a1(o9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                f11.addView(o9Var2, g7.e6.t(160, 160, 17, 0, -8, 0, 10));
            }
        }
        b6Var2 = b6Var;
        context2 = context;
        i10 = i9;
        starsTransaction2 = starsTransaction;
        linearLayout = f11;
        str = "";
        z12 = z18;
        c10 = 2;
        z13 = z10;
        j11 = j10;
        TextView textView3 = new TextView(context2);
        i11 = org.telegram.ui.ActionBar.f6.j5;
        org.telegram.ui.Cells.j2.o(i11, b6Var2, textView3, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(N0(i10, z13, starsTransaction2));
        TextView h10 = j3.r0.h(linearLayout, textView3, g7.e6.t(-1, -2, 17, 36, 0, 36, 4), context2);
        h10.setTextSize(1, 18.0f);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setGravity(17);
        h10.setTextColor(org.telegram.ui.ActionBar.f6.v0(!positive ? org.telegram.ui.ActionBar.f6.uj : org.telegram.ui.ActionBar.f6.wj, b6Var2));
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        if (positive) {
        }
        SpannableStringBuilder H022 = H0(starsAmount52);
        CharSequence[] charSequenceArr22 = new CharSequence[3];
        charSequenceArr22[0] = str2;
        charSequenceArr22[1] = H022;
        charSequenceArr22[c10] = " ⭐️";
        h10.setText(X0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(charSequenceArr22), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(h10.getText());
        if (!starsTransaction2.refund) {
        }
        h10.setText(spannableStringBuilder42);
        linearLayout.addView(h10, g7.e6.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        f3VarArr2 = f3VarArr;
        f10 = 16.0f;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            ll.n(i11, b6Var2, textView22, 1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, g7.e6.t(-1, -2, 17, 36, 0, 36, 4));
        }
        wy0 wy0Var12222 = new wy0(context2, b6Var2);
        starGift = starsTransaction2.stargift;
        int i18222 = 6;
        if (starGift != null) {
        }
        starsTransactionPeer = starsTransaction3.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z14 = z15;
        if (!TextUtils.isEmpty(starsTransaction3.id)) {
        }
        if (starsTransaction3.floodskip) {
        }
        wy0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        starGift2 = starsTransaction3.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup32222 = viewGroup;
        viewGroup32222.addView(wy0Var5, g7.e6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction3.flags & 32) != 0) {
        }
        if (z14) {
        }
        kh.d dVar2222 = new kh.d(context4, b6Var3);
        dVar2222.e();
        if ((starsTransaction3.flags & 32) != 0) {
        }
        viewGroup32222.addView(dVar2222, g7.e6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.f3 f3Var22222 = f3Var;
        f3Var22222.customView = viewGroup32222;
        int i352222 = 0;
        f3VarArr3[0] = f3Var22222;
        f3Var22222.useBackgroundTopPadding = false;
        if ((starsTransaction3.flags & 32) != 0) {
        }
        f3VarArr3[0].fixNavigationBar();
        U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet()) {
        }
        f3VarArr3[0].show();
        return f3VarArr3[0];
    }

    public static void i1(Activity activity, int i9, int i10, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.b6 b6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i10;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.id = tL_messageActionPaymentRefunded.charge.id;
        starsTransaction.refund = true;
        h1(activity, false, 0L, i9, starsTransaction, b6Var);
    }

    public static void j1(Context context, int i9, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.b6 b6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i9).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        h1(context, false, 0L, i9, starsTransaction, b6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0509  */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void w0(oa oaVar, int i9) {
        l41 G;
        char c10;
        String str;
        boolean z10;
        final boolean z11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i10;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        int i11;
        wy0 wy0Var;
        int i12;
        String str2;
        String str3;
        boolean z12;
        boolean z13;
        long currentTime;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2;
        final int i13;
        ?? r42;
        org.telegram.ui.ActionBar.o2 U;
        o9 o9Var = oaVar.c0;
        if (o9Var == null || (G = o9Var.G(i9)) == null) {
            return;
        }
        int i14 = G.d;
        if (i14 == -1) {
            oaVar.c0.N(true);
            return;
        }
        if (i14 == -2) {
            v7.y(oaVar.currentAccount, false).u();
            bg.g3.d0(1, BirthdayController.getInstance(oaVar.currentAccount).getState());
            return;
        }
        if (i14 == -3) {
            v7.y(oaVar.currentAccount, false).W();
            oaVar.c0.N(true);
            return;
        }
        if (i14 == -4) {
            if (MessagesController.getInstance(oaVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(oaVar.currentAccount);
                return;
            } else {
                oaVar.presentFragment(new mh.u3(oaVar.getUserConfig().getClientUserId()));
                return;
            }
        }
        int i15 = 3;
        if (G.G(aa.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                v7.y(oaVar.currentAccount, false).f(oaVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new bg.y0(i15, oaVar, G), null);
                return;
            }
            return;
        }
        if (G.G(ga.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = oaVar.getParentActivity();
            int i16 = oaVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.b6 resourceProvider = oaVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(parentActivity, resourceProvider, false, false);
            f3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.f3[] f3VarArr3 = new org.telegram.ui.ActionBar.f3[1];
            LinearLayout f10 = org.telegram.messenger.l0.f(parentActivity, 1);
            f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            f10.addView(frameLayout, g7.e6.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            i9 i9Var = new i9(zArr, f3VarArr3);
            NotificationCenter.getInstance(i16).addObserver(i9Var, NotificationCenter.starSubscriptionsLoaded);
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(parentActivity);
            if (peerDialogId >= 0) {
                c10 = 0;
                TLRPC.User user = MessagesController.getInstance(i16).getUser(Long.valueOf(peerDialogId));
                str = UserObject.getUserName(user);
                boolean isBot = UserObject.isBot(user);
                z10 = !isBot;
                z11 = isBot;
                chat = user;
            } else {
                c10 = 0;
                TLRPC.Chat chat3 = MessagesController.getInstance(i16).getChat(Long.valueOf(-peerDialogId));
                str = chat3 == null ? "" : chat3.title;
                z10 = false;
                z11 = false;
                chat = chat3;
            }
            String str4 = str;
            if (starsSubscription.photo != null) {
                o9Var2.setRoundRadius(AndroidUtilities.dp(21.0f));
                chat2 = chat;
                o9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", null, null);
            } else {
                chat2 = chat;
                o9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                if (peerDialogId < 0) {
                    i10 = i16;
                    f3VarArr = f3VarArr3;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i16).getChat(Long.valueOf(-peerDialogId));
                    z8Var.q(chat4);
                    o9Var2.e(chat4, z8Var);
                    frameLayout.addView(o9Var2, g7.e6.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, g7.e6.e(28, 28, 17));
                        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, g7.e6.e(28, 28, 17));
                        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.j5, resourceProvider, textView, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                    }
                    f10.addView(textView, g7.e6.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B6, resourceProvider));
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i11 = tL_starsSubscriptionPricing.period;
                    if (i11 != 2592000) {
                        int i17 = R.string.StarsSubscriptionPrice;
                        Long valueOf = Long.valueOf(tL_starsSubscriptionPricing.amount);
                        Object[] objArr = new Object[1];
                        objArr[c10] = valueOf;
                        textView2.setText(X0(false, LocaleController.formatString(i17, objArr), 0.8f, null));
                    } else {
                        textView2.setText(X0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), i11 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    f10.addView(textView2, g7.e6.t(-1, -2, 17, 20, 0, 20, 4));
                    wy0Var = new wy0(parentActivity, resourceProvider);
                    l80 l80Var = new l80(parentActivity, resourceProvider);
                    l80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                    l80Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i18 = org.telegram.ui.ActionBar.f6.gc;
                    l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i18, resourceProvider));
                    l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i18, resourceProvider));
                    l80Var.setTextSize(1, 14.0f);
                    l80Var.setSingleLine(true);
                    l80Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(l80Var, 24.0f, i10);
                    if (peerDialogId < 0) {
                        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                        boolean z14 = user2 == null || UserObject.isDeleted(user2);
                        str3 = UserObject.getUserName(user2);
                        f5Var.e(user2);
                        i12 = i18;
                        z12 = z14;
                        str2 = str4;
                    } else {
                        i12 = i18;
                        str2 = str4;
                        TLRPC.Chat chat5 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                        boolean z15 = chat5 == null;
                        str3 = chat5 != null ? chat5.title : "";
                        f5Var.b(chat5);
                        z12 = z15;
                    }
                    String str5 = str3;
                    z13 = z12;
                    int i19 = i10;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str5));
                    spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                    org.telegram.ui.ActionBar.f3[] f3VarArr4 = f3VarArr;
                    spannableStringBuilder.setSpan(new j9(f3VarArr4, peerDialogId), 3, spannableStringBuilder.length(), 33);
                    l80Var.setText(spannableStringBuilder);
                    if (!z13) {
                        wy0Var.i(l80Var, LocaleController.getString(peerDialogId < 0 ? R.string.StarsSubscriptionChannel : z10 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot));
                    }
                    if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                        wy0Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
                    }
                    wy0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i19).getCurrentTime();
                    wy0Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    f10.addView(wy0Var, g7.e6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    l80 l80Var2 = new l80(parentActivity, resourceProvider);
                    int i20 = org.telegram.ui.ActionBar.f6.z6;
                    l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i20, resourceProvider));
                    int i21 = i12;
                    l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i21, resourceProvider));
                    final int i22 = 1;
                    l80Var2.setTextSize(1, 14.0f);
                    l80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i23 = i22;
                            Activity activity = parentActivity;
                            switch (i23) {
                                case 0:
                                    if (!activity.isFinishing()) {
                                        Handler handler = g.g;
                                        Method method = g.f;
                                        int i24 = Build.VERSION.SDK_INT;
                                        if (i24 < 28) {
                                            if (((i24 != 26 && i24 != 27) || method != null) && (g.e != null || g.d != null)) {
                                                try {
                                                    Object obj2 = g.c.get(activity);
                                                    if (obj2 != null && (obj = g.b.get(activity)) != null) {
                                                        Application application = activity.getApplication();
                                                        f fVar = new f(activity);
                                                        application.registerActivityLifecycleCallbacks(fVar);
                                                        handler.post(new androidx.biometric.j(fVar, obj2, false, 2));
                                                        try {
                                                            if (i24 == 26 || i24 == 27) {
                                                                Boolean bool = Boolean.FALSE;
                                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                            } else {
                                                                activity.recreate();
                                                            }
                                                            handler.post(new androidx.biometric.j(application, fVar, false, 3));
                                                            break;
                                                        } catch (Throwable th) {
                                                            handler.post(new androidx.biometric.j(application, fVar, false, 3));
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            activity.recreate();
                                            break;
                                        } else {
                                            activity.recreate();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    ve.e.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                                    break;
                            }
                        }
                    }));
                    l80Var2.setGravity(17);
                    f10.addView(l80Var2, g7.e6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        f3VarArr2 = f3VarArr4;
                        i13 = i19;
                        l80 l80Var3 = new l80(parentActivity, resourceProvider);
                        l80Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i20, resourceProvider));
                        l80Var3.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i21, resourceProvider));
                        l80Var3.setTextSize(1, 14.0f);
                        l80Var3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        l80Var3.setSingleLine(false);
                        l80Var3.setMaxLines(4);
                        l80Var3.setGravity(17);
                        f10.addView(l80Var3, g7.e6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            kh.d dVar = new kh.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r42 = 0;
                            dVar.g(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                            f10.addView(dVar, g7.e6.n(-1, 48));
                            x8 x8Var = new x8(dVar, starsSubscription, i13, f3VarArr2, resourceProvider, zArr, parentActivity);
                            i13 = i13;
                            dVar.setOnClickListener(x8Var);
                            f3Var.customView = f10;
                            f3VarArr2[r42] = f3Var;
                            f3Var.useBackgroundTopPadding = r42;
                            f3Var.setOnDismissListener(new y8(i13, i9Var));
                            f3VarArr2[r42].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                f3VarArr2[r42].makeAttached(U);
                            }
                            f3VarArr2[r42].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        l80 l80Var4 = new l80(parentActivity, resourceProvider);
                        l80Var4.setTextColor(org.telegram.ui.ActionBar.f6.v0(i20, resourceProvider));
                        l80Var4.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i21, resourceProvider));
                        l80Var4.setTextSize(1, 14.0f);
                        l80Var4.setText(LocaleController.formatString(z11 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        l80Var4.setSingleLine(false);
                        l80Var4.setMaxLines(4);
                        l80Var4.setGravity(17);
                        f10.addView(l80Var4, g7.e6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        kh.d dVar2 = new kh.d(parentActivity, resourceProvider, true);
                        dVar2.g(LocaleController.getString(z11 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false, true);
                        f10.addView(dVar2, g7.e6.n(-1, 48));
                        String str6 = str2;
                        f3VarArr2 = f3VarArr4;
                        u8 u8Var = new u8(dVar2, i19, starsSubscription, f3VarArr2, peerDialogId, parentActivity, resourceProvider, z10, str6);
                        i13 = i19;
                        dVar2.setOnClickListener(u8Var);
                    } else {
                        String str7 = str2;
                        final boolean z16 = z10;
                        i13 = i19;
                        f3VarArr2 = f3VarArr4;
                        if (starsSubscription.bot_canceled) {
                            l80 l80Var5 = new l80(parentActivity, resourceProvider);
                            l80Var5.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.wj, resourceProvider));
                            l80Var5.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i21, resourceProvider));
                            l80Var5.setTextSize(1, 14.0f);
                            l80Var5.setText(LocaleController.getString(z16 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                            l80Var5.setSingleLine(false);
                            l80Var5.setMaxLines(4);
                            l80Var5.setGravity(17);
                            f10.addView(l80Var5, g7.e6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            l80 l80Var6 = new l80(parentActivity, resourceProvider);
                            l80Var6.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.wj, resourceProvider));
                            l80Var6.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i21, resourceProvider));
                            l80Var6.setTextSize(1, 14.0f);
                            l80Var6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                            l80Var6.setSingleLine(false);
                            l80Var6.setMaxLines(4);
                            l80Var6.setGravity(17);
                            f10.addView(l80Var6, g7.e6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                kh.d dVar3 = new kh.d(parentActivity, resourceProvider, true);
                                dVar3.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                                f10.addView(dVar3, g7.e6.n(-1, 48));
                                v8 v8Var = new v8(dVar3, starsSubscription, i13, f3VarArr2, chat2, str7);
                                i13 = i13;
                                dVar3.setOnClickListener(v8Var);
                            }
                        } else {
                            final TLRPC.Chat chat6 = chat2;
                            l80 l80Var7 = new l80(parentActivity, resourceProvider);
                            l80Var7.setTextColor(org.telegram.ui.ActionBar.f6.v0(i20, resourceProvider));
                            l80Var7.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i21, resourceProvider));
                            l80Var7.setTextSize(1, 14.0f);
                            l80Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                            l80Var7.setSingleLine(false);
                            l80Var7.setMaxLines(4);
                            l80Var7.setGravity(17);
                            f10.addView(l80Var7, g7.e6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final kh.d dVar4 = new kh.d(parentActivity, resourceProvider, false);
                            dVar4.g(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                            dVar4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.wj, resourceProvider));
                            f10.addView(dVar4, g7.e6.n(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: gh.w8
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final kh.d dVar5 = dVar4;
                                    if (dVar5.J) {
                                        return;
                                    }
                                    dVar5.setLoading(true);
                                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                    tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                    final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                                    tL_changeStarsSubscription.subscription_id = starsSubscription2.id;
                                    final int i23 = i13;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i23);
                                    final TLObject tLObject = chat6;
                                    final boolean z17 = z16;
                                    final boolean z18 = z11;
                                    final org.telegram.ui.ActionBar.f3[] f3VarArr5 = f3VarArr2;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: gh.a9
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            AndroidUtilities.runOnUIThread(new b9(i23, dVar5, tLObject, starsSubscription2, z17, z18, f3VarArr5));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r42 = 0;
                    f3Var.customView = f10;
                    f3VarArr2[r42] = f3Var;
                    f3Var.useBackgroundTopPadding = r42;
                    f3Var.setOnDismissListener(new y8(i13, i9Var));
                    f3VarArr2[r42].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        f3VarArr2[r42].makeAttached(U);
                    }
                    f3VarArr2[r42].show();
                }
                TLRPC.User user3 = MessagesController.getInstance(i16).getUser(Long.valueOf(peerDialogId));
                z8Var.r(user3);
                o9Var2.e(user3, z8Var);
            }
            i10 = i16;
            f3VarArr = f3VarArr3;
            frameLayout.addView(o9Var2, g7.e6.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.j5, resourceProvider, textView3, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            f10.addView(textView3, g7.e6.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            textView22.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B6, resourceProvider));
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i11 = tL_starsSubscriptionPricing2.period;
            if (i11 != 2592000) {
            }
            f10.addView(textView22, g7.e6.t(-1, -2, 17, 20, 0, 20, 4));
            wy0Var = new wy0(parentActivity, resourceProvider);
            l80 l80Var8 = new l80(parentActivity, resourceProvider);
            l80Var8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            l80Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i182 = org.telegram.ui.ActionBar.f6.gc;
            l80Var8.setTextColor(org.telegram.ui.ActionBar.f6.v0(i182, resourceProvider));
            l80Var8.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i182, resourceProvider));
            l80Var8.setTextSize(1, 14.0f);
            l80Var8.setSingleLine(true);
            l80Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(l80Var8, 24.0f, i10);
            if (peerDialogId < 0) {
            }
            String str52 = str3;
            z13 = z12;
            int i192 = i10;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str52));
            spannableStringBuilder2.setSpan(f5Var2, 0, 1, 33);
            org.telegram.ui.ActionBar.f3[] f3VarArr42 = f3VarArr;
            spannableStringBuilder2.setSpan(new j9(f3VarArr42, peerDialogId), 3, spannableStringBuilder2.length(), 33);
            l80Var8.setText(spannableStringBuilder2);
            if (!z13) {
            }
            if (peerDialogId >= 0) {
                wy0Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
            }
            wy0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i192).getCurrentTime();
            wy0Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
            f10.addView(wy0Var, g7.e6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            l80 l80Var22 = new l80(parentActivity, resourceProvider);
            int i202 = org.telegram.ui.ActionBar.f6.z6;
            l80Var22.setTextColor(org.telegram.ui.ActionBar.f6.v0(i202, resourceProvider));
            int i212 = i12;
            l80Var22.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i212, resourceProvider));
            final int i222 = 1;
            l80Var22.setTextSize(1, 14.0f);
            l80Var22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i23 = i222;
                    Activity activity = parentActivity;
                    switch (i23) {
                        case 0:
                            if (!activity.isFinishing()) {
                                Handler handler = g.g;
                                Method method = g.f;
                                int i24 = Build.VERSION.SDK_INT;
                                if (i24 < 28) {
                                    if (((i24 != 26 && i24 != 27) || method != null) && (g.e != null || g.d != null)) {
                                        try {
                                            Object obj2 = g.c.get(activity);
                                            if (obj2 != null && (obj = g.b.get(activity)) != null) {
                                                Application application = activity.getApplication();
                                                f fVar = new f(activity);
                                                application.registerActivityLifecycleCallbacks(fVar);
                                                handler.post(new androidx.biometric.j(fVar, obj2, false, 2));
                                                try {
                                                    if (i24 == 26 || i24 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new androidx.biometric.j(application, fVar, false, 3));
                                                    break;
                                                } catch (Throwable th) {
                                                    handler.post(new androidx.biometric.j(application, fVar, false, 3));
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    activity.recreate();
                                    break;
                                } else {
                                    activity.recreate();
                                    break;
                                }
                            }
                            break;
                        default:
                            ve.e.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                            break;
                    }
                }
            }));
            l80Var22.setGravity(17);
            f10.addView(l80Var22, g7.e6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r42 = 0;
            f3Var.customView = f10;
            f3VarArr2[r42] = f3Var;
            f3Var.useBackgroundTopPadding = r42;
            f3Var.setOnDismissListener(new y8(i13, i9Var));
            f3VarArr2[r42].fixNavigationBar();
            U = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
            }
            f3VarArr2[r42].show();
        }
    }

    public static void y0(oa oaVar, l41 l41Var, Boolean bool, String str) {
        if (oaVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            oc.a0(oaVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) l41Var.B, new Object[0])), R.raw.stars_topup).j();
            oaVar.P.c(true);
            v7.y(oaVar.currentAccount, false).T(true);
        } else if (str != null) {
            org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, oc.a0(oaVar), R.raw.error, 36);
        }
    }

    public static void z0(oa oaVar) {
        v7.y(oaVar.currentAccount, false).u();
        bg.g3.d0(1, BirthdayController.getInstance(oaVar.currentAccount).getState());
    }

    public final void G0(ArrayList arrayList, z41 z41Var) {
        if (getParentActivity() == null) {
            return;
        }
        v7 y10 = v7.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        fh.l2 l2Var = (fh.l2) super.q0(getParentActivity());
        l41 l41Var = new l41(-2);
        l41Var.c = l2Var;
        arrayList.add(l41Var);
        arrayList.add(l41.k(this.Q));
        kh.d dVar = this.Z;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(l41.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(mh.h.a(-4, getThemedColor(org.telegram.ui.ActionBar.f6.uj), R.drawable.filled_earn_stars, ho.c0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(l41.B(null));
        }
        if (y10.e && !arrayList2.isEmpty()) {
            org.telegram.ui.Cells.j2.l(R.string.StarMySubscriptions, arrayList);
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i9);
                int i10 = ga.a;
                l41 J = l41.J(ga.class);
                J.G = starsSubscription;
                arrayList.add(J);
            }
            if (y10.x) {
                arrayList.add(l41.o(arrayList.size(), 33));
            } else if (!y10.y) {
                l41 c10 = l41.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(l41.B(null));
        }
        boolean O = y10.O(0);
        this.a0 = O;
        if (O) {
            arrayList.add(l41.p(this.N, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
        } else {
            arrayList.add(l41.l(this.O));
        }
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        this.N = new na(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.O = new fh.l2(this, context, 1);
        super.createView(context);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setClickable(true);
        ag.j jVar = new ag.j(context, 1, 2);
        this.M = jVar;
        ag.a aVar = jVar.b;
        aVar.w = org.telegram.ui.ActionBar.f6.fk;
        aVar.x = org.telegram.ui.ActionBar.f6.gk;
        aVar.b();
        this.M.setStarParticlesView(this.e);
        this.L.addView(this.M, g7.e6.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        l0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new e2.f(context, 5)), true), this.L, null);
        this.c.setOverScrollMode(2);
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.c.setItemAnimator(nVar);
        this.c.setOnItemClickListener(new eh.j(this, 3));
        c00 c00Var = new c00(getParentActivity());
        this.P = c00Var;
        this.s.addView(c00Var, g7.e6.c(-1.0f, -1));
        v7 y10 = v7.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        this.Q.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getParentActivity(), false, true, false);
        this.S = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.S.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.resourceProvider));
        this.R = new SpannableStringBuilder("S");
        c70 c70Var = new c70(this.S, 42.0f, this.currentAccount);
        mi0 mi0Var = new mi0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), "s" + R.raw.star_reaction, AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = c70Var.b;
        imageReceiver.setImageBitmap(mi0Var);
        imageReceiver.setAutoRepeat(2);
        c70Var.f = false;
        c70Var.h = -AndroidUtilities.dp(3.0f);
        this.R.setSpan(c70Var, 0, 1, 33);
        this.Q.addView(this.S, g7.e6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.T = textView;
        textView.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.T.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, this.resourceProvider));
        this.Q.addView(this.T, g7.e6.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        fh.d2 d2Var = new fh.d2(this, getParentActivity(), 2);
        this.V = d2Var;
        frameLayout2.addView(d2Var);
        kh.d dVar = new kh.d(getParentActivity(), this.resourceProvider, true);
        this.W = dVar;
        dVar.e();
        this.W.g("", false, true);
        final int i9 = 0;
        this.W.setOnClickListener(new View.OnClickListener(this) { // from class: gh.i8
            public final /* synthetic */ oa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        oa.A0(this.b, context);
                        break;
                    default:
                        new fa(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.V.addView(this.W, g7.e6.e(-1, 48, 119));
        ta1 ta1Var = new ta1(this, getParentActivity(), 3);
        this.X = ta1Var;
        frameLayout2.addView(ta1Var);
        kh.d dVar2 = new kh.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new eq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.Y.g(spannableStringBuilder, false, true);
        final int i10 = 1;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: gh.i8
            public final /* synthetic */ oa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        oa.A0(this.b, context);
                        break;
                    default:
                        new fa(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.X.addView(this.Y, g7.e6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        kh.d dVar3 = new kh.d(getParentActivity(), this.resourceProvider, true);
        this.U = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new eq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.U.g(spannableStringBuilder2, false, true);
        final int i11 = 0;
        this.U.setOnClickListener(new View.OnClickListener(this) { // from class: gh.j8
            public final /* synthetic */ oa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        oa oaVar = this.b;
                        oaVar.presentFragment(new r(0, oaVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        oa.z0(this.b);
                        break;
                }
            }
        });
        this.X.addView(this.U, g7.e6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.Q.addView(frameLayout2, g7.e6.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        kh.d dVar4 = new kh.d(getParentActivity(), this.resourceProvider, false);
        this.Z = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new eq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.Z.g(spannableStringBuilder3, false, true);
        final int i12 = 1;
        this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: gh.j8
            public final /* synthetic */ oa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        oa oaVar = this.b;
                        oaVar.presentFragment(new r(0, oaVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        oa.z0(this.b);
                        break;
                }
            }
        });
        this.Q.addView(this.Z, g7.e6.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        o9 o9Var = this.c0;
        if (o9Var != null) {
            o9Var.N(false);
        }
        c0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = c0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1(y10.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starOptionsLoaded) {
            r0();
            o9 o9Var = this.c0;
            if (o9Var != null) {
                o9Var.N(true);
            }
            if (this.J == 0 && this.K < 0) {
                this.K = 0;
            }
            k0();
            return;
        }
        if (i9 == NotificationCenter.starTransactionsLoaded) {
            v7 y10 = v7.y(this.currentAccount, false);
            if (this.a0 != y10.O(0)) {
                this.a0 = y10.O(0);
                r0();
                o9 o9Var2 = this.c0;
                if (o9Var2 != null) {
                    o9Var2.N(true);
                }
                if (this.J == 0 && this.K < 0) {
                    this.K = 0;
                }
                k0();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.starSubscriptionsLoaded) {
            o9 o9Var3 = this.c0;
            if (o9Var3 != null) {
                o9Var3.N(true);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.starBalanceUpdated) {
            k1();
        } else if (i9 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            k1();
        }
    }

    public final void k1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        v7 y10 = v7.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.R);
        spannableStringBuilder.append((CharSequence) I0(y10.p(), 0.66f, ' '));
        this.S.setText(spannableStringBuilder);
        this.W.g(LocaleController.getString(y10.p().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats h = c0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        l1(z10, true);
    }

    public final void l1(final boolean z10, boolean z11) {
        this.b0 = z10;
        if (z11) {
            this.V.setVisibility(0);
            this.X.setVisibility(0);
            final int i9 = 0;
            this.V.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: gh.k8
                public final /* synthetic */ oa b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            if (z10) {
                                this.b.V.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.X.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final int i10 = 1;
            this.X.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: gh.k8
                public final /* synthetic */ oa b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            if (z10) {
                                this.b.V.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.X.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        this.V.animate().cancel();
        this.X.animate().cancel();
        this.X.setAlpha(z10 ? 1.0f : 0.0f);
        this.V.setAlpha(z10 ? 0.0f : 1.0f);
        this.X.setVisibility(z10 ? 0 : 8);
        this.V.setVisibility(z10 ? 8 : 0);
    }

    @Override // org.telegram.ui.x10
    public final f2.r0 m0() {
        o9 o9Var = new o9(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new bh.c(this, 18), getResourceProvider());
        this.c0 = o9Var;
        o9Var.r = false;
        return o9Var;
    }

    @Override // org.telegram.ui.x10
    public final w10 n0() {
        return new z9(this, getParentActivity());
    }

    @Override // org.telegram.ui.x10
    public final zf.w1 o0() {
        return new n9(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        v7.y(this.currentAccount, false).T(true);
        v7.y(this.currentAccount, false).S();
        v7.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        ag.j jVar = this.M;
        if (jVar != null) {
            jVar.setPaused(true);
            this.M.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.x10, org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        ag.j jVar = this.M;
        if (jVar != null) {
            jVar.setPaused(false);
            this.M.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.x10
    public final boolean p0() {
        na naVar = this.N;
        boolean z10 = false;
        if (naVar != null && (naVar.getParent() instanceof View)) {
            if ((this.c.getHeight() - this.c.getPaddingBottom()) - ((View) this.N.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.x10
    public final View q0(Context context) {
        throw null;
    }
}
