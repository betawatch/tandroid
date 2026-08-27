package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final class w3 extends t3 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ w3(w6 w6Var, Object obj, int i10) {
        this.h = i10;
        this.i = obj;
    }

    @Override // j$.util.stream.t3
    public final o4 D0() {
        switch (this.h) {
            case 0:
                return new n4((LongBinaryOperator) this.i);
            case 1:
                return new z3((DoubleBinaryOperator) this.i);
            case 2:
                return new e4((BinaryOperator) this.i);
            default:
                return new k4((IntBinaryOperator) this.i);
        }
    }
}
