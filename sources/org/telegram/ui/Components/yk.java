package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl b;

    public /* synthetic */ yk(kl klVar, int i7) {
        this.a = i7;
        this.b = klVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                kl.T(this.b);
                break;
            case 1:
                kl.V(this.b);
                break;
            case 2:
                kl klVar = this.b;
                double[] dArr = klVar.b.y4;
                klVar.h0(dArr[0], dArr[1]);
                break;
            case 3:
                org.telegram.messenger.g0.g3(new yk(this.b, 6));
                break;
            case 4:
                kl klVar2 = this.b;
                jg.r0 r0Var = klVar2.L;
                if (!klVar2.l0) {
                    org.telegram.messenger.da daVar = klVar2.E;
                    if (daVar != null && (location = klVar2.j0) != null) {
                        location.setLatitude(((org.telegram.messenger.ab) daVar.d().b).a);
                        klVar2.j0.setLongitude(((org.telegram.messenger.ab) klVar2.E.d().b).b);
                    }
                    r0Var.L(klVar2.j0);
                    r0Var.H();
                    break;
                } else {
                    klVar2.l0 = false;
                    break;
                }
                break;
            case 5:
                View view = this.b.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    break;
                }
                break;
            case 6:
                View view2 = this.b.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                break;
            default:
                this.b.h0(0.0d, 0.0d);
                break;
        }
    }
}
