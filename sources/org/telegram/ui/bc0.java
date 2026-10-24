package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc0 b;

    public /* synthetic */ bc0(sc0 sc0Var, int i10) {
        this.a = i10;
        this.b = sc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sc0 sc0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = sc0Var.J;
                if (iCameraUpdate != null) {
                    sc0Var.I.moveCamera(iCameraUpdate);
                    sc0Var.J = null;
                    break;
                }
                break;
            case 1:
                sc0 sc0Var2 = this.b;
                sc0Var2.getLocationController().setProximityLocation(sc0Var2.e0, 0, true);
                sc0Var2.G = false;
                break;
            case 2:
                sc0 sc0Var3 = this.b;
                IMapsProvider.IMap iMap = sc0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!sc0Var3.R.getRadiusSet()) {
                    double d = sc0Var3.P;
                    if (d > 0.0d) {
                        sc0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = sc0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            sc0Var3.O = null;
                        }
                    }
                }
                sc0Var3.R = null;
                break;
            case 3:
                pc0 pc0Var = this.b.x;
                if (pc0Var != null) {
                    pc0Var.a();
                    break;
                }
                break;
            case 4:
                sc0.V(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new bc0(this.b, 0));
                break;
        }
    }
}
