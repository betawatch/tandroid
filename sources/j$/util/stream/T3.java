package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
final class T3 extends h2 implements a4 {
    final /* synthetic */ U3 b;

    @Override // j$.util.stream.a4
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T3(U3 u3, m2 m2Var, boolean z) {
        super(m2Var);
        this.b = u3;
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final void accept(long j) {
        this.b.getClass();
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }
}
