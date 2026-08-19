package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class E3 extends Z1 {
    public final boolean b;

    public E3(y2 y2Var, f2 f2Var) {
        super(f2Var);
        this.b = true;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.f2
    public final void y(long j) {
        this.a.y(-1L);
    }

    @Override // j$.util.stream.d2, j$.util.stream.f2
    public final void accept(int i) {
        if (this.b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i);
            throw null;
        }
    }

    @Override // j$.util.stream.Z1, j$.util.stream.f2
    public final boolean C() {
        return !this.b || this.a.C();
    }
}
