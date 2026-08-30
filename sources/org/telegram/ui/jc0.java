package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad0 b;

    public /* synthetic */ jc0(ad0 ad0Var, int i10) {
        this.a = i10;
        this.b = ad0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ad0 ad0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = ad0Var.G;
                if (iCameraUpdate != null) {
                    ad0Var.F.moveCamera(iCameraUpdate);
                    ad0Var.G = null;
                    break;
                }
                break;
            case 1:
                ad0 ad0Var2 = this.b;
                ad0Var2.getLocationController().setProximityLocation(ad0Var2.b0, 0, true);
                ad0Var2.D = false;
                break;
            case 2:
                ad0 ad0Var3 = this.b;
                IMapsProvider.IMap iMap = ad0Var3.F;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!ad0Var3.O.getRadiusSet()) {
                    double d = ad0Var3.M;
                    if (d > 0.0d) {
                        ad0Var3.L.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = ad0Var3.L;
                        if (iCircle != null) {
                            iCircle.remove();
                            ad0Var3.L = null;
                        }
                    }
                }
                ad0Var3.O = null;
                break;
            case 3:
                xc0 xc0Var = this.b.x;
                if (xc0Var != null) {
                    xc0Var.a();
                    break;
                }
                break;
            case 4:
                ad0.W(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new jc0(this.b, 0));
                break;
        }
    }
}
