package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class M3 extends d2 implements Z3 {
    final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3(e2 e2Var, int i, Predicate predicate) {
        super(e2Var, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.b
    final Spliterator O(b bVar, Spliterator spliterator) {
        return a3.ORDERED.m(bVar.J()) ? N(bVar, spliterator, new c0(8)).spliterator() : new g4(bVar.W(spliterator), this.m, 0);
    }

    @Override // j$.util.stream.b
    final I0 N(b bVar, Spliterator spliterator, IntFunction intFunction) {
        return (I0) new b4(this, bVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        return new L3(this, m2Var, false);
    }

    @Override // j$.util.stream.Z3
    public final a4 j(A0 a0, boolean z) {
        return new L3(this, a0, z);
    }
}
