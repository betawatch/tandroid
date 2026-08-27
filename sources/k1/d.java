package k1;

import h7.k6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends tc.i implements ad.l {
    public int a;

    @Override // tc.a
    public final rc.c create(rc.c cVar) {
        return new d(1, cVar);
    }

    @Override // ad.l
    public final Object invoke(Object obj) {
        d dVar = (d) create((rc.c) obj);
        pc.i iVar = pc.i.a;
        dVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        sc.a aVar = sc.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            k6.b(obj);
            this.a = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k6.b(obj);
        return pc.i.a;
    }
}
