package bb;

import ae.c1;
import ae.e0;
import ae.e2;
import ae.g0;
import ae.o0;
import ae.v;
import ae.y;
import ae.y0;
import java.util.concurrent.locks.LockSupport;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class l {
    public static final n1.d c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f a;
    public e b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(k1.f fVar) {
        jd.h hVar;
        this.a = fVar;
        p iVar = new i(this, 0 == true ? 1 : 0, 0);
        Thread currentThread = Thread.currentThread();
        y0 a2 = e2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, y.d)).booleanValue();
        if (booleanValue) {
            jd.i iVar2 = jd.i.a;
            hVar = (jd.h) (booleanValue ? a2.fold(iVar2, y.c) : a2);
            iVar2.plus(hVar);
        } else {
            hVar = a2;
        }
        he.e eVar = o0.a;
        if (hVar != eVar && hVar.get(jd.d.a) == null) {
            hVar = hVar.plus(eVar);
        }
        ae.h hVar2 = new ae.h(hVar, currentThread, a2);
        hVar2.L(e0.a, hVar2, iVar);
        y0 y0Var = hVar2.e;
        if (y0Var != null) {
            int i10 = y0.f;
            y0Var.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                long i11 = y0Var != null ? y0Var.i() : Long.MAX_VALUE;
                if (!(hVar2.u() instanceof c1)) {
                    if (y0Var != null) {
                        int i12 = y0.f;
                        y0Var.f(false);
                    }
                    Object u10 = g0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar != null) {
                        throw vVar.a;
                    }
                    return;
                }
                LockSupport.parkNanos(hVar2, i11);
            } catch (Throwable th2) {
                if (y0Var != null) {
                    int i13 = y0.f;
                    y0Var.f(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar2.i(interruptedException);
        throw interruptedException;
    }

    public static final void a(l lVar, n1.b bVar) {
        lVar.getClass();
        lVar.b = new e((Boolean) bVar.a(c), (Double) bVar.a(d), (Integer) bVar.a(e), (Integer) bVar.a(f), (Long) bVar.a(g));
    }

    public final boolean b() {
        e eVar = this.b;
        if (eVar == null) {
            kotlin.jvm.internal.i.h("sessionConfigs");
            throw null;
        }
        Long l4 = eVar.e;
        if (eVar != null) {
            Integer num = eVar.d;
            return l4 == null || num == null || (System.currentTimeMillis() - l4.longValue()) / ((long) MediaDataController.MAX_STYLE_RUNS_COUNT) >= ((long) num.intValue());
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
    public final Object c(n1.d dVar, Object obj, ld.c cVar) {
        j jVar;
        int i10;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i11 = jVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                jVar.c = i11 - TLObject.FLAG_31;
                Object obj2 = jVar.a;
                kd.a aVar = kd.a.a;
                i10 = jVar.c;
                if (i10 != 0) {
                    a8.b(obj2);
                    k1.f fVar = this.a;
                    k kVar = new k(obj, dVar, this, null);
                    jVar.c = 1;
                    if (fVar.c(new n1.c(kVar, null, 1), jVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a8.b(obj2);
                }
                return hd.i.a;
            }
        }
        jVar = new j(this, cVar);
        Object obj22 = jVar.a;
        kd.a aVar2 = kd.a.a;
        i10 = jVar.c;
        if (i10 != 0) {
        }
        return hd.i.a;
    }
}
