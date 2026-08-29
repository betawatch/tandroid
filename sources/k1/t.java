package k1;

import i7.c7;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t {
    public final /* synthetic */ sd.a a;
    public final /* synthetic */ kotlin.jvm.internal.o b;
    public final /* synthetic */ kotlin.jvm.internal.q c;
    public final /* synthetic */ a0 d;

    public t(sd.a aVar, kotlin.jvm.internal.o oVar, kotlin.jvm.internal.q qVar, a0 a0Var) {
        this.a = aVar;
        this.b = oVar;
        this.c = qVar;
        this.d = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [sd.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e eVar, uc.c cVar) {
        s sVar;
        int i10;
        a0 a0Var;
        sd.d dVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.q qVar;
        bd.p pVar;
        sd.a aVar;
        sd.a aVar2;
        a0 a0Var2;
        Object obj;
        kotlin.jvm.internal.q qVar2;
        try {
            if (cVar instanceof s) {
                sVar = (s) cVar;
                int i11 = sVar.n;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    sVar.n = i11 - TLObject.FLAG_31;
                    Object obj2 = sVar.f;
                    tc.a aVar3 = tc.a.a;
                    i10 = sVar.n;
                    if (i10 != 0) {
                        c7.b(obj2);
                        sVar.a = eVar;
                        sd.a aVar4 = this.a;
                        sVar.b = aVar4;
                        kotlin.jvm.internal.o oVar2 = this.b;
                        sVar.c = oVar2;
                        kotlin.jvm.internal.q qVar3 = this.c;
                        sVar.d = qVar3;
                        a0Var = this.d;
                        sVar.e = a0Var;
                        sVar.n = 1;
                        dVar = (sd.d) aVar4;
                        if (dVar.d(sVar) != aVar3) {
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
                            obj = sVar.c;
                            qVar2 = (kotlin.jvm.internal.q) sVar.b;
                            aVar = (sd.a) sVar.a;
                            try {
                                c7.b(obj2);
                                qVar2.a = obj;
                                qVar = qVar2;
                                Object obj3 = qVar.a;
                                ((sd.d) aVar).e(null);
                                return obj3;
                            } catch (Throwable th2) {
                                th = th2;
                                ((sd.d) aVar).e(null);
                                throw th;
                            }
                        }
                        a0Var2 = (a0) sVar.c;
                        qVar = (kotlin.jvm.internal.q) sVar.b;
                        aVar2 = (sd.a) sVar.a;
                        try {
                            c7.b(obj2);
                            if (!kotlin.jvm.internal.j.a(obj2, qVar.a)) {
                                aVar = aVar2;
                                Object obj32 = qVar.a;
                                ((sd.d) aVar).e(null);
                                return obj32;
                            }
                            sVar.a = aVar2;
                            sVar.b = qVar;
                            sVar.c = obj2;
                            sVar.n = 3;
                            if (a0Var2.j(obj2, sVar) != aVar3) {
                                obj = obj2;
                                qVar2 = qVar;
                                aVar = aVar2;
                                qVar2.a = obj;
                                qVar = qVar2;
                                Object obj322 = qVar.a;
                                ((sd.d) aVar).e(null);
                                return obj322;
                            }
                            return aVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar = aVar2;
                            ((sd.d) aVar).e(null);
                            throw th;
                        }
                    }
                    a0 a0Var3 = sVar.e;
                    qVar = sVar.d;
                    oVar = (kotlin.jvm.internal.o) sVar.c;
                    ?? r72 = (sd.a) sVar.b;
                    bd.p pVar2 = (bd.p) sVar.a;
                    c7.b(obj2);
                    a0Var = a0Var3;
                    pVar = pVar2;
                    dVar = r72;
                    if (!oVar.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = qVar.a;
                    sVar.a = dVar;
                    sVar.b = qVar;
                    sVar.c = a0Var;
                    sVar.d = null;
                    sVar.e = null;
                    sVar.n = 2;
                    Object invoke = pVar.invoke(obj4, sVar);
                    if (invoke != aVar3) {
                        aVar2 = dVar;
                        obj2 = invoke;
                        a0Var2 = a0Var;
                        if (!kotlin.jvm.internal.j.a(obj2, qVar.a)) {
                        }
                    }
                    return aVar3;
                }
            }
            if (!oVar.a) {
            }
        } catch (Throwable th4) {
            th = th4;
            aVar = dVar;
            ((sd.d) aVar).e(null);
            throw th;
        }
        sVar = new s(this, cVar);
        Object obj22 = sVar.f;
        tc.a aVar32 = tc.a.a;
        i10 = sVar.n;
        if (i10 != 0) {
        }
    }
}
