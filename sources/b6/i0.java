package b6;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i0 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final h0 e;
    public ComponentName f;
    public final /* synthetic */ k0 h;

    public i0(k0 k0Var, h0 h0Var) {
        this.h = k0Var;
        this.e = h0Var;
    }

    public static y5.a a(i0 i0Var, String str, Executor executor) {
        try {
            Intent a2 = i0Var.e.a(i0Var.h.b);
            i0Var.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(i6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                k0 k0Var = i0Var.h;
                boolean c3 = k0Var.d.c(k0Var.b, str, a2, i0Var, 4225, executor);
                i0Var.c = c3;
                if (c3) {
                    i0Var.h.c.sendMessageDelayed(i0Var.h.c.obtainMessage(1, i0Var.e), i0Var.h.f);
                    y5.a aVar = y5.a.e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar;
                }
                i0Var.b = 2;
                try {
                    k0 k0Var2 = i0Var.h;
                    k0Var2.d.b(k0Var2.b, i0Var);
                } catch (IllegalArgumentException unused) {
                }
                y5.a aVar2 = new y5.a(16);
                StrictMode.setVmPolicy(vmPolicy);
                return aVar2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (a0 e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.h.a) {
            try {
                this.h.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.h.a) {
            try {
                this.h.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
