package j$.util.function;

import java.util.function.DoubleToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements u {
    public final /* synthetic */ DoubleToLongFunction a;

    private /* synthetic */ s(DoubleToLongFunction doubleToLongFunction) {
        this.a = doubleToLongFunction;
    }

    public static /* synthetic */ u a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return doubleToLongFunction instanceof t ? ((t) doubleToLongFunction).a : new s(doubleToLongFunction);
    }

    @Override // j$.util.function.u
    public final /* synthetic */ long applyAsLong(double d) {
        return this.a.applyAsLong(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleToLongFunction doubleToLongFunction = this.a;
        if (obj instanceof s) {
            obj = ((s) obj).a;
        }
        return doubleToLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
