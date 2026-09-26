package ng;

import org.telegram.ui.wf1;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ b(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                if (wnVar.getParentLayout() != null) {
                    wf1.I0(wnVar);
                    break;
                }
                break;
            default:
                this.b.Yb();
                break;
        }
    }
}
