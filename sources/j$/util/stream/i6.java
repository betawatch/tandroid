package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class i6 extends d5 {
    public final boolean l;
    public final Comparator m;

    public i6(f5 f5Var, Comparator comparator) {
        super(f5Var, b7.q | b7.p);
        this.l = false;
        this.m = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final h2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (b7.SORTED.n(aVar.f) && this.l) {
            return aVar.B(spliterator, false, intFunction);
        }
        Object[] g = aVar.B(spliterator, true, intFunction).g(intFunction);
        Arrays.sort(g, this.m);
        return new k2(g);
    }

    @Override // j$.util.stream.a
    public final n5 M(int i, n5 n5Var) {
        Objects.requireNonNull(n5Var);
        if (b7.SORTED.n(i) && this.l) {
            return n5Var;
        }
        boolean n = b7.SIZED.n(i);
        Comparator comparator = this.m;
        return n ? new n6(n5Var, comparator) : new j6(n5Var, comparator);
    }

    public i6(f5 f5Var) {
        super(f5Var, b7.q | b7.o);
        this.l = true;
        this.m = j$.util.f.INSTANCE;
    }
}
