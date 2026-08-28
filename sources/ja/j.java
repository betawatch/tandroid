package ja;

import g7.y5;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends sc.i implements p {
    public /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ n1.d c;
    public final /* synthetic */ k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object obj, n1.d dVar, k kVar, qc.c cVar) {
        super(2, cVar);
        this.b = obj;
        this.c = dVar;
        this.d = kVar;
    }

    @Override // sc.a
    public final qc.c create(Object obj, qc.c cVar) {
        j jVar = new j(this.b, this.c, this.d, cVar);
        jVar.a = obj;
        return jVar;
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((n1.b) obj, (qc.c) obj2);
        oc.i iVar = oc.i.a;
        jVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        rc.a aVar = rc.a.a;
        y5.b(obj);
        n1.b bVar = (n1.b) this.a;
        n1.d key = this.c;
        Object obj2 = this.b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.i.e(key, "key");
            if (bVar.b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            bVar.a.remove(key);
        }
        k.a(this.d, bVar);
        return oc.i.a;
    }
}
