package mh;

import kh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3 b;

    public /* synthetic */ b2(c3 c3Var, int i9) {
        this.a = i9;
        this.b = c3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                u2 u2Var = this.b.x;
                if (u2Var != null) {
                    if (!bool.booleanValue()) {
                        u2Var.L = System.currentTimeMillis();
                        u2Var.v("secondary_button_pressed", null);
                        break;
                    } else {
                        u2Var.L = System.currentTimeMillis();
                        u2Var.v("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new o8(4, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
