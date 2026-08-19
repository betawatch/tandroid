package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class D3 extends W1 implements O3 {
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3(X1 x1, int i, Predicate predicate) {
        super(x1, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        return S2.ORDERED.q(aVar.f) ? J(aVar, spliterator, new Y(12)).spliterator() : new V3(aVar.S(spliterator), this.m, 0);
    }

    @Override // j$.util.stream.a
    public final B0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        return (B0) new Q3(this, aVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        return new C3(this, f2Var, false);
    }

    @Override // j$.util.stream.O3
    public final P3 j(t0 t0Var, boolean z) {
        return new C3(this, t0Var, z);
    }
}
