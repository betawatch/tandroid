package mh;

import j$.util.function.Predicate$-CC;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i9 = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i9 = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean contains;
        boolean z10;
        switch (this.a) {
            case 0:
                contains = ((HashSet) this.b).contains(Long.valueOf(((o1) obj).b));
                break;
            case 1:
                contains = ((HashSet) this.b).contains(Long.valueOf(((o1) obj).b));
                break;
            default:
                fh.p2 p2Var = (fh.p2) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = p2Var.X.disallow_unique_stargifts;
                } else {
                    p2Var.getClass();
                    if (starGift.limited) {
                        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = p2Var.X;
                        if (disallowedGiftsSettings.disallow_limited_stargifts) {
                            return starGift.can_upgrade && !disallowedGiftsSettings.disallow_unique_stargifts;
                        }
                        return true;
                    }
                    z10 = p2Var.X.disallow_unlimited_stargifts;
                }
                return true ^ z10;
        }
        return !contains;
    }
}
