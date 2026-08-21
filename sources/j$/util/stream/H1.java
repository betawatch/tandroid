package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final class H1 extends r1 {
    public final /* synthetic */ IntBinaryOperator h;
    public final /* synthetic */ int i;

    @Override // j$.util.stream.r1
    public final M1 Z() {
        return new G1(this.i, this.h);
    }

    public H1(T2 t2, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }
}
