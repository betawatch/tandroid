package k1;

import k7.p7;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class w {
    public final /* synthetic */ ud.a a;
    public final /* synthetic */ kotlin.jvm.internal.o b;
    public final /* synthetic */ kotlin.jvm.internal.q c;
    public final /* synthetic */ d0 d;

    public w(ud.a aVar, kotlin.jvm.internal.o oVar, kotlin.jvm.internal.q qVar, d0 d0Var) {
        this.a = aVar;
        this.b = oVar;
        this.c = qVar;
        this.d = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [ud.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f fVar, wc.c cVar) {
        v vVar;
        int i10;
        d0 d0Var;
        ud.d dVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.q qVar;
        dd.p pVar;
        ud.a aVar;
        ud.a aVar2;
        d0 d0Var2;
        Object obj;
        kotlin.jvm.internal.q qVar2;
        try {
            if (cVar instanceof v) {
                vVar = (v) cVar;
                int i11 = vVar.n;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    vVar.n = i11 - TLObject.FLAG_31;
                    Object obj2 = vVar.f;
                    vc.a aVar3 = vc.a.a;
                    i10 = vVar.n;
                    if (i10 != 0) {
                        p7.b(obj2);
                        vVar.a = fVar;
                        ud.a aVar4 = this.a;
                        vVar.b = aVar4;
                        kotlin.jvm.internal.o oVar2 = this.b;
                        vVar.c = oVar2;
                        kotlin.jvm.internal.q qVar3 = this.c;
                        vVar.d = qVar3;
                        d0Var = this.d;
                        vVar.e = d0Var;
                        vVar.n = 1;
                        dVar = (ud.d) aVar4;
                        if (dVar.d(vVar) != aVar3) {
                            oVar = oVar2;
                            qVar = qVar3;
                            pVar = fVar;
                        }
                        return aVar3;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = vVar.c;
                            qVar2 = (kotlin.jvm.internal.q) vVar.b;
                            aVar = (ud.a) vVar.a;
                            try {
                                p7.b(obj2);
                                qVar2.a = obj;
                                qVar = qVar2;
                                Object obj3 = qVar.a;
                                ((ud.d) aVar).e(null);
                                return obj3;
                            } catch (Throwable th2) {
                                th = th2;
                                ((ud.d) aVar).e(null);
                                throw th;
                            }
                        }
                        d0Var2 = (d0) vVar.c;
                        qVar = (kotlin.jvm.internal.q) vVar.b;
                        aVar2 = (ud.a) vVar.a;
                        try {
                            p7.b(obj2);
                            if (!kotlin.jvm.internal.j.a(obj2, qVar.a)) {
                                aVar = aVar2;
                                Object obj32 = qVar.a;
                                ((ud.d) aVar).e(null);
                                return obj32;
                            }
                            vVar.a = aVar2;
                            vVar.b = qVar;
                            vVar.c = obj2;
                            vVar.n = 3;
                            if (d0Var2.i(obj2, vVar) != aVar3) {
                                obj = obj2;
                                qVar2 = qVar;
                                aVar = aVar2;
                                qVar2.a = obj;
                                qVar = qVar2;
                                Object obj322 = qVar.a;
                                ((ud.d) aVar).e(null);
                                return obj322;
                            }
                            return aVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar = aVar2;
                            ((ud.d) aVar).e(null);
                            throw th;
                        }
                    }
                    d0 d0Var3 = vVar.e;
                    qVar = vVar.d;
                    oVar = (kotlin.jvm.internal.o) vVar.c;
                    ?? r72 = (ud.a) vVar.b;
                    dd.p pVar2 = (dd.p) vVar.a;
                    p7.b(obj2);
                    d0Var = d0Var3;
                    pVar = pVar2;
                    dVar = r72;
                    if (!oVar.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = qVar.a;
                    vVar.a = dVar;
                    vVar.b = qVar;
                    vVar.c = d0Var;
                    vVar.d = null;
                    vVar.e = null;
                    vVar.n = 2;
                    Object invoke = pVar.invoke(obj4, vVar);
                    if (invoke != aVar3) {
                        aVar2 = dVar;
                        obj2 = invoke;
                        d0Var2 = d0Var;
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
            ((ud.d) aVar).e(null);
            throw th;
        }
        vVar = new v(this, cVar);
        Object obj22 = vVar.f;
        vc.a aVar32 = vc.a.a;
        i10 = vVar.n;
        if (i10 != 0) {
        }
    }
}
