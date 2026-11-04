package db;

import b8.ib;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z0 implements zd.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // zd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, fd.c cVar) {
        l1.o oVar;
        int i3;
        Object e10;
        switch (this.a) {
            case 0:
                j0 j0Var = (j0) obj;
                e1 e1Var = (e1) this.b;
                kotlin.jvm.internal.j.e(j0Var, "<set-?>");
                e1Var.h = j0Var;
                if (e1Var.j) {
                    e1Var.j = false;
                    e1Var.c();
                }
                Object a10 = e1.a(e1Var, j0Var.a.a, b1.a, cVar);
                return a10 == gd.a.a ? a10 : dd.k.a;
            case 1:
                if (cVar instanceof l1.o) {
                    oVar = (l1.o) cVar;
                    int i10 = oVar.b;
                    if ((i10 & TLObject.FLAG_31) != 0) {
                        oVar.b = i10 - TLObject.FLAG_31;
                        Object obj2 = oVar.a;
                        gd.a aVar = gd.a.a;
                        i3 = oVar.b;
                        if (i3 != 0) {
                            ib.b(obj2);
                            zd.c cVar2 = (zd.c) this.b;
                            l1.f1 f1Var = (l1.f1) obj;
                            if (f1Var instanceof l1.x0) {
                                throw ((l1.x0) f1Var).b;
                            }
                            if (!(f1Var instanceof l1.c)) {
                                if (f1Var instanceof l1.l0 ? true : f1Var instanceof l1.g1) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new androidx.car.app.j();
                            }
                            Object obj3 = ((l1.c) f1Var).b;
                            oVar.b = 1;
                            if (cVar2.b(obj3, oVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ib.b(obj2);
                        }
                        return dd.k.a;
                    }
                }
                oVar = new l1.o(this, cVar);
                Object obj22 = oVar.a;
                gd.a aVar2 = gd.a.a;
                i3 = oVar.b;
                if (i3 != 0) {
                }
                return dd.k.a;
            default:
                l1.b0 b0Var = (l1.b0) this.b;
                return ((b0Var.h.j2() instanceof l1.l0) || (e10 = l1.b0.e(b0Var, true, cVar)) != gd.a.a) ? dd.k.a : e10;
        }
    }
}
