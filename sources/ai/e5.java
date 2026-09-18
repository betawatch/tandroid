package ai;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc b;

    public /* synthetic */ e5(jc jcVar, int i10) {
        this.a = i10;
        this.b = jcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.P();
                break;
            case 1:
                jc jcVar = this.b;
                jcVar.c0 = true;
                jcVar.n(true);
                break;
            case 2:
                jc jcVar2 = this.b;
                if (jcVar2.F != null) {
                    yb ybVar = jcVar2.v;
                    if (ybVar != null) {
                        i0.c = true;
                        ybVar.setLayerType(2, null);
                    }
                    jcVar2.F.addListener(new sb(jcVar2, 0));
                    jcVar2.F.setDuration(320L);
                    jcVar2.F.setInterpolator(qr.h);
                    jcVar2.F.start();
                    break;
                }
                break;
            case 3:
                jc jcVar3 = this.b;
                jcVar3.v0 = null;
                jcVar3.P();
                break;
            case 4:
                this.b.L(true);
                break;
            case 5:
                jc jcVar4 = this.b;
                jcVar4.Q();
                gc gcVar = jcVar4.s0;
                ImageReceiver imageReceiver = gcVar.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = gcVar.c;
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
