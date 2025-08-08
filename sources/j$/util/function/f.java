package j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements h {
    public final /* synthetic */ DoubleBinaryOperator a;

    private /* synthetic */ f(DoubleBinaryOperator doubleBinaryOperator) {
        this.a = doubleBinaryOperator;
    }

    public static /* synthetic */ h a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return doubleBinaryOperator instanceof g ? ((g) doubleBinaryOperator).a : new f(doubleBinaryOperator);
    }

    @Override // j$.util.function.h
    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleBinaryOperator doubleBinaryOperator = this.a;
        if (obj instanceof f) {
            obj = ((f) obj).a;
        }
        return doubleBinaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
