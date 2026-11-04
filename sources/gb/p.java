package gb;

import b8.ib;
import db.i1;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;
import wd.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p {
    public final i1 a;
    public final l1.g b;
    public final AtomicReference c;

    public p(fd.h backgroundDispatcher, i1 timeProvider, l1.g sessionConfigsDataStore) {
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.a = timeProvider;
        this.b = sessionConfigsDataStore;
        this.c = new AtomicReference();
        b0.q(b0.b(backgroundDispatcher), new n(this, null, 0));
    }

    public final i a() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object u10 = b0.u(new n(this, null, 1));
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
    public final Object c(i iVar, hd.c cVar) {
        o oVar;
        int i3;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                oVar.c = i10 - TLObject.FLAG_31;
                Object obj = oVar.a;
                gd.a aVar = gd.a.a;
                i3 = oVar.c;
                if (i3 != 0) {
                    ib.b(obj);
                    l1.g gVar = this.b;
                    c cVar2 = new c(iVar, null);
                    oVar.c = 1;
                    if (gVar.a(cVar2, oVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return dd.k.a;
            }
        }
        oVar = new o(this, cVar);
        Object obj2 = oVar.a;
        gd.a aVar2 = gd.a.a;
        i3 = oVar.c;
        if (i3 != 0) {
        }
        return dd.k.a;
    }
}
