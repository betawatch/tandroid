package ha;

import g7.y5;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 implements kd.c {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ kd.c b;

    public a0(kd.c cVar, c0 c0Var) {
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // kd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, sc.c cVar) {
        z zVar;
        int i9;
        k1.o oVar;
        int i10;
        int i11 = this.a;
        oc.i iVar = oc.i.a;
        kd.c cVar2 = this.b;
        switch (i11) {
            case 0:
                if (cVar instanceof z) {
                    zVar = (z) cVar;
                    int i12 = zVar.b;
                    if ((i12 & TLObject.FLAG_31) != 0) {
                        zVar.b = i12 - TLObject.FLAG_31;
                        Object obj2 = zVar.a;
                        rc.a aVar = rc.a.a;
                        i9 = zVar.b;
                        if (i9 == 0) {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y5.b(obj2);
                            return iVar;
                        }
                        y5.b(obj2);
                        w wVar = c0.e;
                        n nVar = new n((String) ((n1.b) obj).a(x.a));
                        zVar.b = 1;
                        return cVar2.c(nVar, zVar) == aVar ? aVar : iVar;
                    }
                }
                zVar = new z(this, cVar);
                Object obj22 = zVar.a;
                rc.a aVar2 = rc.a.a;
                i9 = zVar.b;
                if (i9 == 0) {
                }
            default:
                if (cVar instanceof k1.o) {
                    oVar = (k1.o) cVar;
                    int i13 = oVar.b;
                    if ((i13 & TLObject.FLAG_31) != 0) {
                        oVar.b = i13 - TLObject.FLAG_31;
                        Object obj3 = oVar.a;
                        rc.a aVar3 = rc.a.a;
                        i10 = oVar.b;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y5.b(obj3);
                            return iVar;
                        }
                        y5.b(obj3);
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
                            return cVar2.c(obj4, oVar) == aVar3 ? aVar3 : iVar;
                        }
                        if (a0Var instanceof k1.b0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new androidx.car.app.j();
                    }
                }
                oVar = new k1.o(this, cVar);
                Object obj32 = oVar.a;
                rc.a aVar32 = rc.a.a;
                i10 = oVar.b;
                if (i10 == 0) {
                }
        }
    }

    public a0(kd.c cVar) {
        this.b = cVar;
    }
}
