package j$.util.function;

import java.util.function.LongUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements k0 {
    public final /* synthetic */ LongUnaryOperator a;

    private /* synthetic */ i0(LongUnaryOperator longUnaryOperator) {
        this.a = longUnaryOperator;
    }

    public static /* synthetic */ k0 c(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return longUnaryOperator instanceof j0 ? ((j0) longUnaryOperator).a : new i0(longUnaryOperator);
    }

    @Override // j$.util.function.k0
    public final /* synthetic */ k0 a(k0 k0Var) {
        return c(this.a.andThen(j0.a(k0Var)));
    }

    @Override // j$.util.function.k0
    public final /* synthetic */ long applyAsLong(long j) {
        return this.a.applyAsLong(j);
    }

    @Override // j$.util.function.k0
    public final /* synthetic */ k0 b(k0 k0Var) {
        return c(this.a.compose(j0.a(k0Var)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongUnaryOperator longUnaryOperator = this.a;
        if (obj instanceof i0) {
            obj = ((i0) obj).a;
        }
        return longUnaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
