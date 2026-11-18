package ki;

import j$.util.function.Predicate$-CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i1(Object obj, int i7) {
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
        boolean z10;
        switch (this.a) {
            case 0:
                contains = ((HashSet) this.b).contains(Long.valueOf(((k1) obj).b));
                break;
            case 1:
                contains = ((HashSet) this.b).contains(Long.valueOf(((k1) obj).b));
                break;
            default:
                bi.j3 j3Var = (bi.j3) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = j3Var.W1.disallow_unique_stargifts;
                } else {
                    j3Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = j3Var.W1;
                        if (disallowedGiftsSettings.disallow_limited_stargifts) {
                            return starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts;
                        }
                        return true;
                    }
                    z10 = j3Var.W1.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
