package k1;

import k7.p7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q extends wc.i implements dd.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, uc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // wc.a
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.a) {
            case 0:
                q qVar = new q((e0) this.c, cVar, 0);
                qVar.b = obj;
                return qVar;
            default:
                q qVar2 = new q((String) this.c, cVar, 1);
                qVar2.b = obj;
                return qVar2;
        }
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((q) create((e0) obj, (uc.c) obj2)).invokeSuspend(sc.i.a);
            default:
                q qVar = (q) create((n1.b) obj, (uc.c) obj2);
                sc.i iVar = sc.i.a;
                qVar.invokeSuspend(iVar);
                return iVar;
        }
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                vc.a aVar = vc.a.a;
                p7.b(obj);
                e0 e0Var = (e0) obj2;
                return Boolean.valueOf(((e0Var instanceof b) || (e0Var instanceof h) || ((e0) this.b) != e0Var) ? false : true);
            default:
                vc.a aVar2 = vc.a.a;
                p7.b(obj);
                n1.b bVar = (n1.b) this.b;
                bVar.getClass();
                n1.d key = la.w.a;
                kotlin.jvm.internal.j.e(key, "key");
                bVar.b(key, (String) obj2);
                return sc.i.a;
        }
    }
}
