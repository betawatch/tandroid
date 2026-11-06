package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class l8 extends c5 {
    public final boolean b;

    public l8(b6 b6Var, j5 j5Var) {
        super(j5Var);
        this.b = true;
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final void o(long j3) {
        this.a.o(-1L);
    }

    @Override // j$.util.stream.g5, j$.util.stream.j5
    public final void accept(double d) {
        if (this.b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d);
            throw null;
        }
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final boolean q() {
        return !this.b || this.a.q();
    }
}
