package a9;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final j0 b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final n0 i;
    public d m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final l0 k = new IBinder.DeathRecipient() { // from class: a9.l0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            e eVar = e.this;
            int i10 = 0;
            eVar.b.b("reportBinderDeath", new Object[0]);
            if (eVar.j.get() != null) {
                throw new ClassCastException();
            }
            eVar.b.b("%s : Binder has died.", eVar.c);
            ArrayList arrayList = eVar.d;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((k0) obj).a(new RemoteException(String.valueOf(eVar.c).concat(" : Binder has died.")));
            }
            eVar.d.clear();
            synchronized (eVar.f) {
                eVar.e();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [a9.l0] */
    public e(Context context, j0 j0Var, String str, Intent intent, n0 n0Var) {
        this.a = context;
        this.b = j0Var;
        this.c = str;
        this.h = intent;
        this.i = n0Var;
    }

    public static void b(e eVar, k0 k0Var) {
        IInterface iInterface = eVar.n;
        j0 j0Var = eVar.b;
        ArrayList arrayList = eVar.d;
        int i10 = 0;
        if (iInterface != null || eVar.g) {
            if (!eVar.g) {
                k0Var.run();
                return;
            } else {
                j0Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(k0Var);
                return;
            }
        }
        j0Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(k0Var);
        d dVar = new d(eVar, 0);
        eVar.m = dVar;
        eVar.g = true;
        if (eVar.a.bindService(eVar.h, dVar, 1)) {
            return;
        }
        j0Var.b("Failed to bind to the service.", new Object[0]);
        eVar.g = false;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((k0) obj).a(new f("Failed to bind to the service."));
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

    public final void c(k0 k0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new m0(this, k0Var.c(), taskCompletionSource, k0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new c(this, 1));
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
