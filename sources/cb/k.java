package cb;

import ab.l;
import be.b1;
import be.d0;
import be.d2;
import be.f0;
import be.n0;
import be.v;
import be.x;
import be.x0;
import java.util.concurrent.locks.LockSupport;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        kd.h hVar;
        this.a = fVar;
        p lVar = new l(this, 0 == true ? 1 : 0, 3);
        Thread currentThread = Thread.currentThread();
        x0 a2 = d2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (booleanValue) {
            kd.i iVar = kd.i.a;
            hVar = (kd.h) (booleanValue ? a2.fold(iVar, x.c) : a2);
            iVar.plus(hVar);
        } else {
            hVar = a2;
        }
        ie.e eVar = n0.a;
        if (hVar != eVar && hVar.get(kd.d.a) == null) {
            hVar = hVar.plus(eVar);
        }
        be.h hVar2 = new be.h(hVar, currentThread, a2);
        hVar2.L(d0.a, hVar2, lVar);
        x0 x0Var = hVar2.e;
        if (x0Var != null) {
            int i10 = x0.f;
            x0Var.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                long i11 = x0Var != null ? x0Var.i() : Long.MAX_VALUE;
                if (!(hVar2.u() instanceof b1)) {
                    if (x0Var != null) {
                        int i12 = x0.f;
                        x0Var.f(false);
                    }
                    Object u10 = f0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar != null) {
                        throw vVar.a;
                    }
                    return;
                }
                LockSupport.parkNanos(hVar2, i11);
            } catch (Throwable th2) {
                if (x0Var != null) {
                    int i13 = x0.f;
                    x0Var.f(false);
                }
                throw th2;
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
    public final Object c(n1.d dVar, Object obj, md.c cVar) {
        i iVar;
        int i10;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i11 = iVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                iVar.c = i11 - TLObject.FLAG_31;
                Object obj2 = iVar.a;
                ld.a aVar = ld.a.a;
                i10 = iVar.c;
                if (i10 != 0) {
                    i8.b(obj2);
                    k1.f fVar = this.a;
                    j jVar = new j(obj, dVar, this, null);
                    iVar.c = 1;
                    if (fVar.a(new n1.c(jVar, null, 1), iVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj2);
                }
                return id.i.a;
            }
        }
        iVar = new i(this, cVar);
        Object obj22 = iVar.a;
        ld.a aVar2 = ld.a.a;
        i10 = iVar.c;
        if (i10 != 0) {
        }
        return id.i.a;
    }
}
