package ai;

import org.telegram.ui.m91;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ l(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Bc();
                break;
            default:
                wm wmVar = this.b;
                if (wmVar.getParentLayout() != null) {
                    m91.M0(wmVar);
                    break;
                }
                break;
        }
    }
}
