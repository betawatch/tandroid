package n6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c0 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ g b;

    public c0(g gVar, int i10) {
        this.b = gVar;
        this.a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        g gVar = this.b;
        if (iBinder == null) {
            g.D(gVar);
            return;
        }
        synchronized (gVar.x) {
            try {
                g gVar2 = this.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                gVar2.y = (queryLocalInterface == null || !(queryLocalInterface instanceof y)) ? new y(iBinder) : (y) queryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar3 = this.b;
        int i10 = this.a;
        e0 e0Var = new e0(gVar3, 0, null);
        a0 a0Var = gVar3.v;
        a0Var.sendMessage(a0Var.obtainMessage(7, i10, -1, e0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar;
        synchronized (this.b.x) {
            gVar = this.b;
            gVar.y = null;
        }
        int i10 = this.a;
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(6, i10, 1));
    }
}
