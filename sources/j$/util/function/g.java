package j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements DoubleBinaryOperator {
    public final /* synthetic */ h a;

    private /* synthetic */ g(h hVar) {
        this.a = hVar;
    }

    public static /* synthetic */ DoubleBinaryOperator a(h hVar) {
        if (hVar == null) {
            return null;
        }
        return hVar instanceof f ? ((f) hVar).a : new g(hVar);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        h hVar = this.a;
        if (obj instanceof g) {
            obj = ((g) obj).a;
        }
        return hVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
