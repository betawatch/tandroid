package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ il b;

    public /* synthetic */ sk(il ilVar, int i10) {
        this.a = i10;
        this.b = ilVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                il ilVar = this.b;
                double[] dArr = ilVar.b.x2;
                ilVar.b0(dArr[0], dArr[1]);
                break;
            case 1:
                il.M(this.b);
                break;
            case 2:
                this.b.Y();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new sk(this.b, 4));
                break;
            case 4:
                View view = this.b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                il ilVar2 = this.b;
                gg.t0 t0Var = ilVar2.O;
                if (!ilVar2.t0) {
                    IMapsProvider.IMap iMap = ilVar2.H;
                    if (iMap != null && (location = ilVar2.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        ilVar2.r0.setLongitude(ilVar2.H.getCameraPosition().target.longitude);
                    }
                    t0Var.L(ilVar2.r0);
                    t0Var.I();
                    break;
                } else {
                    ilVar2.t0 = false;
                    break;
                }
                break;
            case 6:
                fl flVar = this.b.F;
                if (flVar != null) {
                    flVar.a();
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
