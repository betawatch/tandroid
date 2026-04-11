package j$.util.stream;

import j$.util.Comparator$-CC;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class H2 extends d2 {
    private final boolean m;
    private final Comparator n;

    H2(e2 e2Var) {
        super(e2Var, a3.q | a3.o, 0);
        this.m = true;
        this.n = Comparator$-CC.a();
    }

    H2(e2 e2Var, Comparator comparator) {
        super(e2Var, a3.q | a3.p, 0);
        this.m = false;
        this.n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.b
    public final m2 Q(int i, m2 m2Var) {
        Objects.requireNonNull(m2Var);
        if (a3.SORTED.o(i) && this.m) {
            return m2Var;
        }
        boolean o = a3.SIZED.o(i);
        Comparator comparator = this.n;
        if (o) {
            return new M2(m2Var, comparator);
        }
        return new I2(m2Var, comparator);
    }

    @Override // j$.util.stream.b
    public final I0 N(b bVar, Spliterator spliterator, IntFunction intFunction) {
        if (a3.SORTED.o(bVar.J()) && this.m) {
            return bVar.B(spliterator, false, intFunction);
        }
        Object[] o = bVar.B(spliterator, true, intFunction).o(intFunction);
        Arrays.sort(o, this.n);
        return new L0(o);
    }
}
