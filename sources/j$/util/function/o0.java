package j$.util.function;

import java.util.function.ObjIntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0 implements q0 {
    public final /* synthetic */ ObjIntConsumer a;

    private /* synthetic */ o0(ObjIntConsumer objIntConsumer) {
        this.a = objIntConsumer;
    }

    public static /* synthetic */ q0 a(ObjIntConsumer objIntConsumer) {
        if (objIntConsumer == null) {
            return null;
        }
        return objIntConsumer instanceof p0 ? ((p0) objIntConsumer).a : new o0(objIntConsumer);
    }

    @Override // j$.util.function.q0
    public final /* synthetic */ void accept(Object obj, int i) {
        this.a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjIntConsumer objIntConsumer = this.a;
        if (obj instanceof o0) {
            obj = ((o0) obj).a;
        }
        return objIntConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
