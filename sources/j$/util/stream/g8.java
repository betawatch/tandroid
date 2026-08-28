package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class g8 extends d5 {
    public final boolean b;

    public g8(c6 c6Var, j5 j5Var) {
        super(j5Var);
        this.b = true;
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void o(long j10) {
        this.a.o(-1L);
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i9) {
        if (this.b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i9);
            throw null;
        }
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final boolean q() {
        return !this.b || this.a.q();
    }
}
