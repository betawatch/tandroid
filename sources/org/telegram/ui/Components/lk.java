package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl b;

    public /* synthetic */ lk(cl clVar, int i10) {
        this.a = i10;
        this.b = clVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                cl clVar = this.b;
                double[] dArr = clVar.b.u2;
                clVar.b0(dArr[0], dArr[1]);
                break;
            case 1:
                cl.M(this.b);
                break;
            case 2:
                this.b.Y();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new lk(this.b, 4));
                break;
            case 4:
                View view = this.b.J;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                cl clVar2 = this.b;
                uf.h0 h0Var = clVar2.L;
                if (!clVar2.q0) {
                    IMapsProvider.IMap iMap = clVar2.E;
                    if (iMap != null && (location = clVar2.o0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        clVar2.o0.setLongitude(clVar2.E.getCameraPosition().target.longitude);
                    }
                    h0Var.L(clVar2.o0);
                    h0Var.I();
                    break;
                } else {
                    clVar2.q0 = false;
                    break;
                }
                break;
            case 6:
                zk zkVar = this.b.C;
                if (zkVar != null) {
                    zkVar.a();
                    break;
                }
                break;
            case 7:
                View view2 = this.b.J;
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
