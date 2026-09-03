package k1;

import k7.q7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
