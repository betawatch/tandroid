// default package

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ntd implements ServiceConnection {
    public final int a;
    public final /* synthetic */ gg0 b;

    public ntd(gg0 gg0Var, int i) {
        this.b = gg0Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gg0 gg0Var = this.b;
        if (iBinder == null) {
            gg0Var.z();
            return;
        }
        synchronized (gg0Var.m) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            gg0Var.n = (queryLocalInterface == null || !(queryLocalInterface instanceof f5d)) ? new f5d(iBinder) : (f5d) queryLocalInterface;
        }
        gg0 gg0Var2 = this.b;
        int i = this.a;
        f6e f6eVar = new f6e(gg0Var2, 0, null);
        pbd pbdVar = gg0Var2.k;
        pbdVar.sendMessage(pbdVar.obtainMessage(7, i, -1, f6eVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        gg0 gg0Var = this.b;
        synchronized (gg0Var.m) {
            gg0Var.n = null;
        }
        gg0 gg0Var2 = this.b;
        int i = this.a;
        pbd pbdVar = gg0Var2.k;
        pbdVar.sendMessage(pbdVar.obtainMessage(6, i, 1));
    }
}
