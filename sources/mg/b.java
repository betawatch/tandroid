package mg;

import org.telegram.ui.eo;
import org.telegram.ui.ig1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ b(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eo eoVar = this.b;
                if (eoVar.getParentLayout() != null) {
                    ig1.I0(eoVar);
                    break;
                }
                break;
            default:
                this.b.Yb();
                break;
        }
    }
}
