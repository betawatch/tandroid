package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ k3(h7 h7Var, TLRPC.Chat chat) {
        this.b = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h7.D2(y91.c0(this.b, true));
                break;
            default:
                TLRPC.Chat chat = this.b;
                if (chat != null) {
                    org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                    p2Var.a = true;
                    LaunchActivity.R().showAsSheet(new org.telegram.ui.x5(-chat.id), p2Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k3(TLRPC.Chat chat) {
        this.b = chat;
    }
}
