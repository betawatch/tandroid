package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
final class X3 extends f2 implements a4 {
    final /* synthetic */ Y3 b;

    @Override // j$.util.stream.a4
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X3(Y3 y3, m2 m2Var, boolean z) {
        super(m2Var);
        this.b = y3;
    }

    @Override // j$.util.stream.j2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.b.getClass();
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }
}
