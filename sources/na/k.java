package na;

import dd.p;
import java.util.concurrent.locks.LockSupport;
import k7.p7;
import ld.a1;
import ld.c2;
import ld.d0;
import ld.e0;
import ld.m0;
import ld.v;
import ld.w0;
import ld.x;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class k {
    public static final n1.d c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.g a;
    public e b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(k1.g gVar) {
        uc.h hVar;
        this.a = gVar;
        p cVar = new k1.c((Object) this, (uc.c) (0 == true ? 1 : 0), 6);
        Thread currentThread = Thread.currentThread();
        w0 a2 = c2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (booleanValue) {
            uc.i iVar = uc.i.a;
            hVar = (uc.h) (booleanValue ? a2.fold(iVar, x.c) : a2);
            iVar.plus(hVar);
        } else {
            hVar = a2;
        }
        sd.e eVar = m0.a;
        if (hVar != eVar && hVar.get(uc.d.a) == null) {
            hVar = hVar.plus(eVar);
        }
        ld.h hVar2 = new ld.h(hVar, currentThread, a2);
        hVar2.L(d0.a, hVar2, cVar);
        w0 w0Var = hVar2.e;
        if (w0Var != null) {
            int i10 = w0.f;
            w0Var.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                long i11 = w0Var != null ? w0Var.i() : Long.MAX_VALUE;
                if (!(hVar2.u() instanceof a1)) {
                    if (w0Var != null) {
                        int i12 = w0.f;
                        w0Var.f(false);
                    }
                    Object u10 = e0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar != null) {
                        throw vVar.a;
                    }
                    return;
                }
                LockSupport.parkNanos(hVar2, i11);
            } catch (Throwable th2) {
                if (w0Var != null) {
                    int i13 = w0.f;
                    w0Var.f(false);
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
            kotlin.jvm.internal.j.h("sessionConfigs");
            throw null;
        }
        Long l10 = eVar.e;
        if (eVar != null) {
            Integer num = eVar.d;
            return l10 == null || num == null || (System.currentTimeMillis() - l10.longValue()) / ((long) MediaDataController.MAX_STYLE_RUNS_COUNT) >= ((long) num.intValue());
        }
        kotlin.jvm.internal.j.h("sessionConfigs");
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
    public final Object c(n1.d dVar, Object obj, wc.c cVar) {
        i iVar;
        int i10;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i11 = iVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                iVar.c = i11 - TLObject.FLAG_31;
                Object obj2 = iVar.a;
                vc.a aVar = vc.a.a;
                i10 = iVar.c;
                if (i10 != 0) {
                    p7.b(obj2);
                    k1.g gVar = this.a;
                    j jVar = new j(obj, dVar, this, null);
                    iVar.c = 1;
                    if (gVar.B(new n1.c(jVar, null, 1), iVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p7.b(obj2);
                }
                return sc.i.a;
            }
        }
        iVar = new i(this, cVar);
        Object obj22 = iVar.a;
        vc.a aVar2 = vc.a.a;
        i10 = iVar.c;
        if (i10 != 0) {
        }
        return sc.i.a;
    }
}
