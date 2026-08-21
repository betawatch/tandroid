package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class H3 extends b2 {
    public final boolean b;

    public H3(A2 a2, g2 g2Var) {
        super(g2Var);
        this.b = true;
    }

    @Override // j$.util.stream.b2, j$.util.stream.g2
    public final void y(long j) {
        this.a.y(-1L);
    }

    @Override // j$.util.stream.f2, j$.util.stream.g2
    public final void accept(long j) {
        if (this.b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.b2, j$.util.stream.g2
    public final boolean C() {
        return !this.b || this.a.C();
    }
}
