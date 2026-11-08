package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j {
    public final /* synthetic */ ie.a a;
    public final /* synthetic */ kotlin.jvm.internal.o b;
    public final /* synthetic */ kotlin.jvm.internal.r c;
    public final /* synthetic */ b0 d;

    public j(ie.a aVar, kotlin.jvm.internal.o oVar, kotlin.jvm.internal.r rVar, b0 b0Var) {
        this.a = aVar;
        this.b = oVar;
        this.c = rVar;
        this.d = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [ie.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f fVar, kd.c cVar) {
        i iVar;
        int i7;
        b0 b0Var;
        ie.d dVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.r rVar;
        rd.p pVar;
        ie.a aVar;
        ie.a aVar2;
        b0 b0Var2;
        Object obj;
        kotlin.jvm.internal.r rVar2;
        try {
            if (cVar instanceof i) {
                iVar = (i) cVar;
                int i10 = iVar.n;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    iVar.n = i10 - TLObject.FLAG_31;
                    Object obj2 = iVar.f;
                    jd.a aVar3 = jd.a.a;
                    i7 = iVar.n;
                    if (i7 != 0) {
                        af.b.c(obj2);
                        iVar.a = fVar;
                        ie.a aVar4 = this.a;
                        iVar.b = aVar4;
                        kotlin.jvm.internal.o oVar2 = this.b;
                        iVar.c = oVar2;
                        kotlin.jvm.internal.r rVar3 = this.c;
                        iVar.d = rVar3;
                        b0Var = this.d;
                        iVar.e = b0Var;
                        iVar.n = 1;
                        dVar = (ie.d) aVar4;
                        if (dVar.d(iVar) != aVar3) {
                            oVar = oVar2;
                            rVar = rVar3;
                            pVar = fVar;
                        }
                        return aVar3;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = iVar.c;
                            rVar2 = (kotlin.jvm.internal.r) iVar.b;
                            aVar = (ie.a) iVar.a;
                            try {
                                af.b.c(obj2);
                                rVar2.a = obj;
                                rVar = rVar2;
                                Object obj3 = rVar.a;
                                ((ie.d) aVar).f(null);
                                return obj3;
                            } catch (Throwable th2) {
                                th = th2;
                                ((ie.d) aVar).f(null);
                                throw th;
                            }
                        }
                        b0Var2 = (b0) iVar.c;
                        rVar = (kotlin.jvm.internal.r) iVar.b;
                        aVar2 = (ie.a) iVar.a;
                        try {
                            af.b.c(obj2);
                            if (!kotlin.jvm.internal.j.a(obj2, rVar.a)) {
                                aVar = aVar2;
                                Object obj32 = rVar.a;
                                ((ie.d) aVar).f(null);
                                return obj32;
                            }
                            iVar.a = aVar2;
                            iVar.b = rVar;
                            iVar.c = obj2;
                            iVar.n = 3;
                            if (b0Var2.j(obj2, false, iVar) != aVar3) {
                                obj = obj2;
                                rVar2 = rVar;
                                aVar = aVar2;
                                rVar2.a = obj;
                                rVar = rVar2;
                                Object obj322 = rVar.a;
                                ((ie.d) aVar).f(null);
                                return obj322;
                            }
                            return aVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar = aVar2;
                            ((ie.d) aVar).f(null);
                            throw th;
                        }
                    }
                    b0 b0Var3 = iVar.e;
                    rVar = iVar.d;
                    oVar = (kotlin.jvm.internal.o) iVar.c;
                    ?? r72 = (ie.a) iVar.b;
                    rd.p pVar2 = (rd.p) iVar.a;
                    af.b.c(obj2);
                    b0Var = b0Var3;
                    pVar = pVar2;
                    dVar = r72;
                    if (!oVar.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = rVar.a;
                    iVar.a = dVar;
                    iVar.b = rVar;
                    iVar.c = b0Var;
                    iVar.d = null;
                    iVar.e = null;
                    iVar.n = 2;
                    Object invoke = pVar.invoke(obj4, iVar);
                    if (invoke != aVar3) {
                        aVar2 = dVar;
                        obj2 = invoke;
                        b0Var2 = b0Var;
                        if (!kotlin.jvm.internal.j.a(obj2, rVar.a)) {
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
            ((ie.d) aVar).f(null);
            throw th;
        }
        iVar = new i(this, cVar);
        Object obj22 = iVar.f;
        jd.a aVar32 = jd.a.a;
        i7 = iVar.n;
        if (i7 != 0) {
        }
    }
}
