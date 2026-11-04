package l6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.z;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l9.u;
import p4.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public q c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ n f;

    public k(n nVar) {
        this.f = nVar;
        z zVar = new z(Looper.getMainLooper(), new Handler.Callback() { // from class: l6.j
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i3 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 30);
                    sb2.append("Received response to request: ");
                    sb2.append(i3);
                    Log.d("MessengerIpcClient", sb2.toString());
                }
                k kVar = k.this;
                synchronized (kVar) {
                    try {
                        SparseArray sparseArray = kVar.e;
                        l lVar = (l) sparseArray.get(i3);
                        if (lVar == null) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 39);
                            sb3.append("Received response for unknown request: ");
                            sb3.append(i3);
                            Log.w("MessengerIpcClient", sb3.toString());
                            return true;
                        }
                        sparseArray.remove(i3);
                        kVar.d();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            lVar.c(new m("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (lVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    lVar.b(null);
                                    return true;
                                }
                                lVar.c(new m("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                lVar.b(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.b = new Messenger(zVar);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(l lVar) {
        Throwable th2;
        int i3;
        v6.a a10;
        n nVar;
        Context context;
        try {
            try {
                i3 = this.a;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                throw th2;
            }
            try {
                if (i3 != 0) {
                    if (i3 == 1) {
                        this.d.add(lVar);
                        return true;
                    }
                    if (i3 != 2) {
                        return false;
                    }
                    this.d.add(lVar);
                    ((ScheduledExecutorService) this.f.c).execute(new i(this, 1));
                    return true;
                }
                this.d.add(lVar);
                p6.m.j(this.a == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a10 = v6.a.a();
                    nVar = this.f;
                    context = (Context) nVar.b;
                } catch (SecurityException e10) {
                    e = e10;
                }
                try {
                    if (a10.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) nVar.c).schedule(new i(this, 0), 30L, TimeUnit.SECONDS);
                    } else {
                        b("Unable to bind to service");
                    }
                } catch (SecurityException e11) {
                    e = e11;
                    c("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th4) {
                th2 = th4;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i3 = this.a;
            if (i3 == 0) {
                throw new IllegalStateException();
            }
            if (i3 != 1 && i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            v6.a.a().b((Context) this.f.b, this);
            m mVar = new m(str, securityException);
            ArrayDeque arrayDeque = this.d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((l) it.next()).c(mVar);
            }
            arrayDeque.clear();
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.e;
                if (i10 >= sparseArray.size()) {
                    sparseArray.clear();
                    return;
                } else {
                    ((l) sparseArray.valueAt(i10)).c(mVar);
                    i10++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                v6.a.a().b((Context) this.f.b, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new u(16, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new i(this, 2));
    }
}
