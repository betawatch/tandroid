package k1;

import h7.k6;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s {
    public final /* synthetic */ rd.a a;
    public final /* synthetic */ kotlin.jvm.internal.o b;
    public final /* synthetic */ kotlin.jvm.internal.q c;
    public final /* synthetic */ z d;

    public s(rd.a aVar, kotlin.jvm.internal.o oVar, kotlin.jvm.internal.q qVar, z zVar) {
        this.a = aVar;
        this.b = oVar;
        this.c = qVar;
        this.d = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [rd.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e eVar, tc.c cVar) {
        r rVar;
        int i10;
        z zVar;
        rd.d dVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.q qVar;
        ad.p pVar;
        rd.a aVar;
        rd.a aVar2;
        z zVar2;
        Object obj;
        kotlin.jvm.internal.q qVar2;
        try {
            if (cVar instanceof r) {
                rVar = (r) cVar;
                int i11 = rVar.n;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    rVar.n = i11 - TLObject.FLAG_31;
                    Object obj2 = rVar.f;
                    sc.a aVar3 = sc.a.a;
                    i10 = rVar.n;
                    if (i10 != 0) {
                        k6.b(obj2);
                        rVar.a = eVar;
                        rd.a aVar4 = this.a;
                        rVar.b = aVar4;
                        kotlin.jvm.internal.o oVar2 = this.b;
                        rVar.c = oVar2;
                        kotlin.jvm.internal.q qVar3 = this.c;
                        rVar.d = qVar3;
                        zVar = this.d;
                        rVar.e = zVar;
                        rVar.n = 1;
                        dVar = (rd.d) aVar4;
                        if (dVar.d(rVar) != aVar3) {
                            oVar = oVar2;
                            qVar = qVar3;
                            pVar = eVar;
                        }
                        return aVar3;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = rVar.c;
                            qVar2 = (kotlin.jvm.internal.q) rVar.b;
                            aVar = (rd.a) rVar.a;
                            try {
                                k6.b(obj2);
                                qVar2.a = obj;
                                qVar = qVar2;
                                Object obj3 = qVar.a;
                                ((rd.d) aVar).e(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((rd.d) aVar).e(null);
                                throw th;
                            }
                        }
                        zVar2 = (z) rVar.c;
                        qVar = (kotlin.jvm.internal.q) rVar.b;
                        aVar2 = (rd.a) rVar.a;
                        try {
                            k6.b(obj2);
                            if (!kotlin.jvm.internal.j.a(obj2, qVar.a)) {
                                aVar = aVar2;
                                Object obj32 = qVar.a;
                                ((rd.d) aVar).e(null);
                                return obj32;
                            }
                            rVar.a = aVar2;
                            rVar.b = qVar;
                            rVar.c = obj2;
                            rVar.n = 3;
                            if (zVar2.j(obj2, rVar) != aVar3) {
                                obj = obj2;
                                qVar2 = qVar;
                                aVar = aVar2;
                                qVar2.a = obj;
                                qVar = qVar2;
                                Object obj322 = qVar.a;
                                ((rd.d) aVar).e(null);
                                return obj322;
                            }
                            return aVar3;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            ((rd.d) aVar).e(null);
                            throw th;
                        }
                    }
                    z zVar3 = rVar.e;
                    qVar = rVar.d;
                    oVar = (kotlin.jvm.internal.o) rVar.c;
                    ?? r72 = (rd.a) rVar.b;
                    ad.p pVar2 = (ad.p) rVar.a;
                    k6.b(obj2);
                    zVar = zVar3;
                    pVar = pVar2;
                    dVar = r72;
                    if (!oVar.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = qVar.a;
                    rVar.a = dVar;
                    rVar.b = qVar;
                    rVar.c = zVar;
                    rVar.d = null;
                    rVar.e = null;
                    rVar.n = 2;
                    Object invoke = pVar.invoke(obj4, rVar);
                    if (invoke != aVar3) {
                        aVar2 = dVar;
                        obj2 = invoke;
                        zVar2 = zVar;
                        if (!kotlin.jvm.internal.j.a(obj2, qVar.a)) {
                        }
                    }
                    return aVar3;
                }
            }
            if (!oVar.a) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = dVar;
            ((rd.d) aVar).e(null);
            throw th;
        }
        rVar = new r(this, cVar);
        Object obj22 = rVar.f;
        sc.a aVar32 = sc.a.a;
        i10 = rVar.n;
        if (i10 != 0) {
        }
    }
}
