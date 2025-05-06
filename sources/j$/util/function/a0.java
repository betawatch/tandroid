package j$.util.function;

import java.util.function.LongUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements c0 {
    public final /* synthetic */ LongUnaryOperator a;

    private /* synthetic */ a0(LongUnaryOperator longUnaryOperator) {
        this.a = longUnaryOperator;
    }

    public static /* synthetic */ c0 c(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return longUnaryOperator instanceof b0 ? ((b0) longUnaryOperator).a : new a0(longUnaryOperator);
    }

    @Override // j$.util.function.c0
    public final /* synthetic */ c0 a(c0 c0Var) {
        return c(this.a.andThen(b0.a(c0Var)));
    }

    @Override // j$.util.function.c0
    public final /* synthetic */ long applyAsLong(long j) {
        return this.a.applyAsLong(j);
    }

    @Override // j$.util.function.c0
    public final /* synthetic */ c0 b(c0 c0Var) {
        return c(this.a.compose(b0.a(c0Var)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongUnaryOperator longUnaryOperator = this.a;
        if (obj instanceof a0) {
            obj = ((a0) obj).a;
        }
        return longUnaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
