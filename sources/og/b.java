package og;

import org.telegram.ui.sn;
import org.telegram.ui.te1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
