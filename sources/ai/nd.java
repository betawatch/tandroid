package ai;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a20;
import org.telegram.ui.b20;
import org.telegram.ui.h70;
import org.telegram.ui.ko;
import org.telegram.ui.sn;
import org.telegram.ui.va1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class nd extends b20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat j0;
    public static DecimalFormat k0;
    public FrameLayout R;
    public tg.n S;
    public md T;
    public jc U;
    public z00 V;
    public LinearLayout W;
    public SpannableStringBuilder X;
    public org.telegram.ui.Components.q6 Y;
    public TextView Z;
    public ei.d a0;
    public ah.x b0;
    public ei.d c0;
    public va1 d0;
    public ei.d e0;
    public ei.d f0;
    public boolean g0;
    public boolean h0;
    public mc i0;

    public nd() {
        this.M = true;
    }

    public static void A0(nd ndVar, m61 m61Var, Boolean bool, String str) {
        if (ndVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            org.telegram.ui.Components.xc.a0(ndVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) m61Var.B, new Object[0])), R.raw.stars_topup).j();
            ndVar.V.c(true);
            ha.y(ndVar.currentAccount, false).T(true);
        } else if (str != null) {
            i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.xc.a0(ndVar), R.raw.error, 36);
        }
    }

    public static void B0(nd ndVar) {
        ha.y(ndVar.currentAccount, false).u();
        ug.l1.e0(1, BirthdayController.getInstance(ndVar.currentAccount).getState());
    }

    public static /* synthetic */ void C0(nd ndVar, Context context) {
        if (MessagesController.getInstance(ndVar.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(ndVar.currentAccount);
        } else {
            new ed(context, ndVar.resourceProvider).show();
        }
    }

    public static void G0(o01 o01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.g6 g6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((l01) o01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        da0 da0Var = new da0(textView, AndroidUtilities.dp(90.0f), 0, g6Var);
        da0Var.a(org.telegram.ui.ActionBar.k6.o1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.k6.o1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(da0Var, 0, 1, 33);
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
        final ha y3 = ha.y(i10, false);
        final long j10 = starGift.id;
        final r0 r0Var = new r0(textView, 5);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() { // from class: ai.k9
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                ha haVar;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = NotificationCenter.starGiftsLoaded) || (J = (haVar = ha.this).J(j10)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(haVar.a).removeObserver(notificationCenterDelegateArr[0], i14);
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
        spannableString.setSpan(new hc(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount) {
        return K0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (k0 == null) {
            k0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
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
            String format = k0.format(j10 / 1.0E9d);
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
            DecimalFormat decimalFormat = k0;
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
        if (k0 == null) {
            k0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = k0.format(starsAmount.amount / 1.0E9d);
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
            DecimalFormat decimalFormat = k0;
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
            if (k0 == null) {
                k0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = k0.format(starsAmount.amount / 1.0E9d);
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
        if (k0 == null) {
            k0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        DecimalFormat decimalFormat = k0;
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
        if (j0 == null) {
            j0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return j0.format(j10 / 1.0E9d);
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
        xq xqVar = new xq(R.drawable.diamond, 0);
        xqVar.recolorDrawable = false;
        xqVar.translate(0.0f, f10);
        xqVar.spaceScaleX = f11;
        xqVar.setScale(f7, f7);
        spannableString.setSpan(xqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder S0(CharSequence charSequence, float f7, xq[] xqVarArr) {
        return V0(false, charSequence, f7, xqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(CharSequence charSequence, boolean z10) {
        return V0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return V0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(boolean z10, CharSequence charSequence, float f7, xq[] xqVarArr, float f10, float f11) {
        xq xqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (xqVarArr == null || (xqVar = xqVarArr[0]) == null) {
            xqVar = new xq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (xqVarArr != null) {
                xqVarArr[0] = xqVar;
            }
        }
        xqVar.translate(0.0f, f10);
        xqVar.spaceScaleX = f11;
        if (z10) {
            xqVar.recolorDrawable = false;
            float f12 = f7 * 0.2f;
            xqVar.setScale(f12, f12);
        } else {
            xqVar.setScale(f7, f7);
        }
        spannableString.setSpan(xqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(boolean z10, String str, xq[] xqVarArr) {
        xq xqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (xqVarArr == null || (xqVar = xqVarArr[0]) == null) {
            xqVar = new xq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            xqVar.setScale(z10 ? 0.222f : 1.13f, z10 ? 0.222f : 1.13f);
        }
        if (z10) {
            xqVar.recolorDrawable = false;
        }
        if (xqVarArr != null) {
            xqVarArr[0] = xqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(xqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder X0(TL_stars.StarsAmount starsAmount, String str, xq[] xqVarArr) {
        return Y0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, xqVarArr);
    }

    public static SpannableStringBuilder Y0(boolean z10, CharSequence charSequence, float f7, xq[] xqVarArr) {
        xq xqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i10 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (xqVarArr == null || (xqVar = xqVarArr[0]) == null) {
            if (xqVarArr == null || xqVarArr.length <= 0) {
                xqVar = new xq(i10, 0);
            } else {
                xqVar = new xq(i10, 0);
                xqVarArr[0] = xqVar;
            }
        }
        xqVar.recolorDrawable = false;
        if (z10) {
            f7 *= 0.33f;
        }
        xqVar.setScale(f7, f7);
        spannableString.setSpan(xqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static gb Z0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final eb ebVar = new eb(z10, currentAccount, str, imageReceiver, new boolean[1]);
        ebVar.run();
        final int i10 = 0;
        final int i11 = 1;
        return new gb(NotificationCenter.getInstance(currentAccount).listen(view, z10 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: ai.fb
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        ebVar.run();
                        break;
                    default:
                        ebVar.run();
                        break;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: ai.fb
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        ebVar.run();
                        break;
                    default:
                        ebVar.run();
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
        imageReceiver.setImage(ImageLocation.getForDocument(document), a1.g.k(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.a7, 0.35f), 0L, null, null, 0);
    }

    public static void b1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        a1(imageReceiver, starGift == null ? null : starGift.getDocument(), i10);
    }

    public static void c1(org.telegram.ui.Components.w9 w9Var, ImageReceiver imageReceiver, long j10) {
        Z0(w9Var, imageReceiver, j10 <= 1000 ? "2⃣" : j10 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static gb d1(org.telegram.ui.Components.w9 w9Var, ImageReceiver imageReceiver, int i10) {
        return Z0(w9Var, imageReceiver, i10 != 3 ? i10 != 6 ? i10 != 12 ? i10 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void e1(org.telegram.ui.Components.w9 w9Var, ImageReceiver imageReceiver, long j10) {
        Z0(w9Var, imageReceiver, j10 <= 10000000000L ? "2⃣" : j10 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void f1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.g6 g6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.h3 j11 = sl.j(1, context, g6Var, false);
        LinearLayout e = sl.e(context, 1);
        e.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e.addView(frameLayout, w7.z5.t(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 7, 0, 0, 0, 10));
        lc lcVar = new lc(context, 70, 0);
        frameLayout.addView(lcVar, w7.z5.c(-1.0f, -1));
        int i11 = 2;
        tg.n nVar = new tg.n(context, 1, 2);
        tg.g gVar = nVar.b;
        gVar.z = org.telegram.ui.ActionBar.k6.fk;
        gVar.A = org.telegram.ui.ActionBar.k6.gk;
        gVar.b();
        nVar.setStarParticlesView(lcVar);
        frameLayout.addView(nVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.j5, g6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView f7 = sl.f(e, textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        f7.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(20.0f), -6915073));
        f7.setTextColor(-1);
        f7.setTextSize(1, 11.33f);
        f7.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        f7.setGravity(17);
        f7.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i12 = boost.multiplier;
        if (i12 == 0) {
            i12 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i12));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        xq xqVar = new xq(R.drawable.mini_boost_badge, 2);
        xqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(xqVar, 0, 1, 33);
        f7.setText(spannableStringBuilder);
        e.addView(f7, w7.z5.t(-2, 20, 17, 20, 4, 20, 4));
        o01 o01Var = new o01(context, g6Var);
        o01Var.n(LocaleController.getString(R.string.BoostFrom), i10, j10, new la(h3VarArr, j10, i11));
        o01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            a3.i0 i0Var = new a3.i0(h3VarArr, j10, boost, 3);
            h3VarArr = h3VarArr;
            o01Var.i(string, string2, i0Var);
        }
        o01Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        o01Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        e.addView(o01Var, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        y90 y90Var = new y90(context, g6Var);
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.z6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, g6Var);
        y90Var.setTextSize(1, 14.0f);
        y90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new sa(context, 3)));
        y90Var.setGravity(17);
        e.addView(y90Var, w7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        ei.d dVar = new ei.d(context, g6Var, true);
        dVar.i(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new ta(h3VarArr, 1));
        e.addView(dVar, w7.z5.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        j11.customView = e;
        h3VarArr[0] = j11;
        j11.useBackgroundTopPadding = false;
        j11.fixNavigationBar();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            h3VarArr[0].makeAttached(U);
        }
        nVar.setPaused(false);
        h3VarArr[0].show();
        h3VarArr[0].setOnDismissListener(new a3.d(nVar, 20));
    }

    public static l1 g1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.g6 g6Var) {
        ag.b bVar = ag.b.a;
        l1 l1Var = new l1(context, g6Var, i10, tL_starGiftUnique == null ? ag.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(ag.b.b) : tL_starGiftUnique.getResellAmount(bVar), new o2(5, callback2, r8));
        l1[] l1VarArr = {l1Var};
        l1Var.show();
        return l1VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.ActionBar.h3[] h3VarArr;
        int i10 = 1;
        Object[] objArr = 0;
        org.telegram.ui.ActionBar.h3 j11 = sl.j(1, context, g6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        sl.n(R.string.PaidContentTitle, textView, 1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        linearLayout.addView(textView, w7.z5.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        vd0 vd0Var = new vd0(context, g6Var);
        vd0Var.setForceForceUseCenter(true);
        vd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        vd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i11, g6Var);
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
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.uf, g6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.k6.vf, g6Var);
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new ib(vd0Var, editTextBoldCursor, objArr == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.z5.o(-1, -2, 1.0f, 119));
        vd0Var.e(editTextBoldCursor);
        vd0Var.addView(linearLayout2, w7.z5.e(-1, -2, 48));
        linearLayout.addView(vd0Var, w7.z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.A6, null);
        vd0Var.addView(textView2, w7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        y90 y90Var = new y90(context, null);
        y90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new sa(context, 4)), true));
        y90Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.z6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, g6Var);
        linearLayout.addView(y90Var, w7.z5.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final ei.d g10 = sl.g(24, context, g6Var, true);
        g10.i(LocaleController.getString(j10 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(g10, w7.z5.n(-1, 48));
        if (j10 > 0 && z10) {
            dVar = sl.g(24, context, g6Var, false);
            dVar.i(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        j11.customView = linearLayout;
        final org.telegram.ui.ActionBar.h3[] h3VarArr2 = {j11};
        editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
        editTextBoldCursor.addTextChangedListener(new ic(editTextBoldCursor, vd0Var, j10, z10, g10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ai.jb
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
                g10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new lb(editTextBoldCursor2, h3VarArr2, 2));
                return true;
            }
        });
        g10.setOnClickListener(new kb(zArr, callback2, editTextBoldCursor, g10, h3VarArr2));
        if (dVar != null) {
            ei.d dVar2 = dVar;
            kb kbVar = new kb(zArr, callback2, dVar2, editTextBoldCursor, h3VarArr2);
            h3VarArr = h3VarArr2;
            dVar2.setOnClickListener(kbVar);
        } else {
            h3VarArr = h3VarArr2;
        }
        h3VarArr[0].fixNavigationBar();
        h3VarArr[0].setOnDismissListener(new cb(editTextBoldCursor, i10));
        h3VarArr[0].show();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new lb(h3VarArr, editTextBoldCursor), R instanceof sn ? ((sn) R).U9() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0f85  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0fbb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x1003  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x1058  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x108f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x10af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x1098  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1063  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x1046  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0d84  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0d92  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0e40  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0e75 A[LOOP:0: B:67:0x0deb->B:76:0x0e75, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0e85 A[EDGE_INSN: B:77:0x0e85->B:78:0x0e85 BREAK  A[LOOP:0: B:67:0x0deb->B:76:0x0e75], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0f00 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0f12  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0f14  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0f23  */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.h3 i1(final Context context, final boolean z10, final long j10, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.ActionBar.h3 h3Var;
        org.telegram.ui.ActionBar.h3[] h3VarArr;
        boolean z11;
        Context context2;
        int i11;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z12;
        boolean z13;
        long j11;
        org.telegram.ui.ActionBar.g6 g6Var2;
        TLRPC.Peer peer;
        String str2;
        long j12;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        int i12;
        org.telegram.ui.ActionBar.h3[] h3VarArr2;
        float f7;
        int i13;
        String string;
        TL_stars.StarGift starGift;
        TL_stars.StarsTransaction starsTransaction3;
        ViewGroup viewGroup;
        final org.telegram.ui.ActionBar.h3[] h3VarArr3;
        org.telegram.ui.ActionBar.g6 g6Var3;
        Context context3;
        int i14;
        org.telegram.ui.ActionBar.h3[] h3VarArr4;
        TL_stars.StarsTransaction starsTransaction4;
        o01 o01Var;
        final org.telegram.ui.ActionBar.h3[] h3VarArr5;
        o01 o01Var2;
        o01 o01Var3;
        o01 o01Var4;
        o01 o01Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z14;
        int i15;
        TL_stars.StarGift starGift2;
        Context context4;
        ?? r13;
        org.telegram.ui.ActionBar.o2 U;
        TLRPC.Chat chat;
        int i16;
        ImageLocation imageLocation2;
        ImageLocation forDocument2;
        int i17;
        o01 o01Var6;
        o01 o01Var7;
        final int i18;
        o01 o01Var8;
        final org.telegram.ui.ActionBar.h3[] h3VarArr6;
        long j13;
        o01 o01Var9;
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
        org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(context, g6Var, false, false);
        h3Var2.fixNavigationBar();
        org.telegram.ui.ActionBar.h3[] h3VarArr7 = new org.telegram.ui.ActionBar.h3[1];
        final LinearLayout e = sl.e(context, 1);
        e.setPadding(0, AndroidUtilities.dp((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                h3VarArr = h3VarArr7;
                h3Var = h3Var2;
                pc pcVar = new pc(context, matrix, radialGradient, paint, p5Var);
                p5Var.l(pcVar);
                p5Var.i(stargiftattributepattern.document, false);
                pcVar.setOrientation(1);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                b1(w9Var.getImageReceiver(), starsTransaction.stargift, 160);
                pcVar.addView(w9Var, w7.z5.t(160, 160, 17, 0, 20, 0, 0));
                if (TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    i19 = 0;
                } else {
                    w7.b6.a(w9Var);
                    i19 = 0;
                    w9Var.setOnClickListener(new ia(context, i10, tL_starGiftUnique, i19));
                }
                TextView b10 = w7.d6.b(context, 20.0f, i19, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                pcVar.addView(b10, w7.z5.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = w7.d6.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                pcVar.addView(b11, w7.z5.t(-2, -2, 17, 0, 5, 0, 0));
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
                pcVar.addView(b12, w7.z5.t(-2, -2, 17, 0, 11, 0, 17));
                e.addView(pcVar, w7.z5.n(-1, -2));
                g6Var2 = g6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = e;
                str = "";
                z12 = z18;
                h3VarArr2 = h3VarArr;
                f7 = 16.0f;
                o01 o01Var10 = new o01(context2, g6Var2);
                starGift = starsTransaction2.stargift;
                int i21 = 4;
                if (starGift == null) {
                    if (starsTransaction2.stargift_upgrade) {
                        if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                            starsTransaction4 = starsTransaction2;
                            viewGroup2 = linearLayout;
                        } else {
                            org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) ((l01) o01Var10.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                            tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                            viewGroup2 = linearLayout;
                            Context context5 = context2;
                            starsTransaction4 = starsTransaction;
                            ha.w(i10).M(tL_inputSavedStarGiftUser, new va(zcVar, i10, context5, g6Var2, 0));
                        }
                        TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction4.peer;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                            long peerDialogId = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer2).peer);
                            String string2 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                            Runnable laVar = new la(h3VarArr2, peerDialogId, 1);
                            i14 = i10;
                            o01 o01Var11 = o01Var10;
                            org.telegram.ui.ActionBar.h3[] h3VarArr8 = h3VarArr2;
                            g6Var3 = g6Var;
                            o01Var11.n(string2, i14, peerDialogId, laVar);
                            context3 = context;
                            viewGroup = viewGroup2;
                            h3VarArr4 = h3VarArr8;
                            o01Var5 = o01Var11;
                            starsTransactionPeer = starsTransaction4.peer;
                            if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction4.flags & 256) != 0) {
                                long peerDialogId2 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                                if (z10) {
                                    peerDialogId2 = j10;
                                }
                                chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId2));
                                if (chat == null) {
                                    y90 y90Var = new y90(context3, g6Var3);
                                    y90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                    y90Var.setEllipsize(TextUtils.TruncateAt.END);
                                    int i22 = org.telegram.ui.ActionBar.k6.gc;
                                    org.telegram.ui.ActionBar.r6.W(y90Var, i22, g6Var3);
                                    org.telegram.ui.ActionBar.r6.I(y90Var, i22, g6Var3);
                                    y90Var.setTextSize(1, 14.0f);
                                    y90Var.setDisablePaddingsOffsetY(true);
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
                                            h70 h70Var = new h70(y90Var, 24.0f, i14);
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
                                                        h70Var.a(6.0f);
                                                        h70Var.b.setImage(imageLocation2, "24_24", null, null, null, 0);
                                                        SpannableString spannableString = new SpannableString("x");
                                                        spannableString.setSpan(h70Var, 0, spannableString.length(), 33);
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
                                    ma maVar = new ma(h3VarArr4, peerDialogId2, starsTransaction4);
                                    spannableStringBuilder2.setSpan(new dc(maVar), length, spannableStringBuilder2.length(), 33);
                                    y90Var.setSingleLine(true);
                                    y90Var.setEllipsize(TextUtils.TruncateAt.END);
                                    y90Var.setText(spannableStringBuilder2);
                                    i15 = 9;
                                    y90Var.setOnClickListener(new ah.g0(maVar, i15));
                                    o01Var5.l(y90Var, LocaleController.getString(starsTransaction4.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                                    if (!TextUtils.isEmpty(starsTransaction4.id) && !z19) {
                                        String string3 = LocaleController.getString(R.string.StarsTransactionID);
                                        String str3 = starsTransaction4.id;
                                        o01Var5.k(string3, str3, str3.length() <= 25 ? i15 : 10, new qa(0, h3VarArr4, g6Var3));
                                    }
                                    if (starsTransaction4.floodskip && starsTransaction4.floodskip_number > 0) {
                                        o01Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                                    }
                                    o01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                                    starGift2 = starsTransaction4.stargift;
                                    if (starGift2 != null) {
                                        if (starGift2.limited) {
                                            G0(o01Var5, i14, starGift2, g6Var3);
                                        }
                                        if (!TextUtils.isEmpty(starsTransaction4.description)) {
                                            o01Var5.a(new SpannableStringBuilder(starsTransaction4.description));
                                        }
                                    }
                                    ViewGroup viewGroup3 = viewGroup;
                                    viewGroup3.addView(o01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                                    if ((starsTransaction4.flags & 32) != 0) {
                                        o01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.transaction_date * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
                                    }
                                    if (z14) {
                                        context4 = context;
                                        y90 y90Var2 = new y90(context4, g6Var3);
                                        org.telegram.ui.ActionBar.r6.W(y90Var2, org.telegram.ui.ActionBar.k6.z6, g6Var3);
                                        org.telegram.ui.ActionBar.r6.I(y90Var2, org.telegram.ui.ActionBar.k6.gc, g6Var3);
                                        y90Var2.setTextSize(1, 14.0f);
                                        y90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new sa(context4, 0)));
                                        y90Var2.setGravity(17);
                                        viewGroup3.addView(y90Var2, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                                    } else {
                                        context4 = context;
                                    }
                                    ei.d dVar = new ei.d(context4, g6Var3);
                                    dVar.f();
                                    if ((starsTransaction4.flags & 32) == 0) {
                                        r13 = 0;
                                        dVar.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer), false);
                                    } else {
                                        r13 = 0;
                                        dVar.h(LocaleController.getString(R.string.OK), false);
                                    }
                                    viewGroup3.addView(dVar, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                                    org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
                                    h3Var3.customView = viewGroup3;
                                    h3VarArr4[r13] = h3Var3;
                                    h3Var3.useBackgroundTopPadding = r13;
                                    if ((starsTransaction4.flags & 32) == 0) {
                                        dVar.setOnClickListener(new p(context4, starsTransaction4));
                                    } else {
                                        dVar.setOnClickListener(new ta(h3VarArr4, r13));
                                    }
                                    h3VarArr4[r13].fixNavigationBar();
                                    U = LaunchActivity.U();
                                    if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                        h3VarArr4[r13].makeAttached(U);
                                    }
                                    h3VarArr4[r13].show();
                                    return h3VarArr4[r13];
                                }
                                starsTransaction4 = starsTransaction;
                            }
                            z14 = z15;
                            i15 = 9;
                            if (!TextUtils.isEmpty(starsTransaction4.id)) {
                                String string32 = LocaleController.getString(R.string.StarsTransactionID);
                                String str32 = starsTransaction4.id;
                                o01Var5.k(string32, str32, str32.length() <= 25 ? i15 : 10, new qa(0, h3VarArr4, g6Var3));
                            }
                            if (starsTransaction4.floodskip) {
                                o01Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                            }
                            o01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                            starGift2 = starsTransaction4.stargift;
                            if (starGift2 != null) {
                            }
                            ViewGroup viewGroup32 = viewGroup;
                            viewGroup32.addView(o01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                            if ((starsTransaction4.flags & 32) != 0) {
                            }
                            if (z14) {
                            }
                            ei.d dVar2 = new ei.d(context4, g6Var3);
                            dVar2.f();
                            if ((starsTransaction4.flags & 32) == 0) {
                            }
                            viewGroup32.addView(dVar2, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                            org.telegram.ui.ActionBar.h3 h3Var32 = h3Var;
                            h3Var32.customView = viewGroup32;
                            h3VarArr4[r13] = h3Var32;
                            h3Var32.useBackgroundTopPadding = r13;
                            if ((starsTransaction4.flags & 32) == 0) {
                            }
                            h3VarArr4[r13].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet()) {
                                h3VarArr4[r13].makeAttached(U);
                            }
                            h3VarArr4[r13].show();
                            return h3VarArr4[r13];
                        }
                        org.telegram.ui.ActionBar.h3[] h3VarArr9 = h3VarArr2;
                        i14 = i10;
                        g6Var3 = g6Var;
                        o01Var6 = o01Var10;
                        viewGroup = viewGroup2;
                        h3VarArr4 = h3VarArr9;
                    } else {
                        h3VarArr5 = h3VarArr2;
                        final Context context6 = context2;
                        starsTransaction4 = starsTransaction2;
                        g6Var3 = g6Var2;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            String str4 = starGift.slug;
                            if (!TextUtils.isEmpty(str4)) {
                                o01Var10.i(LocaleController.getString(R.string.Gift2Gift), starsTransaction4.stargift.title + " #" + starsTransaction4.stargift.num, new ah.o(context6, i10, str4, i21));
                            }
                            final long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                            long peerDialogId3 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction4.peer).peer);
                            if (!starsTransaction4.offer) {
                                if (starsTransaction4.stargift_resale) {
                                    if (negative) {
                                        o01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                                    } else {
                                        o01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                        j13 = clientUserId;
                                    }
                                } else if (starsTransaction4.stargift_drop_original_details) {
                                    o01Var10.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                                    peerDialogId3 = clientUserId;
                                    j13 = peerDialogId3;
                                } else {
                                    o01Var10.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                                }
                                j13 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else if (negative) {
                                o01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                                j13 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else {
                                o01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                j13 = clientUserId;
                            }
                            if (peerDialogId3 != clientUserId) {
                                final long j15 = peerDialogId3;
                                final int i26 = 0;
                                o01Var9 = o01Var10;
                                viewGroup = linearLayout;
                                j14 = clientUserId;
                                o01Var9.n(LocaleController.getString(R.string.Gift2From), i10, j15, new Runnable() { // from class: ai.wa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i26) {
                                            case 0:
                                                h3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j16 = j15;
                                                    Bundle e7 = si.o0.e(j16, "user_id");
                                                    if (j16 == clientUserId) {
                                                        e7.putBoolean("my_profile", true);
                                                    }
                                                    e7.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(e7, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                h3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j17 = j15;
                                                    Bundle e10 = si.o0.e(j17, "user_id");
                                                    if (j17 == clientUserId) {
                                                        e10.putBoolean("my_profile", true);
                                                    }
                                                    e10.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(e10, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                o01Var9 = o01Var10;
                                j14 = clientUserId;
                                viewGroup = linearLayout;
                            }
                            if (j13 != j14) {
                                final long j16 = j14;
                                final int i27 = 1;
                                final long j17 = j13;
                                o01Var9.n(LocaleController.getString(R.string.Gift2To), i10, j17, new Runnable() { // from class: ai.wa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i27) {
                                            case 0:
                                                h3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j162 = j17;
                                                    Bundle e7 = si.o0.e(j162, "user_id");
                                                    if (j162 == j16) {
                                                        e7.putBoolean("my_profile", true);
                                                    }
                                                    e7.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(e7, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                h3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j172 = j17;
                                                    Bundle e10 = si.o0.e(j172, "user_id");
                                                    if (j172 == j16) {
                                                        e10.putBoolean("my_profile", true);
                                                    }
                                                    e10.putBoolean("open_gifts", true);
                                                    U3.presentFragment(new ProfileActivity(e10, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            o01 o01Var12 = o01Var9;
                            if ((peerDialogId3 == clientUserId || starsTransaction4.stargift_resale) && (starsAmount = starsTransaction4.starref_amount) != null && starsTransaction4.starref_commission_permille > 0) {
                                TL_stars.StarsAmount starsAmount4 = starsTransaction4.amount;
                                if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                    TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                    tL_starsTonAmount.amount = starsTransaction4.amount.amount + starsTransaction4.starref_amount.amount;
                                    xq[] xqVarArr = new xq[1];
                                    o01Var12.d(X0(starsTransaction4.amount, "⭐️ " + ((Object) J0(tL_starsTonAmount)), xqVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                    xq xqVar = xqVarArr[0];
                                    if (xqVar != null) {
                                        xqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var3));
                                    }
                                } else {
                                    o01Var12.d(Y0(starsTransaction4.amount instanceof TL_stars.TL_starsTonAmount, i2.o1.m(Math.abs(Math.round(starsTransaction4.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                }
                            }
                            i14 = i10;
                            o01Var4 = o01Var12;
                            context3 = context6;
                            h3VarArr4 = h3VarArr5;
                            o01Var3 = o01Var4;
                        } else {
                            viewGroup = linearLayout;
                            if (starsTransaction4.refund) {
                                i14 = i10;
                                o01Var6 = o01Var10;
                                h3VarArr4 = h3VarArr5;
                            } else {
                                long clientUserId2 = j10 == 0 ? UserConfig.getInstance(i10).getClientUserId() : j10;
                                final long peerDialogId4 = DialogObject.getPeerDialogId(starsTransaction4.peer.peer);
                                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId4));
                                if (positive) {
                                    if (peerDialogId4 != clientUserId2) {
                                        CharSequence string4 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                        Runnable maVar2 = new ma(h3VarArr5, starsTransaction4, peerDialogId4, 3);
                                        String string5 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                        final int i28 = 0;
                                        i18 = i10;
                                        Runnable runnable = new Runnable() { // from class: ai.pa
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i28) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.h3 h3Var4 = h3VarArr5[0];
                                                        Objects.requireNonNull(h3Var4);
                                                        new yh.o1(context6, i18, peerDialogId4, null, new r0(h3Var4, 4)).show();
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.h3 h3Var5 = h3VarArr5[0];
                                                        Objects.requireNonNull(h3Var5);
                                                        new yh.o1(context6, i18, peerDialogId4, null, new r0(h3Var5, 4)).show();
                                                        break;
                                                }
                                            }
                                        };
                                        o01 o01Var13 = o01Var10;
                                        h3VarArr6 = h3VarArr5;
                                        o01Var13.m(string4, i18, peerDialogId4, maVar2, string5, runnable);
                                        o01Var8 = o01Var13;
                                    } else {
                                        i18 = i10;
                                        o01Var8 = o01Var10;
                                        h3VarArr6 = h3VarArr5;
                                    }
                                    final int i29 = 1;
                                    o01Var8.n(LocaleController.getString(R.string.StarGiveawayPrizeTo), i18, clientUserId2, new Runnable() { // from class: ai.na
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i29) {
                                                case 0:
                                                    h3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", UserConfig.getInstance(i18).getClientUserId());
                                                        bundle.putBoolean("my_profile", true);
                                                        U2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    h3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
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
                                                    h3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
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
                                    h3VarArr3 = h3VarArr6;
                                    o01Var7 = o01Var8;
                                } else {
                                    long j18 = clientUserId2;
                                    if (peerDialogId4 != j18) {
                                        final int i30 = 2;
                                        o01Var10.n(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, j18, new Runnable() { // from class: ai.na
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i30) {
                                                    case 0:
                                                        h3VarArr5[0].dismiss();
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
                                                        h3VarArr5[0].dismiss();
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
                                                        h3VarArr5[0].dismiss();
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
                                    Runnable maVar3 = new ma(h3VarArr5, starsTransaction, peerDialogId4, 4);
                                    starsTransaction3 = starsTransaction;
                                    String string7 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                    final int i31 = 1;
                                    o01 o01Var14 = o01Var10;
                                    h3VarArr3 = h3VarArr5;
                                    o01Var14.m(string6, i10, peerDialogId4, maVar3, string7, new Runnable() { // from class: ai.pa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i31) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.h3 h3Var4 = h3VarArr5[0];
                                                    Objects.requireNonNull(h3Var4);
                                                    new yh.o1(context, i10, peerDialogId4, null, new r0(h3Var4, 4)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.h3 h3Var5 = h3VarArr5[0];
                                                    Objects.requireNonNull(h3Var5);
                                                    new yh.o1(context, i10, peerDialogId4, null, new r0(h3Var5, 4)).show();
                                                    break;
                                            }
                                        }
                                    });
                                    o01Var7 = o01Var14;
                                }
                                context3 = context;
                                i14 = i10;
                                o01Var2 = o01Var7;
                                h3VarArr4 = h3VarArr3;
                                starsTransaction4 = starsTransaction3;
                                o01Var3 = o01Var2;
                            }
                        }
                    }
                    context3 = context;
                    o01Var5 = o01Var6;
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
                    o01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322 = viewGroup;
                    viewGroup322.addView(o01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    ei.d dVar22 = new ei.d(context4, g6Var3);
                    dVar22.f();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup322.addView(dVar22, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.h3 h3Var322 = h3Var;
                    h3Var322.customView = viewGroup322;
                    h3VarArr4[r13] = h3Var322;
                    h3Var322.useBackgroundTopPadding = r13;
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    h3VarArr4[r13].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    h3VarArr4[r13].show();
                    return h3VarArr4[r13];
                }
                starsTransaction3 = starsTransaction2;
                viewGroup = linearLayout;
                o01 o01Var15 = o01Var10;
                h3VarArr3 = h3VarArr2;
                g6Var3 = g6Var2;
                TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction3.peer;
                if (!(starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer)) {
                    context3 = context;
                    i14 = i10;
                    h3VarArr4 = h3VarArr3;
                    starsTransaction4 = starsTransaction3;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                        if (starsTransaction4.gift) {
                            y90 y90Var3 = new y90(context3, g6Var3);
                            y90Var3.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                            y90Var3.setEllipsize(TextUtils.TruncateAt.END);
                            int i32 = org.telegram.ui.ActionBar.k6.gc;
                            org.telegram.ui.ActionBar.r6.W(y90Var3, i32, g6Var3);
                            org.telegram.ui.ActionBar.r6.I(y90Var3, i32, g6Var3);
                            y90Var3.setTextSize(1, 14.0f);
                            y90Var3.setSingleLine(true);
                            y90Var3.setDisablePaddingsOffsetY(true);
                            org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(y90Var3, 24.0f, i14);
                            String string8 = LocaleController.getString(z15 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                            yq a2 = id.a(24, "fragment");
                            int dp = AndroidUtilities.dp(f7);
                            int dp2 = AndroidUtilities.dp(f7);
                            a2.e = dp;
                            a2.f = dp2;
                            k5Var.b.setImageBitmap(a2);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x  " + ((Object) string8));
                            spannableStringBuilder3.setSpan(k5Var, 0, 1, 33);
                            spannableStringBuilder3.setSpan(new cc(h3VarArr4, context3, z15), 3, spannableStringBuilder3.length(), 33);
                            y90Var3.setText(spannableStringBuilder3);
                            o01Var15.l(y90Var3, LocaleController.getString(R.string.StarsTransactionRecipient));
                            o01Var5 = o01Var15;
                        } else {
                            o01Var15.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                            o01Var5 = o01Var15;
                        }
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                        o01Var15.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                        o01Var5 = o01Var15;
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                        o01Var15.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                        o01Var5 = o01Var15;
                    } else {
                        o01Var5 = o01Var15;
                        if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            o01Var15.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                            o01Var5 = o01Var15;
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
                    o01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup3222 = viewGroup;
                    viewGroup3222.addView(o01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    ei.d dVar222 = new ei.d(context4, g6Var3);
                    dVar222.f();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup3222.addView(dVar222, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.h3 h3Var3222 = h3Var;
                    h3Var3222.customView = viewGroup3222;
                    h3VarArr4[r13] = h3Var3222;
                    h3Var3222.useBackgroundTopPadding = r13;
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    h3VarArr4[r13].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    h3VarArr4[r13].show();
                    return h3VarArr4[r13];
                }
                final long peerDialogId5 = DialogObject.getPeerDialogId(starsTransactionPeer3.peer);
                if (starsTransaction3.paid_message) {
                    o01Var15.n(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i10, peerDialogId5, new la(h3VarArr3, peerDialogId5, 3));
                    if (starsTransaction3.starref_amount != null && starsTransaction3.starref_commission_permille > 0) {
                        o01Var15.d(Y0(starsTransaction3.amount instanceof TL_stars.TL_starsTonAmount, i2.o1.m(Math.abs(Math.round(starsTransaction3.starref_amount.toDouble() + starsTransaction3.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                    }
                    context3 = context;
                    i14 = i10;
                    o01Var2 = o01Var15;
                } else if (z11) {
                    long peerDialogId6 = DialogObject.getPeerDialogId(starsTransaction3.starref_peer);
                    o01Var15.i(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new la(h3VarArr3, j10, i21));
                    o01Var15.n(LocaleController.getString(R.string.StarAffiliate), i10, peerDialogId6, new la(h3VarArr3, peerDialogId6, 5));
                    i14 = i10;
                    o01Var15.n(LocaleController.getString(R.string.StarAffiliateReferredUser), i14, peerDialogId5, new la(h3VarArr3, peerDialogId5, 6));
                    o01Var15.d(gi.l.H0(starsTransaction3.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                    context3 = context;
                    o01Var2 = o01Var15;
                } else if (z12) {
                    o01Var15.i(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new ja(i10, context, j10, peerDialogId5, h3VarArr3, g6Var3));
                    i14 = i10;
                    o01 o01Var16 = o01Var15;
                    o01Var16.n(LocaleController.getString(R.string.StarAffiliateMiniApp), i14, peerDialogId5, new la(h3VarArr3, peerDialogId5, 0));
                    context3 = context;
                    o01Var2 = o01Var16;
                } else {
                    if (z19) {
                        o01Var15.n(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, peerDialogId5, new ma(h3VarArr3, starsTransaction3, peerDialogId5, 0));
                        final int i33 = 0;
                        o01Var15.n(LocaleController.getString(R.string.StarGiveawayPrizeTo), i10, UserConfig.getInstance(i10).getClientUserId(), new Runnable() { // from class: ai.na
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i33) {
                                    case 0:
                                        h3VarArr3[0].dismiss();
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
                                        h3VarArr3[0].dismiss();
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
                                        h3VarArr3[0].dismiss();
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
                        String string9 = LocaleController.getString(R.string.StarGiveawayReason);
                        CharSequence string10 = LocaleController.getString(R.string.StarGiveawayReasonLink);
                        Runnable maVar4 = new ma(h3VarArr3, starsTransaction, peerDialogId5, 1);
                        starsTransaction4 = starsTransaction;
                        o01Var15.i(string9, string10, maVar4);
                        o01Var15.d(M0(starsTransaction4.amount), LocaleController.getString(R.string.StarGiveawayGift));
                        i14 = i10;
                        h3VarArr4 = h3VarArr3;
                        o01Var = o01Var15;
                    } else {
                        starsTransaction4 = starsTransaction3;
                        if (!starsTransaction4.subscription || z10) {
                            if (starsTransaction4.premium_gift) {
                                final int i34 = 1;
                                o01Var15.n(LocaleController.getString(R.string.Gift2To), i10, peerDialogId5, new Runnable() { // from class: ai.oa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i34) {
                                            case 0:
                                                h3VarArr3[0].dismiss();
                                                long j19 = peerDialogId5;
                                                if (!UserObject.isService(j19)) {
                                                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(sn.W9(j19));
                                                        break;
                                                    }
                                                } else {
                                                    pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                h3VarArr3[0].dismiss();
                                                long j20 = peerDialogId5;
                                                if (!UserObject.isService(j20)) {
                                                    org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(sn.W9(j20));
                                                        break;
                                                    }
                                                } else {
                                                    pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                h3VarArr3[0].dismiss();
                                                long j21 = peerDialogId5;
                                                if (!UserObject.isService(j21)) {
                                                    org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(sn.W9(j21));
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
                                o01Var15.d(LocaleController.formatPluralStringComma("Months", starsTransaction4.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                            } else if (!starsTransaction4.posts_search) {
                                final int i35 = 2;
                                h3VarArr4 = h3VarArr3;
                                o01 o01Var17 = o01Var15;
                                context3 = context;
                                i14 = i10;
                                o01Var17.n(LocaleController.getString(R.string.StarsTransactionRecipient), i14, peerDialogId5, new Runnable() { // from class: ai.oa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i35) {
                                            case 0:
                                                h3VarArr3[0].dismiss();
                                                long j19 = peerDialogId5;
                                                if (!UserObject.isService(j19)) {
                                                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(sn.W9(j19));
                                                        break;
                                                    }
                                                } else {
                                                    pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                h3VarArr3[0].dismiss();
                                                long j20 = peerDialogId5;
                                                if (!UserObject.isService(j20)) {
                                                    org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(sn.W9(j20));
                                                        break;
                                                    }
                                                } else {
                                                    pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                h3VarArr3[0].dismiss();
                                                long j21 = peerDialogId5;
                                                if (!UserObject.isService(j21)) {
                                                    org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(sn.W9(j21));
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
                                o01Var3 = o01Var17;
                            }
                            i14 = i10;
                            o01Var = o01Var15;
                            h3VarArr4 = h3VarArr3;
                        } else {
                            final int i36 = 0;
                            h3VarArr5 = h3VarArr3;
                            o01 o01Var18 = o01Var15;
                            i14 = i10;
                            o01Var18.n(LocaleController.getString(R.string.StarSubscriptionTo), i14, peerDialogId5, new Runnable() { // from class: ai.oa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i36) {
                                        case 0:
                                            h3VarArr3[0].dismiss();
                                            long j19 = peerDialogId5;
                                            if (!UserObject.isService(j19)) {
                                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    U2.presentFragment(sn.W9(j19));
                                                    break;
                                                }
                                            } else {
                                                pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            h3VarArr3[0].dismiss();
                                            long j20 = peerDialogId5;
                                            if (!UserObject.isService(j20)) {
                                                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    U3.presentFragment(sn.W9(j20));
                                                    break;
                                                }
                                            } else {
                                                pf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                        default:
                                            h3VarArr3[0].dismiss();
                                            long j21 = peerDialogId5;
                                            if (!UserObject.isService(j21)) {
                                                org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                                                if (U4 != null) {
                                                    U4.presentFragment(sn.W9(j21));
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
                            o01Var4 = o01Var18;
                            h3VarArr4 = h3VarArr5;
                            o01Var3 = o01Var4;
                        }
                    }
                    context3 = context;
                    o01Var3 = o01Var;
                }
                h3VarArr4 = h3VarArr3;
                starsTransaction4 = starsTransaction3;
                o01Var3 = o01Var2;
                o01Var5 = o01Var3;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                i15 = 9;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                o01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup32222 = viewGroup;
                viewGroup32222.addView(o01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                ei.d dVar2222 = new ei.d(context4, g6Var3);
                dVar2222.f();
                if ((starsTransaction4.flags & 32) == 0) {
                }
                viewGroup32222.addView(dVar2222, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.h3 h3Var32222 = h3Var;
                h3Var32222.customView = viewGroup32222;
                h3VarArr4[r13] = h3Var32222;
                h3Var32222.useBackgroundTopPadding = r13;
                if ((starsTransaction4.flags & 32) == 0) {
                }
                h3VarArr4[r13].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                h3VarArr4[r13].show();
                return h3VarArr4[r13];
            }
        }
        h3Var = h3Var2;
        h3VarArr = h3VarArr7;
        z11 = z17;
        final org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
        if (starsTransaction.premium_gift) {
            d1(w9Var2, w9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            e.addView(w9Var2, w7.z5.t(160, 160, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            yq a10 = org.telegram.ui.Cells.v6.a(100, "search");
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
                    g6Var2 = g6Var;
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
                    g6Var2 = g6Var;
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
                        yq a11 = org.telegram.ui.Cells.v6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
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
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ai.ka
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                                long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i37 = 0; i37 < starsTransaction5.extended_media.size(); i37++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i37);
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
                                PhotoViewer.u1().M2(null, LaunchActivity.R(), g6Var);
                                PhotoViewer.u1().d2(arrayList3, 0, peerDialogId7, 0L, 0L, new qc(w9Var2, e, peerDialogId7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        g6Var2 = g6Var;
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
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: ai.ka
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z10;
                            TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                            long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i37 = 0; i37 < starsTransaction5.extended_media.size(); i37++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i37);
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
                            PhotoViewer.u1().M2(null, LaunchActivity.R(), g6Var);
                            PhotoViewer.u1().d2(arrayList3, 0, peerDialogId7, 0L, 0L, new qc(w9Var2, e, peerDialogId7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    g6Var2 = g6Var;
                    i11 = i10;
                    linearLayout = e;
                    j11 = j10;
                    w9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z18;
                }
                TextView textView = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.messenger.v0.q(textView, i12, g6Var2, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(O0(i11, z13, starsTransaction2));
                TextView f10 = sl.f(linearLayout, textView, w7.z5.t(-1, -2, 17, 36, 0, 36, 4), context2);
                f10.setTextSize(1, 18.0f);
                f10.setTypeface(AndroidUtilities.bold());
                f10.setGravity(17);
                org.telegram.ui.ActionBar.r6.W(f10, !positive ? org.telegram.ui.ActionBar.k6.uj : org.telegram.ui.ActionBar.k6.wj, g6Var2);
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                f10.setText(Y0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, J0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(f10.getText());
                if (!starsTransaction2.refund) {
                    H0(spannableStringBuilder4, f10, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    org.telegram.ui.ActionBar.r6.W(f10, org.telegram.ui.ActionBar.k6.wj, g6Var2);
                    H0(spannableStringBuilder4, f10, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    org.telegram.ui.ActionBar.r6.W(f10, org.telegram.ui.ActionBar.k6.yj, g6Var2);
                    H0(spannableStringBuilder4, f10, LocaleController.getString(R.string.StarsPending));
                }
                f10.setText(spannableStringBuilder4);
                linearLayout.addView(f10, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    y90 y90Var4 = new y90(context2);
                    org.telegram.ui.ActionBar.r6.W(y90Var4, i12, g6Var2);
                    y90Var4.setTextSize(1, 14.0f);
                    y90Var4.setGravity(17);
                    org.telegram.ui.ActionBar.r6.I(y90Var4, org.telegram.ui.ActionBar.k6.gc, g6Var2);
                    y90Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, gi.l.H0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j11 == UserConfig.getInstance(i11).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), 2)) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new ra(j11, i11, 0)), true));
                    }
                    y90Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(y90Var4, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                    h3VarArr2 = h3VarArr;
                    f7 = 16.0f;
                    o01 o01Var102 = new o01(context2, g6Var2);
                    starGift = starsTransaction2.stargift;
                    int i212 = 4;
                    if (starGift == null) {
                    }
                    o01Var5 = o01Var3;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    i15 = 9;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    o01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322222 = viewGroup;
                    viewGroup322222.addView(o01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    ei.d dVar22222 = new ei.d(context4, g6Var3);
                    dVar22222.f();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup322222.addView(dVar22222, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.h3 h3Var322222 = h3Var;
                    h3Var322222.customView = viewGroup322222;
                    h3VarArr4[r13] = h3Var322222;
                    h3Var322222.useBackgroundTopPadding = r13;
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    h3VarArr4[r13].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    h3VarArr4[r13].show();
                    return h3VarArr4[r13];
                }
                if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z19 || starsTransaction2.gift)) {
                    TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                    TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                    boolean isUserSelf = UserObject.isUserSelf(user3);
                    if (isUserSelf) {
                        org.telegram.ui.ActionBar.r6.W(f10, org.telegram.ui.ActionBar.k6.G6, g6Var2);
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i13 = 1;
                        f10.setText(Y0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(J0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i13 = 1;
                    }
                    y90 y90Var5 = new y90(context2);
                    org.telegram.ui.ActionBar.r6.W(y90Var5, i12, g6Var2);
                    f7 = 16.0f;
                    y90Var5.setTextSize(i13, 16.0f);
                    y90Var5.setGravity(17);
                    org.telegram.ui.ActionBar.r6.I(y90Var5, org.telegram.ui.ActionBar.k6.gc, g6Var2);
                    y90Var5.setDisablePaddingsOffsetY(i13);
                    if (isUserSelf) {
                        int i37 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i13];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i37, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    h3VarArr2 = h3VarArr;
                    y90Var5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new ua(context2, h3VarArr2)), true)));
                    linearLayout.addView(y90Var5, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    h3VarArr2 = h3VarArr;
                    f7 = 16.0f;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        org.telegram.ui.ActionBar.r6.W(textView2, i12, g6Var2);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                o01 o01Var1022 = new o01(context2, g6Var2);
                starGift = starsTransaction2.stargift;
                int i2122 = 4;
                if (starGift == null) {
                }
                o01Var5 = o01Var3;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                i15 = 9;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                o01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup3222222 = viewGroup;
                viewGroup3222222.addView(o01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                ei.d dVar222222 = new ei.d(context4, g6Var3);
                dVar222222.f();
                if ((starsTransaction4.flags & 32) == 0) {
                }
                viewGroup3222222.addView(dVar222222, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.h3 h3Var3222222 = h3Var;
                h3Var3222222.customView = viewGroup3222222;
                h3VarArr4[r13] = h3Var3222222;
                h3Var3222222.useBackgroundTopPadding = r13;
                if ((starsTransaction4.flags & 32) == 0) {
                }
                h3VarArr4[r13].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                h3VarArr4[r13].show();
                return h3VarArr4[r13];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                w9Var2.setImageDrawable(new v6(w9Var2, starsTransaction.stargift, 94, 0.44f));
                e.addView(w9Var2, w7.z5.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                b1(w9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                e.addView(w9Var2, w7.z5.t(160, 160, 17, 0, -8, 0, 10));
            }
        }
        g6Var2 = g6Var;
        context2 = context;
        i11 = i10;
        starsTransaction2 = starsTransaction;
        linearLayout = e;
        str = "";
        z12 = z18;
        z13 = z10;
        j11 = j10;
        TextView textView3 = new TextView(context2);
        i12 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.messenger.v0.q(textView3, i12, g6Var2, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(O0(i11, z13, starsTransaction2));
        TextView f102 = sl.f(linearLayout, textView3, w7.z5.t(-1, -2, 17, 36, 0, 36, 4), context2);
        f102.setTextSize(1, 18.0f);
        f102.setTypeface(AndroidUtilities.bold());
        f102.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(f102, !positive ? org.telegram.ui.ActionBar.k6.uj : org.telegram.ui.ActionBar.k6.wj, g6Var2);
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        f102.setText(Y0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, J0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(f102.getText());
        if (!starsTransaction2.refund) {
        }
        f102.setText(spannableStringBuilder42);
        linearLayout.addView(f102, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        h3VarArr2 = h3VarArr;
        f7 = 16.0f;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            org.telegram.ui.ActionBar.r6.W(textView22, i12, g6Var2);
            textView22.setTextSize(1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, w7.z5.t(-1, -2, 17, 36, 0, 36, 4));
        }
        o01 o01Var10222 = new o01(context2, g6Var2);
        starGift = starsTransaction2.stargift;
        int i21222 = 4;
        if (starGift == null) {
        }
        o01Var5 = o01Var3;
        starsTransactionPeer = starsTransaction4.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z14 = z15;
        i15 = 9;
        if (!TextUtils.isEmpty(starsTransaction4.id)) {
        }
        if (starsTransaction4.floodskip) {
        }
        o01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        starGift2 = starsTransaction4.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup32222222 = viewGroup;
        viewGroup32222222.addView(o01Var5, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction4.flags & 32) != 0) {
        }
        if (z14) {
        }
        ei.d dVar2222222 = new ei.d(context4, g6Var3);
        dVar2222222.f();
        if ((starsTransaction4.flags & 32) == 0) {
        }
        viewGroup32222222.addView(dVar2222222, w7.z5.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.h3 h3Var32222222 = h3Var;
        h3Var32222222.customView = viewGroup32222222;
        h3VarArr4[r13] = h3Var32222222;
        h3Var32222222.useBackgroundTopPadding = r13;
        if ((starsTransaction4.flags & 32) == 0) {
        }
        h3VarArr4[r13].fixNavigationBar();
        U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet()) {
        }
        h3VarArr4[r13].show();
        return h3VarArr4[r13];
    }

    public static void j1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.g6 g6Var) {
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
        i1(activity, false, 0L, i10, starsTransaction, g6Var);
    }

    public static void k1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.g6 g6Var) {
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
        i1(context, false, 0L, i10, starsTransaction, g6Var);
    }

    public static CharSequence n1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        x4.o c10;
        if (z10 && com.google.android.gms.internal.play_billing.k3.s(spannableStringBuilder)) {
            for (xq xqVar : (xq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), xq.class)) {
                Drawable drawable = xqVar.drawable;
                if (drawable != null && !(drawable instanceof x4.o) && (c10 = x4.o.c(ApplicationLoader.applicationContext.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c10.setBounds(xqVar.drawable.getBounds());
                    xqVar.drawable = c10;
                    xqVar.recolorDrawable = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04ef  */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void y0(nd ndVar, int i10) {
        m61 G;
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
        o01 o01Var;
        long j11;
        TLRPC.Chat chat3;
        boolean z12;
        String str3;
        boolean z13;
        long currentTime;
        ec ecVar;
        final org.telegram.ui.ActionBar.h3[] h3VarArr;
        final int i13;
        ?? r52;
        org.telegram.ui.ActionBar.o2 U;
        mc mcVar = ndVar.i0;
        if (mcVar == null || (G = mcVar.G(i10)) == null) {
            return;
        }
        int i14 = G.d;
        int i15 = 1;
        if (i14 == -1) {
            ndVar.i0.N(true);
            return;
        }
        if (i14 == -2) {
            ha.y(ndVar.currentAccount, false).u();
            ug.l1.e0(1, BirthdayController.getInstance(ndVar.currentAccount).getState());
            return;
        }
        if (i14 == -3) {
            ha.y(ndVar.currentAccount, false).W();
            ndVar.i0.N(true);
            return;
        }
        if (i14 == -4) {
            if (MessagesController.getInstance(ndVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(ndVar.currentAccount);
                return;
            } else {
                ndVar.presentFragment(new gi.u3(ndVar.getUserConfig().getClientUserId()));
                return;
            }
        }
        if (G.G(yc.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                ha.y(ndVar.currentAccount, false).f(ndVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new r5(i15, ndVar, G), null);
                return;
            }
            return;
        }
        if (G.G(fd.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = ndVar.getParentActivity();
            int i16 = ndVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.g6 resourceProvider = ndVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) parentActivity, resourceProvider, false);
            h3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.h3[] h3VarArr2 = new org.telegram.ui.ActionBar.h3[1];
            LinearLayout f7 = org.telegram.messenger.v0.f(parentActivity, 1);
            f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            f7.addView(frameLayout, w7.z5.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr3 = new boolean[1];
            ec ecVar2 = new ec(zArr3, h3VarArr2);
            NotificationCenter.getInstance(i16).addObserver(ecVar2, NotificationCenter.starSubscriptionsLoaded);
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
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
                if (i11 < 0) {
                    chat2 = chat5;
                    str2 = str;
                    TLRPC.Chat chat6 = MessagesController.getInstance(i16).getChat(Long.valueOf(-peerDialogId));
                    h9Var.q(chat6);
                    w9Var.e(chat6, h9Var);
                    frameLayout.addView(w9Var, w7.z5.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    org.telegram.ui.ActionBar.r6.z(frameLayout, drawable, org.telegram.ui.ActionBar.k6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
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
                    org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.j5, resourceProvider, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                    }
                    f7.addView(textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.B6, resourceProvider);
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i12 = tL_starsSubscriptionPricing.period;
                    if (i12 != 2592000) {
                        j10 = peerDialogId;
                        textView2.setText(Y0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f, null));
                    } else {
                        j10 = peerDialogId;
                        textView2.setText(Y0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), i12 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    f7.addView(textView2, w7.z5.t(-1, -2, 17, 20, 0, 20, 4));
                    o01Var = new o01(parentActivity, resourceProvider);
                    y90 y90Var = new y90(parentActivity, resourceProvider);
                    y90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                    y90Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i18 = org.telegram.ui.ActionBar.k6.gc;
                    org.telegram.ui.ActionBar.r6.W(y90Var, i18, resourceProvider);
                    org.telegram.ui.ActionBar.r6.I(y90Var, i18, resourceProvider);
                    y90Var.setTextSize(1, 14.0f);
                    y90Var.setSingleLine(true);
                    y90Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(y90Var, 24.0f, i16);
                    if (i11 < 0) {
                        TLRPC.User user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(j10));
                        boolean z14 = user2 == null || UserObject.isDeleted(user2);
                        String userName2 = UserObject.getUserName(user2);
                        k5Var.e(user2);
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
                        k5Var.b(chat7);
                        str3 = str4;
                    }
                    z13 = z12;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
                    spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
                    spannableStringBuilder.setSpan(new fc(h3VarArr2, j11), 3, spannableStringBuilder.length(), 33);
                    y90Var.setText(spannableStringBuilder);
                    if (!z13) {
                        o01Var.l(y90Var, LocaleController.getString(i11 < 0 ? R.string.StarsSubscriptionChannel : z10 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot));
                    }
                    if (i11 >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                        o01Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
                    }
                    o01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
                    o01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    f7.addView(o01Var, w7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    y90 y90Var2 = new y90(parentActivity, resourceProvider);
                    int i19 = org.telegram.ui.ActionBar.k6.z6;
                    org.telegram.ui.ActionBar.r6.W(y90Var2, i19, resourceProvider);
                    org.telegram.ui.ActionBar.r6.I(y90Var2, i18, resourceProvider);
                    y90Var2.setTextSize(1, 14.0f);
                    final int i20 = 0;
                    y90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: ai.mb
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
                    y90Var2.setGravity(17);
                    f7.addView(y90Var2, w7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        ecVar = ecVar2;
                        h3VarArr = h3VarArr2;
                        i13 = i16;
                        y90 y90Var3 = new y90(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.r6.W(y90Var3, i19, resourceProvider);
                        org.telegram.ui.ActionBar.r6.I(y90Var3, i18, resourceProvider);
                        y90Var3.setTextSize(1, 14.0f);
                        y90Var3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        y90Var3.setSingleLine(false);
                        y90Var3.setMaxLines(4);
                        y90Var3.setGravity(17);
                        f7.addView(y90Var3, w7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            ei.d dVar = new ei.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r52 = 0;
                            dVar.i(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                            f7.addView(dVar, w7.z5.n(-1, 48));
                            dVar.setOnClickListener(new qb(dVar, starsSubscription, i13, h3VarArr, resourceProvider, zArr2, parentActivity));
                            h3Var.customView = f7;
                            h3VarArr[r52] = h3Var;
                            h3Var.useBackgroundTopPadding = r52;
                            h3Var.setOnDismissListener(new rb(i13, ecVar));
                            h3VarArr[r52].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                h3VarArr[r52].makeAttached(U);
                            }
                            h3VarArr[r52].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        y90 y90Var4 = new y90(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.r6.W(y90Var4, i19, resourceProvider);
                        org.telegram.ui.ActionBar.r6.I(y90Var4, i18, resourceProvider);
                        y90Var4.setTextSize(1, 14.0f);
                        y90Var4.setText(LocaleController.formatString(z11 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        y90Var4.setSingleLine(false);
                        y90Var4.setMaxLines(4);
                        y90Var4.setGravity(17);
                        f7.addView(y90Var4, w7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        ei.d dVar2 = new ei.d(parentActivity, resourceProvider, true);
                        dVar2.i(LocaleController.getString(z11 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false, true);
                        f7.addView(dVar2, w7.z5.n(-1, 48));
                        ecVar = ecVar2;
                        h3VarArr = h3VarArr2;
                        nb nbVar = new nb(dVar2, i16, starsSubscription, h3VarArr, j11, parentActivity, resourceProvider, z10, str2);
                        i13 = i16;
                        dVar2.setOnClickListener(nbVar);
                    } else {
                        ecVar = ecVar2;
                        h3VarArr = h3VarArr2;
                        final boolean z15 = z10;
                        i13 = i16;
                        if (starsSubscription.bot_canceled) {
                            y90 y90Var5 = new y90(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.r6.W(y90Var5, org.telegram.ui.ActionBar.k6.wj, resourceProvider);
                            org.telegram.ui.ActionBar.r6.I(y90Var5, i18, resourceProvider);
                            y90Var5.setTextSize(1, 14.0f);
                            y90Var5.setText(LocaleController.getString(z15 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                            y90Var5.setSingleLine(false);
                            y90Var5.setMaxLines(4);
                            y90Var5.setGravity(17);
                            f7.addView(y90Var5, w7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            y90 y90Var6 = new y90(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.r6.W(y90Var6, org.telegram.ui.ActionBar.k6.wj, resourceProvider);
                            org.telegram.ui.ActionBar.r6.I(y90Var6, i18, resourceProvider);
                            y90Var6.setTextSize(1, 14.0f);
                            y90Var6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                            y90Var6.setSingleLine(false);
                            y90Var6.setMaxLines(4);
                            y90Var6.setGravity(17);
                            f7.addView(y90Var6, w7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                ei.d dVar3 = new ei.d(parentActivity, resourceProvider, true);
                                dVar3.i(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                                f7.addView(dVar3, w7.z5.n(-1, 48));
                                dVar3.setOnClickListener(new ob(dVar3, starsSubscription, i13, h3VarArr, chat3, str2));
                            }
                        } else {
                            final TLRPC.Chat chat8 = chat3;
                            y90 y90Var7 = new y90(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.r6.W(y90Var7, i19, resourceProvider);
                            org.telegram.ui.ActionBar.r6.I(y90Var7, i18, resourceProvider);
                            y90Var7.setTextSize(1, 14.0f);
                            y90Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                            y90Var7.setSingleLine(false);
                            y90Var7.setMaxLines(4);
                            y90Var7.setGravity(17);
                            f7.addView(y90Var7, w7.z5.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final ei.d dVar4 = new ei.d(parentActivity, resourceProvider, false);
                            dVar4.i(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                            dVar4.setTextColorKey(org.telegram.ui.ActionBar.k6.wj);
                            f7.addView(dVar4, w7.z5.n(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: ai.pb
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final ei.d dVar5 = dVar4;
                                    if (dVar5.Q) {
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
                                    final org.telegram.ui.ActionBar.h3[] h3VarArr3 = h3VarArr;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: ai.ub
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            AndroidUtilities.runOnUIThread(new xb(i21, dVar5, tLObject, starsSubscription2, z16, z17, h3VarArr3));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r52 = 0;
                    h3Var.customView = f7;
                    h3VarArr[r52] = h3Var;
                    h3Var.useBackgroundTopPadding = r52;
                    h3Var.setOnDismissListener(new rb(i13, ecVar));
                    h3VarArr[r52].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        h3VarArr[r52].makeAttached(U);
                    }
                    h3VarArr[r52].show();
                }
                TLRPC.User user3 = MessagesController.getInstance(i16).getUser(Long.valueOf(peerDialogId));
                h9Var.r(user3);
                w9Var.e(user3, h9Var);
            }
            chat2 = chat5;
            str2 = str;
            frameLayout.addView(w9Var, w7.z5.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.r6.z(frameLayout, drawable3, org.telegram.ui.ActionBar.k6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.messenger.v0.q(textView3, org.telegram.ui.ActionBar.k6.j5, resourceProvider, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            f7.addView(textView3, w7.z5.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            org.telegram.ui.ActionBar.r6.W(textView22, org.telegram.ui.ActionBar.k6.B6, resourceProvider);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i12 = tL_starsSubscriptionPricing2.period;
            if (i12 != 2592000) {
            }
            f7.addView(textView22, w7.z5.t(-1, -2, 17, 20, 0, 20, 4));
            o01Var = new o01(parentActivity, resourceProvider);
            y90 y90Var8 = new y90(parentActivity, resourceProvider);
            y90Var8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            y90Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i182 = org.telegram.ui.ActionBar.k6.gc;
            org.telegram.ui.ActionBar.r6.W(y90Var8, i182, resourceProvider);
            org.telegram.ui.ActionBar.r6.I(y90Var8, i182, resourceProvider);
            y90Var8.setTextSize(1, 14.0f);
            y90Var8.setSingleLine(true);
            y90Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.k5 k5Var2 = new org.telegram.ui.k5(y90Var8, 24.0f, i16);
            if (i11 < 0) {
            }
            z13 = z12;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str3));
            spannableStringBuilder2.setSpan(k5Var2, 0, 1, 33);
            spannableStringBuilder2.setSpan(new fc(h3VarArr2, j11), 3, spannableStringBuilder2.length(), 33);
            y90Var8.setText(spannableStringBuilder2);
            if (!z13) {
            }
            if (i11 >= 0) {
                o01Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
            }
            o01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
            o01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
            f7.addView(o01Var, w7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            y90 y90Var22 = new y90(parentActivity, resourceProvider);
            int i192 = org.telegram.ui.ActionBar.k6.z6;
            org.telegram.ui.ActionBar.r6.W(y90Var22, i192, resourceProvider);
            org.telegram.ui.ActionBar.r6.I(y90Var22, i182, resourceProvider);
            y90Var22.setTextSize(1, 14.0f);
            final int i202 = 0;
            y90Var22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: ai.mb
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
            y90Var22.setGravity(17);
            f7.addView(y90Var22, w7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r52 = 0;
            h3Var.customView = f7;
            h3VarArr[r52] = h3Var;
            h3Var.useBackgroundTopPadding = r52;
            h3Var.setOnDismissListener(new rb(i13, ecVar));
            h3VarArr[r52].fixNavigationBar();
            U = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
            }
            h3VarArr[r52].show();
        }
    }

    public final void I0(ArrayList arrayList, b71 b71Var) {
        if (getParentActivity() == null) {
            return;
        }
        ha y3 = ha.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        jc jcVar = (jc) super.r0(getParentActivity());
        m61 m61Var = new m61(-2);
        m61Var.c = jcVar;
        arrayList.add(m61Var);
        arrayList.add(m61.k(this.W));
        ei.d dVar = this.f0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(m61.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(gi.h.a(-4, getThemedColor(org.telegram.ui.ActionBar.k6.uj), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(m61.B(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            i2.o1.q(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = fd.a;
                m61 J = m61.J(fd.class);
                J.G = starsSubscription;
                arrayList.add(J);
            }
            if (y3.x) {
                arrayList.add(m61.o(arrayList.size(), 33));
            } else if (!y3.y) {
                m61 c10 = m61.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(m61.B(null));
        }
        boolean O = y3.O(0);
        this.g0 = O;
        if (O) {
            arrayList.add(m61.p(this.T, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
        } else {
            arrayList.add(m61.l(this.U));
        }
    }

    @Override // org.telegram.ui.b20, org.telegram.ui.ActionBar.o2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.T = new md(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.U = new jc(this, context, 0);
        super.createView(context);
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        tg.n nVar = new tg.n(context, 1, 2);
        this.S = nVar;
        tg.g gVar = nVar.b;
        gVar.z = org.telegram.ui.ActionBar.k6.fk;
        gVar.A = org.telegram.ui.ActionBar.k6.gk;
        gVar.b();
        this.S.setStarParticlesView(this.e);
        this.R.addView(this.S, w7.z5.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new sa(context, 1)), true), this.R, null);
        this.c.setOverScrollMode(2);
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.c.setItemAnimator(kVar);
        this.c.setOnItemClickListener(new xa(this, 0));
        z00 z00Var = new z00(getParentActivity());
        this.V = z00Var;
        this.s.addView(z00Var, w7.z5.c(-1.0f, -1));
        ha y3 = ha.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.W = linearLayout;
        linearLayout.setOrientation(1);
        this.W.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getParentActivity(), false, true, false);
        this.Y = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        this.Y.setTextSize(AndroidUtilities.dp(32.0f));
        this.Y.setGravity(17);
        org.telegram.ui.ActionBar.r6.a0(this.Y, org.telegram.ui.ActionBar.k6.G6, this.resourceProvider);
        this.X = new SpannableStringBuilder("S");
        h70 h70Var = new h70(this.Y, 42.0f, this.currentAccount);
        yj0 yj0Var = new yj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = h70Var.b;
        imageReceiver.setImageBitmap(yj0Var);
        imageReceiver.setAutoRepeat(2);
        h70Var.f = false;
        h70Var.h = -AndroidUtilities.dp(3.0f);
        this.X.setSpan(h70Var, 0, 1, 33);
        this.W.addView(this.Y, w7.z5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.Z = textView;
        textView.setTextSize(1, 14.0f);
        this.Z.setGravity(17);
        this.Z.setText(LocaleController.getString(R.string.YourStarsBalance));
        org.telegram.ui.ActionBar.r6.W(this.Z, org.telegram.ui.ActionBar.k6.z6, this.resourceProvider);
        this.W.addView(this.Z, w7.z5.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        ah.x xVar = new ah.x(this, getParentActivity(), 2);
        this.b0 = xVar;
        frameLayout2.addView(xVar);
        ei.d dVar = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.c0 = dVar;
        dVar.f();
        this.c0.i("", false, true);
        final int i10 = 0;
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: ai.ya
            public final /* synthetic */ nd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        nd.C0(this.b, context);
                        break;
                    default:
                        new ed(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.b0.addView(this.c0, w7.z5.e(-1, 48, 119));
        va1 va1Var = new va1(this, getParentActivity(), 2);
        this.d0 = va1Var;
        frameLayout2.addView(va1Var);
        ei.d dVar2 = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.e0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new xq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.e0.i(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: ai.ya
            public final /* synthetic */ nd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        nd.C0(this.b, context);
                        break;
                    default:
                        new ed(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.d0.addView(this.e0, w7.z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ei.d dVar3 = new ei.d(getParentActivity(), this.resourceProvider, true);
        this.a0 = dVar3;
        dVar3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new xq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.a0.i(spannableStringBuilder2, false, true);
        final int i12 = 0;
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: ai.za
            public final /* synthetic */ nd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        nd ndVar = this.b;
                        ndVar.presentFragment(new x(0, ndVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        nd.B0(this.b);
                        break;
                }
            }
        });
        this.d0.addView(this.a0, w7.z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.W.addView(frameLayout2, w7.z5.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        ei.d dVar4 = new ei.d(getParentActivity(), this.resourceProvider, false);
        this.f0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new xq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.f0.i(spannableStringBuilder3, false, true);
        final int i13 = 1;
        this.f0.setOnClickListener(new View.OnClickListener(this) { // from class: ai.za
            public final /* synthetic */ nd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        nd ndVar = this.b;
                        ndVar.presentFragment(new x(0, ndVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        nd.B0(this.b);
                        break;
                }
            }
        });
        this.W.addView(this.f0, w7.z5.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        l1();
        mc mcVar = this.i0;
        if (mcVar != null) {
            mcVar.N(false);
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
            mc mcVar = this.i0;
            if (mcVar != null) {
                mcVar.N(true);
            }
            if (this.P == 0 && this.Q < 0) {
                this.Q = 0;
            }
            l0();
            return;
        }
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            ha y3 = ha.y(this.currentAccount, false);
            if (this.g0 != y3.O(0)) {
                this.g0 = y3.O(0);
                t0();
                mc mcVar2 = this.i0;
                if (mcVar2 != null) {
                    mcVar2.N(true);
                }
                if (this.P == 0 && this.Q < 0) {
                    this.Q = 0;
                }
                l0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            mc mcVar3 = this.i0;
            if (mcVar3 != null) {
                mcVar3.N(true);
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
        ha y3 = ha.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.X);
        spannableStringBuilder.append((CharSequence) K0(y3.p(), 0.66f, ' '));
        this.Y.setText(spannableStringBuilder);
        this.c0.i(LocaleController.getString(y3.p().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats h = k0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        m1(z10, true);
    }

    public final void m1(final boolean z10, boolean z11) {
        this.h0 = z10;
        if (z11) {
            this.b0.setVisibility(0);
            this.d0.setVisibility(0);
            final int i10 = 0;
            this.b0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: ai.ab
                public final /* synthetic */ nd b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            if (z10) {
                                this.b.b0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.d0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final int i11 = 1;
            this.d0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: ai.ab
                public final /* synthetic */ nd b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            if (z10) {
                                this.b.b0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.d0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        this.b0.animate().cancel();
        this.d0.animate().cancel();
        this.d0.setAlpha(z10 ? 1.0f : 0.0f);
        this.b0.setAlpha(z10 ? 0.0f : 1.0f);
        this.d0.setVisibility(z10 ? 0 : 8);
        this.b0.setVisibility(z10 ? 8 : 0);
    }

    @Override // org.telegram.ui.b20
    public final s4.g0 n0() {
        mc mcVar = new mc(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new q(this, 6), getResourceProvider());
        this.i0 = mcVar;
        mcVar.r = false;
        return mcVar;
    }

    @Override // org.telegram.ui.b20
    public final a20 o0() {
        return new xc(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        ha.y(this.currentAccount, false).T(true);
        ha.y(this.currentAccount, false).S();
        ha.y(this.currentAccount, false).z();
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

    @Override // org.telegram.ui.b20, org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        tg.n nVar = this.S;
        if (nVar != null) {
            nVar.setPaused(true);
            this.S.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.b20, org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.S;
        if (nVar != null) {
            nVar.setPaused(false);
            this.S.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.b20
    public final sg.x1 p0() {
        return new lc(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.b20
    public final boolean q0() {
        md mdVar = this.T;
        boolean z10 = false;
        if (mdVar != null && (mdVar.getParent() instanceof View)) {
            if ((this.c.getHeight() - this.c.getPaddingBottom()) - ((View) this.T.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // org.telegram.ui.b20
    public final View r0(Context context) {
        throw null;
    }
}
