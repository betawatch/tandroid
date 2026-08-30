package od;

import k7.p7;
import kotlin.jvm.internal.q;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g implements c {
    public final /* synthetic */ c a;
    public final /* synthetic */ q b;

    public g(c cVar, q qVar) {
        this.a = cVar;
        this.b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // od.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, wc.c cVar) {
        f fVar;
        int i10;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                fVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = fVar.b;
                vc.a aVar = vc.a.a;
                i10 = fVar.d;
                if (i10 != 0) {
                    p7.b(obj2);
                    try {
                        c cVar2 = this.a;
                        fVar.a = this;
                        fVar.d = 1;
                        if (cVar2.c(obj, fVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = this;
                        gVar.b.a = th;
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = fVar.a;
                    try {
                        p7.b(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        gVar.b.a = th;
                        throw th;
                    }
                }
                return sc.i.a;
            }
        }
        fVar = new f(this, cVar);
        Object obj22 = fVar.b;
        vc.a aVar2 = vc.a.a;
        i10 = fVar.d;
        if (i10 != 0) {
        }
        return sc.i.a;
    }
}
