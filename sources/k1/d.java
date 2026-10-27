package k1;

import a8.jd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d extends nd.i implements ud.l {
    public int a;

    @Override // nd.a
    public final ld.c create(ld.c cVar) {
        return new d(1, cVar);
    }

    @Override // ud.l
    public final Object invoke(Object obj) {
        d dVar = (d) create((ld.c) obj);
        jd.i iVar = jd.i.a;
        dVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            jd.b(obj);
            this.a = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jd.b(obj);
        return jd.i.a;
    }
}
