package ag;

import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p {
    public final TLRPC.TL_premiumGiftOption a;
    public final TLRPC.TL_premiumGiftCodeOption b;
    public final TLRPC.TL_premiumGiftOption c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int e;
    public long f;
    public long g;
    public n2.l h;

    public p(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.a = tL_premiumGiftOption;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption == null) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        } else if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
            return tL_premiumGiftOption.currency;
        }
        n2.l lVar = this.h;
        return lVar == null ? "" : lVar.a().c;
    }

    public final int b() {
        if (this.e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.g != 0) {
                int f10 = (int) ((1.0d - (f() / this.g)) * 100.0d);
                this.e = f10;
                if (f10 == 0) {
                    this.e = -1;
                }
            }
        }
        return this.e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        return (BuildVars.useInvoiceBilling() || ((tL_premiumGiftOption = this.a) != null && tL_premiumGiftOption.store_product == null) || ((tL_premiumGiftCodeOption = this.b) != null && tL_premiumGiftCodeOption.store_product == null)) ? BillingController.getInstance().formatCurrency(e(), a()) : this.h == null ? "" : BillingController.getInstance().formatCurrency(e(), a(), 6);
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption == null) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        } else if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
            return tL_premiumGiftOption.amount;
        }
        n2.l lVar = this.h;
        if (lVar == null) {
            return 0L;
        }
        return lVar.a().b;
    }

    public final long f() {
        if (this.f == 0) {
            long e9 = e();
            if (e9 != 0) {
                this.f = e9 / d();
            }
        }
        return this.f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.c;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.amount;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.d;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.amount;
        }
        return 0L;
    }

    public final String h() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public p(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.a = null;
        this.b = tL_premiumGiftCodeOption;
        this.c = null;
        this.d = com.google.android.recaptcha.internal.a.u(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
