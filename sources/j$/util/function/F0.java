package j$.util.function;

import j$.util.function.Function;
import j$.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class F0 implements java.util.function.UnaryOperator {
    public final /* synthetic */ UnaryOperator a;

    private /* synthetic */ F0(UnaryOperator unaryOperator) {
        this.a = unaryOperator;
    }

    public static /* synthetic */ java.util.function.UnaryOperator a(UnaryOperator unaryOperator) {
        if (unaryOperator == null) {
            return null;
        }
        return unaryOperator instanceof UnaryOperator.VivifiedWrapper ? ((UnaryOperator.VivifiedWrapper) unaryOperator).a : new F0(unaryOperator);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return z.a(this.a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.a.apply(obj);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return z.a(this.a.compose(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UnaryOperator unaryOperator = this.a;
        if (obj instanceof F0) {
            obj = ((F0) obj).a;
        }
        return unaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
