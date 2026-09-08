package org.telegram.ui;

import j$.util.Objects;
import j$.util.function.Predicate$-CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ ab(int i10) {
        this.a = i10;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i10 = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i10 = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((String) obj) != null;
            case 1:
                return !((MessageObject) obj).isEphemeral();
            case 2:
                return Objects.nonNull((TLObject) obj);
            default:
                return !((TL_stars.StarGift) obj).auction;
        }
    }
}
