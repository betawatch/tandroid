package j$.util.function;

import java.util.function.ObjLongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class s0 implements ObjLongConsumer {
    public final /* synthetic */ t0 a;

    private /* synthetic */ s0(t0 t0Var) {
        this.a = t0Var;
    }

    public static /* synthetic */ ObjLongConsumer a(t0 t0Var) {
        if (t0Var == null) {
            return null;
        }
        return t0Var instanceof r0 ? ((r0) t0Var).a : new s0(t0Var);
    }

    @Override // java.util.function.ObjLongConsumer
    public final /* synthetic */ void accept(Object obj, long j) {
        this.a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        t0 t0Var = this.a;
        if (obj instanceof s0) {
            obj = ((s0) obj).a;
        }
        return t0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
