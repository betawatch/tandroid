package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class i4 extends w3 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ Collector k;

    public i4(c7 c7Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }

    @Override // j$.util.stream.w3
    public final r4 Y() {
        return new j4(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.w3, j$.util.stream.h8
    public final int c() {
        if (this.k.characteristics().contains(g.UNORDERED)) {
            return b7.r;
        }
        return 0;
    }
}
