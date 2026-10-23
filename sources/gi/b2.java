package gi;

import ei.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
