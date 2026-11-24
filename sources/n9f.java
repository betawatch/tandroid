// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n9f implements ServiceConnection {
    public byte a = 0;
    public final Messenger b;
    public rhb c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ jif f;

    public n9f(jif jifVar) {
        this.f = jifVar;
        q79 q79Var = new q79(Looper.getMainLooper(), new h7f(this, (byte) 0));
        Looper.getMainLooper();
        this.b = new Messenger(q79Var);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(fdf fdfVar) {
        Throwable th;
        n9f n9fVar;
        sz4 F;
        jif jifVar;
        Context context;
        try {
            try {
                byte b = this.a;
                byte b2 = 0;
                try {
                    if (b != 0) {
                        if (b == 1) {
                            this.d.add(fdfVar);
                            return true;
                        }
                        if (b != 2) {
                            return false;
                        }
                        this.d.add(fdfVar);
                        ((ScheduledExecutorService) this.f.c).execute(new woe(this, (byte) 1));
                        return true;
                    }
                    this.d.add(fdfVar);
                    ite.k(this.a == 0);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.a = (byte) 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    try {
                        F = sz4.F();
                        jifVar = this.f;
                        try {
                            context = (Context) jifVar.b;
                            n9fVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            n9fVar = this;
                        }
                    } catch (SecurityException e) {
                        e = e;
                        n9fVar = this;
                    }
                    try {
                        try {
                            if (F.L(context, context.getClass().getName(), intent, n9fVar, 1)) {
                                ((ScheduledExecutorService) jifVar.c).schedule(new woe(n9fVar, b2), 30L, TimeUnit.SECONDS);
                            } else {
                                n9fVar.b("Unable to bind to service");
                            }
                        } catch (SecurityException e2) {
                            e = e2;
                            n9fVar.c("Unable to bind to service", e);
                            return true;
                        }
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    n9fVar = this;
                }
            } catch (Throwable th5) {
                th = th5;
                n9fVar = this;
                th = th;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        byte b = this.a;
        if (b == 0) {
            throw new IllegalStateException();
        }
        if (b != 1 && b != 2) {
            if (b != 3) {
                return;
            }
            this.a = (byte) 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.a = (byte) 4;
        sz4.F().K((Context) this.f.b, this);
        v40 v40Var = new v40(str, securityException);
        ArrayDeque arrayDeque = this.d;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((fdf) it.next()).c(v40Var);
        }
        arrayDeque.clear();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.e;
            if (i >= sparseArray.size()) {
                sparseArray.clear();
                return;
            } else {
                ((fdf) sparseArray.valueAt(i)).c(v40Var);
                i++;
            }
        }
    }

    public final synchronized void d() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = (byte) 3;
            sz4.F().K((Context) this.f.b, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new us4(this, iBinder, (byte) 21));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new woe(this, (byte) 2));
    }
}
