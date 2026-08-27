package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc0 b;

    public /* synthetic */ cc0(tc0 tc0Var, int i10) {
        this.a = i10;
        this.b = tc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tc0 tc0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = tc0Var.F;
                if (iCameraUpdate != null) {
                    tc0Var.E.moveCamera(iCameraUpdate);
                    tc0Var.F = null;
                    break;
                }
                break;
            case 1:
                tc0 tc0Var2 = this.b;
                tc0Var2.getLocationController().setProximityLocation(tc0Var2.a0, 0, true);
                tc0Var2.C = false;
                break;
            case 2:
                tc0 tc0Var3 = this.b;
                IMapsProvider.IMap iMap = tc0Var3.E;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!tc0Var3.N.getRadiusSet()) {
                    double d = tc0Var3.L;
                    if (d > 0.0d) {
                        tc0Var3.K.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = tc0Var3.K;
                        if (iCircle != null) {
                            iCircle.remove();
                            tc0Var3.K = null;
                        }
                    }
                }
                tc0Var3.N = null;
                break;
            case 3:
                qc0 qc0Var = this.b.x;
                if (qc0Var != null) {
                    qc0Var.a();
                    break;
                }
                break;
            case 4:
                tc0.W(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new cc0(this.b, 0));
                break;
        }
    }
}
