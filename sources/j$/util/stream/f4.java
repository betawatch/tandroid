package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class f4 extends w3 {
    public final /* synthetic */ DoubleBinaryOperator h;
    public final /* synthetic */ double i;

    public f4(c7 c7Var, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }

    @Override // j$.util.stream.w3
    public final r4 Y() {
        return new a4(this.i, this.h);
    }
}
