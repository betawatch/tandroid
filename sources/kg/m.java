package kg;

import org.telegram.messenger.v2;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m {
    public final TLRPC.TL_premiumGiftOption a;
    public final TLRPC.TL_premiumGiftCodeOption b;
    public final TLRPC.TL_premiumGiftOption c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int e;
    public long f;
    public long g;
    public c5.m h;

    public m(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.a = tL_premiumGiftOption;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption == null) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
            if (tL_premiumGiftCodeOption != null && (v2.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        } else if (v2.b() || tL_premiumGiftOption.store_product == null) {
            return tL_premiumGiftOption.currency;
        }
        c5.m mVar = this.h;
        return mVar == null ? "" : mVar.a().c;
    }

    public final int b() {
        if (this.e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.g != 0) {
                int f7 = (int) ((1.0d - (f() / this.g)) * 100.0d);
                this.e = f7;
                if (f7 == 0) {
                    this.e = -1;
                }
            }
        }
        return this.e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (v2.b() || (((tL_premiumGiftOption = this.a) != null && tL_premiumGiftOption.store_product == null) || ((tL_premiumGiftCodeOption = this.b) != null && tL_premiumGiftCodeOption.store_product == null))) {
            return org.telegram.messenger.u1.i().f(e(), a());
        }
        if (this.h == null) {
            return "";
        }
        org.telegram.messenger.u1 i10 = org.telegram.messenger.u1.i();
        long e = e();
        String a2 = a();
        i10.getClass();
        return org.telegram.messenger.u1.g(a2, 6, e, false);
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
            if (tL_premiumGiftCodeOption != null && (v2.b() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        } else if (v2.b() || tL_premiumGiftOption.store_product == null) {
            return tL_premiumGiftOption.amount;
        }
        c5.m mVar = this.h;
        if (mVar == null) {
            return 0L;
        }
        return mVar.a().b;
    }

    public final long f() {
        if (this.f == 0) {
            long e = e();
            if (e != 0) {
                this.f = e / d();
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

    public m(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.a = null;
        this.b = tL_premiumGiftCodeOption;
        this.c = null;
        this.d = c3.i0.t(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
