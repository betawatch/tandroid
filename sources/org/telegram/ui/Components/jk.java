package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ al b;

    public /* synthetic */ jk(al alVar, int i10) {
        this.a = i10;
        this.b = alVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                al alVar = this.b;
                double[] dArr = alVar.b.u2;
                alVar.b0(dArr[0], dArr[1]);
                break;
            case 1:
                al.M(this.b);
                break;
            case 2:
                this.b.Y();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new jk(this.b, 4));
                break;
            case 4:
                View view = this.b.J;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                al alVar2 = this.b;
                tf.h0 h0Var = alVar2.L;
                if (!alVar2.q0) {
                    IMapsProvider.IMap iMap = alVar2.E;
                    if (iMap != null && (location = alVar2.o0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        alVar2.o0.setLongitude(alVar2.E.getCameraPosition().target.longitude);
                    }
                    h0Var.L(alVar2.o0);
                    h0Var.I();
                    break;
                } else {
                    alVar2.q0 = false;
                    break;
                }
                break;
            case 6:
                xk xkVar = this.b.C;
                if (xkVar != null) {
                    xkVar.a();
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
