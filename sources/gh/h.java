package gh;

import org.telegram.ui.rn;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ h(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Yb();
                break;
            default:
                rn rnVar = this.b;
                if (rnVar.getParentLayout() != null) {
                    we1.I0(rnVar);
                    break;
                }
                break;
        }
    }
}
