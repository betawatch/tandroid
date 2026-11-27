package j$.util.stream;

import java.util.function.DoublePredicate;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
