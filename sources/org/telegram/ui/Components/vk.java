package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll b;

    public /* synthetic */ vk(ll llVar, int i10) {
        this.a = i10;
        this.b = llVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                ll llVar = this.b;
                double[] dArr = llVar.b.x2;
                llVar.b0(dArr[0], dArr[1]);
                break;
            case 1:
                ll.M(this.b);
                break;
            case 2:
                this.b.Y();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new vk(this.b, 4));
                break;
            case 4:
                View view = this.b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                ll llVar2 = this.b;
                fg.t0 t0Var = llVar2.O;
                if (!llVar2.t0) {
                    IMapsProvider.IMap iMap = llVar2.H;
                    if (iMap != null && (location = llVar2.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        llVar2.r0.setLongitude(llVar2.H.getCameraPosition().target.longitude);
                    }
                    t0Var.L(llVar2.r0);
                    t0Var.I();
                    break;
                } else {
                    llVar2.t0 = false;
                    break;
                }
                break;
            case 6:
                il ilVar = this.b.F;
                if (ilVar != null) {
                    ilVar.a();
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
