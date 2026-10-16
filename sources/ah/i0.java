package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yc0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
