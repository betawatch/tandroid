package j$.util.function;

import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class H implements java.util.function.IntFunction {
    public final /* synthetic */ IntFunction a;

    private /* synthetic */ H(IntFunction intFunction) {
        this.a = intFunction;
    }

    public static /* synthetic */ java.util.function.IntFunction a(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return intFunction instanceof IntFunction.VivifiedWrapper ? ((IntFunction.VivifiedWrapper) intFunction).a : new H(intFunction);
    }

    @Override // java.util.function.IntFunction
    public final /* synthetic */ Object apply(int i) {
        return this.a.apply(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntFunction intFunction = this.a;
        if (obj instanceof H) {
            obj = ((H) obj).a;
        }
        return intFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
