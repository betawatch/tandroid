package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tl b;

    public /* synthetic */ dl(tl tlVar, int i10) {
        this.a = i10;
        this.b = tlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                tl tlVar = this.b;
                double[] dArr = tlVar.b.A2;
                tlVar.e0(dArr[0], dArr[1]);
                break;
            case 1:
                tl.P(this.b);
                break;
            case 2:
                this.b.b0();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new dl(this.b, 4));
                break;
            case 4:
                View view = this.b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                tl tlVar2 = this.b;
                hg.s0 s0Var = tlVar2.O;
                if (!tlVar2.t0) {
                    IMapsProvider.IMap iMap = tlVar2.H;
                    if (iMap != null && (location = tlVar2.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        tlVar2.r0.setLongitude(tlVar2.H.getCameraPosition().target.longitude);
                    }
                    s0Var.L(tlVar2.r0);
                    s0Var.I();
                    break;
                } else {
                    tlVar2.t0 = false;
                    break;
                }
                break;
            case 6:
                ql qlVar = this.b.F;
                if (qlVar != null) {
                    qlVar.a();
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
