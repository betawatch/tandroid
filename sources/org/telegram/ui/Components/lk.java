package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;

    public /* synthetic */ lk(bl blVar, int i10) {
        this.a = i10;
        this.b = blVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                bl blVar = this.b;
                double[] dArr = blVar.b.t2;
                blVar.b0(dArr[0], dArr[1]);
                break;
            case 1:
                bl.L(this.b);
                break;
            case 2:
                this.b.Y();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new lk(this.b, 4));
                break;
            case 4:
                View view = this.b.I;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                bl blVar2 = this.b;
                rf.i0 i0Var = blVar2.K;
                if (!blVar2.p0) {
                    IMapsProvider.IMap iMap = blVar2.D;
                    if (iMap != null && (location = blVar2.n0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        blVar2.n0.setLongitude(blVar2.D.getCameraPosition().target.longitude);
                    }
                    i0Var.L(blVar2.n0);
                    i0Var.I();
                    break;
                } else {
                    blVar2.p0 = false;
                    break;
                }
                break;
            case 6:
                yk ykVar = this.b.B;
                if (ykVar != null) {
                    ykVar.a();
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
                this.b.b0(0.0d, 0.0d);
                break;
        }
    }
}
