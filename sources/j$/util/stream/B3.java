package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class B3 extends W1 {
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(X1 x1, int i, Predicate predicate) {
        super(x1, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        return S2.ORDERED.q(aVar.f) ? J(aVar, spliterator, new Y(12)).spliterator() : new V3(aVar.S(spliterator), this.m, 1);
    }

    @Override // j$.util.stream.a
    public final B0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        return (B0) new R3(this, aVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        return new j(this, f2Var);
    }
}
