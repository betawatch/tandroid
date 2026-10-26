package fe;

import a8.jd;
import kotlin.jvm.internal.p;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    @Override // fe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, nd.c cVar) {
        f fVar;
        int i10;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                fVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = fVar.b;
                md.a aVar = md.a.a;
                i10 = fVar.d;
                if (i10 != 0) {
                    jd.b(obj2);
                    try {
                        c cVar2 = this.a;
                        fVar.a = this;
                        fVar.d = 1;
                        if (cVar2.b(obj, fVar) == aVar) {
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
                        jd.b(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        gVar.b.a = th;
                        throw th;
                    }
                }
                return jd.i.a;
            }
        }
        fVar = new f(this, cVar);
        Object obj22 = fVar.b;
        md.a aVar2 = md.a.a;
        i10 = fVar.d;
        if (i10 != 0) {
        }
        return jd.i.a;
    }
}
