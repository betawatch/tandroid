package h8;

import i8.n0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;
    public final /* synthetic */ m c;

    public /* synthetic */ q(m mVar, n0 n0Var, int i9) {
        this.a = i9;
        this.c = mVar;
        this.b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.c.onPeerConnected(this.b);
                break;
            default:
                this.c.c.onPeerDisconnected(this.b);
                break;
        }
    }
}
