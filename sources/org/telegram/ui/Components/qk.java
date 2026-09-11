package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl b;

    public /* synthetic */ qk(gl glVar, int i10) {
        this.a = i10;
        this.b = glVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                gl glVar = this.b;
                double[] dArr = glVar.b.x2;
                glVar.b0(dArr[0], dArr[1]);
                break;
            case 1:
                gl.M(this.b);
                break;
            case 2:
                this.b.Y();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new qk(this.b, 4));
                break;
            case 4:
                View view = this.b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                gl glVar2 = this.b;
                hg.t0 t0Var = glVar2.O;
                if (!glVar2.t0) {
                    IMapsProvider.IMap iMap = glVar2.H;
                    if (iMap != null && (location = glVar2.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        glVar2.r0.setLongitude(glVar2.H.getCameraPosition().target.longitude);
                    }
                    t0Var.L(glVar2.r0);
                    t0Var.I();
                    break;
                } else {
                    glVar2.t0 = false;
                    break;
                }
                break;
            case 6:
                dl dlVar = this.b.F;
                if (dlVar != null) {
                    dlVar.a();
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
