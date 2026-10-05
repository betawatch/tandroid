package ng;

import org.telegram.ui.wf1;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ b(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yn ynVar = this.b;
                if (ynVar.getParentLayout() != null) {
                    wf1.I0(ynVar);
                    break;
                }
                break;
            default:
                this.b.Xb();
                break;
        }
    }
}
