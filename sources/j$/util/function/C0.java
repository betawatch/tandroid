package j$.util.function;

/* loaded from: classes2.dex */
public final /* synthetic */ class C0 implements java.util.function.ToIntFunction {
    public final /* synthetic */ ToIntFunction a;

    private /* synthetic */ C0(ToIntFunction toIntFunction) {
        this.a = toIntFunction;
    }

    public static /* synthetic */ java.util.function.ToIntFunction a(ToIntFunction toIntFunction) {
        if (toIntFunction == null) {
            return null;
        }
        return toIntFunction instanceof B0 ? ((B0) toIntFunction).a : new C0(toIntFunction);
    }

    @Override // java.util.function.ToIntFunction
    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.a.applyAsInt(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToIntFunction toIntFunction = this.a;
        if (obj instanceof C0) {
            obj = ((C0) obj).a;
        }
        return toIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
