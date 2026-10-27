package k6;

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
import com.google.firebase.messaging.p;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k9.u;
import n4.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public s c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ m f;

    public k(m mVar) {
        this.f = mVar;
        y yVar = new y(Looper.getMainLooper(), new Handler.Callback() { // from class: k6.j
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i10 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i10);
                }
                k kVar = k.this;
                synchronized (kVar) {
                    try {
                        l lVar = (l) kVar.e.get(i10);
                        if (lVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                            return true;
                        }
                        kVar.e.remove(i10);
                        kVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            lVar.b(new p("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (lVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    lVar.c(null);
                                    return true;
                                }
                                lVar.b(new p("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                lVar.c(bundle);
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

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i10 = this.a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            u6.a.a().b((Context) this.f.b, this);
            p pVar = new p(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((l) it.next()).b(pVar);
            }
            this.d.clear();
            for (int i11 = 0; i11 < this.e.size(); i11++) {
                ((l) this.e.valueAt(i11)).b(pVar);
            }
            this.e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                u6.a.a().b((Context) this.f.b, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d(l lVar) {
        Throwable th2;
        int i10;
        u6.a a2;
        Context context;
        try {
            try {
                i10 = this.a;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                throw th2;
            }
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        this.d.add(lVar);
                        return true;
                    }
                    if (i10 != 2) {
                        return false;
                    }
                    this.d.add(lVar);
                    ((ScheduledExecutorService) this.f.c).execute(new i(this, 0));
                    return true;
                }
                this.d.add(lVar);
                o6.l.k(this.a == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a2 = u6.a.a();
                    context = (Context) this.f.b;
                } catch (SecurityException e) {
                    e = e;
                }
                try {
                    if (a2.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.f.c).schedule(new i(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        a("Unable to bind to service");
                    }
                } catch (SecurityException e10) {
                    e = e10;
                    b("Unable to bind to service", e);
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

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new u(17, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new i(this, 2));
    }
}
