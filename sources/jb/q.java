package jb;

import c8.z;
import gb.i1;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;
import zd.b0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class q {
    public final i1 a;
    public final m1.g b;
    public final AtomicReference c;

    public q(id.h backgroundDispatcher, i1 timeProvider, m1.g sessionConfigsDataStore) {
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.a = timeProvider;
        this.b = sessionConfigsDataStore;
        this.c = new AtomicReference();
        b0.q(b0.b(backgroundDispatcher), new o(this, null, 0));
    }

    public final i a() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object u10 = b0.u(new o(this, null, 1));
            while (!atomicReference.compareAndSet(null, u10) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        kotlin.jvm.internal.j.d(obj, "get(...)");
        return (i) obj;
    }

    public final boolean b() {
        Long l10 = a().e;
        Integer num = a().d;
        return l10 == null || num == null || this.a.a().c - l10.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        android.util.Log.w("FirebaseSessions", "Failed to update config values: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(i iVar, kd.c cVar) {
        p pVar;
        int i7;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i10 = pVar.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                pVar.c = i10 - TLObject.FLAG_31;
                Object obj = pVar.a;
                jd.a aVar = jd.a.a;
                i7 = pVar.c;
                if (i7 != 0) {
                    z.b(obj);
                    m1.g gVar = this.b;
                    c cVar2 = new c(iVar, null);
                    pVar.c = 1;
                    if (gVar.a(cVar2, pVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z.b(obj);
                }
                return gd.k.a;
            }
        }
        pVar = new p(this, cVar);
        Object obj2 = pVar.a;
        jd.a aVar2 = jd.a.a;
        i7 = pVar.c;
        if (i7 != 0) {
        }
        return gd.k.a;
    }
}
