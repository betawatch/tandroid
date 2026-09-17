package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cc0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ j0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                u0 u0Var = this.b;
                w wVar = u0Var.c;
                if (wVar.getParent() != null) {
                    if (u0Var.d) {
                        AndroidUtilities.removeFromParent(wVar);
                    } else {
                        try {
                            u0Var.b.removeView(wVar);
                        } catch (Exception unused) {
                        }
                    }
                    cc0 cc0Var = u0Var.p;
                    if (cc0Var != null) {
                        cc0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
