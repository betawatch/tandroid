package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;

    public /* synthetic */ qc0(gd0 gd0Var, int i10) {
        this.a = i10;
        this.b = gd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gd0 gd0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = gd0Var.J;
                if (iCameraUpdate != null) {
                    gd0Var.I.moveCamera(iCameraUpdate);
                    gd0Var.J = null;
                    break;
                }
                break;
            case 1:
                gd0 gd0Var2 = this.b;
                gd0Var2.getLocationController().setProximityLocation(gd0Var2.e0, 0, true);
                gd0Var2.G = false;
                break;
            case 2:
                gd0 gd0Var3 = this.b;
                IMapsProvider.IMap iMap = gd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!gd0Var3.R.getRadiusSet()) {
                    double d = gd0Var3.P;
                    if (d > 0.0d) {
                        gd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = gd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            gd0Var3.O = null;
                        }
                    }
                }
                gd0Var3.R = null;
                break;
            case 3:
                dd0 dd0Var = this.b.x;
                if (dd0Var != null) {
                    dd0Var.a();
                    break;
                }
                break;
            case 4:
                gd0.U(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new qc0(this.b, 0));
                break;
        }
    }
}
