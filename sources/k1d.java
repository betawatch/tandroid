// default package

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class k1d extends o59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1d(Object obj, Looper looper, byte b) {
        super(looper, (byte) 1);
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                m1d m1dVar = (m1d) this.b;
                int i = message.what;
                if (i == 1) {
                    ReentrantLock reentrantLock = m1dVar.b;
                    reentrantLock.lock();
                    try {
                        if (m1dVar.e()) {
                            m1dVar.i();
                        }
                        return;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                if (i == 2) {
                    m1dVar.g();
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                sb.append("Unknown message id: ");
                sb.append(i);
                Log.w("GoogleApiClientImpl", sb.toString());
                return;
            default:
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 20);
                    sb2.append("Unknown message id: ");
                    sb2.append(i2);
                    Log.w("GACStateManager", sb2.toString());
                    return;
                }
                q1d q1dVar = (q1d) message.obj;
                r1d r1dVar = (r1d) this.b;
                q1dVar.getClass();
                r1dVar.a.lock();
                try {
                    if (r1dVar.m == q1dVar.a) {
                        q1dVar.a();
                    }
                    return;
                } finally {
                    r1dVar.a.unlock();
                }
        }
    }
}
