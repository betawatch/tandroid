package bi;

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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.l70;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class xc extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new xc());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0748  */
    @Override // org.telegram.ui.Components.t61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        SpannableString spannableString;
        int dp;
        int i10;
        boolean z11;
        boolean z12;
        String str;
        long j10;
        boolean z13;
        yc ycVar = (yc) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) u61Var.G;
        boolean z14 = u61Var.q;
        org.telegram.ui.Components.y9 y9Var = ycVar.d;
        SpannableString spannableString2 = ycVar.v;
        SpannableString spannableString3 = ycVar.w;
        org.telegram.ui.Components.j9 j9Var = ycVar.b;
        int i11 = ycVar.a;
        TextView textView = ycVar.r;
        TextView textView2 = ycVar.s;
        org.telegram.ui.Components.y9 y9Var2 = ycVar.c;
        TextView textView3 = ycVar.f;
        Integer num = 0;
        aa0 aa0Var = ycVar.n;
        long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
        boolean z15 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i12 = starsTransaction.flags;
        boolean z16 = (i12 & 131072) == 0 && (i12 & 65536) != 0;
        boolean z17 = !(peerDialogId == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        ycVar.x = z17;
        boolean z18 = z17;
        LinearLayout.LayoutParams layoutParams = ycVar.h;
        if (z18) {
            spannableString = spannableString2;
            dp = 0;
        } else {
            spannableString = spannableString2;
            dp = AndroidUtilities.dp(4.33f);
        }
        layoutParams.bottomMargin = dp;
        aa0Var.setVisibility(ycVar.x ? 0 : 8);
        textView.setTextSize(1, ycVar.x ? 13.0f : 14.0f);
        textView.setText(LocaleController.formatShortDateTime(starsTransaction.date));
        if (starsTransaction.refund) {
            i10 = 2;
            textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsRefunded)));
        } else {
            i10 = 2;
            if (starsTransaction.failed) {
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsFailed)));
            } else if (starsTransaction.pending) {
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsPending)));
            }
        }
        y9Var2.setTranslationX(0.0f);
        y9Var2.setTranslationY(0.0f);
        y9Var.setVisibility(8);
        y9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            y9Var2.setImageDrawable(new q6(y9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionUpgraded));
            aa0Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            y9Var2.setImageDrawable(new q6(y9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionRemovedDescription));
            aa0Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (peerDialogId != 0) {
                    if (UserObject.isService(peerDialogId)) {
                        str = LocaleController.getString(R.string.StarsTransactionUnknown);
                        y9Var2.setImageDrawable(yc.a(44, "fragment"));
                        z12 = false;
                    } else if (peerDialogId >= 0) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        z12 = user == null;
                        j9Var.r(user);
                        y9Var2.f(user, j9Var);
                        str = UserObject.getUserName(user);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                        z12 = chat == null;
                        j9Var.q(chat);
                        y9Var2.f(chat, j9Var);
                        str = chat == null ? "" : chat.title;
                    }
                    if (starsTransaction.stargift != null) {
                        l70 l70Var = new l70(aa0Var, 16.0f, i11);
                        l70Var.a(4.0f);
                        l70Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(l70Var, 0, 1, 33);
                        dd.Z0(l70Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.c6(starsTransaction.stargift.getDocument(), aa0Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftOffer));
                            } else {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftOfferRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            aa0Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.c6(starsTransaction.stargift.getDocument(), aa0Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftPurchase));
                            } else {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftPurchaseRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            aa0Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            String string = LocaleController.getString(R.string.Gift2TransactionPrepaidUpgrade);
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = spannableString4;
                            charSequenceArr[1] = " ";
                            charSequenceArr[i10] = string;
                            aa0Var.setText(TextUtils.concat(charSequenceArr));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            aa0Var.setText(LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftTransferRefund : R.string.StarGiftTransactionGiftTransfer));
                        } else if (starsTransaction.refund) {
                            String string2 = LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionRefundedAuctionBid : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent : R.string.Gift2TransactionRefundedConverted);
                            CharSequence[] charSequenceArr2 = new CharSequence[3];
                            charSequenceArr2[0] = spannableString4;
                            charSequenceArr2[1] = " ";
                            charSequenceArr2[i10] = string2;
                            aa0Var.setText(TextUtils.concat(charSequenceArr2));
                        } else {
                            String string3 = LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionAuctionBid : starsTransaction.amount.amount > 0 ? R.string.Gift2TransactionConverted : starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent);
                            CharSequence[] charSequenceArr3 = new CharSequence[3];
                            charSequenceArr3[0] = spannableString4;
                            charSequenceArr3[1] = " ";
                            charSequenceArr3[i10] = string3;
                            aa0Var.setText(TextUtils.concat(charSequenceArr3));
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i13 = starsTransaction.subscription_period;
                        if (i13 == 2592000) {
                            aa0Var.setVisibility(0);
                            aa0Var.setText(LocaleController.getString(R.string.StarsTransactionSubscriptionMonthly));
                        } else {
                            String str2 = i13 == 300 ? "5 minutes" : "Minute";
                            aa0Var.setVisibility(0);
                            Locale locale = Locale.US;
                            aa0Var.setText(str2.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        aa0Var.setVisibility(z12 ? 8 : 0);
                        aa0Var.setText(LocaleController.getString(starsTransaction.reaction ? R.string.StarsTransactionLiveStoryReactionFee : R.string.StarsTransactionLiveStoryMessageFee));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        aa0Var.setVisibility(z12 ? 8 : 0);
                        aa0Var.setText(LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        aa0Var.setVisibility(z12 ? 8 : 0);
                        aa0Var.setText(LocaleController.getString(R.string.StarsTransactionPremiumGift));
                    } else if (z16) {
                        textView3.setText(str);
                        aa0Var.setVisibility(z12 ? 8 : 0);
                        aa0Var.setText(LocaleController.formatString(R.string.StarTransactionCommission, hi.k.F0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        aa0Var.setVisibility(z12 ? 8 : 0);
                        aa0Var.setText(LocaleController.getString(R.string.StarsGiftReceived));
                    } else if ((starsTransaction.flags & 8192) != 0) {
                        textView3.setText(str);
                        aa0Var.setVisibility(z12 ? 8 : 0);
                        aa0Var.setText(LocaleController.getString(R.string.StarsGiveawayPrizeReceived));
                    } else if (starsTransaction.reaction) {
                        textView3.setText(str);
                        aa0Var.setVisibility(z12 ? 8 : 0);
                        aa0Var.setText(LocaleController.getString(R.string.StarsReactionsSent));
                    } else if (starsTransaction.extended_media.isEmpty()) {
                        z11 = z15;
                        if (starsTransaction.photo != null) {
                            l70 l70Var2 = new l70(aa0Var, 14.0f, i11);
                            l70Var2.a(4.0f);
                            l70Var2.f = false;
                            SpannableString spannableString5 = new SpannableString("x");
                            spannableString5.setSpan(l70Var2, 0, 1, 33);
                            l70Var2.b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction.photo)), "14_14", null, null, num, 0);
                            textView3.setText(str);
                            aa0Var.setVisibility(z12 ? 8 : 0);
                            String str3 = starsTransaction.title;
                            aa0Var.setText(Emoji.replaceEmoji(TextUtils.concat(spannableString5, " ", str3 != null ? str3 : ""), aa0Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            textView3.setText(str);
                            aa0Var.setVisibility(z12 ? 8 : 0);
                            String str4 = starsTransaction.title;
                            aa0Var.setText(Emoji.replaceEmoji(str4 != null ? str4 : "", aa0Var.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        if (z14) {
                            textView3.setText(str);
                            aa0Var.setVisibility(0);
                            aa0Var.setText(LocaleController.getString(R.string.StarMediaPurchase));
                        } else {
                            textView3.setText(LocaleController.getString(R.string.StarMediaPurchase));
                            aa0Var.setVisibility(z12 ? 8 : 0);
                            aa0Var.setText(str);
                        }
                        ycVar.e = 0;
                        int i14 = 0;
                        while (i14 < Math.min(i10, starsTransaction.extended_media.size())) {
                            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i14);
                            org.telegram.ui.Components.y9 y9Var3 = i14 == 0 ? y9Var2 : y9Var;
                            y9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                            ImageLocation forPhoto = messageMedia instanceof TLRPC.TL_messageMediaPhoto ? ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(46.0f), true), messageMedia.photo) : messageMedia instanceof TLRPC.TL_messageMediaDocument ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(46.0f), true), messageMedia.document) : null;
                            y9Var3.setVisibility(0);
                            Integer num2 = num;
                            y9Var3.l(forPhoto, "46_46", null, null, null, num2);
                            ycVar.e++;
                            i14++;
                            num = num2;
                            z15 = z15;
                            i10 = 2;
                        }
                        z11 = z15;
                        int i15 = 0;
                        while (i15 < ycVar.e) {
                            org.telegram.ui.Components.y9 y9Var4 = i15 == 0 ? y9Var2 : y9Var;
                            float f7 = i15;
                            y9Var4.setTranslationX(((f7 - (ycVar.e / 2.0f)) * AndroidUtilities.dp(4.33f)) + AndroidUtilities.dp(2.0f));
                            y9Var4.setTranslationY((f7 - (ycVar.e / 2.0f)) * AndroidUtilities.dp(4.33f));
                            i15++;
                        }
                    }
                } else {
                    z11 = z15;
                    if (starsTransaction.floodskip) {
                        textView3.setText(LocaleController.getString(R.string.StarsTransactionFloodskip));
                        aa0Var.setText(LocaleController.formatPluralStringComma("StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        y9Var2.setImageDrawable(yc.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            y9Var2.setImageDrawable(yc.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            y9Var2.setImageDrawable(yc.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(LocaleController.getString(R.string.StarsGiftReceived));
                                aa0Var.setText(LocaleController.getString(z11 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown));
                                aa0Var.setVisibility(0);
                            } else {
                                textView3.setText(LocaleController.getString((z14 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? R.string.StarsTransactionWithdrawFragment : R.string.StarsTransactionFragment));
                            }
                            y9Var2.setImageDrawable(yc.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionBot));
                            y9Var2.setImageDrawable(yc.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionUnsupported));
                            y9Var2.setImageDrawable(yc.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionAds));
                            y9Var2.setImageDrawable(yc.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            y9Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j10 = starsAmount.amount;
                if (j10 <= 0 || (j10 == 0 && starsAmount.nanos > 0)) {
                    textView2.setVisibility(0);
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.uj, null);
                    textView2.setText(TextUtils.concat("+", dd.H0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
                    z13 = z10;
                } else {
                    if (j10 < 0 || (j10 == 0 && starsAmount.nanos < 0)) {
                        textView2.setVisibility(0);
                        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.wj, null);
                        textView2.setText(TextUtils.concat(dd.H0(starsTransaction.amount), " ", z11 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z13 = z10;
                }
                ycVar.y = z13;
                ycVar.setWillNotDraw(!z13);
            }
            y9Var2.setImageDrawable(yc.a(44, "search"));
            textView3.setText(LocaleController.getString(R.string.StarsTransactionPostsSearch));
            aa0Var.setVisibility(8);
        }
        z11 = z15;
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        j10 = starsAmount2.amount;
        if (j10 <= 0) {
        }
        textView2.setVisibility(0);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.uj, null);
        textView2.setText(TextUtils.concat("+", dd.H0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
        z13 = z10;
        ycVar.y = z13;
        ycVar.setWillNotDraw(!z13);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        yc ycVar = (yc) getCached();
        return ycVar != null ? ycVar : new yc(context, i10, u6Var);
    }
}
