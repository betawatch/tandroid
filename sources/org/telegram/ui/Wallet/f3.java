package org.telegram.ui.Wallet;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import di.pb;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class f3 {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public long i;
    public final int j;
    public boolean k;
    public final String l;
    public final int m;

    public f3(int i7, int i10, boolean z10, int i11, long j3, long j10, long j11, long j12, int i12, String str, int i13) {
        this.a = i7;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = j3;
        this.f = j10;
        this.g = j11;
        this.h = j12;
        this.j = i12;
        this.l = TextUtils.isEmpty(str) ? null : str;
        this.m = i13;
    }

    public static String a(TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction) {
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferCreate) {
            return ((TL_wallet.walletOnchainGiftActionOfferCreate) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferAccept) {
            return ((TL_wallet.walletOnchainGiftActionOfferAccept) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferCancel) {
            return ((TL_wallet.walletOnchainGiftActionOfferCancel) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferDecline) {
            return ((TL_wallet.walletOnchainGiftActionOfferDecline) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferExpire) {
            return ((TL_wallet.walletOnchainGiftActionOfferExpire) walletOnchainGiftAction).counterparty_address;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f3 c(TL_wallet.walletTransaction wallettransaction) {
        int i7;
        long j3;
        TL_wallet.nftItem nftitem;
        if (wallettransaction == null) {
            return null;
        }
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (!(walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift)) {
            return null;
        }
        TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction = ((TL_wallet.walletTransactionPeerOnchainGift) walletTransactionPeer).action;
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionBuy) {
            long j10 = wallettransaction.amount;
            int i10 = (j10 > 0 || (j10 == 0 && !wallettransaction.incoming)) ? 1 : 0;
            long abs = Math.abs(j10);
            if (i10 != 0 && wallettransaction.amount > 0 && (nftitem = wallettransaction.nft) != null) {
                TL_stars.StarGift starGift = nftitem.gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    i7 = bi.x4.f((TL_stars.TL_starGiftUnique) starGift);
                    if (i7 > 0 || i7 >= 10000) {
                        j3 = 0;
                    } else {
                        abs = new BigDecimal(wallettransaction.amount).multiply(BigDecimal.valueOf(10000L)).divide(BigDecimal.valueOf(10000 - i7), 0, RoundingMode.HALF_UP).longValue();
                        j3 = abs - wallettransaction.amount;
                    }
                    return new f3(i10, R.drawable.wallet_transaction_swap, true, i10 == 0 ? wallettransaction.amount > 0 ? 0 : -1 : 1, wallettransaction.amount, abs, j3, 0L, 0, null, i10 == 0 ? 2131749541 : 2131749533);
                }
            }
            i7 = -1;
            if (i7 > 0) {
            }
            j3 = 0;
            return new f3(i10, R.drawable.wallet_transaction_swap, true, i10 == 0 ? wallettransaction.amount > 0 ? 0 : -1 : 1, wallettransaction.amount, abs, j3, 0L, 0, null, i10 == 0 ? 2131749541 : 2131749533);
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionChangePrice) {
            TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = (TL_wallet.walletOnchainGiftActionChangePrice) walletOnchainGiftAction;
            if (!walletonchaingiftactionchangeprice.hasOldPrice()) {
                return new f3(3, R.drawable.wallet_transaction_out, false, -1, wallettransaction.amount, walletonchaingiftactionchangeprice.new_price, 0L, 0L, 0, null, 0);
            }
            f3 f3Var = new f3(9, R.drawable.wallet_transaction_reprice, true, 0, wallettransaction.amount, walletonchaingiftactionchangeprice.new_price, 0L, 0L, 0, null, 0);
            f3Var.i = walletonchaingiftactionchangeprice.old_price;
            return f3Var;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionDelist) {
            return new f3(4, R.drawable.wallet_transaction_in, true, 1, wallettransaction.amount, 0L, 0L, 0L, 0, null, 0);
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferCreate) {
            TL_wallet.walletOnchainGiftActionOfferCreate walletonchaingiftactionoffercreate = (TL_wallet.walletOnchainGiftActionOfferCreate) walletOnchainGiftAction;
            long j11 = wallettransaction.amount;
            return new f3(5, R.drawable.wallet_transaction_out, false, 0, -(j11 != 0 ? Math.abs(j11) : walletonchaingiftactionoffercreate.amount), walletonchaingiftactionoffercreate.price, walletonchaingiftactionoffercreate.service_fee, 0L, walletonchaingiftactionoffercreate.expires_at, walletonchaingiftactionoffercreate.counterparty_address, 2131742774);
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferAccept) {
            TL_wallet.walletOnchainGiftActionOfferAccept walletonchaingiftactionofferaccept = (TL_wallet.walletOnchainGiftActionOfferAccept) walletOnchainGiftAction;
            if (walletonchaingiftactionofferaccept.buyer) {
                long j12 = wallettransaction.amount;
                return new f3(0, R.drawable.wallet_transaction_swap, true, 1, -(j12 != 0 ? Math.abs(j12) : walletonchaingiftactionofferaccept.price + walletonchaingiftactionofferaccept.service_fee), walletonchaingiftactionofferaccept.price, walletonchaingiftactionofferaccept.service_fee, 0L, 0, walletonchaingiftactionofferaccept.counterparty_address, 2131749533);
            }
            long j13 = wallettransaction.amount;
            return new f3(2, R.drawable.wallet_transaction_swap, true, 0, j13 != 0 ? Math.abs(j13) : walletonchaingiftactionofferaccept.price, walletonchaingiftactionofferaccept.price, walletonchaingiftactionofferaccept.service_fee, 0L, 0, walletonchaingiftactionofferaccept.counterparty_address, 2131749541);
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferCancel) {
            TL_wallet.walletOnchainGiftActionOfferCancel walletonchaingiftactionoffercancel = (TL_wallet.walletOnchainGiftActionOfferCancel) walletOnchainGiftAction;
            f3 d = d(6, wallettransaction, walletonchaingiftactionoffercancel.refund_amount, walletonchaingiftactionoffercancel.price, walletonchaingiftactionoffercancel.fine, walletonchaingiftactionoffercancel.counterparty_address);
            d.k = (walletonchaingiftactionoffercancel.flags & 4) != 0;
            return d;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferDecline) {
            TL_wallet.walletOnchainGiftActionOfferDecline walletonchaingiftactionofferdecline = (TL_wallet.walletOnchainGiftActionOfferDecline) walletOnchainGiftAction;
            return d(7, wallettransaction, walletonchaingiftactionofferdecline.refund_amount, walletonchaingiftactionofferdecline.price, 0L, walletonchaingiftactionofferdecline.counterparty_address);
        }
        if (!(walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferExpire)) {
            return null;
        }
        TL_wallet.walletOnchainGiftActionOfferExpire walletonchaingiftactionofferexpire = (TL_wallet.walletOnchainGiftActionOfferExpire) walletOnchainGiftAction;
        return d(8, wallettransaction, walletonchaingiftactionofferexpire.refund_amount, walletonchaingiftactionofferexpire.price, 0L, walletonchaingiftactionofferexpire.counterparty_address);
    }

    public static f3 d(int i7, TL_wallet.walletTransaction wallettransaction, long j3, long j10, long j11, String str) {
        long j12 = wallettransaction.amount;
        return new f3(i7, R.drawable.wallet_transaction_in, true, 0, j12 != 0 ? Math.abs(j12) : j3, j10, 0L, j11, 0, str, 2131742774);
    }

    public static SpannableStringBuilder f(int i7, long j3) {
        return pb.b1(true, hd.a0(null, null, i7, "⭐️ " + u0.t(j3, false)), 0.7f, null);
    }

    public final CharSequence b() {
        int i7 = this.a;
        long j3 = this.e;
        long j10 = this.f;
        switch (i7) {
            case 0:
                if (j10 == 0) {
                    j10 = Math.abs(j3);
                }
                return f(2131742814, j10);
            case 1:
                if (j3 != 0) {
                    j10 = Math.abs(j3);
                }
                return f(2131742803, j10);
            case 2:
                return f(2131742813, Math.abs(j3));
            case 3:
                return j10 != 0 ? f(2131742807, j10) : hd.N0(2131742808, null);
            case 4:
                return hd.N0(2131742806, null);
            case 5:
                return hd.N0(2131742809, null);
            case 6:
                return hd.N0(2131742812, null);
            case 7:
                return hd.N0(2131742811, null);
            case 8:
                return hd.N0(2131742810, null);
            case 9:
                return f(2131742805, j10);
            default:
                return "";
        }
    }

    public final String e() {
        switch (this.a) {
            case 0:
                return hd.N0(2131742800, null);
            case 1:
                return hd.N0(2131742797, null);
            case 2:
                return hd.N0(2131742802, null);
            case 3:
                return hd.N0(2131742799, null);
            case 4:
                return hd.N0(2131742798, null);
            case 5:
                return hd.N0(2131742809, null);
            case 6:
                return hd.N0(2131742812, null);
            case 7:
                return hd.N0(2131742811, null);
            case 8:
                return hd.N0(2131742810, null);
            case 9:
                return hd.N0(2131742801, null);
            default:
                return "";
        }
    }
}
