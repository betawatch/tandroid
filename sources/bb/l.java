package bb;

import rd.p;
import v7.t7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class l extends kd.j implements p {
    public /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ n1.d c;
    public final /* synthetic */ m d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object obj, n1.d dVar, m mVar, id.c cVar) {
        super(2, cVar);
        this.b = obj;
        this.c = dVar;
        this.d = mVar;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        l lVar = new l(this.b, this.c, this.d, cVar);
        lVar.a = obj;
        return lVar;
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((n1.b) obj, (id.c) obj2);
        gd.i iVar = gd.i.a;
        lVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        t7.b(obj);
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
        m.a(this.d, bVar);
        return gd.i.a;
    }
}
