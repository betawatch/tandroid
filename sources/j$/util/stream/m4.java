package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
