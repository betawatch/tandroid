package bi;

import org.telegram.ui.bn;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                    y91.M0(bnVar);
                    break;
                }
                break;
        }
    }
}
