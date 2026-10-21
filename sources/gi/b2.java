package gi;

import ei.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ b2(d3 d3Var, int i10) {
        this.a = i10;
        this.b = d3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                v2 v2Var = this.b.x;
                if (v2Var != null) {
                    if (!bool.booleanValue()) {
                        v2Var.P = System.currentTimeMillis();
                        v2Var.y("secondary_button_pressed", null);
                        break;
                    } else {
                        v2Var.P = System.currentTimeMillis();
                        v2Var.y("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new p6(15, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
