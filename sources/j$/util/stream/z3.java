package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class z3 extends w3 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    public /* synthetic */ z3(c7 c7Var, Object obj, byte b) {
        this.h = b;
        this.i = obj;
    }

    @Override // j$.util.stream.w3
    public final r4 Y() {
        switch (this.h) {
            case 0:
                return new q4((LongBinaryOperator) this.i);
            case 1:
                return new c4((DoubleBinaryOperator) this.i);
            case 2:
                return new h4((BinaryOperator) this.i);
            default:
                return new n4((IntBinaryOperator) this.i);
        }
    }
}
