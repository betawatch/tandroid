package bb;

import a8.jd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a0 implements fe.c {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fe.c b;

    public a0(fe.c cVar, c0 c0Var) {
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // fe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, nd.c cVar) {
        z zVar;
        int i10;
        k1.o oVar;
        int i11;
        int i12 = this.a;
        jd.i iVar = jd.i.a;
        fe.c cVar2 = this.b;
        switch (i12) {
            case 0:
                if (cVar instanceof z) {
                    zVar = (z) cVar;
                    int i13 = zVar.b;
                    if ((i13 & TLObject.FLAG_31) != 0) {
                        zVar.b = i13 - TLObject.FLAG_31;
                        Object obj2 = zVar.a;
                        md.a aVar = md.a.a;
                        i10 = zVar.b;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            jd.b(obj2);
                            return iVar;
                        }
                        jd.b(obj2);
                        w wVar = c0.e;
                        n nVar = new n((String) ((n1.b) obj).a(x.a));
                        zVar.b = 1;
                        return cVar2.b(nVar, zVar) == aVar ? aVar : iVar;
                    }
                }
                zVar = new z(this, cVar);
                Object obj22 = zVar.a;
                md.a aVar2 = md.a.a;
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
                        md.a aVar3 = md.a.a;
                        i11 = oVar.b;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            jd.b(obj3);
                            return iVar;
                        }
                        jd.b(obj3);
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
                            return cVar2.b(obj4, oVar) == aVar3 ? aVar3 : iVar;
                        }
                        if (a0Var instanceof k1.b0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new androidx.car.app.j();
                    }
                }
                oVar = new k1.o(this, cVar);
                Object obj32 = oVar.a;
                md.a aVar32 = md.a.a;
                i11 = oVar.b;
                if (i11 == 0) {
                }
        }
    }

    public a0(fe.c cVar) {
        this.b = cVar;
    }
}
