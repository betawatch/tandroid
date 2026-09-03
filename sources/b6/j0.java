package b6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j0 implements Handler.Callback {
    public final /* synthetic */ k0 a;

    public /* synthetic */ j0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.a.a) {
                try {
                    h0 h0Var = (h0) message.obj;
                    i0 i0Var = (i0) this.a.a.get(h0Var);
                    if (i0Var != null && i0Var.a.isEmpty()) {
                        if (i0Var.c) {
                            i0Var.h.c.removeMessages(1, i0Var.e);
                            k0 k0Var = i0Var.h;
                            k0Var.d.b(k0Var.b, i0Var);
                            i0Var.c = false;
                            i0Var.b = 2;
                        }
                        this.a.a.remove(h0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.a.a) {
            try {
                h0 h0Var2 = (h0) message.obj;
                i0 i0Var2 = (i0) this.a.a.get(h0Var2);
                if (i0Var2 != null && i0Var2.b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(h0Var2)), new Exception());
                    ComponentName componentName = i0Var2.f;
                    if (componentName == null) {
                        h0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = h0Var2.b;
                        m.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    i0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
