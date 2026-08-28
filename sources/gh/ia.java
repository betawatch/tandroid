package gh;

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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.c70;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ia extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new ia());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x074e  */
    @Override // org.telegram.ui.Components.k41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        SpannableString spannableString;
        int dp;
        char c10;
        boolean z11;
        boolean z12;
        String str;
        long j10;
        boolean z13;
        ja jaVar = (ja) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) l41Var.G;
        boolean z14 = l41Var.q;
        org.telegram.ui.Components.o9 o9Var = jaVar.d;
        SpannableString spannableString2 = jaVar.v;
        SpannableString spannableString3 = jaVar.w;
        org.telegram.ui.Components.z8 z8Var = jaVar.b;
        int i9 = jaVar.a;
        TextView textView = jaVar.r;
        TextView textView2 = jaVar.s;
        org.telegram.ui.Components.o9 o9Var2 = jaVar.c;
        TextView textView3 = jaVar.f;
        Integer num = 0;
        l80 l80Var = jaVar.n;
        long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
        boolean z15 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i10 = starsTransaction.flags;
        boolean z16 = (i10 & 131072) == 0 && (i10 & 65536) != 0;
        boolean z17 = !(peerDialogId == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        jaVar.x = z17;
        boolean z18 = z17;
        LinearLayout.LayoutParams layoutParams = jaVar.h;
        if (z18) {
            spannableString = spannableString2;
            dp = 0;
        } else {
            spannableString = spannableString2;
            dp = AndroidUtilities.dp(4.33f);
        }
        layoutParams.bottomMargin = dp;
        l80Var.setVisibility(jaVar.x ? 0 : 8);
        textView.setTextSize(1, jaVar.x ? 13.0f : 14.0f);
        textView.setText(LocaleController.formatShortDateTime(starsTransaction.date));
        if (starsTransaction.refund) {
            c10 = 2;
            textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsRefunded)));
        } else {
            c10 = 2;
            if (starsTransaction.failed) {
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsFailed)));
            } else if (starsTransaction.pending) {
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsPending)));
            }
        }
        o9Var2.setTranslationX(0.0f);
        o9Var2.setTranslationY(0.0f);
        o9Var.setVisibility(8);
        o9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            o9Var2.setImageDrawable(new x4(o9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionUpgraded));
            l80Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            o9Var2.setImageDrawable(new x4(o9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionRemovedDescription));
            l80Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (peerDialogId != 0) {
                    if (UserObject.isService(peerDialogId)) {
                        str = LocaleController.getString(R.string.StarsTransactionUnknown);
                        o9Var2.setImageDrawable(ja.a(44, "fragment"));
                        z12 = false;
                    } else if (peerDialogId >= 0) {
                        TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId));
                        z12 = user == null;
                        z8Var.r(user);
                        o9Var2.e(user, z8Var);
                        str = UserObject.getUserName(user);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerDialogId));
                        z12 = chat == null;
                        z8Var.q(chat);
                        o9Var2.e(chat, z8Var);
                        str = chat == null ? "" : chat.title;
                    }
                    if (starsTransaction.stargift != null) {
                        c70 c70Var = new c70(l80Var, 16.0f, i9);
                        c70Var.a(4.0f);
                        c70Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(c70Var, 0, 1, 33);
                        oa.a1(c70Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(starsTransaction.stargift.getDocument(), l80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftOffer));
                            } else {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftOfferRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            l80Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(starsTransaction.stargift.getDocument(), l80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftPurchase));
                            } else {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftPurchaseRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            l80Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            String string = LocaleController.getString(R.string.Gift2TransactionPrepaidUpgrade);
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = spannableString4;
                            charSequenceArr[1] = " ";
                            charSequenceArr[c10] = string;
                            l80Var.setText(TextUtils.concat(charSequenceArr));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            l80Var.setText(LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftTransferRefund : R.string.StarGiftTransactionGiftTransfer));
                        } else if (starsTransaction.refund) {
                            String string2 = LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionRefundedAuctionBid : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent : R.string.Gift2TransactionRefundedConverted);
                            CharSequence[] charSequenceArr2 = new CharSequence[3];
                            charSequenceArr2[0] = spannableString4;
                            charSequenceArr2[1] = " ";
                            charSequenceArr2[c10] = string2;
                            l80Var.setText(TextUtils.concat(charSequenceArr2));
                        } else {
                            String string3 = LocaleController.getString(starsTransaction.stargift_auction_bid ? R.string.Gift2TransactionAuctionBid : starsTransaction.amount.amount > 0 ? R.string.Gift2TransactionConverted : starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent);
                            CharSequence[] charSequenceArr3 = new CharSequence[3];
                            charSequenceArr3[0] = spannableString4;
                            charSequenceArr3[1] = " ";
                            charSequenceArr3[c10] = string3;
                            l80Var.setText(TextUtils.concat(charSequenceArr3));
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i11 = starsTransaction.subscription_period;
                        if (i11 == 2592000) {
                            l80Var.setVisibility(0);
                            l80Var.setText(LocaleController.getString(R.string.StarsTransactionSubscriptionMonthly));
                        } else {
                            String str2 = i11 == 300 ? "5 minutes" : "Minute";
                            l80Var.setVisibility(0);
                            Locale locale = Locale.US;
                            l80Var.setText(str2.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        l80Var.setVisibility(z12 ? 8 : 0);
                        l80Var.setText(LocaleController.getString(starsTransaction.reaction ? R.string.StarsTransactionLiveStoryReactionFee : R.string.StarsTransactionLiveStoryMessageFee));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        l80Var.setVisibility(z12 ? 8 : 0);
                        l80Var.setText(LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        l80Var.setVisibility(z12 ? 8 : 0);
                        l80Var.setText(LocaleController.getString(R.string.StarsTransactionPremiumGift));
                    } else if (z16) {
                        textView3.setText(str);
                        l80Var.setVisibility(z12 ? 8 : 0);
                        l80Var.setText(LocaleController.formatString(R.string.StarTransactionCommission, mh.l.F0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        l80Var.setVisibility(z12 ? 8 : 0);
                        l80Var.setText(LocaleController.getString(R.string.StarsGiftReceived));
                    } else if ((starsTransaction.flags & 8192) != 0) {
                        textView3.setText(str);
                        l80Var.setVisibility(z12 ? 8 : 0);
                        l80Var.setText(LocaleController.getString(R.string.StarsGiveawayPrizeReceived));
                    } else if (starsTransaction.reaction) {
                        textView3.setText(str);
                        l80Var.setVisibility(z12 ? 8 : 0);
                        l80Var.setText(LocaleController.getString(R.string.StarsReactionsSent));
                    } else if (starsTransaction.extended_media.isEmpty()) {
                        z11 = z15;
                        if (starsTransaction.photo != null) {
                            c70 c70Var2 = new c70(l80Var, 14.0f, i9);
                            c70Var2.a(4.0f);
                            c70Var2.f = false;
                            SpannableString spannableString5 = new SpannableString("x");
                            spannableString5.setSpan(c70Var2, 0, 1, 33);
                            c70Var2.b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction.photo)), "14_14", null, null, num, 0);
                            textView3.setText(str);
                            l80Var.setVisibility(z12 ? 8 : 0);
                            String str3 = starsTransaction.title;
                            l80Var.setText(Emoji.replaceEmoji(TextUtils.concat(spannableString5, " ", str3 != null ? str3 : ""), l80Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            textView3.setText(str);
                            l80Var.setVisibility(z12 ? 8 : 0);
                            String str4 = starsTransaction.title;
                            l80Var.setText(Emoji.replaceEmoji(str4 != null ? str4 : "", l80Var.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        if (z14) {
                            textView3.setText(str);
                            l80Var.setVisibility(0);
                            l80Var.setText(LocaleController.getString(R.string.StarMediaPurchase));
                        } else {
                            textView3.setText(LocaleController.getString(R.string.StarMediaPurchase));
                            l80Var.setVisibility(z12 ? 8 : 0);
                            l80Var.setText(str);
                        }
                        jaVar.e = 0;
                        int i12 = 0;
                        while (i12 < Math.min(2, starsTransaction.extended_media.size())) {
                            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i12);
                            org.telegram.ui.Components.o9 o9Var3 = i12 == 0 ? o9Var2 : o9Var;
                            o9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                            ImageLocation forPhoto = messageMedia instanceof TLRPC.TL_messageMediaPhoto ? ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(46.0f), true), messageMedia.photo) : messageMedia instanceof TLRPC.TL_messageMediaDocument ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(46.0f), true), messageMedia.document) : null;
                            o9Var3.setVisibility(0);
                            Integer num2 = num;
                            o9Var3.l(forPhoto, "46_46", null, null, null, num2);
                            jaVar.e++;
                            i12++;
                            num = num2;
                            z15 = z15;
                        }
                        z11 = z15;
                        int i13 = 0;
                        while (i13 < jaVar.e) {
                            org.telegram.ui.Components.o9 o9Var4 = i13 == 0 ? o9Var2 : o9Var;
                            float f10 = i13;
                            o9Var4.setTranslationX(((f10 - (jaVar.e / 2.0f)) * AndroidUtilities.dp(4.33f)) + AndroidUtilities.dp(2.0f));
                            o9Var4.setTranslationY((f10 - (jaVar.e / 2.0f)) * AndroidUtilities.dp(4.33f));
                            i13++;
                        }
                    }
                } else {
                    z11 = z15;
                    if (starsTransaction.floodskip) {
                        textView3.setText(LocaleController.getString(R.string.StarsTransactionFloodskip));
                        l80Var.setText(LocaleController.formatPluralStringComma("StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        o9Var2.setImageDrawable(ja.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            o9Var2.setImageDrawable(ja.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            o9Var2.setImageDrawable(ja.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(LocaleController.getString(R.string.StarsGiftReceived));
                                l80Var.setText(LocaleController.getString(z11 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown));
                                l80Var.setVisibility(0);
                            } else {
                                textView3.setText(LocaleController.getString((z14 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? R.string.StarsTransactionWithdrawFragment : R.string.StarsTransactionFragment));
                            }
                            o9Var2.setImageDrawable(ja.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionBot));
                            o9Var2.setImageDrawable(ja.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionUnsupported));
                            o9Var2.setImageDrawable(ja.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionAds));
                            o9Var2.setImageDrawable(ja.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            o9Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j10 = starsAmount.amount;
                if (j10 <= 0 || (j10 == 0 && starsAmount.nanos > 0)) {
                    textView2.setVisibility(0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.uj, false));
                    textView2.setText(TextUtils.concat("+", oa.H0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
                    z13 = z10;
                } else {
                    if (j10 < 0 || (j10 == 0 && starsAmount.nanos < 0)) {
                        textView2.setVisibility(0);
                        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.wj, false));
                        textView2.setText(TextUtils.concat(oa.H0(starsTransaction.amount), " ", z11 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z13 = z10;
                }
                jaVar.y = z13;
                jaVar.setWillNotDraw(!z13);
            }
            o9Var2.setImageDrawable(ja.a(44, "search"));
            textView3.setText(LocaleController.getString(R.string.StarsTransactionPostsSearch));
            l80Var.setVisibility(8);
        }
        z11 = z15;
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        j10 = starsAmount2.amount;
        if (j10 <= 0) {
        }
        textView2.setVisibility(0);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.uj, false));
        textView2.setText(TextUtils.concat("+", oa.H0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
        z13 = z10;
        jaVar.y = z13;
        jaVar.setWillNotDraw(!z13);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        ja jaVar = (ja) getCached();
        return jaVar != null ? jaVar : new ja(context, i9, b6Var);
    }
}
