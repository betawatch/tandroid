package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;

    public /* synthetic */ lk(bl blVar, int i10) {
        this.a = i10;
        this.b = blVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                bl blVar = this.b;
                double[] dArr = blVar.b.u4;
                blVar.e0(dArr[0], dArr[1]);
                break;
            case 1:
                bl.P(this.b);
                break;
            case 2:
                org.telegram.messenger.i0.g3(new lk(this.b, 3));
                break;
            case 3:
                View view = this.b.K;
                view.setTag(1);
                view.animate().alpha(0.0f).setDuration(180L).start();
                break;
            case 4:
                bl blVar2 = this.b;
                zf.h0 h0Var = blVar2.M;
                if (!blVar2.q0) {
                    org.telegram.messenger.ga gaVar = blVar2.F;
                    if (gaVar != null && (location = blVar2.o0) != null) {
                        location.setLatitude(((org.telegram.messenger.cb) gaVar.d().b).a);
                        blVar2.o0.setLongitude(((org.telegram.messenger.cb) blVar2.F.d().b).b);
                    }
                    h0Var.M(blVar2.o0);
                    h0Var.I();
                    break;
                } else {
                    blVar2.q0 = false;
                    break;
                }
                break;
            case 5:
                yk ykVar = this.b.D;
                if (ykVar != null) {
                    ykVar.a();
                    break;
                }
                break;
            case 6:
                View view2 = this.b.K;
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
