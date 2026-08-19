package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
public final class z1 extends q1 {
    public final /* synthetic */ DoubleBinaryOperator h;
    public final /* synthetic */ double i;

    @Override // j$.util.stream.q1
    public final L1 Y() {
        return new u1(this.i, this.h);
    }

    public z1(T2 t2, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }
}
