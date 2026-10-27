package bi;

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
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b20;
import org.telegram.ui.e20;
import org.telegram.ui.f20;
import org.telegram.ui.l70;
import org.telegram.ui.oo;
import org.telegram.ui.wn;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class dd extends f20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat v0;
    public static DecimalFormat w0;
    public FrameLayout R;
    public ug.n S;
    public cd T;
    public mw0 U;
    public cc V;
    public View W;
    public oe.b X;
    public oe.b Y;
    public oe.b Z;
    public int b0;
    public int c0;
    public boolean d0;
    public boolean e0;
    public cc g0;
    public z00 h0;
    public LinearLayout i0;
    public SpannableStringBuilder j0;
    public org.telegram.ui.Components.s6 k0;
    public TextView l0;
    public fi.d m0;
    public bh.r n0;
    public fi.d o0;
    public za1 p0;
    public fi.d q0;
    public fi.d r0;
    public boolean s0;
    public boolean t0;
    public fc u0;
    public int a0 = -1;
    public final u6 f0 = new u6(this, 1);

    public dd() {
        this.M = true;
    }

    public static void D0(x01 x01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.u6 u6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((u01) x01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        fa0 fa0Var = new fa0(textView, AndroidUtilities.dp(90.0f), 0, u6Var);
        fa0Var.a(org.telegram.ui.ActionBar.y6.o1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.y6.o1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(fa0Var, 0, 1, 33);
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
        final ca y3 = ca.y(i10, false);
        final long j10 = starGift.id;
        final ai.i iVar = new ai.i(textView, 9);
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() { // from class: bi.f9
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                ca caVar;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = NotificationCenter.starGiftsLoaded) || (J = (caVar = ca.this).J(j10)) == null) {
                    return;
                }
                zArr2[0] = true;
                NotificationCenter.getInstance(caVar.a).removeObserver(notificationCenterDelegateArr[0], i14);
                iVar.run(J);
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
            iVar.run(J);
        }
    }

    public static void E0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ac(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder H0(TL_stars.StarsAmount starsAmount) {
        return I0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (w0 == null) {
            w0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
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
            String format = w0.format(j10 / 1.0E9d);
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
            DecimalFormat decimalFormat = w0;
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

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (w0 == null) {
            w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = w0.format(starsAmount.amount / 1.0E9d);
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
            DecimalFormat decimalFormat = w0;
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

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (w0 == null) {
                w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = w0.format(starsAmount.amount / 1.0E9d);
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
        if (w0 == null) {
            w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        DecimalFormat decimalFormat = w0;
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

    public static String L0(long j10) {
        if (v0 == null) {
            v0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return v0.format(j10 / 1.0E9d);
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
    public static String M0(int i10, boolean z10, TL_stars.StarsTransaction starsTransaction) {
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
            return LocaleController.formatString(R.string.StarTransactionCommission, hi.k.F0(starsTransaction.starref_commission_permille));
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

    public static SpannableStringBuilder N0(CharSequence charSequence, float f7) {
        return O0(charSequence, f7, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder O0(CharSequence charSequence, float f7, float f10, float f11) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        zq zqVar = new zq(R.drawable.diamond, 0);
        zqVar.recolorDrawable = false;
        zqVar.translate(0.0f, f10);
        zqVar.spaceScaleX = f11;
        zqVar.setScale(f7, f7);
        spannableString.setSpan(zqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder P0(CharSequence charSequence) {
        return Q0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence, float f7, zq[] zqVarArr) {
        return T0(false, charSequence, f7, zqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, boolean z10) {
        return T0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return T0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(boolean z10, CharSequence charSequence, float f7, zq[] zqVarArr, float f10, float f11) {
        zq zqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (zqVarArr == null || (zqVar = zqVarArr[0]) == null) {
            zqVar = new zq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (zqVarArr != null) {
                zqVarArr[0] = zqVar;
            }
        }
        zqVar.translate(0.0f, f10);
        zqVar.spaceScaleX = f11;
        if (z10) {
            zqVar.recolorDrawable = false;
            float f12 = f7 * 0.2f;
            zqVar.setScale(f12, f12);
        } else {
            zqVar.setScale(f7, f7);
        }
        spannableString.setSpan(zqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder U0(boolean z10, String str, zq[] zqVarArr) {
        zq zqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (zqVarArr == null || (zqVar = zqVarArr[0]) == null) {
            zqVar = new zq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            zqVar.setScale(z10 ? 0.222f : 1.13f, z10 ? 0.222f : 1.13f);
        }
        if (z10) {
            zqVar.recolorDrawable = false;
        }
        if (zqVarArr != null) {
            zqVarArr[0] = zqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(zqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(TL_stars.StarsAmount starsAmount, String str, zq[] zqVarArr) {
        return W0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, zqVarArr);
    }

    public static SpannableStringBuilder W0(boolean z10, CharSequence charSequence, float f7, zq[] zqVarArr) {
        zq zqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i10 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (zqVarArr == null || (zqVar = zqVarArr[0]) == null) {
            if (zqVarArr == null || zqVarArr.length <= 0) {
                zqVar = new zq(i10, 0);
            } else {
                zqVar = new zq(i10, 0);
                zqVarArr[0] = zqVar;
            }
        }
        zqVar.recolorDrawable = false;
        if (z10) {
            f7 *= 0.33f;
        }
        zqVar.setScale(f7, f7);
        spannableString.setSpan(zqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static fb X0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int currentAccount = imageReceiver.getCurrentAccount();
        final db dbVar = new db(z10, currentAccount, str, imageReceiver, new boolean[1]);
        dbVar.run();
        final int i10 = 0;
        final int i11 = 1;
        return new fb(NotificationCenter.getInstance(currentAccount).listen(view, z10 ? NotificationCenter.didUpdateTonGiftStickers : NotificationCenter.didUpdatePremiumGiftStickers, new Utilities.Callback() { // from class: bi.eb
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
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() { // from class: bi.eb
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

    public static void Y0(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i10);
        imageReceiver.setImage(ImageLocation.getForDocument(document), a1.g.k(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.a7, 0.35f), 0L, null, null, 0);
    }

    public static void Z0(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        Y0(imageReceiver, starGift == null ? null : starGift.getDocument(), i10);
    }

    public static void a1(org.telegram.ui.Components.y9 y9Var, ImageReceiver imageReceiver, long j10) {
        X0(y9Var, imageReceiver, j10 <= 1000 ? "2⃣" : j10 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static fb b1(org.telegram.ui.Components.y9 y9Var, ImageReceiver imageReceiver, int i10) {
        return X0(y9Var, imageReceiver, i10 != 3 ? i10 != 6 ? i10 != 12 ? i10 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void c1(org.telegram.ui.Components.y9 y9Var, ImageReceiver imageReceiver, long j10) {
        X0(y9Var, imageReceiver, j10 <= 10000000000L ? "2⃣" : j10 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, android.widget.TextView] */
    public static void d1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.u6 u6Var) {
        boolean z10;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.k3 i11 = wh.i(1, context, u6Var, false);
        ?? d = wh.d(context, 1);
        d.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        d.setClipChildren(false);
        d.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        d.addView(frameLayout, kb1.x(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 7, 0, 0, 0, 10));
        ec ecVar = new ec(context, 70, 0);
        frameLayout.addView(ecVar, kb1.g(-1.0f, -1));
        ug.n nVar = new ug.n(context, 1, 2);
        ug.g gVar = nVar.b;
        gVar.z = org.telegram.ui.ActionBar.y6.fk;
        gVar.A = org.telegram.ui.ActionBar.y6.gk;
        gVar.b();
        nVar.setStarParticlesView(ecVar);
        frameLayout.addView(nVar, kb1.h(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.j5, u6Var, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.k3[] k3VarArr = new org.telegram.ui.ActionBar.k3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        ?? e = wh.e(d, textView, kb1.x(-1, -2, 17, 20, 0, 20, 4), context);
        e.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(20.0f), -6915073));
        e.setTextColor(-1);
        e.setTextSize(1, 11.33f);
        e.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        e.setGravity(17);
        e.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i12 = boost.multiplier;
        if (i12 == 0) {
            i12 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i12));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        zq zqVar = new zq(R.drawable.mini_boost_badge, 2);
        zqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
        e.setText(spannableStringBuilder);
        d.addView(e, kb1.x(-2, 20, 17, 20, 4, 20, 4));
        x01 x01Var = new x01(context, u6Var);
        x01Var.n(LocaleController.getString(R.string.BoostFrom), i10, j10, new ja(k3VarArr, j10, 3));
        x01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            z10 = 0;
            a3.i0 i0Var = new a3.i0(k3VarArr, j10, boost, 3);
            k3VarArr = k3VarArr;
            x01Var.i(string, string2, i0Var);
        } else {
            z10 = 0;
        }
        String string3 = LocaleController.getString(R.string.BoostDate);
        int i13 = R.string.formatDateAtTime;
        String format = LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000));
        String format2 = LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[z10] = format;
        objArr[1] = format2;
        x01Var.c(string3, LocaleController.formatString(i13, objArr), null, null);
        String string4 = LocaleController.getString(R.string.BoostUntil);
        int i14 = R.string.formatDateAtTime;
        String format3 = LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000));
        String format4 = LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[z10] = format3;
        objArr2[1] = format4;
        x01Var.c(string4, LocaleController.formatString(i14, objArr2), null, null);
        d.addView(x01Var, kb1.o(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        aa0 aa0Var = new aa0(context, u6Var);
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.z6, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ra(context, 3)));
        aa0Var.setGravity(17);
        d.addView(aa0Var, kb1.o(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        fi.d dVar = new fi.d(context, u6Var, true);
        dVar.i(LocaleController.getString(R.string.OK), z10, true);
        dVar.setOnClickListener(new sa(k3VarArr, 1));
        d.addView(dVar, kb1.o(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        i11.customView = d;
        k3VarArr[0] = i11;
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            k3VarArr[0].makeAttached(U);
        }
        nVar.setPaused(false);
        k3VarArr[0].show();
        k3VarArr[0].setOnDismissListener(new u6(nVar, 2));
    }

    public static k1 e1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.u6 u6Var) {
        bg.b bVar = bg.b.a;
        k1 k1Var = new k1(context, u6Var, i10, tL_starGiftUnique == null ? bg.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(bg.b.b) : tL_starGiftUnique.getResellAmount(bVar), new ai.n1(6, callback2, r8));
        k1[] k1VarArr = {k1Var};
        k1Var.show();
        return k1VarArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f1(Context context, long j10, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.u6 u6Var) {
        org.telegram.ui.ActionBar.k3[] k3VarArr;
        int i10 = 1;
        Object[] objArr = 0;
        org.telegram.ui.ActionBar.k3 i11 = wh.i(1, context, u6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.d3.o(R.string.PaidContentTitle, textView, 1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i12, u6Var);
        linearLayout.addView(textView, kb1.o(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        sd0 sd0Var = new sd0(context, u6Var);
        sd0Var.setForceForceUseCenter(true);
        sd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        sd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i12, u6Var);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        fi.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.f7.D(editTextBoldCursor, org.telegram.ui.ActionBar.y6.uf, u6Var);
        org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.y6.vf, u6Var);
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new gb(sd0Var, editTextBoldCursor, objArr == true ? 1 : 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, kb1.t(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, kb1.s(-1, -2, 1.0f, 119));
        sd0Var.e(editTextBoldCursor);
        sd0Var.addView(linearLayout2, kb1.i(-1, -2, 48));
        linearLayout.addView(sd0Var, kb1.r(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.A6, null);
        sd0Var.addView(textView2, kb1.h(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        aa0 aa0Var = new aa0(context, null);
        aa0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new ra(context, 4)), true));
        aa0Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.z6, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        linearLayout.addView(aa0Var, kb1.o(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final fi.d f7 = wh.f(24, context, u6Var, true);
        f7.i(LocaleController.getString(j10 > 0 ? R.string.PaidContentUpdateButton : R.string.PaidContentButton), false, true);
        linearLayout.addView(f7, kb1.r(-1, 48));
        if (j10 > 0 && z10) {
            dVar = wh.f(24, context, u6Var, false);
            dVar.i(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, kb1.o(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        i11.customView = linearLayout;
        final org.telegram.ui.ActionBar.k3[] k3VarArr2 = {i11};
        editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
        editTextBoldCursor.addTextChangedListener(new bc(editTextBoldCursor, sd0Var, j10, z10, f7, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: bi.hb
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
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new jb(editTextBoldCursor2, k3VarArr2, 1));
                return true;
            }
        });
        f7.setOnClickListener(new ib(zArr, callback2, editTextBoldCursor, f7, k3VarArr2));
        if (dVar != null) {
            fi.d dVar2 = dVar;
            ib ibVar = new ib(zArr, callback2, dVar2, editTextBoldCursor, k3VarArr2);
            k3VarArr = k3VarArr2;
            dVar2.setOnClickListener(ibVar);
        } else {
            k3VarArr = k3VarArr2;
        }
        k3VarArr[0].fixNavigationBar();
        k3VarArr[0].setOnDismissListener(new cb(editTextBoldCursor, i10));
        k3VarArr[0].show();
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        AndroidUtilities.runOnUIThread(new jb(k3VarArr, editTextBoldCursor), R instanceof wn ? ((wn) R).ca() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0fb6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0ffe  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x1053  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x108a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x10aa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x1093  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x105e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1041  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0d82  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0da1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0ef9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0f0b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f0e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0f1e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0f80  */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.k3 g1(final Context context, final boolean z10, final long j10, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.u6 u6Var) {
        org.telegram.ui.ActionBar.k3 k3Var;
        org.telegram.ui.ActionBar.k3[] k3VarArr;
        boolean z11;
        Context context2;
        int i11;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z12;
        boolean z13;
        long j11;
        org.telegram.ui.ActionBar.u6 u6Var2;
        TLRPC.Peer peer;
        String str2;
        long j12;
        ImageLocation imageLocation;
        ImageLocation forDocument;
        int i12;
        org.telegram.ui.ActionBar.k3[] k3VarArr2;
        float f7;
        int i13;
        String string;
        TL_stars.StarGift starGift;
        TL_stars.StarsTransaction starsTransaction3;
        ViewGroup viewGroup;
        final org.telegram.ui.ActionBar.k3[] k3VarArr3;
        org.telegram.ui.ActionBar.u6 u6Var3;
        Context context3;
        int i14;
        org.telegram.ui.ActionBar.k3[] k3VarArr4;
        TL_stars.StarsTransaction starsTransaction4;
        x01 x01Var;
        final org.telegram.ui.ActionBar.k3[] k3VarArr5;
        x01 x01Var2;
        x01 x01Var3;
        x01 x01Var4;
        x01 x01Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z14;
        TL_stars.StarGift starGift2;
        Context context4;
        ?? r13;
        org.telegram.ui.ActionBar.r2 U;
        TLRPC.Chat chat;
        int i15;
        ImageLocation forDocument2;
        x01 x01Var6;
        x01 x01Var7;
        final int i16;
        x01 x01Var8;
        final org.telegram.ui.ActionBar.k3[] k3VarArr6;
        long j13;
        x01 x01Var9;
        long j14;
        TL_stars.StarsAmount starsAmount;
        ViewGroup viewGroup2;
        int i17;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z15 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i18 = starsTransaction.flags;
        boolean z16 = (i18 & 8192) != 0;
        boolean z17 = ((131072 & i18) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z18 = (z17 || (i18 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        org.telegram.ui.ActionBar.k3 k3Var2 = new org.telegram.ui.ActionBar.k3(context, u6Var, false, false);
        k3Var2.fixNavigationBar();
        org.telegram.ui.ActionBar.k3[] k3VarArr7 = new org.telegram.ui.ActionBar.k3[1];
        final LinearLayout d = wh.d(context, 1);
        d.setPadding(0, AndroidUtilities.dp((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, AndroidUtilities.dp(8.0f));
        d.setClipChildren(false);
        d.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                k3VarArr = k3VarArr7;
                k3Var = k3Var2;
                tb tbVar = new tb(context, matrix, radialGradient, paint, r5Var);
                r5Var.l(tbVar);
                r5Var.i(stargiftattributepattern.document, false);
                tbVar.setOrientation(1);
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                Z0(y9Var.getImageReceiver(), starsTransaction.stargift, 160);
                tbVar.addView(y9Var, kb1.x(160, 160, 17, 0, 20, 0, 0));
                if (TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    i17 = 0;
                } else {
                    kb1.b(y9Var);
                    i17 = 0;
                    y9Var.setOnClickListener(new pa(context, i10, tL_starGiftUnique, i17));
                }
                TextView L = kb1.L(context, 20.0f, i17, true, null);
                L.setTextColor(-1);
                L.setText(tL_starGiftUnique.title);
                tbVar.addView(L, kb1.x(-2, -2, 17, 0, 1, 0, 0));
                TextView L2 = kb1.L(context, 13.0f, 0, false, null);
                L2.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                L2.setText(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num));
                tbVar.addView(L2, kb1.x(-2, -2, 17, 0, 5, 0, 0));
                TextView L3 = kb1.L(context, 18.0f, 0, true, null);
                L3.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                L3.setText(S0(starsAmount3, TextUtils.concat(positive ? "+" : "", H0(starsAmount3), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L3.getText());
                if (starsTransaction.refund) {
                    E0(spannableStringBuilder, L3, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction.failed) {
                    E0(spannableStringBuilder, L3, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction.pending) {
                    E0(spannableStringBuilder, L3, LocaleController.getString(R.string.StarsPending));
                }
                L3.setText(spannableStringBuilder);
                tbVar.addView(L3, kb1.x(-2, -2, 17, 0, 11, 0, 17));
                d.addView(tbVar, kb1.r(-1, -2));
                u6Var2 = u6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = d;
                str = "";
                z12 = z18;
                k3VarArr2 = k3VarArr;
                f7 = 16.0f;
                x01 x01Var10 = new x01(context2, u6Var2);
                starGift = starsTransaction2.stargift;
                int i19 = 5;
                if (starGift == null) {
                    if (starsTransaction2.stargift_upgrade) {
                        if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                            starsTransaction4 = starsTransaction2;
                            viewGroup2 = linearLayout;
                        } else {
                            org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) ((u01) x01Var10.d(LocaleController.getString(R.string.StarGiftReasonUpgrade), LocaleController.getString(R.string.StarGiftReason)).getChildAt(1)).getChildAt(0);
                            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                            tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                            viewGroup2 = linearLayout;
                            Context context5 = context2;
                            starsTransaction4 = starsTransaction;
                            ca.w(i10).M(tL_inputSavedStarGiftUser, new ua(ycVar, i10, context5, u6Var2, 0));
                        }
                        TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction4.peer;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                            long peerDialogId = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer2).peer);
                            String string2 = LocaleController.getString(R.string.StarGiftUpgradeGiftFrom);
                            Runnable jaVar = new ja(k3VarArr2, peerDialogId, 2);
                            i14 = i10;
                            x01 x01Var11 = x01Var10;
                            org.telegram.ui.ActionBar.k3[] k3VarArr8 = k3VarArr2;
                            u6Var3 = u6Var;
                            x01Var11.n(string2, i14, peerDialogId, jaVar);
                            context3 = context;
                            viewGroup = viewGroup2;
                            k3VarArr4 = k3VarArr8;
                            x01Var5 = x01Var11;
                            starsTransactionPeer = starsTransaction4.peer;
                            if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction4.flags & 256) != 0) {
                                long peerDialogId2 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                                if (z10) {
                                    peerDialogId2 = j10;
                                }
                                chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId2));
                                if (chat != null) {
                                    aa0 aa0Var = new aa0(context3, u6Var3);
                                    aa0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                    aa0Var.setEllipsize(TextUtils.TruncateAt.END);
                                    int i20 = org.telegram.ui.ActionBar.y6.gc;
                                    org.telegram.ui.ActionBar.f7.V(aa0Var, i20, u6Var3);
                                    org.telegram.ui.ActionBar.f7.H(aa0Var, i20, u6Var3);
                                    aa0Var.setTextSize(1, 14.0f);
                                    aa0Var.setDisablePaddingsOffsetY(true);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                                    if (starsTransaction4.extended_media.isEmpty()) {
                                        z14 = z15;
                                    } else {
                                        ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction4.extended_media;
                                        int size = arrayList.size();
                                        z14 = z15;
                                        int i21 = 0;
                                        int i22 = 0;
                                        while (i21 < size) {
                                            TLRPC.MessageMedia messageMedia = arrayList.get(i21);
                                            int i23 = i21 + 1;
                                            TLRPC.MessageMedia messageMedia2 = messageMedia;
                                            ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                            int i24 = size;
                                            l70 l70Var = new l70(aa0Var, 24.0f, i14);
                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                                i15 = i22;
                                                forDocument2 = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.photo.sizes, AndroidUtilities.dp(24.0f), true), messageMedia2.photo);
                                            } else {
                                                i15 = i22;
                                                forDocument2 = messageMedia2 instanceof TLRPC.TL_messageMediaDocument ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia2.document.thumbs, AndroidUtilities.dp(24.0f), true), messageMedia2.document) : null;
                                            }
                                            if (forDocument2 != null) {
                                                l70Var.a(6.0f);
                                                l70Var.b.setImage(forDocument2, "24_24", null, null, null, 0);
                                                SpannableString spannableString = new SpannableString("x");
                                                spannableString.setSpan(l70Var, 0, spannableString.length(), 33);
                                                spannableStringBuilder2.append((CharSequence) spannableString);
                                                spannableStringBuilder2.append((CharSequence) " ");
                                                i22 = i15 + 1;
                                            } else {
                                                i22 = i15;
                                            }
                                            if (i22 >= 3) {
                                                break;
                                            }
                                            i21 = i23;
                                            size = i24;
                                            arrayList = arrayList2;
                                        }
                                    }
                                    spannableStringBuilder2.append((CharSequence) " ");
                                    int length = spannableStringBuilder2.length();
                                    String publicUsername = ChatObject.getPublicUsername(chat);
                                    if (TextUtils.isEmpty(publicUsername)) {
                                        spannableStringBuilder2.append((CharSequence) chat.title);
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        c3.h0.r(sb2, MessagesController.getInstance(i14).linkPrefix, "/", publicUsername, "/");
                                        sb2.append(starsTransaction4.msg_id);
                                        spannableStringBuilder2.append((CharSequence) sb2.toString());
                                    }
                                    ma maVar = new ma(k3VarArr4, peerDialogId2, starsTransaction4);
                                    spannableStringBuilder2.setSpan(new wb(maVar), length, spannableStringBuilder2.length(), 33);
                                    aa0Var.setSingleLine(true);
                                    aa0Var.setEllipsize(TextUtils.TruncateAt.END);
                                    aa0Var.setText(spannableStringBuilder2);
                                    aa0Var.setOnClickListener(new ai.s(maVar, 11));
                                    x01Var5.l(aa0Var, LocaleController.getString(starsTransaction4.reaction ? R.string.StarsTransactionMessage : R.string.StarsTransactionMedia));
                                    if (!TextUtils.isEmpty(starsTransaction4.id) && !z19) {
                                        String string3 = LocaleController.getString(R.string.StarsTransactionID);
                                        String str3 = starsTransaction4.id;
                                        x01Var5.k(string3, str3, str3.length() <= 25 ? 9 : 10, new f2(14, k3VarArr4, u6Var3));
                                    }
                                    if (starsTransaction4.floodskip && starsTransaction4.floodskip_number > 0) {
                                        x01Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                                    }
                                    x01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                                    starGift2 = starsTransaction4.stargift;
                                    if (starGift2 != null) {
                                        if (starGift2.limited) {
                                            D0(x01Var5, i14, starGift2, u6Var3);
                                        }
                                        if (!TextUtils.isEmpty(starsTransaction4.description)) {
                                            x01Var5.a(new SpannableStringBuilder(starsTransaction4.description));
                                        }
                                    }
                                    ViewGroup viewGroup3 = viewGroup;
                                    viewGroup3.addView(x01Var5, kb1.o(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                                    if ((starsTransaction4.flags & 32) != 0) {
                                        x01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.transaction_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.transaction_date * 1000))), LocaleController.getString(R.string.StarsTransactionTONDate));
                                    }
                                    if (z14) {
                                        context4 = context;
                                        aa0 aa0Var2 = new aa0(context4, u6Var3);
                                        org.telegram.ui.ActionBar.f7.V(aa0Var2, org.telegram.ui.ActionBar.y6.z6, u6Var3);
                                        org.telegram.ui.ActionBar.f7.H(aa0Var2, org.telegram.ui.ActionBar.y6.gc, u6Var3);
                                        aa0Var2.setTextSize(1, 14.0f);
                                        aa0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ra(context4, 0)));
                                        aa0Var2.setGravity(17);
                                        viewGroup3.addView(aa0Var2, kb1.o(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                                    } else {
                                        context4 = context;
                                    }
                                    fi.d dVar = new fi.d(context4, u6Var3);
                                    dVar.f();
                                    if ((starsTransaction4.flags & 32) == 0) {
                                        r13 = 0;
                                        dVar.h(LocaleController.getString(R.string.StarsTransactionViewInBlockchainExplorer), false);
                                    } else {
                                        r13 = 0;
                                        dVar.h(LocaleController.getString(R.string.OK), false);
                                    }
                                    viewGroup3.addView(dVar, kb1.o(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                                    org.telegram.ui.ActionBar.k3 k3Var3 = k3Var;
                                    k3Var3.customView = viewGroup3;
                                    k3VarArr4[r13] = k3Var3;
                                    k3Var3.useBackgroundTopPadding = r13;
                                    if ((starsTransaction4.flags & 32) == 0) {
                                        dVar.setOnClickListener(new q(context4, starsTransaction4));
                                    } else {
                                        dVar.setOnClickListener(new sa(k3VarArr4, r13));
                                    }
                                    k3VarArr4[r13].fixNavigationBar();
                                    U = LaunchActivity.U();
                                    if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                        k3VarArr4[r13].makeAttached(U);
                                    }
                                    k3VarArr4[r13].show();
                                    return k3VarArr4[r13];
                                }
                            }
                            z14 = z15;
                            if (!TextUtils.isEmpty(starsTransaction4.id)) {
                                String string32 = LocaleController.getString(R.string.StarsTransactionID);
                                String str32 = starsTransaction4.id;
                                x01Var5.k(string32, str32, str32.length() <= 25 ? 9 : 10, new f2(14, k3VarArr4, u6Var3));
                            }
                            if (starsTransaction4.floodskip) {
                                x01Var5.d(LocaleController.formatPluralStringComma("StarsTransactionFloodskipNumber", starsTransaction4.floodskip_number), LocaleController.getString(R.string.StarsTransactionFloodskipNumberName));
                            }
                            x01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                            starGift2 = starsTransaction4.stargift;
                            if (starGift2 != null) {
                            }
                            ViewGroup viewGroup32 = viewGroup;
                            viewGroup32.addView(x01Var5, kb1.o(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                            if ((starsTransaction4.flags & 32) != 0) {
                            }
                            if (z14) {
                            }
                            fi.d dVar2 = new fi.d(context4, u6Var3);
                            dVar2.f();
                            if ((starsTransaction4.flags & 32) == 0) {
                            }
                            viewGroup32.addView(dVar2, kb1.o(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                            org.telegram.ui.ActionBar.k3 k3Var32 = k3Var;
                            k3Var32.customView = viewGroup32;
                            k3VarArr4[r13] = k3Var32;
                            k3Var32.useBackgroundTopPadding = r13;
                            if ((starsTransaction4.flags & 32) == 0) {
                            }
                            k3VarArr4[r13].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet()) {
                                k3VarArr4[r13].makeAttached(U);
                            }
                            k3VarArr4[r13].show();
                            return k3VarArr4[r13];
                        }
                        org.telegram.ui.ActionBar.k3[] k3VarArr9 = k3VarArr2;
                        i14 = i10;
                        u6Var3 = u6Var;
                        x01Var6 = x01Var10;
                        viewGroup = viewGroup2;
                        k3VarArr4 = k3VarArr9;
                    } else {
                        k3VarArr5 = k3VarArr2;
                        final Context context6 = context2;
                        starsTransaction4 = starsTransaction2;
                        u6Var3 = u6Var2;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            String str4 = starGift.slug;
                            if (!TextUtils.isEmpty(str4)) {
                                x01Var10.i(LocaleController.getString(R.string.Gift2Gift), starsTransaction4.stargift.title + " #" + starsTransaction4.stargift.num, new ai.h0(context6, i10, str4, i19));
                            }
                            final long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                            long peerDialogId3 = DialogObject.getPeerDialogId(((TL_stars.TL_starsTransactionPeer) starsTransaction4.peer).peer);
                            if (!starsTransaction4.offer) {
                                if (starsTransaction4.stargift_resale) {
                                    if (negative) {
                                        x01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonPurchase), LocaleController.getString(R.string.StarGiftReason));
                                    } else {
                                        x01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonPurchase : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                        j13 = clientUserId;
                                    }
                                } else if (starsTransaction4.stargift_drop_original_details) {
                                    x01Var10.d(LocaleController.getString(R.string.StarGiftReasonRemovedDescription), LocaleController.getString(R.string.StarGiftReason));
                                    peerDialogId3 = clientUserId;
                                    j13 = peerDialogId3;
                                } else {
                                    x01Var10.d(LocaleController.getString(R.string.StarGiftReasonTransfer), LocaleController.getString(R.string.StarGiftReason));
                                }
                                j13 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else if (negative) {
                                x01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonSale : R.string.StarGiftReasonOffer), LocaleController.getString(R.string.StarGiftReason));
                                j13 = peerDialogId3;
                                peerDialogId3 = clientUserId;
                            } else {
                                x01Var10.d(LocaleController.getString(starsTransaction4.refund ? R.string.StarGiftReasonOfferRefund : R.string.StarGiftReasonSale), LocaleController.getString(R.string.StarGiftReason));
                                j13 = clientUserId;
                            }
                            if (peerDialogId3 != clientUserId) {
                                final long j15 = peerDialogId3;
                                final int i25 = 0;
                                x01Var9 = x01Var10;
                                viewGroup = linearLayout;
                                j14 = clientUserId;
                                x01Var9.n(LocaleController.getString(R.string.Gift2From), i10, j15, new Runnable() { // from class: bi.wa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i25) {
                                            case 0:
                                                k3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j16 = j15;
                                                    Bundle h = a1.g.h(j16, "user_id");
                                                    if (j16 == clientUserId) {
                                                        h.putBoolean("my_profile", true);
                                                    }
                                                    h.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(h, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                k3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j17 = j15;
                                                    Bundle h10 = a1.g.h(j17, "user_id");
                                                    if (j17 == clientUserId) {
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
                                x01Var9 = x01Var10;
                                j14 = clientUserId;
                                viewGroup = linearLayout;
                            }
                            if (j13 != j14) {
                                final long j16 = j14;
                                final int i26 = 1;
                                final long j17 = j13;
                                x01Var9.n(LocaleController.getString(R.string.Gift2To), i10, j17, new Runnable() { // from class: bi.wa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i26) {
                                            case 0:
                                                k3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    long j162 = j17;
                                                    Bundle h = a1.g.h(j162, "user_id");
                                                    if (j162 == j16) {
                                                        h.putBoolean("my_profile", true);
                                                    }
                                                    h.putBoolean("open_gifts", true);
                                                    U2.presentFragment(new ProfileActivity(h, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                k3VarArr5[0].dismiss();
                                                org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    long j172 = j17;
                                                    Bundle h10 = a1.g.h(j172, "user_id");
                                                    if (j172 == j16) {
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
                            x01 x01Var12 = x01Var9;
                            if ((peerDialogId3 == clientUserId || starsTransaction4.stargift_resale) && (starsAmount = starsTransaction4.starref_amount) != null && starsTransaction4.starref_commission_permille > 0) {
                                TL_stars.StarsAmount starsAmount4 = starsTransaction4.amount;
                                if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                    TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                    tL_starsTonAmount.amount = starsTransaction4.amount.amount + starsTransaction4.starref_amount.amount;
                                    zq[] zqVarArr = new zq[1];
                                    x01Var12.d(V0(starsTransaction4.amount, "⭐️ " + ((Object) H0(tL_starsTonAmount)), zqVarArr), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                    zq zqVar = zqVarArr[0];
                                    if (zqVar != null) {
                                        zqVar.setOverrideColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var3));
                                    }
                                } else {
                                    x01Var12.d(W0(starsTransaction4.amount instanceof TL_stars.TL_starsTonAmount, org.telegram.messenger.t.i(Math.abs(Math.round(starsTransaction4.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                                }
                            }
                            i14 = i10;
                            x01Var4 = x01Var12;
                            context3 = context6;
                            k3VarArr4 = k3VarArr5;
                            x01Var3 = x01Var4;
                        } else {
                            viewGroup = linearLayout;
                            if (starsTransaction4.refund) {
                                i14 = i10;
                                x01Var6 = x01Var10;
                                k3VarArr4 = k3VarArr5;
                            } else {
                                long clientUserId2 = j10 == 0 ? UserConfig.getInstance(i10).getClientUserId() : j10;
                                final long peerDialogId4 = DialogObject.getPeerDialogId(starsTransaction4.peer.peer);
                                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId4));
                                if (positive) {
                                    if (peerDialogId4 != clientUserId2) {
                                        CharSequence string4 = LocaleController.getString(R.string.StarGiveawayPrizeFrom);
                                        Runnable maVar2 = new ma(k3VarArr5, starsTransaction4, peerDialogId4, 3);
                                        String string5 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                        final int i27 = 0;
                                        i16 = i10;
                                        Runnable runnable = new Runnable() { // from class: bi.va
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i27) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.k3 k3Var4 = k3VarArr5[0];
                                                        Objects.requireNonNull(k3Var4);
                                                        new zh.p1(context6, i16, peerDialogId4, null, new ai.i(k3Var4, 8)).show();
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.k3 k3Var5 = k3VarArr5[0];
                                                        Objects.requireNonNull(k3Var5);
                                                        new zh.p1(context6, i16, peerDialogId4, null, new ai.i(k3Var5, 8)).show();
                                                        break;
                                                }
                                            }
                                        };
                                        x01 x01Var13 = x01Var10;
                                        k3VarArr6 = k3VarArr5;
                                        x01Var13.m(string4, i16, peerDialogId4, maVar2, string5, runnable);
                                        x01Var8 = x01Var13;
                                    } else {
                                        i16 = i10;
                                        x01Var8 = x01Var10;
                                        k3VarArr6 = k3VarArr5;
                                    }
                                    final int i28 = 1;
                                    x01Var8.n(LocaleController.getString(R.string.StarGiveawayPrizeTo), i16, clientUserId2, new Runnable() { // from class: bi.na
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
                                                case 0:
                                                    k3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", UserConfig.getInstance(i16).getClientUserId());
                                                        bundle.putBoolean("my_profile", true);
                                                        U2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    k3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
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
                                                    k3VarArr6[0].dismiss();
                                                    org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
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
                                    k3VarArr3 = k3VarArr6;
                                    x01Var7 = x01Var8;
                                } else {
                                    long j18 = clientUserId2;
                                    if (peerDialogId4 != j18) {
                                        final int i29 = 2;
                                        x01Var10.n(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, j18, new Runnable() { // from class: bi.na
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i29) {
                                                    case 0:
                                                        k3VarArr5[0].dismiss();
                                                        org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            Bundle bundle = new Bundle();
                                                            bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                                            bundle.putBoolean("my_profile", true);
                                                            U2.presentFragment(new ProfileActivity(bundle, null));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        k3VarArr5[0].dismiss();
                                                        org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
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
                                                        k3VarArr5[0].dismiss();
                                                        org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
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
                                    Runnable maVar3 = new ma(k3VarArr5, starsTransaction, peerDialogId4, 4);
                                    starsTransaction3 = starsTransaction;
                                    String string7 = (user == null || UserObject.isDeleted(user) || UserObject.areGiftsDisabled(peerDialogId4)) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift);
                                    final int i30 = 1;
                                    x01 x01Var14 = x01Var10;
                                    k3VarArr3 = k3VarArr5;
                                    x01Var14.m(string6, i10, peerDialogId4, maVar3, string7, new Runnable() { // from class: bi.va
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i30) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.k3 k3Var4 = k3VarArr5[0];
                                                    Objects.requireNonNull(k3Var4);
                                                    new zh.p1(context, i10, peerDialogId4, null, new ai.i(k3Var4, 8)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.k3 k3Var5 = k3VarArr5[0];
                                                    Objects.requireNonNull(k3Var5);
                                                    new zh.p1(context, i10, peerDialogId4, null, new ai.i(k3Var5, 8)).show();
                                                    break;
                                            }
                                        }
                                    });
                                    x01Var7 = x01Var14;
                                }
                                context3 = context;
                                i14 = i10;
                                x01Var2 = x01Var7;
                                k3VarArr4 = k3VarArr3;
                                starsTransaction4 = starsTransaction3;
                                x01Var3 = x01Var2;
                            }
                        }
                    }
                    context3 = context;
                    x01Var5 = x01Var6;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                        long peerDialogId22 = DialogObject.getPeerDialogId(starsTransactionPeer.peer);
                        if (z10) {
                        }
                        chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId22));
                        if (chat != null) {
                        }
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    x01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322 = viewGroup;
                    viewGroup322.addView(x01Var5, kb1.o(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    fi.d dVar22 = new fi.d(context4, u6Var3);
                    dVar22.f();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup322.addView(dVar22, kb1.o(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.k3 k3Var322 = k3Var;
                    k3Var322.customView = viewGroup322;
                    k3VarArr4[r13] = k3Var322;
                    k3Var322.useBackgroundTopPadding = r13;
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    k3VarArr4[r13].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    k3VarArr4[r13].show();
                    return k3VarArr4[r13];
                }
                starsTransaction3 = starsTransaction2;
                viewGroup = linearLayout;
                x01 x01Var15 = x01Var10;
                k3VarArr3 = k3VarArr2;
                u6Var3 = u6Var2;
                TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction3.peer;
                if (!(starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer)) {
                    context3 = context;
                    i14 = i10;
                    k3VarArr4 = k3VarArr3;
                    starsTransaction4 = starsTransaction3;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                        if (starsTransaction4.gift) {
                            aa0 aa0Var3 = new aa0(context3, u6Var3);
                            aa0Var3.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                            aa0Var3.setEllipsize(TextUtils.TruncateAt.END);
                            int i31 = org.telegram.ui.ActionBar.y6.gc;
                            org.telegram.ui.ActionBar.f7.V(aa0Var3, i31, u6Var3);
                            org.telegram.ui.ActionBar.f7.H(aa0Var3, i31, u6Var3);
                            aa0Var3.setTextSize(1, 14.0f);
                            aa0Var3.setSingleLine(true);
                            aa0Var3.setDisablePaddingsOffsetY(true);
                            org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(aa0Var3, 24.0f, i14);
                            String string8 = LocaleController.getString(z15 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown);
                            ar a2 = yc.a(24, "fragment");
                            int dp = AndroidUtilities.dp(f7);
                            int dp2 = AndroidUtilities.dp(f7);
                            a2.e = dp;
                            a2.f = dp2;
                            j5Var.b.setImageBitmap(a2);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x  " + ((Object) string8));
                            spannableStringBuilder3.setSpan(j5Var, 0, 1, 33);
                            spannableStringBuilder3.setSpan(new vb(k3VarArr4, context3, z15), 3, spannableStringBuilder3.length(), 33);
                            aa0Var3.setText(spannableStringBuilder3);
                            x01Var15.l(aa0Var3, LocaleController.getString(R.string.StarsTransactionRecipient));
                            x01Var5 = x01Var15;
                        } else {
                            x01Var15.d(LocaleController.getString(R.string.Fragment), LocaleController.getString(R.string.StarsTransactionSource));
                            x01Var5 = x01Var15;
                        }
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                        x01Var15.d(LocaleController.getString(R.string.AppStore), LocaleController.getString(R.string.StarsTransactionSource));
                        x01Var5 = x01Var15;
                    } else if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                        x01Var15.d(LocaleController.getString(R.string.PlayMarket), LocaleController.getString(R.string.StarsTransactionSource));
                        x01Var5 = x01Var15;
                    } else {
                        x01Var5 = x01Var15;
                        if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            x01Var15.d(LocaleController.getString(R.string.StarsTransactionBot), LocaleController.getString(R.string.StarsTransactionSource));
                            x01Var5 = x01Var15;
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
                    x01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup3222 = viewGroup;
                    viewGroup3222.addView(x01Var5, kb1.o(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    fi.d dVar222 = new fi.d(context4, u6Var3);
                    dVar222.f();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup3222.addView(dVar222, kb1.o(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.k3 k3Var3222 = k3Var;
                    k3Var3222.customView = viewGroup3222;
                    k3VarArr4[r13] = k3Var3222;
                    k3Var3222.useBackgroundTopPadding = r13;
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    k3VarArr4[r13].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    k3VarArr4[r13].show();
                    return k3VarArr4[r13];
                }
                final long peerDialogId5 = DialogObject.getPeerDialogId(starsTransactionPeer3.peer);
                if (starsTransaction3.paid_message) {
                    x01Var15.n(LocaleController.getString(positive ? R.string.Gift2From : R.string.Gift2To), i10, peerDialogId5, new ja(k3VarArr3, peerDialogId5, 4));
                    if (starsTransaction3.starref_amount != null && starsTransaction3.starref_commission_permille > 0) {
                        x01Var15.d(W0(starsTransaction3.amount instanceof TL_stars.TL_starsTonAmount, org.telegram.messenger.t.i(Math.abs(Math.round(starsTransaction3.starref_amount.toDouble() + starsTransaction3.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), LocaleController.getString(R.string.StarsTransactionFullPrice));
                    }
                    context3 = context;
                    i14 = i10;
                    x01Var2 = x01Var15;
                } else if (z11) {
                    long peerDialogId6 = DialogObject.getPeerDialogId(starsTransaction3.starref_peer);
                    x01Var15.i(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new ja(k3VarArr3, j10, i19));
                    i14 = i10;
                    x01Var15.n(LocaleController.getString(R.string.StarAffiliate), i14, peerDialogId6, new ja(k3VarArr3, peerDialogId6, 6));
                    x01Var15.n(LocaleController.getString(R.string.StarAffiliateReferredUser), i14, peerDialogId5, new ja(k3VarArr3, peerDialogId5, 0));
                    x01Var15.d(hi.k.F0(starsTransaction3.starref_commission_permille), LocaleController.getString(R.string.StarAffiliateCommission));
                    context3 = context;
                    x01Var2 = x01Var15;
                } else if (z12) {
                    x01Var15.i(LocaleController.getString(R.string.StarAffiliateReason), LocaleController.getString(R.string.StarAffiliateReasonProgram), new ka(i10, context, j10, peerDialogId5, k3VarArr3, u6Var3));
                    i14 = i10;
                    x01 x01Var16 = x01Var15;
                    x01Var16.n(LocaleController.getString(R.string.StarAffiliateMiniApp), i14, peerDialogId5, new ja(k3VarArr3, peerDialogId5, 1));
                    context3 = context;
                    x01Var2 = x01Var16;
                } else {
                    if (z19) {
                        x01Var15.n(LocaleController.getString(R.string.StarGiveawayPrizeFrom), i10, peerDialogId5, new ma(k3VarArr3, starsTransaction3, peerDialogId5, 0));
                        final int i32 = 0;
                        x01Var15.n(LocaleController.getString(R.string.StarGiveawayPrizeTo), i10, UserConfig.getInstance(i10).getClientUserId(), new Runnable() { // from class: bi.na
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i32) {
                                    case 0:
                                        k3VarArr3[0].dismiss();
                                        org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                        if (U2 != null) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", UserConfig.getInstance(i10).getClientUserId());
                                            bundle.putBoolean("my_profile", true);
                                            U2.presentFragment(new ProfileActivity(bundle, null));
                                            break;
                                        }
                                        break;
                                    case 1:
                                        k3VarArr3[0].dismiss();
                                        org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
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
                                        k3VarArr3[0].dismiss();
                                        org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
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
                        Runnable maVar4 = new ma(k3VarArr3, starsTransaction, peerDialogId5, 1);
                        starsTransaction4 = starsTransaction;
                        x01Var15.i(string9, string10, maVar4);
                        x01Var15.d(K0(starsTransaction4.amount), LocaleController.getString(R.string.StarGiveawayGift));
                        i14 = i10;
                        k3VarArr4 = k3VarArr3;
                        x01Var = x01Var15;
                    } else {
                        starsTransaction4 = starsTransaction3;
                        if (!starsTransaction4.subscription || z10) {
                            if (starsTransaction4.premium_gift) {
                                final int i33 = 1;
                                x01Var15.n(LocaleController.getString(R.string.Gift2To), i10, peerDialogId5, new Runnable() { // from class: bi.oa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i33) {
                                            case 0:
                                                k3VarArr3[0].dismiss();
                                                long j19 = peerDialogId5;
                                                if (!UserObject.isService(j19)) {
                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(wn.ea(j19));
                                                        break;
                                                    }
                                                } else {
                                                    qf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                k3VarArr3[0].dismiss();
                                                long j20 = peerDialogId5;
                                                if (!UserObject.isService(j20)) {
                                                    org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(wn.ea(j20));
                                                        break;
                                                    }
                                                } else {
                                                    qf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                k3VarArr3[0].dismiss();
                                                long j21 = peerDialogId5;
                                                if (!UserObject.isService(j21)) {
                                                    org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(wn.ea(j21));
                                                        break;
                                                    }
                                                } else {
                                                    qf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                x01Var15.d(LocaleController.formatPluralStringComma("Months", starsTransaction4.premium_gift_months), LocaleController.getString(R.string.StarsTransactionPremiumGiftDuration));
                            } else if (!starsTransaction4.posts_search) {
                                final int i34 = 2;
                                k3VarArr4 = k3VarArr3;
                                x01 x01Var17 = x01Var15;
                                context3 = context;
                                i14 = i10;
                                x01Var17.n(LocaleController.getString(R.string.StarsTransactionRecipient), i14, peerDialogId5, new Runnable() { // from class: bi.oa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i34) {
                                            case 0:
                                                k3VarArr3[0].dismiss();
                                                long j19 = peerDialogId5;
                                                if (!UserObject.isService(j19)) {
                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        U2.presentFragment(wn.ea(j19));
                                                        break;
                                                    }
                                                } else {
                                                    qf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                k3VarArr3[0].dismiss();
                                                long j20 = peerDialogId5;
                                                if (!UserObject.isService(j20)) {
                                                    org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                                                    if (U3 != null) {
                                                        U3.presentFragment(wn.ea(j20));
                                                        break;
                                                    }
                                                } else {
                                                    qf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                            default:
                                                k3VarArr3[0].dismiss();
                                                long j21 = peerDialogId5;
                                                if (!UserObject.isService(j21)) {
                                                    org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                                                    if (U4 != null) {
                                                        U4.presentFragment(wn.ea(j21));
                                                        break;
                                                    }
                                                } else {
                                                    qf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                x01Var3 = x01Var17;
                            }
                            i14 = i10;
                            x01Var = x01Var15;
                            k3VarArr4 = k3VarArr3;
                        } else {
                            final int i35 = 0;
                            k3VarArr5 = k3VarArr3;
                            x01 x01Var18 = x01Var15;
                            i14 = i10;
                            x01Var18.n(LocaleController.getString(R.string.StarSubscriptionTo), i14, peerDialogId5, new Runnable() { // from class: bi.oa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i35) {
                                        case 0:
                                            k3VarArr3[0].dismiss();
                                            long j19 = peerDialogId5;
                                            if (!UserObject.isService(j19)) {
                                                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                if (U2 != null) {
                                                    U2.presentFragment(wn.ea(j19));
                                                    break;
                                                }
                                            } else {
                                                qf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                        case 1:
                                            k3VarArr3[0].dismiss();
                                            long j20 = peerDialogId5;
                                            if (!UserObject.isService(j20)) {
                                                org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                                                if (U3 != null) {
                                                    U3.presentFragment(wn.ea(j20));
                                                    break;
                                                }
                                            } else {
                                                qf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                        default:
                                            k3VarArr3[0].dismiss();
                                            long j21 = peerDialogId5;
                                            if (!UserObject.isService(j21)) {
                                                org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                                                if (U4 != null) {
                                                    U4.presentFragment(wn.ea(j21));
                                                    break;
                                                }
                                            } else {
                                                qf.d.r(context, LocaleController.getString(R.string.StarsTransactionUnknownLink));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            context3 = context;
                            x01Var4 = x01Var18;
                            k3VarArr4 = k3VarArr5;
                            x01Var3 = x01Var4;
                        }
                    }
                    context3 = context;
                    x01Var3 = x01Var;
                }
                k3VarArr4 = k3VarArr3;
                starsTransaction4 = starsTransaction3;
                x01Var3 = x01Var2;
                x01Var5 = x01Var3;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                x01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup32222 = viewGroup;
                viewGroup32222.addView(x01Var5, kb1.o(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                fi.d dVar2222 = new fi.d(context4, u6Var3);
                dVar2222.f();
                if ((starsTransaction4.flags & 32) == 0) {
                }
                viewGroup32222.addView(dVar2222, kb1.o(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.k3 k3Var32222 = k3Var;
                k3Var32222.customView = viewGroup32222;
                k3VarArr4[r13] = k3Var32222;
                k3Var32222.useBackgroundTopPadding = r13;
                if ((starsTransaction4.flags & 32) == 0) {
                }
                k3VarArr4[r13].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                k3VarArr4[r13].show();
                return k3VarArr4[r13];
            }
        }
        k3Var = k3Var2;
        k3VarArr = k3VarArr7;
        z11 = z17;
        final org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
        if (starsTransaction.premium_gift) {
            b1(y9Var2, y9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            d.addView(y9Var2, kb1.x(160, 160, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            ar a10 = org.telegram.ui.Cells.z6.a(100, "search");
            int dp3 = AndroidUtilities.dp(40.0f);
            int dp4 = AndroidUtilities.dp(40.0f);
            a10.e = dp3;
            a10.f = dp4;
            y9Var2.setImageDrawable(a10);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z19 || starsTransaction.gift) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = d;
                    str = "";
                    z12 = z18;
                    z13 = z10;
                    j11 = j10;
                    u6Var2 = u6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        c1(y9Var2, y9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        a1(y9Var2, y9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(y9Var2, kb1.x(160, 160, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = d;
                    z13 = z10;
                    j11 = j10;
                    u6Var2 = u6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            y9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            z12 = z18;
                            y9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction2.photo)), "100_100", null, null);
                            str = "";
                        } else {
                            z12 = z18;
                            y9Var2.setRoundRadius(AndroidUtilities.dp(50.0f));
                            if (z12) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z13) {
                                str2 = "";
                                j12 = j11;
                                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9();
                                if (j12 < 0) {
                                    str = str2;
                                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j12));
                                    j9Var.r(user2);
                                    y9Var2.f(user2, j9Var);
                                } else {
                                    str = str2;
                                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j12));
                                    j9Var.q(chat2);
                                    y9Var2.f(chat2, j9Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            str2 = "";
                            j12 = DialogObject.getPeerDialogId(peer);
                            org.telegram.ui.Components.j9 j9Var2 = new org.telegram.ui.Components.j9();
                            if (j12 < 0) {
                            }
                        }
                        linearLayout.addView(y9Var2, kb1.x(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z12 = z18;
                        ar a11 = org.telegram.ui.Cells.z6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int dp5 = AndroidUtilities.dp(40.0f);
                        int dp6 = AndroidUtilities.dp(40.0f);
                        a11.e = dp5;
                        a11.f = dp6;
                        y9Var2.setImageDrawable(a11);
                    }
                } else {
                    y9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.photo.sizes, AndroidUtilities.dp(100.0f), true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, AndroidUtilities.dp(100.0f), true), messageMedia3.document);
                    } else {
                        imageLocation = null;
                        y9Var2.l(imageLocation, "100_100", null, null, null, 0);
                        d.addView(y9Var2, kb1.x(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: bi.la
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                                long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i36 = 0; i36 < starsTransaction5.extended_media.size(); i36++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i36);
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
                                PhotoViewer.v1().N2(null, LaunchActivity.R(), u6Var);
                                PhotoViewer.v1().e2(arrayList3, 0, peerDialogId7, 0L, 0L, new ub(y9Var2, d, peerDialogId7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        u6Var2 = u6Var;
                        i11 = i10;
                        linearLayout = d;
                        j11 = j10;
                        y9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z12 = z18;
                    }
                    imageLocation = forDocument;
                    y9Var2.l(imageLocation, "100_100", null, null, null, 0);
                    d.addView(y9Var2, kb1.x(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: bi.la
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z10;
                            TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                            long peerDialogId7 = z20 ? j10 : DialogObject.getPeerDialogId(starsTransaction5.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i36 = 0; i36 < starsTransaction5.extended_media.size(); i36++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i36);
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
                            PhotoViewer.v1().N2(null, LaunchActivity.R(), u6Var);
                            PhotoViewer.v1().e2(arrayList3, 0, peerDialogId7, 0L, 0L, new ub(y9Var2, d, peerDialogId7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    u6Var2 = u6Var;
                    i11 = i10;
                    linearLayout = d;
                    j11 = j10;
                    y9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z18;
                }
                TextView textView = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.y6.j5;
                org.telegram.messenger.t.r(textView, i12, u6Var2, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(M0(i11, z13, starsTransaction2));
                TextView e = wh.e(linearLayout, textView, kb1.x(-1, -2, 17, 36, 0, 36, 4), context2);
                e.setTextSize(1, 18.0f);
                e.setTypeface(AndroidUtilities.bold());
                e.setGravity(17);
                org.telegram.ui.ActionBar.f7.V(e, !positive ? org.telegram.ui.ActionBar.y6.uj : org.telegram.ui.ActionBar.y6.wj, u6Var2);
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                e.setText(W0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, H0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(e.getText());
                if (!starsTransaction2.refund) {
                    E0(spannableStringBuilder4, e, LocaleController.getString(R.string.StarsRefunded));
                } else if (starsTransaction2.failed) {
                    org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.wj, u6Var2);
                    E0(spannableStringBuilder4, e, LocaleController.getString(R.string.StarsFailed));
                } else if (starsTransaction2.pending) {
                    org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.yj, u6Var2);
                    E0(spannableStringBuilder4, e, LocaleController.getString(R.string.StarsPending));
                }
                e.setText(spannableStringBuilder4);
                linearLayout.addView(e, kb1.x(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    aa0 aa0Var4 = new aa0(context2);
                    org.telegram.ui.ActionBar.f7.V(aa0Var4, i12, u6Var2);
                    aa0Var4.setTextSize(1, 14.0f);
                    aa0Var4.setGravity(17);
                    org.telegram.ui.ActionBar.f7.H(aa0Var4, org.telegram.ui.ActionBar.y6.gc, u6Var2);
                    aa0Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsTransactionMessageFeeInfo, hi.k.F0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j11 == UserConfig.getInstance(i11).getClientUserId() || ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), 2)) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionMessageFeeInfoLink).replace(' ', (char) 160), new qa(j11, i11, 0)), true));
                    }
                    aa0Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(aa0Var4, kb1.x(-1, -2, 17, 36, 0, 36, 4));
                    k3VarArr2 = k3VarArr;
                    f7 = 16.0f;
                    x01 x01Var102 = new x01(context2, u6Var2);
                    starGift = starsTransaction2.stargift;
                    int i192 = 5;
                    if (starGift == null) {
                    }
                    x01Var5 = x01Var3;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    x01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322222 = viewGroup;
                    viewGroup322222.addView(x01Var5, kb1.o(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    fi.d dVar22222 = new fi.d(context4, u6Var3);
                    dVar22222.f();
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    viewGroup322222.addView(dVar22222, kb1.o(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.k3 k3Var322222 = k3Var;
                    k3Var322222.customView = viewGroup322222;
                    k3VarArr4[r13] = k3Var322222;
                    k3Var322222.useBackgroundTopPadding = r13;
                    if ((starsTransaction4.flags & 32) == 0) {
                    }
                    k3VarArr4[r13].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                    }
                    k3VarArr4[r13].show();
                    return k3VarArr4[r13];
                }
                if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z19 || starsTransaction2.gift)) {
                    TLRPC.User user3 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.sent_by)));
                    TLRPC.User user4 = starsTransaction2.sent_by == null ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(DialogObject.getPeerDialogId(starsTransaction2.received_by)));
                    boolean isUserSelf = UserObject.isUserSelf(user3);
                    if (isUserSelf) {
                        org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.G6, u6Var2);
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i13 = 1;
                        e.setText(W0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(H0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i13 = 1;
                    }
                    aa0 aa0Var5 = new aa0(context2);
                    org.telegram.ui.ActionBar.f7.V(aa0Var5, i12, u6Var2);
                    f7 = 16.0f;
                    aa0Var5.setTextSize(i13, 16.0f);
                    aa0Var5.setGravity(17);
                    org.telegram.ui.ActionBar.f7.H(aa0Var5, org.telegram.ui.ActionBar.y6.gc, u6Var2);
                    aa0Var5.setDisablePaddingsOffsetY(i13);
                    if (isUserSelf) {
                        int i36 = R.string.ActionGiftStarsSubtitle;
                        Object[] objArr = new Object[i13];
                        objArr[0] = UserObject.getForcedFirstName(user4);
                        string = LocaleController.formatString(i36, objArr);
                    } else {
                        string = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                    }
                    k3VarArr2 = k3VarArr;
                    aa0Var5.setText(TextUtils.concat(AndroidUtilities.replaceTags(string), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new ta(context2, k3VarArr2)), true)));
                    linearLayout.addView(aa0Var5, kb1.x(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    k3VarArr2 = k3VarArr;
                    f7 = 16.0f;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        org.telegram.ui.ActionBar.f7.V(textView2, i12, u6Var2);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, kb1.x(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                x01 x01Var1022 = new x01(context2, u6Var2);
                starGift = starsTransaction2.stargift;
                int i1922 = 5;
                if (starGift == null) {
                }
                x01Var5 = x01Var3;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                x01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup3222222 = viewGroup;
                viewGroup3222222.addView(x01Var5, kb1.o(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                fi.d dVar222222 = new fi.d(context4, u6Var3);
                dVar222222.f();
                if ((starsTransaction4.flags & 32) == 0) {
                }
                viewGroup3222222.addView(dVar222222, kb1.o(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.k3 k3Var3222222 = k3Var;
                k3Var3222222.customView = viewGroup3222222;
                k3VarArr4[r13] = k3Var3222222;
                k3Var3222222.useBackgroundTopPadding = r13;
                if ((starsTransaction4.flags & 32) == 0) {
                }
                k3VarArr4[r13].fixNavigationBar();
                U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet()) {
                }
                k3VarArr4[r13].show();
                return k3VarArr4[r13];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                y9Var2.setImageDrawable(new q6(y9Var2, starsTransaction.stargift, 94, 0.44f));
                d.addView(y9Var2, kb1.x(94, 94, 17, 0, 2, 0, 10));
            } else {
                Z0(y9Var2.getImageReceiver(), starsTransaction.stargift, 160);
                d.addView(y9Var2, kb1.x(160, 160, 17, 0, -8, 0, 10));
            }
        }
        u6Var2 = u6Var;
        context2 = context;
        i11 = i10;
        starsTransaction2 = starsTransaction;
        linearLayout = d;
        str = "";
        z12 = z18;
        z13 = z10;
        j11 = j10;
        TextView textView3 = new TextView(context2);
        i12 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.messenger.t.r(textView3, i12, u6Var2, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(M0(i11, z13, starsTransaction2));
        TextView e10 = wh.e(linearLayout, textView3, kb1.x(-1, -2, 17, 36, 0, 36, 4), context2);
        e10.setTextSize(1, 18.0f);
        e10.setTypeface(AndroidUtilities.bold());
        e10.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(e10, !positive ? org.telegram.ui.ActionBar.y6.uj : org.telegram.ui.ActionBar.y6.wj, u6Var2);
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        e10.setText(W0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, H0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(e10.getText());
        if (!starsTransaction2.refund) {
        }
        e10.setText(spannableStringBuilder42);
        linearLayout.addView(e10, kb1.x(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        k3VarArr2 = k3VarArr;
        f7 = 16.0f;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            org.telegram.ui.ActionBar.f7.V(textView22, i12, u6Var2);
            textView22.setTextSize(1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, kb1.x(-1, -2, 17, 36, 0, 36, 4));
        }
        x01 x01Var10222 = new x01(context2, u6Var2);
        starGift = starsTransaction2.stargift;
        int i19222 = 5;
        if (starGift == null) {
        }
        x01Var5 = x01Var3;
        starsTransactionPeer = starsTransaction4.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z14 = z15;
        if (!TextUtils.isEmpty(starsTransaction4.id)) {
        }
        if (starsTransaction4.floodskip) {
        }
        x01Var5.d(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsTransaction4.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsTransaction4.date * 1000))), LocaleController.getString(R.string.StarsTransactionDate));
        starGift2 = starsTransaction4.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup32222222 = viewGroup;
        viewGroup32222222.addView(x01Var5, kb1.o(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction4.flags & 32) != 0) {
        }
        if (z14) {
        }
        fi.d dVar2222222 = new fi.d(context4, u6Var3);
        dVar2222222.f();
        if ((starsTransaction4.flags & 32) == 0) {
        }
        viewGroup32222222.addView(dVar2222222, kb1.o(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.k3 k3Var32222222 = k3Var;
        k3Var32222222.customView = viewGroup32222222;
        k3VarArr4[r13] = k3Var32222222;
        k3Var32222222.useBackgroundTopPadding = r13;
        if ((starsTransaction4.flags & 32) == 0) {
        }
        k3VarArr4[r13].fixNavigationBar();
        U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet()) {
        }
        k3VarArr4[r13].show();
        return k3VarArr4[r13];
    }

    public static void h1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.u6 u6Var) {
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
        g1(activity, false, 0L, i10, starsTransaction, u6Var);
    }

    public static void i1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.u6 u6Var) {
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
        g1(context, false, 0L, i10, starsTransaction, u6Var);
    }

    public static CharSequence o1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        y4.o c10;
        if (z10 && c3.h0.t(spannableStringBuilder)) {
            for (zq zqVar : (zq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zq.class)) {
                Drawable drawable = zqVar.drawable;
                if (drawable != null && !(drawable instanceof y4.o) && (c10 = y4.o.c(ApplicationLoader.applicationContext.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c10.setBounds(zqVar.drawable.getBounds());
                    zqVar.drawable = c10;
                    zqVar.recolorDrawable = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ void w0(dd ddVar, Context context) {
        if (MessagesController.getInstance(ddVar.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(ddVar.currentAccount);
        } else {
            new uc(context, ddVar.resourceProvider).show();
        }
    }

    public static void x0(dd ddVar) {
        ca.y(ddVar.currentAccount, false).u();
        vg.n1.e0(1, BirthdayController.getInstance(ddVar.currentAccount).getState());
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
    public static void y0(dd ddVar, int i10) {
        u61 G;
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
        x01 x01Var;
        long j11;
        TLRPC.Chat chat3;
        boolean z12;
        String str3;
        boolean z13;
        long currentTime;
        xb xbVar;
        final org.telegram.ui.ActionBar.k3[] k3VarArr;
        final int i13;
        ?? r52;
        org.telegram.ui.ActionBar.r2 U;
        fc fcVar = ddVar.u0;
        if (fcVar == null || (G = fcVar.G(i10)) == null) {
            return;
        }
        int i14 = G.d;
        int i15 = 1;
        if (i14 == -1) {
            ddVar.u0.O(true);
            return;
        }
        if (i14 == -2) {
            ca.y(ddVar.currentAccount, false).u();
            vg.n1.e0(1, BirthdayController.getInstance(ddVar.currentAccount).getState());
            return;
        }
        if (i14 == -3) {
            ca.y(ddVar.currentAccount, false).W();
            ddVar.u0.O(true);
            return;
        }
        if (i14 == -4) {
            if (MessagesController.getInstance(ddVar.currentAccount).isFrozen()) {
                org.telegram.ui.b.b(ddVar.currentAccount);
                return;
            } else {
                ddVar.presentFragment(new hi.d4(ddVar.getUserConfig().getClientUserId()));
                return;
            }
        }
        if (G.H(oc.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                ca.y(ddVar.currentAccount, false).f(ddVar.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new m5(i15, ddVar, G), null);
                return;
            }
            return;
        }
        if (G.H(vc.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            final Activity parentActivity = ddVar.getParentActivity();
            int i16 = ddVar.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.u6 resourceProvider = ddVar.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) parentActivity, resourceProvider, false);
            k3Var.fixNavigationBar();
            org.telegram.ui.ActionBar.k3[] k3VarArr2 = new org.telegram.ui.ActionBar.k3[1];
            LinearLayout f7 = org.telegram.messenger.t.f(parentActivity, 1);
            f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            f7.addView(frameLayout, kb1.x(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr3 = new boolean[1];
            xb xbVar2 = new xb(zArr3, k3VarArr2);
            NotificationCenter.getInstance(i16).addObserver(xbVar2, NotificationCenter.starSubscriptionsLoaded);
            long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
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
                y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
                zArr2 = zArr;
                y9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "100_100", null, null);
            } else {
                zArr2 = zArr;
                y9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                if (i11 < 0) {
                    chat2 = chat5;
                    str2 = str;
                    TLRPC.Chat chat6 = MessagesController.getInstance(i16).getChat(Long.valueOf(-peerDialogId));
                    j9Var.q(chat6);
                    y9Var.f(chat6, j9Var);
                    frameLayout.addView(y9Var, kb1.i(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    org.telegram.ui.ActionBar.f7.y(frameLayout, drawable, org.telegram.ui.ActionBar.y6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, kb1.i(28, 28, 17));
                        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, kb1.i(28, 28, 17));
                        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
                        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.j5, resourceProvider, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
                    }
                    f7.addView(textView, kb1.x(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.B6, resourceProvider);
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i12 = tL_starsSubscriptionPricing.period;
                    if (i12 != 2592000) {
                        j10 = peerDialogId;
                        textView2.setText(W0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f, null));
                    } else {
                        j10 = peerDialogId;
                        textView2.setText(W0(false, LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount), i12 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    f7.addView(textView2, kb1.x(-1, -2, 17, 20, 0, 20, 4));
                    x01Var = new x01(parentActivity, resourceProvider);
                    aa0 aa0Var = new aa0(parentActivity, resourceProvider);
                    aa0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                    aa0Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i18 = org.telegram.ui.ActionBar.y6.gc;
                    org.telegram.ui.ActionBar.f7.V(aa0Var, i18, resourceProvider);
                    org.telegram.ui.ActionBar.f7.H(aa0Var, i18, resourceProvider);
                    aa0Var.setTextSize(1, 14.0f);
                    aa0Var.setSingleLine(true);
                    aa0Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(aa0Var, 24.0f, i16);
                    if (i11 < 0) {
                        TLRPC.User user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(j10));
                        boolean z14 = user2 == null || UserObject.isDeleted(user2);
                        String userName2 = UserObject.getUserName(user2);
                        j5Var.e(user2);
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
                        j5Var.b(chat7);
                        str3 = str4;
                    }
                    z13 = z12;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
                    spannableStringBuilder.setSpan(j5Var, 0, 1, 33);
                    spannableStringBuilder.setSpan(new yb(k3VarArr2, j11), 3, spannableStringBuilder.length(), 33);
                    aa0Var.setText(spannableStringBuilder);
                    if (!z13) {
                        x01Var.l(aa0Var, LocaleController.getString(i11 < 0 ? R.string.StarsSubscriptionChannel : z10 ? R.string.StarsSubscriptionBusiness : R.string.StarsSubscriptionBot));
                    }
                    if (i11 >= 0 && !TextUtils.isEmpty(starsSubscription.title)) {
                        x01Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
                    }
                    x01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
                    x01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    f7.addView(x01Var, kb1.o(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    aa0 aa0Var2 = new aa0(parentActivity, resourceProvider);
                    int i19 = org.telegram.ui.ActionBar.y6.z6;
                    org.telegram.ui.ActionBar.f7.V(aa0Var2, i19, resourceProvider);
                    org.telegram.ui.ActionBar.f7.H(aa0Var2, i18, resourceProvider);
                    aa0Var2.setTextSize(1, 14.0f);
                    final int i20 = 0;
                    aa0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: bi.kb
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i21 = i20;
                            Activity activity = parentActivity;
                            switch (i21) {
                                case 0:
                                    qf.d.r(activity, LocaleController.getString(R.string.StarsTOSLink));
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
                                                        handler.post(new k9.u(11, cVar, obj2));
                                                        try {
                                                            if (i22 == 26 || i22 == 27) {
                                                                Boolean bool = Boolean.FALSE;
                                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                            } else {
                                                                activity.recreate();
                                                            }
                                                            handler.post(new k9.u(12, application, cVar));
                                                            break;
                                                        } catch (Throwable th2) {
                                                            handler.post(new k9.u(12, application, cVar));
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
                    aa0Var2.setGravity(17);
                    f7.addView(aa0Var2, kb1.o(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        xbVar = xbVar2;
                        k3VarArr = k3VarArr2;
                        i13 = i16;
                        aa0 aa0Var3 = new aa0(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.f7.V(aa0Var3, i19, resourceProvider);
                        org.telegram.ui.ActionBar.f7.H(aa0Var3, i18, resourceProvider);
                        aa0Var3.setTextSize(1, 14.0f);
                        aa0Var3.setText(LocaleController.formatString(R.string.StarsSubscriptionExpiredInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        aa0Var3.setSingleLine(false);
                        aa0Var3.setMaxLines(4);
                        aa0Var3.setGravity(17);
                        f7.addView(aa0Var3, kb1.o(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            fi.d dVar = new fi.d(parentActivity, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r52 = 0;
                            dVar.i(LocaleController.getString(R.string.StarsSubscriptionAgain), false, true);
                            f7.addView(dVar, kb1.r(-1, 48));
                            dVar.setOnClickListener(new ob(dVar, starsSubscription, i13, k3VarArr, resourceProvider, zArr2, parentActivity));
                            k3Var.customView = f7;
                            k3VarArr[r52] = k3Var;
                            k3Var.useBackgroundTopPadding = r52;
                            k3Var.setOnDismissListener(new pb(i13, xbVar));
                            k3VarArr[r52].fixNavigationBar();
                            U = LaunchActivity.U();
                            if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
                                k3VarArr[r52].makeAttached(U);
                            }
                            k3VarArr[r52].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        aa0 aa0Var4 = new aa0(parentActivity, resourceProvider);
                        org.telegram.ui.ActionBar.f7.V(aa0Var4, i19, resourceProvider);
                        org.telegram.ui.ActionBar.f7.H(aa0Var4, i18, resourceProvider);
                        aa0Var4.setTextSize(1, 14.0f);
                        aa0Var4.setText(LocaleController.formatString(z11 ? R.string.StarsSubscriptionBotRefulfillInfo : R.string.StarsSubscriptionRefulfillInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                        aa0Var4.setSingleLine(false);
                        aa0Var4.setMaxLines(4);
                        aa0Var4.setGravity(17);
                        f7.addView(aa0Var4, kb1.o(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        fi.d dVar2 = new fi.d(parentActivity, resourceProvider, true);
                        dVar2.i(LocaleController.getString(z11 ? R.string.StarsSubscriptionBotRefulfill : R.string.StarsSubscriptionRefulfill), false, true);
                        f7.addView(dVar2, kb1.r(-1, 48));
                        xbVar = xbVar2;
                        k3VarArr = k3VarArr2;
                        lb lbVar = new lb(dVar2, i16, starsSubscription, k3VarArr, j11, parentActivity, resourceProvider, z10, str2);
                        i13 = i16;
                        dVar2.setOnClickListener(lbVar);
                    } else {
                        xbVar = xbVar2;
                        k3VarArr = k3VarArr2;
                        final boolean z15 = z10;
                        i13 = i16;
                        if (starsSubscription.bot_canceled) {
                            aa0 aa0Var5 = new aa0(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.f7.V(aa0Var5, org.telegram.ui.ActionBar.y6.wj, resourceProvider);
                            org.telegram.ui.ActionBar.f7.H(aa0Var5, i18, resourceProvider);
                            aa0Var5.setTextSize(1, 14.0f);
                            aa0Var5.setText(LocaleController.getString(z15 ? R.string.StarsSubscriptionBusinessCancelledText : R.string.StarsSubscriptionBotCancelledText));
                            aa0Var5.setSingleLine(false);
                            aa0Var5.setMaxLines(4);
                            aa0Var5.setGravity(17);
                            f7.addView(aa0Var5, kb1.o(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            aa0 aa0Var6 = new aa0(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.f7.V(aa0Var6, org.telegram.ui.ActionBar.y6.wj, resourceProvider);
                            org.telegram.ui.ActionBar.f7.H(aa0Var6, i18, resourceProvider);
                            aa0Var6.setTextSize(1, 14.0f);
                            aa0Var6.setText(LocaleController.getString(R.string.StarsSubscriptionCancelledText));
                            aa0Var6.setSingleLine(false);
                            aa0Var6.setMaxLines(4);
                            aa0Var6.setGravity(17);
                            f7.addView(aa0Var6, kb1.o(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                fi.d dVar3 = new fi.d(parentActivity, resourceProvider, true);
                                dVar3.i(LocaleController.getString(R.string.StarsSubscriptionRenew), false, true);
                                f7.addView(dVar3, kb1.r(-1, 48));
                                dVar3.setOnClickListener(new mb(dVar3, starsSubscription, i13, k3VarArr, chat3, str2));
                            }
                        } else {
                            final TLRPC.Chat chat8 = chat3;
                            aa0 aa0Var7 = new aa0(parentActivity, resourceProvider);
                            org.telegram.ui.ActionBar.f7.V(aa0Var7, i19, resourceProvider);
                            org.telegram.ui.ActionBar.f7.H(aa0Var7, i18, resourceProvider);
                            aa0Var7.setTextSize(1, 14.0f);
                            aa0Var7.setText(LocaleController.formatString(R.string.StarsSubscriptionCancelInfo, LocaleController.formatDateChat(starsSubscription.until_date)));
                            aa0Var7.setSingleLine(false);
                            aa0Var7.setMaxLines(4);
                            aa0Var7.setGravity(17);
                            f7.addView(aa0Var7, kb1.o(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final fi.d dVar4 = new fi.d(parentActivity, resourceProvider, false);
                            dVar4.i(LocaleController.getString(R.string.StarsSubscriptionCancel), false, true);
                            dVar4.setTextColorKey(org.telegram.ui.ActionBar.y6.wj);
                            f7.addView(dVar4, kb1.r(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: bi.nb
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final fi.d dVar5 = dVar4;
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
                                    final org.telegram.ui.ActionBar.k3[] k3VarArr3 = k3VarArr;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: bi.qb
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            AndroidUtilities.runOnUIThread(new rb(i21, dVar5, tLObject, starsSubscription2, z16, z17, k3VarArr3));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r52 = 0;
                    k3Var.customView = f7;
                    k3VarArr[r52] = k3Var;
                    k3Var.useBackgroundTopPadding = r52;
                    k3Var.setOnDismissListener(new pb(i13, xbVar));
                    k3VarArr[r52].fixNavigationBar();
                    U = LaunchActivity.U();
                    if (!AndroidUtilities.isTablet()) {
                        k3VarArr[r52].makeAttached(U);
                    }
                    k3VarArr[r52].show();
                }
                TLRPC.User user3 = MessagesController.getInstance(i16).getUser(Long.valueOf(peerDialogId));
                j9Var.r(user3);
                y9Var.f(user3, j9Var);
            }
            chat2 = chat5;
            str2 = str;
            frameLayout.addView(y9Var, kb1.i(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.f7.y(frameLayout, drawable3, org.telegram.ui.ActionBar.y6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.messenger.t.r(textView3, org.telegram.ui.ActionBar.y6.j5, resourceProvider, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            f7.addView(textView3, kb1.x(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            org.telegram.ui.ActionBar.f7.V(textView22, org.telegram.ui.ActionBar.y6.B6, resourceProvider);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i12 = tL_starsSubscriptionPricing2.period;
            if (i12 != 2592000) {
            }
            f7.addView(textView22, kb1.x(-1, -2, 17, 20, 0, 20, 4));
            x01Var = new x01(parentActivity, resourceProvider);
            aa0 aa0Var8 = new aa0(parentActivity, resourceProvider);
            aa0Var8.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
            aa0Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i182 = org.telegram.ui.ActionBar.y6.gc;
            org.telegram.ui.ActionBar.f7.V(aa0Var8, i182, resourceProvider);
            org.telegram.ui.ActionBar.f7.H(aa0Var8, i182, resourceProvider);
            aa0Var8.setTextSize(1, 14.0f);
            aa0Var8.setSingleLine(true);
            aa0Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.j5 j5Var2 = new org.telegram.ui.j5(aa0Var8, 24.0f, i16);
            if (i11 < 0) {
            }
            z13 = z12;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str3));
            spannableStringBuilder2.setSpan(j5Var2, 0, 1, 33);
            spannableStringBuilder2.setSpan(new yb(k3VarArr2, j11), 3, spannableStringBuilder2.length(), 33);
            aa0Var8.setText(spannableStringBuilder2);
            if (!z13) {
            }
            if (i11 >= 0) {
                x01Var.c(LocaleController.getString(!z10 ? R.string.StarsSubscriptionBusinessProduct : R.string.StarsSubscriptionBotProduct), starsSubscription.title, null, null);
            }
            x01Var.c(LocaleController.getString(R.string.StarsSubscriptionSince), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
            x01Var.c(LocaleController.getString((!starsSubscription.canceled || starsSubscription.bot_canceled) ? R.string.StarsSubscriptionUntilExpires : currentTime > ((long) starsSubscription.until_date) ? R.string.StarsSubscriptionUntilExpired : R.string.StarsSubscriptionUntilRenews), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(starsSubscription.until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(starsSubscription.until_date * 1000))), null, null);
            f7.addView(x01Var, kb1.o(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            aa0 aa0Var22 = new aa0(parentActivity, resourceProvider);
            int i192 = org.telegram.ui.ActionBar.y6.z6;
            org.telegram.ui.ActionBar.f7.V(aa0Var22, i192, resourceProvider);
            org.telegram.ui.ActionBar.f7.H(aa0Var22, i182, resourceProvider);
            aa0Var22.setTextSize(1, 14.0f);
            final int i202 = 0;
            aa0Var22.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() { // from class: bi.kb
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i21 = i202;
                    Activity activity = parentActivity;
                    switch (i21) {
                        case 0:
                            qf.d.r(activity, LocaleController.getString(R.string.StarsTOSLink));
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
                                                handler.post(new k9.u(11, cVar, obj2));
                                                try {
                                                    if (i22 == 26 || i22 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity.recreate();
                                                    }
                                                    handler.post(new k9.u(12, application, cVar));
                                                    break;
                                                } catch (Throwable th2) {
                                                    handler.post(new k9.u(12, application, cVar));
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
            aa0Var22.setGravity(17);
            f7.addView(aa0Var22, kb1.o(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r52 = 0;
            k3Var.customView = f7;
            k3VarArr[r52] = k3Var;
            k3Var.useBackgroundTopPadding = r52;
            k3Var.setOnDismissListener(new pb(i13, xbVar));
            k3VarArr[r52].fixNavigationBar();
            U = LaunchActivity.U();
            if (!AndroidUtilities.isTablet()) {
            }
            k3VarArr[r52].show();
        }
    }

    public static void z0(dd ddVar, u61 u61Var, Boolean bool, String str) {
        if (ddVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            org.telegram.ui.Components.wc.b0(ddVar).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) u61Var.B, new Object[0])), R.raw.stars_topup).j();
            ddVar.h0.c(true);
            ca.y(ddVar.currentAccount, false).T(true);
        } else if (str != null) {
            ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.wc.b0(ddVar), R.raw.error, 36);
        }
    }

    public final void F0() {
        m1();
        nm0 nm0Var = this.c;
        if (nm0Var == null || this.U == null || nm0Var.getLayoutParams() == null) {
            return;
        }
        int g7 = org.telegram.ui.d3.g(48.0f, this.b0, -AndroidUtilities.dp(8.0f));
        int g10 = org.telegram.ui.d3.g(48.0f, this.c0, -AndroidUtilities.dp(8.0f));
        AndroidUtilities.setViewLayoutMargins(this.c, 0, g7, 0, g10);
        nm0 nm0Var2 = this.c;
        int i10 = -g7;
        nm0Var2.setPadding(nm0Var2.getPaddingLeft(), i10, this.c.getPaddingRight(), this.c0 - g10);
        this.U.z(i10, -g10);
    }

    public final void G0(ArrayList arrayList, k71 k71Var) {
        nm0 nm0Var;
        j1("FILL_BEFORE");
        mw0 mw0Var = this.U;
        boolean z10 = mw0Var != null && mw0Var.e0;
        this.a0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        ca y3 = ca.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        b20 b20Var = (b20) super.k0(getParentActivity());
        u61 u61Var = new u61(-2);
        u61Var.c = b20Var;
        arrayList.add(u61Var);
        arrayList.add(u61.k(this.i0));
        fi.d dVar = this.r0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().starsGiftsEnabled ? 0 : 8);
        }
        arrayList.add(u61.C(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(hi.g.a(-4, getThemedColor(org.telegram.ui.ActionBar.y6.uj), R.drawable.filled_earn_stars, oo.e0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(u61.C(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            ic.a.p(R.string.StarMySubscriptions, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = vc.a;
                u61 K = u61.K(vc.class);
                K.G = starsSubscription;
                arrayList.add(K);
            }
            if (y3.x) {
                arrayList.add(u61.q(arrayList.size(), 33));
            } else if (!y3.y) {
                u61 c10 = u61.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(u61.C(null));
        }
        boolean O = y3.O(0);
        this.s0 = O;
        if (O) {
            this.a0 = arrayList.size();
            arrayList.add(u61.n(this.V, -2));
            if (z10 && (nm0Var = this.c) != null) {
                u6 u6Var = this.f0;
                nm0Var.removeCallbacks(u6Var);
                this.c.post(u6Var);
            }
        } else {
            arrayList.add(u61.m(this.g0));
        }
        j1("FILL_AFTER");
    }

    @Override // org.telegram.ui.f20, org.telegram.ui.ActionBar.r2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        mw0 mw0Var = new mw0(context);
        this.U = mw0Var;
        mw0Var.setDebugLoggingEnabled(true);
        this.U.setCommonInsetsManagedExternally(true);
        if (!this.d0) {
            org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
            this.b0 = (j5Var == null || !((ActionBarLayout) j5Var).S0) ? AndroidUtilities.statusBarHeight : 0;
            this.c0 = AndroidUtilities.navigationBarHeight;
        }
        this.U.setGeometry(new rb.c(this, 10));
        this.U.z(-org.telegram.ui.d3.g(48.0f, this.b0, -AndroidUtilities.dp(8.0f)), -org.telegram.ui.d3.g(48.0f, this.c0, -AndroidUtilities.dp(8.0f)));
        mw0 mw0Var2 = this.U;
        mw0Var2.getClass();
        this.V = new cc(mw0Var2, context, 24);
        this.T = new cd(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.g0 = new cc(this, context, 0);
        super.createView(context);
        e20 e20Var = this.s;
        getBaseSimpleGlass().e(e20Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.y.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().h = this.U;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().i = new g(1, this, new f(1, e20Var));
        View view = this.T.d;
        View view2 = new View(getParentActivity());
        this.W = view2;
        view2.setAlpha(0.0f);
        mw0 mw0Var3 = this.U;
        mw0Var3.addView(this.W, mw0Var3.indexOfChild(view), kb1.i(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        ab abVar = new ab(this, 0);
        ds dsVar = ds.h;
        oe.b bVar = new oe.b(0, abVar, dsVar, 380L, false);
        this.X = bVar;
        this.Y = new oe.b(1, new ab(this, 1), dsVar, 380L, false);
        this.Z = new oe.b(2, new ab(this, 2), dsVar, 380L, false);
        bVar.a(this.c.canScrollVertically(-1) || this.simpleActionBar.o(), false);
        this.Y.a(this.U.e0, false);
        this.c.j(new ai.b(this, 6));
        m1();
        eh.d c10 = getBaseSimpleGlass().c.c(view, null, false);
        c10.v(gh.c.m(this.resourceProvider));
        c10.w(AndroidUtilities.dp(9.66f));
        c10.x(AndroidUtilities.dp(18.0f));
        view.setBackground(c10);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.parentLayout;
        if (j5Var2 != null && ((ActionBarLayout) j5Var2).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        ug.n nVar = new ug.n(context, 1, 2);
        this.S = nVar;
        ug.g gVar = nVar.b;
        gVar.z = org.telegram.ui.ActionBar.y6.fk;
        gVar.A = org.telegram.ui.ActionBar.y6.gk;
        gVar.b();
        this.S.setStarParticlesView(this.e);
        this.R.addView(this.S, kb1.h(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        f0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new ra(context, 1)), true), this.R, null);
        this.c.setOverScrollMode(2);
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(dsVar);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setOnItemClickListener(new ai.k(this, 1));
        z00 z00Var = new z00(getParentActivity());
        this.h0 = z00Var;
        this.s.addView(z00Var, kb1.g(-1.0f, -1));
        ca y3 = ca.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.i0.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(getParentActivity(), false, true, false);
        this.k0 = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        this.k0.setTextSize(AndroidUtilities.dp(32.0f));
        this.k0.setGravity(17);
        org.telegram.ui.ActionBar.f7.Z(this.k0, org.telegram.ui.ActionBar.y6.G6, this.resourceProvider);
        this.j0 = new SpannableStringBuilder("S");
        l70 l70Var = new l70(this.k0, 42.0f, this.currentAccount);
        yj0 yj0Var = new yj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = l70Var.b;
        imageReceiver.setImageBitmap(yj0Var);
        imageReceiver.setAutoRepeat(2);
        l70Var.f = false;
        l70Var.h = -AndroidUtilities.dp(3.0f);
        this.j0.setSpan(l70Var, 0, 1, 33);
        this.i0.addView(this.k0, kb1.h(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.l0 = textView;
        textView.setTextSize(1, 14.0f);
        this.l0.setGravity(17);
        this.l0.setText(LocaleController.getString(R.string.YourStarsBalance));
        org.telegram.ui.ActionBar.f7.V(this.l0, org.telegram.ui.ActionBar.y6.z6, this.resourceProvider);
        this.i0.addView(this.l0, kb1.h(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        bh.r rVar = new bh.r(this, getParentActivity(), 2);
        this.n0 = rVar;
        frameLayout2.addView(rVar);
        fi.d dVar = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.o0 = dVar;
        dVar.f();
        this.o0.i("", false, true);
        final int i10 = 0;
        this.o0.setOnClickListener(new View.OnClickListener(this) { // from class: bi.xa
            public final /* synthetic */ dd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        dd.w0(this.b, context);
                        break;
                    default:
                        new uc(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.n0.addView(this.o0, kb1.i(-1, 48, 119));
        za1 za1Var = new za1(this, getParentActivity(), 3);
        this.p0 = za1Var;
        frameLayout2.addView(za1Var);
        fi.d dVar2 = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.q0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new zq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.q0.i(spannableStringBuilder, false, true);
        final int i11 = 1;
        this.q0.setOnClickListener(new View.OnClickListener(this) { // from class: bi.xa
            public final /* synthetic */ dd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        dd.w0(this.b, context);
                        break;
                    default:
                        new uc(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.p0.addView(this.q0, kb1.t(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        fi.d dVar3 = new fi.d(getParentActivity(), this.resourceProvider, true);
        this.m0 = dVar3;
        dVar3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new zq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.m0.i(spannableStringBuilder2, false, true);
        final int i12 = 0;
        this.m0.setOnClickListener(new View.OnClickListener(this) { // from class: bi.ya
            public final /* synthetic */ dd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i12) {
                    case 0:
                        dd ddVar = this.b;
                        ddVar.presentFragment(new y(0, ddVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        dd.x0(this.b);
                        break;
                }
            }
        });
        this.p0.addView(this.m0, kb1.t(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.i0.addView(frameLayout2, kb1.h(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        fi.d dVar4 = new fi.d(getParentActivity(), this.resourceProvider, false);
        this.r0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new zq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.r0.i(spannableStringBuilder3, false, true);
        final int i13 = 1;
        this.r0.setOnClickListener(new View.OnClickListener(this) { // from class: bi.ya
            public final /* synthetic */ dd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        dd ddVar = this.b;
                        ddVar.presentFragment(new y(0, ddVar.getUserConfig().getClientUserId()));
                        break;
                    default:
                        dd.x0(this.b);
                        break;
                }
            }
        });
        this.i0.addView(this.r0, kb1.h(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        fc fcVar = this.u0;
        if (fcVar != null) {
            fcVar.O(false);
        }
        m0.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = m0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1(y3.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.f20
    public final void d0() {
        mw0 mw0Var;
        j1("RESTORE_BEFORE");
        super.d0();
        if (this.e0 && (mw0Var = this.U) != null && this.a0 != -1) {
            mw0Var.a();
        }
        this.e0 = false;
        j1("RESTORE_AFTER");
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        if (i10 == i12 || i10 == NotificationCenter.starSubscriptionsLoaded || i10 == NotificationCenter.starOptionsLoaded) {
            j1("NOTIFICATION_" + i10);
        }
        if (i10 == NotificationCenter.starOptionsLoaded) {
            q0();
            fc fcVar = this.u0;
            if (fcVar != null) {
                fcVar.O(true);
            }
            d0();
            return;
        }
        if (i10 == i12) {
            ca y3 = ca.y(this.currentAccount, false);
            if (this.s0 != y3.O(0)) {
                this.s0 = y3.O(0);
                q0();
                fc fcVar2 = this.u0;
                if (fcVar2 != null) {
                    fcVar2.O(false);
                }
                d0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            fc fcVar3 = this.u0;
            if (fcVar3 != null) {
                fcVar3.O(true);
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

    @Override // org.telegram.ui.f20
    public final void e0() {
        this.s.addView(this.U, kb1.g(-1.0f, -1));
        this.U.u(this.c, new ab(this, 3));
        mw0 mw0Var = this.U;
        cd cdVar = this.T;
        mw0Var.x(cdVar, cdVar.b, new ag.w(29));
        this.U.y(this.T.d);
        this.T.d.setLayoutParams(kb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        F0();
    }

    @Override // org.telegram.ui.f20
    public final s4.h0 g0() {
        fc fcVar = new fc(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 9), getResourceProvider());
        this.u0 = fcVar;
        fcVar.r = false;
        return fcVar;
    }

    @Override // org.telegram.ui.f20
    public final s4.c0 h0(Context context) {
        mw0 mw0Var = this.U;
        mw0Var.getClass();
        return new ig.j0(5, mw0Var, false);
    }

    @Override // org.telegram.ui.f20
    public final tg.x1 i0() {
        return new ec(getParentActivity(), 75, 1);
    }

    @Override // org.telegram.ui.f20, org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        mw0 mw0Var = this.U;
        return mw0Var == null || motionEvent == null || mw0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.b.b == 0;
    }

    public final void j1(String str) {
        if (this.U == null) {
            return;
        }
        StringBuilder v = a1.g.v("Stars event=", str, " row=");
        v.append(this.a0);
        v.append(" hasTransactions=");
        v.append(this.s0);
        v.append(" savedPosition=");
        v.append(this.P);
        v.append(" savedOffset=");
        v.append(this.Q);
        v.append(" savedPinned=");
        v.append(this.e0);
        v.append(" boundaryAttached=");
        cc ccVar = this.V;
        v.append((ccVar == null || ccVar.getParent() == null) ? false : true);
        v.append(" boundaryTop=");
        cc ccVar2 = this.V;
        v.append(ccVar2 == null ? 0 : ccVar2.getTop());
        v.append(" boundaryHeight=");
        cc ccVar3 = this.V;
        v.append(ccVar3 == null ? 0 : ccVar3.getHeight());
        Log.d("SiblingScroll", v.toString());
        mw0 mw0Var = this.U;
        if (mw0Var.a) {
            mw0Var.b = Math.max(mw0Var.b, Math.min(60, Math.max(0, 30)));
            mw0Var.f(str, null, 0, 0, true);
        }
    }

    @Override // org.telegram.ui.f20
    public final View k0(Context context) {
        throw null;
    }

    public final void k1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        ca y3 = ca.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.j0);
        spannableStringBuilder.append((CharSequence) I0(y3.p(), 0.66f, ' '));
        this.k0.setText(spannableStringBuilder);
        this.o0.i(LocaleController.getString(y3.p().amount > 0 ? R.string.StarsBuyMore : R.string.StarsBuy), true, true);
        TLRPC.TL_payments_starsRevenueStats h = m0.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        l1(z10, true);
    }

    public final void l1(final boolean z10, boolean z11) {
        this.t0 = z10;
        if (z11) {
            this.n0.setVisibility(0);
            this.p0.setVisibility(0);
            final int i10 = 0;
            this.n0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: bi.za
                public final /* synthetic */ dd b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            if (z10) {
                                this.b.n0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.p0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final int i11 = 1;
            this.p0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: bi.za
                public final /* synthetic */ dd b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            if (z10) {
                                this.b.n0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.p0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        this.n0.animate().cancel();
        this.p0.animate().cancel();
        this.p0.setAlpha(z10 ? 1.0f : 0.0f);
        this.n0.setAlpha(z10 ? 0.0f : 1.0f);
        this.p0.setVisibility(z10 ? 0 : 8);
        this.n0.setVisibility(z10 ? 8 : 0);
    }

    @Override // org.telegram.ui.f20
    public final float m0() {
        nm0 nm0Var = this.c;
        if (nm0Var == null) {
            return 0.0f;
        }
        return nm0Var.getY();
    }

    public final void m1() {
        if (this.W == null) {
            return;
        }
        int dp = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != dp) {
            layoutParams.height = dp;
            this.W.setLayoutParams(layoutParams);
        }
        n1();
    }

    @Override // org.telegram.ui.f20
    public final View n0() {
        return this.U;
    }

    public final void n1() {
        View view = this.W;
        if (view == null) {
            return;
        }
        oe.b bVar = this.X;
        float f7 = bVar == null ? 0.0f : bVar.e;
        oe.b bVar2 = this.Y;
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - (bVar2 != null ? bVar2.e : 0.0f)) * AndroidUtilities.dp(44.0f)));
    }

    @Override // org.telegram.ui.f20
    public final void o0(boolean z10) {
        oe.b bVar = this.Z;
        if (bVar == null || bVar.f == z10) {
            return;
        }
        bVar.a(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.botStarsUpdated);
        ca.y(this.currentAccount, false).T(true);
        ca.y(this.currentAccount, false).S();
        ca.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        nm0 nm0Var = this.c;
        if (nm0Var != null) {
            nm0Var.removeCallbacks(this.f0);
        }
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // org.telegram.ui.f20, org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.d0 = true;
        this.b0 = i11;
        this.c0 = i13;
        F0();
    }

    @Override // org.telegram.ui.f20, org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        ug.n nVar = this.S;
        if (nVar != null) {
            nVar.setPaused(true);
            this.S.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.f20, org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        ug.n nVar = this.S;
        if (nVar != null) {
            nVar.setPaused(false);
            this.S.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.f20
    public final void q0() {
        j1("SAVE_BEFORE");
        super.q0();
        mw0 mw0Var = this.U;
        this.e0 = mw0Var != null && mw0Var.e0;
        nm0 nm0Var = this.c;
        if (nm0Var != null && this.P >= 0) {
            this.Q -= nm0Var.getPaddingTop();
        }
        j1("SAVE_AFTER");
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
