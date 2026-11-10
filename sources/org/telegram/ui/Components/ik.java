package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ik implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vk b;

    public /* synthetic */ ik(vk vkVar, int i7) {
        this.a = i7;
        this.b = vkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Location location;
        switch (this.a) {
            case 0:
                vk.S(this.b);
                break;
            case 1:
                vk.U(this.b);
                break;
            case 2:
                vk vkVar = this.b;
                double[] dArr = vkVar.b.x4;
                vkVar.h0(dArr[0], dArr[1]);
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ik(this.b, 6));
                break;
            case 4:
                vk vkVar2 = this.b;
                jg.r0 r0Var = vkVar2.K;
                if (!vkVar2.k0) {
                    org.telegram.messenger.fa faVar = vkVar2.D;
                    if (faVar != null && (location = vkVar2.i0) != null) {
                        location.setLatitude(((org.telegram.messenger.cb) faVar.d().b).a);
                        vkVar2.i0.setLongitude(((org.telegram.messenger.cb) vkVar2.D.d().b).b);
                    }
                    r0Var.L(vkVar2.i0);
                    r0Var.H();
                    break;
                } else {
                    vkVar2.k0 = false;
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
