package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ms0 {
    public final TLRPC.TL_premiumSubscriptionOption a;
    public int b;
    public long c;
    public long d;
    public long e;
    public e5.l f;
    public e5.k g;
    public int h;

    public ms0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        e5.l lVar = this.f;
        if (lVar != null && this.g == null) {
            ArrayList arrayList = lVar.h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                e5.k kVar = (e5.k) obj;
                String str = ((e5.i) kVar.b.b.get(0)).d;
                int i10 = this.a.months;
                if (i10 != 12) {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i10 + "M")) {
                        this.g = kVar;
                        return;
                    }
                } else if (str.equals("P1Y")) {
                    this.g = kVar;
                    return;
                }
            }
        }
    }

    public final String b() {
        boolean b10 = org.telegram.messenger.r2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.a;
        if (b10 || tL_premiumSubscriptionOption.store_product == null) {
            return tL_premiumSubscriptionOption.currency;
        }
        if (this.f == null) {
            return "";
        }
        a();
        e5.k kVar = this.g;
        return kVar == null ? "" : ((e5.i) kVar.b.b.get(0)).c;
    }

    public final int c() {
        if (this.b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i3 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.b = i3;
                if (i3 == 0) {
                    this.b = -1;
                }
            }
        }
        return this.b;
    }

    public final String d() {
        if (org.telegram.messenger.r2.b() || this.a.store_product == null) {
            return org.telegram.messenger.r1.i().f(g(), b());
        }
        if (this.f == null) {
            return "";
        }
        org.telegram.messenger.r1 i3 = org.telegram.messenger.r1.i();
        long g7 = g();
        String b10 = b();
        i3.getClass();
        return org.telegram.messenger.r1.g(b10, 6, g7, false);
    }

    public final String e() {
        if (org.telegram.messenger.r2.b() || this.a.store_product == null) {
            return org.telegram.messenger.r1.i().f(h(), b());
        }
        if (this.f == null) {
            return "";
        }
        org.telegram.messenger.r1 i3 = org.telegram.messenger.r1.i();
        long h = h();
        String b10 = b();
        i3.getClass();
        return org.telegram.messenger.r1.g(b10, 6, h, false);
    }

    public final String f() {
        if (org.telegram.messenger.r2.b() || this.a.store_product == null) {
            return org.telegram.messenger.r1.i().f(i(), b());
        }
        if (this.f == null) {
            return "";
        }
        org.telegram.messenger.r1 i3 = org.telegram.messenger.r1.i();
        long i10 = i();
        String b10 = b();
        i3.getClass();
        return org.telegram.messenger.r1.g(b10, 6, i10, false);
    }

    public final long g() {
        boolean b10 = org.telegram.messenger.r2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.a;
        if (b10 || tL_premiumSubscriptionOption.store_product == null) {
            return tL_premiumSubscriptionOption.amount;
        }
        if (this.f == null) {
            return 0L;
        }
        a();
        e5.k kVar = this.g;
        if (kVar == null) {
            return 0L;
        }
        return ((e5.i) kVar.b.b.get(0)).b;
    }

    public final long h() {
        if (this.c == 0) {
            long g7 = g();
            if (g7 != 0) {
                this.c = g7 / this.a.months;
            }
        }
        return this.c;
    }

    public final long i() {
        if (this.d == 0) {
            long g7 = g();
            if (g7 != 0) {
                this.d = (long) ((g7 / this.a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
