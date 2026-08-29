package la;

import bd.p;
import i7.c7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends uc.i implements p {
    public /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ n1.d c;
    public final /* synthetic */ k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object obj, n1.d dVar, k kVar, sc.c cVar) {
        super(2, cVar);
        this.b = obj;
        this.c = dVar;
        this.d = kVar;
    }

    @Override // uc.a
    public final sc.c create(Object obj, sc.c cVar) {
        j jVar = new j(this.b, this.c, this.d, cVar);
        jVar.a = obj;
        return jVar;
    }

    @Override // bd.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((n1.b) obj, (sc.c) obj2);
        qc.i iVar = qc.i.a;
        jVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        c7.b(obj);
        n1.b bVar = (n1.b) this.a;
        n1.d key = this.c;
        Object obj2 = this.b;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            bVar.b(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.j.e(key, "key");
            if (bVar.b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            bVar.a.remove(key);
        }
        k.a(this.d, bVar);
        return qc.i.a;
    }
}
