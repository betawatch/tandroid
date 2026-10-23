package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class el implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rl b;

    public /* synthetic */ el(rl rlVar, int i10) {
        this.a = i10;
        this.b = rlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                rl.P(this.b);
                break;
            case 1:
                this.b.b0();
                break;
            case 2:
                rl rlVar = this.b;
                double[] dArr = rlVar.b.A2;
                rlVar.e0(dArr[0], dArr[1]);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new el(this.b, 4));
                break;
            case 4:
                View view = this.b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                rl rlVar2 = this.b;
                hg.s0 s0Var = rlVar2.O;
                if (!rlVar2.t0) {
                    IMapsProvider.IMap iMap = rlVar2.H;
                    if (iMap != null && (location = rlVar2.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        rlVar2.r0.setLongitude(rlVar2.H.getCameraPosition().target.longitude);
                    }
                    s0Var.L(rlVar2.r0);
                    s0Var.I();
                    break;
                } else {
                    rlVar2.t0 = false;
                    break;
                }
                break;
            case 6:
                ol olVar = this.b.F;
                if (olVar != null) {
                    olVar.a();
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
