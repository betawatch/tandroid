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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class l7f implements ServiceConnection {
    public byte a = 0;
    public final Messenger b;
    public aec c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ igf f;

    public l7f(igf igfVar) {
        this.f = igfVar;
        o59 o59Var = new o59(Looper.getMainLooper(), new f5f(this, (byte) 0));
        Looper.getMainLooper();
        this.b = new Messenger(o59Var);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(ebf ebfVar) {
        Throwable th;
        l7f l7fVar;
        qx4 I;
        igf igfVar;
        Context context;
        try {
            try {
                byte b = this.a;
                byte b2 = 0;
                try {
                    if (b != 0) {
                        if (b == 1) {
                            this.d.add(ebfVar);
                            return true;
                        }
                        if (b != 2) {
                            return false;
                        }
                        this.d.add(ebfVar);
                        ((ScheduledExecutorService) this.f.c).execute(new tme(this, (byte) 1));
                        return true;
                    }
                    this.d.add(ebfVar);
                    fre.k(this.a == 0);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.a = (byte) 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    try {
                        I = qx4.I();
                        igfVar = this.f;
                        try {
                            context = (Context) igfVar.b;
                            l7fVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            l7fVar = this;
                        }
                    } catch (SecurityException e) {
                        e = e;
                        l7fVar = this;
                    }
                    try {
                        try {
                            if (I.N(context, context.getClass().getName(), intent, l7fVar, 1)) {
                                ((ScheduledExecutorService) igfVar.c).schedule(new tme(l7fVar, b2), 30L, TimeUnit.SECONDS);
                            } else {
                                l7fVar.b("Unable to bind to service");
                            }
                        } catch (SecurityException e2) {
                            e = e2;
                            l7fVar.c("Unable to bind to service", e);
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
                    l7fVar = this;
                }
            } catch (Throwable th5) {
                th = th5;
                l7fVar = this;
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
        qx4.I().M((Context) this.f.b, this);
        v30 v30Var = new v30(str, securityException);
        ArrayDeque arrayDeque = this.d;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((ebf) it.next()).c(v30Var);
        }
        arrayDeque.clear();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.e;
            if (i >= sparseArray.size()) {
                sparseArray.clear();
                return;
            } else {
                ((ebf) sparseArray.valueAt(i)).c(v30Var);
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
            qx4.I().M((Context) this.f.b, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new tq4(this, iBinder, (byte) 21));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new tme(this, (byte) 2));
    }
}
