package j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class l0 implements n0 {
    public final /* synthetic */ ObjDoubleConsumer a;

    private /* synthetic */ l0(ObjDoubleConsumer objDoubleConsumer) {
        this.a = objDoubleConsumer;
    }

    public static /* synthetic */ n0 a(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return objDoubleConsumer instanceof m0 ? ((m0) objDoubleConsumer).a : new l0(objDoubleConsumer);
    }

    @Override // j$.util.function.n0
    public final /* synthetic */ void accept(Object obj, double d) {
        this.a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjDoubleConsumer objDoubleConsumer = this.a;
        if (obj instanceof l0) {
            obj = ((l0) obj).a;
        }
        return objDoubleConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
