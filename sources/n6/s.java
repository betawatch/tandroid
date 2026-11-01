package n6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class s implements Handler.Callback {
    public final com.google.android.gms.common.api.internal.h0 a;
    public final com.google.android.gms.internal.cast.z n;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean h = false;
    public final Object r = new Object();

    public s(Looper looper, com.google.android.gms.common.api.internal.h0 h0Var) {
        this.a = h0Var;
        this.n = new com.google.android.gms.internal.cast.z(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.g(lVar);
        synchronized (this.r) {
            try {
                if (this.d.contains(lVar)) {
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(lVar) + " is already registered");
                } else {
                    this.d.add(lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.wtf("GmsClientEvents", i0.a.i(i10, "Don't know how to handle message: "), new Exception());
            return false;
        }
        com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) message.obj;
        synchronized (this.r) {
            try {
                if (this.e && this.a.a() && this.b.contains(kVar)) {
                    kVar.onConnected(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
