// default package

import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class kfd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zfd b;

    public /* synthetic */ kfd(zfd zfdVar, byte b) {
        this.a = b;
        this.b = zfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zfd zfdVar = this.b;
        switch (b) {
            case 0:
                ce6 ce6Var = zfd.i;
                Log.i(ce6Var.a, ce6Var.d("transfer with type = %d has timed out", Integer.valueOf(zfdVar.e)));
                zfdVar.b(101);
                break;
            default:
                x59 x59Var = new x59(zfdVar, (byte) 29);
                l8a l8aVar = zfdVar.f;
                ite.h(l8aVar);
                l8aVar.a(x59Var);
                break;
        }
    }
}
