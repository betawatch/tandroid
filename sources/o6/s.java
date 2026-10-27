package o6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s implements Handler.Callback {
    public final a4.l a;
    public final com.google.android.gms.internal.cast.y n;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean h = false;
    public final Object r = new Object();

    public s(Looper looper, a4.l lVar) {
        this.a = lVar;
        this.n = new com.google.android.gms.internal.cast.y(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
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
            Log.wtf("GmsClientEvents", ic.a.i(i10, "Don't know how to handle message: "), new Exception());
            return false;
        }
        com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) message.obj;
        synchronized (this.r) {
            try {
                if (this.e && this.a.w() && this.b.contains(kVar)) {
                    kVar.onConnected(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
