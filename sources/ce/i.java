package ce;

import org.telegram.tgnet.TLObject;
import v7.t7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class i implements c {
    public final /* synthetic */ kotlin.jvm.internal.n a;
    public final /* synthetic */ c b;
    public final /* synthetic */ k1.n c;

    public i(kotlin.jvm.internal.n nVar, c cVar, k1.n nVar2) {
        this.a = nVar;
        this.b = cVar;
        this.c = nVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, kd.c cVar) {
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
                jd.a aVar = jd.a.a;
                i10 = hVar.e;
                gd.i iVar2 = gd.i.a;
                if (i10 != 0) {
                    t7.b(obj2);
                    if (this.a.a) {
                        hVar.e = 1;
                        if (this.b.a(obj, hVar) != aVar) {
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
                    t7.b(obj2);
                    return iVar2;
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj2);
                    return iVar2;
                }
                obj = hVar.b;
                iVar = hVar.a;
                t7.b(obj2);
                if (!((Boolean) obj2).booleanValue()) {
                    iVar.a.a = true;
                    c cVar2 = iVar.b;
                    hVar.a = null;
                    hVar.b = null;
                    hVar.e = 3;
                    if (cVar2.a(obj, hVar) == aVar) {
                        return aVar;
                    }
                }
                return iVar2;
            }
        }
        hVar = new h(this, cVar);
        obj2 = hVar.c;
        jd.a aVar2 = jd.a.a;
        i10 = hVar.e;
        gd.i iVar22 = gd.i.a;
        if (i10 != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        return iVar22;
    }
}
