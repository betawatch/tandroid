package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final class r1 extends q1 {
    public final /* synthetic */ LongBinaryOperator h;
    public final /* synthetic */ long i;

    @Override // j$.util.stream.q1
    public final L1 Y() {
        return new J1(this.i, this.h);
    }

    public r1(T2 t2, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }
}
