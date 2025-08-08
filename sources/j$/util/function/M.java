package j$.util.function;

import java.util.function.IntToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class M implements O {
    public final /* synthetic */ IntToLongFunction a;

    private /* synthetic */ M(IntToLongFunction intToLongFunction) {
        this.a = intToLongFunction;
    }

    public static /* synthetic */ O a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return intToLongFunction instanceof N ? ((N) intToLongFunction).a : new M(intToLongFunction);
    }

    @Override // j$.util.function.O
    public final /* synthetic */ long applyAsLong(int i) {
        return this.a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntToLongFunction intToLongFunction = this.a;
        if (obj instanceof M) {
            obj = ((M) obj).a;
        }
        return intToLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
