package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class E3 extends a2 {
    public final boolean b;

    public E3(z2 z2Var, g2 g2Var) {
        super(g2Var);
        this.b = true;
    }

    @Override // j$.util.stream.a2, j$.util.stream.g2
    public final void y(long j) {
        this.a.y(-1L);
    }

    @Override // j$.util.stream.e2, j$.util.stream.g2
    public final void accept(int i) {
        if (this.b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i);
            throw null;
        }
    }

    @Override // j$.util.stream.a2, j$.util.stream.g2
    public final boolean C() {
        return !this.b || this.a.C();
    }
}
