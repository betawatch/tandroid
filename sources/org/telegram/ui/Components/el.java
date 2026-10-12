package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class el implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul b;

    public /* synthetic */ el(ul ulVar, int i10) {
        this.a = i10;
        this.b = ulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                ul ulVar = this.b;
                double[] dArr = ulVar.b.A2;
                ulVar.e0(dArr[0], dArr[1]);
                break;
            case 1:
                ul.P(this.b);
                break;
            case 2:
                this.b.b0();
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
                ul ulVar2 = this.b;
                hg.s0 s0Var = ulVar2.O;
                if (!ulVar2.t0) {
                    IMapsProvider.IMap iMap = ulVar2.H;
                    if (iMap != null && (location = ulVar2.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        ulVar2.r0.setLongitude(ulVar2.H.getCameraPosition().target.longitude);
                    }
                    s0Var.L(ulVar2.r0);
                    s0Var.I();
                    break;
                } else {
                    ulVar2.t0 = false;
                    break;
                }
                break;
            case 6:
                rl rlVar = this.b.F;
                if (rlVar != null) {
                    rlVar.a();
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
