package j$.util.function;

import java.util.function.ObjIntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class g0 implements i0 {
    public final /* synthetic */ ObjIntConsumer a;

    private /* synthetic */ g0(ObjIntConsumer objIntConsumer) {
        this.a = objIntConsumer;
    }

    public static /* synthetic */ i0 a(ObjIntConsumer objIntConsumer) {
        if (objIntConsumer == null) {
            return null;
        }
        return objIntConsumer instanceof h0 ? ((h0) objIntConsumer).a : new g0(objIntConsumer);
    }

    @Override // j$.util.function.i0
    public final /* synthetic */ void accept(Object obj, int i) {
        this.a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjIntConsumer objIntConsumer = this.a;
        if (obj instanceof g0) {
            obj = ((g0) obj).a;
        }
        return objIntConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
