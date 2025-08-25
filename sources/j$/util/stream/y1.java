package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
final class y1 extends w0 {
    final /* synthetic */ LongBinaryOperator h;
    final /* synthetic */ long i;

    @Override // j$.util.stream.w0
    public final S1 e0() {
        return new Q1(this.i, this.h);
    }

    y1(b3 b3Var, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }
}
