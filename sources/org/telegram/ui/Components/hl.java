package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xl b;

    public /* synthetic */ hl(xl xlVar, int i10) {
        this.a = i10;
        this.b = xlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                xl xlVar = this.b;
                double[] dArr = xlVar.b.A2;
                xlVar.e0(dArr[0], dArr[1]);
                break;
            case 1:
                xl.P(this.b);
                break;
            case 2:
                this.b.b0();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new hl(this.b, 4));
                break;
            case 4:
                View view = this.b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                xl xlVar2 = this.b;
                gg.s0 s0Var = xlVar2.O;
                if (!xlVar2.t0) {
                    IMapsProvider.IMap iMap = xlVar2.H;
                    if (iMap != null && (location = xlVar2.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        xlVar2.r0.setLongitude(xlVar2.H.getCameraPosition().target.longitude);
                    }
                    s0Var.L(xlVar2.r0);
                    s0Var.I();
                    break;
                } else {
                    xlVar2.t0 = false;
                    break;
                }
                break;
            case 6:
                ul ulVar = this.b.F;
                if (ulVar != null) {
                    ulVar.a();
                    break;
                }
                break;
            case 7:
                View view2 = this.b.M;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    break;
                }
                break;
            default:
                this.b.e0(0.0d, 0.0d);
                break;
        }
    }
}
