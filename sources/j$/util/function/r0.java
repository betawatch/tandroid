package j$.util.function;

import java.util.function.ObjLongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class r0 implements t0 {
    public final /* synthetic */ ObjLongConsumer a;

    private /* synthetic */ r0(ObjLongConsumer objLongConsumer) {
        this.a = objLongConsumer;
    }

    public static /* synthetic */ t0 a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return objLongConsumer instanceof s0 ? ((s0) objLongConsumer).a : new r0(objLongConsumer);
    }

    @Override // j$.util.function.t0
    public final /* synthetic */ void accept(Object obj, long j) {
        this.a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjLongConsumer objLongConsumer = this.a;
        if (obj instanceof r0) {
            obj = ((r0) obj).a;
        }
        return objLongConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
