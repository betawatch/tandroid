package ai;

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
import org.telegram.messenger.ApplicationLoader;
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
import org.telegram.messenger.mk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d70;
import org.telegram.ui.io;
import org.telegram.ui.qa1;
import org.telegram.ui.qn;
import org.telegram.ui.v10;
import org.telegram.ui.x10;
import org.telegram.ui.y10;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class md extends y10 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat h0;
    public static DecimalFormat i0;
    public FrameLayout P;
    public tg.n Q;
    public ld R;
    public ic S;
    public z00 T;
    public LinearLayout U;
    public SpannableStringBuilder V;
    public org.telegram.ui.Components.q6 W;
    public TextView X;
    public ei.d Y;
    public ah.x Z;
    public ei.d a0;
    public qa1 b0;
    public ei.d c0;
    public ei.d d0;
    public boolean e0;
    public boolean f0;
    public lc g0;

    public md() {
        this.M = true;
    }

    public static void A0(md mdVar, h61 h61Var, Boolean bool, String str) {
        if (mdVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            org.telegram.ui.Components.xc.a0(mdVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) h61Var.B, new Object[0])), R.raw.stars_topup).j();
            mdVar.T.c(true);
            ga.y(mdVar.currentAccount, false).T(true);
        } else if (str != null) {
            i2.e.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.xc.a0(mdVar), R.raw.error, 36);
        }
    }

    public static void B0(md mdVar) {
        ga.y(mdVar.currentAccount, false).u();
        ug.m1.f0(1, BirthdayController.getInstance(mdVar.currentAccount).getState());
    }

    public static /* synthetic */ void C0(md mdVar, Context context) {
        if (MessagesController.getInstance(mdVar.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(mdVar.currentAccount);
        } else {
            new dd(context, mdVar.resourceProvider).show();
        }
    }

    public static void G0(l01 l01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.d6 d6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((i01) l01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        ca0 ca0Var = new ca0(textView, AndroidUtilities.dp(90.0f), 0, d6Var);
        ca0Var.a(org.telegram.ui.ActionBar.h6.m1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.h6.m1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(ca0Var, 0, 1, 33);
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
        final ga y3 = ga.y(i10, false);
        final long j10 = starGift.id;
        final r0 r0Var = new r0(textView, 5);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() { // from class: ai.k9
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                ga gaVar;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = NotificationCenter.starGiftsLoaded) || (J = (gaVar = ga.this).J(j10)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(gaVar.a).removeObserver(notificationCenterDelegateArr[0], i14);
                r0Var.run(J);
            }
        };
        int i12 = y3.a;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
        int i13 = NotificationCenter.starGiftsLoaded;
        notificationCenter.addObserver(notificationCenterDelegate, i13);
        TL_stars.StarGift J = y3.J(j10);
        if (J != null) {
            zArr[0] = true;
            NotificationCenter.getInstance(i12).removeObserver(notificationCenterDelegateArr[0], i13);
            r0Var.run(J);
        }
    }

    public static void H0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new gc(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount) {
        return K0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (i0 == null) {
            i0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
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
            String format = i0.format(j10 / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            boolean z10 = false;
            if (i11 < 0 && j11 > 0) {
                i10 = -1;
                d = 1.0E9d;
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
            DecimalFormat decimalFormat = i0;
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
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), length + 1, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (i0 == null) {
            i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = i0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
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
            DecimalFormat decimalFormat = i0;
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
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), length + 1, spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (i0 == null) {
                i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = i0.format(starsAmount.amount / 1.0E9d);
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
        if (i0 == null) {
            i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        DecimalFormat decimalFormat = i0;
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

    public static String N0(long j10) {
        if (h0 == null) {
            h0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return h0.format(j10 / 1.0E9d);
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
    public static String O0(int i10, boolean z10, TL_stars.StarsTransaction starsTransaction) {
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
            return LocaleController.formatString(R.string.StarTransactionCommission, gi.l.H0(starsTransaction.starref_commission_permille));
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

    public static SpannableStringBuilder P0(CharSequence charSequence, float f7) {
        return Q0(charSequence, f7, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence, float f7, float f10, float f11) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        yq yqVar = new yq(R.drawable.diamond, 0);
        yqVar.recolorDrawable = false;
        yqVar.translate(0.0f, f10);
        yqVar.spaceScaleX = f11;
        yqVar.setScale(f7, f7);
        spannableString.setSpan(yqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder R0(CharSequence charSequence) {
        return S0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, float f7, yq[] yqVarArr) {
        return V0(false, charSequence, f7, yqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(CharSequence charSequence, boolean z10) {
        return V0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return V0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(boolean z10, CharSequence charSequence, float f7, yq[] yqVarArr, float f10, float f11) {
        yq yqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (yqVarArr == null || (yqVar = yqVarArr[0]) == null) {
            yqVar = new yq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (yqVarArr != null) {
                yqVarArr[0] = yqVar;
            }
        }
        yqVar.translate(0.0f, f10);
        yqVar.spaceScaleX = f11;
        if (z10) {
            yqVar.recolorDrawable = false;
            float f12 = f7 * 0.2f;
            yqVar.setScale(f12, f12);
        } else {
            yqVar.setScale(f7, f7);
        }
        spannableString.setSpan(yqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(boolean z10, String str, yq[] yqVarArr) {
        yq yqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (yqVarArr == null || (yqVar = yqVarArr[0]) == null) {
            yqVar = new yq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            yqVar.setScale(z10 ? 0.222f : 1.13f, z10 ? 0.222f : 1.13f);
        }
        if (z10) {
            yqVar.recolorDrawable = false;
        }
        if (yqVarArr != null) {
            yqVarArr[0] = yqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(yqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder X0(TL_stars.StarsAmount starsAmount, String str, yq[] yqVarArr) {
        return Y0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, yqVarArr);
    }

    public static SpannableStringBuilder Y0(boolean z10, CharSequence charSequence, float f7, yq[] yqVarArr) {
        yq yqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i10 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (yqVarArr == null || (yqVar = yqVarArr[0]) == null) {
            if (yqVarArr == null || yqVarArr.length <= 0) {
                yqVar = new yq(i10, 0);
            } else {
                yqVar = new yq(i10, 0);
                yqVarArr[0] = yqVar;
            }
        }
        yqVar.recolorDrawable = false;
        if (z10) {
            f7 *= 0.33f;
        }
        yqVar.setScale(f7, f7);
        spannableString.setSpan(yqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static fb Z0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final db dbVar = new db(z10, currentAccount, str, imageReceiver, new boolean[1]);
        dbVar.run();
        final int i10 = 0;
        final int i11 = 1;
        return new fb(NotificationCenter.getInstance(currentAccount).listen(view, z10 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: ai.eb
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        dbVar.run();
                        break;
                    default:
                        dbVar.run();
                        break;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: ai.eb
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        dbVar.run();
                        break;
                    default:
                        dbVar.run();
                        break;
                }
            }
        }), 0);
    }

    public static void a1(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i10);
        imageReceiver.setImage(ImageLocation.getForDocument(document), a1.g.k(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.a7, 0.35f), 0L, null, null, 0);
    }

    public static void b1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        a1(imageReceiver, starGift == null ? null : starGift.getDocument(), i10);
    }

    public static void c1(org.telegram.ui.Components.w9 w9Var, ImageReceiver imageReceiver, long j10) {
        Z0(w9Var, imageReceiver, j10 <= 1000 ? "2⃣" : j10 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static fb d1(org.telegram.ui.Components.w9 w9Var, ImageReceiver imageReceiver, int i10) {
        return Z0(w9Var, imageReceiver, i10 != 3 ? i10 != 6 ? i10 != 12 ? i10 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void e1(org.telegram.ui.Components.w9 w9Var, ImageReceiver imageReceiver, long j10) {
        Z0(w9Var, imageReceiver, j10 <= 10000000000L ? "2⃣" : j10 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void f1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.d6 d6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 i11 = mk.i(1, context, d6Var, false);
        LinearLayout e = mk.e(context, 1);
        e.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e.addView(frameLayout, w7.z5.t(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 7, 0, 0, 0, 10));
        kc kcVar = new kc(context, 70, 0);
        frameLayout.addView(kcVar, w7.z5.c(-1.0f, -1));
        int i12 = 2;
        tg.n nVar = new tg.n(context, 1, 2);
        tg.g gVar = nVar.b;
        gVar.z = org.telegram.ui.ActionBar.h6.fk;
        gVar.A = org.telegram.ui.ActionBar.h6.gk;
        gVar.b();
        nVar.setStarParticlesView(kcVar);
        frameLayout.addView(nVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.c1.r(org.telegram.ui.ActionBar.h6.j5, d6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(e, textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        i13.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), -6915073));
        i13.setTextColor(-1);
        i13.setTextSize(1, 11.33f);
        i13.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        i13.setGravity(17);
        i13.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i14 = boost.multiplier;
        if (i14 == 0) {
            i14 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i14));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        yq yqVar = new yq(R.drawable.mini_boost_badge, 2);
        yqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
        i13.setText(spannableStringBuilder);
        e.addView(i13, w7.z5.t(-2, 20, 17, 20, 4, 20, 4));
        l01 l01Var = new l01(context, d6Var);
        l01Var.n(LocaleController.getString(R.string.BoostFrom), i10, j10, new ka(f3VarArr, j10, i12));
        l01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            a3.i0 i0Var = new a3.i0(f3VarArr, j10, boost, 3);
            f3VarArr = f3VarArr;
            l01Var.i(string, string2, i0Var);
        }
        l01Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        l01Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        e.addView(l01Var, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        x90 x90Var = new x90(context, d6Var);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        x90Var.setTextSize(1, 14.0f);
        x90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ra(context, 3)));
        x90Var.setGravity(17);
        e.addView(x90Var, w7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        ei.d dVar = new ei.d(context, d6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new sa(f3VarArr, 1));
        e.addView(dVar, w7.z5.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        i11.customView = e;
        f3VarArr[0] = i11;
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            f3VarArr[0].makeAttached(U);
        }
        nVar.setPaused(false);
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new a3.d(nVar, 20));
    }

    public static l1 g1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        ag.b bVar = ag.b.a;
        l1 l1Var = new l1(context, d6Var, i10, tL_starGiftUnique == null ? ag.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(ag.b.b) : tL_starGiftUnique.getResellAmount(bVar), new o2(5, callback2, r8));
        l1[] l1VarArr = {l1Var};
        l1Var.show();
        return l1VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        int i10 = 1;
        Object[] objArr = 0;
        org.telegram.ui.ActionBar.f3 i11 = mk.i(1, context, d6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        mk.j(20.0f, R.string.PaidContentTitle, 1, textView);
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        linearLayout.addView(textView, w7.z5.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        sd0 sd0Var = new sd0(context, d6Var);
        sd0Var.setForceForceUseCenter(true);
        sd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        sd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        ei.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uf, d6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.vf, d6Var));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new hb(sd0Var, editTextBoldCursor, objArr == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.z5.o(-1, -2, 1.0f, 119));
        sd0Var.e(editTextBoldCursor);
        sd0Var.addView(linearLayout2, w7.z5.e(-1, -2, 48));
        linearLayout.addView(sd0Var, w7.z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A6, false));
        sd0Var.addView(textView2, w7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        x90 x90Var = new x90(context, null);
        x90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new ra(context, 4)), true));
        x90Var.setTextSize(1, 12.0f);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        linearLayout.addView(x90Var, w7.z5.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final ei.d f7 = mk.f(24, context, d6Var, true);
        f7.g(LocaleController.getString(j10 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(f7, w7.z5.n(-1, 48));
        if (j10 > 0 && z10) {
            dVar = mk.f(24, context, d6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        i11.customView = linearLayout;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2 = {i11};
        editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
        editTextBoldCursor.addTextChangedListener(new hc(editTextBoldCursor, sd0Var, j10, z10, f7, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ai.ib
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                if (i13 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                f7.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new kb(editTextBoldCursor2, f3VarArr2, 2));
                return true;
            }
        });
        f7.setOnClickListener(new jb(zArr, callback2, editTextBoldCursor, f7, f3VarArr2));
        if (dVar != null) {
            ei.d dVar2 = dVar;
            jb jbVar = new jb(zArr, callback2, dVar2, editTextBoldCursor, f3VarArr2);
            f3VarArr = f3VarArr2;
            dVar2.setOnClickListener(jbVar);
        } else {
            f3VarArr = f3VarArr2;
        }
        f3VarArr[0].fixNavigationBar();
        f3VarArr[0].setOnDismissListener(new bb(editTextBoldCursor, i10));
        f3VarArr[0].show();
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new kb(f3VarArr, editTextBoldCursor), R instanceof qn ? ((qn) R).U9() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0fb2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0fe8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x1030  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x108d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x10c3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x10e3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x10cc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1097  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x107b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0f1f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0da9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0db7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0dc8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0e6d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0ea2 A[LOOP:0: B:67:0x0e18->B:76:0x0ea2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0eb2 A[EDGE_INSN: B:77:0x0eb2->B:78:0x0eb2 BREAK  A[LOOP:0: B:67:0x0e18->B:76:0x0ea2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0f2d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0f3f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0f50  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.f3 i1(final Context context, final boolean z10, final long j10, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.d6 d6Var) {
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
        org.telegram.ui.ActionBar.d6 d6Var2;
        TLRPC.Peer peer;
        String str2;
        long j12;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        int i12;
        org.telegram.ui.ActionBar.f3[] f3VarArr2;
        float f7;
        int i13;
        String string;
        TL_stars.StarGift starGift;
        TL_stars.StarsTransaction starsTransaction3;
        ViewGroup viewGroup;
        final org.telegram.ui.ActionBar.f3[] f3VarArr3;
        org.telegram.ui.ActionBar.d6 d6Var3;
        Context context3;
        int i14;
        org.telegram.ui.ActionBar.f3[] f3VarArr4;
        TL_stars.StarsTransaction starsTransaction4;
        l01 l01Var;
        final org.telegram.ui.ActionBar.f3[] f3VarArr5;
        l01 l01Var2;
        l01 l01Var3;
        l01 l01Var4;
        l01 l01Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z14;
        int i15;
        TL_stars.StarGift starGift2;
        Context context4;
        org.telegram.ui.ActionBar.n2 U;
        TLRPC.Chat chat;
        int i16;
        ImageLocation imageLocation2;
        ImageLocation forDocument2;
        int i17;
        l01 l01Var6;
        l01 l01Var7;
        final int i18;
        l01 l01Var8;
        final org.telegram.ui.ActionBar.f3[] f3VarArr6;
        long j13;
        l01 l01Var9;
        long j14;
        TL_stars.StarsAmount starsAmount;
        ViewGroup viewGroup2;
        int i19;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z15 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i20 = starsTransaction.flags;
        boolean z16 = (i20 & 8192) != 0;
        boolean z17 = ((131072 & i20) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z18 = (z17 || (i20 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context, d6Var, false, false);
        f3Var2.fixNavigationBar();
        org.telegram.ui.ActionBar.f3[] f3VarArr7 = new org.telegram.ui.ActionBar.f3[1];
        final LinearLayout e = mk.e(context, 1);
        e.setPadding(0, AndroidUtilities.dp((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                f3VarArr = f3VarArr7;
                f3Var = f3Var2;
                oc ocVar = new oc(context, matrix, radialGradient, paint, p5Var);
                p5Var.l(ocVar);
                p5Var.i(stargiftattributepattern.document, false);
                ocVar.setOrientation(1);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                b1(w9Var.getImageReceiver(), starsTransaction.stargift, 160);
                ocVar.addView(w9Var, w7.z5.t(160, 160, 17, 0, 20, 0, 0));
                if (TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    i19 = 0;
                } else {
                    w7.b6.a(w9Var);
                    i19 = 0;
                    w9Var.setOnClickListener(new ha(context, i10, tL_starGiftUnique, i19));
                }
                TextView b10 = w7.d6.b(context, 20.0f, i19, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                ocVar.addView(b10, w7.z5.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = w7.d6.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                ocVar.addView(b11, w7.z5.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = w7.d6.b(context, 18.0f, 0, true, null);
                b12.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                b12.setText(U0(starsAmount3, TextUtils.concat(positive ? "+" : "", J0(starsAmount3), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b12.getText());
                if (starsTransaction.refund) {
                    H0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction.failed) {
                    H0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction.pending) {
                    H0(spannableStringBuilder, b12, LocaleController.getString(R.string.StarsPending));
                }
                b12.setText(spannableStringBuilder);
                ocVar.addView(b12, w7.z5.t(-2, -2, 17, 0, 11, 0, 17));
                e.addView(ocVar, w7.z5.n(-1, -2));
                d6Var2 = d6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = e;
                str = "";
                z12 = z18;
                f3VarArr2 = f3VarArr;
                f7 = 16.0f;
                l01 l01Var10 = new l01(context2, d6Var2);
                starGift = starsTransaction2.stargift;
                int i21 = 4;
                if (starGift == null) {
                    if (starsTransaction2.stargift_upgrade) {
                        if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                            starsTransaction4 = starsTransaction2;
                            viewGroup2 = linearLayout;
                        } else {
                            org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) ((i01) l01Var10.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                            tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                            viewGroup2 = linearLayout;
                            Context context5 = context2;
                            starsTransaction4 = starsTransaction;
                            ga.w(i10).M(tL_inputSavedStarGiftUser, new ua(zcVar, i10, context5, d6Var2, 0));
                        }
                        TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction4.peer;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                            long peerDialogId = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer2).peer);
                            String string2 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                            Runnable kaVar = new ka(f3VarArr2, peerDialogId, 1);
                            i14 = i10;
                            l01 l01Var11 = l01Var10;
                            org.telegram.ui.ActionBar.f3[] f3VarArr8 = f3VarArr2;
                            d6Var3 = d6Var;
                            l01Var11.n(string2, i14, peerDialogId, kaVar);
                            context3 = context;
                            viewGroup = viewGroup2;
                            f3VarArr4 = f3VarArr8;
                            l01Var5 = l01Var11;
                            starsTransactionPeer = starsTransaction4.peer;
                            if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction4.flags & 256) != 0) {
                                long peerDialogId2 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                                if (z10) {
                                    peerDialogId2 = j10;
                                }
                                chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId2));
                                if (chat == null) {
                                    x90 x90Var = new x90(context3, d6Var3);
                                    x90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                    x90Var.setEllipsize(TextUtils.TruncateAt.END);
                                    int i22 = org.telegram.ui.ActionBar.h6.gc;
                                    x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i22, d6Var3));
                                    x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i22, d6Var3));
                                    x90Var.setTextSize(1, 14.0f);
                                    x90Var.setDisablePaddingsOffsetY(true);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                                    starsTransaction4 = starsTransaction;
                                    if (!starsTransaction4.extended_media.isEmpty()) {
                                        ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction4.extended_media;
                                        int size = arrayList.size();
                                        int i23 = 0;
                                        int i24 = 0;
                                        while (i23 < size) {
                                            TLRPC.MessageMedia messageMedia = arrayList.get(i23);
                                            int i25 = i23 + 1;
                                            TLRPC.MessageMedia messageMedia2 = messageMedia;
                                            z14 = z15;
                                            ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                            d70 d70Var = new d70(x90Var, 24.0f, i14);
                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                                i16 = size;
                                                forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia2.photo);
                                            } else {
                                                i16 = size;
                                                if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                                    forDocument2 = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia2.document);
                                                } else {
                                                    imageLocation2 = null;
                                                    if (imageLocation2 != null) {
                                                        d70Var.a(6.0f);
                                                        d70Var.b.setImage(imageLocation2, "24_24", null, null, null, 0);
                                                        SpannableString spannableString = new SpannableString("x");
                                                        spannableString.setSpan(d70Var, 0, spannableString.length(), 33);
                                                        spannableStringBuilder2.append((CharSequence) spannableString);
                                                        spannableStringBuilder2.append((CharSequence) " ");
                                                        i24++;
                                                    }
                                                    i17 = i24;
                                                    if (i17 < 3) {
                                                        break;
                                                    }
                                                    size = i16;
                                                    i24 = i17;
                                                    z15 = z14;
                                                    arrayList = arrayList2;
                                                    i23 = i25;
                                                }
                                            }
                                            imageLocation2 = forDocument2;
                                            if (imageLocation2 != null) {
                                            }
                                            i17 = i24;
                                            if (i17 < 3) {
                                            }
                                        }
                                    }
                                    z14 = z15;
                                    spannableStringBuilder2.append((CharSequence) " ");
                                    int length = spannableStringBuilder2.length();
                                    String publicUsername = ChatObject.getPublicUsername(chat);
                                    if (TextUtils.isEmpty(publicUsername)) {
                                        spannableStringBuilder2.append((CharSequence) chat.title);
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        a1.g.A(sb2, MessagesController.getInstance(i14).linkPrefix, "/", publicUsername, "/");
                                        sb2.append(starsTransaction4.msg_id);
                                        spannableStringBuilder2.append((CharSequence) sb2.toString());
                                    }
                                    la laVar = new la(f3VarArr4, peerDialogId2, starsTransaction4);
                                    spannableStringBuilder2.setSpan(new cc(laVar), length, spannableStringBuilder2.length(), 33);
                                    x90Var.setSingleLine(true);
                                    x90Var.setEllipsize(TextUtils.TruncateAt.END);
                                    x90Var.setText(spannableStringBuilder2);
                                    i15 = 9;
                                    x90Var.setOnClickListener(new ah.g0(laVar, i15));
                                    l01Var5.l(x90Var, LocaleController.getString(starsTransaction4.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                                    if (!TextUtils.isEmpty(starsTransaction4.id) && !z19) {
                                        String string3 = LocaleController.getString(R.string.StarsTransactionID);
                                        String str3 = starsTransaction4.id;
                                        l01Var5.k(string3, str3, str3.length() <= 25 ? i15 : 10, new pa(0, f3VarArr4, d6Var3));
                                    }
                                    if (starsTransaction4.floodskip && starsTransaction4.floodskip_number > 0) {
                                        l01Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                                    }
                                    l01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                                    starGift2 = starsTransaction4.stargift;
                                    if (starGift2 != null) {
                                        if (starGift2.limited) {
                                            G0(l01Var5, i14, starGift2, d6Var3);
                                        }
                                        if (!TextUtils.isEmpty(starsTransaction4.description)) {
                                            l01Var5.a(new SpannableStringBuilder(starsTransaction4.description));
                                        }
                                    }
                                    ViewGroup viewGroup3 = viewGroup;
                                    viewGroup3.addView(l01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                                    if ((starsTransaction4.flags & 32) != 0) {
                                        l01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.transaction_date * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
                                    }
                                    if (z14) {
                                        context4 = context;
                                        x90 x90Var2 = new x90(context4, d6Var3);
                                        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var3));
                                        x90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var3));
                                        x90Var2.setTextSize(1, 14.0f);
                                        x90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ra(context4, 0)));
                                        x90Var2.setGravity(17);
                                        viewGroup3.addView(x90Var2, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                                    } else {
                                        context4 = context;
                                    }
                                    ei.d dVar = new ei.d(context4, d6Var3);
                                    dVar.e();
                                    if ((starsTransaction4.flags & 32) == 0) {
                                        dVar.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer));
                                    } else {
                                        dVar.h(LocaleController.getString(R.string.OK));
                                    }
                                    viewGroup3.addView(dVar, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                                    org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
                                    f3Var3.customView = viewGroup3;
                                    int i26 = 0;
                                    f3VarArr4[0] = f3Var3;
                                    f3Var3.useBackgroundTopPadding = false;
                                    if ((starsTransaction4.flags & 32) == 0) {
                                        dVar.setOnClickListener(new p(context4, starsTransaction4));
                                    } else {
                                        dVar.setOnClickListener(new sa(f3VarArr4, i26));
                                    }
                                    f3VarArr4[0].fixNavigationBar();
                                    U = LaunchActivity.U();
                                    if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                        f3VarArr4[0].makeAttached(U);
                                    }
                                    f3VarArr4[0].show();
                                    return f3VarArr4[0];
                                }
                                starsTransaction4 = starsTransaction;
                            }
                            z14 = z15;
                            i15 = 9;
                            if (!TextUtils.isEmpty(starsTransaction4.id)) {
                                String string32 = LocaleController.getString(R.string.StarsTransactionID);
                                String str32 = starsTransaction4.id;
                                l01Var5.k(string32, str32, str32.length() <= 25 ? i15 : 10, new pa(0, f3VarArr4, d6Var3));
                            }
                            if (starsTransaction4.floodskip) {
                                l01Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                            }
                            l01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                            starGift2 = starsTransaction4.stargift;
                            if (starGift2 != null) {
                            }
                            ViewGroup viewGroup32 = viewGroup;
                            viewGroup32.addView(l01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                            if ((starsTransaction4.flags & 32) != 0) {
                            }
                            if (z14) {
                            }
                            ei.d dVar2 = new ei.d(context4, d6Var3);
                            dVar2.e();
                            if ((starsTransaction4.flags & 32) == 0) {
                            }
                            viewGroup32.addView(dVar2, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                            org.telegram.ui.ActionBar.f3 f3Var32 = f3Var;
                            f3Var32.customView = viewGroup32;
                            int i262 = 0;
                            f3VarArr4[0] = f3Var32;
                            f3Var32.useBackgroundTopPadding = false;
                            if ((starsTransaction4.flags & 32) == 0) {
                            }
                            f3VarArr4[0].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet()) {
                                f3VarArr4[0].makeAttached(U);
                            }
                            f3VarArr4[0].show();
                            return f3VarArr4[0];
                        }
                        org.telegram.ui.ActionBar.f3[] f3VarArr9 = f3VarArr2;
                        i14 = i10;
                        d6Var3 = d6Var;
                        l01Var6 = l01Var10;
                        viewGroup = viewGroup2;
                        f3VarArr4 = f3VarArr9;
                    } else {
                        f3VarArr5 = f3VarArr2;
                        final Context context6 = context2;
                        starsTransaction4 = starsTransaction2;
                        d6Var3 = d6Var2;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            String str4 = starGift.slug;
                            if (!TextUtils.isEmpty(str4)) {
                                l01Var10.i(LocaleController.getString(R.string.Gift2Gift), starsTransaction4.stargift.title + " #" + starsTransaction4.stargift.num, new ah.o(context6, i10, str4, i21));
                            }
                            final long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                            long peerDialogId3 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction4.peer).peer);
                            if (!starsTransaction4.offer) {
                                if (starsTransaction4.stargift_resale) {
                                    if (negative) {
                                        l01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                                    } else {
                                        l01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                        j13 = clientUserId;
                                    }
                                } else if (starsTransaction4.stargift_drop_original_details) {
                                    l01Var10.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                                    peerDialogId3 = clientUserId;
                                    j13 = peerDialogId3;
                                } else {
                                    l01Var10.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                                }
                                j13 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else if (negative) {
                                l01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                                j13 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else {
                                l01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                j13 = clientUserId;
                            }
                            if (peerDialogId3 != clientUserId) {
                                final long j15 = peerDialogId3;
                                final int i27 = 0;
                                l01Var9 = l01Var10;
                                viewGroup = linearLayout;
                                j14 = clientUserId;
                                l01Var9.n(LocaleController.getString(R.string.Gift2From), i10, j15, new Runnable() { // from class: ai.va
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i27) {
                                            case 0:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j16 = j15;
                                                    Bundle b13 = zf.d0.b(j16, "user_id");
                                                    if (j16 == clientUserId) {
                                                        b13.putBoolean("my_profile", true);
                                                    }
                                                    b13.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(b13, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j17 = j15;
                                                    Bundle b14 = zf.d0.b(j17, "user_id");
                                                    if (j17 == clientUserId) {
                                                        b14.putBoolean("my_profile", true);
                                                    }
                                                    b14.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(b14, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                l01Var9 = l01Var10;
                                j14 = clientUserId;
                                viewGroup = linearLayout;
                            }
                            if (j13 != j14) {
                                final long j16 = j14;
                                final int i28 = 1;
                                final long j17 = j13;
                                l01Var9.n(LocaleController.getString(R.string.Gift2To), i10, j17, new Runnable() { // from class: ai.va
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i28) {
                                            case 0:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j162 = j17;
                                                    Bundle b13 = zf.d0.b(j162, "user_id");
                                                    if (j162 == j16) {
                                                        b13.putBoolean("my_profile", true);
                                                    }
                                                    b13.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(b13, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j172 = j17;
                                                    Bundle b14 = zf.d0.b(j172, "user_id");
                                                    if (j172 == j16) {
                                                        b14.putBoolean("my_profile", true);
                                                    }
                                                    b14.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(b14, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            l01 l01Var12 = l01Var9;
                            if ((peerDialogId3 == clientUserId || starsTransaction4.stargift_resale) && (starsAmount = starsTransaction4.starref_amount) != null && starsTransaction4.starref_commission_permille > 0) {
                                TL_stars.StarsAmount starsAmount4 = starsTransaction4.amount;
                                if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                    TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                    tL_starsTonAmount.amount = starsTransaction4.amount.amount + starsTransaction4.starref_amount.amount;
                                    yq[] yqVarArr = new yq[1];
                                    l01Var12.d(X0(starsTransaction4.amount, "⭐️ " + ((Object) J0(tL_starsTonAmount)), yqVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                    yq yqVar = yqVarArr[0];
                                    if (yqVar != null) {
                                        yqVar.setOverrideColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var3));
                                    }
                                } else {
                                    l01Var12.d(Y0(starsTransaction4.amount instanceof TL_stars.TL_starsTonAmount, org.telegram.messenger.g0.h(Math.abs(Math.round(starsTransaction4.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                }
                            }
                            i14 = i10;
                            l01Var4 = l01Var12;
                            context3 = context6;
                            f3VarArr4 = f3VarArr5;
                            l01Var3 = l01Var4;
                        } else {
                            viewGroup = linearLayout;
                            if (starsTransaction4.refund) {
                                i14 = i10;
                                l01Var6 = l01Var10;
                                f3VarArr4 = f3VarArr5;
                            } else {
                                long clientUserId2 = j10 == 0 ? UserConfig.getInstance(i10).getClientUserId() : j10;
                                final long peerDialogId4 = DialogObject.getPeerDialogId(starsTransaction4.peer.peer);
                                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId4));
                                if (positive) {
                                    if (peerDialogId4 != clientUserId2) {
                                        CharSequence string4 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                        Runnable laVar2 = new la(f3VarArr5, starsTransaction4, peerDialogId4, 3);
                                        String string5 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                        final int i29 = 0;
                                        i18 = i10;
                                        Runnable runnable = new Runnable() { // from class: ai.oa
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i29) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.f3 f3Var4 = f3VarArr5[0];
                                                        Objects.requireNonNull(f3Var4);
                                                        new yh.o1(context6, i18, peerDialogId4, null, new r0(f3Var4, 4)).show();
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.f3 f3Var5 = f3VarArr5[0];
                                                        Objects.requireNonNull(f3Var5);
                                                        new yh.o1(context6, i18, peerDialogId4, null, new r0(f3Var5, 4)).show();
                                                        break;
                                                }
                                            }
                                        };
                                        l01 l01Var13 = l01Var10;
                                        f3VarArr6 = f3VarArr5;
                                        l01Var13.m(string4, i18, peerDialogId4, laVar2, string5, runnable);
                                        l01Var8 = l01Var13;
                                    } else {
                                        i18 = i10;
                                        l01Var8 = l01Var10;
                                        f3VarArr6 = f3VarArr5;
                                    }
                                    final int i30 = 1;
                                    l01Var8.n(LocaleController.getString(R.string.StarGiveawayPrizeTo), i18, clientUserId2, new Runnable() { // from class: ai.ma
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i30) {
                                                case 0:
                                                    f3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", UserConfig.getInstance(i18).getClientUserId());
                                                        bundle.putBoolean("my_profile", true);
                                                        U2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    f3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", UserConfig.getInstance(i18).getClientUserId());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        U3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    f3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", UserConfig.getInstance(i18).getClientUserId());
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
                                    l01Var7 = l01Var8;
                                } else {
                                    long j18 = clientUserId2;
                                    if (peerDialogId4 != j18) {
                                        final int i31 = 2;
                                        l01Var10.n(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, j18, new Runnable() { // from class: ai.ma
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i31) {
                                                    case 0:
                                                        f3VarArr5[0].dismiss();
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
                                                        f3VarArr5[0].dismiss();
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
                                                        f3VarArr5[0].dismiss();
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
                                    CharSequence string6 = LocaleController.getString(R.string.StarGiveawayPrizeTo);
                                    Runnable laVar3 = new la(f3VarArr5, starsTransaction, peerDialogId4, 4);
                                    starsTransaction3 = starsTransaction;
                                    String string7 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                    final int i32 = 1;
                                    l01 l01Var14 = l01Var10;
                                    f3VarArr3 = f3VarArr5;
                                    l01Var14.m(string6, i10, peerDialogId4, laVar3, string7, new Runnable() { // from class: ai.oa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i32) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.f3 f3Var4 = f3VarArr5[0];
                                                    Objects.requireNonNull(f3Var4);
                                                    new yh.o1(context, i10, peerDialogId4, null, new r0(f3Var4, 4)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.f3 f3Var5 = f3VarArr5[0];
                                                    Objects.requireNonNull(f3Var5);
                                                    new yh.o1(context, i10, peerDialogId4, null, new r0(f3Var5, 4)).show();
                                                    break;
                                            }
                                        }
                                    });
                                    l01Var7 = l01Var14;
                                }
                                context3 = context;
                                i14 = i10;
                                l01Var2 = l01Var7;
                                f3VarArr4 = f3VarArr3;
                                starsTransaction4 = starsTransaction3;
                                l01Var3 = l01Var2;
                            }
                        }
                    }
                    context3 = context;
                    l01Var5 = l01Var6;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                        long peerDialogId22 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                        if (z10) {
                        }
                        chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId22));
                        if (chat == null) {
                        }
                    }
                    z14 = z15;
                    i15 = 9;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    l01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322 = viewGroup;
                    viewGroup322.addView(l01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    ei.d dVar22 = new ei.d(context4, d6Var3);
                    dVar22.e();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup322.addView(dVar22, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var322 = f3Var;
                    f3Var322.customView = viewGroup322;
                    int i2622 = 0;
                    f3VarArr4[0] = f3Var322;
                    f3Var322.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    f3VarArr4[0].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    f3VarArr4[0].show();
                    return f3VarArr4[0];
                }
                starsTransaction3 = starsTransaction2;
                viewGroup = linearLayout;
                l01 l01Var15 = l01Var10;
                f3VarArr3 = f3VarArr2;
                d6Var3 = d6Var2;
                TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction3.peer;
                if (!(starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer)) {
                    context3 = context;
                    i14 = i10;
                    f3VarArr4 = f3VarArr3;
                    starsTransaction4 = starsTransaction3;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                        if (starsTransaction4.gift) {
                            x90 x90Var3 = new x90(context3, d6Var3);
                            x90Var3.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                            x90Var3.setEllipsize(TextUtils.TruncateAt.END);
                            int i33 = org.telegram.ui.ActionBar.h6.gc;
                            x90Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i33, d6Var3));
                            x90Var3.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i33, d6Var3));
                            x90Var3.setTextSize(1, 14.0f);
                            x90Var3.setSingleLine(true);
                            x90Var3.setDisablePaddingsOffsetY(true);
                            org.telegram.ui.l5 l5Var = new org.telegram.ui.l5(x90Var3, 24.0f, i14);
                            String string8 = LocaleController.getString(z15 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                            zq a2 = hd.a(24, "fragment");
                            int dp = AndroidUtilities.dp(f7);
                            int dp2 = AndroidUtilities.dp(f7);
                            a2.e = dp;
                            a2.f = dp2;
                            l5Var.b.setImageBitmap(a2);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x  " + ((Object) string8));
                            spannableStringBuilder3.setSpan(l5Var, 0, 1, 33);
                            spannableStringBuilder3.setSpan(new bc(f3VarArr4, context3, z15), 3, spannableStringBuilder3.length(), 33);
                            x90Var3.setText(spannableStringBuilder3);
                            l01Var15.l(x90Var3, LocaleController.getString(R.string.StarsTransactionRecipient));
                            l01Var5 = l01Var15;
                        } else {
                            l01Var15.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                            l01Var5 = l01Var15;
                        }
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                        l01Var15.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                        l01Var5 = l01Var15;
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                        l01Var15.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                        l01Var5 = l01Var15;
                    } else {
                        l01Var5 = l01Var15;
                        if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            l01Var15.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                            l01Var5 = l01Var15;
                        }
                    }
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    i15 = 9;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    l01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup3222 = viewGroup;
                    viewGroup3222.addView(l01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    ei.d dVar222 = new ei.d(context4, d6Var3);
                    dVar222.e();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup3222.addView(dVar222, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var3222 = f3Var;
                    f3Var3222.customView = viewGroup3222;
                    int i26222 = 0;
                    f3VarArr4[0] = f3Var3222;
                    f3Var3222.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) == 0) {
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
                    l01Var15.n(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i10, peerDialogId5, new ka(f3VarArr3, peerDialogId5, 3));
                    if (starsTransaction3.starref_amount != null && starsTransaction3.starref_commission_permille > 0) {
                        l01Var15.d(Y0(starsTransaction3.amount instanceof TL_stars.TL_starsTonAmount, org.telegram.messenger.g0.h(Math.abs(Math.round(starsTransaction3.starref_amount.toDouble() + starsTransaction3.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                    }
                    context3 = context;
                    i14 = i10;
                    l01Var2 = l01Var15;
                } else if (z11) {
                    long peerDialogId6 = DialogObject.getPeerDialogId(starsTransaction3.starref_peer);
                    l01Var15.i(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new ka(f3VarArr3, j10, i21));
                    l01Var15.n(LocaleController.getString(R.string.StarAffiliate), i10, peerDialogId6, new ka(f3VarArr3, peerDialogId6, 5));
                    i14 = i10;
                    l01Var15.n(LocaleController.getString(R.string.StarAffiliateReferredUser), i14, peerDialogId5, new ka(f3VarArr3, peerDialogId5, 6));
                    l01Var15.d(gi.l.H0(starsTransaction3.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                    context3 = context;
                    l01Var2 = l01Var15;
                } else if (z12) {
                    l01Var15.i(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new ia(i10, context, j10, peerDialogId5, f3VarArr3, d6Var3));
                    i14 = i10;
                    l01 l01Var16 = l01Var15;
                    l01Var16.n(LocaleController.getString(R.string.StarAffiliateMiniApp), i14, peerDialogId5, new ka(f3VarArr3, peerDialogId5, 0));
                    context3 = context;
                    l01Var2 = l01Var16;
                } else {
                    if (z19) {
                        l01Var15.n(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, peerDialogId5, new la(f3VarArr3, starsTransaction3, peerDialogId5, 0));
                        final int i34 = 0;
                        l01Var15.n(LocaleController.getString(R.string.StarGiveawayPrizeTo), i10, UserConfig.getInstance(i10).getClientUserId(), new Runnable() { // from class: ai.ma
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i34) {
                                    case 0:
                                        f3VarArr3[0].dismiss();
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
                                        f3VarArr3[0].dismiss();
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
                                        f3VarArr3[0].dismiss();
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
                        String string9 = LocaleController.getString(R.string.StarGiveawayReason);
                        CharSequence string10 = LocaleController.getString(R.string.StarGiveawayReasonLink);
                        Runnable laVar4 = new la(f3VarArr3, starsTransaction, peerDialogId5, 1);
                        starsTransaction4 = starsTransaction;
                        l01Var15.i(string9, string10, laVar4);
                        l01Var15.d(M0(starsTransaction4.amount), LocaleController.getString(R.string.StarGiveawayGift));
                        i14 = i10;
                        f3VarArr4 = f3VarArr3;
                        l01Var = l01Var15;
                    } else {
                        starsTransaction4 = starsTransaction3;
                        if (!starsTransaction4.subscription || z10) {
                            if (starsTransaction4.premium_gift) {
                                final int i35 = 1;
                                l01Var15.n(LocaleController.getString(R.string.Gift2To), i10, peerDialogId5, new Runnable() { // from class: ai.na
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i35) {
                                            case 0:
                                                f3VarArr3[0].dismiss();
                                                long j19 = peerDialogId5;
                                                if (!UserObject.isService(j19)) {
                                                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(qn.W9(j19));
                                                        break;
                                                    }
                                                } else {
                                                    pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                f3VarArr3[0].dismiss();
                                                long j20 = peerDialogId5;
                                                if (!UserObject.isService(j20)) {
                                                    org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(qn.W9(j20));
                                                        break;
                                                    }
                                                } else {
                                                    pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr3[0].dismiss();
                                                long j21 = peerDialogId5;
                                                if (!UserObject.isService(j21)) {
                                                    org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(qn.W9(j21));
                                                        break;
                                                    }
                                                } else {
                                                    pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                l01Var15.d(LocaleController.formatPluralStringComma("Months", starsTransaction4.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                            } else if (!starsTransaction4.posts_search) {
                                final int i36 = 2;
                                f3VarArr4 = f3VarArr3;
                                l01 l01Var17 = l01Var15;
                                context3 = context;
                                i14 = i10;
                                l01Var17.n(LocaleController.getString(R.string.StarsTransactionRecipient), i14, peerDialogId5, new Runnable() { // from class: ai.na
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i36) {
                                            case 0:
                                                f3VarArr3[0].dismiss();
                                                long j19 = peerDialogId5;
                                                if (!UserObject.isService(j19)) {
                                                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(qn.W9(j19));
                                                        break;
                                                    }
                                                } else {
                                                    pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                f3VarArr3[0].dismiss();
                                                long j20 = peerDialogId5;
                                                if (!UserObject.isService(j20)) {
                                                    org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(qn.W9(j20));
                                                        break;
                                                    }
                                                } else {
                                                    pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                f3VarArr3[0].dismiss();
                                                long j21 = peerDialogId5;
                                                if (!UserObject.isService(j21)) {
                                                    org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(qn.W9(j21));
                                                        break;
                                                    }
                                                } else {
                                                    pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                l01Var3 = l01Var17;
                            }
                            i14 = i10;
                            l01Var = l01Var15;
                            f3VarArr4 = f3VarArr3;
                        } else {
                            final int i37 = 0;
                            f3VarArr5 = f3VarArr3;
                            l01 l01Var18 = l01Var15;
                            i14 = i10;
                            l01Var18.n(LocaleController.getString(R.string.StarSubscriptionTo), i14, peerDialogId5, new Runnable() { // from class: ai.na
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i37) {
                                        case 0:
                                            f3VarArr3[0].dismiss();
                                            long j19 = peerDialogId5;
                                            if (!UserObject.isService(j19)) {
                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    U2.presentFragment(qn.W9(j19));
                                                    break;
                                                }
                                            } else {
                                                pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            f3VarArr3[0].dismiss();
                                            long j20 = peerDialogId5;
                                            if (!UserObject.isService(j20)) {
                                                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    U3.presentFragment(qn.W9(j20));
                                                    break;
                                                }
                                            } else {
                                                pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                        default:
                                            f3VarArr3[0].dismiss();
                                            long j21 = peerDialogId5;
                                            if (!UserObject.isService(j21)) {
                                                org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                                                if (U4 != null) {
                                                    U4.presentFragment(qn.W9(j21));
                                                    break;
                                                }
                                            } else {
                                                pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            context3 = context;
                            l01Var4 = l01Var18;
                            f3VarArr4 = f3VarArr5;
                            l01Var3 = l01Var4;
                        }
                    }
                    context3 = context;
                    l01Var3 = l01Var;
                }
                f3VarArr4 = f3VarArr3;
                starsTransaction4 = starsTransaction3;
                l01Var3 = l01Var2;
                l01Var5 = l01Var3;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                i15 = 9;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                l01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup32222 = viewGroup;
                viewGroup32222.addView(l01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                ei.d dVar2222 = new ei.d(context4, d6Var3);
                dVar2222.e();
                if ((starsTransaction4.flags & 32) == 0) {
                }
                viewGroup32222.addView(dVar2222, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.f3 f3Var32222 = f3Var;
                f3Var32222.customView = viewGroup32222;
                int i262222 = 0;
                f3VarArr4[0] = f3Var32222;
                f3Var32222.useBackgroundTopPadding = false;
                if ((starsTransaction4.flags & 32) == 0) {
                }
                f3VarArr4[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                f3VarArr4[0].show();
                return f3VarArr4[0];
            }
        }
        f3Var = f3Var2;
        f3VarArr = f3VarArr7;
        z11 = z17;
        final org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
        if (starsTransaction.premium_gift) {
            d1(w9Var2, w9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            e.addView(w9Var2, w7.z5.t(160, 160, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            zq a10 = org.telegram.ui.Cells.t6.a(100, "search");
            int dp3 = AndroidUtilities.dp(40.0f);
            int dp4 = AndroidUtilities.dp(40.0f);
            a10.e = dp3;
            a10.f = dp4;
            w9Var2.setImageDrawable(a10);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z19 || starsTransaction.gift) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = e;
                    str = "";
                    z12 = z18;
                    z13 = z10;
                    j11 = j10;
                    d6Var2 = d6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        e1(w9Var2, w9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        c1(w9Var2, w9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(w9Var2, w7.z5.t(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = e;
                    z13 = z10;
                    j11 = j10;
                    d6Var2 = d6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            w9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            z12 = z18;
                            w9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                            str = "";
                        } else {
                            z12 = z18;
                            w9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            if (z12) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z13) {
                                str2 = "";
                                j12 = j11;
                                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9();
                                if (j12 < 0) {
                                    str = str2;
                                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j12));
                                    h9Var.r(user2);
                                    w9Var2.e(user2, h9Var);
                                } else {
                                    str = str2;
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j12));
                                    h9Var.q(chat2);
                                    w9Var2.e(chat2, h9Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            str2 = "";
                            j12 = DialogObject.getPeerDialogId(peer);
                            org.telegram.ui.Components.h9 h9Var2 = new org.telegram.ui.Components.h9();
                            if (j12 < 0) {
                            }
                        }
                        linearLayout.addView(w9Var2, w7.z5.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z12 = z18;
                        zq a11 = org.telegram.ui.Cells.t6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int dp5 = AndroidUtilities.dp(40.0f);
                        int dp6 = AndroidUtilities.dp(40.0f);
                        a11.e = dp5;
                        a11.f = dp6;
                        w9Var2.setImageDrawable(a11);
                    }
                } else {
                    w9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia3.document);
                    } else {
                        imageLocation = null;
                        w9Var2.l(imageLocation, "100_100", null, null, null, 0);
                        e.addView(w9Var2, w7.z5.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ai.ja
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                                long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i38 = 0; i38 < starsTransaction5.extended_media.size(); i38++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i38);
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
                                PhotoViewer.u1().M2(null, LaunchActivity.R(), d6Var);
                                PhotoViewer.u1().d2(arrayList3, 0, peerDialogId7, 0L, 0L, new pc(w9Var2, e, peerDialogId7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        d6Var2 = d6Var;
                        i11 = i10;
                        linearLayout = e;
                        j11 = j10;
                        w9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z12 = z18;
                    }
                    imageLocation = forDocument;
                    w9Var2.l(imageLocation, "100_100", null, null, null, 0);
                    e.addView(w9Var2, w7.z5.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: ai.ja
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z10;
                            TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                            long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i38 = 0; i38 < starsTransaction5.extended_media.size(); i38++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i38);
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
                            PhotoViewer.u1().M2(null, LaunchActivity.R(), d6Var);
                            PhotoViewer.u1().d2(arrayList3, 0, peerDialogId7, 0L, 0L, new pc(w9Var2, e, peerDialogId7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    d6Var2 = d6Var;
                    i11 = i10;
                    linearLayout = e;
                    j11 = j10;
                    w9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z18;
                }
                TextView textView = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.h6.j5;
                org.telegram.ui.Cells.c1.r(i12, d6Var2, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(O0(i11, z13, starsTransaction2));
                TextView i38 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 17, 36, 0, 36, 4), context2);
                i38.setTextSize(1, 18.0f);
                i38.setTypeface(AndroidUtilities.bold());
                i38.setGravity(17);
                i38.setTextColor(org.telegram.ui.ActionBar.h6.w0(!positive ? org.telegram.ui.ActionBar.h6.uj : org.telegram.ui.ActionBar.h6.wj, d6Var2));
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                i38.setText(Y0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, J0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(i38.getText());
                if (!starsTransaction2.refund) {
                    H0(spannableStringBuilder4, i38, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    i38.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.wj, d6Var2));
                    H0(spannableStringBuilder4, i38, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    i38.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.yj, d6Var2));
                    H0(spannableStringBuilder4, i38, LocaleController.getString(R.string.StarsPending));
                }
                i38.setText(spannableStringBuilder4);
                linearLayout.addView(i38, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    x90 x90Var4 = new x90(context2);
                    x90Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var2));
                    x90Var4.setTextSize(1, 14.0f);
                    x90Var4.setGravity(17);
                    x90Var4.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var2));
                    x90Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, gi.l.H0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j11 == UserConfig.getInstance(i11).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), 2)) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new qa(j11, i11, 0)), true));
                    }
                    x90Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(x90Var4, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                    f3VarArr2 = f3VarArr;
                    f7 = 16.0f;
                    l01 l01Var102 = new l01(context2, d6Var2);
                    starGift = starsTransaction2.stargift;
                    int i212 = 4;
                    if (starGift == null) {
                    }
                    l01Var5 = l01Var3;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    i15 = 9;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    l01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322222 = viewGroup;
                    viewGroup322222.addView(l01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    ei.d dVar22222 = new ei.d(context4, d6Var3);
                    dVar22222.e();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup322222.addView(dVar22222, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.f3 f3Var322222 = f3Var;
                    f3Var322222.customView = viewGroup322222;
                    int i2622222 = 0;
                    f3VarArr4[0] = f3Var322222;
                    f3Var322222.useBackgroundTopPadding = false;
                    if ((starsTransaction4.flags & 32) == 0) {
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
                        i38.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var2));
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i13 = 1;
                        i38.setText(Y0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(J0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i13 = 1;
                    }
                    x90 x90Var5 = new x90(context2);
                    x90Var5.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var2));
                    f7 = 16.0f;
                    x90Var5.setTextSize(i13, 16.0f);
                    x90Var5.setGravity(17);
                    x90Var5.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var2));
                    x90Var5.setDisablePaddingsOffsetY(i13);
                    if (isUserSelf) {
                        int i39 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i13];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i39, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    f3VarArr2 = f3VarArr;
                    x90Var5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new ta(context2, f3VarArr2)), true)));
                    linearLayout.addView(x90Var5, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    f3VarArr2 = f3VarArr;
                    f7 = 16.0f;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        mk.o(i12, d6Var2, textView2, 1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                l01 l01Var1022 = new l01(context2, d6Var2);
                starGift = starsTransaction2.stargift;
                int i2122 = 4;
                if (starGift == null) {
                }
                l01Var5 = l01Var3;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                i15 = 9;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                l01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup3222222 = viewGroup;
                viewGroup3222222.addView(l01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                ei.d dVar222222 = new ei.d(context4, d6Var3);
                dVar222222.e();
                if ((starsTransaction4.flags & 32) == 0) {
                }
                viewGroup3222222.addView(dVar222222, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.f3 f3Var3222222 = f3Var;
                f3Var3222222.customView = viewGroup3222222;
                int i26222222 = 0;
                f3VarArr4[0] = f3Var3222222;
                f3Var3222222.useBackgroundTopPadding = false;
                if ((starsTransaction4.flags & 32) == 0) {
                }
                f3VarArr4[0].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                f3VarArr4[0].show();
                return f3VarArr4[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                w9Var2.setImageDrawable(new v6(w9Var2, starsTransaction.stargift, 94, 0.44f));
                e.addView(w9Var2, w7.z5.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                b1(w9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                e.addView(w9Var2, w7.z5.t(160, 160, 17, 0, -8, 0, 10));
            }
        }
        d6Var2 = d6Var;
        context2 = context;
        i11 = i10;
        starsTransaction2 = starsTransaction;
        linearLayout = e;
        str = "";
        z12 = z18;
        z13 = z10;
        j11 = j10;
        TextView textView3 = new TextView(context2);
        i12 = org.telegram.ui.ActionBar.h6.j5;
        org.telegram.ui.Cells.c1.r(i12, d6Var2, textView3, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(O0(i11, z13, starsTransaction2));
        TextView i382 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView3, w7.z5.t(-1, -2, 17, 36, 0, 36, 4), context2);
        i382.setTextSize(1, 18.0f);
        i382.setTypeface(AndroidUtilities.bold());
        i382.setGravity(17);
        i382.setTextColor(org.telegram.ui.ActionBar.h6.w0(!positive ? org.telegram.ui.ActionBar.h6.uj : org.telegram.ui.ActionBar.h6.wj, d6Var2));
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        i382.setText(Y0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, J0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(i382.getText());
        if (!starsTransaction2.refund) {
        }
        i382.setText(spannableStringBuilder42);
        linearLayout.addView(i382, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        f3VarArr2 = f3VarArr;
        f7 = 16.0f;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            mk.o(i12, d6Var2, textView22, 1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
        }
        l01 l01Var10222 = new l01(context2, d6Var2);
        starGift = starsTransaction2.stargift;
        int i21222 = 4;
        if (starGift == null) {
        }
        l01Var5 = l01Var3;
        starsTransactionPeer = starsTransaction4.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z14 = z15;
        i15 = 9;
        if (!TextUtils.isEmpty(starsTransaction4.id)) {
        }
        if (starsTransaction4.floodskip) {
        }
        l01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        starGift2 = starsTransaction4.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup32222222 = viewGroup;
        viewGroup32222222.addView(l01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction4.flags & 32) != 0) {
        }
        if (z14) {
        }
        ei.d dVar2222222 = new ei.d(context4, d6Var3);
        dVar2222222.e();
        if ((starsTransaction4.flags & 32) == 0) {
        }
        viewGroup32222222.addView(dVar2222222, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.f3 f3Var32222222 = f3Var;
        f3Var32222222.customView = viewGroup32222222;
        int i262222222 = 0;
        f3VarArr4[0] = f3Var32222222;
        f3Var32222222.useBackgroundTopPadding = false;
        if ((starsTransaction4.flags & 32) == 0) {
        }
        f3VarArr4[0].fixNavigationBar();
        U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet()) {
        }
        f3VarArr4[0].show();
        return f3VarArr4[0];
    }

    public static void j1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.d6 d6Var) {
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
        i1(activity, false, 0L, i10, starsTransaction, d6Var);
    }

    public static void k1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.d6 d6Var) {
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
        i1(context, false, 0L, i10, starsTransaction, d6Var);
    }

    public static CharSequence n1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        x4.o c10;
        if (z10 && com.google.android.gms.internal.play_billing.k3.s(spannableStringBuilder)) {
            for (yq yqVar : (yq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), yq.class)) {
                Drawable drawable = yqVar.drawable;
                if (drawable != null && !(drawable instanceof x4.o) && (c10 = x4.o.c(ApplicationLoader.applicationContext.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c10.setBounds(yqVar.drawable.getBounds());
                    yqVar.drawable = c10;
                    yqVar.recolorDrawable = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x050c  */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void y0(md mdVar, int i10) {
        h61 G;
        int i11;
        boolean[] zArr;
        String str;
        boolean z10;
        final boolean z11;
        TLRPC.Chat chat;
        boolean[] zArr2;
        TLRPC.Chat chat2;
        String str2;
        int i12;
        long j10;
        l01 l01Var;
        long j11;
        TLRPC.Chat chat3;
        boolean z12;
        String str3;
        boolean z13;
        long currentTime;
        dc dcVar;
        final org.telegram.ui.ActionBar.f3[] f3VarArr;
        final int i13;
        ?? r62;
        org.telegram.ui.ActionBar.n2 U;
        lc lcVar = mdVar.g0;
        if (lcVar == null || (G = lcVar.G(i10)) == null) {
            return;
        }
        int i14 = G.d;
        int i15 = 1;
        if (i14 == -1) {
            mdVar.g0.N(true);
            return;
        }
        if (i14 == -2) {
            ga.y(mdVar.currentAccount, false).u();
            ug.m1.f0(1, BirthdayController.getInstance(mdVar.currentAccount).getState());
            return;
        }
        if (i14 == -3) {
            ga.y(mdVar.currentAccount, false).W();
            mdVar.g0.N(true);
            return;
        }
        if (i14 == -4) {
            if (MessagesController.getInstance(mdVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(mdVar.currentAccount);
                return;
            } else {
                mdVar.presentFragment(new gi.u3(mdVar.getUserConfig().getClientUserId()));
                return;
            }
        }
        if (G.G(xc.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                ga.y(mdVar.currentAccount, false).f(mdVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new r5(i15, mdVar, G), null);
                return;
            }
            return;
        }
        if (G.G(ed.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = mdVar.getParentActivity();
            int i16 = mdVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.d6 resourceProvider = mdVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) parentActivity, resourceProvider, false);
            f3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.f3[] f3VarArr2 = new org.telegram.ui.ActionBar.f3[1];
            LinearLayout e = org.telegram.messenger.g0.e(parentActivity, 1);
            e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            e.setClipChildren(false);
            e.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            e.addView(frameLayout, w7.z5.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr3 = new boolean[1];
            dc dcVar2 = new dc(zArr3, f3VarArr2);
            NotificationCenter.getInstance(i16).addObserver(dcVar2, NotificationCenter.starSubscriptionsLoaded);
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
            int i17 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
            if (i17 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i16).getUser(Long.valueOf(peerDialogId));
                String userName = UserObject.getUserName(user);
                boolean isBot = UserObject.isBot(user);
                z10 = !isBot;
                str = userName;
                zArr = zArr3;
                z11 = isBot;
                i11 = i17;
                chat = user;
            } else {
                i11 = i17;
                zArr = zArr3;
                TLRPC.Chat chat4 = MessagesController.getInstance(i16).getChat(Long.valueOf(-peerDialogId));
                str = chat4 == null ? "" : chat4.title;
                z10 = false;
                z11 = false;
                chat = chat4;
            }
            TLRPC.Chat chat5 = chat;
            if (starsSubscription.photo != null) {
                w9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
                zArr2 = zArr;
                w9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", null, null);
            } else {
                zArr2 = zArr;
                w9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                if (i11 < 0) {
                    chat2 = chat5;
                    str2 = str;
                    TLRPC.Chat chat6 = MessagesController.getInstance(i16).getChat(Long.valueOf(-peerDialogId));
                    h9Var.q(chat6);
                    w9Var.e(chat6, h9Var);
                    frameLayout.addView(w9Var, w7.z5.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, w7.z5.e(28, 28, 17));
                        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, w7.z5.e(28, 28, 17));
                        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.Cells.c1.r(org.telegram.ui.ActionBar.h6.j5, resourceProvider, textView, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                    }
                    e.addView(textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, resourceProvider));
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i12 = tL_starsSubscriptionPricing.period;
                    if (i12 != 2592000) {
                        j10 = peerDialogId;
                        textView2.setText(Y0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f, null));
                    } else {
                        j10 = peerDialogId;
                        textView2.setText(Y0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), i12 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    e.addView(textView2, w7.z5.t(-1, -2, 17, 20, 0, 20, 4));
                    l01Var = new l01(parentActivity, resourceProvider);
                    x90 x90Var = new x90(parentActivity, resourceProvider);
                    x90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                    x90Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i18 = org.telegram.ui.ActionBar.h6.gc;
                    x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, resourceProvider));
                    x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i18, resourceProvider));
                    x90Var.setTextSize(1, 14.0f);
                    x90Var.setSingleLine(true);
                    x90Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.l5 l5Var = new org.telegram.ui.l5(x90Var, 24.0f, i16);
                    if (i11 < 0) {
                        TLRPC.User user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(j10));
                        boolean z14 = user2 == null || UserObject.isDeleted(user2);
                        String userName2 = UserObject.getUserName(user2);
                        l5Var.e(user2);
                        z12 = z14;
                        str3 = userName2;
                        j11 = j10;
                        chat3 = chat2;
                    } else {
                        j11 = j10;
                        chat3 = chat2;
                        TLRPC.Chat chat7 = MessagesController.getInstance(i16).getChat(Long.valueOf(-j11));
                        z12 = chat7 == null;
                        String str4 = chat7 != null ? chat7.title : "";
                        l5Var.b(chat7);
                        str3 = str4;
                    }
                    z13 = z12;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
                    spannableStringBuilder.setSpan(l5Var, 0, 1, 33);
                    spannableStringBuilder.setSpan(new ec(f3VarArr2, j11), 3, spannableStringBuilder.length(), 33);
                    x90Var.setText(spannableStringBuilder);
                    if (!z13) {
                        l01Var.l(x90Var, LocaleController.getString(i11 < 0 ? R.string.StarsSubscriptionChannel : z10 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot));
                    }
                    if (i11 >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                        l01Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
                    }
                    l01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
                    l01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    e.addView(l01Var, w7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    x90 x90Var2 = new x90(parentActivity, resourceProvider);
                    int i19 = org.telegram.ui.ActionBar.h6.z6;
                    x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i19, resourceProvider));
                    x90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i18, resourceProvider));
                    x90Var2.setTextSize(1, 14.0f);
                    final int i20 = 0;
                    x90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: ai.lb
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i21 = i20;
                            Activity activity = parentActivity;
                            switch (i21) {
                                case 0:
                                    pf.d.r(activity, LocaleController.getString(R.string.StarsTOSLink));
                                    break;
                                default:
                                    if (!activity.isFinishing()) {
                                        Handler handler = e0.d.g;
                                        Method method = e0.d.f;
                                        int i22 = Build.VERSION.SDK_INT;
                                        if (i22 < 28) {
                                            if (((i22 != 26 && i22 != 27) || method != null) && (e0.d.e != null || e0.d.d != null)) {
                                                try {
                                                    Object obj2 = e0.d.c.get(activity);
                                                    if (obj2 != null && (obj = e0.d.b.get(activity)) != null) {
                                                        Application application = activity.getApplication();
                                                        e0.c cVar = new e0.c(activity);
                                                        application.registerActivityLifecycleCallbacks(cVar);
                                                        handler.post(new j9.u(11, cVar, obj2));
                                                        try {
                                                            if (i22 == 26 || i22 == 27) {
                                                                Boolean bool = Boolean.FALSE;
                                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                            } else {
                                                                activity.recreate();
                                                            }
                                                            handler.post(new j9.u(12, application, cVar));
                                                            break;
                                                        } catch (Throwable th2) {
                                                            handler.post(new j9.u(12, application, cVar));
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
                            }
                        }
                    }));
                    x90Var2.setGravity(17);
                    e.addView(x90Var2, w7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        dcVar = dcVar2;
                        f3VarArr = f3VarArr2;
                        i13 = i16;
                        x90 x90Var3 = new x90(parentActivity, resourceProvider);
                        x90Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i19, resourceProvider));
                        x90Var3.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i18, resourceProvider));
                        x90Var3.setTextSize(1, 14.0f);
                        x90Var3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        x90Var3.setSingleLine(false);
                        x90Var3.setMaxLines(4);
                        x90Var3.setGravity(17);
                        e.addView(x90Var3, w7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            ei.d dVar = new ei.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r62 = 0;
                            dVar.g(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                            e.addView(dVar, w7.z5.n(-1, 48));
                            dVar.setOnClickListener(new pb(dVar, starsSubscription, i13, f3VarArr, resourceProvider, zArr2, parentActivity));
                            f3Var.customView = e;
                            f3VarArr[r62] = f3Var;
                            f3Var.useBackgroundTopPadding = r62;
                            f3Var.setOnDismissListener(new qb(i13, dcVar));
                            f3VarArr[r62].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                f3VarArr[r62].makeAttached(U);
                            }
                            f3VarArr[r62].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        x90 x90Var4 = new x90(parentActivity, resourceProvider);
                        x90Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i19, resourceProvider));
                        x90Var4.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i18, resourceProvider));
                        x90Var4.setTextSize(1, 14.0f);
                        x90Var4.setText(LocaleController.formatString(z11 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        x90Var4.setSingleLine(false);
                        x90Var4.setMaxLines(4);
                        x90Var4.setGravity(17);
                        e.addView(x90Var4, w7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        ei.d dVar2 = new ei.d(parentActivity, resourceProvider, true);
                        dVar2.g(LocaleController.getString(z11 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false, true);
                        e.addView(dVar2, w7.z5.n(-1, 48));
                        dcVar = dcVar2;
                        f3VarArr = f3VarArr2;
                        mb mbVar = new mb(dVar2, i16, starsSubscription, f3VarArr, j11, parentActivity, resourceProvider, z10, str2);
                        i13 = i16;
                        dVar2.setOnClickListener(mbVar);
                    } else {
                        dcVar = dcVar2;
                        f3VarArr = f3VarArr2;
                        final boolean z15 = z10;
                        i13 = i16;
                        if (starsSubscription.bot_canceled) {
                            x90 x90Var5 = new x90(parentActivity, resourceProvider);
                            x90Var5.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.wj, resourceProvider));
                            x90Var5.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i18, resourceProvider));
                            x90Var5.setTextSize(1, 14.0f);
                            x90Var5.setText(LocaleController.getString(z15 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                            x90Var5.setSingleLine(false);
                            x90Var5.setMaxLines(4);
                            x90Var5.setGravity(17);
                            e.addView(x90Var5, w7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            x90 x90Var6 = new x90(parentActivity, resourceProvider);
                            x90Var6.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.wj, resourceProvider));
                            x90Var6.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i18, resourceProvider));
                            x90Var6.setTextSize(1, 14.0f);
                            x90Var6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                            x90Var6.setSingleLine(false);
                            x90Var6.setMaxLines(4);
                            x90Var6.setGravity(17);
                            e.addView(x90Var6, w7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                ei.d dVar3 = new ei.d(parentActivity, resourceProvider, true);
                                dVar3.g(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                                e.addView(dVar3, w7.z5.n(-1, 48));
                                dVar3.setOnClickListener(new nb(dVar3, starsSubscription, i13, f3VarArr, chat3, str2));
                            }
                        } else {
                            final TLRPC.Chat chat8 = chat3;
                            x90 x90Var7 = new x90(parentActivity, resourceProvider);
                            x90Var7.setTextColor(org.telegram.ui.ActionBar.h6.w0(i19, resourceProvider));
                            x90Var7.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i18, resourceProvider));
                            x90Var7.setTextSize(1, 14.0f);
                            x90Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                            x90Var7.setSingleLine(false);
                            x90Var7.setMaxLines(4);
                            x90Var7.setGravity(17);
                            e.addView(x90Var7, w7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final ei.d dVar4 = new ei.d(parentActivity, resourceProvider, false);
                            dVar4.g(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                            dVar4.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.wj, resourceProvider));
                            e.addView(dVar4, w7.z5.n(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: ai.ob
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final ei.d dVar5 = dVar4;
                                    if (dVar5.N) {
                                        return;
                                    }
                                    dVar5.setLoading(true);
                                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                    tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                    final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                                    tL_changeStarsSubscription.subscription_id = starsSubscription2.id;
                                    final int i21 = i13;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i21);
                                    final TLObject tLObject = chat8;
                                    final boolean z16 = z15;
                                    final boolean z17 = z11;
                                    final org.telegram.ui.ActionBar.f3[] f3VarArr3 = f3VarArr;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: ai.tb
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            AndroidUtilities.runOnUIThread(new wb(i21, dVar5, tLObject, starsSubscription2, z16, z17, f3VarArr3));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r62 = 0;
                    f3Var.customView = e;
                    f3VarArr[r62] = f3Var;
                    f3Var.useBackgroundTopPadding = r62;
                    f3Var.setOnDismissListener(new qb(i13, dcVar));
                    f3VarArr[r62].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        f3VarArr[r62].makeAttached(U);
                    }
                    f3VarArr[r62].show();
                }
                TLRPC.User user3 = MessagesController.getInstance(i16).getUser(Long.valueOf(peerDialogId));
                h9Var.r(user3);
                w9Var.e(user3, h9Var);
            }
            chat2 = chat5;
            str2 = str;
            frameLayout.addView(w9Var, w7.z5.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, resourceProvider), PorterDuff.Mode.SRC_IN));
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.ui.Cells.c1.r(org.telegram.ui.ActionBar.h6.j5, resourceProvider, textView3, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            e.addView(textView3, w7.z5.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            textView22.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, resourceProvider));
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i12 = tL_starsSubscriptionPricing2.period;
            if (i12 != 2592000) {
            }
            e.addView(textView22, w7.z5.t(-1, -2, 17, 20, 0, 20, 4));
            l01Var = new l01(parentActivity, resourceProvider);
            x90 x90Var8 = new x90(parentActivity, resourceProvider);
            x90Var8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            x90Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i182 = org.telegram.ui.ActionBar.h6.gc;
            x90Var8.setTextColor(org.telegram.ui.ActionBar.h6.w0(i182, resourceProvider));
            x90Var8.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i182, resourceProvider));
            x90Var8.setTextSize(1, 14.0f);
            x90Var8.setSingleLine(true);
            x90Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.l5 l5Var2 = new org.telegram.ui.l5(x90Var8, 24.0f, i16);
            if (i11 < 0) {
            }
            z13 = z12;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str3));
            spannableStringBuilder2.setSpan(l5Var2, 0, 1, 33);
            spannableStringBuilder2.setSpan(new ec(f3VarArr2, j11), 3, spannableStringBuilder2.length(), 33);
            x90Var8.setText(spannableStringBuilder2);
            if (!z13) {
            }
            if (i11 >= 0) {
                l01Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
            }
            l01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
            l01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
            e.addView(l01Var, w7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            x90 x90Var22 = new x90(parentActivity, resourceProvider);
            int i192 = org.telegram.ui.ActionBar.h6.z6;
            x90Var22.setTextColor(org.telegram.ui.ActionBar.h6.w0(i192, resourceProvider));
            x90Var22.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i182, resourceProvider));
            x90Var22.setTextSize(1, 14.0f);
            final int i202 = 0;
            x90Var22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: ai.lb
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i21 = i202;
                    Activity activity = parentActivity;
                    switch (i21) {
                        case 0:
                            pf.d.r(activity, LocaleController.getString(R.string.StarsTOSLink));
                            break;
                        default:
                            if (!activity.isFinishing()) {
                                Handler handler = e0.d.g;
                                Method method = e0.d.f;
                                int i22 = Build.VERSION.SDK_INT;
                                if (i22 < 28) {
                                    if (((i22 != 26 && i22 != 27) || method != null) && (e0.d.e != null || e0.d.d != null)) {
                                        try {
                                            Object obj2 = e0.d.c.get(activity);
                                            if (obj2 != null && (obj = e0.d.b.get(activity)) != null) {
                                                Application application = activity.getApplication();
                                                e0.c cVar = new e0.c(activity);
                                                application.registerActivityLifecycleCallbacks(cVar);
                                                handler.post(new j9.u(11, cVar, obj2));
                                                try {
                                                    if (i22 == 26 || i22 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new j9.u(12, application, cVar));
                                                    break;
                                                } catch (Throwable th2) {
                                                    handler.post(new j9.u(12, application, cVar));
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
                    }
                }
            }));
            x90Var22.setGravity(17);
            e.addView(x90Var22, w7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r62 = 0;
            f3Var.customView = e;
            f3VarArr[r62] = f3Var;
            f3Var.useBackgroundTopPadding = r62;
            f3Var.setOnDismissListener(new qb(i13, dcVar));
            f3VarArr[r62].fixNavigationBar();
            U = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
            }
            f3VarArr[r62].show();
        }
    }

    public final void I0(ArrayList arrayList, u61 u61Var) {
        if (getParentActivity() == null) {
            return;
        }
        ga y3 = ga.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        v10 v10Var = (v10) super.r0(getParentActivity());
        h61 h61Var = new h61(-2);
        h61Var.c = v10Var;
        arrayList.add(h61Var);
        arrayList.add(h61.k(this.U));
        ei.d dVar = this.d0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(h61.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(gi.h.a(-4, getThemedColor(org.telegram.ui.ActionBar.h6.uj), R.drawable.filled_earn_stars, io.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(h61.B(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            i2.e.p(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = ed.a;
                h61 J = h61.J(ed.class);
                J.G = starsSubscription;
                arrayList.add(J);
            }
            if (y3.x) {
                arrayList.add(h61.o(arrayList.size(), 33));
            } else if (!y3.y) {
                h61 c10 = h61.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(h61.B(null));
        }
        boolean O = y3.O(0);
        this.e0 = O;
        if (O) {
            arrayList.add(h61.p(this.R, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
        } else {
            arrayList.add(h61.l(this.S));
        }
    }

    @Override // org.telegram.ui.y10, org.telegram.ui.ActionBar.n2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new ld(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.S = new ic(this, context, 0);
        super.createView(context);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        tg.n nVar = new tg.n(context, 1, 2);
        this.Q = nVar;
        tg.g gVar = nVar.b;
        gVar.z = org.telegram.ui.ActionBar.h6.fk;
        gVar.A = org.telegram.ui.ActionBar.h6.gk;
        gVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, w7.z5.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new ra(context, 1)), true), this.P, null);
        this.c.setOverScrollMode(2);
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new wa(this, 0));
        z00 z00Var = new z00(getParentActivity());
        this.T = z00Var;
        this.s.addView(z00Var, w7.z5.c(-1.0f, -1));
        ga y3 = ga.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getParentActivity(), false, true, false);
        this.W = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        d70 d70Var = new d70(this.W, 42.0f, this.currentAccount);
        vj0 vj0Var = new vj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = d70Var.b;
        imageReceiver.setImageBitmap(vj0Var);
        imageReceiver.setAutoRepeat(2);
        d70Var.f = false;
        d70Var.h = -AndroidUtilities.dp(3.0f);
        this.V.setSpan(d70Var, 0, 1, 33);
        this.U.addView(this.W, w7.z5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.X.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, this.resourceProvider));
        this.U.addView(this.X, w7.z5.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        ah.x xVar = new ah.x(this, getParentActivity(), 2);
        this.Z = xVar;
        frameLayout2.addView(xVar);
        ei.d dVar = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.a0 = dVar;
        dVar.e();
        this.a0.g("", false, true);
        final int i10 = 0;
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: ai.xa
            public final /* synthetic */ md b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        md.C0(this.b, context);
                        break;
                    default:
                        new dd(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.Z.addView(this.a0, w7.z5.e(-1, 48, 119));
        qa1 qa1Var = new qa1(this, getParentActivity(), 2);
        this.b0 = qa1Var;
        frameLayout2.addView(qa1Var);
        ei.d dVar2 = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.c0 = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new yq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.c0.g(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: ai.xa
            public final /* synthetic */ md b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        md.C0(this.b, context);
                        break;
                    default:
                        new dd(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.b0.addView(this.c0, w7.z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ei.d dVar3 = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new yq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.Y.g(spannableStringBuilder2, false, true);
        final int i12 = 0;
        this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: ai.ya
            public final /* synthetic */ md b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        md mdVar = this.b;
                        mdVar.presentFragment(new x(0, mdVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        md.B0(this.b);
                        break;
                }
            }
        });
        this.b0.addView(this.Y, w7.z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, w7.z5.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        ei.d dVar4 = new ei.d(getParentActivity(), this.resourceProvider, false);
        this.d0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new yq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.d0.g(spannableStringBuilder3, false, true);
        final int i13 = 1;
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: ai.ya
            public final /* synthetic */ md b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        md mdVar = this.b;
                        mdVar.presentFragment(new x(0, mdVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        md.B0(this.b);
                        break;
                }
            }
        });
        this.U.addView(this.d0, w7.z5.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        l1();
        lc lcVar = this.g0;
        if (lcVar != null) {
            lcVar.N(false);
        }
        k0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = k0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        m1(y3.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            t0();
            lc lcVar = this.g0;
            if (lcVar != null) {
                lcVar.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            ga y3 = ga.y(this.currentAccount, false);
            if (this.e0 != y3.O(0)) {
                this.e0 = y3.O(0);
                t0();
                lc lcVar2 = this.g0;
                if (lcVar2 != null) {
                    lcVar2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            lc lcVar3 = this.g0;
            if (lcVar3 != null) {
                lcVar3.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            l1();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            l1();
        }
    }

    public final void l1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        ga y3 = ga.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) K0(y3.p(), 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        this.a0.g(LocaleController.getString(y3.p().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats h = k0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        m1(z10, true);
    }

    public final void m1(final boolean z10, boolean z11) {
        this.f0 = z10;
        if (z11) {
            this.Z.setVisibility(0);
            this.b0.setVisibility(0);
            final int i10 = 0;
            this.Z.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: ai.za
                public final /* synthetic */ md b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            if (z10) {
                                this.b.Z.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.b0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final int i11 = 1;
            this.b0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: ai.za
                public final /* synthetic */ md b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            if (z10) {
                                this.b.Z.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.b0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        this.Z.animate().cancel();
        this.b0.animate().cancel();
        this.b0.setAlpha(z10 ? 1.0f : 0.0f);
        this.Z.setAlpha(z10 ? 0.0f : 1.0f);
        this.b0.setVisibility(z10 ? 0 : 8);
        this.Z.setVisibility(z10 ? 8 : 0);
    }

    @Override // org.telegram.ui.y10
    public final s4.g0 n0() {
        lc lcVar = new lc(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new q(this, 6), getResourceProvider());
        this.g0 = lcVar;
        lcVar.r = false;
        return lcVar;
    }

    @Override // org.telegram.ui.y10
    public final x10 o0() {
        return new wc(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        ga.y(this.currentAccount, false).T(true);
        ga.y(this.currentAccount, false).S();
        ga.y(this.currentAccount, false).z();
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

    @Override // org.telegram.ui.y10, org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        tg.n nVar = this.Q;
        if (nVar != null) {
            nVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.y10, org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.Q;
        if (nVar != null) {
            nVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.y10
    public final sg.x1 p0() {
        return new kc(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.y10
    public final boolean q0() {
        ld ldVar = this.R;
        boolean z10 = false;
        if (ldVar != null && (ldVar.getParent() instanceof View)) {
            if ((this.c.getHeight() - this.c.getPaddingBottom()) - ((View) this.R.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.y10
    public final View r0(Context context) {
        throw null;
    }
}
