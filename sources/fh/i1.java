package fh;

import j$.util.Objects;
import j$.util.function.Predicate$-CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ i1(int i9) {
        this.a = i9;
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
        switch (this.a) {
            case 0:
                return !((TL_stars.StarGift) obj).auction;
            case 1:
                return ((String) obj) != null;
            case 2:
                return !((MessageObject) obj).isEphemeral();
            default:
                return Objects.nonNull((TLObject) obj);
        }
    }
}
