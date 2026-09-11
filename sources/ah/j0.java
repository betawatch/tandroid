package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cc0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
