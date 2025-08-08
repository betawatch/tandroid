package j$.util.function;

/* loaded from: classes2.dex */
public final /* synthetic */ class D0 implements ToLongFunction {
    public final /* synthetic */ java.util.function.ToLongFunction a;

    private /* synthetic */ D0(java.util.function.ToLongFunction toLongFunction) {
        this.a = toLongFunction;
    }

    public static /* synthetic */ ToLongFunction a(java.util.function.ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return toLongFunction instanceof E0 ? ((E0) toLongFunction).a : new D0(toLongFunction);
    }

    @Override // j$.util.function.ToLongFunction
    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.a.applyAsLong(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.function.ToLongFunction toLongFunction = this.a;
        if (obj instanceof D0) {
            obj = ((D0) obj).a;
        }
        return toLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
