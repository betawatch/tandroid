package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rl b;

    public /* synthetic */ bl(rl rlVar, int i10) {
        this.a = i10;
        this.b = rlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                rl rlVar = this.b;
                double[] dArr = rlVar.b.D2;
                rlVar.f0(dArr[0], dArr[1]);
                break;
            case 1:
                rl.P(this.b);
                break;
            case 2:
                this.b.c0();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new bl(this.b, 4));
                break;
            case 4:
                View view = this.b.K;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                rl rlVar2 = this.b;
                hg.s0 s0Var = rlVar2.M;
                if (!rlVar2.r0) {
                    IMapsProvider.IMap iMap = rlVar2.F;
                    if (iMap != null && (location = rlVar2.p0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        rlVar2.p0.setLongitude(rlVar2.F.getCameraPosition().target.longitude);
                    }
                    s0Var.L(rlVar2.p0);
                    s0Var.I();
                    break;
                } else {
                    rlVar2.r0 = false;
                    break;
                }
                break;
            case 6:
                ol olVar = this.b.y;
                if (olVar != null) {
                    olVar.a();
                    break;
                }
                break;
            case 7:
                View view2 = this.b.K;
                if (view2.getTag() == null) {
                    view2.animate().alpha(0.0f).setDuration(180L).start();
                    break;
                }
                break;
            default:
                this.b.f0(0.0d, 0.0d);
                break;
        }
    }
}
