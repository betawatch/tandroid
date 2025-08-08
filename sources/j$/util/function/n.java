package j$.util.function;

import java.util.function.DoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements DoubleFunction {
    public final /* synthetic */ o a;

    private /* synthetic */ n(o oVar) {
        this.a = oVar;
    }

    public static /* synthetic */ DoubleFunction a(o oVar) {
        if (oVar == null) {
            return null;
        }
        return oVar instanceof m ? ((m) oVar).a : new n(oVar);
    }

    @Override // java.util.function.DoubleFunction
    public final /* synthetic */ Object apply(double d) {
        return this.a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        o oVar = this.a;
        if (obj instanceof n) {
            obj = ((n) obj).a;
        }
        return oVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
