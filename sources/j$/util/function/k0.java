package j$.util.function;

import java.util.function.ObjLongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class k0 implements ObjLongConsumer {
    public final /* synthetic */ l0 a;

    private /* synthetic */ k0(l0 l0Var) {
        this.a = l0Var;
    }

    public static /* synthetic */ ObjLongConsumer a(l0 l0Var) {
        if (l0Var == null) {
            return null;
        }
        return l0Var instanceof j0 ? ((j0) l0Var).a : new k0(l0Var);
    }

    @Override // java.util.function.ObjLongConsumer
    public final /* synthetic */ void accept(Object obj, long j) {
        this.a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        l0 l0Var = this.a;
        if (obj instanceof k0) {
            obj = ((k0) obj).a;
        }
        return l0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
