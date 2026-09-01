package k1;

import k7.q7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e extends wc.i implements dd.l {
    public int a;

    @Override // wc.a
    public final uc.c create(uc.c cVar) {
        return new e(1, cVar);
    }

    @Override // dd.l
    public final Object invoke(Object obj) {
        e eVar = (e) create((uc.c) obj);
        sc.i iVar = sc.i.a;
        eVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        vc.a aVar = vc.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            q7.b(obj);
            this.a = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q7.b(obj);
        return sc.i.a;
    }
}
