package ka;

import c8.z;
import gd.k;
import kd.j;
import q1.e;
import rd.p;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c extends j implements p {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;
    public final /* synthetic */ Long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Long l10, id.c cVar) {
        super(2, cVar);
        this.b = eVar;
        this.c = l10;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        c cVar2 = new c(this.b, this.c, cVar);
        cVar2.a = obj;
        return cVar2;
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((q1.b) obj, (id.c) obj2);
        k kVar = k.a;
        cVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        z.b(obj);
        ((q1.b) this.a).d(this.b, this.c);
        return k.a;
    }
}
