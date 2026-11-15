package bi;

import org.telegram.ui.an;
import org.telegram.ui.u91;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ i(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Fc();
                break;
            default:
                an anVar = this.b;
                if (anVar.getParentLayout() != null) {
                    u91.M0(anVar);
                    break;
                }
                break;
        }
    }
}
