package ei;

import ci.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ i2(l3 l3Var, int i10) {
        this.a = i10;
        this.b = l3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                c3 c3Var = this.b.x;
                if (c3Var != null) {
                    if (!bool.booleanValue()) {
                        c3Var.P = System.currentTimeMillis();
                        c3Var.z("secondary_button_pressed", null);
                        break;
                    } else {
                        c3Var.P = System.currentTimeMillis();
                        c3Var.z("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new x8(16, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
