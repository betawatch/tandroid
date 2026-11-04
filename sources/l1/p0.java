package l1;

import androidx.datastore.core.NativeSharedCounter;
import b8.ib;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p0 extends hd.j implements od.p {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(t0 t0Var, fd.c cVar, int i3) {
        super(2, cVar);
        this.a = i3;
        this.b = t0Var;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.a) {
            case 0:
                return new p0(this.b, cVar, 0);
            default:
                return new p0(this.b, cVar, 1);
        }
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        wd.z zVar = (wd.z) obj;
        fd.c cVar = (fd.c) obj2;
        switch (this.a) {
        }
        return ((p0) create(zVar, cVar)).invokeSuspend(dd.k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        int i3 = this.a;
        NativeSharedCounter nativeSharedCounter = a1.b;
        t0 t0Var = this.b;
        switch (i3) {
            case 0:
                gd.a aVar = gd.a.a;
                ib.b(obj);
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((a1) t0Var.i.getValue()).a));
            default:
                gd.a aVar2 = gd.a.a;
                ib.b(obj);
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((a1) t0Var.i.getValue()).a));
        }
    }
}
