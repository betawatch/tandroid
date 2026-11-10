package hi;

import j$.util.function.Predicate$-CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                zh.g1 g1Var = (zh.g1) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z9 = g1Var.V1.disallow_unique_stargifts;
                } else {
                    g1Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = g1Var.V1;
                        if (disallowedGiftsSettings.disallow_limited_stargifts) {
                            return starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts;
                        }
                        return true;
                    }
                    z9 = g1Var.V1.disallow_unlimited_stargifts;
                }
                return true ^ z9;
        }
        return !contains;
    }
}
