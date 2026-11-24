package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
