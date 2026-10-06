package ng;

import org.telegram.ui.wf1;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
