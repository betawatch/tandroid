package fi;

import di.x6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ h2(k3 k3Var, int i10) {
        this.a = i10;
        this.b = k3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                b3 b3Var = this.b.x;
                if (b3Var != null) {
                    if (!bool.booleanValue()) {
                        b3Var.P = System.currentTimeMillis();
                        b3Var.y("secondary_button_pressed", null);
                        break;
                    } else {
                        b3Var.P = System.currentTimeMillis();
                        b3Var.y("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new x6(26, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
