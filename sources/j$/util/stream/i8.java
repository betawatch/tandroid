package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class i8 extends e5 {
    public final boolean b;

    public i8(d6 d6Var, j5 j5Var) {
        super(j5Var);
        this.b = true;
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void o(long j10) {
        this.a.o(-1L);
    }

    @Override // j$.util.stream.i5, j$.util.stream.j5
    public final void accept(long j10) {
        if (this.b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j10);
            throw null;
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final boolean q() {
        return !this.b || this.a.q();
    }
}
