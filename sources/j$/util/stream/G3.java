package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class G3 extends X implements O3 {
    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        return S2.ORDERED.q(aVar.f) ? J(aVar, spliterator, new Z(27)).spliterator() : new T3((j$.util.W) aVar.S(spliterator), 0);
    }

    @Override // j$.util.stream.a
    public final C0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        return (C0) new Q3(this, aVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        return new F3(this, g2Var, false);
    }

    @Override // j$.util.stream.O3
    public final P3 j(u0 u0Var, boolean z) {
        return new F3(this, u0Var, z);
    }
}
