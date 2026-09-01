package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd0 b;

    public /* synthetic */ kc0(bd0 bd0Var, int i10) {
        this.a = i10;
        this.b = bd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bd0 bd0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = bd0Var.G;
                if (iCameraUpdate != null) {
                    bd0Var.F.moveCamera(iCameraUpdate);
                    bd0Var.G = null;
                    break;
                }
                break;
            case 1:
                bd0 bd0Var2 = this.b;
                bd0Var2.getLocationController().setProximityLocation(bd0Var2.b0, 0, true);
                bd0Var2.D = false;
                break;
            case 2:
                bd0 bd0Var3 = this.b;
                IMapsProvider.IMap iMap = bd0Var3.F;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!bd0Var3.O.getRadiusSet()) {
                    double d = bd0Var3.M;
                    if (d > 0.0d) {
                        bd0Var3.L.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = bd0Var3.L;
                        if (iCircle != null) {
                            iCircle.remove();
                            bd0Var3.L = null;
                        }
                    }
                }
                bd0Var3.O = null;
                break;
            case 3:
                yc0 yc0Var = this.b.x;
                if (yc0Var != null) {
                    yc0Var.a();
                    break;
                }
                break;
            case 4:
                bd0.W(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new kc0(this.b, 0));
                break;
        }
    }
}
