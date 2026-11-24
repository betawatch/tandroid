// default package

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hia {
    public final l9a a;
    public final j8a b;
    public final i8a c;
    public final tpb d;
    public final h83 e;
    public final zm8 f;
    public final cy2 g;
    public y7a h;
    public boolean i;
    public boolean j;
    public String k;

    public hia(l9a l9aVar, j8a j8aVar, i8a i8aVar, tpb tpbVar, h83 h83Var, zm8 zm8Var, cy2 cy2Var) {
        l9aVar.getClass();
        j8aVar.getClass();
        i8aVar.getClass();
        tpbVar.getClass();
        h83Var.getClass();
        zm8Var.getClass();
        cy2Var.getClass();
        this.a = l9aVar;
        this.b = j8aVar;
        this.c = i8aVar;
        this.d = tpbVar;
        this.e = h83Var;
        this.f = zm8Var;
        this.g = cy2Var;
        this.k = "";
        srd.b(ibe.a(cy2Var), new dia(this, null, (byte) 0));
    }

    public final void a() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        srd.b(ibe.a(this.g), new dia(this, null, (byte) 1));
    }

    public final void b() {
        byte b = 1;
        this.i = true;
        y7a y7aVar = this.h;
        if (y7aVar == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        px2 px2Var = null;
        if (y7aVar == null) {
            rr5.e("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (d(y7aVar) || c(y7aVar)) {
            srd.b(ibe.a(this.g), new gj4(this, y7aVar, px2Var, b));
        }
    }

    public final boolean c(y7a y7aVar) {
        Map map = y7aVar.c;
        boolean z = true;
        zm8 zm8Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + zm8Var.a());
            return true;
        }
        zm8Var.getClass();
        xm8 xm8Var = (xm8) map.get(zm8Var.a());
        if (xm8Var != null && xm8Var.a == zm8Var.c && rr5.a(xm8Var.b, (String) zm8Var.d.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + zm8Var.a() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (ts3.c(r8) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (ts3.c(r8) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(y7a y7aVar) {
        long c;
        ppb ppbVar = y7aVar.b;
        c8a c8aVar = y7aVar.a;
        if (ppbVar == null) {
            Log.d("FirebaseSessions", "Session " + c8aVar.a + " has not backgrounded yet");
            return false;
        }
        this.d.getClass();
        ppb a = tpb.a();
        int i = ts3.d;
        long d = wge.d(a.a - ppbVar.a, xs3.c);
        l9a l9aVar = this.a;
        ts3 c2 = l9aVar.a.c();
        if (c2 != null) {
            c = c2.a;
            if (c > 0) {
            }
        }
        ts3 c3 = l9aVar.b.c();
        if (c3 != null) {
            c = c3.a;
            if (c > 0) {
            }
        }
        c = wge.c(30, xs3.e);
        boolean z = ts3.b(d, c) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + c8aVar.a + " is expired");
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, eia eiaVar, px2 px2Var) {
        gia giaVar;
        int i;
        String str2;
        if (px2Var instanceof gia) {
            giaVar = (gia) px2Var;
            int i2 = giaVar.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                giaVar.e = i2 - TLObject.FLAG_31;
                Object obj = giaVar.c;
                ly2 ly2Var = ly2.a;
                i = giaVar.e;
                if (i != 0) {
                    tue.b(obj);
                    if (rr5.a(this.k, str)) {
                        return g7c.a;
                    }
                    this.k = str;
                    pj4 pj4Var = pj4.a;
                    giaVar.a = str;
                    giaVar.b = eiaVar;
                    giaVar.e = 1;
                    obj = pj4Var.b(giaVar);
                    if (obj == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eiaVar = giaVar.b;
                    str = giaVar.a;
                    tue.b(obj);
                }
                for (jz2 jz2Var : ((Map) obj).values()) {
                    t8a t8aVar = new t8a(str);
                    jz2Var.getClass();
                    String str3 = "App Quality Sessions session changed: " + t8aVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    mx6 mx6Var = jz2Var.b;
                    synchronized (mx6Var) {
                        if (!Objects.equals((String) mx6Var.d, str)) {
                            mx6.d0((jd4) mx6Var.b, (String) mx6Var.c, str);
                            mx6Var.d = str;
                        }
                    }
                    int ordinal = eiaVar.ordinal();
                    if (ordinal == 0) {
                        str2 = "Notified " + s8a.a + " of new session " + str;
                    } else {
                        if (ordinal != 1) {
                            throw new rq2();
                        }
                        str2 = "Notified " + s8a.a + " of new fallback session " + str;
                    }
                    Log.d("FirebaseSessions", str2);
                }
                return g7c.a;
            }
        }
        giaVar = new gia(this, px2Var);
        Object obj2 = giaVar.c;
        ly2 ly2Var2 = ly2.a;
        i = giaVar.e;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return g7c.a;
    }
}
