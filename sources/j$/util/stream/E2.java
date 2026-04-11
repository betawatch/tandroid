package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class E2 extends z {
    @Override // j$.util.stream.b
    public final m2 Q(int i, m2 m2Var) {
        Objects.requireNonNull(m2Var);
        return a3.SORTED.o(i) ? m2Var : a3.SIZED.o(i) ? new J2(m2Var) : new B2(m2Var);
    }

    @Override // j$.util.stream.b
    public final I0 N(b bVar, Spliterator spliterator, IntFunction intFunction) {
        if (a3.SORTED.o(bVar.J())) {
            return bVar.B(spliterator, false, intFunction);
        }
        double[] dArr = (double[]) ((C0) bVar.B(spliterator, true, intFunction)).d();
        Arrays.sort(dArr);
        return new V0(dArr);
    }
}
