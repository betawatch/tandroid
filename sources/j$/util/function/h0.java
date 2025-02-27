package j$.util.function;

import java.util.function.ObjIntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class h0 implements ObjIntConsumer {
    public final /* synthetic */ i0 a;

    private /* synthetic */ h0(i0 i0Var) {
        this.a = i0Var;
    }

    public static /* synthetic */ ObjIntConsumer a(i0 i0Var) {
        if (i0Var == null) {
            return null;
        }
        return i0Var instanceof g0 ? ((g0) i0Var).a : new h0(i0Var);
    }

    @Override // java.util.function.ObjIntConsumer
    public final /* synthetic */ void accept(Object obj, int i) {
        this.a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        i0 i0Var = this.a;
        if (obj instanceof h0) {
            obj = ((h0) obj).a;
        }
        return i0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
