package jh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.y80;
import org.telegram.ui.f70;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ca extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new ca());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x074a  */
    @Override // org.telegram.ui.Components.v41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        SpannableString spannableString;
        int dp;
        char c3;
        boolean z11;
        boolean z12;
        String str;
        long j10;
        boolean z13;
        da daVar = (da) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) w41Var.G;
        boolean z14 = w41Var.q;
        org.telegram.ui.Components.t9 t9Var = daVar.d;
        SpannableString spannableString2 = daVar.v;
        SpannableString spannableString3 = daVar.w;
        org.telegram.ui.Components.e9 e9Var = daVar.b;
        int i10 = daVar.a;
        TextView textView = daVar.r;
        TextView textView2 = daVar.s;
        org.telegram.ui.Components.t9 t9Var2 = daVar.c;
        TextView textView3 = daVar.f;
        Integer num = 0;
        y80 y80Var = daVar.n;
        long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
        boolean z15 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i11 = starsTransaction.flags;
        boolean z16 = (i11 & 131072) == 0 && (i11 & 65536) != 0;
        boolean z17 = !(peerDialogId == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        daVar.x = z17;
        boolean z18 = z17;
        LinearLayout.LayoutParams layoutParams = daVar.h;
        if (z18) {
            spannableString = spannableString2;
            dp = 0;
        } else {
            spannableString = spannableString2;
            dp = AndroidUtilities.dp(4.33f);
        }
        layoutParams.bottomMargin = dp;
        y80Var.setVisibility(daVar.x ? 0 : 8);
        textView.setTextSize(1, daVar.x ? 13.0f : 14.0f);
        textView.setText(LocaleController.formatShortDateTime(starsTransaction.date));
        if (starsTransaction.refund) {
            c3 = 2;
            textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsRefunded)));
        } else {
            c3 = 2;
            if (starsTransaction.failed) {
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsFailed)));
            } else if (starsTransaction.pending) {
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsPending)));
            }
        }
        t9Var2.setTranslationX(0.0f);
        t9Var2.setTranslationY(0.0f);
        t9Var.setVisibility(8);
        t9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            t9Var2.setImageDrawable(new u4(t9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionUpgraded));
            y80Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            t9Var2.setImageDrawable(new u4(t9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionRemovedDescription));
            y80Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (peerDialogId != 0) {
                    if (UserObject.isService(peerDialogId)) {
                        str = LocaleController.getString(R.string.StarsTransactionUnknown);
                        t9Var2.setImageDrawable(da.a(44, "fragment"));
                        z12 = false;
                    } else if (peerDialogId >= 0) {
                        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                        z12 = user == null;
                        e9Var.r(user);
                        t9Var2.e(user, e9Var);
                        str = UserObject.getUserName(user);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                        z12 = chat == null;
                        e9Var.q(chat);
                        t9Var2.e(chat, e9Var);
                        str = chat == null ? "" : chat.title;
                    }
                    if (starsTransaction.stargift != null) {
                        f70 f70Var = new f70(y80Var, 16.0f, i10);
                        f70Var.a(4.0f);
                        f70Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(f70Var, 0, 1, 33);
                        ia.a1(f70Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(starsTransaction.stargift.getDocument(), y80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftOffer));
                            } else {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftOfferRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            y80Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(starsTransaction.stargift.getDocument(), y80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftPurchase));
                            } else {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftPurchaseRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            y80Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            String string = LocaleController.getString(R.string.Gift2TransactionPrepaidUpgrade);
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = spannableString4;
                            charSequenceArr[1] = " ";
                            charSequenceArr[c3] = string;
                            y80Var.setText(TextUtils.concat(charSequenceArr));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            y80Var.setText(LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftTransferRefund : R.string.StarGiftTransactionGiftTransfer));
                        } else if (starsTransaction.refund) {
                            String string2 = LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionRefundedAuctionBid : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent : R.string.Gift2TransactionRefundedConverted);
                            CharSequence[] charSequenceArr2 = new CharSequence[3];
                            charSequenceArr2[0] = spannableString4;
                            charSequenceArr2[1] = " ";
                            charSequenceArr2[c3] = string2;
                            y80Var.setText(TextUtils.concat(charSequenceArr2));
                        } else {
                            String string3 = LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionAuctionBid : starsTransaction.amount.amount > 0 ? R.string.Gift2TransactionConverted : starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent);
                            CharSequence[] charSequenceArr3 = new CharSequence[3];
                            charSequenceArr3[0] = spannableString4;
                            charSequenceArr3[1] = " ";
                            charSequenceArr3[c3] = string3;
                            y80Var.setText(TextUtils.concat(charSequenceArr3));
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i12 = starsTransaction.subscription_period;
                        if (i12 == 2592000) {
                            y80Var.setVisibility(0);
                            y80Var.setText(LocaleController.getString(R.string.StarsTransactionSubscriptionMonthly));
                        } else {
                            String str2 = i12 == 300 ? "5 minutes" : "Minute";
                            y80Var.setVisibility(0);
                            Locale locale = Locale.US;
                            y80Var.setText(str2.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        y80Var.setVisibility(z12 ? 8 : 0);
                        y80Var.setText(LocaleController.getString(starsTransaction.reaction ? R.string.StarsTransactionLiveStoryReactionFee : R.string.StarsTransactionLiveStoryMessageFee));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        y80Var.setVisibility(z12 ? 8 : 0);
                        y80Var.setText(LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        y80Var.setVisibility(z12 ? 8 : 0);
                        y80Var.setText(LocaleController.getString(R.string.StarsTransactionPremiumGift));
                    } else if (z16) {
                        textView3.setText(str);
                        y80Var.setVisibility(z12 ? 8 : 0);
                        y80Var.setText(LocaleController.formatString(R.string.StarTransactionCommission, ph.j.G0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        y80Var.setVisibility(z12 ? 8 : 0);
                        y80Var.setText(LocaleController.getString(R.string.StarsGiftReceived));
                    } else if ((starsTransaction.flags & 8192) != 0) {
                        textView3.setText(str);
                        y80Var.setVisibility(z12 ? 8 : 0);
                        y80Var.setText(LocaleController.getString(R.string.StarsGiveawayPrizeReceived));
                    } else if (starsTransaction.reaction) {
                        textView3.setText(str);
                        y80Var.setVisibility(z12 ? 8 : 0);
                        y80Var.setText(LocaleController.getString(R.string.StarsReactionsSent));
                    } else if (starsTransaction.extended_media.isEmpty()) {
                        z11 = z15;
                        if (starsTransaction.photo != null) {
                            f70 f70Var2 = new f70(y80Var, 14.0f, i10);
                            f70Var2.a(4.0f);
                            f70Var2.f = false;
                            SpannableString spannableString5 = new SpannableString("x");
                            spannableString5.setSpan(f70Var2, 0, 1, 33);
                            f70Var2.b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction.photo)), "14_14", null, null, num, 0);
                            textView3.setText(str);
                            y80Var.setVisibility(z12 ? 8 : 0);
                            String str3 = starsTransaction.title;
                            y80Var.setText(Emoji.replaceEmoji(TextUtils.concat(spannableString5, " ", str3 != null ? str3 : ""), y80Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            textView3.setText(str);
                            y80Var.setVisibility(z12 ? 8 : 0);
                            String str4 = starsTransaction.title;
                            y80Var.setText(Emoji.replaceEmoji(str4 != null ? str4 : "", y80Var.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        if (z14) {
                            textView3.setText(str);
                            y80Var.setVisibility(0);
                            y80Var.setText(LocaleController.getString(R.string.StarMediaPurchase));
                        } else {
                            textView3.setText(LocaleController.getString(R.string.StarMediaPurchase));
                            y80Var.setVisibility(z12 ? 8 : 0);
                            y80Var.setText(str);
                        }
                        daVar.e = 0;
                        int i13 = 0;
                        while (i13 < Math.min(2, starsTransaction.extended_media.size())) {
                            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i13);
                            org.telegram.ui.Components.t9 t9Var3 = i13 == 0 ? t9Var2 : t9Var;
                            t9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                            ImageLocation forPhoto = messageMedia instanceof TLRPC.TL_messageMediaPhoto ? ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(46.0f), true), messageMedia.photo) : messageMedia instanceof TLRPC.TL_messageMediaDocument ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(46.0f), true), messageMedia.document) : null;
                            t9Var3.setVisibility(0);
                            Integer num2 = num;
                            t9Var3.l(forPhoto, "46_46", null, null, null, num2);
                            daVar.e++;
                            i13++;
                            num = num2;
                            z15 = z15;
                        }
                        z11 = z15;
                        int i14 = 0;
                        while (i14 < daVar.e) {
                            org.telegram.ui.Components.t9 t9Var4 = i14 == 0 ? t9Var2 : t9Var;
                            float f9 = i14;
                            t9Var4.setTranslationX(((f9 - (daVar.e / 2.0f)) * AndroidUtilities.dp(4.33f)) + AndroidUtilities.dp(2.0f));
                            t9Var4.setTranslationY((f9 - (daVar.e / 2.0f)) * AndroidUtilities.dp(4.33f));
                            i14++;
                        }
                    }
                } else {
                    z11 = z15;
                    if (starsTransaction.floodskip) {
                        textView3.setText(LocaleController.getString(R.string.StarsTransactionFloodskip));
                        y80Var.setText(LocaleController.formatPluralStringComma("StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        t9Var2.setImageDrawable(da.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            t9Var2.setImageDrawable(da.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            t9Var2.setImageDrawable(da.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(LocaleController.getString(R.string.StarsGiftReceived));
                                y80Var.setText(LocaleController.getString(z11 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown));
                                y80Var.setVisibility(0);
                            } else {
                                textView3.setText(LocaleController.getString((z14 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? R.string.StarsTransactionWithdrawFragment : R.string.StarsTransactionFragment));
                            }
                            t9Var2.setImageDrawable(da.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionBot));
                            t9Var2.setImageDrawable(da.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionUnsupported));
                            t9Var2.setImageDrawable(da.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionAds));
                            t9Var2.setImageDrawable(da.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            t9Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j10 = starsAmount.amount;
                if (j10 <= 0 || (j10 == 0 && starsAmount.nanos > 0)) {
                    textView2.setVisibility(0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.uj, false));
                    textView2.setText(TextUtils.concat("+", ia.I0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
                    z13 = z10;
                } else {
                    if (j10 < 0 || (j10 == 0 && starsAmount.nanos < 0)) {
                        textView2.setVisibility(0);
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.wj, false));
                        textView2.setText(TextUtils.concat(ia.I0(starsTransaction.amount), " ", z11 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z13 = z10;
                }
                daVar.y = z13;
                daVar.setWillNotDraw(!z13);
            }
            t9Var2.setImageDrawable(da.a(44, "search"));
            textView3.setText(LocaleController.getString(R.string.StarsTransactionPostsSearch));
            y80Var.setVisibility(8);
        }
        z11 = z15;
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        j10 = starsAmount2.amount;
        if (j10 <= 0) {
        }
        textView2.setVisibility(0);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.uj, false));
        textView2.setText(TextUtils.concat("+", ia.I0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
        z13 = z10;
        daVar.y = z13;
        daVar.setWillNotDraw(!z13);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        da daVar = (da) getCached();
        return daVar != null ? daVar : new da(context, i10, c6Var);
    }
}
