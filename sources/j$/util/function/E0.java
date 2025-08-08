package j$.util.function;

/* loaded from: classes2.dex */
public final /* synthetic */ class E0 implements java.util.function.ToLongFunction {
    public final /* synthetic */ ToLongFunction a;

    private /* synthetic */ E0(ToLongFunction toLongFunction) {
        this.a = toLongFunction;
    }

    public static /* synthetic */ java.util.function.ToLongFunction a(ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return toLongFunction instanceof D0 ? ((D0) toLongFunction).a : new E0(toLongFunction);
    }

    @Override // java.util.function.ToLongFunction
    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.a.applyAsLong(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToLongFunction toLongFunction = this.a;
        if (obj instanceof E0) {
            obj = ((E0) obj).a;
        }
        return toLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
