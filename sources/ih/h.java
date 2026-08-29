package ih;

import org.telegram.ui.tn;
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ h(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Yb();
                break;
            default:
                tn tnVar = this.b;
                if (tnVar.getParentLayout() != null) {
                    ze1.I0(tnVar);
                    break;
                }
                break;
        }
    }
}
