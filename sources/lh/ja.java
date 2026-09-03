package lh;

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
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai;
import org.telegram.ui.m20;
import org.telegram.ui.n20;
import org.telegram.ui.pb1;
import org.telegram.ui.r70;
import org.telegram.ui.ro;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class ja extends n20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat e0;
    public static DecimalFormat f0;
    public FrameLayout M;
    public fg.i N;
    public ia O;
    public eg.h0 P;
    public s00 Q;
    public LinearLayout R;
    public SpannableStringBuilder S;
    public org.telegram.ui.Components.k6 T;
    public TextView U;
    public ph.d V;
    public dg.u2 W;
    public ph.d X;
    public pb1 Y;
    public ph.d Z;
    public ph.d a0;
    public boolean b0;
    public boolean c0;
    public k9 d0;

    public ja() {
        this.J = true;
    }

    public static void A0(ja jaVar) {
        t7.y(jaVar.currentAccount, false).u();
        gg.v2.e0(1, BirthdayController.getInstance(jaVar.currentAccount).getState());
    }

    public static /* synthetic */ void B0(ja jaVar, Context context) {
        if (MessagesController.getInstance(jaVar.currentAccount).isFrozen()) {
            org.telegram.ui.c.b(jaVar.currentAccount);
        } else {
            new aa(context, jaVar.resourceProvider).show();
        }
    }

    public static void F0(sz0 sz0Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((pz0) sz0Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        k90 k90Var = new k90(textView, AndroidUtilities.dp(90.0f), 0, f6Var);
        k90Var.a(org.telegram.ui.ActionBar.j6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.j6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(k90Var, 0, 1, 33);
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
        final t7 y10 = t7.y(i10, false);
        final long j10 = starGift.id;
        final cg.h0 h0Var = new cg.h0(textView, 23);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() { // from class: lh.z6
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                t7 t7Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = NotificationCenter.starGiftsLoaded) || (J = (t7Var = t7.this).J(j10)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(t7Var.a).removeObserver(notificationCenterDelegateArr[0], i14);
                h0Var.run(J);
            }
        };
        int i12 = y10.a;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
        int i13 = NotificationCenter.starGiftsLoaded;
        notificationCenter.addObserver(notificationCenterDelegate, i13);
        TL_stars.StarGift J = y10.J(j10);
        if (J != null) {
            zArr[0] = true;
            NotificationCenter.getInstance(i12).removeObserver(notificationCenterDelegateArr[0], i13);
            h0Var.run(J);
        }
    }

    public static void G0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new h9(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount) {
        return J0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount, float f10, char c3) {
        double d;
        int i10;
        if (f0 == null) {
            f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(starsAmount.negative() ? "-" : "");
                sb.append(LocaleController.formatNumber(Math.abs(starsAmount.amount / 1000000000), c3));
                spannableStringBuilder.append((CharSequence) sb.toString());
                return spannableStringBuilder;
            }
            String format = f0.format(j10 / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            boolean z4 = false;
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
                z4 = true;
            }
            if (i11 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z4 ? "-" : "");
                sb2.append(LocaleController.formatNumber(Math.abs(j12), c3));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(z4 ? "-" : "");
            sb3.append(LocaleController.formatNumber(Math.abs(j12), c3));
            spannableStringBuilder.append((CharSequence) sb3.toString());
            DecimalFormat decimalFormat = f0;
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
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f10, char c3) {
        double d;
        int i10;
        if (f0 == null) {
            f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), indexOf, spannableStringBuilder.length(), 33);
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
            boolean z4 = j10 != 0 ? j10 < 0 : i11 < 0;
            if (Math.abs(j11) > 1000 || starsAmount.nanos == 0) {
                if (starsAmount.amount <= 1000) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(z4 ? "-" : "");
                    sb.append(LocaleController.formatNumber(Math.abs(j11), c3));
                    spannableStringBuilder.append((CharSequence) sb.toString());
                    return spannableStringBuilder;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z4 ? "-" : "");
                sb2.append(AndroidUtilities.formatWholeNumber((int) Math.abs(j11), 0));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(z4 ? "-" : "");
            sb3.append(LocaleController.formatNumber(Math.abs(j11), c3));
            spannableStringBuilder.append((CharSequence) sb3.toString());
            DecimalFormat decimalFormat = f0;
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
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
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
            if (f0 == null) {
                f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = starsAmount.amount;
        int i11 = starsAmount.nanos;
        boolean z4 = false;
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
            z4 = true;
        }
        if (i11 == 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", (int) j10));
            return spannableStringBuilder;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z4 ? "-" : "");
        sb.append(LocaleController.formatNumber(Math.abs(j11), ','));
        spannableStringBuilder.append((CharSequence) sb.toString());
        if (f0 == null) {
            f0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        DecimalFormat decimalFormat = f0;
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
        if (e0 == null) {
            e0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return e0.format(j10 / 1.0E9d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j10 < 0 ? "-" : "");
        sb.append(LocaleController.formatNumber(Math.abs(j10 / 1000000000), ','));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0184, code lost:
    
        r5 = org.telegram.messenger.R.string.StarsTransactionFragment;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String N0(int i10, boolean z4, TL_stars.StarsTransaction starsTransaction) {
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
            return LocaleController.formatString(R.string.StarTransactionCommission, rh.j.G0(starsTransaction.starref_commission_permille));
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
        if (!z4) {
            if (starsTransaction.refund) {
            }
            return LocaleController.getString(r5);
        }
        int i13 = R.string.StarsTransactionWithdrawFragment;
        return LocaleController.getString(i13);
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
        lq lqVar = new lq(R.drawable.diamond, 0);
        lqVar.recolorDrawable = false;
        lqVar.translate(0.0f, f11);
        lqVar.spaceScaleX = f12;
        lqVar.setScale(f10, f10);
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder R0(CharSequence charSequence, float f10, lq[] lqVarArr) {
        return U0(false, charSequence, f10, lqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z4) {
        return U0(z4, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z4, CharSequence charSequence, float f10, lq[] lqVarArr, float f11, float f12) {
        lq lqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z4 ? "TON" : "⭐").concat(" "));
        if (lqVarArr == null || (lqVar = lqVarArr[0]) == null) {
            lqVar = new lq(z4 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (lqVarArr != null) {
                lqVarArr[0] = lqVar;
            }
        }
        lqVar.translate(0.0f, f11);
        lqVar.spaceScaleX = f12;
        if (z4) {
            float f13 = f10 * 0.2f;
            lqVar.setScale(f13, f13);
        } else {
            lqVar.setScale(f10, f10);
        }
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z4, String str, lq[] lqVarArr) {
        lq lqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (lqVarArr == null || (lqVar = lqVarArr[0]) == null) {
            lqVar = new lq(z4 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            lqVar.setScale(z4 ? 0.222f : 1.13f, z4 ? 0.222f : 1.13f);
        }
        if (lqVarArr != null) {
            lqVarArr[0] = lqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, lq[] lqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, lqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z4, CharSequence charSequence, float f10, lq[] lqVarArr) {
        lq lqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z4 ? "TON" : "⭐";
        int i10 = z4 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (lqVarArr == null || (lqVar = lqVarArr[0]) == null) {
            if (lqVarArr == null || lqVarArr.length <= 0) {
                lqVar = new lq(i10, 0);
            } else {
                lqVar = new lq(i10, 0);
                lqVarArr[0] = lqVar;
            }
        }
        if (z4) {
            f10 *= 0.33f;
        } else {
            lqVar.recolorDrawable = false;
        }
        lqVar.setScale(f10, f10);
        spannableString.setSpan(lqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static l8 Y0(View view, ImageReceiver imageReceiver, String str, boolean z4) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final cg.b1 b1Var = new cg.b1(z4, currentAccount, str, imageReceiver, new boolean[1]);
        b1Var.run();
        final int i10 = 0;
        final int i11 = 1;
        return new l8(NotificationCenter.getInstance(currentAccount).listen(view, z4 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: lh.k8
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        b1Var.run();
                        break;
                    default:
                        b1Var.run();
                        break;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: lh.k8
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        b1Var.run();
                        break;
                    default:
                        b1Var.run();
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
        imageReceiver.setImage(ImageLocation.getForDocument(document), e2.c.h(i10, "_", i10), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.h(i10, "_", i10), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.a7, 0.35f), 0L, null, null, 0);
    }

    public static void a1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        Z0(imageReceiver, starGift == null ? null : starGift.getDocument(), i10);
    }

    public static void b1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, long j10) {
        Y0(p9Var, imageReceiver, j10 <= 1000 ? "2⃣" : j10 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static l8 c1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, int i10) {
        return Y0(p9Var, imageReceiver, i10 != 3 ? i10 != 6 ? i10 != 12 ? i10 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void d1(org.telegram.ui.Components.p9 p9Var, ImageReceiver imageReceiver, long j10) {
        Y0(p9Var, imageReceiver, j10 <= 10000000000L ? "2⃣" : j10 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void e1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.f6 f6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, k7.b6.t(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 7, 0, 0, 0, 10));
        j9 j9Var = new j9(context, 70, 0);
        frameLayout.addView(j9Var, k7.b6.c(-1.0f, -1));
        int i11 = 2;
        fg.i iVar = new fg.i(context, 1, 2);
        fg.a aVar = iVar.b;
        aVar.w = org.telegram.ui.ActionBar.j6.fk;
        aVar.x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        iVar.setStarParticlesView(j9Var);
        frameLayout.addView(iVar, k7.b6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.g3[] g3VarArr = new org.telegram.ui.ActionBar.g3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView i12 = ai.i(f10, textView, k7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i12.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), -6915073));
        i12.setTextColor(-1);
        i12.setTextSize(1, 11.33f);
        i12.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        i12.setGravity(17);
        i12.setTypeface(AndroidUtilities.bold());
        StringBuilder sb = new StringBuilder("x");
        int i13 = boost.multiplier;
        if (i13 == 0) {
            i13 = 1;
        }
        sb.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i13));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        lq lqVar = new lq(R.drawable.mini_boost_badge, 2);
        lqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
        i12.setText(spannableStringBuilder);
        f10.addView(i12, k7.b6.t(-2, 20, 17, 20, 4, 20, 4));
        sz0 sz0Var = new sz0(context, f6Var);
        sz0Var.k(LocaleController.getString(R.string.BoostFrom), i10, j10, new w7(g3VarArr, j10, i11));
        sz0Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            i5.v vVar = new i5.v(g3VarArr, j10, boost, 4);
            g3VarArr = g3VarArr;
            sz0Var.g(string, string2, vVar);
        }
        sz0Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        sz0Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        f10.addView(sz0Var, k7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        f90 f90Var = new f90(context, f6Var);
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        f90Var.setTextSize(1, 14.0f);
        f90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.f(context, 7)));
        f90Var.setGravity(17);
        f10.addView(f90Var, k7.b6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        ph.d dVar = new ph.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new c8(g3VarArr, 1));
        f10.addView(dVar, k7.b6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        o10.customView = f10;
        g3VarArr[0] = o10;
        o10.useBackgroundTopPadding = false;
        o10.fixNavigationBar();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            g3VarArr[0].makeAttached(U);
        }
        iVar.setPaused(false);
        g3VarArr[0].show();
        g3VarArr[0].setOnDismissListener(new b(iVar, 12));
    }

    public static w0 f1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        lf.b bVar = lf.b.a;
        w0 w0Var = new w0(context, f6Var, i10, tL_starGiftUnique == null ? lf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(lf.b.b) : tL_starGiftUnique.getResellAmount(bVar), new kh.a1(8, callback2, r8));
        w0[] w0VarArr = {w0Var};
        w0Var.show();
        return w0VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g1(Context context, long j10, boolean z4, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.g3[] g3VarArr;
        Object[] objArr = 0;
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        linearLayout.addView(textView, k7.b6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        bd0 bd0Var = new bd0(context, f6Var);
        bd0Var.setForceForceUseCenter(true);
        bd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        bd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        ph.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uf, f6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new n8(bd0Var, editTextBoldCursor, objArr == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, k7.b6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, k7.b6.o(-1, -2, 1.0f, 119));
        bd0Var.e(editTextBoldCursor);
        bd0Var.addView(linearLayout2, k7.b6.e(-1, -2, 48));
        linearLayout.addView(bd0Var, k7.b6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false));
        bd0Var.addView(textView2, k7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        f90 f90Var = new f90(context, null);
        f90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new e2.f(context, 8)), true));
        f90Var.setTextSize(1, 12.0f);
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        linearLayout.addView(f90Var, k7.b6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        p10.g(LocaleController.getString(j10 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(p10, k7.b6.n(-1, 48));
        if (j10 > 0 && z4) {
            dVar = org.telegram.messenger.y3.p(24, context, f6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, k7.b6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        o10.customView = linearLayout;
        final org.telegram.ui.ActionBar.g3[] g3VarArr2 = {o10};
        editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
        editTextBoldCursor.addTextChangedListener(new i9(editTextBoldCursor, bd0Var, j10, z4, p10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: lh.o8
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
                p10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new q8(editTextBoldCursor2, g3VarArr2, 2));
                return true;
            }
        });
        p10.setOnClickListener(new p8(zArr, callback2, editTextBoldCursor, p10, g3VarArr2));
        if (dVar != null) {
            ph.d dVar2 = dVar;
            p8 p8Var = new p8(zArr, callback2, dVar2, editTextBoldCursor, g3VarArr2);
            g3VarArr = g3VarArr2;
            dVar2.setOnClickListener(p8Var);
        } else {
            g3VarArr = g3VarArr2;
        }
        g3VarArr[0].fixNavigationBar();
        g3VarArr[0].setOnDismissListener(new eg.d0(editTextBoldCursor, 4));
        g3VarArr[0].show();
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new q8(g3VarArr, editTextBoldCursor), R instanceof zn ? ((zn) R).P9() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0fac  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x102a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x1087  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x10bf  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x10df  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x10c8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1091  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x1075  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0e9a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0e69  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0ea0 A[LOOP:0: B:67:0x0e14->B:76:0x0ea0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0eac A[EDGE_INSN: B:77:0x0eac->B:78:0x0eac BREAK  A[LOOP:0: B:67:0x0e14->B:76:0x0ea0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0f26 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0f3b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0f4b  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.g3 h1(final Context context, final boolean z4, final long j10, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.g3 g3Var;
        org.telegram.ui.ActionBar.g3[] g3VarArr;
        boolean z10;
        Context context2;
        int i11;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z11;
        boolean z12;
        long j11;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.Peer peer;
        String str2;
        long j12;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        int i12;
        org.telegram.ui.ActionBar.g3[] g3VarArr2;
        float f10;
        int i13;
        String string;
        TL_stars.StarGift starGift;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i14;
        org.telegram.ui.ActionBar.g3[] g3VarArr3;
        TL_stars.StarsTransaction starsTransaction3;
        Context context3;
        final org.telegram.ui.ActionBar.g3[] g3VarArr4;
        sz0 sz0Var;
        sz0 sz0Var2;
        sz0 sz0Var3;
        sz0 sz0Var4;
        sz0 sz0Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z13;
        TL_stars.StarGift starGift2;
        Context context4;
        org.telegram.ui.ActionBar.p2 U;
        int i15;
        ImageLocation imageLocation2;
        ImageLocation forDocument2;
        final org.telegram.ui.ActionBar.g3[] g3VarArr5;
        final Context context5;
        sz0 sz0Var6;
        sz0 sz0Var7;
        final int i16;
        sz0 sz0Var8;
        final org.telegram.ui.ActionBar.g3[] g3VarArr6;
        long j13;
        sz0 sz0Var9;
        String str3;
        TL_stars.StarsAmount starsAmount;
        sz0 sz0Var10;
        sz0 sz0Var11;
        TL_stars.StarsTransaction starsTransaction4;
        ViewGroup viewGroup2;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z14 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i17 = starsTransaction.flags;
        boolean z15 = (i17 & 8192) != 0;
        boolean z16 = ((131072 & i17) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z17 = (z16 || (i17 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        org.telegram.ui.ActionBar.g3[] g3VarArr7 = new org.telegram.ui.ActionBar.g3[1];
        final LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
        f11.setPadding(0, AndroidUtilities.dp((z15 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        f11.setClipChildren(false);
        f11.setClipToPadding(false);
        boolean z18 = z15;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z10 = z16;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                g3VarArr = g3VarArr7;
                g3Var = o10;
                n9 n9Var = new n9(context, matrix, radialGradient, paint, j5Var);
                j5Var.l(n9Var);
                j5Var.i(stargiftattributepattern.document, false);
                n9Var.setOrientation(1);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                a1(p9Var.getImageReceiver(), starsTransaction.stargift, 160);
                n9Var.addView(p9Var, k7.b6.t(160, 160, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    k7.d6.a(p9Var);
                    p9Var.setOnClickListener(new dg.m2(context, i10, tL_starGiftUnique, 3));
                }
                TextView b10 = k7.f6.b(context, 20.0f, 0, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                n9Var.addView(b10, k7.b6.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = k7.f6.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                n9Var.addView(b11, k7.b6.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = k7.f6.b(context, 18.0f, 0, true, null);
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
                n9Var.addView(b12, k7.b6.t(-2, -2, 17, 0, 11, 0, 17));
                f11.addView(n9Var, k7.b6.n(-1, -2));
                f6Var2 = f6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = f11;
                str = "";
                z11 = z17;
                g3VarArr2 = g3VarArr;
                f10 = 16.0f;
                sz0 sz0Var12 = new sz0(context2, f6Var2);
                starGift = starsTransaction2.stargift;
                int i18 = 10;
                if (starGift != null) {
                    TL_stars.StarsTransaction starsTransaction5 = starsTransaction2;
                    viewGroup = linearLayout;
                    sz0 sz0Var13 = sz0Var12;
                    final org.telegram.ui.ActionBar.g3[] g3VarArr8 = g3VarArr2;
                    f6Var3 = f6Var2;
                    TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction5.peer;
                    if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                        final long peerDialogId = DialogObject.getPeerDialogId(starsTransactionPeer2.peer);
                        if (starsTransaction5.paid_message) {
                            sz0Var13.k(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i10, peerDialogId, new w7(g3VarArr8, peerDialogId, 3));
                            if (starsTransaction5.starref_amount != null && starsTransaction5.starref_commission_permille > 0) {
                                sz0Var13.d(X0(starsTransaction5.amount instanceof TL_stars.TL_starsTonAmount, kf.k0.l(Math.abs(Math.round(starsTransaction5.starref_amount.toDouble() + starsTransaction5.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            }
                            i14 = i10;
                            sz0Var4 = sz0Var13;
                        } else if (z10) {
                            long peerDialogId2 = DialogObject.getPeerDialogId(starsTransaction5.starref_peer);
                            sz0Var13.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new w7(g3VarArr8, j10, 4));
                            sz0Var13.k(LocaleController.getString(R.string.StarAffiliate), i10, peerDialogId2, new w7(g3VarArr8, peerDialogId2, 5));
                            i14 = i10;
                            sz0Var13.k(LocaleController.getString(R.string.StarAffiliateReferredUser), i14, peerDialogId, new w7(g3VarArr8, peerDialogId, 6));
                            sz0Var13.d(rh.j.G0(starsTransaction5.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                            g3VarArr3 = g3VarArr8;
                            sz0Var3 = sz0Var13;
                            starsTransaction3 = starsTransaction5;
                            context3 = context;
                            sz0Var2 = sz0Var3;
                            sz0Var5 = sz0Var2;
                        } else if (z11) {
                            sz0Var13.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new u7(i10, context, j10, peerDialogId, g3VarArr8, f6Var3));
                            i14 = i10;
                            sz0 sz0Var14 = sz0Var13;
                            sz0Var14.k(LocaleController.getString(R.string.StarAffiliateMiniApp), i14, peerDialogId, new w7(g3VarArr8, peerDialogId, 0));
                            sz0Var4 = sz0Var14;
                        } else {
                            if (z18) {
                                sz0Var13.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, peerDialogId, new x7(g3VarArr8, starsTransaction5, peerDialogId, 0));
                                final int i19 = 0;
                                sz0Var13.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i10, UserConfig.getInstance(i10).getClientUserId(), new Runnable() { // from class: lh.y7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                g3VarArr8[0].dismiss();
                                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                    bundle.putBoolean("my_profile", true);
                                                    U2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                g3VarArr8[0].dismiss();
                                                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
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
                                                g3VarArr8[0].dismiss();
                                                org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
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
                                String string2 = LocaleController.getString(R.string.StarGiveawayReason);
                                String string3 = LocaleController.getString(R.string.StarGiveawayReasonLink);
                                Runnable x7Var = new x7(g3VarArr8, starsTransaction, peerDialogId, 1);
                                starsTransaction3 = starsTransaction;
                                sz0Var13.g(string2, string3, x7Var);
                                sz0Var13.d(L0(starsTransaction3.amount), LocaleController.getString(R.string.StarGiveawayGift));
                                context3 = context;
                                i14 = i10;
                                g3VarArr3 = g3VarArr8;
                                sz0Var2 = sz0Var13;
                            } else {
                                starsTransaction3 = starsTransaction5;
                                if (!starsTransaction3.subscription || z4) {
                                    g3VarArr4 = g3VarArr8;
                                    if (starsTransaction3.premium_gift) {
                                        final int i20 = 1;
                                        sz0Var13.k(LocaleController.getString(R.string.Gift2To), i10, peerDialogId, new Runnable() { // from class: lh.z7
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        g3VarArr4[0].dismiss();
                                                        long j14 = peerDialogId;
                                                        if (!UserObject.isService(j14)) {
                                                            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                U2.presentFragment(zn.R9(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            ze.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        g3VarArr4[0].dismiss();
                                                        long j15 = peerDialogId;
                                                        if (!UserObject.isService(j15)) {
                                                            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                                            if (U3 != null) {
                                                                U3.presentFragment(zn.R9(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            ze.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        g3VarArr4[0].dismiss();
                                                        long j16 = peerDialogId;
                                                        if (!UserObject.isService(j16)) {
                                                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                                                            if (U4 != null) {
                                                                U4.presentFragment(zn.R9(j16));
                                                                break;
                                                            }
                                                        } else {
                                                            ze.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        sz0Var13.d(LocaleController.formatPluralStringComma("Months", starsTransaction3.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                                    } else if (!starsTransaction3.posts_search) {
                                        final int i21 = 2;
                                        g3VarArr3 = g3VarArr4;
                                        context3 = context;
                                        sz0 sz0Var15 = sz0Var13;
                                        i14 = i10;
                                        sz0Var15.k(LocaleController.getString(R.string.StarsTransactionRecipient), i14, peerDialogId, new Runnable() { // from class: lh.z7
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i21) {
                                                    case 0:
                                                        g3VarArr4[0].dismiss();
                                                        long j14 = peerDialogId;
                                                        if (!UserObject.isService(j14)) {
                                                            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                U2.presentFragment(zn.R9(j14));
                                                                break;
                                                            }
                                                        } else {
                                                            ze.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        g3VarArr4[0].dismiss();
                                                        long j15 = peerDialogId;
                                                        if (!UserObject.isService(j15)) {
                                                            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                                            if (U3 != null) {
                                                                U3.presentFragment(zn.R9(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            ze.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        g3VarArr4[0].dismiss();
                                                        long j16 = peerDialogId;
                                                        if (!UserObject.isService(j16)) {
                                                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                                                            if (U4 != null) {
                                                                U4.presentFragment(zn.R9(j16));
                                                                break;
                                                            }
                                                        } else {
                                                            ze.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        sz0Var2 = sz0Var15;
                                    }
                                    context3 = context;
                                    i14 = i10;
                                    sz0Var = sz0Var13;
                                } else {
                                    final int i22 = 0;
                                    g3VarArr4 = g3VarArr8;
                                    sz0 sz0Var16 = sz0Var13;
                                    i14 = i10;
                                    sz0Var16.k(LocaleController.getString(R.string.StarSubscriptionTo), i14, peerDialogId, new Runnable() { // from class: lh.z7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    g3VarArr8[0].dismiss();
                                                    long j14 = peerDialogId;
                                                    if (!UserObject.isService(j14)) {
                                                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            U2.presentFragment(zn.R9(j14));
                                                            break;
                                                        }
                                                    } else {
                                                        ze.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    g3VarArr8[0].dismiss();
                                                    long j15 = peerDialogId;
                                                    if (!UserObject.isService(j15)) {
                                                        org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                                        if (U3 != null) {
                                                            U3.presentFragment(zn.R9(j15));
                                                            break;
                                                        }
                                                    } else {
                                                        ze.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    g3VarArr8[0].dismiss();
                                                    long j16 = peerDialogId;
                                                    if (!UserObject.isService(j16)) {
                                                        org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                                                        if (U4 != null) {
                                                            U4.presentFragment(zn.R9(j16));
                                                            break;
                                                        }
                                                    } else {
                                                        ze.d.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    context3 = context;
                                    sz0Var = sz0Var16;
                                }
                                g3VarArr3 = g3VarArr4;
                                sz0Var2 = sz0Var;
                            }
                            sz0Var5 = sz0Var2;
                        }
                        g3VarArr3 = g3VarArr8;
                        sz0Var3 = sz0Var4;
                        starsTransaction3 = starsTransaction5;
                        context3 = context;
                        sz0Var2 = sz0Var3;
                        sz0Var5 = sz0Var2;
                    } else {
                        i14 = i10;
                        g3VarArr3 = g3VarArr8;
                        starsTransaction3 = starsTransaction5;
                        context3 = context;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction3.gift) {
                                f90 f90Var = new f90(context3, f6Var3);
                                f90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                f90Var.setEllipsize(TextUtils.TruncateAt.END);
                                int i23 = org.telegram.ui.ActionBar.j6.gc;
                                f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i23, f6Var3));
                                f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i23, f6Var3));
                                f90Var.setTextSize(1, 14.0f);
                                f90Var.setSingleLine(true);
                                f90Var.setDisablePaddingsOffsetY(true);
                                org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(f90Var, 24.0f, i14);
                                String string4 = LocaleController.getString(z14 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                                mq a2 = ea.a(24, "fragment");
                                int dp = AndroidUtilities.dp(f10);
                                int dp2 = AndroidUtilities.dp(f10);
                                a2.e = dp;
                                a2.f = dp2;
                                k5Var.b.setImageBitmap(a2);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) string4));
                                spannableStringBuilder2.setSpan(k5Var, 0, 1, 33);
                                spannableStringBuilder2.setSpan(new c9(g3VarArr3, context3, z14), 3, spannableStringBuilder2.length(), 33);
                                f90Var.setText(spannableStringBuilder2);
                                sz0Var13.i(f90Var, LocaleController.getString(R.string.StarsTransactionRecipient));
                                sz0Var5 = sz0Var13;
                            } else {
                                sz0Var13.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                                sz0Var5 = sz0Var13;
                            }
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            sz0Var13.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                            sz0Var5 = sz0Var13;
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            sz0Var13.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                            sz0Var5 = sz0Var13;
                        } else {
                            sz0Var5 = sz0Var13;
                            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                sz0Var13.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                                sz0Var5 = sz0Var13;
                            }
                        }
                    }
                } else if (starsTransaction2.stargift_upgrade) {
                    if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                        starsTransaction4 = starsTransaction2;
                        viewGroup2 = linearLayout;
                    } else {
                        sc scVar = (sc) ((pz0) sz0Var12.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                        tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                        viewGroup2 = linearLayout;
                        Context context6 = context2;
                        starsTransaction4 = starsTransaction;
                        t7.w(i10).M(tL_inputSavedStarGiftUser, new e8(scVar, i10, context6, f6Var2, 0));
                    }
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction4.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        long peerDialogId3 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                        String string5 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                        Runnable w7Var = new w7(g3VarArr2, peerDialogId3, 1);
                        context5 = context;
                        i14 = i10;
                        sz0 sz0Var17 = sz0Var12;
                        g3VarArr5 = g3VarArr2;
                        f6Var3 = f6Var;
                        sz0Var17.k(string5, i14, peerDialogId3, w7Var);
                        starsTransaction3 = starsTransaction4;
                        viewGroup = viewGroup2;
                        sz0Var10 = sz0Var17;
                        g3VarArr3 = g3VarArr5;
                        context3 = context5;
                        sz0Var5 = sz0Var10;
                    } else {
                        g3VarArr5 = g3VarArr2;
                        i14 = i10;
                        f6Var3 = f6Var;
                        sz0Var11 = sz0Var12;
                        starsTransaction3 = starsTransaction4;
                        viewGroup = viewGroup2;
                        g3VarArr3 = g3VarArr5;
                        context3 = context;
                        sz0Var5 = sz0Var11;
                    }
                } else {
                    g3VarArr5 = g3VarArr2;
                    context5 = context2;
                    TL_stars.StarsTransaction starsTransaction6 = starsTransaction2;
                    f6Var3 = f6Var2;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        String str4 = starGift.slug;
                        if (!TextUtils.isEmpty(str4)) {
                            sz0Var12.g(LocaleController.getString(R.string.Gift2Gift), starsTransaction6.stargift.title + " #" + starsTransaction6.stargift.num, new ah.a(context5, i10, str4, i18));
                        }
                        final long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                        long peerDialogId4 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction6.peer).peer);
                        if (!starsTransaction6.offer) {
                            if (starsTransaction6.stargift_resale) {
                                if (negative) {
                                    sz0Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                                } else {
                                    sz0Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                    j13 = clientUserId;
                                }
                            } else if (starsTransaction6.stargift_drop_original_details) {
                                sz0Var12.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                                j13 = clientUserId;
                                peerDialogId4 = j13;
                            } else {
                                sz0Var12.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                            }
                            j13 = peerDialogId4;
                            peerDialogId4 = clientUserId;
                        } else if (negative) {
                            sz0Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                            j13 = peerDialogId4;
                            peerDialogId4 = clientUserId;
                        } else {
                            sz0Var12.d(LocaleController.getString(starsTransaction6.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                            j13 = clientUserId;
                        }
                        if (peerDialogId4 != clientUserId) {
                            String string6 = LocaleController.getString(R.string.Gift2From);
                            final int i24 = 0;
                            sz0Var9 = sz0Var12;
                            str3 = "⭐️ ";
                            viewGroup = linearLayout;
                            final long j14 = peerDialogId4;
                            Runnable runnable = new Runnable() { // from class: lh.f8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i24) {
                                        case 0:
                                            g3VarArr5[0].dismiss();
                                            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                long j15 = j14;
                                                Bundle g10 = kf.k0.g(j15, "user_id");
                                                if (j15 == clientUserId) {
                                                    g10.putBoolean("my_profile", true);
                                                }
                                                g10.putBoolean("open_gifts", true);
                                                U2.presentFragment(new ProfileActivity(g10, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            g3VarArr5[0].dismiss();
                                            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                            if (U3 != null) {
                                                long j16 = j14;
                                                Bundle g11 = kf.k0.g(j16, "user_id");
                                                if (j16 == clientUserId) {
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
                            sz0Var9.k(string6, i10, j14, runnable);
                        } else {
                            sz0Var9 = sz0Var12;
                            str3 = "⭐️ ";
                            viewGroup = linearLayout;
                        }
                        if (j13 != clientUserId) {
                            final long j15 = clientUserId;
                            final int i25 = 1;
                            final long j16 = j13;
                            sz0Var9.k(LocaleController.getString(R.string.Gift2To), i10, j16, new Runnable() { // from class: lh.f8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i25) {
                                        case 0:
                                            g3VarArr5[0].dismiss();
                                            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                long j152 = j16;
                                                Bundle g10 = kf.k0.g(j152, "user_id");
                                                if (j152 == j15) {
                                                    g10.putBoolean("my_profile", true);
                                                }
                                                g10.putBoolean("open_gifts", true);
                                                U2.presentFragment(new ProfileActivity(g10, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            g3VarArr5[0].dismiss();
                                            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                            if (U3 != null) {
                                                long j162 = j16;
                                                Bundle g11 = kf.k0.g(j162, "user_id");
                                                if (j162 == j15) {
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
                        sz0 sz0Var18 = sz0Var9;
                        if ((peerDialogId4 == clientUserId || starsTransaction6.stargift_resale) && (starsAmount = starsTransaction6.starref_amount) != null && starsTransaction6.starref_commission_permille > 0) {
                            TL_stars.StarsAmount starsAmount4 = starsTransaction6.amount;
                            if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                tL_starsTonAmount.amount = starsTransaction6.amount.amount + starsTransaction6.starref_amount.amount;
                                lq[] lqVarArr = new lq[1];
                                sz0Var18.d(W0(starsTransaction6.amount, str3 + ((Object) I0(tL_starsTonAmount)), lqVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                lq lqVar = lqVarArr[0];
                                if (lqVar != null) {
                                    lqVar.setOverrideColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var3));
                                }
                            } else {
                                sz0Var18.d(X0(starsTransaction6.amount instanceof TL_stars.TL_starsTonAmount, kf.k0.l(Math.abs(Math.round(starsTransaction6.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder(str3)), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            }
                        }
                        i14 = i10;
                        sz0Var10 = sz0Var18;
                        starsTransaction3 = starsTransaction6;
                        g3VarArr3 = g3VarArr5;
                        context3 = context5;
                        sz0Var5 = sz0Var10;
                    } else {
                        viewGroup = linearLayout;
                        if (starsTransaction6.refund) {
                            i14 = i10;
                            sz0Var6 = sz0Var12;
                        } else {
                            long clientUserId2 = j10 == 0 ? UserConfig.getInstance(i10).getClientUserId() : j10;
                            final long peerDialogId5 = DialogObject.getPeerDialogId(starsTransaction6.peer.peer);
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId5));
                            if (positive) {
                                if (peerDialogId5 != clientUserId2) {
                                    CharSequence string7 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                    Runnable x7Var2 = new x7(g3VarArr5, starsTransaction6, peerDialogId5, 3);
                                    String string8 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId5)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                    final int i26 = 0;
                                    i16 = i10;
                                    Runnable runnable2 = new Runnable() { // from class: lh.a8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.g3 g3Var2 = g3VarArr5[0];
                                                    Objects.requireNonNull(g3Var2);
                                                    new kh.g2(context5, i16, peerDialogId5, null, new cg.h0(g3Var2, 22)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.g3 g3Var3 = g3VarArr5[0];
                                                    Objects.requireNonNull(g3Var3);
                                                    new kh.g2(context5, i16, peerDialogId5, null, new cg.h0(g3Var3, 22)).show();
                                                    break;
                                            }
                                        }
                                    };
                                    sz0 sz0Var19 = sz0Var12;
                                    g3VarArr6 = g3VarArr5;
                                    sz0Var19.j(string7, i16, peerDialogId5, x7Var2, string8, runnable2);
                                    sz0Var8 = sz0Var19;
                                } else {
                                    i16 = i10;
                                    sz0Var8 = sz0Var12;
                                    g3VarArr6 = g3VarArr5;
                                }
                                final int i27 = 1;
                                sz0Var8.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i16, clientUserId2, new Runnable() { // from class: lh.y7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i27) {
                                            case 0:
                                                g3VarArr6[0].dismiss();
                                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                                    bundle.putBoolean("my_profile", true);
                                                    U2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                g3VarArr6[0].dismiss();
                                                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
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
                                                g3VarArr6[0].dismiss();
                                                org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
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
                                starsTransaction6 = starsTransaction;
                                g3VarArr5 = g3VarArr6;
                                sz0Var7 = sz0Var8;
                            } else {
                                long j17 = clientUserId2;
                                if (peerDialogId5 != j17) {
                                    final int i28 = 2;
                                    sz0Var12.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, j17, new Runnable() { // from class: lh.y7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
                                                case 0:
                                                    g3VarArr5[0].dismiss();
                                                    org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                        bundle.putBoolean("my_profile", true);
                                                        U2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    g3VarArr5[0].dismiss();
                                                    org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
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
                                                    g3VarArr5[0].dismiss();
                                                    org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
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
                                CharSequence string9 = LocaleController.getString(R.string.StarGiveawayPrizeTo);
                                Runnable x7Var3 = new x7(g3VarArr5, starsTransaction, peerDialogId5, 4);
                                starsTransaction6 = starsTransaction;
                                String string10 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId5)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                final int i29 = 1;
                                Runnable runnable3 = new Runnable() { // from class: lh.a8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i29) {
                                            case 0:
                                                org.telegram.ui.ActionBar.g3 g3Var2 = g3VarArr5[0];
                                                Objects.requireNonNull(g3Var2);
                                                new kh.g2(context, i10, peerDialogId5, null, new cg.h0(g3Var2, 22)).show();
                                                break;
                                            default:
                                                org.telegram.ui.ActionBar.g3 g3Var3 = g3VarArr5[0];
                                                Objects.requireNonNull(g3Var3);
                                                new kh.g2(context, i10, peerDialogId5, null, new cg.h0(g3Var3, 22)).show();
                                                break;
                                        }
                                    }
                                };
                                sz0 sz0Var20 = sz0Var12;
                                g3VarArr5 = g3VarArr5;
                                sz0Var20.j(string9, i10, peerDialogId5, x7Var3, string10, runnable3);
                                sz0Var7 = sz0Var20;
                            }
                            i14 = i10;
                            sz0Var6 = sz0Var7;
                        }
                        starsTransaction3 = starsTransaction6;
                        sz0Var11 = sz0Var6;
                        g3VarArr3 = g3VarArr5;
                        context3 = context;
                        sz0Var5 = sz0Var11;
                    }
                }
                starsTransactionPeer = starsTransaction3.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) || (starsTransaction3.flags & 256) == 0) {
                    z13 = z14;
                } else {
                    long peerDialogId6 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                    if (z4) {
                        peerDialogId6 = j10;
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId6));
                    if (chat != null) {
                        f90 f90Var2 = new f90(context3, f6Var3);
                        f90Var2.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                        f90Var2.setEllipsize(TextUtils.TruncateAt.END);
                        int i30 = org.telegram.ui.ActionBar.j6.gc;
                        f90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i30, f6Var3));
                        f90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i30, f6Var3));
                        f90Var2.setTextSize(1, 14.0f);
                        f90Var2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        if (starsTransaction3.extended_media.isEmpty()) {
                            z13 = z14;
                        } else {
                            ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction3.extended_media;
                            int size = arrayList.size();
                            z13 = z14;
                            int i31 = 0;
                            int i32 = 0;
                            while (i31 < size) {
                                TLRPC.MessageMedia messageMedia = arrayList.get(i31);
                                int i33 = i31 + 1;
                                TLRPC.MessageMedia messageMedia2 = messageMedia;
                                ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                int i34 = size;
                                r70 r70Var = new r70(f90Var2, 24.0f, i14);
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                    i15 = i32;
                                    forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia2.photo);
                                } else {
                                    i15 = i32;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                        forDocument2 = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia2.document);
                                    } else {
                                        imageLocation2 = null;
                                        if (imageLocation2 == null) {
                                            r70Var.a(6.0f);
                                            r70Var.b.setImage(imageLocation2, "24_24", null, null, null, 0);
                                            SpannableString spannableString = new SpannableString("x");
                                            spannableString.setSpan(r70Var, 0, spannableString.length(), 33);
                                            spannableStringBuilder3.append((CharSequence) spannableString);
                                            spannableStringBuilder3.append((CharSequence) " ");
                                            i32 = i15 + 1;
                                        } else {
                                            i32 = i15;
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
                            StringBuilder sb = new StringBuilder();
                            ai.w(sb, MessagesController.getInstance(i14).linkPrefix, "/", publicUsername, "/");
                            sb.append(starsTransaction3.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb.toString());
                        }
                        x7 x7Var4 = new x7(g3VarArr3, peerDialogId6, starsTransaction3);
                        spannableStringBuilder3.setSpan(new d9(x7Var4), length, spannableStringBuilder3.length(), 33);
                        f90Var2.setSingleLine(true);
                        f90Var2.setEllipsize(TextUtils.TruncateAt.END);
                        f90Var2.setText(spannableStringBuilder3);
                        f90Var2.setOnClickListener(new androidx.mediarouter.app.c(x7Var4, 22));
                        sz0Var5.i(f90Var2, LocaleController.getString(starsTransaction3.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                    } else {
                        z13 = z14;
                    }
                }
                if (!TextUtils.isEmpty(starsTransaction3.id) && !z18) {
                    String string11 = LocaleController.getString(R.string.StarsTransactionID);
                    String str5 = starsTransaction3.id;
                    sz0Var5.h(string11, str5, str5.length() <= 25 ? 9 : 10, new n2(14, g3VarArr3, f6Var3));
                }
                if (starsTransaction3.floodskip && starsTransaction3.floodskip_number > 0) {
                    sz0Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction3.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                }
                sz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                    if (starGift2.limited) {
                        F0(sz0Var5, i14, starGift2, f6Var3);
                    }
                    if (!TextUtils.isEmpty(starsTransaction3.description)) {
                        sz0Var5.a(new SpannableStringBuilder(starsTransaction3.description));
                    }
                }
                ViewGroup viewGroup3 = viewGroup;
                viewGroup3.addView(sz0Var5, k7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                    sz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.transaction_date * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
                }
                if (z13) {
                    context4 = context;
                    f90 f90Var3 = new f90(context4, f6Var3);
                    f90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var3));
                    f90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var3));
                    f90Var3.setTextSize(1, 14.0f);
                    f90Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.f(context4, 4)));
                    f90Var3.setGravity(17);
                    viewGroup3.addView(f90Var3, k7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                } else {
                    context4 = context;
                }
                ph.d dVar = new ph.d(context4, f6Var3);
                dVar.e();
                if ((starsTransaction3.flags & 32) == 0) {
                    dVar.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer));
                } else {
                    dVar.h(LocaleController.getString(R.string.OK));
                }
                viewGroup3.addView(dVar, k7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
                g3Var2.customView = viewGroup3;
                int i35 = 0;
                g3VarArr3[0] = g3Var2;
                g3Var2.useBackgroundTopPadding = false;
                if ((starsTransaction3.flags & 32) == 0) {
                    dVar.setOnClickListener(new cg.n(context4, starsTransaction3));
                } else {
                    dVar.setOnClickListener(new c8(g3VarArr3, i35));
                }
                g3VarArr3[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                    g3VarArr3[0].makeAttached(U);
                }
                g3VarArr3[0].show();
                return g3VarArr3[0];
            }
        }
        g3Var = o10;
        g3VarArr = g3VarArr7;
        z10 = z16;
        final org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
        if (starsTransaction.premium_gift) {
            c1(p9Var2, p9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            f11.addView(p9Var2, k7.b6.t(160, 160, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            mq a10 = org.telegram.ui.Cells.s6.a(100, "search");
            int dp3 = AndroidUtilities.dp(40.0f);
            int dp4 = AndroidUtilities.dp(40.0f);
            a10.e = dp3;
            a10.f = dp4;
            p9Var2.setImageDrawable(a10);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z18 || starsTransaction.gift) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f11;
                    str = "";
                    z11 = z17;
                    z12 = z4;
                    j11 = j10;
                    f6Var2 = f6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        d1(p9Var2, p9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        b1(p9Var2, p9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(p9Var2, k7.b6.t(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f11;
                    z12 = z4;
                    j11 = j10;
                    f6Var2 = f6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            p9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            z11 = z17;
                            p9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                            str = "";
                        } else {
                            z11 = z17;
                            p9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            if (z11) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z12) {
                                str2 = "";
                                j12 = j11;
                                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8();
                                if (j12 < 0) {
                                    str = str2;
                                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j12));
                                    z8Var.r(user2);
                                    p9Var2.e(user2, z8Var);
                                } else {
                                    str = str2;
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j12));
                                    z8Var.q(chat2);
                                    p9Var2.e(chat2, z8Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            str2 = "";
                            j12 = DialogObject.getPeerDialogId(peer);
                            org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8();
                            if (j12 < 0) {
                            }
                        }
                        linearLayout.addView(p9Var2, k7.b6.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z11 = z17;
                        mq a11 = org.telegram.ui.Cells.s6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int dp5 = AndroidUtilities.dp(40.0f);
                        int dp6 = AndroidUtilities.dp(40.0f);
                        a11.e = dp5;
                        a11.f = dp6;
                        p9Var2.setImageDrawable(a11);
                    }
                } else {
                    p9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia3.document);
                    } else {
                        imageLocation = null;
                        p9Var2.l(imageLocation, "100_100", null, null, null, 0);
                        f11.addView(p9Var2, k7.b6.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: lh.v7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z19 = z4;
                                TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                                long peerDialogId7 = z19 ? j10 : DialogObject.getPeerDialogId(starsTransaction7.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i36 = 0; i36 < starsTransaction7.extended_media.size(); i36++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i36);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction7.msg_id;
                                    tL_message.dialog_id = peerDialogId7;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j18 = -peerDialogId7;
                                    tL_peerChannel.channel_id = j18;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j18;
                                    tL_message.date = starsTransaction7.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new MessageObject(i10, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.t1().K2(null, LaunchActivity.R(), f6Var);
                                PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new o9(p9Var2, f11, peerDialogId7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z12 = z4;
                        f6Var2 = f6Var;
                        i11 = i10;
                        linearLayout = f11;
                        j11 = j10;
                        p9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z11 = z17;
                    }
                    imageLocation = forDocument;
                    p9Var2.l(imageLocation, "100_100", null, null, null, 0);
                    f11.addView(p9Var2, k7.b6.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: lh.v7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z19 = z4;
                            TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                            long peerDialogId7 = z19 ? j10 : DialogObject.getPeerDialogId(starsTransaction7.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i36 = 0; i36 < starsTransaction7.extended_media.size(); i36++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i36);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction7.msg_id;
                                tL_message.dialog_id = peerDialogId7;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j18 = -peerDialogId7;
                                tL_peerChannel.channel_id = j18;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j18;
                                tL_message.date = starsTransaction7.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new MessageObject(i10, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.t1().K2(null, LaunchActivity.R(), f6Var);
                            PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new o9(p9Var2, f11, peerDialogId7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z12 = z4;
                    f6Var2 = f6Var;
                    i11 = i10;
                    linearLayout = f11;
                    j11 = j10;
                    p9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z11 = z17;
                }
                TextView textView = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.j6.j5;
                org.telegram.ui.b.w(i12, f6Var2, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(N0(i11, z12, starsTransaction2));
                TextView i36 = ai.i(linearLayout, textView, k7.b6.t(-1, -2, 17, 36, 0, 36, 4), context2);
                i36.setTextSize(1, 18.0f);
                i36.setTypeface(AndroidUtilities.bold());
                i36.setGravity(17);
                i36.setTextColor(org.telegram.ui.ActionBar.j6.v0(!positive ? org.telegram.ui.ActionBar.j6.uj : org.telegram.ui.ActionBar.j6.wj, f6Var2));
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                i36.setText(X0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, I0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(i36.getText());
                if (!starsTransaction2.refund) {
                    G0(spannableStringBuilder4, i36, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    i36.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var2));
                    G0(spannableStringBuilder4, i36, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    i36.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.yj, f6Var2));
                    G0(spannableStringBuilder4, i36, LocaleController.getString(R.string.StarsPending));
                }
                i36.setText(spannableStringBuilder4);
                linearLayout.addView(i36, k7.b6.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    f90 f90Var4 = new f90(context2);
                    f90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
                    f90Var4.setTextSize(1, 14.0f);
                    f90Var4.setGravity(17);
                    f90Var4.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var2));
                    f90Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, rh.j.G0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j11 == UserConfig.getInstance(i11).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), 2)) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new b8(j11, i11, 0)), true));
                    }
                    f90Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(f90Var4, k7.b6.t(-1, -2, 17, 36, 0, 36, 4));
                    g3VarArr2 = g3VarArr;
                    f10 = 16.0f;
                    sz0 sz0Var122 = new sz0(context2, f6Var2);
                    starGift = starsTransaction2.stargift;
                    int i182 = 10;
                    if (starGift != null) {
                    }
                    starsTransactionPeer = starsTransaction3.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z13 = z14;
                    if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    }
                    if (starsTransaction3.floodskip) {
                    }
                    sz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction3.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup32 = viewGroup;
                    viewGroup32.addView(sz0Var5, k7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    if (z13) {
                    }
                    ph.d dVar2 = new ph.d(context4, f6Var3);
                    dVar2.e();
                    if ((starsTransaction3.flags & 32) == 0) {
                    }
                    viewGroup32.addView(dVar2, k7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.g3 g3Var22 = g3Var;
                    g3Var22.customView = viewGroup32;
                    int i352 = 0;
                    g3VarArr3[0] = g3Var22;
                    g3Var22.useBackgroundTopPadding = false;
                    if ((starsTransaction3.flags & 32) == 0) {
                    }
                    g3VarArr3[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    g3VarArr3[0].show();
                    return g3VarArr3[0];
                }
                if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z18 || starsTransaction2.gift)) {
                    TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                    TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                    boolean isUserSelf = UserObject.isUserSelf(user3);
                    if (isUserSelf) {
                        i36.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var2));
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i13 = 1;
                        i36.setText(X0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(I0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i13 = 1;
                    }
                    f90 f90Var5 = new f90(context2);
                    f90Var5.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
                    f10 = 16.0f;
                    f90Var5.setTextSize(i13, 16.0f);
                    f90Var5.setGravity(17);
                    f90Var5.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var2));
                    f90Var5.setDisablePaddingsOffsetY(i13);
                    if (isUserSelf) {
                        int i37 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i13];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i37, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    g3VarArr2 = g3VarArr;
                    f90Var5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new d8(context2, g3VarArr2)), true)));
                    linearLayout.addView(f90Var5, k7.b6.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    g3VarArr2 = g3VarArr;
                    f10 = 16.0f;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        org.telegram.ui.b.l(i12, f6Var2, textView2, 1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, k7.b6.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                sz0 sz0Var1222 = new sz0(context2, f6Var2);
                starGift = starsTransaction2.stargift;
                int i1822 = 10;
                if (starGift != null) {
                }
                starsTransactionPeer = starsTransaction3.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z13 = z14;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    String string112 = LocaleController.getString(R.string.StarsTransactionID);
                    String str52 = starsTransaction3.id;
                    sz0Var5.h(string112, str52, str52.length() <= 25 ? 9 : 10, new n2(14, g3VarArr3, f6Var3));
                }
                if (starsTransaction3.floodskip) {
                    sz0Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction3.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                }
                sz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup322 = viewGroup;
                viewGroup322.addView(sz0Var5, k7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z13) {
                }
                ph.d dVar22 = new ph.d(context4, f6Var3);
                dVar22.e();
                if ((starsTransaction3.flags & 32) == 0) {
                }
                viewGroup322.addView(dVar22, k7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.g3 g3Var222 = g3Var;
                g3Var222.customView = viewGroup322;
                int i3522 = 0;
                g3VarArr3[0] = g3Var222;
                g3Var222.useBackgroundTopPadding = false;
                if ((starsTransaction3.flags & 32) == 0) {
                }
                g3VarArr3[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                    g3VarArr3[0].makeAttached(U);
                }
                g3VarArr3[0].show();
                return g3VarArr3[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                p9Var2.setImageDrawable(new t4(p9Var2, starsTransaction.stargift, 94, 0.44f));
                f11.addView(p9Var2, k7.b6.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                a1(p9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                f11.addView(p9Var2, k7.b6.t(160, 160, 17, 0, -8, 0, 10));
            }
        }
        f6Var2 = f6Var;
        context2 = context;
        i11 = i10;
        starsTransaction2 = starsTransaction;
        linearLayout = f11;
        str = "";
        z11 = z17;
        z12 = z4;
        j11 = j10;
        TextView textView3 = new TextView(context2);
        i12 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.b.w(i12, f6Var2, textView3, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(N0(i11, z12, starsTransaction2));
        TextView i362 = ai.i(linearLayout, textView3, k7.b6.t(-1, -2, 17, 36, 0, 36, 4), context2);
        i362.setTextSize(1, 18.0f);
        i362.setTypeface(AndroidUtilities.bold());
        i362.setGravity(17);
        i362.setTextColor(org.telegram.ui.ActionBar.j6.v0(!positive ? org.telegram.ui.ActionBar.j6.uj : org.telegram.ui.ActionBar.j6.wj, f6Var2));
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        i362.setText(X0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, I0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(i362.getText());
        if (!starsTransaction2.refund) {
        }
        i362.setText(spannableStringBuilder42);
        linearLayout.addView(i362, k7.b6.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        g3VarArr2 = g3VarArr;
        f10 = 16.0f;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            org.telegram.ui.b.l(i12, f6Var2, textView22, 1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, k7.b6.t(-1, -2, 17, 36, 0, 36, 4));
        }
        sz0 sz0Var12222 = new sz0(context2, f6Var2);
        starGift = starsTransaction2.stargift;
        int i18222 = 10;
        if (starGift != null) {
        }
        starsTransactionPeer = starsTransaction3.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z13 = z14;
        if (!TextUtils.isEmpty(starsTransaction3.id)) {
        }
        if (starsTransaction3.floodskip) {
        }
        sz0Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        starGift2 = starsTransaction3.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup3222 = viewGroup;
        viewGroup3222.addView(sz0Var5, k7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction3.flags & 32) != 0) {
        }
        if (z13) {
        }
        ph.d dVar222 = new ph.d(context4, f6Var3);
        dVar222.e();
        if ((starsTransaction3.flags & 32) == 0) {
        }
        viewGroup3222.addView(dVar222, k7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.g3 g3Var2222 = g3Var;
        g3Var2222.customView = viewGroup3222;
        int i35222 = 0;
        g3VarArr3[0] = g3Var2222;
        g3Var2222.useBackgroundTopPadding = false;
        if ((starsTransaction3.flags & 32) == 0) {
        }
        g3VarArr3[0].fixNavigationBar();
        U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet()) {
        }
        g3VarArr3[0].show();
        return g3VarArr3[0];
    }

    public static void i1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.f6 f6Var) {
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
        h1(activity, false, 0L, i10, starsTransaction, f6Var);
    }

    public static void j1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.f6 f6Var) {
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
        h1(context, false, 0L, i10, starsTransaction, f6Var);
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
    public static void x0(ja jaVar, int i10) {
        i51 G;
        char c3;
        String str;
        boolean z4;
        final boolean z10;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i11;
        org.telegram.ui.ActionBar.g3[] g3VarArr;
        int i12;
        sz0 sz0Var;
        int i13;
        String str2;
        String str3;
        boolean z11;
        boolean z12;
        long currentTime;
        final org.telegram.ui.ActionBar.g3[] g3VarArr2;
        final int i14;
        ?? r72;
        org.telegram.ui.ActionBar.p2 U;
        k9 k9Var = jaVar.d0;
        if (k9Var == null || (G = k9Var.G(i10)) == null) {
            return;
        }
        int i15 = G.d;
        if (i15 == -1) {
            jaVar.d0.N(true);
            return;
        }
        if (i15 == -2) {
            t7.y(jaVar.currentAccount, false).u();
            gg.v2.e0(1, BirthdayController.getInstance(jaVar.currentAccount).getState());
            return;
        }
        if (i15 == -3) {
            t7.y(jaVar.currentAccount, false).W();
            jaVar.d0.N(true);
            return;
        }
        if (i15 == -4) {
            if (MessagesController.getInstance(jaVar.currentAccount).isFrozen()) {
                org.telegram.ui.c.b(jaVar.currentAccount);
                return;
            } else {
                jaVar.presentFragment(new rh.d3(jaVar.getUserConfig().getClientUserId()));
                return;
            }
        }
        int i16 = 4;
        if (G.G(v9.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                t7.y(jaVar.currentAccount, false).f(jaVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new dh.v(i16, jaVar, G), null);
                return;
            }
            return;
        }
        if (G.G(ba.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = jaVar.getParentActivity();
            int i17 = jaVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.f6 resourceProvider = jaVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(parentActivity, resourceProvider, false, false);
            g3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.g3[] g3VarArr3 = new org.telegram.ui.ActionBar.g3[1];
            LinearLayout h = kf.k0.h(parentActivity, 1);
            h.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            h.setClipChildren(false);
            h.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            h.addView(frameLayout, k7.b6.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            e9 e9Var = new e9(zArr, g3VarArr3);
            NotificationCenter.getInstance(i17).addObserver(e9Var, NotificationCenter.starSubscriptionsLoaded);
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
            if (peerDialogId >= 0) {
                c3 = 0;
                TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                str = UserObject.getUserName(user);
                boolean isBot = UserObject.isBot(user);
                z4 = !isBot;
                z10 = isBot;
                chat = user;
            } else {
                c3 = 0;
                TLRPC.Chat chat3 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                str = chat3 == null ? "" : chat3.title;
                z4 = false;
                z10 = false;
                chat = chat3;
            }
            String str4 = str;
            if (starsSubscription.photo != null) {
                p9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
                chat2 = chat;
                p9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", null, null);
            } else {
                chat2 = chat;
                p9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                if (peerDialogId < 0) {
                    i11 = i17;
                    g3VarArr = g3VarArr3;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                    z8Var.q(chat4);
                    p9Var.e(chat4, z8Var);
                    frameLayout.addView(p9Var, k7.b6.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, k7.b6.e(28, 28, 17));
                        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, k7.b6.e(28, 28, 17));
                        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.j5, resourceProvider, textView, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                    }
                    h.addView(textView, k7.b6.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, resourceProvider));
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
                    h.addView(textView2, k7.b6.t(-1, -2, 17, 20, 0, 20, 4));
                    sz0Var = new sz0(parentActivity, resourceProvider);
                    f90 f90Var = new f90(parentActivity, resourceProvider);
                    f90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                    f90Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i19 = org.telegram.ui.ActionBar.j6.gc;
                    f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i19, resourceProvider));
                    f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i19, resourceProvider));
                    f90Var.setTextSize(1, 14.0f);
                    f90Var.setSingleLine(true);
                    f90Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(f90Var, 24.0f, i11);
                    if (peerDialogId < 0) {
                        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        boolean z13 = user2 == null || UserObject.isDeleted(user2);
                        str3 = UserObject.getUserName(user2);
                        k5Var.e(user2);
                        i13 = i19;
                        z11 = z13;
                        str2 = str4;
                    } else {
                        i13 = i19;
                        str2 = str4;
                        TLRPC.Chat chat5 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                        boolean z14 = chat5 == null;
                        str3 = chat5 != null ? chat5.title : "";
                        k5Var.b(chat5);
                        z11 = z14;
                    }
                    String str5 = str3;
                    z12 = z11;
                    int i20 = i11;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str5));
                    spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
                    org.telegram.ui.ActionBar.g3[] g3VarArr4 = g3VarArr;
                    spannableStringBuilder.setSpan(new f9(g3VarArr4, peerDialogId), 3, spannableStringBuilder.length(), 33);
                    f90Var.setText(spannableStringBuilder);
                    if (!z12) {
                        sz0Var.i(f90Var, LocaleController.getString(peerDialogId < 0 ? R.string.StarsSubscriptionChannel : z4 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot));
                    }
                    if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                        sz0Var.c(LocaleController.getString(!z4 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
                    }
                    sz0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i20).getCurrentTime();
                    sz0Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    h.addView(sz0Var, k7.b6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    f90 f90Var2 = new f90(parentActivity, resourceProvider);
                    int i21 = org.telegram.ui.ActionBar.j6.z6;
                    f90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i21, resourceProvider));
                    int i22 = i13;
                    f90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i22, resourceProvider));
                    final int i23 = 1;
                    f90Var2.setTextSize(1, 14.0f);
                    f90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
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
                                                        handler.post(new androidx.biometric.j(fVar, obj2, false, 7));
                                                        try {
                                                            if (i25 == 26 || i25 == 27) {
                                                                Boolean bool = Boolean.FALSE;
                                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                            } else {
                                                                activity.recreate();
                                                            }
                                                            handler.post(new androidx.biometric.j(application, fVar, false, 8));
                                                            break;
                                                        } catch (Throwable th2) {
                                                            handler.post(new androidx.biometric.j(application, fVar, false, 8));
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
                                    ze.d.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                                    break;
                            }
                        }
                    }));
                    f90Var2.setGravity(17);
                    h.addView(f90Var2, k7.b6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        g3VarArr2 = g3VarArr4;
                        i14 = i20;
                        f90 f90Var3 = new f90(parentActivity, resourceProvider);
                        f90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i21, resourceProvider));
                        f90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i22, resourceProvider));
                        f90Var3.setTextSize(1, 14.0f);
                        f90Var3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        f90Var3.setSingleLine(false);
                        f90Var3.setMaxLines(4);
                        f90Var3.setGravity(17);
                        h.addView(f90Var3, k7.b6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            ph.d dVar = new ph.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r72 = 0;
                            dVar.g(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                            h.addView(dVar, k7.b6.n(-1, 48));
                            u8 u8Var = new u8(dVar, starsSubscription, i14, g3VarArr2, resourceProvider, zArr, parentActivity);
                            i14 = i14;
                            dVar.setOnClickListener(u8Var);
                            g3Var.customView = h;
                            g3VarArr2[r72] = g3Var;
                            g3Var.useBackgroundTopPadding = r72;
                            g3Var.setOnDismissListener(new dg.b0(i14, e9Var));
                            g3VarArr2[r72].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                g3VarArr2[r72].makeAttached(U);
                            }
                            g3VarArr2[r72].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        f90 f90Var4 = new f90(parentActivity, resourceProvider);
                        f90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i21, resourceProvider));
                        f90Var4.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i22, resourceProvider));
                        f90Var4.setTextSize(1, 14.0f);
                        f90Var4.setText(LocaleController.formatString(z10 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        f90Var4.setSingleLine(false);
                        f90Var4.setMaxLines(4);
                        f90Var4.setGravity(17);
                        h.addView(f90Var4, k7.b6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        ph.d dVar2 = new ph.d(parentActivity, resourceProvider, true);
                        dVar2.g(LocaleController.getString(z10 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false, true);
                        h.addView(dVar2, k7.b6.n(-1, 48));
                        String str6 = str2;
                        g3VarArr2 = g3VarArr4;
                        r8 r8Var = new r8(dVar2, i20, starsSubscription, g3VarArr2, peerDialogId, parentActivity, resourceProvider, z4, str6);
                        i14 = i20;
                        dVar2.setOnClickListener(r8Var);
                    } else {
                        String str7 = str2;
                        final boolean z15 = z4;
                        i14 = i20;
                        g3VarArr2 = g3VarArr4;
                        if (starsSubscription.bot_canceled) {
                            f90 f90Var5 = new f90(parentActivity, resourceProvider);
                            f90Var5.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, resourceProvider));
                            f90Var5.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i22, resourceProvider));
                            f90Var5.setTextSize(1, 14.0f);
                            f90Var5.setText(LocaleController.getString(z15 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                            f90Var5.setSingleLine(false);
                            f90Var5.setMaxLines(4);
                            f90Var5.setGravity(17);
                            h.addView(f90Var5, k7.b6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            f90 f90Var6 = new f90(parentActivity, resourceProvider);
                            f90Var6.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, resourceProvider));
                            f90Var6.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i22, resourceProvider));
                            f90Var6.setTextSize(1, 14.0f);
                            f90Var6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                            f90Var6.setSingleLine(false);
                            f90Var6.setMaxLines(4);
                            f90Var6.setGravity(17);
                            h.addView(f90Var6, k7.b6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                ph.d dVar3 = new ph.d(parentActivity, resourceProvider, true);
                                dVar3.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                                h.addView(dVar3, k7.b6.n(-1, 48));
                                s8 s8Var = new s8(dVar3, starsSubscription, i14, g3VarArr2, chat2, str7);
                                i14 = i14;
                                dVar3.setOnClickListener(s8Var);
                            }
                        } else {
                            final TLRPC.Chat chat6 = chat2;
                            f90 f90Var7 = new f90(parentActivity, resourceProvider);
                            f90Var7.setTextColor(org.telegram.ui.ActionBar.j6.v0(i21, resourceProvider));
                            f90Var7.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i22, resourceProvider));
                            f90Var7.setTextSize(1, 14.0f);
                            f90Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                            f90Var7.setSingleLine(false);
                            f90Var7.setMaxLines(4);
                            f90Var7.setGravity(17);
                            h.addView(f90Var7, k7.b6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final ph.d dVar4 = new ph.d(parentActivity, resourceProvider, false);
                            dVar4.g(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                            dVar4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, resourceProvider));
                            h.addView(dVar4, k7.b6.n(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: lh.t8
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final ph.d dVar5 = dVar4;
                                    if (dVar5.K) {
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
                                    final boolean z16 = z15;
                                    final boolean z17 = z10;
                                    final org.telegram.ui.ActionBar.g3[] g3VarArr5 = g3VarArr2;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: lh.w8
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            AndroidUtilities.runOnUIThread(new x8(i24, tLObject, starsSubscription2, dVar5, z16, z17, g3VarArr5));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r72 = 0;
                    g3Var.customView = h;
                    g3VarArr2[r72] = g3Var;
                    g3Var.useBackgroundTopPadding = r72;
                    g3Var.setOnDismissListener(new dg.b0(i14, e9Var));
                    g3VarArr2[r72].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        g3VarArr2[r72].makeAttached(U);
                    }
                    g3VarArr2[r72].show();
                }
                TLRPC.User user3 = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                z8Var.r(user3);
                p9Var.e(user3, z8Var);
            }
            i11 = i17;
            g3VarArr = g3VarArr3;
            frameLayout.addView(p9Var, k7.b6.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.j5, resourceProvider, textView3, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            h.addView(textView3, k7.b6.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            textView22.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, resourceProvider));
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i12 = tL_starsSubscriptionPricing2.period;
            if (i12 != 2592000) {
            }
            h.addView(textView22, k7.b6.t(-1, -2, 17, 20, 0, 20, 4));
            sz0Var = new sz0(parentActivity, resourceProvider);
            f90 f90Var8 = new f90(parentActivity, resourceProvider);
            f90Var8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            f90Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i192 = org.telegram.ui.ActionBar.j6.gc;
            f90Var8.setTextColor(org.telegram.ui.ActionBar.j6.v0(i192, resourceProvider));
            f90Var8.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i192, resourceProvider));
            f90Var8.setTextSize(1, 14.0f);
            f90Var8.setSingleLine(true);
            f90Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.k5 k5Var2 = new org.telegram.ui.k5(f90Var8, 24.0f, i11);
            if (peerDialogId < 0) {
            }
            String str52 = str3;
            z12 = z11;
            int i202 = i11;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str52));
            spannableStringBuilder2.setSpan(k5Var2, 0, 1, 33);
            org.telegram.ui.ActionBar.g3[] g3VarArr42 = g3VarArr;
            spannableStringBuilder2.setSpan(new f9(g3VarArr42, peerDialogId), 3, spannableStringBuilder2.length(), 33);
            f90Var8.setText(spannableStringBuilder2);
            if (!z12) {
            }
            if (peerDialogId >= 0) {
                sz0Var.c(LocaleController.getString(!z4 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
            }
            sz0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i202).getCurrentTime();
            sz0Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
            h.addView(sz0Var, k7.b6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            f90 f90Var22 = new f90(parentActivity, resourceProvider);
            int i212 = org.telegram.ui.ActionBar.j6.z6;
            f90Var22.setTextColor(org.telegram.ui.ActionBar.j6.v0(i212, resourceProvider));
            int i222 = i13;
            f90Var22.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i222, resourceProvider));
            final int i232 = 1;
            f90Var22.setTextSize(1, 14.0f);
            f90Var22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
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
                                                handler.post(new androidx.biometric.j(fVar, obj2, false, 7));
                                                try {
                                                    if (i25 == 26 || i25 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new androidx.biometric.j(application, fVar, false, 8));
                                                    break;
                                                } catch (Throwable th2) {
                                                    handler.post(new androidx.biometric.j(application, fVar, false, 8));
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
                            ze.d.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                            break;
                    }
                }
            }));
            f90Var22.setGravity(17);
            h.addView(f90Var22, k7.b6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r72 = 0;
            g3Var.customView = h;
            g3VarArr2[r72] = g3Var;
            g3Var.useBackgroundTopPadding = r72;
            g3Var.setOnDismissListener(new dg.b0(i14, e9Var));
            g3VarArr2[r72].fixNavigationBar();
            U = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
            }
            g3VarArr2[r72].show();
        }
    }

    public static void z0(ja jaVar, i51 i51Var, Boolean bool, String str) {
        if (jaVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            qc.a0(jaVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) i51Var.B, new Object[0])), R.raw.stars_topup).j();
            jaVar.Q.c(true);
            t7.y(jaVar.currentAccount, false).T(true);
        } else if (str != null) {
            ai.r(R.string.UnknownErrorCode, new Object[]{str}, qc.a0(jaVar), R.raw.error, 36);
        }
    }

    public final void H0(ArrayList arrayList, w51 w51Var) {
        if (getParentActivity() == null) {
            return;
        }
        t7 y10 = t7.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        eg.h0 h0Var = (eg.h0) super.r0(getParentActivity());
        i51 i51Var = new i51(-2);
        i51Var.c = h0Var;
        arrayList.add(i51Var);
        arrayList.add(i51.k(this.R));
        ph.d dVar = this.a0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(i51.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(rh.f.a(-4, getThemedColor(org.telegram.ui.ActionBar.j6.uj), R.drawable.filled_earn_stars, ro.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(i51.B(null));
        }
        if (y10.e && !arrayList2.isEmpty()) {
            ai.q(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = ba.a;
                i51 J = i51.J(ba.class);
                J.G = starsSubscription;
                arrayList.add(J);
            }
            if (y10.x) {
                arrayList.add(i51.o(arrayList.size(), 33));
            } else if (!y10.y) {
                i51 c3 = i51.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c3.q = true;
                arrayList.add(c3);
            }
            arrayList.add(i51.B(null));
        }
        boolean O = y10.O(0);
        this.b0 = O;
        if (O) {
            arrayList.add(i51.p(this.O, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
        } else {
            arrayList.add(i51.l(this.P));
        }
    }

    @Override // org.telegram.ui.n20, org.telegram.ui.ActionBar.p2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.D = false;
        this.B = AndroidUtilities.dp(238.0f);
        this.O = new ia(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.P = new eg.h0(this, context, 2);
        super.createView(context);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        frameLayout.setClickable(true);
        fg.i iVar = new fg.i(context, 1, 2);
        this.N = iVar;
        fg.a aVar = iVar.b;
        aVar.w = org.telegram.ui.ActionBar.j6.fk;
        aVar.x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.e);
        this.M.addView(this.N, k7.b6.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new e2.f(context, 5)), true), this.M, null);
        this.c.setOverScrollMode(2);
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setOnItemClickListener(new dg.n(this, 7));
        s00 s00Var = new s00(getParentActivity());
        this.Q = s00Var;
        this.s.addView(s00Var, k7.b6.c(-1.0f, -1));
        t7 y10 = t7.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.R = linearLayout;
        linearLayout.setOrientation(1);
        this.R.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(getParentActivity(), false, true, false);
        this.T = k6Var;
        k6Var.setTypeface(AndroidUtilities.bold());
        this.T.setTextSize(AndroidUtilities.dp(32.0f));
        this.T.setGravity(17);
        this.T.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.resourceProvider));
        this.S = new SpannableStringBuilder("S");
        r70 r70Var = new r70(this.T, 42.0f, this.currentAccount);
        gj0 gj0Var = new gj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = r70Var.b;
        imageReceiver.setImageBitmap(gj0Var);
        imageReceiver.setAutoRepeat(2);
        r70Var.f = false;
        r70Var.h = -AndroidUtilities.dp(3.0f);
        this.S.setSpan(r70Var, 0, 1, 33);
        this.R.addView(this.T, k7.b6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.U = textView;
        textView.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.U.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, this.resourceProvider));
        this.R.addView(this.U, k7.b6.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        dg.u2 u2Var = new dg.u2(this, getParentActivity(), 8);
        this.W = u2Var;
        frameLayout2.addView(u2Var);
        ph.d dVar = new ph.d(getParentActivity(), this.resourceProvider, true);
        this.X = dVar;
        dVar.e();
        this.X.g("", false, true);
        final int i10 = 0;
        this.X.setOnClickListener(new View.OnClickListener(this) { // from class: lh.g8
            public final /* synthetic */ ja b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ja.B0(this.b, context);
                        break;
                    default:
                        new aa(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.W.addView(this.X, k7.b6.e(-1, 48, 119));
        pb1 pb1Var = new pb1(this, getParentActivity(), 4);
        this.Y = pb1Var;
        frameLayout2.addView(pb1Var);
        ph.d dVar2 = new ph.d(getParentActivity(), this.resourceProvider, true);
        this.Z = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new lq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.Z.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: lh.g8
            public final /* synthetic */ ja b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ja.B0(this.b, context);
                        break;
                    default:
                        new aa(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.Y.addView(this.Z, k7.b6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ph.d dVar3 = new ph.d(getParentActivity(), this.resourceProvider, true);
        this.V = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new lq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.V.g(spannableStringBuilder2, false, true);
        final int i12 = 0;
        this.V.setOnClickListener(new View.OnClickListener(this) { // from class: lh.h8
            public final /* synthetic */ ja b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ja jaVar = this.b;
                        jaVar.presentFragment(new q(0, jaVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        ja.A0(this.b);
                        break;
                }
            }
        });
        this.Y.addView(this.V, k7.b6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.R.addView(frameLayout2, k7.b6.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        ph.d dVar4 = new ph.d(getParentActivity(), this.resourceProvider, false);
        this.a0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new lq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.a0.g(spannableStringBuilder3, false, true);
        final int i13 = 1;
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: lh.h8
            public final /* synthetic */ ja b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        ja jaVar = this.b;
                        jaVar.presentFragment(new q(0, jaVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        ja.A0(this.b);
                        break;
                }
            }
        });
        this.R.addView(this.a0, k7.b6.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        k9 k9Var = this.d0;
        if (k9Var != null) {
            k9Var.N(false);
        }
        b0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = b0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1(y10.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            k9 k9Var = this.d0;
            if (k9Var != null) {
                k9Var.N(true);
            }
            if (this.K == 0 && this.L < 0) {
                this.L = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            t7 y10 = t7.y(this.currentAccount, false);
            if (this.b0 != y10.O(0)) {
                this.b0 = y10.O(0);
                s0();
                k9 k9Var2 = this.d0;
                if (k9Var2 != null) {
                    k9Var2.N(true);
                }
                if (this.K == 0 && this.L < 0) {
                    this.L = 0;
                }
                l0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            k9 k9Var3 = this.d0;
            if (k9Var3 != null) {
                k9Var3.N(true);
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
        boolean z4 = false;
        t7 y10 = t7.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.S);
        spannableStringBuilder.append((CharSequence) J0(y10.p(), 0.66f, ' '));
        this.T.setText(spannableStringBuilder);
        this.X.g(LocaleController.getString(y10.p().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats h = b0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z4 = true;
        }
        l1(z4, true);
    }

    public final void l1(final boolean z4, boolean z10) {
        this.c0 = z4;
        if (z10) {
            this.W.setVisibility(0);
            this.Y.setVisibility(0);
            final int i10 = 0;
            this.W.animate().alpha(z4 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: lh.i8
                public final /* synthetic */ ja b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            if (z4) {
                                this.b.W.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z4) {
                                this.b.Y.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final int i11 = 1;
            this.Y.animate().alpha(z4 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: lh.i8
                public final /* synthetic */ ja b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            if (z4) {
                                this.b.W.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z4) {
                                this.b.Y.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        this.W.animate().cancel();
        this.Y.animate().cancel();
        this.Y.setAlpha(z4 ? 1.0f : 0.0f);
        this.W.setAlpha(z4 ? 0.0f : 1.0f);
        this.Y.setVisibility(z4 ? 0 : 8);
        this.W.setVisibility(z4 ? 8 : 0);
    }

    @Override // org.telegram.ui.n20
    public final f2.o0 n0() {
        k9 k9Var = new k9(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new dg.r1(this, 19), getResourceProvider());
        this.d0 = k9Var;
        k9Var.r = false;
        return k9Var;
    }

    @Override // org.telegram.ui.n20
    public final m20 o0() {
        return new u9(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        t7.y(this.currentAccount, false).T(true);
        t7.y(this.currentAccount, false).S();
        t7.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.n20, org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        fg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.n20, org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        fg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.n20
    public final eg.q2 p0() {
        return new j9(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.n20
    public final boolean q0() {
        ia iaVar = this.O;
        boolean z4 = false;
        if (iaVar != null && (iaVar.getParent() instanceof View)) {
            if ((this.c.getHeight() - this.c.getPaddingBottom()) - ((View) this.O.getParent()).getBottom() >= 0) {
                z4 = true;
            }
        }
        return !z4;
    }

    @Override // org.telegram.ui.n20
    public final View r0(Context context) {
        throw null;
    }
}
