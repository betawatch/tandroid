package j$.util.function;

/* loaded from: classes2.dex */
public final /* synthetic */ class B0 implements ToIntFunction {
    public final /* synthetic */ java.util.function.ToIntFunction a;

    private /* synthetic */ B0(java.util.function.ToIntFunction toIntFunction) {
        this.a = toIntFunction;
    }

    public static /* synthetic */ ToIntFunction a(java.util.function.ToIntFunction toIntFunction) {
        if (toIntFunction == null) {
            return null;
        }
        return toIntFunction instanceof C0 ? ((C0) toIntFunction).a : new B0(toIntFunction);
    }

    @Override // j$.util.function.ToIntFunction
    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.a.applyAsInt(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.function.ToIntFunction toIntFunction = this.a;
        if (obj instanceof B0) {
            obj = ((B0) obj).a;
        }
        return toIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
