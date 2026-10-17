package og;

import org.telegram.ui.sn;
import org.telegram.ui.te1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                    te1.I0(snVar);
                    break;
                }
                break;
            default:
                this.b.cc();
                break;
        }
    }
}
