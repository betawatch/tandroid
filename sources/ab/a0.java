package ab;

import org.telegram.tgnet.TLObject;
import v7.i8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class a0 implements ee.c {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ee.c b;

    public a0(ee.c cVar, c0 c0Var) {
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // ee.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, md.c cVar) {
        z zVar;
        int i10;
        k1.o oVar;
        int i11;
        int i12 = this.a;
        id.i iVar = id.i.a;
        ee.c cVar2 = this.b;
        switch (i12) {
            case 0:
                if (cVar instanceof z) {
                    zVar = (z) cVar;
                    int i13 = zVar.b;
                    if ((i13 & TLObject.FLAG_31) != 0) {
                        zVar.b = i13 - TLObject.FLAG_31;
                        Object obj2 = zVar.a;
                        ld.a aVar = ld.a.a;
                        i10 = zVar.b;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i8.b(obj2);
                            return iVar;
                        }
                        i8.b(obj2);
                        w wVar = c0.e;
                        n nVar = new n((String) ((n1.b) obj).a(x.a));
                        zVar.b = 1;
                        return cVar2.a(nVar, zVar) == aVar ? aVar : iVar;
                    }
                }
                zVar = new z(this, cVar);
                Object obj22 = zVar.a;
                ld.a aVar2 = ld.a.a;
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
                        ld.a aVar3 = ld.a.a;
                        i11 = oVar.b;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i8.b(obj3);
                            return iVar;
                        }
                        i8.b(obj3);
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
                            return cVar2.a(obj4, oVar) == aVar3 ? aVar3 : iVar;
                        }
                        if (a0Var instanceof k1.b0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new androidx.car.app.j();
                    }
                }
                oVar = new k1.o(this, cVar);
                Object obj32 = oVar.a;
                ld.a aVar32 = ld.a.a;
                i11 = oVar.b;
                if (i11 == 0) {
                }
        }
    }

    public a0(ee.c cVar) {
        this.b = cVar;
    }
}
