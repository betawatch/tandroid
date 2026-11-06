package ab;

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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class p0 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public n0 e;
    public boolean f;

    public p0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new f5.r("Firebase-FirebaseInstanceIdServiceConnection"));
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
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                n0 n0Var = this.e;
                if (n0Var == null || !n0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.a((o0) this.d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Task b(Intent intent) {
        o0 o0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            o0Var = new o0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
            o0Var.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new a1.c(scheduledThreadPoolExecutor.schedule(new a3.f(o0Var, 2), 20L, TimeUnit.SECONDS), 7));
            this.d.add(o0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return o0Var.b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:20:0x0053->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        p0 p0Var;
        ArrayDeque arrayDeque;
        w6.a a10;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            a10 = w6.a.a();
            context = this.a;
            p0Var = this;
            try {
            } catch (SecurityException e10) {
                e = e10;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                p0Var.f = false;
                while (true) {
                    arrayDeque = p0Var.d;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((o0) arrayDeque.poll()).b.trySetResult(null);
                }
            }
        } catch (SecurityException e11) {
            e = e11;
            p0Var = this;
        }
        if (a10.c(context, context.getClass().getName(), this.b, p0Var, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        p0Var.f = false;
        while (true) {
            arrayDeque = p0Var.d;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((o0) arrayDeque.poll()).b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f = false;
            if (iBinder instanceof n0) {
                this.e = (n0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.d;
            while (!arrayDeque.isEmpty()) {
                ((o0) arrayDeque.poll()).b.trySetResult(null);
            }
        } catch (Throwable th2) {
            throw th2;
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
