// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class jt7 {
    public final byte a;
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

    /* JADX WARN: Multi-variable type inference failed */
    public jt7(int i, int i2, boolean z, int i3, long j, long j2, long j3, long j4, int i4, String str, int i5) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.j = i4;
        this.l = TextUtils.isEmpty(str) ? null : str;
        this.m = i5;
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jt7 c(TL_wallet.walletTransaction wallettransaction) {
        int i;
        long j;
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
            long j2 = wallettransaction.amount;
            int i2 = (j2 > 0 || (j2 == 0 && !wallettransaction.incoming)) ? 1 : 0;
            long abs = Math.abs(j2);
            if (i2 != 0 && wallettransaction.amount > 0 && (nftitem = wallettransaction.nft) != null) {
                TL_stars.StarGift starGift = nftitem.gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    i = it7.g((TL_stars.TL_starGiftUnique) starGift);
                    if (i > 0 || i >= 10000) {
                        j = 0;
                    } else {
                        abs = new BigDecimal(wallettransaction.amount).multiply(BigDecimal.valueOf(10000L)).divide(BigDecimal.valueOf(10000 - i), 0, RoundingMode.HALF_UP).longValue();
                        j = abs - wallettransaction.amount;
                    }
                    return new jt7(i2, R.drawable.wallet_transaction_swap, true, i2 == 0 ? wallettransaction.amount > 0 ? 0 : -1 : 1, wallettransaction.amount, abs, j, 0L, 0, null, i2 == 0 ? 2131749503 : 2131749495);
                }
            }
            i = -1;
            if (i > 0) {
            }
            j = 0;
            return new jt7(i2, R.drawable.wallet_transaction_swap, true, i2 == 0 ? wallettransaction.amount > 0 ? 0 : -1 : 1, wallettransaction.amount, abs, j, 0L, 0, null, i2 == 0 ? 2131749503 : 2131749495);
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionChangePrice) {
            TL_wallet.walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = (TL_wallet.walletOnchainGiftActionChangePrice) walletOnchainGiftAction;
            boolean hasOldPrice = walletonchaingiftactionchangeprice.hasOldPrice();
            long j3 = wallettransaction.amount;
            if (!hasOldPrice) {
                return new jt7(3, R.drawable.wallet_transaction_out, false, -1, j3, walletonchaingiftactionchangeprice.new_price, 0L, 0L, 0, null, 0);
            }
            jt7 jt7Var = new jt7(9, R.drawable.wallet_transaction_reprice, true, 0, j3, walletonchaingiftactionchangeprice.new_price, 0L, 0L, 0, null, 0);
            jt7Var.i = walletonchaingiftactionchangeprice.old_price;
            return jt7Var;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionDelist) {
            return new jt7(4, R.drawable.wallet_transaction_in, true, 1, wallettransaction.amount, 0L, 0L, 0L, 0, null, 0);
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferCreate) {
            TL_wallet.walletOnchainGiftActionOfferCreate walletonchaingiftactionoffercreate = (TL_wallet.walletOnchainGiftActionOfferCreate) walletOnchainGiftAction;
            long j4 = wallettransaction.amount;
            return new jt7(5, R.drawable.wallet_transaction_out, false, 0, -(j4 != 0 ? Math.abs(j4) : walletonchaingiftactionoffercreate.amount), walletonchaingiftactionoffercreate.price, walletonchaingiftactionoffercreate.service_fee, 0L, walletonchaingiftactionoffercreate.expires_at, walletonchaingiftactionoffercreate.counterparty_address, 2131742671);
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferAccept) {
            TL_wallet.walletOnchainGiftActionOfferAccept walletonchaingiftactionofferaccept = (TL_wallet.walletOnchainGiftActionOfferAccept) walletOnchainGiftAction;
            boolean z = walletonchaingiftactionofferaccept.buyer;
            long j5 = wallettransaction.amount;
            if (z) {
                return new jt7(0, R.drawable.wallet_transaction_swap, true, 1, -(j5 != 0 ? Math.abs(j5) : walletonchaingiftactionofferaccept.price + walletonchaingiftactionofferaccept.service_fee), walletonchaingiftactionofferaccept.price, walletonchaingiftactionofferaccept.service_fee, 0L, 0, walletonchaingiftactionofferaccept.counterparty_address, 2131749495);
            }
            return new jt7(2, R.drawable.wallet_transaction_swap, true, 0, j5 != 0 ? Math.abs(j5) : walletonchaingiftactionofferaccept.price, walletonchaingiftactionofferaccept.price, walletonchaingiftactionofferaccept.service_fee, 0L, 0, walletonchaingiftactionofferaccept.counterparty_address, 2131749503);
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferCancel) {
            TL_wallet.walletOnchainGiftActionOfferCancel walletonchaingiftactionoffercancel = (TL_wallet.walletOnchainGiftActionOfferCancel) walletOnchainGiftAction;
            jt7 d = d(6, wallettransaction, walletonchaingiftactionoffercancel.refund_amount, walletonchaingiftactionoffercancel.price, walletonchaingiftactionoffercancel.fine, walletonchaingiftactionoffercancel.counterparty_address);
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

    public static jt7 d(int i, TL_wallet.walletTransaction wallettransaction, long j, long j2, long j3, String str) {
        long j4 = wallettransaction.amount;
        return new jt7(i, R.drawable.wallet_transaction_in, true, 0, j4 != 0 ? Math.abs(j4) : j, j2, 0L, j3, 0, str, 2131742671);
    }

    public static SpannableStringBuilder f(int i, long j) {
        return nza.b1(true, ob6.a0(null, null, i, "⭐️ " + c.s(j, false)), 0.7f, null);
    }

    public final CharSequence b() {
        byte b = this.a;
        long j = this.e;
        long j2 = this.f;
        switch (b) {
            case 0:
                if (j2 == 0) {
                    j2 = Math.abs(j);
                }
                return f(2131742711, j2);
            case 1:
                if (j != 0) {
                    j2 = Math.abs(j);
                }
                return f(2131742700, j2);
            case 2:
                return f(2131742710, Math.abs(j));
            case 3:
                return j2 != 0 ? f(2131742704, j2) : ob6.M0(2131742705, null);
            case 4:
                return ob6.M0(2131742703, null);
            case 5:
                return ob6.M0(2131742706, null);
            case 6:
                return ob6.M0(2131742709, null);
            case 7:
                return ob6.M0(2131742708, null);
            case 8:
                return ob6.M0(2131742707, null);
            case 9:
                return f(2131742702, j2);
            default:
                return "";
        }
    }

    public final String e() {
        switch (this.a) {
            case 0:
                return ob6.M0(2131742697, null);
            case 1:
                return ob6.M0(2131742694, null);
            case 2:
                return ob6.M0(2131742699, null);
            case 3:
                return ob6.M0(2131742696, null);
            case 4:
                return ob6.M0(2131742695, null);
            case 5:
                return ob6.M0(2131742706, null);
            case 6:
                return ob6.M0(2131742709, null);
            case 7:
                return ob6.M0(2131742708, null);
            case 8:
                return ob6.M0(2131742707, null);
            case 9:
                return ob6.M0(2131742698, null);
            default:
                return "";
        }
    }
}
