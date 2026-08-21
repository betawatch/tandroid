package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class L3 extends Z1 {
    public final boolean b;

    public L3(y2 y2Var, g2 g2Var) {
        super(g2Var);
        this.b = true;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.g2
    public final void y(long j) {
        this.a.y(-1L);
    }

    @Override // j$.util.stream.d2, j$.util.stream.g2
    public final void accept(double d) {
        if (this.b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d);
            throw null;
        }
    }

    @Override // j$.util.stream.Z1, j$.util.stream.g2
    public final boolean C() {
        return !this.b || this.a.C();
    }
}
