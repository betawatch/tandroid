package m1;

import androidx.datastore.core.NativeSharedCounter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class p0 extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(t0 t0Var, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.b = t0Var;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                return new p0(this.b, cVar, 0);
            default:
                return new p0(this.b, cVar, 1);
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.a) {
        }
        return ((p0) create(zVar, cVar)).invokeSuspend(gd.k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.a;
        NativeSharedCounter nativeSharedCounter = z0.b;
        t0 t0Var = this.b;
        switch (i7) {
            case 0:
                jd.a aVar = jd.a.a;
                af.b.c(obj);
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((z0) t0Var.i.getValue()).a));
            default:
                jd.a aVar2 = jd.a.a;
                af.b.c(obj);
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((z0) t0Var.i.getValue()).a));
        }
    }
}
