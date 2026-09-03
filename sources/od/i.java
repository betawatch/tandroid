package od;

import k1.q;
import k7.p7;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i implements c {
    public final /* synthetic */ kotlin.jvm.internal.o a;
    public final /* synthetic */ c b;
    public final /* synthetic */ q c;

    public i(kotlin.jvm.internal.o oVar, c cVar, q qVar) {
        this.a = oVar;
        this.b = cVar;
        this.c = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // od.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, wc.c cVar) {
        h hVar;
        Object obj2;
        int i10;
        i iVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i11 = hVar.e;
            if ((i11 & TLObject.FLAG_31) != 0) {
                hVar.e = i11 - TLObject.FLAG_31;
                obj2 = hVar.c;
                vc.a aVar = vc.a.a;
                i10 = hVar.e;
                sc.i iVar2 = sc.i.a;
                if (i10 != 0) {
                    p7.b(obj2);
                    if (this.a.a) {
                        hVar.e = 1;
                        if (this.b.c(obj, hVar) != aVar) {
                            return iVar2;
                        }
                    } else {
                        hVar.a = this;
                        hVar.b = obj;
                        hVar.e = 2;
                        obj2 = this.c.invoke(obj, hVar);
                        if (obj2 != aVar) {
                            iVar = this;
                        }
                    }
                    return aVar;
                }
                if (i10 == 1) {
                    p7.b(obj2);
                    return iVar2;
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p7.b(obj2);
                    return iVar2;
                }
                obj = hVar.b;
                iVar = hVar.a;
                p7.b(obj2);
                if (!((Boolean) obj2).booleanValue()) {
                    iVar.a.a = true;
                    c cVar2 = iVar.b;
                    hVar.a = null;
                    hVar.b = null;
                    hVar.e = 3;
                    if (cVar2.c(obj, hVar) == aVar) {
                        return aVar;
                    }
                }
                return iVar2;
            }
        }
        hVar = new h(this, cVar);
        obj2 = hVar.c;
        vc.a aVar2 = vc.a.a;
        i10 = hVar.e;
        sc.i iVar22 = sc.i.a;
        if (i10 != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        return iVar22;
    }
}
