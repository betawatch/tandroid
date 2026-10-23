package og;

import org.telegram.ui.sn;
import org.telegram.ui.ye1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ b(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                if (snVar.getParentLayout() != null) {
                    ye1.H0(snVar);
                    break;
                }
                break;
            default:
                this.b.ec();
                break;
        }
    }
}
