package bh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wa0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ y(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                i0 i0Var = this.b;
                p pVar = i0Var.c;
                if (pVar.getParent() != null) {
                    if (i0Var.d) {
                        AndroidUtilities.removeFromParent(pVar);
                    } else {
                        try {
                            i0Var.b.removeView(pVar);
                        } catch (Exception unused) {
                        }
                    }
                    wa0 wa0Var = i0Var.p;
                    if (wa0Var != null) {
                        wa0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
