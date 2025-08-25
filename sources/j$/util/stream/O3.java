package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class O3 extends Z {
    @Override // j$.util.stream.b
    final Spliterator O(b bVar, Spliterator spliterator) {
        return a3.ORDERED.m(bVar.J()) ? N(bVar, spliterator, new c0(15)).spliterator() : new e4((j$.util.Y) bVar.W(spliterator), 1);
    }

    @Override // j$.util.stream.b
    final I0 N(b bVar, Spliterator spliterator, IntFunction intFunction) {
        return (I0) new c4(this, bVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        return new N3(this, m2Var);
    }
}
