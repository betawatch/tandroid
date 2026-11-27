// default package

import j$.util.function.Predicate$-CC;
import java.util.HashSet;
import java.util.function.Predicate;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lt0 implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ HashSet b;

    public /* synthetic */ lt0(HashSet hashSet, byte b) {
        this.a = b;
        this.b = hashSet;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        byte b = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        byte b = this.a;
        return Predicate$-CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        byte b = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean contains;
        byte b = this.a;
        HashSet hashSet = this.b;
        nt0 nt0Var = (nt0) obj;
        switch (b) {
            case 0:
                contains = hashSet.contains(Long.valueOf(nt0Var.b));
                break;
            default:
                contains = hashSet.contains(Long.valueOf(nt0Var.b));
                break;
        }
        return !contains;
    }
}
