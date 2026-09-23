package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd0 b;

    public /* synthetic */ nc0(dd0 dd0Var, int i10) {
        this.a = i10;
        this.b = dd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dd0 dd0Var = this.b;
                IMapsProvider.ICameraUpdate iCameraUpdate = dd0Var.J;
                if (iCameraUpdate != null) {
                    dd0Var.I.moveCamera(iCameraUpdate);
                    dd0Var.J = null;
                    break;
                }
                break;
            case 1:
                dd0 dd0Var2 = this.b;
                dd0Var2.getLocationController().setProximityLocation(dd0Var2.e0, 0, true);
                dd0Var2.G = false;
                break;
            case 2:
                dd0 dd0Var3 = this.b;
                IMapsProvider.IMap iMap = dd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!dd0Var3.R.getRadiusSet()) {
                    double d = dd0Var3.P;
                    if (d > 0.0d) {
                        dd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = dd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            dd0Var3.O = null;
                        }
                    }
                }
                dd0Var3.R = null;
                break;
            case 3:
                ad0 ad0Var = this.b.x;
                if (ad0Var != null) {
                    ad0Var.a();
                    break;
                }
                break;
            case 4:
                dd0.W(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(new nc0(this.b, 0));
                break;
        }
    }
}
