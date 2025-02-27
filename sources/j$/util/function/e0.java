package j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements ObjDoubleConsumer {
    public final /* synthetic */ f0 a;

    private /* synthetic */ e0(f0 f0Var) {
        this.a = f0Var;
    }

    public static /* synthetic */ ObjDoubleConsumer a(f0 f0Var) {
        if (f0Var == null) {
            return null;
        }
        return f0Var instanceof d0 ? ((d0) f0Var).a : new e0(f0Var);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final /* synthetic */ void accept(Object obj, double d) {
        this.a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        f0 f0Var = this.a;
        if (obj instanceof e0) {
            obj = ((e0) obj).a;
        }
        return f0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
