package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd0 b;

    public /* synthetic */ lc0(cd0 cd0Var, int i10) {
        this.a = i10;
        this.b = cd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cd0 cd0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = cd0Var.G;
                if (iCameraUpdate != null) {
                    cd0Var.F.moveCamera(iCameraUpdate);
                    cd0Var.G = null;
                    break;
                }
                break;
            case 1:
                cd0 cd0Var2 = this.b;
                cd0Var2.getLocationController().setProximityLocation(cd0Var2.b0, 0, true);
                cd0Var2.D = false;
                break;
            case 2:
                cd0 cd0Var3 = this.b;
                IMapsProvider.IMap iMap = cd0Var3.F;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!cd0Var3.O.getRadiusSet()) {
                    double d = cd0Var3.M;
                    if (d > 0.0d) {
                        cd0Var3.L.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = cd0Var3.L;
                        if (iCircle != null) {
                            iCircle.remove();
                            cd0Var3.L = null;
                        }
                    }
                }
                cd0Var3.O = null;
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
                AndroidUtilities.runOnUIThread(new lc0(this.b, 0));
                break;
        }
    }
}
