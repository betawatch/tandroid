package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rc0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                    rc0 rc0Var = t0Var.p;
                    if (rc0Var != null) {
                        rc0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
