package bb;

import rd.p;
import v7.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k extends kd.j implements p {
    public /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ n1.d c;
    public final /* synthetic */ l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Object obj, n1.d dVar, l lVar, id.c cVar) {
        super(2, cVar);
        this.b = obj;
        this.c = dVar;
        this.d = lVar;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        k kVar = new k(this.b, this.c, this.d, cVar);
        kVar.a = obj;
        return kVar;
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) create((n1.b) obj, (id.c) obj2);
        gd.i iVar = gd.i.a;
        kVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        u7.b(obj);
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
        l.a(this.d, bVar);
        return gd.i.a;
    }
}
