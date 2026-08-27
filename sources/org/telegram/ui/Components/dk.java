package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tk b;

    public /* synthetic */ dk(tk tkVar, int i10) {
        this.a = i10;
        this.b = tkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                tk tkVar = this.b;
                double[] dArr = tkVar.b.t2;
                tkVar.b0(dArr[0], dArr[1]);
                break;
            case 1:
                tk.M(this.b);
                break;
            case 2:
                this.b.Y();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new dk(this.b, 4));
                break;
            case 4:
                View view = this.b.I;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                tk tkVar2 = this.b;
                pf.h0 h0Var = tkVar2.K;
                if (!tkVar2.p0) {
                    IMapsProvider.IMap iMap = tkVar2.D;
                    if (iMap != null && (location = tkVar2.n0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        tkVar2.n0.setLongitude(tkVar2.D.getCameraPosition().target.longitude);
                    }
                    h0Var.L(tkVar2.n0);
                    h0Var.I();
                    break;
                } else {
                    tkVar2.p0 = false;
                    break;
                }
                break;
            case 6:
                qk qkVar = this.b.B;
                if (qkVar != null) {
                    qkVar.a();
                    break;
                }
                break;
            case 7:
                View view2 = this.b.I;
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
