package j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class d0 implements f0 {
    public final /* synthetic */ ObjDoubleConsumer a;

    private /* synthetic */ d0(ObjDoubleConsumer objDoubleConsumer) {
        this.a = objDoubleConsumer;
    }

    public static /* synthetic */ f0 a(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return objDoubleConsumer instanceof e0 ? ((e0) objDoubleConsumer).a : new d0(objDoubleConsumer);
    }

    @Override // j$.util.function.f0
    public final /* synthetic */ void accept(Object obj, double d) {
        this.a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjDoubleConsumer objDoubleConsumer = this.a;
        if (obj instanceof d0) {
            obj = ((d0) obj).a;
        }
        return objDoubleConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
