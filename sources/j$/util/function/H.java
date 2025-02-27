package j$.util.function;

import java.util.function.IntToDoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class H {
    public final /* synthetic */ IntToDoubleFunction a;

    private /* synthetic */ H(IntToDoubleFunction intToDoubleFunction) {
        this.a = intToDoubleFunction;
    }

    public static /* synthetic */ H a(IntToDoubleFunction intToDoubleFunction) {
        if (intToDoubleFunction == null) {
            return null;
        }
        return new H(intToDoubleFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntToDoubleFunction intToDoubleFunction = this.a;
        if (obj instanceof H) {
            obj = ((H) obj).a;
        }
        return intToDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
