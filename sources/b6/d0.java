package b6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d0 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ g b;

    public d0(g gVar, int i10) {
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
                gVar2.y = (queryLocalInterface == null || !(queryLocalInterface instanceof z)) ? new z(iBinder) : (z) queryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar3 = this.b;
        int i10 = this.a;
        f0 f0Var = new f0(gVar3, 0, null);
        b0 b0Var = gVar3.v;
        b0Var.sendMessage(b0Var.obtainMessage(7, i10, -1, f0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar;
        synchronized (this.b.x) {
            gVar = this.b;
            gVar.y = null;
        }
        int i10 = this.a;
        b0 b0Var = gVar.v;
        b0Var.sendMessage(b0Var.obtainMessage(6, i10, 1));
    }
}
