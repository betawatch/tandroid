package k1;

import org.telegram.tgnet.TLObject;
import v7.t7;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class p implements ce.c {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ce.c b;

    public p(ce.c cVar, za.a0 a0Var) {
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, kd.c cVar) {
        o oVar;
        int i10;
        za.z zVar;
        int i11;
        int i12 = this.a;
        gd.i iVar = gd.i.a;
        ce.c cVar2 = this.b;
        switch (i12) {
            case 0:
                if (cVar instanceof o) {
                    oVar = (o) cVar;
                    int i13 = oVar.b;
                    if ((i13 & TLObject.FLAG_31) != 0) {
                        oVar.b = i13 - TLObject.FLAG_31;
                        Object obj2 = oVar.a;
                        jd.a aVar = jd.a.a;
                        i10 = oVar.b;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t7.b(obj2);
                            return iVar;
                        }
                        t7.b(obj2);
                        b0 b0Var = (b0) obj;
                        if (b0Var instanceof h) {
                            throw ((h) b0Var).a;
                        }
                        if (b0Var instanceof g) {
                            throw ((g) b0Var).a;
                        }
                        if (b0Var instanceof b) {
                            Object obj3 = ((b) b0Var).a;
                            oVar.b = 1;
                            return cVar2.a(obj3, oVar) == aVar ? aVar : iVar;
                        }
                        if (b0Var instanceof c0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new androidx.car.app.j();
                    }
                }
                oVar = new o(this, cVar);
                Object obj22 = oVar.a;
                jd.a aVar2 = jd.a.a;
                i10 = oVar.b;
                if (i10 == 0) {
                }
            default:
                if (cVar instanceof za.z) {
                    zVar = (za.z) cVar;
                    int i14 = zVar.b;
                    if ((i14 & TLObject.FLAG_31) != 0) {
                        zVar.b = i14 - TLObject.FLAG_31;
                        Object obj4 = zVar.a;
                        jd.a aVar3 = jd.a.a;
                        i11 = zVar.b;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t7.b(obj4);
                            return iVar;
                        }
                        t7.b(obj4);
                        za.w wVar = za.a0.e;
                        za.n nVar = new za.n((String) ((n1.b) obj).a(za.x.a));
                        zVar.b = 1;
                        return cVar2.a(nVar, zVar) == aVar3 ? aVar3 : iVar;
                    }
                }
                zVar = new za.z(this, cVar);
                Object obj42 = zVar.a;
                jd.a aVar32 = jd.a.a;
                i11 = zVar.b;
                if (i11 == 0) {
                }
        }
    }

    public p(ce.c cVar) {
        this.b = cVar;
    }
}
