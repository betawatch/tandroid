package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class v {
    public final /* synthetic */ DoubleUnaryOperator a;

    private /* synthetic */ v(DoubleUnaryOperator doubleUnaryOperator) {
        this.a = doubleUnaryOperator;
    }

    public static /* synthetic */ v a(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return new v(doubleUnaryOperator);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleUnaryOperator doubleUnaryOperator = this.a;
        if (obj instanceof v) {
            obj = ((v) obj).a;
        }
        return doubleUnaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
