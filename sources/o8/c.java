package o8;

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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final f0 b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final j0 i;
    public jf.a m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final h0 k = new IBinder.DeathRecipient() { // from class: o8.h0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            c cVar = c.this;
            int i10 = 0;
            cVar.b.b("reportBinderDeath", new Object[0]);
            if (cVar.j.get() != null) {
                throw new ClassCastException();
            }
            cVar.b.b("%s : Binder has died.", cVar.c);
            ArrayList arrayList = cVar.d;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((g0) obj).a(new RemoteException(String.valueOf(cVar.c).concat(" : Binder has died.")));
            }
            cVar.d.clear();
            synchronized (cVar.f) {
                cVar.e();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [o8.h0] */
    public c(Context context, f0 f0Var, String str, Intent intent, j0 j0Var) {
        this.a = context;
        this.b = f0Var;
        this.c = str;
        this.h = intent;
        this.i = j0Var;
    }

    public static void b(c cVar, g0 g0Var) {
        IInterface iInterface = cVar.n;
        f0 f0Var = cVar.b;
        ArrayList arrayList = cVar.d;
        int i10 = 0;
        if (iInterface != null || cVar.g) {
            if (!cVar.g) {
                g0Var.run();
                return;
            } else {
                f0Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(g0Var);
                return;
            }
        }
        f0Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(g0Var);
        jf.a aVar = new jf.a(cVar, 2);
        cVar.m = aVar;
        cVar.g = true;
        if (cVar.a.bindService(cVar.h, aVar, 1)) {
            return;
        }
        f0Var.b("Failed to bind to the service.", new Object[0]);
        cVar.g = false;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g0) obj).a(new d("Failed to bind to the service."));
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(g0 g0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new i0(this, g0Var.c(), taskCompletionSource, g0Var));
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
