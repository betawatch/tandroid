package db;

import android.util.Log;
import b8.ib;
import j$.util.Objects;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import x7.m5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e1 {
    public final gb.l a;
    public final u0 b;
    public final q0 c;
    public final i1 d;
    public final l1.g e;
    public final c0 f;
    public final fd.h g;
    public j0 h;
    public boolean i;
    public boolean j;
    public String k;

    public e1(gb.l sessionsSettings, u0 sessionGenerator, q0 sessionFirelogPublisher, i1 timeProvider, l1.g sessionDataStore, c0 processDataManager, fd.h backgroundDispatcher) {
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
        wd.b0.q(wd.b0.b(backgroundDispatcher), new a1(this, null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e1 e1Var, String str, b1 b1Var, fd.c cVar) {
        d1 d1Var;
        int i3;
        String str2;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i10 = d1Var.e;
            if ((i10 & TLObject.FLAG_31) != 0) {
                d1Var.e = i10 - TLObject.FLAG_31;
                Object obj = d1Var.c;
                gd.a aVar = gd.a.a;
                i3 = d1Var.e;
                if (i3 != 0) {
                    ib.b(obj);
                    if (kotlin.jvm.internal.j.a(e1Var.k, str)) {
                        return dd.k.a;
                    }
                    e1Var.k = str;
                    eb.c cVar2 = eb.c.a;
                    d1Var.a = str;
                    d1Var.b = b1Var;
                    d1Var.e = 1;
                    obj = cVar2.b(d1Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b1Var = d1Var.b;
                    str = d1Var.a;
                    ib.b(obj);
                }
                for (z9.i iVar : ((Map) obj).values()) {
                    eb.e eVar = new eb.e(str);
                    iVar.getClass();
                    String str3 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    z9.h hVar = iVar.b;
                    synchronized (hVar) {
                        if (!Objects.equals(hVar.c, str)) {
                            z9.h.a(hVar.a, hVar.b, str);
                            hVar.c = str;
                        }
                    }
                    int ordinal = b1Var.ordinal();
                    if (ordinal == 0) {
                        str2 = "Notified " + eb.d.a + " of new session " + str;
                    } else {
                        if (ordinal != 1) {
                            throw new androidx.car.app.j();
                        }
                        str2 = "Notified " + eb.d.a + " of new fallback session " + str;
                    }
                    Log.d("FirebaseSessions", str2);
                }
                return dd.k.a;
            }
        }
        d1Var = new d1(e1Var, cVar);
        Object obj2 = d1Var.c;
        gd.a aVar2 = gd.a.a;
        i3 = d1Var.e;
        if (i3 != 0) {
        }
        while (r4.hasNext()) {
        }
        return dd.k.a;
    }

    public final void b() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        wd.b0.q(wd.b0.b(this.g), new a1(this, null, 1));
    }

    public final void c() {
        this.i = true;
        j0 j0Var = this.h;
        if (j0Var == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        fd.c cVar = null;
        if (j0Var == null) {
            kotlin.jvm.internal.j.h("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (e(j0Var) || d(j0Var)) {
            wd.b0.q(wd.b0.b(this.g), new ae.d(this, j0Var, cVar, 4));
        }
    }

    public final boolean d(j0 j0Var) {
        Map map = j0Var.c;
        boolean z10 = true;
        c0 c0Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + c0Var.a());
            return true;
        }
        c0Var.getClass();
        a0 a0Var = (a0) map.get(c0Var.a());
        if (a0Var != null && a0Var.a == c0Var.c && kotlin.jvm.internal.j.a(a0Var.b, (String) c0Var.d.getValue())) {
            z10 = false;
        }
        if (z10) {
            Log.d("FirebaseSessions", "Process " + c0Var.a() + " is stale");
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (vd.a.c(r9) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (vd.a.c(r9) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(j0 j0Var) {
        long c2;
        h1 h1Var = j0Var.b;
        n0 n0Var = j0Var.a;
        if (h1Var == null) {
            Log.d("FirebaseSessions", "Session " + n0Var.a + " has not backgrounded yet");
            return false;
        }
        h1 a10 = this.d.a();
        int i3 = vd.a.d;
        long d = m5.d(a10.a - h1Var.a, vd.c.c);
        gb.l lVar = this.a;
        vd.a c10 = lVar.a.c();
        if (c10 != null) {
            c2 = c10.a;
            if (c2 > 0) {
            }
        }
        vd.a c11 = lVar.b.c();
        if (c11 != null) {
            c2 = c11.a;
            if (c2 > 0) {
            }
        }
        c2 = m5.c(30, vd.c.e);
        boolean z10 = vd.a.b(d, c2) > 0;
        if (z10) {
            Log.d("FirebaseSessions", "Session " + n0Var.a + " is expired");
        }
        return z10;
    }
}
