package j$.util.function;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class A implements C {
    public final /* synthetic */ IntBinaryOperator a;

    private /* synthetic */ A(IntBinaryOperator intBinaryOperator) {
        this.a = intBinaryOperator;
    }

    public static /* synthetic */ C a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return intBinaryOperator instanceof B ? ((B) intBinaryOperator).a : new A(intBinaryOperator);
    }

    @Override // j$.util.function.C
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntBinaryOperator intBinaryOperator = this.a;
        if (obj instanceof A) {
            obj = ((A) obj).a;
        }
        return intBinaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
