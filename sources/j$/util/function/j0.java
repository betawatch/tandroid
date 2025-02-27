package j$.util.function;

import java.util.function.ObjLongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class j0 implements l0 {
    public final /* synthetic */ ObjLongConsumer a;

    private /* synthetic */ j0(ObjLongConsumer objLongConsumer) {
        this.a = objLongConsumer;
    }

    public static /* synthetic */ l0 a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return objLongConsumer instanceof k0 ? ((k0) objLongConsumer).a : new j0(objLongConsumer);
    }

    @Override // j$.util.function.l0
    public final /* synthetic */ void accept(Object obj, long j) {
        this.a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjLongConsumer objLongConsumer = this.a;
        if (obj instanceof j0) {
            obj = ((j0) obj).a;
        }
        return objLongConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
