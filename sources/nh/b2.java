package nh;

import lh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;

    public /* synthetic */ b2(b3 b3Var, int i10) {
        this.a = i10;
        this.b = b3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                t2 t2Var = this.b.x;
                if (t2Var != null) {
                    if (!bool.booleanValue()) {
                        t2Var.L = System.currentTimeMillis();
                        t2Var.v("secondary_button_pressed", null);
                        break;
                    } else {
                        t2Var.L = System.currentTimeMillis();
                        t2Var.v("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new k7(10, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
