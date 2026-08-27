package ld;

import h7.k6;
import kotlin.jvm.internal.q;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    @Override // ld.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, tc.c cVar) {
        f fVar;
        int i10;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                fVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = fVar.b;
                sc.a aVar = sc.a.a;
                i10 = fVar.d;
                if (i10 != 0) {
                    k6.b(obj2);
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
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = fVar.a;
                    try {
                        k6.b(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        gVar.b.a = th;
                        throw th;
                    }
                }
                return pc.i.a;
            }
        }
        fVar = new f(this, cVar);
        Object obj22 = fVar.b;
        sc.a aVar2 = sc.a.a;
        i10 = fVar.d;
        if (i10 != 0) {
        }
        return pc.i.a;
    }
}
