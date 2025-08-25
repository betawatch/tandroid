package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
final class A1 extends w0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;

    public /* synthetic */ A1(b3 b3Var, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.w0
    public final S1 e0() {
        switch (this.h) {
            case 0:
                return new R1((LongBinaryOperator) this.i);
            case 1:
                return new D1((DoubleBinaryOperator) this.i);
            case 2:
                return new I1((BinaryOperator) this.i);
            default:
                return new O1((IntBinaryOperator) this.i);
        }
    }
}
