package mg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cc0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ x(d0 d0Var, int i10) {
        this.a = i10;
        this.b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                d0 d0Var = this.b;
                ah.d dVar = d0Var.c;
                if (dVar.getParent() != null) {
                    if (d0Var.d) {
                        AndroidUtilities.removeFromParent(dVar);
                    } else {
                        try {
                            d0Var.b.removeView(dVar);
                        } catch (Exception unused) {
                        }
                    }
                    cc0 cc0Var = d0Var.p;
                    if (cc0Var != null) {
                        cc0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
