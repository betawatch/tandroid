package j$.util.function;

import j$.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements java.util.function.BinaryOperator {
    public final /* synthetic */ BinaryOperator a;

    private /* synthetic */ e(BinaryOperator binaryOperator) {
        this.a = binaryOperator;
    }

    public static /* synthetic */ java.util.function.BinaryOperator a(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof d ? ((d) binaryOperator).a : new e(binaryOperator);
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return b.a(this.a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BinaryOperator binaryOperator = this.a;
        if (obj instanceof e) {
            obj = ((e) obj).a;
        }
        return binaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
