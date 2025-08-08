package j$.util.function;

import java.util.function.LongToDoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class d0 {
    public final /* synthetic */ LongToDoubleFunction a;

    private /* synthetic */ d0(LongToDoubleFunction longToDoubleFunction) {
        this.a = longToDoubleFunction;
    }

    public static /* synthetic */ d0 a(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        if (!(longToDoubleFunction instanceof e0)) {
            return new d0(longToDoubleFunction);
        }
        throw null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongToDoubleFunction longToDoubleFunction = this.a;
        if (obj instanceof d0) {
            obj = ((d0) obj).a;
        }
        return longToDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
