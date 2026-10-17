package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa b;

    public /* synthetic */ t3(aa aaVar, int i10) {
        this.a = i10;
        this.b = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.P();
                break;
            case 1:
                aa aaVar = this.b;
                aaVar.c0 = true;
                aaVar.n(true);
                break;
            case 2:
                aa aaVar2 = this.b;
                if (aaVar2.F != null) {
                    p9 p9Var = aaVar2.v;
                    if (p9Var != null) {
                        w.c = true;
                        p9Var.setLayerType(2, null);
                    }
                    aaVar2.F.addListener(new j9(aaVar2, 0));
                    aaVar2.F.setDuration(320L);
                    aaVar2.F.setInterpolator(bs.h);
                    aaVar2.F.start();
                    break;
                }
                break;
            case 3:
                aa aaVar3 = this.b;
                aaVar3.v0 = null;
                aaVar3.P();
                break;
            case 4:
                this.b.L(true);
                break;
            case 5:
                aa aaVar4 = this.b;
                aaVar4.Q();
                x9 x9Var = aaVar4.s0;
                ImageReceiver imageReceiver = x9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = x9Var.c;
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
