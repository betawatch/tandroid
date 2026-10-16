package k1;

import v7.i8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class d extends md.i implements td.l {
    public int a;

    @Override // md.a
    public final kd.c create(kd.c cVar) {
        return new d(1, cVar);
    }

    @Override // td.l
    public final Object invoke(Object obj) {
        d dVar = (d) create((kd.c) obj);
        id.i iVar = id.i.a;
        dVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        ld.a aVar = ld.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            i8.b(obj);
            this.a = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i8.b(obj);
        return id.i.a;
    }
}
