package ja;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import h7.j8;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
            Object b10 = u8.g.c().b(m0.class);
            kotlin.jvm.internal.j.d(b10, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((m0) b10).b().a);
            return;
        }
        Object b11 = u8.g.c().b(t.class);
        kotlin.jvm.internal.j.d(b11, "Firebase.app[SessionDatastore::class.java]");
        n nVar = (n) ((c0) ((t) b11)).c.get();
        String str = nVar != null ? nVar.a : null;
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        Object b10 = u8.g.c().b(m0.class);
        kotlin.jvm.internal.j.d(b10, "Firebase.app[SessionGenerator::class.java]");
        m0 m0Var = (m0) b10;
        int i10 = m0Var.d + 1;
        m0Var.d = i10;
        String a2 = i10 == 0 ? m0Var.c : m0Var.a();
        String str = m0Var.c;
        int i11 = m0Var.d;
        m0Var.a.getClass();
        m0Var.e = new d0(i11, System.currentTimeMillis() * 1000, a2, str);
        m0Var.b();
        StringBuilder sb2 = new StringBuilder("Generated new session ");
        Object b11 = u8.g.c().b(m0.class);
        kotlin.jvm.internal.j.d(b11, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((m0) b11).b().a);
        Log.d("SessionLifecycleService", sb2.toString());
        StringBuilder sb3 = new StringBuilder("Broadcasting new session: ");
        Object b12 = u8.g.c().b(m0.class);
        kotlin.jvm.internal.j.d(b12, "Firebase.app[SessionGenerator::class.java]");
        sb3.append(((m0) b12).b());
        Log.d("SessionLifecycleService", sb3.toString());
        Object b13 = u8.g.c().b(g0.class);
        kotlin.jvm.internal.j.d(b13, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object b14 = u8.g.c().b(m0.class);
        kotlin.jvm.internal.j.d(b14, "Firebase.app[SessionGenerator::class.java]");
        k0 k0Var = (k0) ((g0) b13);
        sc.c cVar = null;
        jd.e0.q(jd.e0.b(k0Var.e), new i0(k0Var, ((m0) b14).b(), null));
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Messenger it = (Messenger) obj;
            kotlin.jvm.internal.j.d(it, "it");
            a(it);
        }
        Object b15 = u8.g.c().b(t.class);
        kotlin.jvm.internal.j.d(b15, "Firebase.app[SessionDatastore::class.java]");
        Object b16 = u8.g.c().b(m0.class);
        kotlin.jvm.internal.j.d(b16, "Firebase.app[SessionGenerator::class.java]");
        String sessionId = ((m0) b16).b().a;
        c0 c0Var = (c0) ((t) b15);
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        jd.e0.q(jd.e0.b(c0Var.b), new l(c0Var, sessionId, cVar, 1));
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
    
        if (id.a.b(r9) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0153, code lost:
    
        if (id.a.b(r9) == false) goto L44;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message msg) {
        long a2;
        kotlin.jvm.internal.j.e(msg, "msg");
        if (this.b > msg.getWhen()) {
            Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.b + '.');
            return;
        }
        int i10 = msg.what;
        if (i10 != 1) {
            if (i10 == 2) {
                Log.d("SessionLifecycleService", "Activity backgrounding at " + msg.getWhen());
                this.b = msg.getWhen();
                return;
            }
            if (i10 != 4) {
                Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
                super.handleMessage(msg);
                return;
            }
            Messenger messenger = msg.replyTo;
            ArrayList arrayList = this.c;
            arrayList.add(messenger);
            Messenger messenger2 = msg.replyTo;
            kotlin.jvm.internal.j.d(messenger2, "msg.replyTo");
            a(messenger2);
            Log.d("SessionLifecycleService", "Client " + msg.replyTo + " bound at " + msg.getWhen() + ". Clients: " + arrayList.size());
            return;
        }
        Log.d("SessionLifecycleService", "Activity foregrounding at " + msg.getWhen() + '.');
        if (this.a) {
            long when = msg.getWhen() - this.b;
            la.h.c.getClass();
            Object b10 = u8.g.c().b(la.h.class);
            kotlin.jvm.internal.j.d(b10, "Firebase.app[SessionsSettings::class.java]");
            la.h hVar = (la.h) b10;
            Bundle bundle = (Bundle) hVar.a.b;
            id.a aVar = null;
            id.a aVar2 = bundle.containsKey("firebase_sessions_sessions_restart_timeout") ? new id.a(j8.a(bundle.getInt("firebase_sessions_sessions_restart_timeout"), id.c.d)) : null;
            if (aVar2 != null) {
                a2 = aVar2.a;
                int i11 = id.a.d;
                if (a2 > 0) {
                }
            }
            la.e eVar = hVar.b.c.b;
            if (eVar == null) {
                kotlin.jvm.internal.j.h("sessionConfigs");
                throw null;
            }
            Integer num = eVar.c;
            if (num != null) {
                int i12 = id.a.d;
                aVar = new id.a(j8.a(num.intValue(), id.c.d));
            }
            if (aVar != null) {
                a2 = aVar.a;
                int i13 = id.a.d;
                if (a2 > 0) {
                }
            }
            int i14 = id.a.d;
            a2 = j8.a(30, id.c.e);
            if (when > (((((int) a2) & 1) != 1 || id.a.b(a2)) ? id.a.c(a2, id.c.c) : a2 >> 1)) {
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
