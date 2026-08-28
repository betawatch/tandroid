package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xk b;

    public /* synthetic */ hk(xk xkVar, int i9) {
        this.a = i9;
        this.b = xkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                xk xkVar = this.b;
                double[] dArr = xkVar.b.t2;
                xkVar.a0(dArr[0], dArr[1]);
                break;
            case 1:
                xk.L(this.b);
                break;
            case 2:
                this.b.X();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new hk(this.b, 4));
                break;
            case 4:
                View view = this.b.I;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                xk xkVar2 = this.b;
                of.p0 p0Var = xkVar2.K;
                if (!xkVar2.p0) {
                    IMapsProvider.IMap iMap = xkVar2.D;
                    if (iMap != null && (location = xkVar2.n0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        xkVar2.n0.setLongitude(xkVar2.D.getCameraPosition().target.longitude);
                    }
                    p0Var.L(xkVar2.n0);
                    p0Var.I();
                    break;
                } else {
                    xkVar2.p0 = false;
                    break;
                }
                break;
            case 6:
                uk ukVar = this.b.B;
                if (ukVar != null) {
                    ukVar.a();
                    break;
                }
                break;
            case 7:
                View view2 = this.b.I;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    break;
                }
                break;
            default:
                this.b.a0(0.0d, 0.0d);
                break;
        }
    }
}
