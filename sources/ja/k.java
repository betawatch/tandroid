package ja;

import g7.y5;
import ha.l;
import hd.b1;
import hd.d0;
import hd.d2;
import hd.f0;
import hd.n0;
import hd.v;
import hd.x;
import hd.x0;
import java.util.concurrent.locks.LockSupport;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k {
    public static final n1.d c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f a;
    public e b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(k1.f fVar) {
        qc.h hVar;
        this.a = fVar;
        p lVar = new l(this, 0 == true ? 1 : 0, 3);
        Thread currentThread = Thread.currentThread();
        x0 a2 = d2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (booleanValue) {
            qc.i iVar = qc.i.a;
            hVar = (qc.h) (booleanValue ? a2.fold(iVar, x.c) : a2);
            iVar.plus(hVar);
        } else {
            hVar = a2;
        }
        od.e eVar = n0.a;
        if (hVar != eVar && hVar.get(qc.d.a) == null) {
            hVar = hVar.plus(eVar);
        }
        hd.h hVar2 = new hd.h(hVar, currentThread, a2);
        hVar2.L(d0.a, hVar2, lVar);
        x0 x0Var = hVar2.e;
        if (x0Var != null) {
            int i9 = x0.f;
            x0Var.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                long i10 = x0Var != null ? x0Var.i() : Long.MAX_VALUE;
                if (!(hVar2.u() instanceof b1)) {
                    if (x0Var != null) {
                        int i11 = x0.f;
                        x0Var.f(false);
                    }
                    Object u10 = f0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar != null) {
                        throw vVar.a;
                    }
                    return;
                }
                LockSupport.parkNanos(hVar2, i10);
            } catch (Throwable th) {
                if (x0Var != null) {
                    int i12 = x0.f;
                    x0Var.f(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar2.i(interruptedException);
        throw interruptedException;
    }

    public static final void a(k kVar, n1.b bVar) {
        kVar.getClass();
        kVar.b = new e((Boolean) bVar.a(c), (Double) bVar.a(d), (Integer) bVar.a(e), (Integer) bVar.a(f), (Long) bVar.a(g));
    }

    public final boolean b() {
        e eVar = this.b;
        if (eVar == null) {
            kotlin.jvm.internal.i.h("sessionConfigs");
            throw null;
        }
        Long l10 = eVar.e;
        if (eVar != null) {
            Integer num = eVar.d;
            return l10 == null || num == null || (System.currentTimeMillis() - l10.longValue()) / ((long) MediaDataController.MAX_STYLE_RUNS_COUNT) >= ((long) num.intValue());
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(n1.d dVar, Object obj, sc.c cVar) {
        i iVar;
        int i9;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                iVar.c = i10 - TLObject.FLAG_31;
                Object obj2 = iVar.a;
                rc.a aVar = rc.a.a;
                i9 = iVar.c;
                if (i9 != 0) {
                    y5.b(obj2);
                    k1.f fVar = this.a;
                    j jVar = new j(obj, dVar, this, null);
                    iVar.c = 1;
                    if (fVar.e(new n1.c(jVar, null, 1), iVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj2);
                }
                return oc.i.a;
            }
        }
        iVar = new i(this, cVar);
        Object obj22 = iVar.a;
        rc.a aVar2 = rc.a.a;
        i9 = iVar.c;
        if (i9 != 0) {
        }
        return oc.i.a;
    }
}
