package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd0 b;

    public /* synthetic */ mc0(cd0 cd0Var, int i10) {
        this.a = i10;
        this.b = cd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cd0 cd0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = cd0Var.J;
                if (iCameraUpdate != null) {
                    cd0Var.I.moveCamera(iCameraUpdate);
                    cd0Var.J = null;
                    break;
                }
                break;
            case 1:
                cd0 cd0Var2 = this.b;
                cd0Var2.getLocationController().setProximityLocation(cd0Var2.e0, 0, true);
                cd0Var2.G = false;
                break;
            case 2:
                cd0 cd0Var3 = this.b;
                IMapsProvider.IMap iMap = cd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!cd0Var3.R.getRadiusSet()) {
                    double d = cd0Var3.P;
                    if (d > 0.0d) {
                        cd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = cd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            cd0Var3.O = null;
                        }
                    }
                }
                cd0Var3.R = null;
                break;
            case 3:
                zc0 zc0Var = this.b.x;
                if (zc0Var != null) {
                    zc0Var.a();
                    break;
                }
                break;
            case 4:
                cd0.W(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new mc0(this.b, 0));
                break;
        }
    }
}
