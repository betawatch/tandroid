package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl b;

    public /* synthetic */ rk(hl hlVar, int i10) {
        this.a = i10;
        this.b = hlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                hl hlVar = this.b;
                double[] dArr = hlVar.b.x2;
                hlVar.b0(dArr[0], dArr[1]);
                break;
            case 1:
                hl.M(this.b);
                break;
            case 2:
                this.b.Y();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new rk(this.b, 4));
                break;
            case 4:
                View view = this.b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                hl hlVar2 = this.b;
                gg.t0 t0Var = hlVar2.O;
                if (!hlVar2.t0) {
                    IMapsProvider.IMap iMap = hlVar2.H;
                    if (iMap != null && (location = hlVar2.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        hlVar2.r0.setLongitude(hlVar2.H.getCameraPosition().target.longitude);
                    }
                    t0Var.L(hlVar2.r0);
                    t0Var.I();
                    break;
                } else {
                    hlVar2.t0 = false;
                    break;
                }
                break;
            case 6:
                el elVar = this.b.F;
                if (elVar != null) {
                    elVar.a();
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
                this.b.b0(0.0d, 0.0d);
                break;
        }
    }
}
