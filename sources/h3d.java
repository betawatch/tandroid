// default package

import android.os.Bundle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class h3d implements ey4, fy4 {
    public final yn a;
    public final boolean b;
    public r1d c;

    public h3d(yn ynVar, boolean z) {
        this.a = ynVar;
        this.b = z;
    }

    @Override // ey4
    public final void onConnected(Bundle bundle) {
        fre.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override // fy4
    public final void onConnectionFailed(ds2 ds2Var) {
        yn ynVar = this.a;
        boolean z = this.b;
        fre.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        r1d r1dVar = this.c;
        r1dVar.a.lock();
        try {
            r1dVar.m.a1(ds2Var, ynVar, z);
        } finally {
            r1dVar.a.unlock();
        }
    }

    @Override // ey4
    public final void onConnectionSuspended(int i) {
        fre.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i);
    }
}
