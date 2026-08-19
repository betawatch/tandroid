package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class H3 extends a2 {
    public final boolean b;

    public H3(z2 z2Var, f2 f2Var) {
        super(f2Var);
        this.b = true;
    }

    @Override // j$.util.stream.a2, j$.util.stream.f2
    public final void y(long j) {
        this.a.y(-1L);
    }

    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final void accept(long j) {
        if (this.b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.a2, j$.util.stream.f2
    public final boolean C() {
        return !this.b || this.a.C();
    }
}
