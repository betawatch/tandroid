package bb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 implements wd.c {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wd.c b;

    public a0(wd.c cVar, c0 c0Var) {
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // wd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ed.c cVar) {
        z zVar;
        int i10;
        k1.o oVar;
        int i11;
        int i12 = this.a;
        ad.j jVar = ad.j.a;
        wd.c cVar2 = this.b;
        switch (i12) {
            case 0:
                if (cVar instanceof z) {
                    zVar = (z) cVar;
                    int i13 = zVar.b;
                    if ((i13 & TLObject.FLAG_31) != 0) {
                        zVar.b = i13 - TLObject.FLAG_31;
                        Object obj2 = zVar.a;
                        dd.a aVar = dd.a.a;
                        i10 = zVar.b;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l9.b.b(obj2);
                            return jVar;
                        }
                        l9.b.b(obj2);
                        w wVar = c0.e;
                        n nVar = new n((String) ((n1.b) obj).a(x.a));
                        zVar.b = 1;
                        return cVar2.b(nVar, zVar) == aVar ? aVar : jVar;
                    }
                }
                zVar = new z(this, cVar);
                Object obj22 = zVar.a;
                dd.a aVar2 = dd.a.a;
                i10 = zVar.b;
                if (i10 == 0) {
                }
            default:
                if (cVar instanceof k1.o) {
                    oVar = (k1.o) cVar;
                    int i14 = oVar.b;
                    if ((i14 & TLObject.FLAG_31) != 0) {
                        oVar.b = i14 - TLObject.FLAG_31;
                        Object obj3 = oVar.a;
                        dd.a aVar3 = dd.a.a;
                        i11 = oVar.b;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l9.b.b(obj3);
                            return jVar;
                        }
                        l9.b.b(obj3);
                        k1.a0 a0Var = (k1.a0) obj;
                        if (a0Var instanceof k1.h) {
                            throw ((k1.h) a0Var).a;
                        }
                        if (a0Var instanceof k1.g) {
                            throw ((k1.g) a0Var).a;
                        }
                        if (a0Var instanceof k1.b) {
                            Object obj4 = ((k1.b) a0Var).a;
                            oVar.b = 1;
                            return cVar2.b(obj4, oVar) == aVar3 ? aVar3 : jVar;
                        }
                        if (a0Var instanceof k1.b0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new ad.d();
                    }
                }
                oVar = new k1.o(this, cVar);
                Object obj32 = oVar.a;
                dd.a aVar32 = dd.a.a;
                i11 = oVar.b;
                if (i11 == 0) {
                }
        }
    }

    public a0(wd.c cVar) {
        this.b = cVar;
    }
}
