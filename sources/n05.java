// default package

import android.os.Bundle;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n05 implements f05 {
    public final /* synthetic */ kj5 a;

    public n05(kj5 kj5Var) {
        this.a = kj5Var;
    }

    @Override // f05
    public final void onConnected(Bundle bundle) {
        dd6 dd6Var = (dd6) this.a;
        dd6Var.M = true;
        try {
            ((in3) a.i()).checkLocationSettings(dd6Var.O, new xc6(dd6Var, (byte) 1));
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override // f05
    public final void onConnectionSuspended(int i) {
        this.a.getClass();
    }
}
