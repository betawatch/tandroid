package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class S3 extends i0 {
    @Override // j$.util.stream.b
    final Spliterator O(b bVar, Spliterator spliterator) {
        return a3.ORDERED.o(bVar.J()) ? N(bVar, spliterator, new b0(20)).spliterator() : new f4((j$.util.c0) bVar.W(spliterator), 1);
    }

    @Override // j$.util.stream.b
    final I0 N(b bVar, Spliterator spliterator, IntFunction intFunction) {
        return (I0) new c4(this, bVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        return new R3(this, m2Var);
    }
}
