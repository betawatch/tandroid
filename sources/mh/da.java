package mh;

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
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.q70;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class da extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new da());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x074a  */
    @Override // org.telegram.ui.Components.g51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        SpannableString spannableString;
        int dp;
        char c3;
        boolean z10;
        boolean z11;
        String str;
        long j10;
        boolean z12;
        ea eaVar = (ea) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) h51Var.G;
        boolean z13 = h51Var.q;
        org.telegram.ui.Components.p9 p9Var = eaVar.d;
        SpannableString spannableString2 = eaVar.v;
        SpannableString spannableString3 = eaVar.w;
        org.telegram.ui.Components.z8 z8Var = eaVar.b;
        int i10 = eaVar.a;
        TextView textView = eaVar.r;
        TextView textView2 = eaVar.s;
        org.telegram.ui.Components.p9 p9Var2 = eaVar.c;
        TextView textView3 = eaVar.f;
        Integer num = 0;
        g90 g90Var = eaVar.n;
        long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
        boolean z14 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i11 = starsTransaction.flags;
        boolean z15 = (i11 & 131072) == 0 && (i11 & 65536) != 0;
        boolean z16 = !(peerDialogId == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        eaVar.x = z16;
        boolean z17 = z16;
        LinearLayout.LayoutParams layoutParams = eaVar.h;
        if (z17) {
            spannableString = spannableString2;
            dp = 0;
        } else {
            spannableString = spannableString2;
            dp = AndroidUtilities.dp(4.33f);
        }
        layoutParams.bottomMargin = dp;
        g90Var.setVisibility(eaVar.x ? 0 : 8);
        textView.setTextSize(1, eaVar.x ? 13.0f : 14.0f);
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
        p9Var2.setTranslationX(0.0f);
        p9Var2.setTranslationY(0.0f);
        p9Var.setVisibility(8);
        p9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            p9Var2.setImageDrawable(new t4(p9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionUpgraded));
            g90Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            p9Var2.setImageDrawable(new t4(p9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionRemovedDescription));
            g90Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (peerDialogId != 0) {
                    if (UserObject.isService(peerDialogId)) {
                        str = LocaleController.getString(R.string.StarsTransactionUnknown);
                        p9Var2.setImageDrawable(ea.a(44, "fragment"));
                        z11 = false;
                    } else if (peerDialogId >= 0) {
                        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                        z11 = user == null;
                        z8Var.r(user);
                        p9Var2.e(user, z8Var);
                        str = UserObject.getUserName(user);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                        z11 = chat == null;
                        z8Var.q(chat);
                        p9Var2.e(chat, z8Var);
                        str = chat == null ? "" : chat.title;
                    }
                    if (starsTransaction.stargift != null) {
                        q70 q70Var = new q70(g90Var, 16.0f, i10);
                        q70Var.a(4.0f);
                        q70Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(q70Var, 0, 1, 33);
                        ja.a1(q70Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(starsTransaction.stargift.getDocument(), g90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftOffer));
                            } else {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftOfferRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            g90Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u5(starsTransaction.stargift.getDocument(), g90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftPurchase));
                            } else {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftPurchaseRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            g90Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            String string = LocaleController.getString(R.string.Gift2TransactionPrepaidUpgrade);
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = spannableString4;
                            charSequenceArr[1] = " ";
                            charSequenceArr[c3] = string;
                            g90Var.setText(TextUtils.concat(charSequenceArr));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            g90Var.setText(LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftTransferRefund : R.string.StarGiftTransactionGiftTransfer));
                        } else if (starsTransaction.refund) {
                            String string2 = LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionRefundedAuctionBid : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent : R.string.Gift2TransactionRefundedConverted);
                            CharSequence[] charSequenceArr2 = new CharSequence[3];
                            charSequenceArr2[0] = spannableString4;
                            charSequenceArr2[1] = " ";
                            charSequenceArr2[c3] = string2;
                            g90Var.setText(TextUtils.concat(charSequenceArr2));
                        } else {
                            String string3 = LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionAuctionBid : starsTransaction.amount.amount > 0 ? R.string.Gift2TransactionConverted : starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent);
                            CharSequence[] charSequenceArr3 = new CharSequence[3];
                            charSequenceArr3[0] = spannableString4;
                            charSequenceArr3[1] = " ";
                            charSequenceArr3[c3] = string3;
                            g90Var.setText(TextUtils.concat(charSequenceArr3));
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i12 = starsTransaction.subscription_period;
                        if (i12 == 2592000) {
                            g90Var.setVisibility(0);
                            g90Var.setText(LocaleController.getString(R.string.StarsTransactionSubscriptionMonthly));
                        } else {
                            String str2 = i12 == 300 ? "5 minutes" : "Minute";
                            g90Var.setVisibility(0);
                            Locale locale = Locale.US;
                            g90Var.setText(str2.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        g90Var.setVisibility(z11 ? 8 : 0);
                        g90Var.setText(LocaleController.getString(starsTransaction.reaction ? R.string.StarsTransactionLiveStoryReactionFee : R.string.StarsTransactionLiveStoryMessageFee));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        g90Var.setVisibility(z11 ? 8 : 0);
                        g90Var.setText(LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        g90Var.setVisibility(z11 ? 8 : 0);
                        g90Var.setText(LocaleController.getString(R.string.StarsTransactionPremiumGift));
                    } else if (z15) {
                        textView3.setText(str);
                        g90Var.setVisibility(z11 ? 8 : 0);
                        g90Var.setText(LocaleController.formatString(R.string.StarTransactionCommission, sh.j.G0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        g90Var.setVisibility(z11 ? 8 : 0);
                        g90Var.setText(LocaleController.getString(R.string.StarsGiftReceived));
                    } else if ((starsTransaction.flags & 8192) != 0) {
                        textView3.setText(str);
                        g90Var.setVisibility(z11 ? 8 : 0);
                        g90Var.setText(LocaleController.getString(R.string.StarsGiveawayPrizeReceived));
                    } else if (starsTransaction.reaction) {
                        textView3.setText(str);
                        g90Var.setVisibility(z11 ? 8 : 0);
                        g90Var.setText(LocaleController.getString(R.string.StarsReactionsSent));
                    } else if (starsTransaction.extended_media.isEmpty()) {
                        z10 = z14;
                        if (starsTransaction.photo != null) {
                            q70 q70Var2 = new q70(g90Var, 14.0f, i10);
                            q70Var2.a(4.0f);
                            q70Var2.f = false;
                            SpannableString spannableString5 = new SpannableString("x");
                            spannableString5.setSpan(q70Var2, 0, 1, 33);
                            q70Var2.b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction.photo)), "14_14", null, null, num, 0);
                            textView3.setText(str);
                            g90Var.setVisibility(z11 ? 8 : 0);
                            String str3 = starsTransaction.title;
                            g90Var.setText(Emoji.replaceEmoji(TextUtils.concat(spannableString5, " ", str3 != null ? str3 : ""), g90Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            textView3.setText(str);
                            g90Var.setVisibility(z11 ? 8 : 0);
                            String str4 = starsTransaction.title;
                            g90Var.setText(Emoji.replaceEmoji(str4 != null ? str4 : "", g90Var.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        if (z13) {
                            textView3.setText(str);
                            g90Var.setVisibility(0);
                            g90Var.setText(LocaleController.getString(R.string.StarMediaPurchase));
                        } else {
                            textView3.setText(LocaleController.getString(R.string.StarMediaPurchase));
                            g90Var.setVisibility(z11 ? 8 : 0);
                            g90Var.setText(str);
                        }
                        eaVar.e = 0;
                        int i13 = 0;
                        while (i13 < Math.min(2, starsTransaction.extended_media.size())) {
                            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i13);
                            org.telegram.ui.Components.p9 p9Var3 = i13 == 0 ? p9Var2 : p9Var;
                            p9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                            ImageLocation forPhoto = messageMedia instanceof TLRPC.TL_messageMediaPhoto ? ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(46.0f), true), messageMedia.photo) : messageMedia instanceof TLRPC.TL_messageMediaDocument ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(46.0f), true), messageMedia.document) : null;
                            p9Var3.setVisibility(0);
                            Integer num2 = num;
                            p9Var3.l(forPhoto, "46_46", null, null, null, num2);
                            eaVar.e++;
                            i13++;
                            num = num2;
                            z14 = z14;
                        }
                        z10 = z14;
                        int i14 = 0;
                        while (i14 < eaVar.e) {
                            org.telegram.ui.Components.p9 p9Var4 = i14 == 0 ? p9Var2 : p9Var;
                            float f10 = i14;
                            p9Var4.setTranslationX(((f10 - (eaVar.e / 2.0f)) * AndroidUtilities.dp(4.33f)) + AndroidUtilities.dp(2.0f));
                            p9Var4.setTranslationY((f10 - (eaVar.e / 2.0f)) * AndroidUtilities.dp(4.33f));
                            i14++;
                        }
                    }
                } else {
                    z10 = z14;
                    if (starsTransaction.floodskip) {
                        textView3.setText(LocaleController.getString(R.string.StarsTransactionFloodskip));
                        g90Var.setText(LocaleController.formatPluralStringComma("StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        p9Var2.setImageDrawable(ea.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            p9Var2.setImageDrawable(ea.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            p9Var2.setImageDrawable(ea.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(LocaleController.getString(R.string.StarsGiftReceived));
                                g90Var.setText(LocaleController.getString(z10 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown));
                                g90Var.setVisibility(0);
                            } else {
                                textView3.setText(LocaleController.getString((z13 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? R.string.StarsTransactionWithdrawFragment : R.string.StarsTransactionFragment));
                            }
                            p9Var2.setImageDrawable(ea.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionBot));
                            p9Var2.setImageDrawable(ea.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionUnsupported));
                            p9Var2.setImageDrawable(ea.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionAds));
                            p9Var2.setImageDrawable(ea.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            p9Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j10 = starsAmount.amount;
                if (j10 <= 0 || (j10 == 0 && starsAmount.nanos > 0)) {
                    textView2.setVisibility(0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.uj, false));
                    textView2.setText(TextUtils.concat("+", ja.I0(starsTransaction.amount), " ", !z10 ? spannableString3 : spannableString));
                    z12 = z4;
                } else {
                    if (j10 < 0 || (j10 == 0 && starsAmount.nanos < 0)) {
                        textView2.setVisibility(0);
                        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.wj, false));
                        textView2.setText(TextUtils.concat(ja.I0(starsTransaction.amount), " ", z10 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z12 = z4;
                }
                eaVar.y = z12;
                eaVar.setWillNotDraw(!z12);
            }
            p9Var2.setImageDrawable(ea.a(44, "search"));
            textView3.setText(LocaleController.getString(R.string.StarsTransactionPostsSearch));
            g90Var.setVisibility(8);
        }
        z10 = z14;
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        j10 = starsAmount2.amount;
        if (j10 <= 0) {
        }
        textView2.setVisibility(0);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.uj, false));
        textView2.setText(TextUtils.concat("+", ja.I0(starsTransaction.amount), " ", !z10 ? spannableString3 : spannableString));
        z12 = z4;
        eaVar.y = z12;
        eaVar.setWillNotDraw(!z12);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        ea eaVar = (ea) getCached();
        return eaVar != null ? eaVar : new ea(context, i10, g6Var);
    }
}
