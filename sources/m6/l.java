package m6;

import ab.a0;
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
import com.google.android.gms.internal.cast.y;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m9.u;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public j2.n c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ n f;

    public l(n nVar) {
        this.f = nVar;
        y yVar = new y(Looper.getMainLooper(), new Handler.Callback() { // from class: m6.k
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i7 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 30);
                    sb2.append("Received response to request: ");
                    sb2.append(i7);
                    Log.d("MessengerIpcClient", sb2.toString());
                }
                l lVar = l.this;
                synchronized (lVar) {
                    try {
                        SparseArray sparseArray = lVar.e;
                        m mVar = (m) sparseArray.get(i7);
                        if (mVar == null) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 39);
                            sb3.append("Received response for unknown request: ");
                            sb3.append(i7);
                            Log.w("MessengerIpcClient", sb3.toString());
                            return true;
                        }
                        sparseArray.remove(i7);
                        lVar.d();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            mVar.c(new a0("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (mVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    mVar.b(null);
                                    return true;
                                }
                                mVar.c(new a0("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                mVar.b(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.b = new Messenger(yVar);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(m mVar) {
        Throwable th2;
        int i7;
        w6.a a10;
        n nVar;
        Context context;
        try {
            try {
                i7 = this.a;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                throw th2;
            }
            try {
                if (i7 != 0) {
                    if (i7 == 1) {
                        this.d.add(mVar);
                        return true;
                    }
                    if (i7 != 2) {
                        return false;
                    }
                    this.d.add(mVar);
                    ((ScheduledExecutorService) this.f.c).execute(new j(this, 1));
                    return true;
                }
                this.d.add(mVar);
                q6.m.j(this.a == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a10 = w6.a.a();
                    nVar = this.f;
                    context = (Context) nVar.b;
                } catch (SecurityException e10) {
                    e = e10;
                }
                try {
                    if (a10.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) nVar.c).schedule(new j(this, 0), 30L, TimeUnit.SECONDS);
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
            int i7 = this.a;
            if (i7 == 0) {
                throw new IllegalStateException();
            }
            if (i7 != 1 && i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            w6.a.a().b((Context) this.f.b, this);
            a0 a0Var = new a0(str, securityException);
            ArrayDeque arrayDeque = this.d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((m) it.next()).c(a0Var);
            }
            arrayDeque.clear();
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.e;
                if (i10 >= sparseArray.size()) {
                    sparseArray.clear();
                    return;
                } else {
                    ((m) sparseArray.valueAt(i10)).c(a0Var);
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
                w6.a.a().b((Context) this.f.b, this);
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
        ((ScheduledExecutorService) this.f.c).execute(new u(22, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new j(this, 2));
    }
}
