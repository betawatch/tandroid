package di;

import bi.af;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ k2(n3 n3Var, int i10) {
        this.a = i10;
        this.b = n3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                e3 e3Var = this.b.x;
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
                AndroidUtilities.runOnUIThread(new af(10, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
