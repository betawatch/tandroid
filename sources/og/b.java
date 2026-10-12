package og;

import org.telegram.ui.fo;
import org.telegram.ui.lg1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ b(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fo foVar = this.b;
                if (foVar.getParentLayout() != null) {
                    lg1.I0(foVar);
                    break;
                }
                break;
            default:
                this.b.cc();
                break;
        }
    }
}
