package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c51;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ t2(f6 f6Var, TLRPC.Chat chat) {
        this.b = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f6.p2(c51.g0(this.b, true));
                break;
            default:
                TLRPC.Chat chat = this.b;
                if (chat != null) {
                    org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                    f2Var.a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.t5(-chat.id), f2Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t2(TLRPC.Chat chat) {
        this.b = chat;
    }
}
