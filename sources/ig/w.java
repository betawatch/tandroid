package ig;

import ag.y1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mb0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ w(d0 d0Var, int i10) {
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
                y1 y1Var = d0Var.c;
                if (y1Var.getParent() != null) {
                    if (d0Var.d) {
                        AndroidUtilities.removeFromParent(y1Var);
                    } else {
                        try {
                            d0Var.b.removeView(y1Var);
                        } catch (Exception unused) {
                        }
                    }
                    mb0 mb0Var = d0Var.p;
                    if (mb0Var != null) {
                        mb0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
