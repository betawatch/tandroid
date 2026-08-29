package ja;

import i7.c7;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a0 implements md.c {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ md.c b;

    public a0(md.c cVar, c0 c0Var) {
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // md.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, uc.c cVar) {
        z zVar;
        int i10;
        k1.p pVar;
        int i11;
        int i12 = this.a;
        qc.i iVar = qc.i.a;
        md.c cVar2 = this.b;
        switch (i12) {
            case 0:
                if (cVar instanceof z) {
                    zVar = (z) cVar;
                    int i13 = zVar.b;
                    if ((i13 & TLObject.FLAG_31) != 0) {
                        zVar.b = i13 - TLObject.FLAG_31;
                        Object obj2 = zVar.a;
                        tc.a aVar = tc.a.a;
                        i10 = zVar.b;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c7.b(obj2);
                            return iVar;
                        }
                        c7.b(obj2);
                        w wVar = c0.e;
                        n nVar = new n((String) ((n1.b) obj).a(x.a));
                        zVar.b = 1;
                        return cVar2.c(nVar, zVar) == aVar ? aVar : iVar;
                    }
                }
                zVar = new z(this, cVar);
                Object obj22 = zVar.a;
                tc.a aVar2 = tc.a.a;
                i10 = zVar.b;
                if (i10 == 0) {
                }
            default:
                if (cVar instanceof k1.p) {
                    pVar = (k1.p) cVar;
                    int i14 = pVar.b;
                    if ((i14 & TLObject.FLAG_31) != 0) {
                        pVar.b = i14 - TLObject.FLAG_31;
                        Object obj3 = pVar.a;
                        tc.a aVar3 = tc.a.a;
                        i11 = pVar.b;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c7.b(obj3);
                            return iVar;
                        }
                        c7.b(obj3);
                        k1.b0 b0Var = (k1.b0) obj;
                        if (b0Var instanceof k1.h) {
                            throw ((k1.h) b0Var).a;
                        }
                        if (b0Var instanceof k1.g) {
                            throw ((k1.g) b0Var).a;
                        }
                        if (b0Var instanceof k1.b) {
                            Object obj4 = ((k1.b) b0Var).a;
                            pVar.b = 1;
                            return cVar2.c(obj4, pVar) == aVar3 ? aVar3 : iVar;
                        }
                        if (b0Var instanceof k1.c0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new a6.b();
                    }
                }
                pVar = new k1.p(this, cVar);
                Object obj32 = pVar.a;
                tc.a aVar32 = tc.a.a;
                i11 = pVar.b;
                if (i11 == 0) {
                }
        }
    }

    public a0(md.c cVar) {
        this.b = cVar;
    }
}
