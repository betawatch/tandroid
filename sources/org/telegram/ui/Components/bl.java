package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sl b;

    public /* synthetic */ bl(sl slVar, int i10) {
        this.a = i10;
        this.b = slVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                sl slVar = this.b;
                double[] dArr = slVar.b.D2;
                slVar.e0(dArr[0], dArr[1]);
                break;
            case 1:
                sl.P(this.b);
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new bl(this.b, 3));
                break;
            case 3:
                View view = this.b.K;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 4:
                sl slVar2 = this.b;
                ig.s0 s0Var = slVar2.M;
                if (!slVar2.q0) {
                    IMapsProvider.IMap iMap = slVar2.F;
                    if (iMap != null && (location = slVar2.o0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        slVar2.o0.setLongitude(slVar2.F.getCameraPosition().target.longitude);
                    }
                    s0Var.L(slVar2.o0);
                    s0Var.I();
                    break;
                } else {
                    slVar2.q0 = false;
                    break;
                }
                break;
            case 5:
                pl plVar = this.b.y;
                if (plVar != null) {
                    plVar.a();
                    break;
                }
                break;
            case 6:
                View view2 = this.b.K;
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
