package ai;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc b;

    public /* synthetic */ d5(jc jcVar, int i10) {
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
                    jcVar2.F.setInterpolator(rr.h);
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
