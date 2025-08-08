package j$.util.stream;

import j$.util.Comparator$-CC;
import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class y2 extends U1 {
    private final boolean m;
    private final Comparator n;

    y2(V1 v1) {
        super(v1, Q2.q | Q2.o, 0);
        this.m = true;
        this.n = Comparator$-CC.a();
    }

    y2(V1 v1, Comparator comparator) {
        super(v1, Q2.q | Q2.p, 0);
        this.m = false;
        comparator.getClass();
        this.n = comparator;
    }

    @Override // j$.util.stream.b
    public final F0 t0(b bVar, Spliterator spliterator, IntFunction intFunction) {
        if (Q2.SORTED.i(bVar.p0()) && this.m) {
            return bVar.h0(spliterator, false, intFunction);
        }
        Object[] s = bVar.h0(spliterator, true, intFunction).s(intFunction);
        Arrays.sort(s, this.n);
        return new I0(s);
    }

    @Override // j$.util.stream.b
    public final d2 w0(int i, d2 d2Var) {
        d2Var.getClass();
        if (Q2.SORTED.i(i) && this.m) {
            return d2Var;
        }
        boolean i2 = Q2.SIZED.i(i);
        Comparator comparator = this.n;
        if (i2) {
            return new D2(d2Var, comparator);
        }
        return new z2(d2Var, comparator);
    }
}
