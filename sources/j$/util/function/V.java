package j$.util.function;

/* loaded from: classes2.dex */
public final /* synthetic */ class V implements java.util.function.LongFunction {
    public final /* synthetic */ LongFunction a;

    private /* synthetic */ V(LongFunction longFunction) {
        this.a = longFunction;
    }

    public static /* synthetic */ java.util.function.LongFunction a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return longFunction instanceof U ? ((U) longFunction).a : new V(longFunction);
    }

    @Override // java.util.function.LongFunction
    public final /* synthetic */ Object apply(long j) {
        return this.a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongFunction longFunction = this.a;
        if (obj instanceof V) {
            obj = ((V) obj).a;
        }
        return longFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
