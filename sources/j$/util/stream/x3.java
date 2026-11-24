package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class x3 extends w3 {
    public final /* synthetic */ LongBinaryOperator h;
    public final /* synthetic */ long i;

    public x3(c7 c7Var, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }

    @Override // j$.util.stream.w3
    public final r4 Y() {
        return new p4(this.i, this.h);
    }
}
