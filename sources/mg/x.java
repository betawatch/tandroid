package mg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dc0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                ah.e eVar = d0Var.c;
                if (eVar.getParent() != null) {
                    if (d0Var.d) {
                        AndroidUtilities.removeFromParent(eVar);
                    } else {
                        try {
                            d0Var.b.removeView(eVar);
                        } catch (Exception unused) {
                        }
                    }
                    dc0 dc0Var = d0Var.p;
                    if (dc0Var != null) {
                        dc0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
