package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class e6 extends z4 {
    public final boolean s;
    public final Comparator t;

    public e6(b5 b5Var) {
        super(b5Var, v6.q | v6.o);
        this.s = true;
        this.t = j$.util.f.INSTANCE;
    }

    public e6(b5 b5Var, Comparator comparator) {
        super(b5Var, v6.q | v6.p);
        this.s = false;
        this.t = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i10, j5 j5Var) {
        Objects.requireNonNull(j5Var);
        if (v6.SORTED.m(i10) && this.s) {
            return j5Var;
        }
        if (v6.SIZED.m(i10)) {
            return new j6(j5Var, this.t);
        }
        return new f6(j5Var, this.t);
    }

    @Override // j$.util.stream.a
    public final e2 N0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        if (v6.SORTED.m(((a) t3Var).m) && this.s) {
            return t3Var.j0(spliterator, false, intFunction);
        }
        Object[] g10 = t3Var.j0(spliterator, true, intFunction).g(intFunction);
        Arrays.sort(g10, this.t);
        return new h2(g10);
    }
}
