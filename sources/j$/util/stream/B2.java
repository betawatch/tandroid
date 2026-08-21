package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class B2 extends X1 {
    public final boolean m;
    public final Comparator n;

    public B2(Y1 y1) {
        super(y1, S2.q | S2.o, 0);
        this.m = true;
        this.n = j$.util.d.INSTANCE;
    }

    public B2(Y1 y1, Comparator comparator) {
        super(y1, S2.q | S2.p, 0);
        this.m = false;
        this.n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        Objects.requireNonNull(g2Var);
        if (S2.SORTED.q(i) && this.m) {
            return g2Var;
        }
        boolean q = S2.SIZED.q(i);
        Comparator comparator = this.n;
        if (q) {
            return new G2(g2Var, comparator);
        }
        return new C2(g2Var, comparator);
    }

    @Override // j$.util.stream.a
    public final C0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (S2.SORTED.q(aVar.f) && this.m) {
            return aVar.B(spliterator, false, intFunction);
        }
        Object[] h = aVar.B(spliterator, true, intFunction).h(intFunction);
        Arrays.sort(h, this.n);
        return new F0(h);
    }
}
