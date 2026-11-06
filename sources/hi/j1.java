package hi;

import j$.util.function.Predicate$-CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i7 = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i7 = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean contains;
        boolean z9;
        switch (this.a) {
            case 0:
                contains = ((HashSet) this.b).contains(Long.valueOf(((l1) obj).b));
                break;
            case 1:
                contains = ((HashSet) this.b).contains(Long.valueOf(((l1) obj).b));
                break;
            default:
                zh.h1 h1Var = (zh.h1) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z9 = h1Var.S1.disallow_unique_stargifts;
                } else {
                    h1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = h1Var.S1;
                        if (disallowedGiftsSettings.disallow_limited_stargifts) {
                            return starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts;
                        }
                        return true;
                    }
                    z9 = h1Var.S1.disallow_unlimited_stargifts;
                }
                return true ^ z9;
        }
        return !contains;
    }
}
