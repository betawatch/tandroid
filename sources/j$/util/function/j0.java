package j$.util.function;

import java.util.function.LongUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class j0 implements LongUnaryOperator {
    public final /* synthetic */ k0 a;

    private /* synthetic */ j0(k0 k0Var) {
        this.a = k0Var;
    }

    public static /* synthetic */ LongUnaryOperator a(k0 k0Var) {
        if (k0Var == null) {
            return null;
        }
        return k0Var instanceof i0 ? ((i0) k0Var).a : new j0(k0Var);
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return a(this.a.a(i0.c(longUnaryOperator)));
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ long applyAsLong(long j) {
        return this.a.applyAsLong(j);
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return a(this.a.b(i0.c(longUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        k0 k0Var = this.a;
        if (obj instanceof j0) {
            obj = ((j0) obj).a;
        }
        return k0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
