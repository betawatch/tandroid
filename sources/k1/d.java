package k1;

import v7.u7;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class d extends kd.j implements rd.l {
    public int a;

    @Override // kd.a
    public final id.c create(id.c cVar) {
        return new d(1, cVar);
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        d dVar = (d) create((id.c) obj);
        gd.i iVar = gd.i.a;
        dVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            u7.b(obj);
            this.a = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u7.b(obj);
        return gd.i.a;
    }
}
