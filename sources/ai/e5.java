package ai;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ e5(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.P();
                break;
            case 1:
                kc kcVar = this.b;
                kcVar.c0 = true;
                kcVar.n(true);
                break;
            case 2:
                kc kcVar2 = this.b;
                if (kcVar2.F != null) {
                    zb zbVar = kcVar2.v;
                    if (zbVar != null) {
                        i0.c = true;
                        zbVar.setLayerType(2, null);
                    }
                    kcVar2.F.addListener(new tb(kcVar2, 0));
                    kcVar2.F.setDuration(320L);
                    kcVar2.F.setInterpolator(hs.h);
                    kcVar2.F.start();
                    break;
                }
                break;
            case 3:
                kc kcVar3 = this.b;
                kcVar3.v0 = null;
                kcVar3.P();
                break;
            case 4:
                this.b.L(true);
                break;
            case 5:
                kc kcVar4 = this.b;
                kcVar4.Q();
                hc hcVar = kcVar4.s0;
                ImageReceiver imageReceiver = hcVar.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = hcVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    break;
                }
                break;
            default:
                this.b.m();
                break;
        }
    }
}
