package j$.util.function;

import java.util.function.DoubleToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements DoubleToLongFunction {
    public final /* synthetic */ u a;

    private /* synthetic */ t(u uVar) {
        this.a = uVar;
    }

    public static /* synthetic */ DoubleToLongFunction a(u uVar) {
        if (uVar == null) {
            return null;
        }
        return uVar instanceof s ? ((s) uVar).a : new t(uVar);
    }

    @Override // java.util.function.DoubleToLongFunction
    public final /* synthetic */ long applyAsLong(double d) {
        return this.a.applyAsLong(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        u uVar = this.a;
        if (obj instanceof t) {
            obj = ((t) obj).a;
        }
        return uVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
