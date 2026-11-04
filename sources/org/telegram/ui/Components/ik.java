package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ik implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uk b;

    public /* synthetic */ ik(uk ukVar, int i3) {
        this.a = i3;
        this.b = ukVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                uk.S(this.b);
                break;
            case 1:
                uk.U(this.b);
                break;
            case 2:
                uk ukVar = this.b;
                double[] dArr = ukVar.b.v4;
                ukVar.h0(dArr[0], dArr[1]);
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ik(this.b, 6));
                break;
            case 4:
                uk ukVar2 = this.b;
                kg.o0 o0Var = ukVar2.L;
                if (!ukVar2.l0) {
                    org.telegram.messenger.z9 z9Var = ukVar2.E;
                    if (z9Var != null && (location = ukVar2.j0) != null) {
                        location.setLatitude(((org.telegram.messenger.va) z9Var.d().b).a);
                        ukVar2.j0.setLongitude(((org.telegram.messenger.va) ukVar2.E.d().b).b);
                    }
                    o0Var.L(ukVar2.j0);
                    o0Var.H();
                    break;
                } else {
                    ukVar2.l0 = false;
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
