package ha;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import f7.r7;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p0 extends Handler {
    public boolean a;
    public long b;
    public final ArrayList c;

    public p0(Looper looper) {
        super(looper);
        this.c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        if (this.a) {
            Object b10 = s8.h.c().b(m0.class);
            kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((m0) b10).b().a);
            return;
        }
        Object b11 = s8.h.c().b(t.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionDatastore::class.java]");
        n nVar = (n) ((c0) ((t) b11)).c.get();
        String str = nVar != null ? nVar.a : null;
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        Object b10 = s8.h.c().b(m0.class);
        kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
        m0 m0Var = (m0) b10;
        int i9 = m0Var.d + 1;
        m0Var.d = i9;
        String a2 = i9 == 0 ? m0Var.c : m0Var.a();
        String str = m0Var.c;
        int i10 = m0Var.d;
        m0Var.a.getClass();
        m0Var.e = new d0(i10, System.currentTimeMillis() * 1000, a2, str);
        m0Var.b();
        StringBuilder sb2 = new StringBuilder("Generated new session ");
        Object b11 = s8.h.c().b(m0.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((m0) b11).b().a);
        Log.d("SessionLifecycleService", sb2.toString());
        StringBuilder sb3 = new StringBuilder("Broadcasting new session: ");
        Object b12 = s8.h.c().b(m0.class);
        kotlin.jvm.internal.i.d(b12, "Firebase.app[SessionGenerator::class.java]");
        sb3.append(((m0) b12).b());
        Log.d("SessionLifecycleService", sb3.toString());
        Object b13 = s8.h.c().b(g0.class);
        kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object b14 = s8.h.c().b(m0.class);
        kotlin.jvm.internal.i.d(b14, "Firebase.app[SessionGenerator::class.java]");
        k0 k0Var = (k0) ((g0) b13);
        qc.c cVar = null;
        hd.f0.q(hd.f0.b(k0Var.e), new i0(k0Var, ((m0) b14).b(), null));
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Messenger it = (Messenger) obj;
            kotlin.jvm.internal.i.d(it, "it");
            a(it);
        }
        Object b15 = s8.h.c().b(t.class);
        kotlin.jvm.internal.i.d(b15, "Firebase.app[SessionDatastore::class.java]");
        Object b16 = s8.h.c().b(m0.class);
        kotlin.jvm.internal.i.d(b16, "Firebase.app[SessionGenerator::class.java]");
        String sessionId = ((m0) b16).b().a;
        c0 c0Var = (c0) ((t) b15);
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        hd.f0.q(hd.f0.b(c0Var.b), new l(c0Var, sessionId, cVar, 1));
    }

    public final void c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.c.remove(messenger);
        } catch (Exception e10) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0124, code lost:
    
        if (gd.a.b(r9) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0153, code lost:
    
        if (gd.a.b(r9) == false) goto L44;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message msg) {
        long a2;
        kotlin.jvm.internal.i.e(msg, "msg");
        if (this.b > msg.getWhen()) {
            Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.b + '.');
            return;
        }
        int i9 = msg.what;
        if (i9 != 1) {
            if (i9 == 2) {
                Log.d("SessionLifecycleService", "Activity backgrounding at " + msg.getWhen());
                this.b = msg.getWhen();
                return;
            }
            if (i9 != 4) {
                Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
                super.handleMessage(msg);
                return;
            }
            Messenger messenger = msg.replyTo;
            ArrayList arrayList = this.c;
            arrayList.add(messenger);
            Messenger messenger2 = msg.replyTo;
            kotlin.jvm.internal.i.d(messenger2, "msg.replyTo");
            a(messenger2);
            Log.d("SessionLifecycleService", "Client " + msg.replyTo + " bound at " + msg.getWhen() + ". Clients: " + arrayList.size());
            return;
        }
        Log.d("SessionLifecycleService", "Activity foregrounding at " + msg.getWhen() + '.');
        if (this.a) {
            long when = msg.getWhen() - this.b;
            ja.h.c.getClass();
            Object b10 = s8.h.c().b(ja.h.class);
            kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionsSettings::class.java]");
            ja.h hVar = (ja.h) b10;
            Bundle bundle = (Bundle) hVar.a.b;
            gd.a aVar = null;
            gd.a aVar2 = bundle.containsKey("firebase_sessions_sessions_restart_timeout") ? new gd.a(r7.a(bundle.getInt("firebase_sessions_sessions_restart_timeout"), gd.c.d)) : null;
            if (aVar2 != null) {
                a2 = aVar2.a;
                int i10 = gd.a.d;
                if (a2 > 0) {
                }
            }
            ja.e eVar = hVar.b.c.b;
            if (eVar == null) {
                kotlin.jvm.internal.i.h("sessionConfigs");
                throw null;
            }
            Integer num = eVar.c;
            if (num != null) {
                int i11 = gd.a.d;
                aVar = new gd.a(r7.a(num.intValue(), gd.c.d));
            }
            if (aVar != null) {
                a2 = aVar.a;
                int i12 = gd.a.d;
                if (a2 > 0) {
                }
            }
            int i13 = gd.a.d;
            a2 = r7.a(30, gd.c.e);
            if (when > (((((int) a2) & 1) != 1 || gd.a.b(a2)) ? gd.a.c(a2, gd.c.c) : a2 >> 1)) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                b();
            }
        } else {
            Log.d("SessionLifecycleService", "Cold start detected.");
            this.a = true;
            b();
        }
        this.b = msg.getWhen();
    }
}
