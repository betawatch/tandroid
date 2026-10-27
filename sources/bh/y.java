package bh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xa0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                    xa0 xa0Var = i0Var.p;
                    if (xa0Var != null) {
                        xa0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
