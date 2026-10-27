package db;

import a8.jd;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j extends nd.i implements p {
    public /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ n1.d c;
    public final /* synthetic */ k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object obj, n1.d dVar, k kVar, ld.c cVar) {
        super(2, cVar);
        this.b = obj;
        this.c = dVar;
        this.d = kVar;
    }

    @Override // nd.a
    public final ld.c create(Object obj, ld.c cVar) {
        j jVar = new j(this.b, this.c, this.d, cVar);
        jVar.a = obj;
        return jVar;
    }

    @Override // ud.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((n1.b) obj, (ld.c) obj2);
        jd.i iVar = jd.i.a;
        jVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.a;
        jd.b(obj);
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
        return jd.i.a;
    }
}
