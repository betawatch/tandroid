package og;

import org.telegram.ui.sn;
import org.telegram.ui.ye1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
