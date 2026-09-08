package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cc0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
