// default package

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m3d extends q79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3d(Object obj, Looper looper, byte b) {
        super(looper, (byte) 1);
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                o3d o3dVar = (o3d) this.b;
                int i = message.what;
                if (i == 1) {
                    ReentrantLock reentrantLock = o3dVar.b;
                    reentrantLock.lock();
                    try {
                        if (o3dVar.e()) {
                            o3dVar.i();
                        }
                        return;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                if (i == 2) {
                    o3dVar.g();
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
                s3d s3dVar = (s3d) message.obj;
                t3d t3dVar = (t3d) this.b;
                s3dVar.getClass();
                t3dVar.a.lock();
                try {
                    if (t3dVar.m == s3dVar.a) {
                        s3dVar.a();
                    }
                    return;
                } finally {
                    t3dVar.a.unlock();
                }
        }
    }
}
