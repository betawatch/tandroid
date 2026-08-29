package k1;

import i7.c7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends uc.i implements bd.l {
    public int a;

    @Override // uc.a
    public final sc.c create(sc.c cVar) {
        return new d(1, cVar);
    }

    @Override // bd.l
    public final Object invoke(Object obj) {
        d dVar = (d) create((sc.c) obj);
        qc.i iVar = qc.i.a;
        dVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        tc.a aVar = tc.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            c7.b(obj);
            this.a = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c7.b(obj);
        return qc.i.a;
    }
}
