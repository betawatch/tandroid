package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
final class N1 extends w0 {
    final /* synthetic */ IntBinaryOperator h;
    final /* synthetic */ int i;

    @Override // j$.util.stream.w0
    public final S1 e0() {
        return new M1(this.i, this.h);
    }

    N1(b3 b3Var, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }
}
