package b9;

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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final h0 b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final l0 i;
    public c m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final j0 k = new IBinder.DeathRecipient() { // from class: b9.j0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d dVar = d.this;
            int i10 = 0;
            dVar.b.b("reportBinderDeath", new Object[0]);
            if (dVar.j.get() != null) {
                throw new ClassCastException();
            }
            dVar.b.b("%s : Binder has died.", dVar.c);
            ArrayList arrayList = dVar.d;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((i0) obj).a(new RemoteException(String.valueOf(dVar.c).concat(" : Binder has died.")));
            }
            dVar.d.clear();
            synchronized (dVar.f) {
                dVar.e();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [b9.j0] */
    public d(Context context, h0 h0Var, String str, Intent intent, l0 l0Var) {
        this.a = context;
        this.b = h0Var;
        this.c = str;
        this.h = intent;
        this.i = l0Var;
    }

    public static void b(d dVar, i0 i0Var) {
        IInterface iInterface = dVar.n;
        h0 h0Var = dVar.b;
        ArrayList arrayList = dVar.d;
        int i10 = 0;
        if (iInterface != null || dVar.g) {
            if (!dVar.g) {
                i0Var.run();
                return;
            } else {
                h0Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(i0Var);
                return;
            }
        }
        h0Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(i0Var);
        c cVar = new c(dVar, 0);
        dVar.m = cVar;
        dVar.g = true;
        if (dVar.a.bindService(dVar.h, cVar, 1)) {
            return;
        }
        h0Var.b("Failed to bind to the service.", new Object[0]);
        dVar.g = false;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i0) obj).a(new e("Failed to bind to the service."));
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

    public final void c(i0 i0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new k0(this, i0Var.c(), taskCompletionSource, i0Var));
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
