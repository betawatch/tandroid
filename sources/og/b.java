package og;

import org.telegram.ui.qn;
import org.telegram.ui.re1;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ b(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                if (qnVar.getParentLayout() != null) {
                    re1.I0(qnVar);
                    break;
                }
                break;
            default:
                this.b.dc();
                break;
        }
    }
}
