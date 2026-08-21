package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class D3 extends X1 implements O3 {
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3(Y1 y1, int i, Predicate predicate) {
        super(y1, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        return S2.ORDERED.q(aVar.f) ? J(aVar, spliterator, new Z(12)).spliterator() : new V3(aVar.S(spliterator), this.m, 0);
    }

    @Override // j$.util.stream.a
    public final C0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        return (C0) new Q3(this, aVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        return new C3(this, g2Var, false);
    }

    @Override // j$.util.stream.O3
    public final P3 j(u0 u0Var, boolean z) {
        return new C3(this, u0Var, z);
    }
}
