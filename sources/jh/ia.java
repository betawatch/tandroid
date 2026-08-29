package jh;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f70;
import org.telegram.ui.ko;
import org.telegram.ui.th;
import org.telegram.ui.tn;
import org.telegram.ui.ua1;
import org.telegram.ui.y10;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ia extends z10 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat d0;
    public static DecimalFormat e0;
    public FrameLayout L;
    public dg.i M;
    public ha N;
    public cg.h0 O;
    public n00 P;
    public LinearLayout Q;
    public SpannableStringBuilder R;
    public org.telegram.ui.Components.o6 S;
    public TextView T;
    public nh.d U;
    public bg.x2 V;
    public nh.d W;
    public ua1 X;
    public nh.d Y;
    public nh.d Z;
    public boolean a0;
    public boolean b0;
    public j9 c0;

    public ia() {
        this.I = true;
    }

    public static void A0(ia iaVar) {
        s7.y(iaVar.currentAccount, false).u();
        eg.w2.e0(1, BirthdayController.getInstance(iaVar.currentAccount).getState());
    }

    public static /* synthetic */ void B0(ia iaVar, Context context) {
        if (MessagesController.getInstance(iaVar.currentAccount).isFrozen()) {
            org.telegram.ui.c.b(iaVar.currentAccount);
        } else {
            new z9(context, iaVar.resourceProvider).show();
        }
    }

    public static void F0(hz0 hz0Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.c6 c6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((ez0) hz0Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        d90 d90Var = new d90(textView, AndroidUtilities.dp(90.0f), 0, c6Var);
        d90Var.a(org.telegram.ui.ActionBar.g6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.g6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(d90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                int i11 = starGift.availability_remains;
                textView.setText(i11 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i11, LocaleController.formatNumber(starGift.availability_total, ',')));
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
        final s7 y8 = s7.y(i10, false);
        final long j10 = starGift.id;
        final ag.i0 i0Var = new ag.i0(textView, 23);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() { // from class: jh.y6
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                s7 s7Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = NotificationCenter.starGiftsLoaded) || (J = (s7Var = s7.this).J(j10)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(s7Var.a).removeObserver(notificationCenterDelegateArr[0], i14);
                i0Var.run(J);
            }
        };
        int i12 = y8.a;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
        int i13 = NotificationCenter.starGiftsLoaded;
        notificationCenter.addObserver(notificationCenterDelegate, i13);
        TL_stars.StarGift J = y8.J(j10);
        if (J != null) {
            zArr[0] = true;
            NotificationCenter.getInstance(i12).removeObserver(notificationCenterDelegateArr[0], i13);
            i0Var.run(J);
        }
    }

    public static void G0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new g9(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount) {
        return J0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount, float f9, char c3) {
        double d;
        int i10;
        if (e0 == null) {
            e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(starsAmount.negative() ? "-" : "");
                sb2.append(LocaleController.formatNumber(Math.abs(starsAmount.amount / 1000000000), c3));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
            String format = e0.format(j10 / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f9), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            boolean z10 = false;
            if (i11 < 0 && j11 > 0) {
                d = 1.0E9d;
                i10 = -1;
            } else if (i11 <= 0 || j11 >= 0) {
                d = 1.0E9d;
                i10 = 0;
            } else {
                d = 1.0E9d;
                i10 = 1;
            }
            long j12 = i10 + j11;
            if (j11 != 0 ? j11 < 0 : i11 < 0) {
                z10 = true;
            }
            if (i11 == 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(LocaleController.formatNumber(Math.abs(j12), c3));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(LocaleController.formatNumber(Math.abs(j12), c3));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = e0;
            int i12 = starsAmount.nanos;
            double d10 = i12;
            if (i12 < 0) {
                d10 += d;
            }
            String format2 = decimalFormat.format(d10 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f9), length + 1, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f9, char c3) {
        double d;
        int i10;
        if (e0 == null) {
            e0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = e0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f9), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            if (i11 < 0 && j10 > 0) {
                i10 = -1;
                d = 1.0E9d;
            } else if (i11 <= 0 || j10 >= 0) {
                d = 1.0E9d;
                i10 = 0;
            } else {
                d = 1.0E9d;
                i10 = 1;
            }
            long j11 = i10 + j10;
            boolean z10 = j10 != 0 ? j10 < 0 : i11 < 0;
            if (Math.abs(j11) > 1000 || starsAmount.nanos == 0) {
                if (starsAmount.amount <= 1000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(z10 ? "-" : "");
                    sb2.append(LocaleController.formatNumber(Math.abs(j11), c3));
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
            sb4.append(LocaleController.formatNumber(Math.abs(j11), c3));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = e0;
            int i12 = starsAmount.nanos;
            double d10 = i12;
            if (i12 < 0) {
                d10 += d;
            }
            String format2 = decimalFormat.format(d10 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                String substring = format2.substring(indexOf2);
                if (substring.length() > 1) {
                    spannableStringBuilder.append((CharSequence) substring.substring(0, Math.min(substring.length(), 3)));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f9), length + 1, spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
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
        int i11 = starsAmount.nanos;
        boolean z10 = false;
        if (i11 < 0 && j10 > 0) {
            i10 = -1;
            d = 1.0E9d;
        } else if (i11 <= 0 || j10 >= 0) {
            d = 1.0E9d;
            i10 = 0;
        } else {
            d = 1.0E9d;
            i10 = 1;
        }
        long j11 = i10 + j10;
        if (j10 != 0 ? j10 < 0 : i11 < 0) {
            z10 = true;
        }
        if (i11 == 0) {
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
        int i12 = starsAmount.nanos;
        double d10 = i12;
        if (i12 < 0) {
            d10 += d;
        }
        String format2 = decimalFormat.format(d10 / d);
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
    public static String N0(int i10, boolean z10, TL_stars.StarsTransaction starsTransaction) {
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
        int i11 = starsTransaction.flags;
        if ((131072 & i11) == 0 && (65536 & i11) != 0) {
            return LocaleController.formatString(R.string.StarTransactionCommission, ph.j.G0(starsTransaction.starref_commission_permille));
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
            int i12 = starsTransaction.subscription_period;
            if (i12 == 2592000) {
                return LocaleController.getString(R.string.StarSubscriptionPurchase);
            }
            if (i12 == 300) {
                return "5-minute subscription fee";
            }
            if (i12 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i11 & 8192) != 0) {
            return LocaleController.getString(R.string.StarsGiveawayPrizeReceived);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return LocaleController.getString(UserObject.isUserSelf(MessagesController.getInstance(i10).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction.sent_by)))) ? R.string.StarsGiftSent : R.string.StarsGiftReceived);
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
        int i13 = R.string.StarsTransactionWithdrawFragment;
        return LocaleController.getString(i13);
    }

    public static SpannableStringBuilder O0(CharSequence charSequence, float f9) {
        return P0(charSequence, f9, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder P0(CharSequence charSequence, float f9, float f10, float f11) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        iq iqVar = new iq(R.drawable.diamond, 0);
        iqVar.recolorDrawable = false;
        iqVar.translate(0.0f, f10);
        iqVar.spaceScaleX = f11;
        iqVar.setScale(f9, f9);
        spannableString.setSpan(iqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder R0(CharSequence charSequence, float f9, iq[] iqVarArr) {
        return U0(false, charSequence, f9, iqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z10) {
        return U0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z10, CharSequence charSequence, float f9, iq[] iqVarArr, float f10, float f11) {
        iq iqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (iqVarArr == null || (iqVar = iqVarArr[0]) == null) {
            iqVar = new iq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (iqVarArr != null) {
                iqVarArr[0] = iqVar;
            }
        }
        iqVar.translate(0.0f, f10);
        iqVar.spaceScaleX = f11;
        if (z10) {
            float f12 = f9 * 0.2f;
            iqVar.setScale(f12, f12);
        } else {
            iqVar.setScale(f9, f9);
        }
        spannableString.setSpan(iqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z10, String str, iq[] iqVarArr) {
        iq iqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (iqVarArr == null || (iqVar = iqVarArr[0]) == null) {
            iqVar = new iq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            iqVar.setScale(z10 ? 0.222f : 1.13f, z10 ? 0.222f : 1.13f);
        }
        if (iqVarArr != null) {
            iqVarArr[0] = iqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(iqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, iq[] iqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, iqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f9, iq[] iqVarArr) {
        iq iqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i10 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (iqVarArr == null || (iqVar = iqVarArr[0]) == null) {
            if (iqVarArr == null || iqVarArr.length <= 0) {
                iqVar = new iq(i10, 0);
            } else {
                iqVar = new iq(i10, 0);
                iqVarArr[0] = iqVar;
            }
        }
        if (z10) {
            f9 *= 0.33f;
        } else {
            iqVar.recolorDrawable = false;
        }
        iqVar.setScale(f9, f9);
        spannableString.setSpan(iqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static k8 Y0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final ag.d1 d1Var = new ag.d1(z10, currentAccount, str, imageReceiver, new boolean[1]);
        d1Var.run();
        final int i10 = 0;
        final int i11 = 1;
        return new k8(NotificationCenter.getInstance(currentAccount).listen(view, z10 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: jh.j8
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        d1Var.run();
                        break;
                    default:
                        d1Var.run();
                        break;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: jh.j8
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        d1Var.run();
                        break;
                    default:
                        d1Var.run();
                        break;
                }
            }
        }), 0);
    }

    public static void Z0(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i10);
        imageReceiver.setImage(ImageLocation.getForDocument(document), com.google.android.recaptcha.internal.a.k(i10, "_", i10), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), com.google.android.recaptcha.internal.a.k(i10, "_", i10), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.a7, 0.35f), 0L, null, null, 0);
    }

    public static void a1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        Z0(imageReceiver, starGift == null ? null : starGift.getDocument(), i10);
    }

    public static void b1(org.telegram.ui.Components.t9 t9Var, ImageReceiver imageReceiver, long j10) {
        Y0(t9Var, imageReceiver, j10 <= 1000 ? "2⃣" : j10 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static k8 c1(org.telegram.ui.Components.t9 t9Var, ImageReceiver imageReceiver, int i10) {
        return Y0(t9Var, imageReceiver, i10 != 3 ? i10 != 6 ? i10 != 12 ? i10 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void d1(org.telegram.ui.Components.t9 t9Var, ImageReceiver imageReceiver, long j10) {
        Y0(t9Var, imageReceiver, j10 <= 10000000000L ? "2⃣" : j10 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void e1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.c6 c6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, i7.f6.t(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 7, 0, 0, 0, 10));
        i9 i9Var = new i9(context, 70, 0);
        frameLayout.addView(i9Var, i7.f6.c(-1.0f, -1));
        int i11 = 2;
        dg.i iVar = new dg.i(context, 1, 2);
        dg.a aVar = iVar.b;
        aVar.w = org.telegram.ui.ActionBar.g6.fk;
        aVar.x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        iVar.setStarParticlesView(i9Var);
        frameLayout.addView(iVar, i7.f6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView i12 = th.i(g10, textView, i7.f6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i12.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(20.0f), -6915073));
        i12.setTextColor(-1);
        i12.setTextSize(1, 11.33f);
        i12.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        i12.setGravity(17);
        i12.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i13 = boost.multiplier;
        if (i13 == 0) {
            i13 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i13));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        iq iqVar = new iq(R.drawable.mini_boost_badge, 2);
        iqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
        i12.setText(spannableStringBuilder);
        g10.addView(i12, i7.f6.t(-2, 20, 17, 20, 4, 20, 4));
        hz0 hz0Var = new hz0(context, c6Var);
        hz0Var.k(LocaleController.getString(R.string.BoostFrom), i10, j10, new v7(f3VarArr, j10, i11));
        hz0Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            g5.v vVar = new g5.v(f3VarArr, j10, boost, 4);
            f3VarArr = f3VarArr;
            hz0Var.g(string, string2, vVar);
        }
        hz0Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        hz0Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        g10.addView(hz0Var, i7.f6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        y80 y80Var = new y80(context, c6Var);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.e(context, 7)));
        y80Var.setGravity(17);
        g10.addView(y80Var, i7.f6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        nh.d dVar = new nh.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new b8(f3VarArr, 1));
        g10.addView(dVar, i7.f6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        q6.customView = g10;
        f3VarArr[0] = q6;
        q6.useBackgroundTopPadding = false;
        q6.fixNavigationBar();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            f3VarArr[0].makeAttached(U);
        }
        iVar.setPaused(false);
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new o(iVar, 11));
    }

    public static w0 f1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        kf.b bVar = kf.b.a;
        w0 w0Var = new w0(context, c6Var, i10, tL_starGiftUnique == null ? kf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(kf.b.b) : tL_starGiftUnique.getResellAmount(bVar), new ih.b1(8, callback2, r8));
        w0[] w0VarArr = {w0Var};
        w0Var.show();
        return w0VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        Object[] objArr = 0;
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        linearLayout.addView(textView, i7.f6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        uc0 uc0Var = new uc0(context, c6Var);
        uc0Var.setForceForceUseCenter(true);
        uc0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        uc0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        nh.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uf, c6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vf, c6Var));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new m8(uc0Var, editTextBoldCursor, objArr == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, i7.f6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, i7.f6.o(-1, -2, 1.0f, 119));
        uc0Var.e(editTextBoldCursor);
        uc0Var.addView(linearLayout2, i7.f6.e(-1, -2, 48));
        linearLayout.addView(uc0Var, i7.f6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
        uc0Var.addView(textView2, i7.f6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        y80 y80Var = new y80(context, null);
        y80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new e2.e(context, 8)), true));
        y80Var.setTextSize(1, 12.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        linearLayout.addView(y80Var, i7.f6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        o10.g(LocaleController.getString(j10 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(o10, i7.f6.n(-1, 48));
        if (j10 > 0 && z10) {
            dVar = org.telegram.messenger.x3.o(24, context, c6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, i7.f6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        q6.customView = linearLayout;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2 = {q6};
        editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
        editTextBoldCursor.addTextChangedListener(new h9(editTextBoldCursor, uc0Var, j10, z10, o10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: jh.n8
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                if (i11 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                o10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new p8(editTextBoldCursor2, f3VarArr2, 2));
                return true;
            }
        });
        o10.setOnClickListener(new o8(zArr, callback2, editTextBoldCursor, o10, f3VarArr2));
        if (dVar != null) {
            nh.d dVar2 = dVar;
            o8 o8Var = new o8(zArr, callback2, dVar2, editTextBoldCursor, f3VarArr2);
            f3VarArr = f3VarArr2;
            dVar2.setOnClickListener(o8Var);
        } else {
            f3VarArr = f3VarArr2;
        }
        f3VarArr[0].fixNavigationBar();
        f3VarArr[0].setOnDismissListener(new cg.d0(editTextBoldCursor, 4));
        f3VarArr[0].show();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new p8(f3VarArr, editTextBoldCursor), R instanceof tn ? ((tn) R).P9() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0ff2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x103a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x1097  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x10cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x10ed  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x10d6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x10a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1085  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0ea8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0db3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0e77  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0eae A[LOOP:0: B:66:0x0e22->B:75:0x0eae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0eba A[EDGE_INSN: B:76:0x0eba->B:77:0x0eba BREAK  A[LOOP:0: B:66:0x0e22->B:75:0x0eae], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0f34 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0f46  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f49  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0f59  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0fbc  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.f3 h1(final Context context, final boolean z10, final long j10, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        boolean z11;
        Context context2;
        int i11;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z12;
        boolean z13;
        long j11;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.Peer peer;
        String str2;
        long j12;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        int i12;
        org.telegram.ui.ActionBar.f3[] f3VarArr2;
        float f9;
        int i13;
        String string;
        TL_stars.StarGift starGift;
        TL_stars.StarsTransaction starsTransaction3;
        ViewGroup viewGroup;
        final org.telegram.ui.ActionBar.f3[] f3VarArr3;
        org.telegram.ui.ActionBar.c6 c6Var3;
        TL_stars.StarsTransaction starsTransaction4;
        org.telegram.ui.ActionBar.f3[] f3VarArr4;
        Context context3;
        int i14;
        hz0 hz0Var;
        final org.telegram.ui.ActionBar.f3[] f3VarArr5;
        hz0 hz0Var2;
        hz0 hz0Var3;
        hz0 hz0Var4;
        hz0 hz0Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z14;
        TL_stars.StarGift starGift2;
        Context context4;
        org.telegram.ui.ActionBar.o2 U;
        int i15;
        ImageLocation imageLocation2;
        ImageLocation forDocument2;
        hz0 hz0Var6;
        final int i16;
        hz0 hz0Var7;
        final org.telegram.ui.ActionBar.f3[] f3VarArr6;
        long j13;
        hz0 hz0Var8;
        long j14;
        TL_stars.StarsAmount starsAmount;
        ViewGroup viewGroup2;
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
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        org.telegram.ui.ActionBar.f3[] f3VarArr7 = new org.telegram.ui.ActionBar.f3[1];
        final LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(0, AndroidUtilities.dp((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                f3VarArr = f3VarArr7;
                f3Var = q6;
                m9 m9Var = new m9(context, matrix, radialGradient, paint, n5Var);
                n5Var.l(m9Var);
                n5Var.i(stargiftattributepattern.document, false);
                m9Var.setOrientation(1);
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
                a1(t9Var.getImageReceiver(), starsTransaction.stargift, 160);
                m9Var.addView(t9Var, i7.f6.t(160, 160, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    i7.h6.a(t9Var);
                    t9Var.setOnClickListener(new bg.p2(context, i10, tL_starGiftUnique, 3));
                }
                TextView b10 = i7.j6.b(context, 20.0f, 0, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                m9Var.addView(b10, i7.f6.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = i7.j6.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                m9Var.addView(b11, i7.f6.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = i7.j6.b(context, 18.0f, 0, true, null);
                b12.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                b12.setText(T0(starsAmount3, TextUtils.concat(positive ? "+" : "", I0(starsAmount3), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b12.getText());
                if (starsTransaction.refund) {
                    G0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction.failed) {
                    G0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction.pending) {
                    G0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsPending));
                }
                b12.setText(spannableStringBuilder);
                m9Var.addView(b12, i7.f6.t(-2, -2, 17, 0, 11, 0, 17));
                g10.addView(m9Var, i7.f6.n(-1, -2));
                c6Var2 = c6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = g10;
                str = "";
                z12 = z18;
                f3VarArr2 = f3VarArr;
                f9 = 16.0f;
                hz0 hz0Var9 = new hz0(context2, c6Var2);
                starGift = starsTransaction2.stargift;
                if (starGift == null) {
                    if (starsTransaction2.stargift_upgrade) {
                        if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                            starsTransaction4 = starsTransaction2;
                            viewGroup2 = linearLayout;
                        } else {
                            vc vcVar = (vc) ((ez0) hz0Var9.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                            tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                            viewGroup2 = linearLayout;
                            Context context5 = context2;
                            starsTransaction4 = starsTransaction;
                            s7.w(i10).M(tL_inputSavedStarGiftUser, new d8(vcVar, i10, context5, c6Var2, 0));
                        }
                        TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction4.peer;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                            long peerDialogId = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer2).peer);
                            String string2 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                            Runnable v7Var = new v7(f3VarArr2, peerDialogId, 1);
                            i14 = i10;
                            hz0 hz0Var10 = hz0Var9;
                            org.telegram.ui.ActionBar.f3[] f3VarArr8 = f3VarArr2;
                            c6Var3 = c6Var;
                            hz0Var10.k(string2, i14, peerDialogId, v7Var);
                            context3 = context;
                            viewGroup = viewGroup2;
                            f3VarArr4 = f3VarArr8;
                            hz0Var5 = hz0Var10;
                            starsTransactionPeer = starsTransaction4.peer;
                            if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) || (starsTransaction4.flags & 256) == 0) {
                                z14 = z15;
                            } else {
                                long peerDialogId2 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                                if (z10) {
                                    peerDialogId2 = j10;
                                }
                                TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId2));
                                if (chat != null) {
                                    y80 y80Var = new y80(context3, c6Var3);
                                    y80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                    y80Var.setEllipsize(TextUtils.TruncateAt.END);
                                    int i18 = org.telegram.ui.ActionBar.g6.gc;
                                    y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, c6Var3));
                                    y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i18, c6Var3));
                                    y80Var.setTextSize(1, 14.0f);
                                    y80Var.setDisablePaddingsOffsetY(true);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                                    if (starsTransaction4.extended_media.isEmpty()) {
                                        z14 = z15;
                                    } else {
                                        ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction4.extended_media;
                                        int size = arrayList.size();
                                        z14 = z15;
                                        int i19 = 0;
                                        int i20 = 0;
                                        while (i19 < size) {
                                            TLRPC.MessageMedia messageMedia = arrayList.get(i19);
                                            int i21 = i19 + 1;
                                            TLRPC.MessageMedia messageMedia2 = messageMedia;
                                            ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                            int i22 = size;
                                            f70 f70Var = new f70(y80Var, 24.0f, i14);
                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                                i15 = i20;
                                                forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia2.photo);
                                            } else {
                                                i15 = i20;
                                                if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                                    forDocument2 = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia2.document);
                                                } else {
                                                    imageLocation2 = null;
                                                    if (imageLocation2 == null) {
                                                        f70Var.a(6.0f);
                                                        f70Var.b.setImage(imageLocation2, "24_24", null, null, null, 0);
                                                        SpannableString spannableString = new SpannableString("x");
                                                        spannableString.setSpan(f70Var, 0, spannableString.length(), 33);
                                                        spannableStringBuilder2.append((CharSequence) spannableString);
                                                        spannableStringBuilder2.append((CharSequence) " ");
                                                        i20 = i15 + 1;
                                                    } else {
                                                        i20 = i15;
                                                    }
                                                    if (i20 < 3) {
                                                        break;
                                                    }
                                                    i19 = i21;
                                                    size = i22;
                                                    arrayList = arrayList2;
                                                }
                                            }
                                            imageLocation2 = forDocument2;
                                            if (imageLocation2 == null) {
                                            }
                                            if (i20 < 3) {
                                            }
                                        }
                                    }
                                    spannableStringBuilder2.append((CharSequence) " ");
                                    int length = spannableStringBuilder2.length();
                                    String publicUsername = ChatObject.getPublicUsername(chat);
                                    if (TextUtils.isEmpty(publicUsername)) {
                                        spannableStringBuilder2.append((CharSequence) chat.title);
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        th.w(sb2, MessagesController.getInstance(i14).linkPrefix, "/", publicUsername, "/");
                                        sb2.append(starsTransaction4.msg_id);
                                        spannableStringBuilder2.append((CharSequence) sb2.toString());
                                    }
                                    w7 w7Var = new w7(f3VarArr4, peerDialogId2, starsTransaction4);
                                    spannableStringBuilder2.setSpan(new c9(w7Var), length, spannableStringBuilder2.length(), 33);
                                    y80Var.setSingleLine(true);
                                    y80Var.setEllipsize(TextUtils.TruncateAt.END);
                                    y80Var.setText(spannableStringBuilder2);
                                    y80Var.setOnClickListener(new ag.o(w7Var, 22));
                                    hz0Var5.i(y80Var, LocaleController.getString(starsTransaction4.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                                } else {
                                    z14 = z15;
                                }
                            }
                            if (!TextUtils.isEmpty(starsTransaction4.id) && !z19) {
                                String string3 = LocaleController.getString(R.string.StarsTransactionID);
                                String str3 = starsTransaction4.id;
                                hz0Var5.h(string3, str3, str3.length() <= 25 ? 9 : 10, new w2(12, f3VarArr4, c6Var3));
                            }
                            if (starsTransaction4.floodskip && starsTransaction4.floodskip_number > 0) {
                                hz0Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                            }
                            hz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                            starGift2 = starsTransaction4.stargift;
                            if (starGift2 != null) {
                                if (starGift2.limited) {
                                    F0(hz0Var5, i14, starGift2, c6Var3);
                                }
                                if (!TextUtils.isEmpty(starsTransaction4.description)) {
                                    hz0Var5.a(new SpannableStringBuilder(starsTransaction4.description));
                                }
                            }
                            ViewGroup viewGroup3 = viewGroup;
                            viewGroup3.addView(hz0Var5, i7.f6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                            if ((starsTransaction4.flags & 32) != 0) {
                                hz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.transaction_date * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
                            }
                            if (z14) {
                                context4 = context;
                            } else {
                                context4 = context;
                                y80 y80Var2 = new y80(context4, c6Var3);
                                y80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var3));
                                y80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var3));
                                y80Var2.setTextSize(1, 14.0f);
                                y80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.e(context4, 4)));
                                y80Var2.setGravity(17);
                                viewGroup3.addView(y80Var2, i7.f6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                            }
                            nh.d dVar = new nh.d(context4, c6Var3);
                            dVar.e();
                            if ((starsTransaction4.flags & 32) != 0) {
                                dVar.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer));
                            } else {
                                dVar.h(LocaleController.getString(R.string.OK));
                            }
                            viewGroup3.addView(dVar, i7.f6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                            org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                            f3Var2.customView = viewGroup3;
                            int i23 = 0;
                            f3VarArr4[0] = f3Var2;
                            f3Var2.useBackgroundTopPadding = false;
                            if ((starsTransaction4.flags & 32) != 0) {
                                dVar.setOnClickListener(new ag.n(context4, starsTransaction4));
                            } else {
                                dVar.setOnClickListener(new b8(f3VarArr4, i23));
                            }
                            f3VarArr4[0].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                f3VarArr4[0].makeAttached(U);
                            }
                            f3VarArr4[0].show();
                            return f3VarArr4[0];
                        }
                        org.telegram.ui.ActionBar.f3[] f3VarArr9 = f3VarArr2;
                        i14 = i10;
                        c6Var3 = c6Var;
                        hz0Var6 = hz0Var9;
                        viewGroup = viewGroup2;
                        f3VarArr4 = f3VarArr9;
                    } else {
                        f3VarArr5 = f3VarArr2;
                        final Context context6 = context2;
                        starsTransaction4 = starsTransaction2;
                        c6Var3 = c6Var2;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            String str4 = starGift.slug;
                            if (!TextUtils.isEmpty(str4)) {
                                hz0Var9.g(LocaleController.getString(R.string.Gift2Gift), starsTransaction4.stargift.title + " #" + starsTransaction4.stargift.num, new ag.v0(context6, i10, str4, 8));
                            }
                            final long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                            long peerDialogId3 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction4.peer).peer);
                            if (!starsTransaction4.offer) {
                                if (starsTransaction4.stargift_resale) {
                                    if (negative) {
                                        hz0Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                                    } else {
                                        hz0Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                        j13 = clientUserId;
                                    }
                                } else if (starsTransaction4.stargift_drop_original_details) {
                                    hz0Var9.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                                    peerDialogId3 = clientUserId;
                                    j13 = peerDialogId3;
                                } else {
                                    hz0Var9.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                                }
                                j13 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else if (negative) {
                                hz0Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                                j13 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else {
                                hz0Var9.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                j13 = clientUserId;
                            }
                            if (peerDialogId3 != clientUserId) {
                                final long j15 = peerDialogId3;
                                final int i24 = 0;
                                hz0Var8 = hz0Var9;
                                viewGroup = linearLayout;
                                j14 = clientUserId;
                                hz0Var8.k(LocaleController.getString(R.string.Gift2From), i10, j15, new Runnable() { // from class: jh.e8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i24) {
                                            case 0:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j16 = j15;
                                                    Bundle g11 = j7.l1.g(j16, "user_id");
                                                    if (j16 == clientUserId) {
                                                        g11.putBoolean("my_profile", true);
                                                    }
                                                    g11.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(g11, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j17 = j15;
                                                    Bundle g12 = j7.l1.g(j17, "user_id");
                                                    if (j17 == clientUserId) {
                                                        g12.putBoolean("my_profile", true);
                                                    }
                                                    g12.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(g12, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                hz0Var8 = hz0Var9;
                                j14 = clientUserId;
                                viewGroup = linearLayout;
                            }
                            if (j13 != j14) {
                                final long j16 = j14;
                                final int i25 = 1;
                                final long j17 = j13;
                                hz0Var8.k(LocaleController.getString(R.string.Gift2To), i10, j17, new Runnable() { // from class: jh.e8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i25) {
                                            case 0:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j162 = j17;
                                                    Bundle g11 = j7.l1.g(j162, "user_id");
                                                    if (j162 == j16) {
                                                        g11.putBoolean("my_profile", true);
                                                    }
                                                    g11.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(g11, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j172 = j17;
                                                    Bundle g12 = j7.l1.g(j172, "user_id");
                                                    if (j172 == j16) {
                                                        g12.putBoolean("my_profile", true);
                                                    }
                                                    g12.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(g12, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            hz0 hz0Var11 = hz0Var8;
                            if ((peerDialogId3 == clientUserId || starsTransaction4.stargift_resale) && (starsAmount = starsTransaction4.starref_amount) != null && starsTransaction4.starref_commission_permille > 0) {
                                TL_stars.StarsAmount starsAmount4 = starsTransaction4.amount;
                                if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                    TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                    tL_starsTonAmount.amount = starsTransaction4.amount.amount + starsTransaction4.starref_amount.amount;
                                    iq[] iqVarArr = new iq[1];
                                    hz0Var11.d(W0(starsTransaction4.amount, "⭐️ " + ((Object) I0(tL_starsTonAmount)), iqVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                    iq iqVar = iqVarArr[0];
                                    if (iqVar != null) {
                                        iqVar.setOverrideColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var3));
                                    }
                                } else {
                                    hz0Var11.d(X0(starsTransaction4.amount instanceof TL_stars.TL_starsTonAmount, j7.l1.m(Math.abs(Math.round(starsTransaction4.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                }
                            }
                            i14 = i10;
                            hz0Var4 = hz0Var11;
                            context3 = context6;
                            f3VarArr4 = f3VarArr5;
                            hz0Var = hz0Var4;
                        } else {
                            viewGroup = linearLayout;
                            if (starsTransaction4.refund) {
                                i14 = i10;
                                hz0Var6 = hz0Var9;
                                f3VarArr4 = f3VarArr5;
                            } else {
                                long clientUserId2 = j10 == 0 ? UserConfig.getInstance(i10).getClientUserId() : j10;
                                final long peerDialogId4 = DialogObject.getPeerDialogId(starsTransaction4.peer.peer);
                                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId4));
                                if (positive) {
                                    if (peerDialogId4 != clientUserId2) {
                                        CharSequence string4 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                        Runnable w7Var2 = new w7(f3VarArr5, starsTransaction4, peerDialogId4, 3);
                                        String string5 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                        final int i26 = 0;
                                        i16 = i10;
                                        Runnable runnable = new Runnable() { // from class: jh.z7
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i26) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.f3 f3Var3 = f3VarArr5[0];
                                                        Objects.requireNonNull(f3Var3);
                                                        new ih.h2(context6, i16, peerDialogId4, null, new ag.i0(f3Var3, 22)).show();
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.f3 f3Var4 = f3VarArr5[0];
                                                        Objects.requireNonNull(f3Var4);
                                                        new ih.h2(context6, i16, peerDialogId4, null, new ag.i0(f3Var4, 22)).show();
                                                        break;
                                                }
                                            }
                                        };
                                        hz0 hz0Var12 = hz0Var9;
                                        f3VarArr6 = f3VarArr5;
                                        hz0Var12.j(string4, i16, peerDialogId4, w7Var2, string5, runnable);
                                        hz0Var7 = hz0Var12;
                                    } else {
                                        i16 = i10;
                                        hz0Var7 = hz0Var9;
                                        f3VarArr6 = f3VarArr5;
                                    }
                                    final int i27 = 1;
                                    hz0Var7.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i16, clientUserId2, new Runnable() { // from class: jh.x7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    f3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                                        bundle.putBoolean("my_profile", true);
                                                        U2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    f3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        U3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    f3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                                        bundle3.putBoolean("my_profile", true);
                                                        bundle3.putBoolean("open_gifts", true);
                                                        U4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    starsTransaction3 = starsTransaction;
                                    f3VarArr3 = f3VarArr6;
                                    hz0Var3 = hz0Var7;
                                } else {
                                    long j18 = clientUserId2;
                                    if (peerDialogId4 != j18) {
                                        final int i28 = 2;
                                        hz0Var9.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, j18, new Runnable() { // from class: jh.x7
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i28) {
                                                    case 0:
                                                        f3VarArr5[0].dismiss();
                                                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            Bundle bundle = new Bundle();
                                                            bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
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
                                                            bundle2.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
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
                                                            bundle3.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
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
                                    CharSequence string6 = LocaleController.getString(R.string.StarGiveawayPrizeTo);
                                    Runnable w7Var3 = new w7(f3VarArr5, starsTransaction, peerDialogId4, 4);
                                    starsTransaction3 = starsTransaction;
                                    String string7 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                    final int i29 = 1;
                                    hz0 hz0Var13 = hz0Var9;
                                    f3VarArr3 = f3VarArr5;
                                    hz0Var13.j(string6, i10, peerDialogId4, w7Var3, string7, new Runnable() { // from class: jh.z7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i29) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.f3 f3Var3 = f3VarArr5[0];
                                                    Objects.requireNonNull(f3Var3);
                                                    new ih.h2(context, i10, peerDialogId4, null, new ag.i0(f3Var3, 22)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.f3 f3Var4 = f3VarArr5[0];
                                                    Objects.requireNonNull(f3Var4);
                                                    new ih.h2(context, i10, peerDialogId4, null, new ag.i0(f3Var4, 22)).show();
                                                    break;
                                            }
                                        }
                                    });
                                    hz0Var3 = hz0Var13;
                                }
                                org.telegram.ui.ActionBar.f3[] f3VarArr10 = f3VarArr3;
                                starsTransaction4 = starsTransaction3;
                                f3VarArr4 = f3VarArr10;
                                context3 = context;
                                i14 = i10;
                                hz0Var = hz0Var3;
                            }
                        }
                    }
                    context3 = context;
                    hz0Var5 = hz0Var6;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                        String string32 = LocaleController.getString(R.string.StarsTransactionID);
                        String str32 = starsTransaction4.id;
                        hz0Var5.h(string32, str32, str32.length() <= 25 ? 9 : 10, new w2(12, f3VarArr4, c6Var3));
                    }
                    if (starsTransaction4.floodskip) {
                        hz0Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                    }
                    hz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup32 = viewGroup;
                    viewGroup32.addView(hz0Var5, i7.f6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    nh.d dVar2 = new nh.d(context4, c6Var3);
                    dVar2.e();
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    viewGroup32.addView(dVar2, i7.f6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var22 = f3Var;
                    f3Var22.customView = viewGroup32;
                    int i232 = 0;
                    f3VarArr4[0] = f3Var22;
                    f3Var22.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    f3VarArr4[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        f3VarArr4[0].makeAttached(U);
                    }
                    f3VarArr4[0].show();
                    return f3VarArr4[0];
                }
                starsTransaction3 = starsTransaction2;
                viewGroup = linearLayout;
                hz0 hz0Var14 = hz0Var9;
                f3VarArr3 = f3VarArr2;
                c6Var3 = c6Var2;
                TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction3.peer;
                if (!(starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer)) {
                    starsTransaction4 = starsTransaction3;
                    f3VarArr4 = f3VarArr3;
                    context3 = context;
                    i14 = i10;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                        if (starsTransaction4.gift) {
                            y80 y80Var3 = new y80(context3, c6Var3);
                            y80Var3.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                            y80Var3.setEllipsize(TextUtils.TruncateAt.END);
                            int i30 = org.telegram.ui.ActionBar.g6.gc;
                            y80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i30, c6Var3));
                            y80Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i30, c6Var3));
                            y80Var3.setTextSize(1, 14.0f);
                            y80Var3.setSingleLine(true);
                            y80Var3.setDisablePaddingsOffsetY(true);
                            org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(y80Var3, 24.0f, i14);
                            String string8 = LocaleController.getString(z15 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                            jq a2 = da.a(24, "fragment");
                            int dp = AndroidUtilities.dp(f9);
                            int dp2 = AndroidUtilities.dp(f9);
                            a2.e = dp;
                            a2.f = dp2;
                            g5Var.b.setImageBitmap(a2);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x  " + ((Object) string8));
                            spannableStringBuilder3.setSpan(g5Var, 0, 1, 33);
                            spannableStringBuilder3.setSpan(new b9(f3VarArr4, context3, z15), 3, spannableStringBuilder3.length(), 33);
                            y80Var3.setText(spannableStringBuilder3);
                            hz0Var14.i(y80Var3, LocaleController.getString(R.string.StarsTransactionRecipient));
                            hz0Var5 = hz0Var14;
                        } else {
                            hz0Var14.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                            hz0Var5 = hz0Var14;
                        }
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                        hz0Var14.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                        hz0Var5 = hz0Var14;
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                        hz0Var14.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                        hz0Var5 = hz0Var14;
                    } else {
                        hz0Var5 = hz0Var14;
                        if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            hz0Var14.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                            hz0Var5 = hz0Var14;
                        }
                    }
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    hz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322 = viewGroup;
                    viewGroup322.addView(hz0Var5, i7.f6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    nh.d dVar22 = new nh.d(context4, c6Var3);
                    dVar22.e();
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    viewGroup322.addView(dVar22, i7.f6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var222 = f3Var;
                    f3Var222.customView = viewGroup322;
                    int i2322 = 0;
                    f3VarArr4[0] = f3Var222;
                    f3Var222.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    f3VarArr4[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    f3VarArr4[0].show();
                    return f3VarArr4[0];
                }
                final long peerDialogId5 = DialogObject.getPeerDialogId(starsTransactionPeer3.peer);
                if (starsTransaction3.paid_message) {
                    hz0Var14.k(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i10, peerDialogId5, new v7(f3VarArr3, peerDialogId5, 3));
                    hz0Var3 = hz0Var14;
                    if (starsTransaction3.starref_amount != null) {
                        hz0Var3 = hz0Var14;
                        if (starsTransaction3.starref_commission_permille > 0) {
                            hz0Var14.d(X0(starsTransaction3.amount instanceof TL_stars.TL_starsTonAmount, j7.l1.m(Math.abs(Math.round(starsTransaction3.starref_amount.toDouble() + starsTransaction3.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            hz0Var3 = hz0Var14;
                        }
                    }
                } else {
                    if (z11) {
                        long peerDialogId6 = DialogObject.getPeerDialogId(starsTransaction3.starref_peer);
                        hz0Var14.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new v7(f3VarArr3, j10, 4));
                        hz0Var14.k(LocaleController.getString(R.string.StarAffiliate), i10, peerDialogId6, new v7(f3VarArr3, peerDialogId6, 5));
                        i14 = i10;
                        hz0Var14.k(LocaleController.getString(R.string.StarAffiliateReferredUser), i14, peerDialogId5, new v7(f3VarArr3, peerDialogId5, 6));
                        hz0Var2 = hz0Var14;
                        hz0Var2.d(ph.j.G0(starsTransaction3.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                        starsTransaction4 = starsTransaction3;
                        f3VarArr4 = f3VarArr3;
                        context3 = context;
                    } else if (z12) {
                        hz0Var14.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new t7(i10, context, j10, peerDialogId5, f3VarArr3, c6Var3));
                        hz0 hz0Var15 = hz0Var14;
                        hz0Var15.k(LocaleController.getString(R.string.StarAffiliateMiniApp), i10, peerDialogId5, new v7(f3VarArr3, peerDialogId5, 0));
                        hz0Var3 = hz0Var15;
                    } else if (z19) {
                        hz0Var14.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, peerDialogId5, new w7(f3VarArr3, starsTransaction3, peerDialogId5, 0));
                        final int i31 = 0;
                        hz0Var14.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i10, UserConfig.getInstance(i10).getClientUserId(), new Runnable() { // from class: jh.x7
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i31) {
                                    case 0:
                                        f3VarArr3[0].dismiss();
                                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                        if (U2 != null) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                            bundle.putBoolean("my_profile", true);
                                            U2.presentFragment(new ProfileActivity(bundle, null));
                                            break;
                                        }
                                        break;
                                    case 1:
                                        f3VarArr3[0].dismiss();
                                        org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                        if (U3 != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                            bundle2.putBoolean("my_profile", true);
                                            bundle2.putBoolean("open_gifts", true);
                                            U3.presentFragment(new ProfileActivity(bundle2, null));
                                            break;
                                        }
                                        break;
                                    default:
                                        f3VarArr3[0].dismiss();
                                        org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                            bundle3.putBoolean("my_profile", true);
                                            bundle3.putBoolean("open_gifts", true);
                                            U4.presentFragment(new ProfileActivity(bundle3, null));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        hz0Var2 = hz0Var14;
                        String string9 = LocaleController.getString(R.string.StarGiveawayReason);
                        String string10 = LocaleController.getString(R.string.StarGiveawayReasonLink);
                        Runnable w7Var4 = new w7(f3VarArr3, starsTransaction, peerDialogId5, 1);
                        starsTransaction4 = starsTransaction;
                        hz0Var2.g(string9, string10, w7Var4);
                        hz0Var2.d(L0(starsTransaction4.amount), LocaleController.getString(R.string.StarGiveawayGift));
                        context3 = context;
                        i14 = i10;
                        f3VarArr4 = f3VarArr3;
                    } else {
                        starsTransaction4 = starsTransaction3;
                        if (!starsTransaction4.subscription || z10) {
                            if (starsTransaction4.premium_gift) {
                                final int i32 = 1;
                                hz0Var14.k(LocaleController.getString(R.string.Gift2To), i10, peerDialogId5, new Runnable() { // from class: jh.y7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i32) {
                                            case 0:
                                                f3VarArr3[0].dismiss();
                                                long j19 = peerDialogId5;
                                                if (!UserObject.isService(j19)) {
                                                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(tn.R9(j19));
                                                        break;
                                                    }
                                                } else {
                                                    ye.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                f3VarArr3[0].dismiss();
                                                long j20 = peerDialogId5;
                                                if (!UserObject.isService(j20)) {
                                                    org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(tn.R9(j20));
                                                        break;
                                                    }
                                                } else {
                                                    ye.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr3[0].dismiss();
                                                long j21 = peerDialogId5;
                                                if (!UserObject.isService(j21)) {
                                                    org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(tn.R9(j21));
                                                        break;
                                                    }
                                                } else {
                                                    ye.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                hz0Var14.d(LocaleController.formatPluralStringComma("Months", starsTransaction4.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                            } else if (!starsTransaction4.posts_search) {
                                final int i33 = 2;
                                f3VarArr4 = f3VarArr3;
                                hz0 hz0Var16 = hz0Var14;
                                context3 = context;
                                i14 = i10;
                                hz0Var16.k(LocaleController.getString(R.string.StarsTransactionRecipient), i14, peerDialogId5, new Runnable() { // from class: jh.y7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i33) {
                                            case 0:
                                                f3VarArr3[0].dismiss();
                                                long j19 = peerDialogId5;
                                                if (!UserObject.isService(j19)) {
                                                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(tn.R9(j19));
                                                        break;
                                                    }
                                                } else {
                                                    ye.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                f3VarArr3[0].dismiss();
                                                long j20 = peerDialogId5;
                                                if (!UserObject.isService(j20)) {
                                                    org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(tn.R9(j20));
                                                        break;
                                                    }
                                                } else {
                                                    ye.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr3[0].dismiss();
                                                long j21 = peerDialogId5;
                                                if (!UserObject.isService(j21)) {
                                                    org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(tn.R9(j21));
                                                        break;
                                                    }
                                                } else {
                                                    ye.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                hz0Var = hz0Var16;
                            }
                            i14 = i10;
                            hz0Var = hz0Var14;
                            f3VarArr4 = f3VarArr3;
                            context3 = context;
                        } else {
                            final int i34 = 0;
                            f3VarArr5 = f3VarArr3;
                            hz0 hz0Var17 = hz0Var14;
                            i14 = i10;
                            hz0Var17.k(LocaleController.getString(R.string.StarSubscriptionTo), i14, peerDialogId5, new Runnable() { // from class: jh.y7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i34) {
                                        case 0:
                                            f3VarArr3[0].dismiss();
                                            long j19 = peerDialogId5;
                                            if (!UserObject.isService(j19)) {
                                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    U2.presentFragment(tn.R9(j19));
                                                    break;
                                                }
                                            } else {
                                                ye.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            f3VarArr3[0].dismiss();
                                            long j20 = peerDialogId5;
                                            if (!UserObject.isService(j20)) {
                                                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    U3.presentFragment(tn.R9(j20));
                                                    break;
                                                }
                                            } else {
                                                ye.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                        default:
                                            f3VarArr3[0].dismiss();
                                            long j21 = peerDialogId5;
                                            if (!UserObject.isService(j21)) {
                                                org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                if (U4 != null) {
                                                    U4.presentFragment(tn.R9(j21));
                                                    break;
                                                }
                                            } else {
                                                ye.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            context3 = context;
                            hz0Var4 = hz0Var17;
                            f3VarArr4 = f3VarArr5;
                            hz0Var = hz0Var4;
                        }
                    }
                    hz0Var = hz0Var2;
                }
                org.telegram.ui.ActionBar.f3[] f3VarArr102 = f3VarArr3;
                starsTransaction4 = starsTransaction3;
                f3VarArr4 = f3VarArr102;
                context3 = context;
                i14 = i10;
                hz0Var = hz0Var3;
                hz0Var5 = hz0Var;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                hz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup3222 = viewGroup;
                viewGroup3222.addView(hz0Var5, i7.f6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                nh.d dVar222 = new nh.d(context4, c6Var3);
                dVar222.e();
                if ((starsTransaction4.flags & 32) != 0) {
                }
                viewGroup3222.addView(dVar222, i7.f6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.f3 f3Var2222 = f3Var;
                f3Var2222.customView = viewGroup3222;
                int i23222 = 0;
                f3VarArr4[0] = f3Var2222;
                f3Var2222.useBackgroundTopPadding = false;
                if ((starsTransaction4.flags & 32) != 0) {
                }
                f3VarArr4[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                f3VarArr4[0].show();
                return f3VarArr4[0];
            }
        }
        f3Var = q6;
        f3VarArr = f3VarArr7;
        z11 = z17;
        final org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(context);
        if (starsTransaction.premium_gift) {
            c1(t9Var2, t9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            g10.addView(t9Var2, i7.f6.t(160, 160, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            jq a10 = org.telegram.ui.Cells.r6.a(100, "search");
            int dp3 = AndroidUtilities.dp(40.0f);
            int dp4 = AndroidUtilities.dp(40.0f);
            a10.e = dp3;
            a10.f = dp4;
            t9Var2.setImageDrawable(a10);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z19 || starsTransaction.gift) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = g10;
                    str = "";
                    z12 = z18;
                    z13 = z10;
                    j11 = j10;
                    c6Var2 = c6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        d1(t9Var2, t9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        b1(t9Var2, t9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(t9Var2, i7.f6.t(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = g10;
                    z13 = z10;
                    j11 = j10;
                    c6Var2 = c6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            t9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            z12 = z18;
                            t9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                            str = "";
                        } else {
                            z12 = z18;
                            t9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            if (z12) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z13) {
                                str2 = "";
                                j12 = j11;
                                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9();
                                if (j12 < 0) {
                                    str = str2;
                                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j12));
                                    e9Var.r(user2);
                                    t9Var2.e(user2, e9Var);
                                } else {
                                    str = str2;
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j12));
                                    e9Var.q(chat2);
                                    t9Var2.e(chat2, e9Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            str2 = "";
                            j12 = DialogObject.getPeerDialogId(peer);
                            org.telegram.ui.Components.e9 e9Var2 = new org.telegram.ui.Components.e9();
                            if (j12 < 0) {
                            }
                        }
                        linearLayout.addView(t9Var2, i7.f6.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z12 = z18;
                        jq a11 = org.telegram.ui.Cells.r6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int dp5 = AndroidUtilities.dp(40.0f);
                        int dp6 = AndroidUtilities.dp(40.0f);
                        a11.e = dp5;
                        a11.f = dp6;
                        t9Var2.setImageDrawable(a11);
                    }
                } else {
                    t9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia3.document);
                    } else {
                        imageLocation = null;
                        t9Var2.l(imageLocation, "100_100", null, null, null, 0);
                        g10.addView(t9Var2, i7.f6.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: jh.u7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                                long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i35 = 0; i35 < starsTransaction5.extended_media.size(); i35++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i35);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction5.msg_id;
                                    tL_message.dialog_id = peerDialogId7;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j19 = -peerDialogId7;
                                    tL_peerChannel.channel_id = j19;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j19;
                                    tL_message.date = starsTransaction5.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new MessageObject(i10, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.t1().K2(null, LaunchActivity.R(), c6Var);
                                PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new n9(t9Var2, g10, peerDialogId7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        c6Var2 = c6Var;
                        i11 = i10;
                        linearLayout = g10;
                        j11 = j10;
                        t9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z12 = z18;
                    }
                    imageLocation = forDocument;
                    t9Var2.l(imageLocation, "100_100", null, null, null, 0);
                    g10.addView(t9Var2, i7.f6.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: jh.u7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z10;
                            TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                            long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i35 = 0; i35 < starsTransaction5.extended_media.size(); i35++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i35);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction5.msg_id;
                                tL_message.dialog_id = peerDialogId7;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j19 = -peerDialogId7;
                                tL_peerChannel.channel_id = j19;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j19;
                                tL_message.date = starsTransaction5.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new MessageObject(i10, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.t1().K2(null, LaunchActivity.R(), c6Var);
                            PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new n9(t9Var2, g10, peerDialogId7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    c6Var2 = c6Var;
                    i11 = i10;
                    linearLayout = g10;
                    j11 = j10;
                    t9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z18;
                }
                TextView textView = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.g6.j5;
                org.telegram.ui.b.w(i12, c6Var2, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(N0(i11, z13, starsTransaction2));
                TextView i35 = th.i(linearLayout, textView, i7.f6.t(-1, -2, 17, 36, 0, 36, 4), context2);
                i35.setTextSize(1, 18.0f);
                i35.setTypeface(AndroidUtilities.bold());
                i35.setGravity(17);
                i35.setTextColor(org.telegram.ui.ActionBar.g6.v0(!positive ? org.telegram.ui.ActionBar.g6.uj : org.telegram.ui.ActionBar.g6.wj, c6Var2));
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                i35.setText(X0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, I0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(i35.getText());
                if (!starsTransaction2.refund) {
                    G0(spannableStringBuilder4, i35, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    i35.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, c6Var2));
                    G0(spannableStringBuilder4, i35, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    i35.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.yj, c6Var2));
                    G0(spannableStringBuilder4, i35, LocaleController.getString(R.string.StarsPending));
                }
                i35.setText(spannableStringBuilder4);
                linearLayout.addView(i35, i7.f6.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    y80 y80Var4 = new y80(context2);
                    y80Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var2));
                    y80Var4.setTextSize(1, 14.0f);
                    y80Var4.setGravity(17);
                    y80Var4.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var2));
                    y80Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, ph.j.G0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j11 == UserConfig.getInstance(i11).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), 2)) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new a8(j11, i11, 0)), true));
                    }
                    y80Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(y80Var4, i7.f6.t(-1, -2, 17, 36, 0, 36, 4));
                    f3VarArr2 = f3VarArr;
                    f9 = 16.0f;
                    hz0 hz0Var92 = new hz0(context2, c6Var2);
                    starGift = starsTransaction2.stargift;
                    if (starGift == null) {
                    }
                    hz0Var5 = hz0Var;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    hz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup32222 = viewGroup;
                    viewGroup32222.addView(hz0Var5, i7.f6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    nh.d dVar2222 = new nh.d(context4, c6Var3);
                    dVar2222.e();
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    viewGroup32222.addView(dVar2222, i7.f6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var22222 = f3Var;
                    f3Var22222.customView = viewGroup32222;
                    int i232222 = 0;
                    f3VarArr4[0] = f3Var22222;
                    f3Var22222.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    f3VarArr4[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    f3VarArr4[0].show();
                    return f3VarArr4[0];
                }
                if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z19 || starsTransaction2.gift)) {
                    TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                    TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                    boolean isUserSelf = UserObject.isUserSelf(user3);
                    if (isUserSelf) {
                        i35.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var2));
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i13 = 1;
                        i35.setText(X0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(I0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i13 = 1;
                    }
                    y80 y80Var5 = new y80(context2);
                    y80Var5.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var2));
                    f9 = 16.0f;
                    y80Var5.setTextSize(i13, 16.0f);
                    y80Var5.setGravity(17);
                    y80Var5.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var2));
                    y80Var5.setDisablePaddingsOffsetY(i13);
                    if (isUserSelf) {
                        int i36 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i13];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i36, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    f3VarArr2 = f3VarArr;
                    y80Var5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new c8(context2, f3VarArr2)), true)));
                    linearLayout.addView(y80Var5, i7.f6.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    f3VarArr2 = f3VarArr;
                    f9 = 16.0f;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        org.telegram.ui.b.m(i12, c6Var2, textView2, 1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, i7.f6.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                hz0 hz0Var922 = new hz0(context2, c6Var2);
                starGift = starsTransaction2.stargift;
                if (starGift == null) {
                }
                hz0Var5 = hz0Var;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                hz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup322222 = viewGroup;
                viewGroup322222.addView(hz0Var5, i7.f6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                nh.d dVar22222 = new nh.d(context4, c6Var3);
                dVar22222.e();
                if ((starsTransaction4.flags & 32) != 0) {
                }
                viewGroup322222.addView(dVar22222, i7.f6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.f3 f3Var222222 = f3Var;
                f3Var222222.customView = viewGroup322222;
                int i2322222 = 0;
                f3VarArr4[0] = f3Var222222;
                f3Var222222.useBackgroundTopPadding = false;
                if ((starsTransaction4.flags & 32) != 0) {
                }
                f3VarArr4[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                f3VarArr4[0].show();
                return f3VarArr4[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                t9Var2.setImageDrawable(new u4(t9Var2, starsTransaction.stargift, 94, 0.44f));
                g10.addView(t9Var2, i7.f6.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                a1(t9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                g10.addView(t9Var2, i7.f6.t(160, 160, 17, 0, -8, 0, 10));
            }
        }
        c6Var2 = c6Var;
        context2 = context;
        i11 = i10;
        starsTransaction2 = starsTransaction;
        linearLayout = g10;
        str = "";
        z12 = z18;
        z13 = z10;
        j11 = j10;
        TextView textView3 = new TextView(context2);
        i12 = org.telegram.ui.ActionBar.g6.j5;
        org.telegram.ui.b.w(i12, c6Var2, textView3, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(N0(i11, z13, starsTransaction2));
        TextView i352 = th.i(linearLayout, textView3, i7.f6.t(-1, -2, 17, 36, 0, 36, 4), context2);
        i352.setTextSize(1, 18.0f);
        i352.setTypeface(AndroidUtilities.bold());
        i352.setGravity(17);
        i352.setTextColor(org.telegram.ui.ActionBar.g6.v0(!positive ? org.telegram.ui.ActionBar.g6.uj : org.telegram.ui.ActionBar.g6.wj, c6Var2));
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        i352.setText(X0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, I0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(i352.getText());
        if (!starsTransaction2.refund) {
        }
        i352.setText(spannableStringBuilder42);
        linearLayout.addView(i352, i7.f6.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        f3VarArr2 = f3VarArr;
        f9 = 16.0f;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            org.telegram.ui.b.m(i12, c6Var2, textView22, 1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, i7.f6.t(-1, -2, 17, 36, 0, 36, 4));
        }
        hz0 hz0Var9222 = new hz0(context2, c6Var2);
        starGift = starsTransaction2.stargift;
        if (starGift == null) {
        }
        hz0Var5 = hz0Var;
        starsTransactionPeer = starsTransaction4.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z14 = z15;
        if (!TextUtils.isEmpty(starsTransaction4.id)) {
        }
        if (starsTransaction4.floodskip) {
        }
        hz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        starGift2 = starsTransaction4.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup3222222 = viewGroup;
        viewGroup3222222.addView(hz0Var5, i7.f6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction4.flags & 32) != 0) {
        }
        if (z14) {
        }
        nh.d dVar222222 = new nh.d(context4, c6Var3);
        dVar222222.e();
        if ((starsTransaction4.flags & 32) != 0) {
        }
        viewGroup3222222.addView(dVar222222, i7.f6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.f3 f3Var2222222 = f3Var;
        f3Var2222222.customView = viewGroup3222222;
        int i23222222 = 0;
        f3VarArr4[0] = f3Var2222222;
        f3Var2222222.useBackgroundTopPadding = false;
        if ((starsTransaction4.flags & 32) != 0) {
        }
        f3VarArr4[0].fixNavigationBar();
        U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet()) {
        }
        f3VarArr4[0].show();
        return f3VarArr4[0];
    }

    public static void i1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.c6 c6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.id = tL_messageActionPaymentRefunded.charge.id;
        starsTransaction.refund = true;
        h1(activity, false, 0L, i10, starsTransaction, c6Var);
    }

    public static void j1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.c6 c6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        h1(context, false, 0L, i10, starsTransaction, c6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0509  */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void x0(ia iaVar, int i10) {
        w41 G;
        char c3;
        String str;
        boolean z10;
        final boolean z11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i11;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        int i12;
        hz0 hz0Var;
        int i13;
        String str2;
        String str3;
        boolean z12;
        boolean z13;
        long currentTime;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2;
        final int i14;
        ?? r72;
        org.telegram.ui.ActionBar.o2 U;
        j9 j9Var = iaVar.c0;
        if (j9Var == null || (G = j9Var.G(i10)) == null) {
            return;
        }
        int i15 = G.d;
        if (i15 == -1) {
            iaVar.c0.N(true);
            return;
        }
        if (i15 == -2) {
            s7.y(iaVar.currentAccount, false).u();
            eg.w2.e0(1, BirthdayController.getInstance(iaVar.currentAccount).getState());
            return;
        }
        if (i15 == -3) {
            s7.y(iaVar.currentAccount, false).W();
            iaVar.c0.N(true);
            return;
        }
        if (i15 == -4) {
            if (MessagesController.getInstance(iaVar.currentAccount).isFrozen()) {
                org.telegram.ui.c.b(iaVar.currentAccount);
                return;
            } else {
                iaVar.presentFragment(new ph.d3(iaVar.getUserConfig().getClientUserId()));
                return;
            }
        }
        int i16 = 4;
        if (G.G(u9.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                s7.y(iaVar.currentAccount, false).f(iaVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new bh.v(i16, iaVar, G), null);
                return;
            }
            return;
        }
        if (G.G(aa.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = iaVar.getParentActivity();
            int i17 = iaVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.c6 resourceProvider = iaVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(parentActivity, resourceProvider, false, false);
            f3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.f3[] f3VarArr3 = new org.telegram.ui.ActionBar.f3[1];
            LinearLayout f9 = org.telegram.messenger.x3.f(parentActivity, 1);
            f9.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            f9.setClipChildren(false);
            f9.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            f9.addView(frameLayout, i7.f6.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            d9 d9Var = new d9(zArr, f3VarArr3);
            NotificationCenter.getInstance(i17).addObserver(d9Var, NotificationCenter.starSubscriptionsLoaded);
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(parentActivity);
            if (peerDialogId >= 0) {
                c3 = 0;
                TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                str = UserObject.getUserName(user);
                boolean isBot = UserObject.isBot(user);
                z10 = !isBot;
                z11 = isBot;
                chat = user;
            } else {
                c3 = 0;
                TLRPC.Chat chat3 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                str = chat3 == null ? "" : chat3.title;
                z10 = false;
                z11 = false;
                chat = chat3;
            }
            String str4 = str;
            if (starsSubscription.photo != null) {
                t9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
                chat2 = chat;
                t9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", null, null);
            } else {
                chat2 = chat;
                t9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                if (peerDialogId < 0) {
                    i11 = i17;
                    f3VarArr = f3VarArr3;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                    e9Var.q(chat4);
                    t9Var.e(chat4, e9Var);
                    frameLayout.addView(t9Var, i7.f6.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, i7.f6.e(28, 28, 17));
                        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, i7.f6.e(28, 28, 17));
                        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.j5, resourceProvider, textView, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                    }
                    f9.addView(textView, i7.f6.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, resourceProvider));
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i12 = tL_starsSubscriptionPricing.period;
                    if (i12 != 2592000) {
                        int i18 = R.string.StarsSubscriptionPrice;
                        Long valueOf = Long.valueOf(tL_starsSubscriptionPricing.amount);
                        Object[] objArr = new Object[1];
                        objArr[c3] = valueOf;
                        textView2.setText(X0(false, LocaleController.formatString(i18, objArr), 0.8f, null));
                    } else {
                        textView2.setText(X0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), i12 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    f9.addView(textView2, i7.f6.t(-1, -2, 17, 20, 0, 20, 4));
                    hz0Var = new hz0(parentActivity, resourceProvider);
                    y80 y80Var = new y80(parentActivity, resourceProvider);
                    y80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                    y80Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i19 = org.telegram.ui.ActionBar.g6.gc;
                    y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i19, resourceProvider));
                    y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i19, resourceProvider));
                    y80Var.setTextSize(1, 14.0f);
                    y80Var.setSingleLine(true);
                    y80Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(y80Var, 24.0f, i11);
                    if (peerDialogId < 0) {
                        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        boolean z14 = user2 == null || UserObject.isDeleted(user2);
                        str3 = UserObject.getUserName(user2);
                        g5Var.e(user2);
                        i13 = i19;
                        z12 = z14;
                        str2 = str4;
                    } else {
                        i13 = i19;
                        str2 = str4;
                        TLRPC.Chat chat5 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                        boolean z15 = chat5 == null;
                        str3 = chat5 != null ? chat5.title : "";
                        g5Var.b(chat5);
                        z12 = z15;
                    }
                    String str5 = str3;
                    z13 = z12;
                    int i20 = i11;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str5));
                    spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                    org.telegram.ui.ActionBar.f3[] f3VarArr4 = f3VarArr;
                    spannableStringBuilder.setSpan(new e9(f3VarArr4, peerDialogId), 3, spannableStringBuilder.length(), 33);
                    y80Var.setText(spannableStringBuilder);
                    if (!z13) {
                        hz0Var.i(y80Var, LocaleController.getString(peerDialogId < 0 ? R.string.StarsSubscriptionChannel : z10 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot));
                    }
                    if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                        hz0Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
                    }
                    hz0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i20).getCurrentTime();
                    hz0Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    f9.addView(hz0Var, i7.f6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    y80 y80Var2 = new y80(parentActivity, resourceProvider);
                    int i21 = org.telegram.ui.ActionBar.g6.z6;
                    y80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i21, resourceProvider));
                    int i22 = i13;
                    y80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                    final int i23 = 1;
                    y80Var2.setTextSize(1, 14.0f);
                    y80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i24 = i23;
                            Activity activity = parentActivity;
                            switch (i24) {
                                case 0:
                                    if (!activity.isFinishing()) {
                                        Handler handler = g.g;
                                        Method method = g.f;
                                        int i25 = Build.VERSION.SDK_INT;
                                        if (i25 < 28) {
                                            if (((i25 != 26 && i25 != 27) || method != null) && (g.e != null || g.d != null)) {
                                                try {
                                                    Object obj2 = g.c.get(activity);
                                                    if (obj2 != null && (obj = g.b.get(activity)) != null) {
                                                        Application application = activity.getApplication();
                                                        f fVar = new f(activity);
                                                        application.registerActivityLifecycleCallbacks(fVar);
                                                        handler.post(new ab.o(7, fVar, obj2));
                                                        try {
                                                            if (i25 == 26 || i25 == 27) {
                                                                Boolean bool = Boolean.FALSE;
                                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                            } else {
                                                                activity.recreate();
                                                            }
                                                            handler.post(new ab.o(8, application, fVar));
                                                            break;
                                                        } catch (Throwable th2) {
                                                            handler.post(new ab.o(8, application, fVar));
                                                            throw th2;
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
                                    ye.d.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                                    break;
                            }
                        }
                    }));
                    y80Var2.setGravity(17);
                    f9.addView(y80Var2, i7.f6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        f3VarArr2 = f3VarArr4;
                        i14 = i20;
                        y80 y80Var3 = new y80(parentActivity, resourceProvider);
                        y80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i21, resourceProvider));
                        y80Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                        y80Var3.setTextSize(1, 14.0f);
                        y80Var3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        y80Var3.setSingleLine(false);
                        y80Var3.setMaxLines(4);
                        y80Var3.setGravity(17);
                        f9.addView(y80Var3, i7.f6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            nh.d dVar = new nh.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r72 = 0;
                            dVar.g(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                            f9.addView(dVar, i7.f6.n(-1, 48));
                            t8 t8Var = new t8(dVar, starsSubscription, i14, f3VarArr2, resourceProvider, zArr, parentActivity);
                            i14 = i14;
                            dVar.setOnClickListener(t8Var);
                            f3Var.customView = f9;
                            f3VarArr2[r72] = f3Var;
                            f3Var.useBackgroundTopPadding = r72;
                            f3Var.setOnDismissListener(new bg.c0(i14, d9Var));
                            f3VarArr2[r72].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                f3VarArr2[r72].makeAttached(U);
                            }
                            f3VarArr2[r72].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        y80 y80Var4 = new y80(parentActivity, resourceProvider);
                        y80Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i21, resourceProvider));
                        y80Var4.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                        y80Var4.setTextSize(1, 14.0f);
                        y80Var4.setText(LocaleController.formatString(z11 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        y80Var4.setSingleLine(false);
                        y80Var4.setMaxLines(4);
                        y80Var4.setGravity(17);
                        f9.addView(y80Var4, i7.f6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        nh.d dVar2 = new nh.d(parentActivity, resourceProvider, true);
                        dVar2.g(LocaleController.getString(z11 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false, true);
                        f9.addView(dVar2, i7.f6.n(-1, 48));
                        String str6 = str2;
                        f3VarArr2 = f3VarArr4;
                        q8 q8Var = new q8(dVar2, i20, starsSubscription, f3VarArr2, peerDialogId, parentActivity, resourceProvider, z10, str6);
                        i14 = i20;
                        dVar2.setOnClickListener(q8Var);
                    } else {
                        String str7 = str2;
                        final boolean z16 = z10;
                        i14 = i20;
                        f3VarArr2 = f3VarArr4;
                        if (starsSubscription.bot_canceled) {
                            y80 y80Var5 = new y80(parentActivity, resourceProvider);
                            y80Var5.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                            y80Var5.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                            y80Var5.setTextSize(1, 14.0f);
                            y80Var5.setText(LocaleController.getString(z16 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                            y80Var5.setSingleLine(false);
                            y80Var5.setMaxLines(4);
                            y80Var5.setGravity(17);
                            f9.addView(y80Var5, i7.f6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            y80 y80Var6 = new y80(parentActivity, resourceProvider);
                            y80Var6.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                            y80Var6.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                            y80Var6.setTextSize(1, 14.0f);
                            y80Var6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                            y80Var6.setSingleLine(false);
                            y80Var6.setMaxLines(4);
                            y80Var6.setGravity(17);
                            f9.addView(y80Var6, i7.f6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                nh.d dVar3 = new nh.d(parentActivity, resourceProvider, true);
                                dVar3.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                                f9.addView(dVar3, i7.f6.n(-1, 48));
                                r8 r8Var = new r8(dVar3, starsSubscription, i14, f3VarArr2, chat2, str7);
                                i14 = i14;
                                dVar3.setOnClickListener(r8Var);
                            }
                        } else {
                            final TLRPC.Chat chat6 = chat2;
                            y80 y80Var7 = new y80(parentActivity, resourceProvider);
                            y80Var7.setTextColor(org.telegram.ui.ActionBar.g6.v0(i21, resourceProvider));
                            y80Var7.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                            y80Var7.setTextSize(1, 14.0f);
                            y80Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                            y80Var7.setSingleLine(false);
                            y80Var7.setMaxLines(4);
                            y80Var7.setGravity(17);
                            f9.addView(y80Var7, i7.f6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final nh.d dVar4 = new nh.d(parentActivity, resourceProvider, false);
                            dVar4.g(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                            dVar4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                            f9.addView(dVar4, i7.f6.n(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: jh.s8
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final nh.d dVar5 = dVar4;
                                    if (dVar5.J) {
                                        return;
                                    }
                                    dVar5.setLoading(true);
                                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                    tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                    final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                                    tL_changeStarsSubscription.subscription_id = starsSubscription2.id;
                                    final int i24 = i14;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i24);
                                    final TLObject tLObject = chat6;
                                    final boolean z17 = z16;
                                    final boolean z18 = z11;
                                    final org.telegram.ui.ActionBar.f3[] f3VarArr5 = f3VarArr2;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: jh.v8
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            AndroidUtilities.runOnUIThread(new w8(i24, dVar5, tLObject, starsSubscription2, z17, z18, f3VarArr5));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r72 = 0;
                    f3Var.customView = f9;
                    f3VarArr2[r72] = f3Var;
                    f3Var.useBackgroundTopPadding = r72;
                    f3Var.setOnDismissListener(new bg.c0(i14, d9Var));
                    f3VarArr2[r72].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        f3VarArr2[r72].makeAttached(U);
                    }
                    f3VarArr2[r72].show();
                }
                TLRPC.User user3 = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                e9Var.r(user3);
                t9Var.e(user3, e9Var);
            }
            i11 = i17;
            f3VarArr = f3VarArr3;
            frameLayout.addView(t9Var, i7.f6.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.j5, resourceProvider, textView3, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            f9.addView(textView3, i7.f6.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            textView22.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, resourceProvider));
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i12 = tL_starsSubscriptionPricing2.period;
            if (i12 != 2592000) {
            }
            f9.addView(textView22, i7.f6.t(-1, -2, 17, 20, 0, 20, 4));
            hz0Var = new hz0(parentActivity, resourceProvider);
            y80 y80Var8 = new y80(parentActivity, resourceProvider);
            y80Var8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            y80Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i192 = org.telegram.ui.ActionBar.g6.gc;
            y80Var8.setTextColor(org.telegram.ui.ActionBar.g6.v0(i192, resourceProvider));
            y80Var8.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i192, resourceProvider));
            y80Var8.setTextSize(1, 14.0f);
            y80Var8.setSingleLine(true);
            y80Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(y80Var8, 24.0f, i11);
            if (peerDialogId < 0) {
            }
            String str52 = str3;
            z13 = z12;
            int i202 = i11;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str52));
            spannableStringBuilder2.setSpan(g5Var2, 0, 1, 33);
            org.telegram.ui.ActionBar.f3[] f3VarArr42 = f3VarArr;
            spannableStringBuilder2.setSpan(new e9(f3VarArr42, peerDialogId), 3, spannableStringBuilder2.length(), 33);
            y80Var8.setText(spannableStringBuilder2);
            if (!z13) {
            }
            if (peerDialogId >= 0) {
                hz0Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
            }
            hz0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i202).getCurrentTime();
            hz0Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
            f9.addView(hz0Var, i7.f6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            y80 y80Var22 = new y80(parentActivity, resourceProvider);
            int i212 = org.telegram.ui.ActionBar.g6.z6;
            y80Var22.setTextColor(org.telegram.ui.ActionBar.g6.v0(i212, resourceProvider));
            int i222 = i13;
            y80Var22.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i222, resourceProvider));
            final int i232 = 1;
            y80Var22.setTextSize(1, 14.0f);
            y80Var22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i24 = i232;
                    Activity activity = parentActivity;
                    switch (i24) {
                        case 0:
                            if (!activity.isFinishing()) {
                                Handler handler = g.g;
                                Method method = g.f;
                                int i25 = Build.VERSION.SDK_INT;
                                if (i25 < 28) {
                                    if (((i25 != 26 && i25 != 27) || method != null) && (g.e != null || g.d != null)) {
                                        try {
                                            Object obj2 = g.c.get(activity);
                                            if (obj2 != null && (obj = g.b.get(activity)) != null) {
                                                Application application = activity.getApplication();
                                                f fVar = new f(activity);
                                                application.registerActivityLifecycleCallbacks(fVar);
                                                handler.post(new ab.o(7, fVar, obj2));
                                                try {
                                                    if (i25 == 26 || i25 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new ab.o(8, application, fVar));
                                                    break;
                                                } catch (Throwable th2) {
                                                    handler.post(new ab.o(8, application, fVar));
                                                    throw th2;
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
                            ye.d.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                            break;
                    }
                }
            }));
            y80Var22.setGravity(17);
            f9.addView(y80Var22, i7.f6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r72 = 0;
            f3Var.customView = f9;
            f3VarArr2[r72] = f3Var;
            f3Var.useBackgroundTopPadding = r72;
            f3Var.setOnDismissListener(new bg.c0(i14, d9Var));
            f3VarArr2[r72].fixNavigationBar();
            U = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
            }
            f3VarArr2[r72].show();
        }
    }

    public static void z0(ia iaVar, w41 w41Var, Boolean bool, String str) {
        if (iaVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            tc.a0(iaVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) w41Var.B, new Object[0])), R.raw.stars_topup).j();
            iaVar.P.c(true);
            s7.y(iaVar.currentAccount, false).T(true);
        } else if (str != null) {
            th.r(R.string.UnknownErrorCode, new Object[]{str}, tc.a0(iaVar), R.raw.error, 36);
        }
    }

    public final void H0(ArrayList arrayList, k51 k51Var) {
        if (getParentActivity() == null) {
            return;
        }
        s7 y8 = s7.y(this.currentAccount, false);
        ArrayList arrayList2 = y8.v;
        cg.h0 h0Var = (cg.h0) super.r0(getParentActivity());
        w41 w41Var = new w41(-2);
        w41Var.c = h0Var;
        arrayList.add(w41Var);
        arrayList.add(w41.k(this.Q));
        nh.d dVar = this.Z;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(w41.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(ph.f.a(-4, getThemedColor(org.telegram.ui.ActionBar.g6.uj), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(w41.B(null));
        }
        if (y8.e && !arrayList2.isEmpty()) {
            th.p(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = aa.a;
                w41 J = w41.J(aa.class);
                J.G = starsSubscription;
                arrayList.add(J);
            }
            if (y8.x) {
                arrayList.add(w41.o(arrayList.size(), 33));
            } else if (!y8.y) {
                w41 c3 = w41.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c3.q = true;
                arrayList.add(c3);
            }
            arrayList.add(w41.B(null));
        }
        boolean O = y8.O(0);
        this.a0 = O;
        if (O) {
            arrayList.add(w41.p(this.N, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
        } else {
            arrayList.add(w41.l(this.O));
        }
    }

    @Override // org.telegram.ui.z10, org.telegram.ui.ActionBar.o2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        this.N = new ha(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.O = new cg.h0(this, context, 2);
        super.createView(context);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setClickable(true);
        dg.i iVar = new dg.i(context, 1, 2);
        this.M = iVar;
        dg.a aVar = iVar.b;
        aVar.w = org.telegram.ui.ActionBar.g6.fk;
        aVar.x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        this.M.setStarParticlesView(this.e);
        this.L.addView(this.M, i7.f6.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new e2.e(context, 5)), true), this.L, null);
        this.c.setOverScrollMode(2);
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setOnItemClickListener(new bg.o(this, 7));
        n00 n00Var = new n00(getParentActivity());
        this.P = n00Var;
        this.s.addView(n00Var, i7.f6.c(-1.0f, -1));
        s7 y8 = s7.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        this.Q.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getParentActivity(), false, true, false);
        this.S = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.S.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.resourceProvider));
        this.R = new SpannableStringBuilder("S");
        f70 f70Var = new f70(this.S, 42.0f, this.currentAccount);
        xi0 xi0Var = new xi0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), "s" + R.raw.star_reaction, AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = f70Var.b;
        imageReceiver.setImageBitmap(xi0Var);
        imageReceiver.setAutoRepeat(2);
        f70Var.f = false;
        f70Var.h = -AndroidUtilities.dp(3.0f);
        this.R.setSpan(f70Var, 0, 1, 33);
        this.Q.addView(this.S, i7.f6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.T = textView;
        textView.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.T.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, this.resourceProvider));
        this.Q.addView(this.T, i7.f6.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        bg.x2 x2Var = new bg.x2(this, getParentActivity(), 8);
        this.V = x2Var;
        frameLayout2.addView(x2Var);
        nh.d dVar = new nh.d(getParentActivity(), this.resourceProvider, true);
        this.W = dVar;
        dVar.e();
        this.W.g("", false, true);
        final int i10 = 0;
        this.W.setOnClickListener(new View.OnClickListener(this) { // from class: jh.f8
            public final /* synthetic */ ia b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ia.B0(this.b, context);
                        break;
                    default:
                        new z9(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.V.addView(this.W, i7.f6.e(-1, 48, 119));
        ua1 ua1Var = new ua1(this, getParentActivity(), 4);
        this.X = ua1Var;
        frameLayout2.addView(ua1Var);
        nh.d dVar2 = new nh.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new iq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.Y.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: jh.f8
            public final /* synthetic */ ia b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ia.B0(this.b, context);
                        break;
                    default:
                        new z9(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.X.addView(this.Y, i7.f6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        nh.d dVar3 = new nh.d(getParentActivity(), this.resourceProvider, true);
        this.U = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new iq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.U.g(spannableStringBuilder2, false, true);
        final int i12 = 0;
        this.U.setOnClickListener(new View.OnClickListener(this) { // from class: jh.g8
            public final /* synthetic */ ia b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ia iaVar = this.b;
                        iaVar.presentFragment(new q(0, iaVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        ia.A0(this.b);
                        break;
                }
            }
        });
        this.X.addView(this.U, i7.f6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.Q.addView(frameLayout2, i7.f6.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        nh.d dVar4 = new nh.d(getParentActivity(), this.resourceProvider, false);
        this.Z = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new iq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.Z.g(spannableStringBuilder3, false, true);
        final int i13 = 1;
        this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: jh.g8
            public final /* synthetic */ ia b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        ia iaVar = this.b;
                        iaVar.presentFragment(new q(0, iaVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        ia.A0(this.b);
                        break;
                }
            }
        });
        this.Q.addView(this.Z, i7.f6.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        j9 j9Var = this.c0;
        if (j9Var != null) {
            j9Var.N(false);
        }
        b0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = b0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1(y8.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            j9 j9Var = this.c0;
            if (j9Var != null) {
                j9Var.N(true);
            }
            if (this.J == 0 && this.K < 0) {
                this.K = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            s7 y8 = s7.y(this.currentAccount, false);
            if (this.a0 != y8.O(0)) {
                this.a0 = y8.O(0);
                s0();
                j9 j9Var2 = this.c0;
                if (j9Var2 != null) {
                    j9Var2.N(true);
                }
                if (this.J == 0 && this.K < 0) {
                    this.K = 0;
                }
                l0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            j9 j9Var3 = this.c0;
            if (j9Var3 != null) {
                j9Var3.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            k1();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            k1();
        }
    }

    public final void k1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        s7 y8 = s7.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.R);
        spannableStringBuilder.append((CharSequence) J0(y8.p(), 0.66f, ' '));
        this.S.setText(spannableStringBuilder);
        this.W.g(LocaleController.getString(y8.p().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats h = b0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
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
            final int i10 = 0;
            this.V.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: jh.h8
                public final /* synthetic */ ia b;

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
            final int i11 = 1;
            this.X.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: jh.h8
                public final /* synthetic */ ia b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
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

    @Override // org.telegram.ui.z10
    public final f2.p0 n0() {
        j9 j9Var = new j9(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new bg.t1(this, 19), getResourceProvider());
        this.c0 = j9Var;
        j9Var.r = false;
        return j9Var;
    }

    @Override // org.telegram.ui.z10
    public final y10 o0() {
        return new t9(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        s7.y(this.currentAccount, false).T(true);
        s7.y(this.currentAccount, false).S();
        s7.y(this.currentAccount, false).z();
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

    @Override // org.telegram.ui.z10, org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        dg.i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(true);
            this.M.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.z10, org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        dg.i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(false);
            this.M.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.z10
    public final cg.s2 p0() {
        return new i9(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.z10
    public final boolean q0() {
        ha haVar = this.N;
        boolean z10 = false;
        if (haVar != null && (haVar.getParent() instanceof View)) {
            if ((this.c.getHeight() - this.c.getPaddingBottom()) - ((View) this.N.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.z10
    public final View r0(Context context) {
        throw null;
    }
}
