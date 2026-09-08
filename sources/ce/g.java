package ce;

import org.telegram.tgnet.TLObject;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g implements c {
    public final /* synthetic */ c a;
    public final /* synthetic */ kotlin.jvm.internal.p b;

    public g(c cVar, kotlin.jvm.internal.p pVar) {
        this.a = cVar;
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, kd.c cVar) {
        f fVar;
        int i10;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                fVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = fVar.b;
                jd.a aVar = jd.a.a;
                i10 = fVar.d;
                if (i10 != 0) {
                    t7.b(obj2);
                    try {
                        c cVar2 = this.a;
                        fVar.a = this;
                        fVar.d = 1;
                        if (cVar2.a(obj, fVar) == aVar) {
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
                        t7.b(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        gVar.b.a = th;
                        throw th;
                    }
                }
                return gd.i.a;
            }
        }
        fVar = new f(this, cVar);
        Object obj22 = fVar.b;
        jd.a aVar2 = jd.a.a;
        i10 = fVar.d;
        if (i10 != 0) {
        }
        return gd.i.a;
    }
}
