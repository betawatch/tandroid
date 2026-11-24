// default package

import j$.util.function.Predicate$-CC;
import java.util.HashSet;
import java.util.function.Predicate;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lu0 implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ HashSet b;

    public /* synthetic */ lu0(HashSet hashSet, byte b) {
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
        nu0 nu0Var = (nu0) obj;
        switch (b) {
            case 0:
                contains = hashSet.contains(Long.valueOf(nu0Var.b));
                break;
            default:
                contains = hashSet.contains(Long.valueOf(nu0Var.b));
                break;
        }
        return !contains;
    }
}
