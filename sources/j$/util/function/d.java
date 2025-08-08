package j$.util.function;

import j$.util.function.BiFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements BinaryOperator {
    public final /* synthetic */ java.util.function.BinaryOperator a;

    private /* synthetic */ d(java.util.function.BinaryOperator binaryOperator) {
        this.a = binaryOperator;
    }

    public static /* synthetic */ BinaryOperator a(java.util.function.BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof e ? ((e) binaryOperator).a : new d(binaryOperator);
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.VivifiedWrapper.convert(this.a.andThen(z.a(function)));
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.function.BinaryOperator binaryOperator = this.a;
        if (obj instanceof d) {
            obj = ((d) obj).a;
        }
        return binaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
