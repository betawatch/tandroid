package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yb0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ i0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                t0 t0Var = this.b;
                v vVar = t0Var.c;
                if (vVar.getParent() != null) {
                    if (t0Var.d) {
                        AndroidUtilities.removeFromParent(vVar);
                    } else {
                        try {
                            t0Var.b.removeView(vVar);
                        } catch (Exception unused) {
                        }
                    }
                    yb0 yb0Var = t0Var.p;
                    if (yb0Var != null) {
                        yb0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
