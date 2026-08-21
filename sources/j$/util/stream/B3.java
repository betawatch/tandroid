package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class B3 extends X1 {
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(Y1 y1, int i, Predicate predicate) {
        super(y1, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        return S2.ORDERED.q(aVar.f) ? J(aVar, spliterator, new Z(12)).spliterator() : new V3(aVar.S(spliterator), this.m, 1);
    }

    @Override // j$.util.stream.a
    public final C0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        return (C0) new R3(this, aVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        return new k(this, g2Var);
    }
}
