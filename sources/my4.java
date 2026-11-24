// default package

import android.os.Bundle;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class my4 implements ey4 {
    public final /* synthetic */ lh5 a;

    public my4(lh5 lh5Var) {
        this.a = lh5Var;
    }

    @Override // ey4
    public final void onConnected(Bundle bundle) {
        eb6 eb6Var = (eb6) this.a;
        eb6Var.M = true;
        try {
            ((xl3) a.i()).checkLocationSettings(eb6Var.O, new ya6(eb6Var, (byte) 1));
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override // ey4
    public final void onConnectionSuspended(int i) {
        this.a.getClass();
    }
}
