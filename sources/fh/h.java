package fh;

import org.telegram.ui.qn;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ h(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Yb();
                break;
            default:
                qn qnVar = this.b;
                if (qnVar.getParentLayout() != null) {
                    we1.H0(qnVar);
                    break;
                }
                break;
        }
    }
}
