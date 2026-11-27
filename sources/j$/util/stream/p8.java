package j$.util.stream;

import java.util.function.DoublePredicate;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class p8 extends g5 implements r8 {
    public p8(f6 f6Var, n5 n5Var, boolean z) {
        super(n5Var);
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }

    @Override // j$.util.stream.r8
    public final long v() {
        return 0L;
    }
}
