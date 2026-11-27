// default package

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class aef {
    public static final Object g = new Object();
    public static aef h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile b99 c;
    public final wz4 d;
    public final short e;
    public final int f;

    public aef(Context context, Looper looper) {
        w9f w9fVar = new w9f(this, (byte) 1);
        this.b = context.getApplicationContext();
        b99 b99Var = new b99(looper, w9fVar);
        Looper.getMainLooper();
        this.c = b99Var;
        this.d = wz4.E();
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

    public final ws2 b(o7f o7fVar, dyd dydVar, String str) {
        ws2 ws2Var;
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            y9f y9fVar = (y9f) hashMap.get(o7fVar);
            if (y9fVar == null) {
                y9fVar = new y9f(this, o7fVar);
                y9fVar.a.put(dydVar, dydVar);
                ws2Var = y9fVar.a(str);
                hashMap.put(o7fVar, y9fVar);
            } else {
                this.c.removeMessages(0, o7fVar);
                if (y9fVar.a.containsKey(dydVar)) {
                    String o7fVar2 = o7fVar.toString();
                    StringBuilder sb = new StringBuilder(o7fVar2.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(o7fVar2);
                    throw new IllegalStateException(sb.toString());
                }
                y9fVar.a.put(dydVar, dydVar);
                byte b = y9fVar.b;
                if (b == 1) {
                    dydVar.onServiceConnected(y9fVar.f, y9fVar.d);
                } else if (b == 2) {
                    ws2Var = y9fVar.a(str);
                }
                ws2Var = null;
            }
            if (y9fVar.c) {
                return ws2.f;
            }
            if (ws2Var == null) {
                ws2Var = new ws2(-1, null, null);
            }
            return ws2Var;
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        o7f o7fVar = new o7f(str, str2, z);
        xve.i(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            y9f y9fVar = (y9f) hashMap.get(o7fVar);
            if (y9fVar == null) {
                String o7fVar2 = o7fVar.toString();
                StringBuilder sb = new StringBuilder(o7fVar2.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(o7fVar2);
                throw new IllegalStateException(sb.toString());
            }
            if (!y9fVar.a.containsKey(serviceConnection)) {
                String o7fVar3 = o7fVar.toString();
                StringBuilder sb2 = new StringBuilder(o7fVar3.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(o7fVar3);
                throw new IllegalStateException(sb2.toString());
            }
            y9fVar.a.remove(serviceConnection);
            if (y9fVar.a.isEmpty()) {
                this.c.sendMessageDelayed(this.c.obtainMessage(0, o7fVar), this.e);
            }
        }
    }
}
