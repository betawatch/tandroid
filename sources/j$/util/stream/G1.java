package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
final class G1 extends w0 {
    final /* synthetic */ DoubleBinaryOperator h;
    final /* synthetic */ double i;

    @Override // j$.util.stream.w0
    public final S1 e0() {
        return new B1(this.i, this.h);
    }

    G1(b3 b3Var, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }
}
