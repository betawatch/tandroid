package k1;

import org.telegram.tgnet.TLObject;
import v7.i8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class s {
    public final /* synthetic */ ke.a a;
    public final /* synthetic */ kotlin.jvm.internal.n b;
    public final /* synthetic */ kotlin.jvm.internal.p c;
    public final /* synthetic */ z d;

    public s(ke.a aVar, kotlin.jvm.internal.n nVar, kotlin.jvm.internal.p pVar, z zVar) {
        this.a = aVar;
        this.b = nVar;
        this.c = pVar;
        this.d = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [ke.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e eVar, md.c cVar) {
        r rVar;
        int i10;
        z zVar;
        ke.d dVar;
        kotlin.jvm.internal.n nVar;
        kotlin.jvm.internal.p pVar;
        td.p pVar2;
        ke.a aVar;
        ke.a aVar2;
        z zVar2;
        Object obj;
        kotlin.jvm.internal.p pVar3;
        try {
            if (cVar instanceof r) {
                rVar = (r) cVar;
                int i11 = rVar.n;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    rVar.n = i11 - TLObject.FLAG_31;
                    Object obj2 = rVar.f;
                    ld.a aVar3 = ld.a.a;
                    i10 = rVar.n;
                    if (i10 != 0) {
                        i8.b(obj2);
                        rVar.a = eVar;
                        ke.a aVar4 = this.a;
                        rVar.b = aVar4;
                        kotlin.jvm.internal.n nVar2 = this.b;
                        rVar.c = nVar2;
                        kotlin.jvm.internal.p pVar4 = this.c;
                        rVar.d = pVar4;
                        zVar = this.d;
                        rVar.e = zVar;
                        rVar.n = 1;
                        dVar = (ke.d) aVar4;
                        if (dVar.d(rVar) != aVar3) {
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
                            obj = rVar.c;
                            pVar3 = (kotlin.jvm.internal.p) rVar.b;
                            aVar = (ke.a) rVar.a;
                            try {
                                i8.b(obj2);
                                pVar3.a = obj;
                                pVar = pVar3;
                                Object obj3 = pVar.a;
                                ((ke.d) aVar).e(null);
                                return obj3;
                            } catch (Throwable th2) {
                                th = th2;
                                ((ke.d) aVar).e(null);
                                throw th;
                            }
                        }
                        zVar2 = (z) rVar.c;
                        pVar = (kotlin.jvm.internal.p) rVar.b;
                        aVar2 = (ke.a) rVar.a;
                        try {
                            i8.b(obj2);
                            if (!kotlin.jvm.internal.i.a(obj2, pVar.a)) {
                                aVar = aVar2;
                                Object obj32 = pVar.a;
                                ((ke.d) aVar).e(null);
                                return obj32;
                            }
                            rVar.a = aVar2;
                            rVar.b = pVar;
                            rVar.c = obj2;
                            rVar.n = 3;
                            if (zVar2.j(obj2, rVar) != aVar3) {
                                obj = obj2;
                                pVar3 = pVar;
                                aVar = aVar2;
                                pVar3.a = obj;
                                pVar = pVar3;
                                Object obj322 = pVar.a;
                                ((ke.d) aVar).e(null);
                                return obj322;
                            }
                            return aVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar = aVar2;
                            ((ke.d) aVar).e(null);
                            throw th;
                        }
                    }
                    z zVar3 = rVar.e;
                    pVar = rVar.d;
                    nVar = (kotlin.jvm.internal.n) rVar.c;
                    ?? r72 = (ke.a) rVar.b;
                    td.p pVar5 = (td.p) rVar.a;
                    i8.b(obj2);
                    zVar = zVar3;
                    pVar2 = pVar5;
                    dVar = r72;
                    if (!nVar.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = pVar.a;
                    rVar.a = dVar;
                    rVar.b = pVar;
                    rVar.c = zVar;
                    rVar.d = null;
                    rVar.e = null;
                    rVar.n = 2;
                    Object invoke = pVar2.invoke(obj4, rVar);
                    if (invoke != aVar3) {
                        aVar2 = dVar;
                        obj2 = invoke;
                        zVar2 = zVar;
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
            ((ke.d) aVar).e(null);
            throw th;
        }
        rVar = new r(this, cVar);
        Object obj22 = rVar.f;
        ld.a aVar32 = ld.a.a;
        i10 = rVar.n;
        if (i10 != 0) {
        }
    }
}
