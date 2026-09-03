package com.google.firebase.messaging;

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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d0 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public b0 e;
    public boolean f;

    public d0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new i9.u("Firebase-FirebaseInstanceIdServiceConnection"));
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
                b0 b0Var = this.e;
                if (b0Var == null || !b0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.a((c0) this.d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Task b(Intent intent) {
        c0 c0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            c0Var = new c0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
            c0Var.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new a1.c(scheduledThreadPoolExecutor.schedule(new ag.d(c0Var, 19), 20L, TimeUnit.SECONDS), 9));
            this.d.add(c0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return c0Var.b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:20:0x0053->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        d0 d0Var;
        ArrayDeque arrayDeque;
        h6.a a2;
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
            a2 = h6.a.a();
            context = this.a;
            d0Var = this;
            try {
            } catch (SecurityException e) {
                e = e;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                d0Var.f = false;
                while (true) {
                    arrayDeque = d0Var.d;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((c0) arrayDeque.poll()).b.trySetResult(null);
                }
            }
        } catch (SecurityException e6) {
            e = e6;
            d0Var = this;
        }
        if (a2.c(context, context.getClass().getName(), this.b, d0Var, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        d0Var.f = false;
        while (true) {
            arrayDeque = d0Var.d;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((c0) arrayDeque.poll()).b.trySetResult(null);
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
            if (iBinder instanceof b0) {
                this.e = (b0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.d;
            while (!arrayDeque.isEmpty()) {
                ((c0) arrayDeque.poll()).b.trySetResult(null);
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
