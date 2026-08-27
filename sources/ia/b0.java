package ia;

import h7.k6;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b0 implements ld.c {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ld.c b;

    public b0(ld.c cVar, d0 d0Var) {
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // ld.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, tc.c cVar) {
        a0 a0Var;
        int i10;
        k1.o oVar;
        int i11;
        int i12 = this.a;
        pc.i iVar = pc.i.a;
        ld.c cVar2 = this.b;
        switch (i12) {
            case 0:
                if (cVar instanceof a0) {
                    a0Var = (a0) cVar;
                    int i13 = a0Var.b;
                    if ((i13 & TLObject.FLAG_31) != 0) {
                        a0Var.b = i13 - TLObject.FLAG_31;
                        Object obj2 = a0Var.a;
                        sc.a aVar = sc.a.a;
                        i10 = a0Var.b;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            k6.b(obj2);
                            return iVar;
                        }
                        k6.b(obj2);
                        x xVar = d0.e;
                        o oVar2 = new o((String) ((n1.b) obj).a(y.a));
                        a0Var.b = 1;
                        return cVar2.c(oVar2, a0Var) == aVar ? aVar : iVar;
                    }
                }
                a0Var = new a0(this, cVar);
                Object obj22 = a0Var.a;
                sc.a aVar2 = sc.a.a;
                i10 = a0Var.b;
                if (i10 == 0) {
                }
            default:
                if (cVar instanceof k1.o) {
                    oVar = (k1.o) cVar;
                    int i14 = oVar.b;
                    if ((i14 & TLObject.FLAG_31) != 0) {
                        oVar.b = i14 - TLObject.FLAG_31;
                        Object obj3 = oVar.a;
                        sc.a aVar3 = sc.a.a;
                        i11 = oVar.b;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            k6.b(obj3);
                            return iVar;
                        }
                        k6.b(obj3);
                        k1.a0 a0Var2 = (k1.a0) obj;
                        if (a0Var2 instanceof k1.h) {
                            throw ((k1.h) a0Var2).a;
                        }
                        if (a0Var2 instanceof k1.g) {
                            throw ((k1.g) a0Var2).a;
                        }
                        if (a0Var2 instanceof k1.b) {
                            Object obj4 = ((k1.b) a0Var2).a;
                            oVar.b = 1;
                            return cVar2.c(obj4, oVar) == aVar3 ? aVar3 : iVar;
                        }
                        if (a0Var2 instanceof k1.b0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new a7.c();
                    }
                }
                oVar = new k1.o(this, cVar);
                Object obj32 = oVar.a;
                sc.a aVar32 = sc.a.a;
                i11 = oVar.b;
                if (i11 == 0) {
                }
        }
    }

    public b0(ld.c cVar) {
        this.b = cVar;
    }
}
