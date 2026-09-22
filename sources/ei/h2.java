package ei;

import ci.b9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
