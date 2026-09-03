package ag;

import org.telegram.ui.sf1;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ c(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                if (znVar.getParentLayout() != null) {
                    sf1.I0(znVar);
                    break;
                }
                break;
            default:
                this.b.Yb();
                break;
        }
    }
}
