package j$.util.function;

import java.util.function.Predicate;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ h(Predicate predicate, Predicate predicate2, byte b) {
        this.a = b;
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
