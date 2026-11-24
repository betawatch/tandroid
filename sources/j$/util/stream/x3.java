package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
