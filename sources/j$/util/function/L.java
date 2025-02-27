package j$.util.function;

import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class L {
    public final /* synthetic */ IntUnaryOperator a;

    private /* synthetic */ L(IntUnaryOperator intUnaryOperator) {
        this.a = intUnaryOperator;
    }

    public static /* synthetic */ L a(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return new L(intUnaryOperator);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntUnaryOperator intUnaryOperator = this.a;
        if (obj instanceof L) {
            obj = ((L) obj).a;
        }
        return intUnaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
