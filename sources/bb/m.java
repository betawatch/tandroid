package bb;

import java.util.concurrent.locks.LockSupport;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import rd.p;
import v7.t7;
import zd.a1;
import zd.c2;
import zd.d0;
import zd.e0;
import zd.m0;
import zd.v;
import zd.w0;
import zd.x;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class m {
    public static final n1.d c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f a;
    public f b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(k1.f fVar) {
        id.h hVar;
        this.a = fVar;
        p jVar = new j(this, 0 == true ? 1 : 0, 0);
        Thread currentThread = Thread.currentThread();
        w0 a2 = c2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (booleanValue) {
            id.i iVar = id.i.a;
            hVar = (id.h) (booleanValue ? a2.fold(iVar, x.c) : a2);
            iVar.plus(hVar);
        } else {
            hVar = a2;
        }
        ge.e eVar = m0.a;
        if (hVar != eVar && hVar.get(id.d.a) == null) {
            hVar = hVar.plus(eVar);
        }
        zd.h hVar2 = new zd.h(hVar, currentThread, a2);
        hVar2.L(d0.a, hVar2, jVar);
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

    public static final void a(m mVar, n1.b bVar) {
        mVar.getClass();
        mVar.b = new f((Boolean) bVar.a(c), (Double) bVar.a(d), (Integer) bVar.a(e), (Integer) bVar.a(f), (Long) bVar.a(g));
    }

    public final boolean b() {
        f fVar = this.b;
        if (fVar == null) {
            kotlin.jvm.internal.i.h("sessionConfigs");
            throw null;
        }
        Long l4 = fVar.e;
        if (fVar != null) {
            Integer num = fVar.d;
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
    public final Object c(n1.d dVar, Object obj, kd.c cVar) {
        k kVar;
        int i10;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i11 = kVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                kVar.c = i11 - TLObject.FLAG_31;
                Object obj2 = kVar.a;
                jd.a aVar = jd.a.a;
                i10 = kVar.c;
                if (i10 != 0) {
                    t7.b(obj2);
                    k1.f fVar = this.a;
                    l lVar = new l(obj, dVar, this, null);
                    kVar.c = 1;
                    if (fVar.h(new n1.c(lVar, null, 1), kVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj2);
                }
                return gd.i.a;
            }
        }
        kVar = new k(this, cVar);
        Object obj22 = kVar.a;
        jd.a aVar2 = jd.a.a;
        i10 = kVar.c;
        if (i10 != 0) {
        }
        return gd.i.a;
    }
}
