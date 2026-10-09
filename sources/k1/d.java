package k1;

import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d extends ld.j implements sd.l {
    public int a;

    @Override // ld.a
    public final jd.c create(jd.c cVar) {
        return new d(1, cVar);
    }

    @Override // sd.l
    public final Object invoke(Object obj) {
        d dVar = (d) create((jd.c) obj);
        hd.i iVar = hd.i.a;
        dVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        kd.a aVar = kd.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            a8.b(obj);
            this.a = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a8.b(obj);
        return hd.i.a;
    }
}
