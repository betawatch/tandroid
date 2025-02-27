package j$.util.function;

import java.util.function.IntToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class I implements K {
    public final /* synthetic */ IntToLongFunction a;

    private /* synthetic */ I(IntToLongFunction intToLongFunction) {
        this.a = intToLongFunction;
    }

    public static /* synthetic */ K a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return intToLongFunction instanceof J ? ((J) intToLongFunction).a : new I(intToLongFunction);
    }

    @Override // j$.util.function.K
    public final /* synthetic */ long applyAsLong(int i) {
        return this.a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntToLongFunction intToLongFunction = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return intToLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
