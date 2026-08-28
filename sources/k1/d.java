package k1;

import g7.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends sc.i implements zc.l {
    public int a;

    @Override // sc.a
    public final qc.c create(qc.c cVar) {
        return new d(1, cVar);
    }

    @Override // zc.l
    public final Object invoke(Object obj) {
        d dVar = (d) create((qc.c) obj);
        oc.i iVar = oc.i.a;
        dVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        rc.a aVar = rc.a.a;
        int i9 = this.a;
        if (i9 == 0) {
            y5.b(obj);
            this.a = 1;
            throw null;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y5.b(obj);
        return oc.i.a;
    }
}
