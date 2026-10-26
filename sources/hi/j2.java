package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ j2(m3 m3Var, int i10) {
        this.a = i10;
        this.b = m3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                e3 e3Var = this.b.y;
                if (e3Var != null) {
                    if (!bool.booleanValue()) {
                        e3Var.P = System.currentTimeMillis();
                        e3Var.y("secondary_button_pressed", null);
                        break;
                    } else {
                        e3Var.P = System.currentTimeMillis();
                        e3Var.y("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new e2.q0(28, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
