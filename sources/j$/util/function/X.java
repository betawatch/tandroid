package j$.util.function;

import java.util.function.LongToDoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class X {
    public final /* synthetic */ LongToDoubleFunction a;

    private /* synthetic */ X(LongToDoubleFunction longToDoubleFunction) {
        this.a = longToDoubleFunction;
    }

    public static /* synthetic */ X a(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return new X(longToDoubleFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongToDoubleFunction longToDoubleFunction = this.a;
        if (obj instanceof X) {
            obj = ((X) obj).a;
        }
        return longToDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
