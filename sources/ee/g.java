package ee;

import kotlin.jvm.internal.p;
import org.telegram.tgnet.TLObject;
import v7.i8;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
    @Override // ee.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, md.c cVar) {
        f fVar;
        int i10;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                fVar.d = i11 - TLObject.FLAG_31;
                Object obj2 = fVar.b;
                ld.a aVar = ld.a.a;
                i10 = fVar.d;
                if (i10 != 0) {
                    i8.b(obj2);
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
                        i8.b(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        gVar.b.a = th;
                        throw th;
                    }
                }
                return id.i.a;
            }
        }
        fVar = new f(this, cVar);
        Object obj22 = fVar.b;
        ld.a aVar2 = ld.a.a;
        i10 = fVar.d;
        if (i10 != 0) {
        }
        return id.i.a;
    }
}
