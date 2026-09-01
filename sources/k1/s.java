package k1;

import k7.q7;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class s implements od.c {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ od.c b;

    public s(od.c cVar, la.z zVar) {
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    @Override // od.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, wc.c cVar) {
        r rVar;
        int i10;
        la.y yVar;
        int i11;
        int i12 = this.a;
        sc.i iVar = sc.i.a;
        od.c cVar2 = this.b;
        switch (i12) {
            case 0:
                if (cVar instanceof r) {
                    rVar = (r) cVar;
                    int i13 = rVar.b;
                    if ((i13 & TLObject.FLAG_31) != 0) {
                        rVar.b = i13 - TLObject.FLAG_31;
                        Object obj2 = rVar.a;
                        vc.a aVar = vc.a.a;
                        i10 = rVar.b;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            q7.b(obj2);
                            return iVar;
                        }
                        q7.b(obj2);
                        e0 e0Var = (e0) obj;
                        if (e0Var instanceof i) {
                            throw ((i) e0Var).a;
                        }
                        if (e0Var instanceof h) {
                            throw ((h) e0Var).a;
                        }
                        if (e0Var instanceof b) {
                            Object obj3 = ((b) e0Var).a;
                            rVar.b = 1;
                            return cVar2.c(obj3, rVar) == aVar ? aVar : iVar;
                        }
                        if (e0Var instanceof f0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new a7.b();
                    }
                }
                rVar = new r(this, cVar);
                Object obj22 = rVar.a;
                vc.a aVar2 = vc.a.a;
                i10 = rVar.b;
                if (i10 == 0) {
                }
            default:
                if (cVar instanceof la.y) {
                    yVar = (la.y) cVar;
                    int i14 = yVar.b;
                    if ((i14 & TLObject.FLAG_31) != 0) {
                        yVar.b = i14 - TLObject.FLAG_31;
                        Object obj4 = yVar.a;
                        vc.a aVar3 = vc.a.a;
                        i11 = yVar.b;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            q7.b(obj4);
                            return iVar;
                        }
                        q7.b(obj4);
                        la.v vVar = la.z.e;
                        la.m mVar = new la.m((String) ((n1.b) obj).a(la.w.a));
                        yVar.b = 1;
                        return cVar2.c(mVar, yVar) == aVar3 ? aVar3 : iVar;
                    }
                }
                yVar = new la.y(this, cVar);
                Object obj42 = yVar.a;
                vc.a aVar32 = vc.a.a;
                i11 = yVar.b;
                if (i11 == 0) {
                }
        }
    }

    public s(od.c cVar) {
        this.b = cVar;
    }
}
