package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl b;

    public /* synthetic */ rk(dl dlVar, int i7) {
        this.a = i7;
        this.b = dlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                dl.T(this.b);
                break;
            case 1:
                dl.V(this.b);
                break;
            case 2:
                dl dlVar = this.b;
                double[] dArr = dlVar.b.y4;
                dlVar.h0(dArr[0], dArr[1]);
                break;
            case 3:
                org.telegram.messenger.g0.h3(new rk(this.b, 6));
                break;
            case 4:
                dl dlVar2 = this.b;
                jg.r0 r0Var = dlVar2.L;
                if (!dlVar2.l0) {
                    org.telegram.messenger.ea eaVar = dlVar2.E;
                    if (eaVar != null && (location = dlVar2.j0) != null) {
                        location.setLatitude(((org.telegram.messenger.bb) eaVar.d().b).a);
                        dlVar2.j0.setLongitude(((org.telegram.messenger.bb) dlVar2.E.d().b).b);
                    }
                    r0Var.L(dlVar2.j0);
                    r0Var.H();
                    break;
                } else {
                    dlVar2.l0 = false;
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
