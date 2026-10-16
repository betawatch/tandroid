package bi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ r4(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.P();
                break;
            case 1:
                sb sbVar = this.b;
                sbVar.c0 = true;
                sbVar.n(true);
                break;
            case 2:
                sb sbVar2 = this.b;
                if (sbVar2.F != null) {
                    hb hbVar = sbVar2.v;
                    if (hbVar != null) {
                        b0.c = true;
                        hbVar.setLayerType(2, null);
                    }
                    sbVar2.F.addListener(new bb(sbVar2, 0));
                    sbVar2.F.setDuration(320L);
                    sbVar2.F.setInterpolator(es.h);
                    sbVar2.F.start();
                    break;
                }
                break;
            case 3:
                sb sbVar3 = this.b;
                sbVar3.v0 = null;
                sbVar3.P();
                break;
            case 4:
                this.b.L(true);
                break;
            case 5:
                sb sbVar4 = this.b;
                sbVar4.Q();
                pb pbVar = sbVar4.s0;
                ImageReceiver imageReceiver = pbVar.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = pbVar.c;
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
