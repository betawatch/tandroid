package n6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class j0 {
    public static final Object g = new Object();
    public static j0 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile com.google.android.gms.internal.cast.c0 c;
    public final t6.a d;
    public final long e;
    public final long f;

    public j0(Context context, Looper looper) {
        i0 i0Var = new i0(this);
        this.b = context.getApplicationContext();
        com.google.android.gms.internal.cast.c0 c0Var = new com.google.android.gms.internal.cast.c0(looper, i0Var);
        Looper.getMainLooper();
        this.c = c0Var;
        this.d = t6.a.a();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (g) {
            try {
                HandlerThread handlerThread = i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                i = handlerThread2;
                handlerThread2.start();
                return i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final k6.a b(g0 g0Var, c0 c0Var, String str) {
        synchronized (this.a) {
            try {
                h0 h0Var = (h0) this.a.get(g0Var);
                k6.a aVar = null;
                if (h0Var == null) {
                    h0Var = new h0(this, g0Var);
                    h0Var.a.put(c0Var, c0Var);
                    aVar = h0.a(h0Var, str, null);
                    this.a.put(g0Var, h0Var);
                } else {
                    this.c.removeMessages(0, g0Var);
                    if (h0Var.a.containsKey(c0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g0Var.toString()));
                    }
                    h0Var.a.put(c0Var, c0Var);
                    int i10 = h0Var.b;
                    if (i10 == 1) {
                        c0Var.onServiceConnected(h0Var.f, h0Var.d);
                    } else if (i10 == 2) {
                        aVar = h0.a(h0Var, str, null);
                    }
                }
                if (h0Var.c) {
                    return k6.a.e;
                }
                if (aVar == null) {
                    aVar = new k6.a(-1);
                }
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z10) {
        g0 g0Var = new g0(str, str2, z10);
        l.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                h0 h0Var = (h0) this.a.get(g0Var);
                if (h0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(g0Var.toString()));
                }
                if (!h0Var.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(g0Var.toString()));
                }
                h0Var.a.remove(serviceConnection);
                if (h0Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, g0Var), this.e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
