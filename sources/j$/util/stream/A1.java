package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
public final class A1 extends r1 {
    public final /* synthetic */ DoubleBinaryOperator h;
    public final /* synthetic */ double i;

    @Override // j$.util.stream.r1
    public final M1 Z() {
        return new v1(this.i, this.h);
    }

    public A1(T2 t2, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }
}
