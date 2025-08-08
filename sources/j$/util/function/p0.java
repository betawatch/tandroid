package j$.util.function;

import java.util.function.ObjIntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class p0 implements ObjIntConsumer {
    public final /* synthetic */ q0 a;

    private /* synthetic */ p0(q0 q0Var) {
        this.a = q0Var;
    }

    public static /* synthetic */ ObjIntConsumer a(q0 q0Var) {
        if (q0Var == null) {
            return null;
        }
        return q0Var instanceof o0 ? ((o0) q0Var).a : new p0(q0Var);
    }

    @Override // java.util.function.ObjIntConsumer
    public final /* synthetic */ void accept(Object obj, int i) {
        this.a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        q0 q0Var = this.a;
        if (obj instanceof p0) {
            obj = ((p0) obj).a;
        }
        return q0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
