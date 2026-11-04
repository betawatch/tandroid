package ja;

import b8.ib;
import dd.k;
import hd.j;
import od.p;
import p1.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends j implements p {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;
    public final /* synthetic */ Long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Long l10, fd.c cVar) {
        super(2, cVar);
        this.b = eVar;
        this.c = l10;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        c cVar2 = new c(this.b, this.c, cVar);
        cVar2.a = obj;
        return cVar2;
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((p1.b) obj, (fd.c) obj2);
        k kVar = k.a;
        cVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        ib.b(obj);
        ((p1.b) this.a).d(this.b, this.c);
        return k.a;
    }
}
