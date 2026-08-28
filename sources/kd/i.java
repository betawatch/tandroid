package kd;

import g7.y5;
import ha.b0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements c {
    public final /* synthetic */ kotlin.jvm.internal.n a;
    public final /* synthetic */ c b;
    public final /* synthetic */ b0 c;

    public i(kotlin.jvm.internal.n nVar, c cVar, b0 b0Var) {
        this.a = nVar;
        this.b = cVar;
        this.c = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, sc.c cVar) {
        h hVar;
        Object obj2;
        int i9;
        i iVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.e;
            if ((i10 & TLObject.FLAG_31) != 0) {
                hVar.e = i10 - TLObject.FLAG_31;
                obj2 = hVar.c;
                rc.a aVar = rc.a.a;
                i9 = hVar.e;
                oc.i iVar2 = oc.i.a;
                if (i9 != 0) {
                    y5.b(obj2);
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
                if (i9 == 1) {
                    y5.b(obj2);
                    return iVar2;
                }
                if (i9 != 2) {
                    if (i9 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj2);
                    return iVar2;
                }
                obj = hVar.b;
                iVar = hVar.a;
                y5.b(obj2);
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
        rc.a aVar2 = rc.a.a;
        i9 = hVar.e;
        oc.i iVar22 = oc.i.a;
        if (i9 != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        return iVar22;
    }
}
