package bi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb b;

    public /* synthetic */ p4(pb pbVar, int i10) {
        this.a = i10;
        this.b = pbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.P();
                break;
            case 1:
                pb pbVar = this.b;
                pbVar.c0 = true;
                pbVar.n(true);
                break;
            case 2:
                pb pbVar2 = this.b;
                if (pbVar2.F != null) {
                    eb ebVar = pbVar2.v;
                    if (ebVar != null) {
                        b0.c = true;
                        ebVar.setLayerType(2, null);
                    }
                    pbVar2.F.addListener(new ya(pbVar2, 0));
                    pbVar2.F.setDuration(320L);
                    pbVar2.F.setInterpolator(pr.h);
                    pbVar2.F.start();
                    break;
                }
                break;
            case 3:
                pb pbVar3 = this.b;
                pbVar3.v0 = null;
                pbVar3.P();
                break;
            case 4:
                this.b.L(true);
                break;
            case 5:
                pb pbVar4 = this.b;
                pbVar4.Q();
                mb mbVar = pbVar4.s0;
                ImageReceiver imageReceiver = mbVar.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = mbVar.c;
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
