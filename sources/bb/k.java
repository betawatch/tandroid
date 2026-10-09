package bb;

import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class k extends ld.j implements p {
    public /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ n1.d c;
    public final /* synthetic */ l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Object obj, n1.d dVar, l lVar, jd.c cVar) {
        super(2, cVar);
        this.b = obj;
        this.c = dVar;
        this.d = lVar;
    }

    @Override // ld.a
    public final jd.c create(Object obj, jd.c cVar) {
        k kVar = new k(this.b, this.c, this.d, cVar);
        kVar.a = obj;
        return kVar;
    }

    @Override // sd.p
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) create((n1.b) obj, (jd.c) obj2);
        hd.i iVar = hd.i.a;
        kVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        kd.a aVar = kd.a.a;
        a8.b(obj);
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
        return hd.i.a;
    }
}
