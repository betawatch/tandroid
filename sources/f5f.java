// default package

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f5f implements Handler.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5f(Object obj, byte b) {
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
        l7f l7fVar = (l7f) this.b;
        synchronized (l7fVar) {
            SparseArray sparseArray = l7fVar.e;
            ebf ebfVar = (ebf) sparseArray.get(i);
            if (ebfVar == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 39);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            sparseArray.remove(i);
            l7fVar.d();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                ebfVar.c(new v30("Not supported by GmsCore", null));
                return true;
            }
            switch (ebfVar.e) {
                case 0:
                    if (data.getBoolean("ack", false)) {
                        ebfVar.b(null);
                        return true;
                    }
                    ebfVar.c(new v30("Invalid response to one way request", null));
                    return true;
                default:
                    Bundle bundle = data.getBundle("data");
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    ebfVar.b(bundle);
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
                    j9f j9fVar = (j9f) this.b;
                    synchronized (j9fVar.a) {
                        x2f x2fVar = (x2f) message.obj;
                        h5f h5fVar = (h5f) j9fVar.a.get(x2fVar);
                        if (h5fVar != null && h5fVar.a.isEmpty()) {
                            if (h5fVar.c) {
                                x2f x2fVar2 = h5fVar.e;
                                j9f j9fVar2 = h5fVar.h;
                                j9fVar2.c.removeMessages(1, x2fVar2);
                                j9fVar2.d.M(j9fVar2.b, h5fVar);
                                h5fVar.c = false;
                                h5fVar.b = (byte) 2;
                            }
                            j9fVar.a.remove(x2fVar);
                        }
                    }
                } else {
                    if (i != 1) {
                        return false;
                    }
                    j9f j9fVar3 = (j9f) this.b;
                    synchronized (j9fVar3.a) {
                        x2f x2fVar3 = (x2f) message.obj;
                        h5f h5fVar2 = (h5f) j9fVar3.a.get(x2fVar3);
                        if (h5fVar2 != null && h5fVar2.b == 3) {
                            String valueOf = String.valueOf(x2fVar3);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                            sb.append("Timeout waiting for ServiceConnection callback ");
                            sb.append(valueOf);
                            Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                            ComponentName componentName = h5fVar2.f;
                            if (componentName == null) {
                                x2fVar3.getClass();
                                componentName = null;
                            }
                            if (componentName == null) {
                                String str = x2fVar3.b;
                                fre.h(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            h5fVar2.onServiceDisconnected(componentName);
                        }
                    }
                }
                return true;
        }
    }
}
