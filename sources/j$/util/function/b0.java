package j$.util.function;

import java.util.function.LongUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class b0 implements LongUnaryOperator {
    public final /* synthetic */ c0 a;

    private /* synthetic */ b0(c0 c0Var) {
        this.a = c0Var;
    }

    public static /* synthetic */ LongUnaryOperator a(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        return c0Var instanceof a0 ? ((a0) c0Var).a : new b0(c0Var);
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return a(this.a.a(a0.c(longUnaryOperator)));
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ long applyAsLong(long j) {
        return this.a.applyAsLong(j);
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return a(this.a.b(a0.c(longUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c0 c0Var = this.a;
        if (obj instanceof b0) {
            obj = ((b0) obj).a;
        }
        return c0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
