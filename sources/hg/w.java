package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ib0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ w(e0 e0Var, int i9) {
        this.a = i9;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                e0 e0Var = this.b;
                fh.v vVar = e0Var.c;
                if (vVar.getParent() != null) {
                    if (e0Var.d) {
                        AndroidUtilities.removeFromParent(vVar);
                    } else {
                        try {
                            e0Var.b.removeView(vVar);
                        } catch (Exception unused) {
                        }
                    }
                    ib0 ib0Var = e0Var.p;
                    if (ib0Var != null) {
                        ib0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
