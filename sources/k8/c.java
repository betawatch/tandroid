package k8;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final g0 b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final k0 i;
    public df.a m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final i0 k = new IBinder.DeathRecipient() { // from class: k8.i0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            c cVar = c.this;
            int i9 = 0;
            cVar.b.b("reportBinderDeath", new Object[0]);
            if (cVar.j.get() != null) {
                throw new ClassCastException();
            }
            cVar.b.b("%s : Binder has died.", cVar.c);
            ArrayList arrayList = cVar.d;
            int size = arrayList.size();
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((h0) obj).a(new RemoteException(String.valueOf(cVar.c).concat(" : Binder has died.")));
            }
            cVar.d.clear();
            synchronized (cVar.f) {
                cVar.e();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [k8.i0] */
    public c(Context context, g0 g0Var, String str, Intent intent, k0 k0Var) {
        this.a = context;
        this.b = g0Var;
        this.c = str;
        this.h = intent;
        this.i = k0Var;
    }

    public static void b(c cVar, h0 h0Var) {
        IInterface iInterface = cVar.n;
        g0 g0Var = cVar.b;
        ArrayList arrayList = cVar.d;
        int i9 = 0;
        if (iInterface != null || cVar.g) {
            if (!cVar.g) {
                h0Var.run();
                return;
            } else {
                g0Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(h0Var);
                return;
            }
        }
        g0Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(h0Var);
        df.a aVar = new df.a(cVar, 2);
        cVar.m = aVar;
        cVar.g = true;
        if (cVar.a.bindService(cVar.h, aVar, 1)) {
            return;
        }
        g0Var.b("Failed to bind to the service.", new Object[0]);
        cVar.g = false;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((h0) obj).a(new d("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(h0 h0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new j0(this, h0Var.c(), taskCompletionSource, h0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
