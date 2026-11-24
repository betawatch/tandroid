// default package

import j$.util.function.Predicate$-CC;
import java.util.HashSet;
import java.util.function.Predicate;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class dt0 implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ HashSet b;

    public /* synthetic */ dt0(HashSet hashSet, byte b) {
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
        ft0 ft0Var = (ft0) obj;
        switch (b) {
            case 0:
                contains = hashSet.contains(Long.valueOf(ft0Var.b));
                break;
            default:
                contains = hashSet.contains(Long.valueOf(ft0Var.b));
                break;
        }
        return !contains;
    }
}
