package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ q2(c6 c6Var, TLRPC.Chat chat) {
        this.b = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c6.d2(z41.g0(this.b, true));
                break;
            default:
                TLRPC.Chat chat = this.b;
                if (chat != null) {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                    c2Var.a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.t5(-chat.id), c2Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q2(TLRPC.Chat chat) {
        this.b = chat;
    }
}
