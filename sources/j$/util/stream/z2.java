package j$.util.stream;

import j$.util.Comparator$-CC;
import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class z2 extends V1 {
    private final boolean m;
    private final Comparator n;

    z2(b bVar) {
        super(bVar, R2.q | R2.o, 0);
        this.m = true;
        this.n = Comparator$-CC.a();
    }

    z2(b bVar, Comparator comparator) {
        super(bVar, R2.q | R2.p, 0);
        this.m = false;
        comparator.getClass();
        this.n = comparator;
    }

    @Override // j$.util.stream.b
    public final F0 u0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        if (R2.SORTED.d(bVar.q0()) && this.m) {
            return bVar.i0(spliterator, false, intFunction);
        }
        Object[] s = bVar.i0(spliterator, true, intFunction).s(intFunction);
        Arrays.sort(s, this.n);
        return new I0(s);
    }

    @Override // j$.util.stream.b
    public final e2 x0(int i, e2 e2Var) {
        e2Var.getClass();
        if (R2.SORTED.d(i) && this.m) {
            return e2Var;
        }
        boolean d = R2.SIZED.d(i);
        Comparator comparator = this.n;
        return d ? new E2(e2Var, comparator) : new A2(e2Var, comparator);
    }
}
