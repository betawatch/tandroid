package k1;

import org.telegram.tgnet.TLObject;
import v7.t7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class t {
    public final /* synthetic */ ie.a a;
    public final /* synthetic */ kotlin.jvm.internal.n b;
    public final /* synthetic */ kotlin.jvm.internal.p c;
    public final /* synthetic */ a0 d;

    public t(ie.a aVar, kotlin.jvm.internal.n nVar, kotlin.jvm.internal.p pVar, a0 a0Var) {
        this.a = aVar;
        this.b = nVar;
        this.c = pVar;
        this.d = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [ie.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e eVar, kd.c cVar) {
        s sVar;
        int i10;
        a0 a0Var;
        ie.d dVar;
        kotlin.jvm.internal.n nVar;
        kotlin.jvm.internal.p pVar;
        rd.p pVar2;
        ie.a aVar;
        ie.a aVar2;
        a0 a0Var2;
        Object obj;
        kotlin.jvm.internal.p pVar3;
        try {
            if (cVar instanceof s) {
                sVar = (s) cVar;
                int i11 = sVar.n;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    sVar.n = i11 - TLObject.FLAG_31;
                    Object obj2 = sVar.f;
                    jd.a aVar3 = jd.a.a;
                    i10 = sVar.n;
                    if (i10 != 0) {
                        t7.b(obj2);
                        sVar.a = eVar;
                        ie.a aVar4 = this.a;
                        sVar.b = aVar4;
                        kotlin.jvm.internal.n nVar2 = this.b;
                        sVar.c = nVar2;
                        kotlin.jvm.internal.p pVar4 = this.c;
                        sVar.d = pVar4;
                        a0Var = this.d;
                        sVar.e = a0Var;
                        sVar.n = 1;
                        dVar = (ie.d) aVar4;
                        if (dVar.d(sVar) != aVar3) {
                            nVar = nVar2;
                            pVar = pVar4;
                            pVar2 = eVar;
                        }
                        return aVar3;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = sVar.c;
                            pVar3 = (kotlin.jvm.internal.p) sVar.b;
                            aVar = (ie.a) sVar.a;
                            try {
                                t7.b(obj2);
                                pVar3.a = obj;
                                pVar = pVar3;
                                Object obj3 = pVar.a;
                                ((ie.d) aVar).e(null);
                                return obj3;
                            } catch (Throwable th2) {
                                th = th2;
                                ((ie.d) aVar).e(null);
                                throw th;
                            }
                        }
                        a0Var2 = (a0) sVar.c;
                        pVar = (kotlin.jvm.internal.p) sVar.b;
                        aVar2 = (ie.a) sVar.a;
                        try {
                            t7.b(obj2);
                            if (!kotlin.jvm.internal.i.a(obj2, pVar.a)) {
                                aVar = aVar2;
                                Object obj32 = pVar.a;
                                ((ie.d) aVar).e(null);
                                return obj32;
                            }
                            sVar.a = aVar2;
                            sVar.b = pVar;
                            sVar.c = obj2;
                            sVar.n = 3;
                            if (a0Var2.j(obj2, sVar) != aVar3) {
                                obj = obj2;
                                pVar3 = pVar;
                                aVar = aVar2;
                                pVar3.a = obj;
                                pVar = pVar3;
                                Object obj322 = pVar.a;
                                ((ie.d) aVar).e(null);
                                return obj322;
                            }
                            return aVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar = aVar2;
                            ((ie.d) aVar).e(null);
                            throw th;
                        }
                    }
                    a0 a0Var3 = sVar.e;
                    pVar = sVar.d;
                    nVar = (kotlin.jvm.internal.n) sVar.c;
                    ?? r72 = (ie.a) sVar.b;
                    rd.p pVar5 = (rd.p) sVar.a;
                    t7.b(obj2);
                    a0Var = a0Var3;
                    pVar2 = pVar5;
                    dVar = r72;
                    if (!nVar.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = pVar.a;
                    sVar.a = dVar;
                    sVar.b = pVar;
                    sVar.c = a0Var;
                    sVar.d = null;
                    sVar.e = null;
                    sVar.n = 2;
                    Object invoke = pVar2.invoke(obj4, sVar);
                    if (invoke != aVar3) {
                        aVar2 = dVar;
                        obj2 = invoke;
                        a0Var2 = a0Var;
                        if (!kotlin.jvm.internal.i.a(obj2, pVar.a)) {
                        }
                    }
                    return aVar3;
                }
            }
            if (!nVar.a) {
            }
        } catch (Throwable th4) {
            th = th4;
            aVar = dVar;
            ((ie.d) aVar).e(null);
            throw th;
        }
        sVar = new s(this, cVar);
        Object obj22 = sVar.f;
        jd.a aVar32 = jd.a.a;
        i10 = sVar.n;
        if (i10 != 0) {
        }
    }
}
