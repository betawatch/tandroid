// default package

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fga {
    public final k7a a;
    public final h6a b;
    public final g6a c;
    public final snb d;
    public final v63 e;
    public final xk8 f;
    public final sw2 g;
    public w5a h;
    public boolean i;
    public boolean j;
    public String k;

    public fga(k7a k7aVar, h6a h6aVar, g6a g6aVar, snb snbVar, v63 v63Var, xk8 xk8Var, sw2 sw2Var) {
        k7aVar.getClass();
        h6aVar.getClass();
        g6aVar.getClass();
        snbVar.getClass();
        v63Var.getClass();
        xk8Var.getClass();
        sw2Var.getClass();
        this.a = k7aVar;
        this.b = h6aVar;
        this.c = g6aVar;
        this.d = snbVar;
        this.e = v63Var;
        this.f = xk8Var;
        this.g = sw2Var;
        this.k = "";
        ppd.b(h9e.a(sw2Var), new bga(this, null, (byte) 0));
    }

    public final void a() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        ppd.b(h9e.a(this.g), new bga(this, null, (byte) 1));
    }

    public final void b() {
        byte b = 1;
        this.i = true;
        w5a w5aVar = this.h;
        if (w5aVar == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        fw2 fw2Var = null;
        if (w5aVar == null) {
            rp5.e("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (d(w5aVar) || c(w5aVar)) {
            ppd.b(h9e.a(this.g), new eh4(this, w5aVar, fw2Var, b));
        }
    }

    public final boolean c(w5a w5aVar) {
        Map map = w5aVar.c;
        boolean z = true;
        xk8 xk8Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + xk8Var.a());
            return true;
        }
        xk8Var.getClass();
        vk8 vk8Var = (vk8) map.get(xk8Var.a());
        if (vk8Var != null && vk8Var.a == xk8Var.c && rp5.a(vk8Var.b, (String) xk8Var.d.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + xk8Var.a() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (jr3.c(r8) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (jr3.c(r8) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(w5a w5aVar) {
        long c;
        onb onbVar = w5aVar.b;
        a6a a6aVar = w5aVar.a;
        if (onbVar == null) {
            Log.d("FirebaseSessions", "Session " + a6aVar.a + " has not backgrounded yet");
            return false;
        }
        this.d.getClass();
        onb a = snb.a();
        int i = jr3.d;
        long d = vee.d(a.a - onbVar.a, nr3.c);
        k7a k7aVar = this.a;
        jr3 c2 = k7aVar.a.c();
        if (c2 != null) {
            c = c2.a;
            if (c > 0) {
            }
        }
        jr3 c3 = k7aVar.b.c();
        if (c3 != null) {
            c = c3.a;
            if (c > 0) {
            }
        }
        c = vee.c(30, nr3.e);
        boolean z = jr3.b(d, c) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + a6aVar.a + " is expired");
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cga cgaVar, fw2 fw2Var) {
        ega egaVar;
        int i;
        String str2;
        if (fw2Var instanceof ega) {
            egaVar = (ega) fw2Var;
            int i2 = egaVar.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                egaVar.e = i2 - TLObject.FLAG_31;
                Object obj = egaVar.c;
                bx2 bx2Var = bx2.a;
                i = egaVar.e;
                if (i != 0) {
                    qse.b(obj);
                    if (rp5.a(this.k, str)) {
                        return g5c.a;
                    }
                    this.k = str;
                    lh4 lh4Var = lh4.a;
                    egaVar.a = str;
                    egaVar.b = cgaVar;
                    egaVar.e = 1;
                    obj = lh4Var.b(egaVar);
                    if (obj == bx2Var) {
                        return bx2Var;
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cgaVar = egaVar.b;
                    str = egaVar.a;
                    qse.b(obj);
                }
                for (zx2 zx2Var : ((Map) obj).values()) {
                    r6a r6aVar = new r6a(str);
                    zx2Var.getClass();
                    String str3 = "App Quality Sessions session changed: " + r6aVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    mv6 mv6Var = zx2Var.b;
                    synchronized (mv6Var) {
                        if (!Objects.equals((String) mv6Var.d, str)) {
                            mv6.a0((jb4) mv6Var.b, (String) mv6Var.c, str);
                            mv6Var.d = str;
                        }
                    }
                    int ordinal = cgaVar.ordinal();
                    if (ordinal == 0) {
                        str2 = "Notified " + q6a.a + " of new session " + str;
                    } else {
                        if (ordinal != 1) {
                            throw new gp2();
                        }
                        str2 = "Notified " + q6a.a + " of new fallback session " + str;
                    }
                    Log.d("FirebaseSessions", str2);
                }
                return g5c.a;
            }
        }
        egaVar = new ega(this, fw2Var);
        Object obj2 = egaVar.c;
        bx2 bx2Var2 = bx2.a;
        i = egaVar.e;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return g5c.a;
    }
}
