package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
final class P3 extends g2 implements a4 {
    final /* synthetic */ Q3 b;

    @Override // j$.util.stream.a4
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P3(Q3 q3, m2 m2Var, boolean z) {
        super(m2Var);
        this.b = q3;
    }

    @Override // j$.util.stream.k2, j$.util.stream.m2
    public final void accept(int i) {
        this.b.getClass();
        IntPredicate intPredicate = null;
        intPredicate.test(i);
        throw null;
    }
}
