package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final class u1 extends r1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ u1(T2 t2, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.r1
    public final M1 Z() {
        switch (this.h) {
            case 0:
                return new L1((LongBinaryOperator) this.i);
            case 1:
                return new x1((DoubleBinaryOperator) this.i);
            case 2:
                return new C1((BinaryOperator) this.i);
            default:
                return new I1((IntBinaryOperator) this.i);
        }
    }
}
