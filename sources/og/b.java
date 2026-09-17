package og;

import org.telegram.ui.co;
import org.telegram.ui.eg1;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ b(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co coVar = this.b;
                if (coVar.getParentLayout() != null) {
                    eg1.I0(coVar);
                    break;
                }
                break;
            default:
                this.b.Yb();
                break;
        }
    }
}
