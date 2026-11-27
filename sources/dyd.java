// default package

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class dyd implements ServiceConnection {
    public final int a;
    public final /* synthetic */ hg0 b;

    public dyd(hg0 hg0Var, int i) {
        this.b = hg0Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hg0 hg0Var = this.b;
        if (iBinder == null) {
            hg0Var.z();
            return;
        }
        synchronized (hg0Var.m) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            hg0Var.n = (queryLocalInterface == null || !(queryLocalInterface instanceof y9d)) ? new y9d(iBinder) : (y9d) queryLocalInterface;
        }
        hg0 hg0Var2 = this.b;
        int i = this.a;
        vae vaeVar = new vae(hg0Var2, 0, null);
        igd igdVar = hg0Var2.k;
        igdVar.sendMessage(igdVar.obtainMessage(7, i, -1, vaeVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        hg0 hg0Var = this.b;
        synchronized (hg0Var.m) {
            hg0Var.n = null;
        }
        hg0 hg0Var2 = this.b;
        int i = this.a;
        igd igdVar = hg0Var2.k;
        igdVar.sendMessage(igdVar.obtainMessage(6, i, 1));
    }
}
