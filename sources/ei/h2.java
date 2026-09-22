package ei;

import ci.b9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                        b3Var.z("secondary_button_pressed", null);
                        break;
                    } else {
                        b3Var.P = System.currentTimeMillis();
                        b3Var.z("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new b9(16, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
