package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk b;

    public /* synthetic */ jk(wk wkVar, int i7) {
        this.a = i7;
        this.b = wkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                wk.S(this.b);
                break;
            case 1:
                wk.U(this.b);
                break;
            case 2:
                wk wkVar = this.b;
                double[] dArr = wkVar.b.u4;
                wkVar.h0(dArr[0], dArr[1]);
                break;
            case 3:
                org.telegram.messenger.g0.h3(new jk(this.b, 6));
                break;
            case 4:
                wk wkVar2 = this.b;
                jg.r0 r0Var = wkVar2.K;
                if (!wkVar2.k0) {
                    org.telegram.messenger.fa faVar = wkVar2.D;
                    if (faVar != null && (location = wkVar2.i0) != null) {
                        location.setLatitude(((org.telegram.messenger.cb) faVar.d().b).a);
                        wkVar2.i0.setLongitude(((org.telegram.messenger.cb) wkVar2.D.d().b).b);
                    }
                    r0Var.L(wkVar2.i0);
                    r0Var.H();
                    break;
                } else {
                    wkVar2.k0 = false;
                    break;
                }
                break;
            case 5:
                View view = this.b.I;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    break;
                }
                break;
            case 6:
                View view2 = this.b.I;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                break;
            default:
                this.b.h0(0.0d, 0.0d);
                break;
        }
    }
}
