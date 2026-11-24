// default package

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class h7f implements Handler.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h7f(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final boolean a(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 30);
            sb.append("Received response to request: ");
            sb.append(i);
            Log.d("MessengerIpcClient", sb.toString());
        }
        n9f n9fVar = (n9f) this.b;
        synchronized (n9fVar) {
            SparseArray sparseArray = n9fVar.e;
            fdf fdfVar = (fdf) sparseArray.get(i);
            if (fdfVar == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 39);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            sparseArray.remove(i);
            n9fVar.d();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                fdfVar.c(new v40("Not supported by GmsCore", null));
                return true;
            }
            switch (fdfVar.e) {
                case 0:
                    if (data.getBoolean("ack", false)) {
                        fdfVar.b(null);
                        return true;
                    }
                    fdfVar.c(new v40("Invalid response to one way request", null));
                    return true;
                default:
                    Bundle bundle = data.getBundle("data");
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    fdfVar.b(bundle);
                    return true;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                return a(message);
            default:
                int i = message.what;
                if (i == 0) {
                    lbf lbfVar = (lbf) this.b;
                    synchronized (lbfVar.a) {
                        z4f z4fVar = (z4f) message.obj;
                        j7f j7fVar = (j7f) lbfVar.a.get(z4fVar);
                        if (j7fVar != null && j7fVar.a.isEmpty()) {
                            if (j7fVar.c) {
                                z4f z4fVar2 = j7fVar.e;
                                lbf lbfVar2 = j7fVar.h;
                                lbfVar2.c.removeMessages(1, z4fVar2);
                                lbfVar2.d.K(lbfVar2.b, j7fVar);
                                j7fVar.c = false;
                                j7fVar.b = (byte) 2;
                            }
                            lbfVar.a.remove(z4fVar);
                        }
                    }
                } else {
                    if (i != 1) {
                        return false;
                    }
                    lbf lbfVar3 = (lbf) this.b;
                    synchronized (lbfVar3.a) {
                        z4f z4fVar3 = (z4f) message.obj;
                        j7f j7fVar2 = (j7f) lbfVar3.a.get(z4fVar3);
                        if (j7fVar2 != null && j7fVar2.b == 3) {
                            String valueOf = String.valueOf(z4fVar3);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                            sb.append("Timeout waiting for ServiceConnection callback ");
                            sb.append(valueOf);
                            Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                            ComponentName componentName = j7fVar2.f;
                            if (componentName == null) {
                                z4fVar3.getClass();
                                componentName = null;
                            }
                            if (componentName == null) {
                                String str = z4fVar3.b;
                                ite.h(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            j7fVar2.onServiceDisconnected(componentName);
                        }
                    }
                }
                return true;
        }
    }
}
