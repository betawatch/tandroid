package j$.util.function;

import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class P {
    public final /* synthetic */ IntUnaryOperator a;

    private /* synthetic */ P(IntUnaryOperator intUnaryOperator) {
        this.a = intUnaryOperator;
    }

    public static /* synthetic */ P a(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        if (!(intUnaryOperator instanceof Q)) {
            return new P(intUnaryOperator);
        }
        throw null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntUnaryOperator intUnaryOperator = this.a;
        if (obj instanceof P) {
            obj = ((P) obj).a;
        }
        return intUnaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
