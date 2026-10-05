package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl b;

    public /* synthetic */ tk(jl jlVar, int i10) {
        this.a = i10;
        this.b = jlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                jl jlVar = this.b;
                double[] dArr = jlVar.b.x2;
                jlVar.b0(dArr[0], dArr[1]);
                break;
            case 1:
                jl.K(this.b);
                break;
            case 2:
                this.b.X();
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new tk(this.b, 4));
                break;
            case 4:
                View view = this.b.M;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 5:
                jl jlVar2 = this.b;
                gg.t0 t0Var = jlVar2.O;
                if (!jlVar2.t0) {
                    IMapsProvider.IMap iMap = jlVar2.H;
                    if (iMap != null && (location = jlVar2.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        jlVar2.r0.setLongitude(jlVar2.H.getCameraPosition().target.longitude);
                    }
                    t0Var.L(jlVar2.r0);
                    t0Var.I();
                    break;
                } else {
                    jlVar2.t0 = false;
                    break;
                }
                break;
            case 6:
                gl glVar = this.b.F;
                if (glVar != null) {
                    glVar.a();
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
