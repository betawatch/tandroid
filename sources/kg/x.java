package kg;

import bg.d1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xb0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                d1 d1Var = d0Var.c;
                if (d1Var.getParent() != null) {
                    if (d0Var.d) {
                        AndroidUtilities.removeFromParent(d1Var);
                    } else {
                        try {
                            d0Var.b.removeView(d1Var);
                        } catch (Exception unused) {
                        }
                    }
                    xb0 xb0Var = d0Var.p;
                    if (xb0Var != null) {
                        xb0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
