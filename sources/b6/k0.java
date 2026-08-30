package b6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class k0 {
    public static final Object g = new Object();
    public static k0 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile a7.e c;
    public final h6.a d;
    public final long e;
    public final long f;

    public k0(Context context, Looper looper) {
        j0 j0Var = new j0(this);
        this.b = context.getApplicationContext();
        a7.e eVar = new a7.e(looper, j0Var);
        Looper.getMainLooper();
        this.c = eVar;
        this.d = h6.a.a();
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

    public final y5.a b(h0 h0Var, d0 d0Var, String str) {
        synchronized (this.a) {
            try {
                i0 i0Var = (i0) this.a.get(h0Var);
                y5.a aVar = null;
                if (i0Var == null) {
                    i0Var = new i0(this, h0Var);
                    i0Var.a.put(d0Var, d0Var);
                    aVar = i0.a(i0Var, str, null);
                    this.a.put(h0Var, i0Var);
                } else {
                    this.c.removeMessages(0, h0Var);
                    if (i0Var.a.containsKey(d0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(h0Var.toString()));
                    }
                    i0Var.a.put(d0Var, d0Var);
                    int i10 = i0Var.b;
                    if (i10 == 1) {
                        d0Var.onServiceConnected(i0Var.f, i0Var.d);
                    } else if (i10 == 2) {
                        aVar = i0.a(i0Var, str, null);
                    }
                }
                if (i0Var.c) {
                    return y5.a.e;
                }
                if (aVar == null) {
                    aVar = new y5.a(-1);
                }
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z4) {
        h0 h0Var = new h0(str, str2, z4);
        m.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                i0 i0Var = (i0) this.a.get(h0Var);
                if (i0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(h0Var.toString()));
                }
                if (!i0Var.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(h0Var.toString()));
                }
                i0Var.a.remove(serviceConnection);
                if (i0Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, h0Var), this.e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
