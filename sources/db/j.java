package db;

import ld.p;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j extends ed.j implements p {
    public /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ n1.d c;
    public final /* synthetic */ k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object obj, n1.d dVar, k kVar, cd.c cVar) {
        super(2, cVar);
        this.b = obj;
        this.c = dVar;
        this.d = kVar;
    }

    @Override // ed.a
    public final cd.c create(Object obj, cd.c cVar) {
        j jVar = new j(this.b, this.c, this.d, cVar);
        jVar.a = obj;
        return jVar;
    }

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((n1.b) obj, (cd.c) obj2);
        ad.j jVar2 = ad.j.a;
        jVar.invokeSuspend(jVar2);
        return jVar2;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        dd.a aVar = dd.a.a;
        l9.b.b(obj);
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
        return ad.j.a;
    }
}
