package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class U3 extends i0 implements Z3 {
    @Override // j$.util.stream.b
    final Spliterator O(b bVar, Spliterator spliterator) {
        return a3.ORDERED.m(bVar.J()) ? N(bVar, spliterator, new c0(18)).spliterator() : new f4((j$.util.b0) bVar.W(spliterator), 0);
    }

    @Override // j$.util.stream.b
    final I0 N(b bVar, Spliterator spliterator, IntFunction intFunction) {
        return (I0) new b4(this, bVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        return new T3(this, m2Var, false);
    }

    @Override // j$.util.stream.Z3
    public final a4 j(A0 a0, boolean z) {
        return new T3(this, a0, z);
    }
}
