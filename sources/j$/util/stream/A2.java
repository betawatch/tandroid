package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class A2 extends W1 {
    public final boolean m;
    public final Comparator n;

    public A2(X1 x1) {
        super(x1, S2.q | S2.o, 0);
        this.m = true;
        this.n = j$.util.d.INSTANCE;
    }

    public A2(X1 x1, Comparator comparator) {
        super(x1, S2.q | S2.p, 0);
        this.m = false;
        this.n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        Objects.requireNonNull(f2Var);
        if (S2.SORTED.q(i) && this.m) {
            return f2Var;
        }
        boolean q = S2.SIZED.q(i);
        Comparator comparator = this.n;
        if (q) {
            return new F2(f2Var, comparator);
        }
        return new B2(f2Var, comparator);
    }

    @Override // j$.util.stream.a
    public final B0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (S2.SORTED.q(aVar.f) && this.m) {
            return aVar.B(spliterator, false, intFunction);
        }
        Object[] h = aVar.B(spliterator, true, intFunction).h(intFunction);
        Arrays.sort(h, this.n);
        return new E0(h);
    }
}
