package kd;

import g7.y5;
import kotlin.jvm.internal.p;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g implements c {
    public final /* synthetic */ c a;
    public final /* synthetic */ p b;

    public g(c cVar, p pVar) {
        this.a = cVar;
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, sc.c cVar) {
        f fVar;
        int i9;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                fVar.d = i10 - TLObject.FLAG_31;
                Object obj2 = fVar.b;
                rc.a aVar = rc.a.a;
                i9 = fVar.d;
                if (i9 != 0) {
                    y5.b(obj2);
                    try {
                        c cVar2 = this.a;
                        fVar.a = this;
                        fVar.d = 1;
                        if (cVar2.c(obj, fVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gVar = this;
                        gVar.b.a = th;
                        throw th;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = fVar.a;
                    try {
                        y5.b(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        gVar.b.a = th;
                        throw th;
                    }
                }
                return oc.i.a;
            }
        }
        fVar = new f(this, cVar);
        Object obj22 = fVar.b;
        rc.a aVar2 = rc.a.a;
        i9 = fVar.d;
        if (i9 != 0) {
        }
        return oc.i.a;
    }
}
