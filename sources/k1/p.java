package k1;

import org.telegram.tgnet.TLObject;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class p implements de.c {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ de.c b;

    public p(de.c cVar, za.a0 a0Var) {
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    @Override // de.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ld.c cVar) {
        o oVar;
        int i10;
        za.y yVar;
        int i11;
        int i12 = this.a;
        hd.i iVar = hd.i.a;
        de.c cVar2 = this.b;
        switch (i12) {
            case 0:
                if (cVar instanceof o) {
                    oVar = (o) cVar;
                    int i13 = oVar.b;
                    if ((i13 & TLObject.FLAG_31) != 0) {
                        oVar.b = i13 - TLObject.FLAG_31;
                        Object obj2 = oVar.a;
                        kd.a aVar = kd.a.a;
                        i10 = oVar.b;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a8.b(obj2);
                            return iVar;
                        }
                        a8.b(obj2);
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
                            return cVar2.b(obj3, oVar) == aVar ? aVar : iVar;
                        }
                        if (b0Var instanceof c0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new ae.x();
                    }
                }
                oVar = new o(this, cVar);
                Object obj22 = oVar.a;
                kd.a aVar2 = kd.a.a;
                i10 = oVar.b;
                if (i10 == 0) {
                }
            default:
                if (cVar instanceof za.y) {
                    yVar = (za.y) cVar;
                    int i14 = yVar.b;
                    if ((i14 & TLObject.FLAG_31) != 0) {
                        yVar.b = i14 - TLObject.FLAG_31;
                        Object obj4 = yVar.a;
                        kd.a aVar3 = kd.a.a;
                        i11 = yVar.b;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a8.b(obj4);
                            return iVar;
                        }
                        a8.b(obj4);
                        za.v vVar = za.a0.e;
                        za.n nVar = new za.n((String) ((n1.b) obj).a(za.w.a));
                        yVar.b = 1;
                        return cVar2.b(nVar, yVar) == aVar3 ? aVar3 : iVar;
                    }
                }
                yVar = new za.y(this, cVar);
                Object obj42 = yVar.a;
                kd.a aVar32 = kd.a.a;
                i11 = yVar.b;
                if (i11 == 0) {
                }
        }
    }

    public p(de.c cVar) {
        this.b = cVar;
    }
}
