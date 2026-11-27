package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class m4 extends w3 {
    public final /* synthetic */ IntBinaryOperator h;
    public final /* synthetic */ int i;

    public m4(c7 c7Var, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.w3
    public final r4 Y() {
        return new l4(this.i, this.h);
    }
}
