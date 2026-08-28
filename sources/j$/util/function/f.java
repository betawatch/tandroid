package j$.util.function;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ f(Predicate predicate, Predicate predicate2, int i9) {
        this.a = i9;
        this.b = predicate;
        this.c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$-CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return this.b.test(obj) && this.c.test(obj);
            default:
                return this.b.test(obj) || this.c.test(obj);
        }
    }
}
