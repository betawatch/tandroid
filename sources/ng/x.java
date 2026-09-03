package ng;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ec0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ag.l lVar = d0Var.c;
                if (lVar.getParent() != null) {
                    if (d0Var.d) {
                        AndroidUtilities.removeFromParent(lVar);
                    } else {
                        try {
                            d0Var.b.removeView(lVar);
                        } catch (Exception unused) {
                        }
                    }
                    ec0 ec0Var = d0Var.p;
                    if (ec0Var != null) {
                        ec0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
