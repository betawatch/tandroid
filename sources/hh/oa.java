package hh;

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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a20;
import org.telegram.ui.f70;
import org.telegram.ui.jo;
import org.telegram.ui.ra1;
import org.telegram.ui.rn;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class oa extends a20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat d0;
    public static DecimalFormat e0;
    public FrameLayout L;
    public bg.i M;
    public na N;
    public ag.s0 O;
    public f00 P;
    public LinearLayout Q;
    public SpannableStringBuilder R;
    public org.telegram.ui.Components.j6 S;
    public TextView T;
    public lh.d U;
    public ag.p1 V;
    public lh.d W;
    public ra1 X;
    public lh.d Y;
    public lh.d Z;
    public boolean a0;
    public boolean b0;
    public n9 c0;

    public oa() {
        this.I = true;
    }

    public static void A0(oa oaVar) {
        u7.y(oaVar.currentAccount, false).u();
        cg.y2.e0(1, BirthdayController.getInstance(oaVar.currentAccount).getState());
    }

    public static /* synthetic */ void B0(oa oaVar, Context context) {
        if (MessagesController.getInstance(oaVar.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(oaVar.currentAccount);
        } else {
            new fa(context, oaVar.resourceProvider).show();
        }
    }

    public static void F0(yy0 yy0Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.c6 c6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((vy0) yy0Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        u80 u80Var = new u80(textView, AndroidUtilities.dp(90.0f), 0, c6Var);
        u80Var.a(org.telegram.ui.ActionBar.g6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.g6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(u80Var, 0, 1, 33);
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
        final u7 y10 = u7.y(i10, false);
        final long j10 = starGift.id;
        final ag.n0 n0Var = new ag.n0(textView, 18);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() { // from class: hh.a7
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                u7 u7Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = NotificationCenter.starGiftsLoaded) || (J = (u7Var = u7.this).J(j10)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(u7Var.a).removeObserver(notificationCenterDelegateArr[0], i14);
                n0Var.run(J);
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
            n0Var.run(J);
        }
    }

    public static void G0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new k9(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount) {
        return J0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
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
                sb3.append(LocaleController.formatNumber(Math.abs(j12), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(LocaleController.formatNumber(Math.abs(j12), c10));
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
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), length + 1, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f10, char c10) {
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
            boolean z10 = j10 != 0 ? j10 < 0 : i11 < 0;
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
            return LocaleController.formatString(R.string.StarTransactionCommission, nh.k.G0(starsTransaction.starref_commission_permille));
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

    public static SpannableStringBuilder O0(CharSequence charSequence, float f10) {
        return P0(charSequence, f10, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder P0(CharSequence charSequence, float f10, float f11, float f12) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        cq cqVar = new cq(R.drawable.diamond, 0);
        cqVar.recolorDrawable = false;
        cqVar.translate(0.0f, f11);
        cqVar.spaceScaleX = f12;
        cqVar.setScale(f10, f10);
        spannableString.setSpan(cqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder R0(CharSequence charSequence, float f10, cq[] cqVarArr) {
        return U0(false, charSequence, f10, cqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z10) {
        return U0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z10, CharSequence charSequence, float f10, cq[] cqVarArr, float f11, float f12) {
        cq cqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (cqVarArr == null || (cqVar = cqVarArr[0]) == null) {
            cqVar = new cq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (cqVarArr != null) {
                cqVarArr[0] = cqVar;
            }
        }
        cqVar.translate(0.0f, f11);
        cqVar.spaceScaleX = f12;
        if (z10) {
            float f13 = f10 * 0.2f;
            cqVar.setScale(f13, f13);
        } else {
            cqVar.setScale(f10, f10);
        }
        spannableString.setSpan(cqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z10, String str, cq[] cqVarArr) {
        cq cqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (cqVarArr == null || (cqVar = cqVarArr[0]) == null) {
            cqVar = new cq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            cqVar.setScale(z10 ? 0.222f : 1.13f, z10 ? 0.222f : 1.13f);
        }
        if (cqVarArr != null) {
            cqVarArr[0] = cqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(cqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, cq[] cqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, cqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f10, cq[] cqVarArr) {
        cq cqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i10 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (cqVarArr == null || (cqVar = cqVarArr[0]) == null) {
            if (cqVarArr == null || cqVarArr.length <= 0) {
                cqVar = new cq(i10, 0);
            } else {
                cqVar = new cq(i10, 0);
                cqVarArr[0] = cqVar;
            }
        }
        if (z10) {
            f10 *= 0.33f;
        } else {
            cqVar.recolorDrawable = false;
        }
        cqVar.setScale(f10, f10);
        spannableString.setSpan(cqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static n8 Y0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final l8 l8Var = new l8(z10, currentAccount, str, imageReceiver, new boolean[1]);
        l8Var.run();
        final int i10 = 0;
        final int i11 = 1;
        return new n8(NotificationCenter.getInstance(currentAccount).listen(view, z10 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: hh.m8
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        l8Var.run();
                        break;
                    default:
                        l8Var.run();
                        break;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: hh.m8
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        l8Var.run();
                        break;
                    default:
                        l8Var.run();
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
        imageReceiver.setImage(ImageLocation.getForDocument(document), com.google.android.recaptcha.internal.a.l(i10, "_", i10), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), com.google.android.recaptcha.internal.a.l(i10, "_", i10), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.a7, 0.35f), 0L, null, null, 0);
    }

    public static void a1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        Z0(imageReceiver, starGift == null ? null : starGift.getDocument(), i10);
    }

    public static void b1(org.telegram.ui.Components.n9 n9Var, ImageReceiver imageReceiver, long j10) {
        Y0(n9Var, imageReceiver, j10 <= 1000 ? "2⃣" : j10 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static n8 c1(org.telegram.ui.Components.n9 n9Var, ImageReceiver imageReceiver, int i10) {
        return Y0(n9Var, imageReceiver, i10 != 3 ? i10 != 6 ? i10 != 12 ? i10 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void d1(org.telegram.ui.Components.n9 n9Var, ImageReceiver imageReceiver, long j10) {
        Y0(n9Var, imageReceiver, j10 <= 10000000000L ? "2⃣" : j10 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void e1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.c6 c6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 o10 = org.telegram.messenger.y1.o(context, c6Var, false, false);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        g10.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, h7.z5.t(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 7, 0, 0, 0, 10));
        m9 m9Var = new m9(context, 70, 0);
        frameLayout.addView(m9Var, h7.z5.c(-1.0f, -1));
        int i11 = 2;
        bg.i iVar = new bg.i(context, 1, 2);
        bg.a aVar = iVar.b;
        aVar.w = org.telegram.ui.ActionBar.g6.fk;
        aVar.x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        iVar.setStarParticlesView(m9Var);
        frameLayout.addView(iVar, h7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        TextView textView = new TextView(context);
        rl.w(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView i12 = org.telegram.ui.Cells.pa.i(g10, textView, h7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
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
        cq cqVar = new cq(R.drawable.mini_boost_badge, 2);
        cqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
        i12.setText(spannableStringBuilder);
        g10.addView(i12, h7.z5.t(-2, 20, 17, 20, 4, 20, 4));
        yy0 yy0Var = new yy0(context, c6Var);
        yy0Var.k(LocaleController.getString(R.string.BoostFrom), i10, j10, new x7(e3VarArr, j10, i11));
        yy0Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            e5.u uVar = new e5.u(e3VarArr, j10, boost, 4);
            e3VarArr = e3VarArr;
            yy0Var.g(string, string2, uVar);
        }
        yy0Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        yy0Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        g10.addView(yy0Var, h7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        p80 p80Var = new p80(context, c6Var);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.e(context, 7)));
        p80Var.setGravity(17);
        g10.addView(p80Var, h7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new d8(e3VarArr, 1));
        g10.addView(dVar, h7.z5.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        o10.customView = g10;
        e3VarArr[0] = o10;
        o10.useBackgroundTopPadding = false;
        o10.fixNavigationBar();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            e3VarArr[0].makeAttached(U);
        }
        iVar.setPaused(false);
        e3VarArr[0].show();
        e3VarArr[0].setOnDismissListener(new f2.r(iVar, 27));
    }

    public static x0 f1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        hf.b bVar = hf.b.a;
        x0 x0Var = new x0(context, c6Var, i10, tL_starGiftUnique == null ? hf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(hf.b.b) : tL_starGiftUnique.getResellAmount(bVar), new gh.d1(8, callback2, r8));
        x0[] x0VarArr = {x0Var};
        x0Var.show();
        return x0VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.e3[] e3VarArr;
        Object[] objArr = 0;
        org.telegram.ui.ActionBar.e3 o10 = org.telegram.messenger.y1.o(context, c6Var, false, false);
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
        linearLayout.addView(textView, h7.z5.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        jc0 jc0Var = new jc0(context, c6Var);
        jc0Var.setForceForceUseCenter(true);
        jc0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        jc0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        lh.d dVar = null;
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
        editTextBoldCursor.setOnFocusChangeListener(new p8(jc0Var, editTextBoldCursor, objArr == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, h7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, h7.z5.o(-1, -2, 1.0f, 119));
        jc0Var.e(editTextBoldCursor);
        jc0Var.addView(linearLayout2, h7.z5.e(-1, -2, 48));
        linearLayout.addView(jc0Var, h7.z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
        jc0Var.addView(textView2, h7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        p80 p80Var = new p80(context, null);
        p80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new e2.e(context, 8)), true));
        p80Var.setTextSize(1, 12.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        linearLayout.addView(p80Var, h7.z5.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final lh.d g10 = rl.g(24, context, c6Var, true);
        g10.g(LocaleController.getString(j10 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(g10, h7.z5.n(-1, 48));
        if (j10 > 0 && z10) {
            dVar = rl.g(24, context, c6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, h7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        o10.customView = linearLayout;
        final org.telegram.ui.ActionBar.e3[] e3VarArr2 = {o10};
        editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
        editTextBoldCursor.addTextChangedListener(new l9(editTextBoldCursor, jc0Var, j10, z10, g10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hh.q8
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
                g10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new s8(editTextBoldCursor2, e3VarArr2, 2));
                return true;
            }
        });
        g10.setOnClickListener(new r8(zArr, callback2, editTextBoldCursor, g10, e3VarArr2));
        if (dVar != null) {
            lh.d dVar2 = dVar;
            r8 r8Var = new r8(zArr, callback2, dVar2, editTextBoldCursor, e3VarArr2);
            e3VarArr = e3VarArr2;
            dVar2.setOnClickListener(r8Var);
        } else {
            e3VarArr = e3VarArr2;
        }
        e3VarArr[0].fixNavigationBar();
        e3VarArr[0].setOnDismissListener(new ag.j0(editTextBoldCursor, 4));
        e3VarArr[0].show();
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new s8(e3VarArr, editTextBoldCursor), R instanceof rn ? ((rn) R).P9() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0fc4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0ffa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x1042  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x109f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x10d7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x10f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x10e0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x10a9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x108d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0eb6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0dc1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0de0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0e84  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0ebc A[LOOP:0: B:68:0x0e2f->B:77:0x0ebc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0ec8 A[EDGE_INSN: B:78:0x0ec8->B:79:0x0ec8 BREAK  A[LOOP:0: B:68:0x0e2f->B:77:0x0ebc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0f3f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f51  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0f54  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0f63  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.e3 h1(final Context context, final boolean z10, final long j10, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.e3[] e3VarArr;
        boolean z11;
        Context context2;
        int i11;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z12;
        char c10;
        boolean z13;
        long j11;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.Peer peer;
        long j12;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        int i12;
        String str2;
        org.telegram.ui.ActionBar.e3[] e3VarArr2;
        float f10;
        int i13;
        String string;
        TL_stars.StarGift starGift;
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.e3[] e3VarArr3;
        TL_stars.StarsTransaction starsTransaction3;
        Context context3;
        int i14;
        yy0 yy0Var;
        yy0 yy0Var2;
        yy0 yy0Var3;
        yy0 yy0Var4;
        yy0 yy0Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z14;
        TL_stars.StarGift starGift2;
        Context context4;
        org.telegram.ui.ActionBar.n2 U;
        TLRPC.Chat chat;
        int i15;
        ImageLocation imageLocation2;
        ImageLocation forDocument2;
        final org.telegram.ui.ActionBar.e3[] e3VarArr4;
        final Context context5;
        yy0 yy0Var6;
        TL_stars.StarsTransaction starsTransaction4;
        org.telegram.ui.ActionBar.e3[] e3VarArr5;
        yy0 yy0Var7;
        final int i16;
        final org.telegram.ui.ActionBar.e3[] e3VarArr6;
        long j13;
        yy0 yy0Var8;
        long j14;
        long j15;
        int i17;
        String str3;
        TL_stars.StarsAmount starsAmount;
        yy0 yy0Var9;
        TL_stars.StarsTransaction starsTransaction5;
        ViewGroup viewGroup2;
        int i18;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z15 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i19 = starsTransaction.flags;
        boolean z16 = (i19 & 8192) != 0;
        boolean z17 = ((131072 & i19) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z18 = (z17 || (i19 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        org.telegram.ui.ActionBar.e3 o10 = org.telegram.messenger.y1.o(context, c6Var, false, false);
        org.telegram.ui.ActionBar.e3[] e3VarArr7 = new org.telegram.ui.ActionBar.e3[1];
        final LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        g10.setPadding(0, AndroidUtilities.dp((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                e3VarArr = e3VarArr7;
                e3Var = o10;
                q9 q9Var = new q9(context, matrix, radialGradient, paint, i5Var);
                i5Var.l(q9Var);
                i5Var.i(stargiftattributepattern.document, false);
                q9Var.setOrientation(1);
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
                a1(n9Var.getImageReceiver(), starsTransaction.stargift, 160);
                q9Var.addView(n9Var, h7.z5.t(160, 160, 17, 0, 20, 0, 0));
                if (TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    i18 = 2;
                } else {
                    h7.b6.a(n9Var);
                    i18 = 2;
                    n9Var.setOnClickListener(new gh.v2(context, i10, tL_starGiftUnique, i18));
                }
                TextView b10 = h7.d6.b(context, 20.0f, 0, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                q9Var.addView(b10, h7.z5.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = h7.d6.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                q9Var.addView(b11, h7.z5.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = h7.d6.b(context, 18.0f, 0, true, null);
                b12.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                str2 = positive ? "+" : "";
                SpannableStringBuilder I0 = I0(starsAmount3);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = str2;
                charSequenceArr[1] = I0;
                charSequenceArr[i18] = " ⭐️";
                b12.setText(T0(starsAmount3, TextUtils.concat(charSequenceArr)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b12.getText());
                if (starsTransaction.refund) {
                    G0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction.failed) {
                    G0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction.pending) {
                    G0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsPending));
                }
                b12.setText(spannableStringBuilder);
                q9Var.addView(b12, h7.z5.t(-2, -2, 17, 0, 11, 0, 17));
                g10.addView(q9Var, h7.z5.n(-1, -2));
                c6Var2 = c6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = g10;
                str = "";
                z12 = z18;
                e3VarArr2 = e3VarArr;
                f10 = 16.0f;
                yy0 yy0Var10 = new yy0(context2, c6Var2);
                starGift = starsTransaction2.stargift;
                int i20 = 6;
                if (starGift != null) {
                    TL_stars.StarsTransaction starsTransaction6 = starsTransaction2;
                    viewGroup = linearLayout;
                    yy0 yy0Var11 = yy0Var10;
                    final org.telegram.ui.ActionBar.e3[] e3VarArr8 = e3VarArr2;
                    c6Var3 = c6Var2;
                    TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction6.peer;
                    if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                        final long peerDialogId = DialogObject.getPeerDialogId(starsTransactionPeer2.peer);
                        if (starsTransaction6.paid_message) {
                            yy0Var11.k(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i10, peerDialogId, new x7(e3VarArr8, peerDialogId, 3));
                            if (starsTransaction6.starref_amount != null && starsTransaction6.starref_commission_permille > 0) {
                                yy0Var11.d(X0(starsTransaction6.amount instanceof TL_stars.TL_starsTonAmount, i0.a.m(Math.abs(Math.round(starsTransaction6.starref_amount.toDouble() + starsTransaction6.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            }
                        } else if (z11) {
                            long peerDialogId2 = DialogObject.getPeerDialogId(starsTransaction6.starref_peer);
                            yy0Var11.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new x7(e3VarArr8, j10, 4));
                            yy0Var11.k(LocaleController.getString(R.string.StarAffiliate), i10, peerDialogId2, new x7(e3VarArr8, peerDialogId2, 5));
                            yy0Var11.k(LocaleController.getString(R.string.StarAffiliateReferredUser), i10, peerDialogId, new x7(e3VarArr8, peerDialogId, 6));
                            yy0Var11.d(nh.k.G0(starsTransaction6.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                            i14 = i10;
                            e3VarArr3 = e3VarArr8;
                            yy0Var4 = yy0Var11;
                            starsTransaction3 = starsTransaction6;
                            context3 = context;
                            yy0Var2 = yy0Var4;
                        } else if (z12) {
                            yy0Var11.g(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new v7(i10, context, j10, peerDialogId, e3VarArr8, c6Var3));
                            yy0Var11 = yy0Var11;
                            yy0Var11.k(LocaleController.getString(R.string.StarAffiliateMiniApp), i10, peerDialogId, new x7(e3VarArr8, peerDialogId, 0));
                        } else if (z19) {
                            yy0Var11.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, peerDialogId, new y7(e3VarArr8, starsTransaction6, peerDialogId, 0));
                            final int i21 = 0;
                            yy0Var11.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i10, UserConfig.getInstance(i10).getClientUserId(), new Runnable() { // from class: hh.z7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i21) {
                                        case 0:
                                            e3VarArr8[0].dismiss();
                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                bundle.putBoolean("my_profile", true);
                                                U2.presentFragment(new ProfileActivity(bundle, null));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            e3VarArr8[0].dismiss();
                                            org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
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
                                            e3VarArr8[0].dismiss();
                                            org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
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
                            Runnable y7Var = new y7(e3VarArr8, starsTransaction, peerDialogId, 1);
                            starsTransaction3 = starsTransaction;
                            yy0Var11.g(string2, string3, y7Var);
                            yy0Var11.d(L0(starsTransaction3.amount), LocaleController.getString(R.string.StarGiveawayGift));
                            context3 = context;
                            i14 = i10;
                            e3VarArr3 = e3VarArr8;
                            yy0Var2 = yy0Var11;
                        } else {
                            starsTransaction3 = starsTransaction6;
                            if (!starsTransaction3.subscription || z10) {
                                if (starsTransaction3.premium_gift) {
                                    final int i22 = 1;
                                    yy0Var11.k(LocaleController.getString(R.string.Gift2To), i10, peerDialogId, new Runnable() { // from class: hh.a8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    e3VarArr8[0].dismiss();
                                                    long j16 = peerDialogId;
                                                    if (!UserObject.isService(j16)) {
                                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            U2.presentFragment(rn.R9(j16));
                                                            break;
                                                        }
                                                    } else {
                                                        we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    e3VarArr8[0].dismiss();
                                                    long j17 = peerDialogId;
                                                    if (!UserObject.isService(j17)) {
                                                        org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                        if (U3 != null) {
                                                            U3.presentFragment(rn.R9(j17));
                                                            break;
                                                        }
                                                    } else {
                                                        we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    e3VarArr8[0].dismiss();
                                                    long j18 = peerDialogId;
                                                    if (!UserObject.isService(j18)) {
                                                        org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                        if (U4 != null) {
                                                            U4.presentFragment(rn.R9(j18));
                                                            break;
                                                        }
                                                    } else {
                                                        we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    yy0Var = yy0Var11;
                                    yy0Var.d(LocaleController.formatPluralStringComma("Months", starsTransaction3.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                                } else {
                                    yy0Var = yy0Var11;
                                    if (!starsTransaction3.posts_search) {
                                        final int i23 = 2;
                                        e3VarArr3 = e3VarArr8;
                                        context3 = context;
                                        yy0Var.k(LocaleController.getString(R.string.StarsTransactionRecipient), i10, peerDialogId, new Runnable() { // from class: hh.a8
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i23) {
                                                    case 0:
                                                        e3VarArr8[0].dismiss();
                                                        long j16 = peerDialogId;
                                                        if (!UserObject.isService(j16)) {
                                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                U2.presentFragment(rn.R9(j16));
                                                                break;
                                                            }
                                                        } else {
                                                            we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        e3VarArr8[0].dismiss();
                                                        long j17 = peerDialogId;
                                                        if (!UserObject.isService(j17)) {
                                                            org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                            if (U3 != null) {
                                                                U3.presentFragment(rn.R9(j17));
                                                                break;
                                                            }
                                                        } else {
                                                            we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        e3VarArr8[0].dismiss();
                                                        long j18 = peerDialogId;
                                                        if (!UserObject.isService(j18)) {
                                                            org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                            if (U4 != null) {
                                                                U4.presentFragment(rn.R9(j18));
                                                                break;
                                                            }
                                                        } else {
                                                            we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        yy0Var2 = yy0Var;
                                        i14 = i10;
                                    }
                                }
                                context3 = context;
                                i14 = i10;
                                yy0Var2 = yy0Var;
                                e3VarArr3 = e3VarArr8;
                            } else {
                                final int i24 = 0;
                                yy0Var11.k(LocaleController.getString(R.string.StarSubscriptionTo), i10, peerDialogId, new Runnable() { // from class: hh.a8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i24) {
                                            case 0:
                                                e3VarArr8[0].dismiss();
                                                long j16 = peerDialogId;
                                                if (!UserObject.isService(j16)) {
                                                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(rn.R9(j16));
                                                        break;
                                                    }
                                                } else {
                                                    we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                e3VarArr8[0].dismiss();
                                                long j17 = peerDialogId;
                                                if (!UserObject.isService(j17)) {
                                                    org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(rn.R9(j17));
                                                        break;
                                                    }
                                                } else {
                                                    we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                e3VarArr8[0].dismiss();
                                                long j18 = peerDialogId;
                                                if (!UserObject.isService(j18)) {
                                                    org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(rn.R9(j18));
                                                        break;
                                                    }
                                                } else {
                                                    we.e.s(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                context3 = context;
                                yy0Var3 = yy0Var11;
                                e3VarArr3 = e3VarArr8;
                                i14 = i10;
                                yy0Var2 = yy0Var3;
                            }
                        }
                        yy0Var5 = yy0Var11;
                        e3VarArr3 = e3VarArr8;
                        starsTransaction3 = starsTransaction6;
                        context3 = context;
                        yy0Var3 = yy0Var5;
                        i14 = i10;
                        yy0Var2 = yy0Var3;
                    } else {
                        yy0 yy0Var12 = yy0Var11;
                        e3VarArr3 = e3VarArr8;
                        starsTransaction3 = starsTransaction6;
                        context3 = context;
                        i14 = i10;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction3.gift) {
                                p80 p80Var = new p80(context3, c6Var3);
                                p80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                p80Var.setEllipsize(TextUtils.TruncateAt.END);
                                int i25 = org.telegram.ui.ActionBar.g6.gc;
                                p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i25, c6Var3));
                                p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i25, c6Var3));
                                p80Var.setTextSize(1, 14.0f);
                                p80Var.setSingleLine(true);
                                p80Var.setDisablePaddingsOffsetY(true);
                                org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(p80Var, 24.0f, i14);
                                String string4 = LocaleController.getString(z15 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                                dq a2 = ja.a(24, "fragment");
                                int dp = AndroidUtilities.dp(f10);
                                int dp2 = AndroidUtilities.dp(f10);
                                a2.e = dp;
                                a2.f = dp2;
                                g5Var.b.setImageBitmap(a2);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) string4));
                                spannableStringBuilder2.setSpan(g5Var, 0, 1, 33);
                                spannableStringBuilder2.setSpan(new f9(e3VarArr3, context3, z15), 3, spannableStringBuilder2.length(), 33);
                                p80Var.setText(spannableStringBuilder2);
                                yy0Var12.i(p80Var, LocaleController.getString(R.string.StarsTransactionRecipient));
                                yy0Var2 = yy0Var12;
                            } else {
                                yy0Var12.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                                yy0Var2 = yy0Var12;
                            }
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            yy0Var12.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                            yy0Var2 = yy0Var12;
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            yy0Var12.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                            yy0Var2 = yy0Var12;
                        } else {
                            yy0Var2 = yy0Var12;
                            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                yy0Var12.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                                yy0Var2 = yy0Var12;
                            }
                        }
                    }
                } else if (starsTransaction2.stargift_upgrade) {
                    if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                        starsTransaction5 = starsTransaction2;
                        viewGroup2 = linearLayout;
                    } else {
                        oc ocVar = (oc) ((vy0) yy0Var10.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                        tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                        viewGroup2 = linearLayout;
                        Context context6 = context2;
                        starsTransaction5 = starsTransaction;
                        u7.w(i10).M(tL_inputSavedStarGiftUser, new f8(ocVar, i10, context6, c6Var2, 0));
                    }
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction5.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        long peerDialogId3 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                        String string5 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                        Runnable x7Var = new x7(e3VarArr2, peerDialogId3, 1);
                        context5 = context;
                        e3VarArr4 = e3VarArr2;
                        c6Var3 = c6Var;
                        yy0Var10.k(string5, i10, peerDialogId3, x7Var);
                        yy0Var9 = yy0Var10;
                        i14 = i10;
                        starsTransaction3 = starsTransaction5;
                        viewGroup = viewGroup2;
                        e3VarArr3 = e3VarArr4;
                        context3 = context5;
                        yy0Var2 = yy0Var9;
                    } else {
                        e3VarArr4 = e3VarArr2;
                        i14 = i10;
                        c6Var3 = c6Var;
                        yy0Var6 = yy0Var10;
                        starsTransaction3 = starsTransaction5;
                        viewGroup = viewGroup2;
                        e3VarArr3 = e3VarArr4;
                        yy0Var4 = yy0Var6;
                        context3 = context;
                        yy0Var2 = yy0Var4;
                    }
                } else {
                    e3VarArr4 = e3VarArr2;
                    context5 = context2;
                    TL_stars.StarsTransaction starsTransaction7 = starsTransaction2;
                    c6Var3 = c6Var2;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        String str4 = starGift.slug;
                        if (!TextUtils.isEmpty(str4)) {
                            yy0Var10.g(LocaleController.getString(R.string.Gift2Gift), starsTransaction7.stargift.title + " #" + starsTransaction7.stargift.num, new d5.i(context5, i10, str4, i20));
                        }
                        final long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                        long peerDialogId4 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction7.peer).peer);
                        if (!starsTransaction7.offer) {
                            if (starsTransaction7.stargift_resale) {
                                if (negative) {
                                    yy0Var10.d(LocaleController.getString(starsTransaction7.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                                } else {
                                    yy0Var10.d(LocaleController.getString(starsTransaction7.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                    j13 = clientUserId;
                                }
                            } else if (starsTransaction7.stargift_drop_original_details) {
                                yy0Var10.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                                peerDialogId4 = clientUserId;
                                j13 = peerDialogId4;
                            } else {
                                yy0Var10.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                            }
                            j13 = peerDialogId4;
                            peerDialogId4 = clientUserId;
                        } else if (negative) {
                            yy0Var10.d(LocaleController.getString(starsTransaction7.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                            j13 = peerDialogId4;
                            peerDialogId4 = clientUserId;
                        } else {
                            yy0Var10.d(LocaleController.getString(starsTransaction7.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                            j13 = clientUserId;
                        }
                        int i26 = (peerDialogId4 > clientUserId ? 1 : (peerDialogId4 == clientUserId ? 0 : -1));
                        if (i26 != 0) {
                            final long j16 = peerDialogId4;
                            final int i27 = 0;
                            viewGroup = linearLayout;
                            j15 = j13;
                            i17 = i26;
                            str3 = "⭐️ ";
                            j14 = clientUserId;
                            yy0Var8 = yy0Var10;
                            yy0Var8.k(LocaleController.getString(R.string.Gift2From), i10, j16, new Runnable() { // from class: hh.g8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i27) {
                                        case 0:
                                            e3VarArr4[0].dismiss();
                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                long j17 = j16;
                                                Bundle h = com.google.android.recaptcha.internal.a.h(j17, "user_id");
                                                if (j17 == clientUserId) {
                                                    h.putBoolean("my_profile", true);
                                                }
                                                h.putBoolean("open_gifts", true);
                                                U2.presentFragment(new ProfileActivity(h, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            e3VarArr4[0].dismiss();
                                            org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                            if (U3 != null) {
                                                long j18 = j16;
                                                Bundle h10 = com.google.android.recaptcha.internal.a.h(j18, "user_id");
                                                if (j18 == clientUserId) {
                                                    h10.putBoolean("my_profile", true);
                                                }
                                                h10.putBoolean("open_gifts", true);
                                                U3.presentFragment(new ProfileActivity(h10, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            yy0Var8 = yy0Var10;
                            j14 = clientUserId;
                            viewGroup = linearLayout;
                            j15 = j13;
                            i17 = i26;
                            str3 = "⭐️ ";
                        }
                        if (j15 != j14) {
                            final long j17 = j14;
                            final int i28 = 1;
                            final long j18 = j15;
                            yy0Var8.k(LocaleController.getString(R.string.Gift2To), i10, j18, new Runnable() { // from class: hh.g8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i28) {
                                        case 0:
                                            e3VarArr4[0].dismiss();
                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                long j172 = j18;
                                                Bundle h = com.google.android.recaptcha.internal.a.h(j172, "user_id");
                                                if (j172 == j17) {
                                                    h.putBoolean("my_profile", true);
                                                }
                                                h.putBoolean("open_gifts", true);
                                                U2.presentFragment(new ProfileActivity(h, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            e3VarArr4[0].dismiss();
                                            org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                            if (U3 != null) {
                                                long j182 = j18;
                                                Bundle h10 = com.google.android.recaptcha.internal.a.h(j182, "user_id");
                                                if (j182 == j17) {
                                                    h10.putBoolean("my_profile", true);
                                                }
                                                h10.putBoolean("open_gifts", true);
                                                U3.presentFragment(new ProfileActivity(h10, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        yy0 yy0Var13 = yy0Var8;
                        if ((i17 == 0 || starsTransaction7.stargift_resale) && (starsAmount = starsTransaction7.starref_amount) != null && starsTransaction7.starref_commission_permille > 0) {
                            TL_stars.StarsAmount starsAmount4 = starsTransaction7.amount;
                            if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                tL_starsTonAmount.amount = starsTransaction7.amount.amount + starsTransaction7.starref_amount.amount;
                                cq[] cqVarArr = new cq[1];
                                yy0Var13.d(W0(starsTransaction7.amount, str3 + ((Object) I0(tL_starsTonAmount)), cqVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                cq cqVar = cqVarArr[0];
                                if (cqVar != null) {
                                    cqVar.setOverrideColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var3));
                                }
                            } else {
                                yy0Var13.d(X0(starsTransaction7.amount instanceof TL_stars.TL_starsTonAmount, i0.a.m(Math.abs(Math.round(starsTransaction7.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder(str3)), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                            }
                        }
                        i14 = i10;
                        yy0Var9 = yy0Var13;
                        starsTransaction3 = starsTransaction7;
                        e3VarArr3 = e3VarArr4;
                        context3 = context5;
                        yy0Var2 = yy0Var9;
                    } else {
                        viewGroup = linearLayout;
                        if (starsTransaction7.refund) {
                            i14 = i10;
                            yy0Var6 = yy0Var10;
                            starsTransaction3 = starsTransaction7;
                            e3VarArr3 = e3VarArr4;
                            yy0Var4 = yy0Var6;
                            context3 = context;
                            yy0Var2 = yy0Var4;
                        } else {
                            long clientUserId2 = j10 == 0 ? UserConfig.getInstance(i10).getClientUserId() : j10;
                            final long peerDialogId5 = DialogObject.getPeerDialogId(starsTransaction7.peer.peer);
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId5));
                            if (positive) {
                                if (peerDialogId5 != clientUserId2) {
                                    CharSequence string6 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                    Runnable y7Var2 = new y7(e3VarArr4, starsTransaction7, peerDialogId5, 3);
                                    String string7 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId5)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                    final int i29 = 0;
                                    i16 = i10;
                                    Runnable runnable = new Runnable() { // from class: hh.b8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i29) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.e3 e3Var2 = e3VarArr4[0];
                                                    Objects.requireNonNull(e3Var2);
                                                    new gh.k2(context5, i16, peerDialogId5, null, new ag.n0(e3Var2, 17)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.e3 e3Var3 = e3VarArr4[0];
                                                    Objects.requireNonNull(e3Var3);
                                                    new gh.k2(context5, i16, peerDialogId5, null, new ag.n0(e3Var3, 17)).show();
                                                    break;
                                            }
                                        }
                                    };
                                    yy0Var7 = yy0Var10;
                                    e3VarArr6 = e3VarArr4;
                                    yy0Var7.j(string6, i16, peerDialogId5, y7Var2, string7, runnable);
                                } else {
                                    i16 = i10;
                                    yy0Var7 = yy0Var10;
                                    e3VarArr6 = e3VarArr4;
                                }
                                final int i30 = 1;
                                yy0Var7.k(LocaleController.getString(R.string.StarGiveawayPrizeTo), i16, clientUserId2, new Runnable() { // from class: hh.z7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i30) {
                                            case 0:
                                                e3VarArr6[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                                    bundle.putBoolean("my_profile", true);
                                                    U2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                e3VarArr6[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
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
                                                e3VarArr6[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
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
                                starsTransaction4 = starsTransaction;
                                e3VarArr5 = e3VarArr6;
                            } else {
                                long j19 = clientUserId2;
                                if (peerDialogId5 != j19) {
                                    final int i31 = 2;
                                    yy0Var10.k(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, j19, new Runnable() { // from class: hh.z7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i31) {
                                                case 0:
                                                    e3VarArr4[0].dismiss();
                                                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                        bundle.putBoolean("my_profile", true);
                                                        U2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    e3VarArr4[0].dismiss();
                                                    org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
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
                                                    e3VarArr4[0].dismiss();
                                                    org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
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
                                CharSequence string8 = LocaleController.getString(R.string.StarGiveawayPrizeTo);
                                Runnable y7Var3 = new y7(e3VarArr4, starsTransaction, peerDialogId5, 4);
                                starsTransaction4 = starsTransaction;
                                String string9 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId5)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                final int i32 = 1;
                                Runnable runnable2 = new Runnable() { // from class: hh.b8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i32) {
                                            case 0:
                                                org.telegram.ui.ActionBar.e3 e3Var2 = e3VarArr4[0];
                                                Objects.requireNonNull(e3Var2);
                                                new gh.k2(context, i10, peerDialogId5, null, new ag.n0(e3Var2, 17)).show();
                                                break;
                                            default:
                                                org.telegram.ui.ActionBar.e3 e3Var3 = e3VarArr4[0];
                                                Objects.requireNonNull(e3Var3);
                                                new gh.k2(context, i10, peerDialogId5, null, new ag.n0(e3Var3, 17)).show();
                                                break;
                                        }
                                    }
                                };
                                e3VarArr5 = e3VarArr4;
                                yy0Var7 = yy0Var10;
                                yy0Var7.j(string8, i10, peerDialogId5, y7Var3, string9, runnable2);
                            }
                            yy0Var5 = yy0Var7;
                            starsTransaction3 = starsTransaction4;
                            e3VarArr3 = e3VarArr5;
                            context3 = context;
                            yy0Var3 = yy0Var5;
                            i14 = i10;
                            yy0Var2 = yy0Var3;
                        }
                    }
                }
                starsTransactionPeer = starsTransaction3.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction3.flags & 256) != 0) {
                    long peerDialogId6 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                    if (z10) {
                        peerDialogId6 = j10;
                    }
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId6));
                    if (chat != null) {
                        p80 p80Var2 = new p80(context3, c6Var3);
                        p80Var2.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                        p80Var2.setEllipsize(TextUtils.TruncateAt.END);
                        int i33 = org.telegram.ui.ActionBar.g6.gc;
                        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i33, c6Var3));
                        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i33, c6Var3));
                        p80Var2.setTextSize(1, 14.0f);
                        p80Var2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        if (starsTransaction3.extended_media.isEmpty()) {
                            z14 = z15;
                        } else {
                            ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction3.extended_media;
                            int size = arrayList.size();
                            z14 = z15;
                            int i34 = 0;
                            int i35 = 0;
                            while (i34 < size) {
                                TLRPC.MessageMedia messageMedia = arrayList.get(i34);
                                int i36 = i34 + 1;
                                TLRPC.MessageMedia messageMedia2 = messageMedia;
                                ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                int i37 = size;
                                f70 f70Var = new f70(p80Var2, 24.0f, i14);
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                    i15 = i35;
                                    forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia2.photo);
                                } else {
                                    i15 = i35;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                        forDocument2 = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia2.document);
                                    } else {
                                        imageLocation2 = null;
                                        if (imageLocation2 == null) {
                                            f70Var.a(6.0f);
                                            f70Var.b.setImage(imageLocation2, "24_24", null, null, null, 0);
                                            SpannableString spannableString = new SpannableString("x");
                                            spannableString.setSpan(f70Var, 0, spannableString.length(), 33);
                                            spannableStringBuilder3.append((CharSequence) spannableString);
                                            spannableStringBuilder3.append((CharSequence) " ");
                                            i35 = i15 + 1;
                                        } else {
                                            i35 = i15;
                                        }
                                        if (i35 < 3) {
                                            break;
                                        }
                                        i34 = i36;
                                        size = i37;
                                        arrayList = arrayList2;
                                    }
                                }
                                imageLocation2 = forDocument2;
                                if (imageLocation2 == null) {
                                }
                                if (i35 < 3) {
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
                            i0.a.z(sb2, MessagesController.getInstance(i14).linkPrefix, "/", publicUsername, "/");
                            sb2.append(starsTransaction3.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb2.toString());
                        }
                        y7 y7Var4 = new y7(e3VarArr3, peerDialogId6, starsTransaction3);
                        spannableStringBuilder3.setSpan(new g9(y7Var4), length, spannableStringBuilder3.length(), 33);
                        p80Var2.setSingleLine(true);
                        p80Var2.setEllipsize(TextUtils.TruncateAt.END);
                        p80Var2.setText(spannableStringBuilder3);
                        p80Var2.setOnClickListener(new ag.w0(y7Var4, 18));
                        yy0Var2.i(p80Var2, LocaleController.getString(starsTransaction3.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                        if (!TextUtils.isEmpty(starsTransaction3.id) && !z19) {
                            String string10 = LocaleController.getString(R.string.StarsTransactionID);
                            String str5 = starsTransaction3.id;
                            yy0Var2.h(string10, str5, str5.length() <= 25 ? 9 : 10, new m5(5, e3VarArr3, c6Var3));
                        }
                        if (starsTransaction3.floodskip && starsTransaction3.floodskip_number > 0) {
                            yy0Var2.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction3.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                        }
                        yy0Var2.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                        starGift2 = starsTransaction3.stargift;
                        if (starGift2 != null) {
                            if (starGift2.limited) {
                                F0(yy0Var2, i14, starGift2, c6Var3);
                            }
                            if (!TextUtils.isEmpty(starsTransaction3.description)) {
                                yy0Var2.a(new SpannableStringBuilder(starsTransaction3.description));
                            }
                        }
                        ViewGroup viewGroup3 = viewGroup;
                        viewGroup3.addView(yy0Var2, h7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                        if ((starsTransaction3.flags & 32) != 0) {
                            yy0Var2.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.transaction_date * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
                        }
                        if (z14) {
                            context4 = context;
                        } else {
                            context4 = context;
                            p80 p80Var3 = new p80(context4, c6Var3);
                            p80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var3));
                            p80Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var3));
                            p80Var3.setTextSize(1, 14.0f);
                            p80Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new e2.e(context4, 4)));
                            p80Var3.setGravity(17);
                            viewGroup3.addView(p80Var3, h7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                        }
                        lh.d dVar = new lh.d(context4, c6Var3);
                        dVar.e();
                        if ((starsTransaction3.flags & 32) != 0) {
                            dVar.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer));
                        } else {
                            dVar.h(LocaleController.getString(R.string.OK));
                        }
                        viewGroup3.addView(dVar, h7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                        org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                        e3Var2.customView = viewGroup3;
                        int i38 = 0;
                        e3VarArr3[0] = e3Var2;
                        e3Var2.useBackgroundTopPadding = false;
                        if ((starsTransaction3.flags & 32) != 0) {
                            dVar.setOnClickListener(new ag.q0(context4, starsTransaction3));
                        } else {
                            dVar.setOnClickListener(new d8(e3VarArr3, i38));
                        }
                        e3VarArr3[0].fixNavigationBar();
                        U = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                            e3VarArr3[0].makeAttached(U);
                        }
                        e3VarArr3[0].show();
                        return e3VarArr3[0];
                    }
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    String string102 = LocaleController.getString(R.string.StarsTransactionID);
                    String str52 = starsTransaction3.id;
                    yy0Var2.h(string102, str52, str52.length() <= 25 ? 9 : 10, new m5(5, e3VarArr3, c6Var3));
                }
                if (starsTransaction3.floodskip) {
                    yy0Var2.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction3.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                }
                yy0Var2.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup32 = viewGroup;
                viewGroup32.addView(yy0Var2, h7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z14) {
                }
                lh.d dVar2 = new lh.d(context4, c6Var3);
                dVar2.e();
                if ((starsTransaction3.flags & 32) != 0) {
                }
                viewGroup32.addView(dVar2, h7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.e3 e3Var22 = e3Var;
                e3Var22.customView = viewGroup32;
                int i382 = 0;
                e3VarArr3[0] = e3Var22;
                e3Var22.useBackgroundTopPadding = false;
                if ((starsTransaction3.flags & 32) != 0) {
                }
                e3VarArr3[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                    e3VarArr3[0].makeAttached(U);
                }
                e3VarArr3[0].show();
                return e3VarArr3[0];
            }
        }
        e3Var = o10;
        e3VarArr = e3VarArr7;
        z11 = z17;
        final org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
        if (starsTransaction.premium_gift) {
            c1(n9Var2, n9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            g10.addView(n9Var2, h7.z5.t(160, 160, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            dq a3 = org.telegram.ui.Cells.q6.a(100, "search");
            int dp3 = AndroidUtilities.dp(40.0f);
            int dp4 = AndroidUtilities.dp(40.0f);
            a3.e = dp3;
            a3.f = dp4;
            n9Var2.setImageDrawable(a3);
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
                    c10 = 2;
                    z13 = z10;
                    j11 = j10;
                    c6Var2 = c6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        d1(n9Var2, n9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        b1(n9Var2, n9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(n9Var2, h7.z5.t(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = g10;
                    c10 = 2;
                    z13 = z10;
                    j11 = j10;
                    c6Var2 = c6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            n9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            z12 = z18;
                            n9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                            str = "";
                        } else {
                            z12 = z18;
                            n9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            if (z12) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z13) {
                                j12 = j11;
                                org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8();
                                if (j12 < 0) {
                                    str = "";
                                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j12));
                                    y8Var.r(user2);
                                    n9Var2.e(user2, y8Var);
                                } else {
                                    str = "";
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j12));
                                    y8Var.q(chat2);
                                    n9Var2.e(chat2, y8Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            j12 = DialogObject.getPeerDialogId(peer);
                            org.telegram.ui.Components.y8 y8Var2 = new org.telegram.ui.Components.y8();
                            if (j12 < 0) {
                            }
                        }
                        linearLayout.addView(n9Var2, h7.z5.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z12 = z18;
                        dq a10 = org.telegram.ui.Cells.q6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int dp5 = AndroidUtilities.dp(40.0f);
                        int dp6 = AndroidUtilities.dp(40.0f);
                        a10.e = dp5;
                        a10.f = dp6;
                        n9Var2.setImageDrawable(a10);
                    }
                } else {
                    n9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia3.document);
                    } else {
                        imageLocation = null;
                        n9Var2.l(imageLocation, "100_100", null, null, null, 0);
                        g10.addView(n9Var2, h7.z5.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        c10 = 2;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: hh.w7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction8 = starsTransaction;
                                long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction8.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i39 = 0; i39 < starsTransaction8.extended_media.size(); i39++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction8.extended_media.get(i39);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction8.msg_id;
                                    tL_message.dialog_id = peerDialogId7;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j20 = -peerDialogId7;
                                    tL_peerChannel.channel_id = j20;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j20;
                                    tL_message.date = starsTransaction8.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new MessageObject(i10, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.t1().K2(null, LaunchActivity.R(), c6Var);
                                PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new r9(n9Var2, g10, peerDialogId7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        c6Var2 = c6Var;
                        i11 = i10;
                        linearLayout = g10;
                        j11 = j10;
                        n9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z12 = z18;
                    }
                    imageLocation = forDocument;
                    n9Var2.l(imageLocation, "100_100", null, null, null, 0);
                    g10.addView(n9Var2, h7.z5.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    c10 = 2;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: hh.w7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z10;
                            TL_stars.StarsTransaction starsTransaction8 = starsTransaction;
                            long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction8.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i39 = 0; i39 < starsTransaction8.extended_media.size(); i39++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction8.extended_media.get(i39);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction8.msg_id;
                                tL_message.dialog_id = peerDialogId7;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j20 = -peerDialogId7;
                                tL_peerChannel.channel_id = j20;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j20;
                                tL_message.date = starsTransaction8.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new MessageObject(i10, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.t1().K2(null, LaunchActivity.R(), c6Var);
                            PhotoViewer.t1().a2(arrayList3, 0, peerDialogId7, 0L, 0L, new r9(n9Var2, g10, peerDialogId7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    c6Var2 = c6Var;
                    i11 = i10;
                    linearLayout = g10;
                    j11 = j10;
                    n9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z18;
                }
                TextView textView = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.g6.j5;
                rl.w(i12, c6Var2, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(N0(i11, z13, starsTransaction2));
                TextView i39 = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.t(-1, -2, 17, 36, 0, 36, 4), context2);
                i39.setTextSize(1, 18.0f);
                i39.setTypeface(AndroidUtilities.bold());
                i39.setGravity(17);
                i39.setTextColor(org.telegram.ui.ActionBar.g6.v0(!positive ? org.telegram.ui.ActionBar.g6.uj : org.telegram.ui.ActionBar.g6.wj, c6Var2));
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                str2 = positive ? "+" : str;
                SpannableStringBuilder I02 = I0(starsAmount5);
                CharSequence[] charSequenceArr2 = new CharSequence[3];
                charSequenceArr2[0] = str2;
                charSequenceArr2[1] = I02;
                charSequenceArr2[c10] = " ⭐️";
                i39.setText(X0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(charSequenceArr2), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(i39.getText());
                if (!starsTransaction2.refund) {
                    G0(spannableStringBuilder4, i39, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    i39.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, c6Var2));
                    G0(spannableStringBuilder4, i39, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    i39.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.yj, c6Var2));
                    G0(spannableStringBuilder4, i39, LocaleController.getString(R.string.StarsPending));
                }
                i39.setText(spannableStringBuilder4);
                linearLayout.addView(i39, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    p80 p80Var4 = new p80(context2);
                    p80Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var2));
                    p80Var4.setTextSize(1, 14.0f);
                    p80Var4.setGravity(17);
                    p80Var4.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var2));
                    p80Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, nh.k.G0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j11 == UserConfig.getInstance(i11).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), 2)) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new c8(j11, i11, 0)), true));
                    }
                    p80Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(p80Var4, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                    e3VarArr2 = e3VarArr;
                    f10 = 16.0f;
                    yy0 yy0Var102 = new yy0(context2, c6Var2);
                    starGift = starsTransaction2.stargift;
                    int i202 = 6;
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
                    yy0Var2.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction3.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322 = viewGroup;
                    viewGroup322.addView(yy0Var2, h7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    lh.d dVar22 = new lh.d(context4, c6Var3);
                    dVar22.e();
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    viewGroup322.addView(dVar22, h7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.e3 e3Var222 = e3Var;
                    e3Var222.customView = viewGroup322;
                    int i3822 = 0;
                    e3VarArr3[0] = e3Var222;
                    e3Var222.useBackgroundTopPadding = false;
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    e3VarArr3[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    e3VarArr3[0].show();
                    return e3VarArr3[0];
                }
                if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z19 || starsTransaction2.gift)) {
                    TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                    TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                    boolean isUserSelf = UserObject.isUserSelf(user3);
                    if (isUserSelf) {
                        i39.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var2));
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i13 = 1;
                        i39.setText(X0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(I0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i13 = 1;
                    }
                    p80 p80Var5 = new p80(context2);
                    p80Var5.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var2));
                    f10 = 16.0f;
                    p80Var5.setTextSize(i13, 16.0f);
                    p80Var5.setGravity(17);
                    p80Var5.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var2));
                    p80Var5.setDisablePaddingsOffsetY(i13);
                    if (isUserSelf) {
                        int i40 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i13];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i40, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    e3VarArr2 = e3VarArr;
                    p80Var5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new e8(context2, e3VarArr2)), true)));
                    linearLayout.addView(p80Var5, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    e3VarArr2 = e3VarArr;
                    f10 = 16.0f;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        rl.l(i12, c6Var2, textView2, 1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                yy0 yy0Var1022 = new yy0(context2, c6Var2);
                starGift = starsTransaction2.stargift;
                int i2022 = 6;
                if (starGift != null) {
                }
                starsTransactionPeer = starsTransaction3.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    long peerDialogId62 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                    if (z10) {
                    }
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId62));
                    if (chat != null) {
                    }
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                }
                if (starsTransaction3.floodskip) {
                }
                yy0Var2.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup3222 = viewGroup;
                viewGroup3222.addView(yy0Var2, h7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z14) {
                }
                lh.d dVar222 = new lh.d(context4, c6Var3);
                dVar222.e();
                if ((starsTransaction3.flags & 32) != 0) {
                }
                viewGroup3222.addView(dVar222, h7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.e3 e3Var2222 = e3Var;
                e3Var2222.customView = viewGroup3222;
                int i38222 = 0;
                e3VarArr3[0] = e3Var2222;
                e3Var2222.useBackgroundTopPadding = false;
                if ((starsTransaction3.flags & 32) != 0) {
                }
                e3VarArr3[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                e3VarArr3[0].show();
                return e3VarArr3[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                n9Var2.setImageDrawable(new v4(n9Var2, starsTransaction.stargift, 94, 0.44f));
                g10.addView(n9Var2, h7.z5.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                a1(n9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                g10.addView(n9Var2, h7.z5.t(160, 160, 17, 0, -8, 0, 10));
            }
        }
        c6Var2 = c6Var;
        context2 = context;
        i11 = i10;
        starsTransaction2 = starsTransaction;
        linearLayout = g10;
        str = "";
        z12 = z18;
        c10 = 2;
        z13 = z10;
        j11 = j10;
        TextView textView3 = new TextView(context2);
        i12 = org.telegram.ui.ActionBar.g6.j5;
        rl.w(i12, c6Var2, textView3, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(N0(i11, z13, starsTransaction2));
        TextView i392 = org.telegram.ui.Cells.pa.i(linearLayout, textView3, h7.z5.t(-1, -2, 17, 36, 0, 36, 4), context2);
        i392.setTextSize(1, 18.0f);
        i392.setTypeface(AndroidUtilities.bold());
        i392.setGravity(17);
        i392.setTextColor(org.telegram.ui.ActionBar.g6.v0(!positive ? org.telegram.ui.ActionBar.g6.uj : org.telegram.ui.ActionBar.g6.wj, c6Var2));
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        if (positive) {
        }
        SpannableStringBuilder I022 = I0(starsAmount52);
        CharSequence[] charSequenceArr22 = new CharSequence[3];
        charSequenceArr22[0] = str2;
        charSequenceArr22[1] = I022;
        charSequenceArr22[c10] = " ⭐️";
        i392.setText(X0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(charSequenceArr22), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(i392.getText());
        if (!starsTransaction2.refund) {
        }
        i392.setText(spannableStringBuilder42);
        linearLayout.addView(i392, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        e3VarArr2 = e3VarArr;
        f10 = 16.0f;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            rl.l(i12, c6Var2, textView22, 1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, h7.z5.t(-1, -2, 17, 36, 0, 36, 4));
        }
        yy0 yy0Var10222 = new yy0(context2, c6Var2);
        starGift = starsTransaction2.stargift;
        int i20222 = 6;
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
        yy0Var2.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction3.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction3.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        starGift2 = starsTransaction3.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup32222 = viewGroup;
        viewGroup32222.addView(yy0Var2, h7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction3.flags & 32) != 0) {
        }
        if (z14) {
        }
        lh.d dVar2222 = new lh.d(context4, c6Var3);
        dVar2222.e();
        if ((starsTransaction3.flags & 32) != 0) {
        }
        viewGroup32222.addView(dVar2222, h7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.e3 e3Var22222 = e3Var;
        e3Var22222.customView = viewGroup32222;
        int i382222 = 0;
        e3VarArr3[0] = e3Var22222;
        e3Var22222.useBackgroundTopPadding = false;
        if ((starsTransaction3.flags & 32) != 0) {
        }
        e3VarArr3[0].fixNavigationBar();
        U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet()) {
        }
        e3VarArr3[0].show();
        return e3VarArr3[0];
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
    public static void x0(oa oaVar, int i10) {
        n41 G;
        char c10;
        String str;
        boolean z10;
        final boolean z11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i11;
        org.telegram.ui.ActionBar.e3[] e3VarArr;
        int i12;
        yy0 yy0Var;
        int i13;
        String str2;
        String str3;
        boolean z12;
        boolean z13;
        long currentTime;
        final org.telegram.ui.ActionBar.e3[] e3VarArr2;
        final int i14;
        ?? r42;
        org.telegram.ui.ActionBar.n2 U;
        n9 n9Var = oaVar.c0;
        if (n9Var == null || (G = n9Var.G(i10)) == null) {
            return;
        }
        int i15 = G.d;
        if (i15 == -1) {
            oaVar.c0.N(true);
            return;
        }
        if (i15 == -2) {
            u7.y(oaVar.currentAccount, false).u();
            cg.y2.e0(1, BirthdayController.getInstance(oaVar.currentAccount).getState());
            return;
        }
        if (i15 == -3) {
            u7.y(oaVar.currentAccount, false).W();
            oaVar.c0.N(true);
            return;
        }
        if (i15 == -4) {
            if (MessagesController.getInstance(oaVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(oaVar.currentAccount);
                return;
            } else {
                oaVar.presentFragment(new nh.s3(oaVar.getUserConfig().getClientUserId()));
                return;
            }
        }
        int i16 = 3;
        if (G.G(aa.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                u7.y(oaVar.currentAccount, false).f(oaVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new cg.u0(i16, oaVar, G), null);
                return;
            }
            return;
        }
        if (G.G(ga.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = oaVar.getParentActivity();
            int i17 = oaVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.c6 resourceProvider = oaVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(parentActivity, resourceProvider, false, false);
            e3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.e3[] e3VarArr3 = new org.telegram.ui.ActionBar.e3[1];
            LinearLayout f10 = org.telegram.messenger.y1.f(parentActivity, 1);
            f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            f10.addView(frameLayout, h7.z5.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr = new boolean[1];
            h9 h9Var = new h9(zArr, e3VarArr3);
            NotificationCenter.getInstance(i17).addObserver(h9Var, NotificationCenter.starSubscriptionsLoaded);
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(parentActivity);
            if (peerDialogId >= 0) {
                c10 = 0;
                TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                str = UserObject.getUserName(user);
                boolean isBot = UserObject.isBot(user);
                z10 = !isBot;
                z11 = isBot;
                chat = user;
            } else {
                c10 = 0;
                TLRPC.Chat chat3 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                str = chat3 == null ? "" : chat3.title;
                z10 = false;
                z11 = false;
                chat = chat3;
            }
            String str4 = str;
            if (starsSubscription.photo != null) {
                n9Var2.setRoundRadius(AndroidUtilities.dp(21.0f));
                chat2 = chat;
                n9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", null, null);
            } else {
                chat2 = chat;
                n9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                if (peerDialogId < 0) {
                    i11 = i17;
                    e3VarArr = e3VarArr3;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(-peerDialogId));
                    y8Var.q(chat4);
                    n9Var2.e(chat4, y8Var);
                    frameLayout.addView(n9Var2, h7.z5.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, h7.z5.e(28, 28, 17));
                        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, h7.z5.e(28, 28, 17));
                        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    rl.w(org.telegram.ui.ActionBar.g6.j5, resourceProvider, textView, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                    }
                    f10.addView(textView, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
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
                        objArr[c10] = valueOf;
                        textView2.setText(X0(false, LocaleController.formatString(i18, objArr), 0.8f, null));
                    } else {
                        textView2.setText(X0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), i12 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    f10.addView(textView2, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
                    yy0Var = new yy0(parentActivity, resourceProvider);
                    p80 p80Var = new p80(parentActivity, resourceProvider);
                    p80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                    p80Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i19 = org.telegram.ui.ActionBar.g6.gc;
                    p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i19, resourceProvider));
                    p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i19, resourceProvider));
                    p80Var.setTextSize(1, 14.0f);
                    p80Var.setSingleLine(true);
                    p80Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(p80Var, 24.0f, i11);
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
                    org.telegram.ui.ActionBar.e3[] e3VarArr4 = e3VarArr;
                    spannableStringBuilder.setSpan(new i9(e3VarArr4, peerDialogId), 3, spannableStringBuilder.length(), 33);
                    p80Var.setText(spannableStringBuilder);
                    if (!z13) {
                        yy0Var.i(p80Var, LocaleController.getString(peerDialogId < 0 ? R.string.StarsSubscriptionChannel : z10 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot));
                    }
                    if (peerDialogId >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                        yy0Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
                    }
                    yy0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i20).getCurrentTime();
                    yy0Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    f10.addView(yy0Var, h7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    p80 p80Var2 = new p80(parentActivity, resourceProvider);
                    int i21 = org.telegram.ui.ActionBar.g6.z6;
                    p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i21, resourceProvider));
                    int i22 = i13;
                    p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                    final int i23 = 1;
                    p80Var2.setTextSize(1, 14.0f);
                    p80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
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
                                                        handler.post(new a9.o(fVar, obj2, false, 3));
                                                        try {
                                                            if (i25 == 26 || i25 == 27) {
                                                                Boolean bool = Boolean.FALSE;
                                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                            } else {
                                                                activity.recreate();
                                                            }
                                                            handler.post(new a9.o(application, fVar, false, 4));
                                                            break;
                                                        } catch (Throwable th) {
                                                            handler.post(new a9.o(application, fVar, false, 4));
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
                                    we.e.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                                    break;
                            }
                        }
                    }));
                    p80Var2.setGravity(17);
                    f10.addView(p80Var2, h7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        e3VarArr2 = e3VarArr4;
                        i14 = i20;
                        p80 p80Var3 = new p80(parentActivity, resourceProvider);
                        p80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i21, resourceProvider));
                        p80Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                        p80Var3.setTextSize(1, 14.0f);
                        p80Var3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        p80Var3.setSingleLine(false);
                        p80Var3.setMaxLines(4);
                        p80Var3.setGravity(17);
                        f10.addView(p80Var3, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            lh.d dVar = new lh.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r42 = 0;
                            dVar.g(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                            f10.addView(dVar, h7.z5.n(-1, 48));
                            w8 w8Var = new w8(dVar, starsSubscription, i14, e3VarArr2, resourceProvider, zArr, parentActivity);
                            i14 = i14;
                            dVar.setOnClickListener(w8Var);
                            e3Var.customView = f10;
                            e3VarArr2[r42] = e3Var;
                            e3Var.useBackgroundTopPadding = r42;
                            e3Var.setOnDismissListener(new x8(i14, h9Var));
                            e3VarArr2[r42].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                e3VarArr2[r42].makeAttached(U);
                            }
                            e3VarArr2[r42].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        p80 p80Var4 = new p80(parentActivity, resourceProvider);
                        p80Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i21, resourceProvider));
                        p80Var4.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                        p80Var4.setTextSize(1, 14.0f);
                        p80Var4.setText(LocaleController.formatString(z11 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        p80Var4.setSingleLine(false);
                        p80Var4.setMaxLines(4);
                        p80Var4.setGravity(17);
                        f10.addView(p80Var4, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        lh.d dVar2 = new lh.d(parentActivity, resourceProvider, true);
                        dVar2.g(LocaleController.getString(z11 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false, true);
                        f10.addView(dVar2, h7.z5.n(-1, 48));
                        String str6 = str2;
                        e3VarArr2 = e3VarArr4;
                        t8 t8Var = new t8(dVar2, i20, starsSubscription, e3VarArr2, peerDialogId, parentActivity, resourceProvider, z10, str6);
                        i14 = i20;
                        dVar2.setOnClickListener(t8Var);
                    } else {
                        String str7 = str2;
                        final boolean z16 = z10;
                        i14 = i20;
                        e3VarArr2 = e3VarArr4;
                        if (starsSubscription.bot_canceled) {
                            p80 p80Var5 = new p80(parentActivity, resourceProvider);
                            p80Var5.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                            p80Var5.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                            p80Var5.setTextSize(1, 14.0f);
                            p80Var5.setText(LocaleController.getString(z16 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                            p80Var5.setSingleLine(false);
                            p80Var5.setMaxLines(4);
                            p80Var5.setGravity(17);
                            f10.addView(p80Var5, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            p80 p80Var6 = new p80(parentActivity, resourceProvider);
                            p80Var6.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                            p80Var6.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                            p80Var6.setTextSize(1, 14.0f);
                            p80Var6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                            p80Var6.setSingleLine(false);
                            p80Var6.setMaxLines(4);
                            p80Var6.setGravity(17);
                            f10.addView(p80Var6, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                lh.d dVar3 = new lh.d(parentActivity, resourceProvider, true);
                                dVar3.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                                f10.addView(dVar3, h7.z5.n(-1, 48));
                                u8 u8Var = new u8(dVar3, starsSubscription, i14, e3VarArr2, chat2, str7);
                                i14 = i14;
                                dVar3.setOnClickListener(u8Var);
                            }
                        } else {
                            final TLRPC.Chat chat6 = chat2;
                            p80 p80Var7 = new p80(parentActivity, resourceProvider);
                            p80Var7.setTextColor(org.telegram.ui.ActionBar.g6.v0(i21, resourceProvider));
                            p80Var7.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i22, resourceProvider));
                            p80Var7.setTextSize(1, 14.0f);
                            p80Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                            p80Var7.setSingleLine(false);
                            p80Var7.setMaxLines(4);
                            p80Var7.setGravity(17);
                            f10.addView(p80Var7, h7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final lh.d dVar4 = new lh.d(parentActivity, resourceProvider, false);
                            dVar4.g(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                            dVar4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, resourceProvider));
                            f10.addView(dVar4, h7.z5.n(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: hh.v8
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final lh.d dVar5 = dVar4;
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
                                    final org.telegram.ui.ActionBar.e3[] e3VarArr5 = e3VarArr2;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: hh.z8
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            AndroidUtilities.runOnUIThread(new a9(i24, dVar5, tLObject, starsSubscription2, z17, z18, e3VarArr5));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r42 = 0;
                    e3Var.customView = f10;
                    e3VarArr2[r42] = e3Var;
                    e3Var.useBackgroundTopPadding = r42;
                    e3Var.setOnDismissListener(new x8(i14, h9Var));
                    e3VarArr2[r42].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        e3VarArr2[r42].makeAttached(U);
                    }
                    e3VarArr2[r42].show();
                }
                TLRPC.User user3 = MessagesController.getInstance(i17).getUser(Long.valueOf(peerDialogId));
                y8Var.r(user3);
                n9Var2.e(user3, y8Var);
            }
            i11 = i17;
            e3VarArr = e3VarArr3;
            frameLayout.addView(n9Var2, h7.z5.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            rl.w(org.telegram.ui.ActionBar.g6.j5, resourceProvider, textView3, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            f10.addView(textView3, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            textView22.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, resourceProvider));
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i12 = tL_starsSubscriptionPricing2.period;
            if (i12 != 2592000) {
            }
            f10.addView(textView22, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
            yy0Var = new yy0(parentActivity, resourceProvider);
            p80 p80Var8 = new p80(parentActivity, resourceProvider);
            p80Var8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            p80Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i192 = org.telegram.ui.ActionBar.g6.gc;
            p80Var8.setTextColor(org.telegram.ui.ActionBar.g6.v0(i192, resourceProvider));
            p80Var8.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i192, resourceProvider));
            p80Var8.setTextSize(1, 14.0f);
            p80Var8.setSingleLine(true);
            p80Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(p80Var8, 24.0f, i11);
            if (peerDialogId < 0) {
            }
            String str52 = str3;
            z13 = z12;
            int i202 = i11;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str52));
            spannableStringBuilder2.setSpan(g5Var2, 0, 1, 33);
            org.telegram.ui.ActionBar.e3[] e3VarArr42 = e3VarArr;
            spannableStringBuilder2.setSpan(new i9(e3VarArr42, peerDialogId), 3, spannableStringBuilder2.length(), 33);
            p80Var8.setText(spannableStringBuilder2);
            if (!z13) {
            }
            if (peerDialogId >= 0) {
                yy0Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
            }
            yy0Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i202).getCurrentTime();
            yy0Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
            f10.addView(yy0Var, h7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            p80 p80Var22 = new p80(parentActivity, resourceProvider);
            int i212 = org.telegram.ui.ActionBar.g6.z6;
            p80Var22.setTextColor(org.telegram.ui.ActionBar.g6.v0(i212, resourceProvider));
            int i222 = i13;
            p80Var22.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i222, resourceProvider));
            final int i232 = 1;
            p80Var22.setTextSize(1, 14.0f);
            p80Var22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: e0.a
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
                                                handler.post(new a9.o(fVar, obj2, false, 3));
                                                try {
                                                    if (i25 == 26 || i25 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new a9.o(application, fVar, false, 4));
                                                    break;
                                                } catch (Throwable th) {
                                                    handler.post(new a9.o(application, fVar, false, 4));
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
                            we.e.s(activity, LocaleController.getString(R.string.StarsTOSLink));
                            break;
                    }
                }
            }));
            p80Var22.setGravity(17);
            f10.addView(p80Var22, h7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r42 = 0;
            e3Var.customView = f10;
            e3VarArr2[r42] = e3Var;
            e3Var.useBackgroundTopPadding = r42;
            e3Var.setOnDismissListener(new x8(i14, h9Var));
            e3VarArr2[r42].fixNavigationBar();
            U = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
            }
            e3VarArr2[r42].show();
        }
    }

    public static void z0(oa oaVar, n41 n41Var, Boolean bool, String str) {
        if (oaVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            mc.a0(oaVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) n41Var.B, new Object[0])), R.raw.stars_topup).j();
            oaVar.P.c(true);
            u7.y(oaVar.currentAccount, false).T(true);
        } else if (str != null) {
            org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{str}, mc.a0(oaVar), R.raw.error, 36);
        }
    }

    public final void H0(ArrayList arrayList, b51 b51Var) {
        if (getParentActivity() == null) {
            return;
        }
        u7 y10 = u7.y(this.currentAccount, false);
        ArrayList arrayList2 = y10.v;
        ag.s0 s0Var = (ag.s0) super.r0(getParentActivity());
        n41 n41Var = new n41(-2);
        n41Var.c = s0Var;
        arrayList.add(n41Var);
        arrayList.add(n41.k(this.Q));
        lh.d dVar = this.Z;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(n41.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(nh.g.a(-4, getThemedColor(org.telegram.ui.ActionBar.g6.uj), R.drawable.filled_earn_stars, jo.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(n41.B(null));
        }
        if (y10.e && !arrayList2.isEmpty()) {
            org.telegram.ui.Cells.pa.o(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = ga.a;
                n41 J = n41.J(ga.class);
                J.G = starsSubscription;
                arrayList.add(J);
            }
            if (y10.x) {
                arrayList.add(n41.o(arrayList.size(), 33));
            } else if (!y10.y) {
                n41 c10 = n41.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(n41.B(null));
        }
        boolean O = y10.O(0);
        this.a0 = O;
        if (O) {
            arrayList.add(n41.p(this.N, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
        } else {
            arrayList.add(n41.l(this.O));
        }
    }

    @Override // org.telegram.ui.a20, org.telegram.ui.ActionBar.n2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        this.N = new na(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.O = new ag.s0(this, context, 2);
        super.createView(context);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setClickable(true);
        bg.i iVar = new bg.i(context, 1, 2);
        this.M = iVar;
        bg.a aVar = iVar.b;
        aVar.w = org.telegram.ui.ActionBar.g6.fk;
        aVar.x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        this.M.setStarParticlesView(this.e);
        this.L.addView(this.M, h7.z5.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new e2.e(context, 5)), true), this.L, null);
        this.c.setOverScrollMode(2);
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setOnItemClickListener(new ag.p0(this, 5));
        f00 f00Var = new f00(getParentActivity());
        this.P = f00Var;
        this.s.addView(f00Var, h7.z5.c(-1.0f, -1));
        u7 y10 = u7.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        this.Q.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getParentActivity(), false, true, false);
        this.S = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.S.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.resourceProvider));
        this.R = new SpannableStringBuilder("S");
        f70 f70Var = new f70(this.S, 42.0f, this.currentAccount);
        oi0 oi0Var = new oi0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), "s" + R.raw.star_reaction, AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = f70Var.b;
        imageReceiver.setImageBitmap(oi0Var);
        imageReceiver.setAutoRepeat(2);
        f70Var.f = false;
        f70Var.h = -AndroidUtilities.dp(3.0f);
        this.R.setSpan(f70Var, 0, 1, 33);
        this.Q.addView(this.S, h7.z5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.T = textView;
        textView.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.T.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, this.resourceProvider));
        this.Q.addView(this.T, h7.z5.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        ag.p1 p1Var = new ag.p1(this, getParentActivity(), 5);
        this.V = p1Var;
        frameLayout2.addView(p1Var);
        lh.d dVar = new lh.d(getParentActivity(), this.resourceProvider, true);
        this.W = dVar;
        dVar.e();
        this.W.g("", false, true);
        final int i10 = 0;
        this.W.setOnClickListener(new View.OnClickListener(this) { // from class: hh.h8
            public final /* synthetic */ oa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        oa.B0(this.b, context);
                        break;
                    default:
                        new fa(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.V.addView(this.W, h7.z5.e(-1, 48, 119));
        ra1 ra1Var = new ra1(this, getParentActivity(), 4);
        this.X = ra1Var;
        frameLayout2.addView(ra1Var);
        lh.d dVar2 = new lh.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new cq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.Y.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: hh.h8
            public final /* synthetic */ oa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        oa.B0(this.b, context);
                        break;
                    default:
                        new fa(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.X.addView(this.Y, h7.z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        lh.d dVar3 = new lh.d(getParentActivity(), this.resourceProvider, true);
        this.U = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new cq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.U.g(spannableStringBuilder2, false, true);
        final int i12 = 0;
        this.U.setOnClickListener(new View.OnClickListener(this) { // from class: hh.i8
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
                        oa.A0(this.b);
                        break;
                }
            }
        });
        this.X.addView(this.U, h7.z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.Q.addView(frameLayout2, h7.z5.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        lh.d dVar4 = new lh.d(getParentActivity(), this.resourceProvider, false);
        this.Z = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new cq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.Z.g(spannableStringBuilder3, false, true);
        final int i13 = 1;
        this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: hh.i8
            public final /* synthetic */ oa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        oa oaVar = this.b;
                        oaVar.presentFragment(new r(0, oaVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        oa.A0(this.b);
                        break;
                }
            }
        });
        this.Q.addView(this.Z, h7.z5.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        n9 n9Var = this.c0;
        if (n9Var != null) {
            n9Var.N(false);
        }
        c0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = c0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1(y10.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            n9 n9Var = this.c0;
            if (n9Var != null) {
                n9Var.N(true);
            }
            if (this.J == 0 && this.K < 0) {
                this.K = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            u7 y10 = u7.y(this.currentAccount, false);
            if (this.a0 != y10.O(0)) {
                this.a0 = y10.O(0);
                s0();
                n9 n9Var2 = this.c0;
                if (n9Var2 != null) {
                    n9Var2.N(true);
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
            n9 n9Var3 = this.c0;
            if (n9Var3 != null) {
                n9Var3.N(true);
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
        u7 y10 = u7.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.R);
        spannableStringBuilder.append((CharSequence) J0(y10.p(), 0.66f, ' '));
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
            final int i10 = 0;
            this.V.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: hh.j8
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
            final int i11 = 1;
            this.X.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: hh.j8
                public final /* synthetic */ oa b;

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

    @Override // org.telegram.ui.a20
    public final f2.q0 n0() {
        n9 n9Var = new n9(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ch.c(this, 18), getResourceProvider());
        this.c0 = n9Var;
        n9Var.r = false;
        return n9Var;
    }

    @Override // org.telegram.ui.a20
    public final z10 o0() {
        return new z9(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        u7.y(this.currentAccount, false).T(true);
        u7.y(this.currentAccount, false).S();
        u7.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.a20, org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        bg.i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(true);
            this.M.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.a20, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        bg.i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(false);
            this.M.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.a20
    public final ag.k3 p0() {
        return new m9(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.a20
    public final boolean q0() {
        na naVar = this.N;
        boolean z10 = false;
        if (naVar != null && (naVar.getParent() instanceof View)) {
            if ((this.c.getHeight() - this.c.getPaddingBottom()) - ((View) this.N.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.a20
    public final View r0(Context context) {
        throw null;
    }
}
