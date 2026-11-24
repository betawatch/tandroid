// default package

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lbf {
    public static final Object g = new Object();
    public static lbf h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile q79 c;
    public final sz4 d;
    public final short e;
    public final int f;

    public lbf(Context context, Looper looper) {
        h7f h7fVar = new h7f(this, (byte) 1);
        this.b = context.getApplicationContext();
        q79 q79Var = new q79(looper, h7fVar);
        Looper.getMainLooper();
        this.c = q79Var;
        this.d = sz4.F();
        this.e = (short) 5000;
        this.f = 300000;
    }

    public static HandlerThread a() {
        synchronized (g) {
            HandlerThread handlerThread = i;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            i = handlerThread2;
            handlerThread2.start();
            return i;
        }
    }

    public final ot2 b(z4f z4fVar, qvd qvdVar, String str) {
        ot2 ot2Var;
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            j7f j7fVar = (j7f) hashMap.get(z4fVar);
            if (j7fVar == null) {
                j7fVar = new j7f(this, z4fVar);
                j7fVar.a.put(qvdVar, qvdVar);
                ot2Var = j7fVar.a(str);
                hashMap.put(z4fVar, j7fVar);
            } else {
                this.c.removeMessages(0, z4fVar);
                if (j7fVar.a.containsKey(qvdVar)) {
                    String z4fVar2 = z4fVar.toString();
                    StringBuilder sb = new StringBuilder(z4fVar2.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(z4fVar2);
                    throw new IllegalStateException(sb.toString());
                }
                j7fVar.a.put(qvdVar, qvdVar);
                byte b = j7fVar.b;
                if (b == 1) {
                    qvdVar.onServiceConnected(j7fVar.f, j7fVar.d);
                } else if (b == 2) {
                    ot2Var = j7fVar.a(str);
                }
                ot2Var = null;
            }
            if (j7fVar.c) {
                return ot2.f;
            }
            if (ot2Var == null) {
                ot2Var = new ot2(-1, null, null);
            }
            return ot2Var;
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        z4f z4fVar = new z4f(str, str2, z);
        ite.i(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            j7f j7fVar = (j7f) hashMap.get(z4fVar);
            if (j7fVar == null) {
                String z4fVar2 = z4fVar.toString();
                StringBuilder sb = new StringBuilder(z4fVar2.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(z4fVar2);
                throw new IllegalStateException(sb.toString());
            }
            if (!j7fVar.a.containsKey(serviceConnection)) {
                String z4fVar3 = z4fVar.toString();
                StringBuilder sb2 = new StringBuilder(z4fVar3.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(z4fVar3);
                throw new IllegalStateException(sb2.toString());
            }
            j7fVar.a.remove(serviceConnection);
            if (j7fVar.a.isEmpty()) {
                this.c.sendMessageDelayed(this.c.obtainMessage(0, z4fVar), this.e);
            }
        }
    }
}
