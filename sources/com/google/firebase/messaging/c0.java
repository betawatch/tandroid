package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import bi.u6;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c0 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public a0 e;
    public boolean f;

    public c0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new d5.v("Firebase-FirebaseInstanceIdServiceConnection"));
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
                a0 a0Var = this.e;
                if (a0Var == null || !a0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.a((b0) this.d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Task b(Intent intent) {
        b0 b0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            b0Var = new b0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
            b0Var.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new a1.c(scheduledThreadPoolExecutor.schedule(new u6(b0Var, 12), 20L, TimeUnit.SECONDS), 19));
            this.d.add(b0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return b0Var.b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:20:0x0053->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        c0 c0Var;
        ArrayDeque arrayDeque;
        u6.a a2;
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
            a2 = u6.a.a();
            context = this.a;
            c0Var = this;
            try {
            } catch (SecurityException e) {
                e = e;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                c0Var.f = false;
                while (true) {
                    arrayDeque = c0Var.d;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((b0) arrayDeque.poll()).b.trySetResult(null);
                }
            }
        } catch (SecurityException e10) {
            e = e10;
            c0Var = this;
        }
        if (a2.c(context, context.getClass().getName(), this.b, c0Var, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        c0Var.f = false;
        while (true) {
            arrayDeque = c0Var.d;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((b0) arrayDeque.poll()).b.trySetResult(null);
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
            if (iBinder instanceof a0) {
                this.e = (a0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.d;
            while (!arrayDeque.isEmpty()) {
                ((b0) arrayDeque.poll()).b.trySetResult(null);
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
