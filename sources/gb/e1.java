package gb;

import android.util.Log;
import c8.ie;
import j$.util.Objects;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class e1 {
    public final jb.l a;
    public final v0 b;
    public final r0 c;
    public final i1 d;
    public final m1.g e;
    public final e0 f;
    public final id.h g;
    public k0 h;
    public boolean i;
    public boolean j;
    public String k;

    public e1(jb.l sessionsSettings, v0 sessionGenerator, r0 sessionFirelogPublisher, i1 timeProvider, m1.g sessionDataStore, e0 processDataManager, id.h backgroundDispatcher) {
        kotlin.jvm.internal.j.e(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.j.e(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.j.e(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.j.e(processDataManager, "processDataManager");
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        this.a = sessionsSettings;
        this.b = sessionGenerator;
        this.c = sessionFirelogPublisher;
        this.d = timeProvider;
        this.e = sessionDataStore;
        this.f = processDataManager;
        this.g = backgroundDispatcher;
        b1 b1Var = b1.a;
        this.k = "";
        zd.b0.q(zd.b0.b(backgroundDispatcher), new a1(this, null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e1 e1Var, String str, b1 b1Var, id.c cVar) {
        d1 d1Var;
        int i7;
        String str2;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i10 = d1Var.e;
            if ((i10 & TLObject.FLAG_31) != 0) {
                d1Var.e = i10 - TLObject.FLAG_31;
                Object obj = d1Var.c;
                jd.a aVar = jd.a.a;
                i7 = d1Var.e;
                if (i7 != 0) {
                    c8.z.b(obj);
                    if (kotlin.jvm.internal.j.a(e1Var.k, str)) {
                        return gd.k.a;
                    }
                    e1Var.k = str;
                    hb.c cVar2 = hb.c.a;
                    d1Var.a = str;
                    d1Var.b = b1Var;
                    d1Var.e = 1;
                    obj = cVar2.b(d1Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b1Var = d1Var.b;
                    str = d1Var.a;
                    c8.z.b(obj);
                }
                for (aa.j jVar : ((Map) obj).values()) {
                    hb.e eVar = new hb.e(str);
                    jVar.getClass();
                    String str3 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    aa.i iVar = jVar.b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.c, str)) {
                            aa.i.a(iVar.a, iVar.b, str);
                            iVar.c = str;
                        }
                    }
                    int ordinal = b1Var.ordinal();
                    if (ordinal == 0) {
                        str2 = "Notified " + hb.d.a + " of new session " + str;
                    } else {
                        if (ordinal != 1) {
                            throw new androidx.car.app.j();
                        }
                        str2 = "Notified " + hb.d.a + " of new fallback session " + str;
                    }
                    Log.d("FirebaseSessions", str2);
                }
                return gd.k.a;
            }
        }
        d1Var = new d1(e1Var, cVar);
        Object obj2 = d1Var.c;
        jd.a aVar2 = jd.a.a;
        i7 = d1Var.e;
        if (i7 != 0) {
        }
        while (r4.hasNext()) {
        }
        return gd.k.a;
    }

    public final void b() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        zd.b0.q(zd.b0.b(this.g), new a1(this, null, 1));
    }

    public final void c() {
        this.i = true;
        k0 k0Var = this.h;
        if (k0Var == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        id.c cVar = null;
        if (k0Var == null) {
            kotlin.jvm.internal.j.h("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (e(k0Var) || d(k0Var)) {
            zd.b0.q(zd.b0.b(this.g), new be.l(this, k0Var, cVar, 5));
        }
    }

    public final boolean d(k0 k0Var) {
        Map map = k0Var.c;
        boolean z10 = true;
        e0 e0Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + e0Var.a());
            return true;
        }
        e0Var.getClass();
        c0 c0Var = (c0) map.get(e0Var.a());
        if (c0Var != null && c0Var.a == e0Var.c && kotlin.jvm.internal.j.a(c0Var.b, (String) e0Var.d.getValue())) {
            z10 = false;
        }
        if (z10) {
            Log.d("FirebaseSessions", "Process " + e0Var.a() + " is stale");
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (yd.a.c(r9) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (yd.a.c(r9) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(k0 k0Var) {
        long c10;
        h1 h1Var = k0Var.b;
        o0 o0Var = k0Var.a;
        if (h1Var == null) {
            Log.d("FirebaseSessions", "Session " + o0Var.a + " has not backgrounded yet");
            return false;
        }
        h1 a10 = this.d.a();
        int i7 = yd.a.d;
        long d = ie.d(a10.a - h1Var.a, yd.c.c);
        jb.l lVar = this.a;
        yd.a c11 = lVar.a.c();
        if (c11 != null) {
            c10 = c11.a;
            if (c10 > 0) {
            }
        }
        yd.a c12 = lVar.b.c();
        if (c12 != null) {
            c10 = c12.a;
            if (c10 > 0) {
            }
        }
        c10 = ie.c(30, yd.c.e);
        boolean z10 = yd.a.b(d, c10) > 0;
        if (z10) {
            Log.d("FirebaseSessions", "Session " + o0Var.a + " is expired");
        }
        return z10;
    }
}
