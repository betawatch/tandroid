package bi;

import org.telegram.ui.bn;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ i(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Fc();
                break;
            default:
                bn bnVar = this.b;
                if (bnVar.getParentLayout() != null) {
                    w91.M0(bnVar);
                    break;
                }
                break;
        }
    }
}
