package bg;

import gh.k5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s91;
import org.telegram.ui.u5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ l(k5 k5Var, TLRPC.Chat chat) {
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
                    LaunchActivity.R().showAsSheet(new u5(-chat.id), m2Var);
                    break;
                }
                break;
            default:
                k5.d2(s91.c0(this.b, true));
                break;
        }
    }

    public /* synthetic */ l(TLRPC.Chat chat) {
        this.b = chat;
    }
}
