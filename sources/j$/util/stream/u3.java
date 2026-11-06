package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final class u3 extends t3 {
    public final /* synthetic */ LongBinaryOperator h;
    public final /* synthetic */ long i;

    @Override // j$.util.stream.t3
    public final o4 D0() {
        return new m4(this.i, this.h);
    }

    public u3(w6 w6Var, LongBinaryOperator longBinaryOperator, long j3) {
        this.h = longBinaryOperator;
        this.i = j3;
    }
}
