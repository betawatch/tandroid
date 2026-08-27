package ia;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import g7.t7;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q0 extends Handler {
    public boolean a;
    public long b;
    public final ArrayList c;

    public q0(Looper looper) {
        super(looper);
        this.c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        if (this.a) {
            Object b10 = t8.h.c().b(n0.class);
            kotlin.jvm.internal.j.d(b10, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((n0) b10).b().a);
            return;
        }
        Object b11 = t8.h.c().b(u.class);
        kotlin.jvm.internal.j.d(b11, "Firebase.app[SessionDatastore::class.java]");
        o oVar = (o) ((d0) ((u) b11)).c.get();
        String str = oVar != null ? oVar.a : null;
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        Object b10 = t8.h.c().b(n0.class);
        kotlin.jvm.internal.j.d(b10, "Firebase.app[SessionGenerator::class.java]");
        n0 n0Var = (n0) b10;
        int i10 = n0Var.d + 1;
        n0Var.d = i10;
        String a2 = i10 == 0 ? n0Var.c : n0Var.a();
        String str = n0Var.c;
        int i11 = n0Var.d;
        n0Var.a.getClass();
        n0Var.e = new e0(i11, System.currentTimeMillis() * 1000, a2, str);
        n0Var.b();
        StringBuilder sb2 = new StringBuilder("Generated new session ");
        Object b11 = t8.h.c().b(n0.class);
        kotlin.jvm.internal.j.d(b11, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((n0) b11).b().a);
        Log.d("SessionLifecycleService", sb2.toString());
        StringBuilder sb3 = new StringBuilder("Broadcasting new session: ");
        Object b12 = t8.h.c().b(n0.class);
        kotlin.jvm.internal.j.d(b12, "Firebase.app[SessionGenerator::class.java]");
        sb3.append(((n0) b12).b());
        Log.d("SessionLifecycleService", sb3.toString());
        Object b13 = t8.h.c().b(h0.class);
        kotlin.jvm.internal.j.d(b13, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object b14 = t8.h.c().b(n0.class);
        kotlin.jvm.internal.j.d(b14, "Firebase.app[SessionGenerator::class.java]");
        l0 l0Var = (l0) ((h0) b13);
        rc.c cVar = null;
        id.f0.q(id.f0.b(l0Var.e), new j0(l0Var, ((n0) b14).b(), null));
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
        Object b15 = t8.h.c().b(u.class);
        kotlin.jvm.internal.j.d(b15, "Firebase.app[SessionDatastore::class.java]");
        Object b16 = t8.h.c().b(n0.class);
        kotlin.jvm.internal.j.d(b16, "Firebase.app[SessionGenerator::class.java]");
        String sessionId = ((n0) b16).b().a;
        d0 d0Var = (d0) ((u) b15);
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        id.f0.q(id.f0.b(d0Var.b), new m(d0Var, sessionId, cVar, 1));
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
        } catch (Exception e9) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0122, code lost:
    
        if (hd.a.b(r9) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0151, code lost:
    
        if (hd.a.b(r9) == false) goto L44;
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
            ka.h.c.getClass();
            Object b10 = t8.h.c().b(ka.h.class);
            kotlin.jvm.internal.j.d(b10, "Firebase.app[SessionsSettings::class.java]");
            ka.h hVar = (ka.h) b10;
            Bundle bundle = hVar.a.a;
            hd.a aVar = null;
            hd.a aVar2 = bundle.containsKey("firebase_sessions_sessions_restart_timeout") ? new hd.a(t7.a(bundle.getInt("firebase_sessions_sessions_restart_timeout"), hd.c.d)) : null;
            if (aVar2 != null) {
                a2 = aVar2.a;
                int i11 = hd.a.d;
                if (a2 > 0) {
                }
            }
            ka.e eVar = hVar.b.c.b;
            if (eVar == null) {
                kotlin.jvm.internal.j.h("sessionConfigs");
                throw null;
            }
            Integer num = eVar.c;
            if (num != null) {
                int i12 = hd.a.d;
                aVar = new hd.a(t7.a(num.intValue(), hd.c.d));
            }
            if (aVar != null) {
                a2 = aVar.a;
                int i13 = hd.a.d;
                if (a2 > 0) {
                }
            }
            int i14 = hd.a.d;
            a2 = t7.a(30, hd.c.e);
            if (when > (((((int) a2) & 1) != 1 || hd.a.b(a2)) ? hd.a.c(a2, hd.c.c) : a2 >> 1)) {
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
