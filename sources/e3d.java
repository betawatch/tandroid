// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class e3d implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public c3d e;
    public boolean f;

    public e3d(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new kq7("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            c3d c3dVar = this.e;
            if (c3dVar == null || !c3dVar.isBinderAlive()) {
                c();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.e.a((d3d) this.d.poll());
        }
    }

    public final synchronized Task b(Intent intent) {
        d3d d3dVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        d3dVar = new d3d(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
        d3dVar.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new ftb(scheduledThreadPoolExecutor.schedule(new olc(d3dVar, (byte) 26), 20L, TimeUnit.SECONDS), (byte) 26));
        this.d.add(d3dVar);
        a();
        return d3dVar.b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[LOOP:0: B:15:0x0050->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        e3d e3dVar;
        ArrayDeque arrayDeque;
        wz4 E;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            E = wz4.E();
            context = this.a;
            e3dVar = this;
            try {
            } catch (SecurityException e) {
                e = e;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                e3dVar.f = false;
                while (true) {
                    arrayDeque = e3dVar.d;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((d3d) arrayDeque.poll()).b.trySetResult(null);
                }
            }
        } catch (SecurityException e2) {
            e = e2;
            e3dVar = this;
        }
        if (E.L(context, context.getClass().getName(), this.b, e3dVar, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        e3dVar.f = false;
        while (true) {
            arrayDeque = e3dVar.d;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((d3d) arrayDeque.poll()).b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f = false;
        if (iBinder instanceof c3d) {
            this.e = (c3d) iBinder;
            a();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        ArrayDeque arrayDeque = this.d;
        while (!arrayDeque.isEmpty()) {
            ((d3d) arrayDeque.poll()).b.trySetResult(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
