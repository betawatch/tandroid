package j$.util.function;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements A {
    public final /* synthetic */ IntBinaryOperator a;

    private /* synthetic */ y(IntBinaryOperator intBinaryOperator) {
        this.a = intBinaryOperator;
    }

    public static /* synthetic */ A a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return intBinaryOperator instanceof z ? ((z) intBinaryOperator).a : new y(intBinaryOperator);
    }

    @Override // j$.util.function.A
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntBinaryOperator intBinaryOperator = this.a;
        if (obj instanceof y) {
            obj = ((y) obj).a;
        }
        return intBinaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
