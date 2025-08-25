package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class G2 extends i0 {
    @Override // j$.util.stream.b
    public final m2 Q(int i, m2 m2Var) {
        Objects.requireNonNull(m2Var);
        return a3.SORTED.m(i) ? m2Var : a3.SIZED.m(i) ? new L2(m2Var) : new D2(m2Var);
    }

    @Override // j$.util.stream.b
    public final I0 N(b bVar, Spliterator spliterator, IntFunction intFunction) {
        if (a3.SORTED.m(bVar.J())) {
            return bVar.B(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((G0) bVar.B(spliterator, true, intFunction)).d();
        Arrays.sort(jArr);
        return new n1(jArr);
    }
}
