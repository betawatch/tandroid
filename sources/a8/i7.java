package a8;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class i7 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(be.s sVar, androidx.lifecycle.k0 k0Var, kd.c cVar) {
        be.p pVar;
        int i7;
        try {
            if (cVar instanceof be.p) {
                pVar = (be.p) cVar;
                int i10 = pVar.c;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    pVar.c = i10 - TLObject.FLAG_31;
                    Object obj = pVar.b;
                    jd.a aVar = jd.a.a;
                    i7 = pVar.c;
                    if (i7 != 0) {
                        af.b.c(obj);
                        if (pVar.getContext().get(zd.y.b) != sVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        pVar.a = k0Var;
                        pVar.c = 1;
                        zd.m mVar = new zd.m(1, c8.u0.b(pVar));
                        mVar.s();
                        ((be.r) sVar).T(new be.q(mVar, 0));
                        if (mVar.r() == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k0Var = pVar.a;
                        af.b.c(obj);
                    }
                    k0Var.invoke();
                    return gd.k.a;
                }
            }
            if (i7 != 0) {
            }
            k0Var.invoke();
            return gd.k.a;
        } catch (Throwable th2) {
            k0Var.invoke();
            throw th2;
        }
        pVar = new be.p(cVar);
        Object obj2 = pVar.b;
        jd.a aVar2 = jd.a.a;
        i7 = pVar.c;
    }
}
