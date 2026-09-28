package oi;

import j$.util.function.IntUnaryOperator$-CC;
import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements IntUnaryOperator {
    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$-CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i10) {
        if (i10 >= 16777215) {
            return 1;
        }
        return i10 + 1;
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$-CC.$default$compose(this, intUnaryOperator);
    }
}
