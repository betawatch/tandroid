package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class L3 extends Y1 {
    public final boolean b;

    public L3(x2 x2Var, f2 f2Var) {
        super(f2Var);
        this.b = true;
    }

    @Override // j$.util.stream.Y1, j$.util.stream.f2
    public final void y(long j) {
        this.a.y(-1L);
    }

    @Override // j$.util.stream.c2, j$.util.stream.f2
    public final void accept(double d) {
        if (this.b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d);
            throw null;
        }
    }

    @Override // j$.util.stream.Y1, j$.util.stream.f2
    public final boolean C() {
        return !this.b || this.a.C();
    }
}
