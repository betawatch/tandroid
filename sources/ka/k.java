package ka;

import ad.p;
import h7.k6;
import ia.m;
import id.b1;
import id.d0;
import id.d2;
import id.f0;
import id.n0;
import id.v;
import id.x;
import id.x0;
import java.util.concurrent.locks.LockSupport;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k {
    public static final n1.e c = new n1.e("firebase_sessions_enabled");
    public static final n1.e d = new n1.e("firebase_sessions_sampling_rate");
    public static final n1.e e = new n1.e("firebase_sessions_restart_timeout");
    public static final n1.e f = new n1.e("firebase_sessions_cache_duration");
    public static final n1.e g = new n1.e("firebase_sessions_cache_updated_time");
    public final k1.f a;
    public e b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(k1.f fVar) {
        rc.h hVar;
        this.a = fVar;
        p mVar = new m(this, 0 == true ? 1 : 0, 6);
        Thread currentThread = Thread.currentThread();
        x0 a2 = d2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (booleanValue) {
            rc.i iVar = rc.i.a;
            hVar = (rc.h) (booleanValue ? a2.fold(iVar, x.c) : a2);
            iVar.plus(hVar);
        } else {
            hVar = a2;
        }
        pd.e eVar = n0.a;
        if (hVar != eVar && hVar.get(rc.d.a) == null) {
            hVar = hVar.plus(eVar);
        }
        id.h hVar2 = new id.h(hVar, currentThread, a2);
        hVar2.L(d0.a, hVar2, mVar);
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
            } catch (Throwable th) {
                if (x0Var != null) {
                    int i13 = x0.f;
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
    public final Object c(n1.e eVar, Object obj, tc.c cVar) {
        i iVar;
        int i10;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i11 = iVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                iVar.c = i11 - TLObject.FLAG_31;
                Object obj2 = iVar.a;
                sc.a aVar = sc.a.a;
                i10 = iVar.c;
                if (i10 != 0) {
                    k6.b(obj2);
                    k1.f fVar = this.a;
                    j jVar = new j(obj, eVar, this, null);
                    iVar.c = 1;
                    if (fVar.c(new n1.c(jVar, null, 1), iVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj2);
                }
                return pc.i.a;
            }
        }
        iVar = new i(this, cVar);
        Object obj22 = iVar.a;
        sc.a aVar2 = sc.a.a;
        i10 = iVar.c;
        if (i10 != 0) {
        }
        return pc.i.a;
    }
}
