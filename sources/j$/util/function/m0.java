package j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class m0 implements ObjDoubleConsumer {
    public final /* synthetic */ n0 a;

    private /* synthetic */ m0(n0 n0Var) {
        this.a = n0Var;
    }

    public static /* synthetic */ ObjDoubleConsumer a(n0 n0Var) {
        if (n0Var == null) {
            return null;
        }
        return n0Var instanceof l0 ? ((l0) n0Var).a : new m0(n0Var);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final /* synthetic */ void accept(Object obj, double d) {
        this.a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        n0 n0Var = this.a;
        if (obj instanceof m0) {
            obj = ((m0) obj).a;
        }
        return n0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
