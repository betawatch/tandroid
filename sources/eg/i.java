package eg;

import jh.h5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t91;
import org.telegram.ui.v5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ i(h5 h5Var, TLRPC.Chat chat) {
        this.b = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Chat chat = this.b;
                if (chat != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.id), m2Var);
                    break;
                }
                break;
            default:
                h5.d2(t91.d0(this.b, true));
                break;
        }
    }

    public /* synthetic */ i(TLRPC.Chat chat) {
        this.b = chat;
    }
}
