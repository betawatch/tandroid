package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final class G1 extends q1 {
    public final /* synthetic */ IntBinaryOperator h;
    public final /* synthetic */ int i;

    @Override // j$.util.stream.q1
    public final L1 Y() {
        return new F1(this.i, this.h);
    }

    public G1(T2 t2, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }
}
