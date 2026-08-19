package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final class t1 extends q1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ t1(T2 t2, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.q1
    public final L1 Y() {
        switch (this.h) {
            case 0:
                return new K1((LongBinaryOperator) this.i);
            case 1:
                return new w1((DoubleBinaryOperator) this.i);
            case 2:
                return new B1((BinaryOperator) this.i);
            default:
                return new H1((IntBinaryOperator) this.i);
        }
    }
}
