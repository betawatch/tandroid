package md;

import i7.c7;
import ja.b0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i implements c {
    public final /* synthetic */ kotlin.jvm.internal.o a;
    public final /* synthetic */ c b;
    public final /* synthetic */ b0 c;

    public i(kotlin.jvm.internal.o oVar, c cVar, b0 b0Var) {
        this.a = oVar;
        this.b = cVar;
        this.c = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // md.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, uc.c cVar) {
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
                tc.a aVar = tc.a.a;
                i10 = hVar.e;
                qc.i iVar2 = qc.i.a;
                if (i10 != 0) {
                    c7.b(obj2);
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
                    c7.b(obj2);
                    return iVar2;
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7.b(obj2);
                    return iVar2;
                }
                obj = hVar.b;
                iVar = hVar.a;
                c7.b(obj2);
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
        tc.a aVar2 = tc.a.a;
        i10 = hVar.e;
        qc.i iVar22 = qc.i.a;
        if (i10 != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        return iVar22;
    }
}
