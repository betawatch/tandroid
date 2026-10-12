package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yc0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                    yc0 yc0Var = t0Var.p;
                    if (yc0Var != null) {
                        yc0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
