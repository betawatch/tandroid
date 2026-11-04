package l1;

import b8.ib;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d1 extends hd.j implements od.p {
    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        return new d1(2, cVar);
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        d1 d1Var = (d1) create((zd.c) obj, (fd.c) obj2);
        dd.k kVar = dd.k.a;
        d1Var.invokeSuspend(kVar);
        return kVar;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        ib.b(obj);
        return dd.k.a;
    }
}
