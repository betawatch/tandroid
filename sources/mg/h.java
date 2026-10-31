package mg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t5;
import org.telegram.ui.u61;
import rh.e4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ h(TLRPC.Chat chat) {
        this.b = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Chat chat = this.b;
                if (chat != null) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    LaunchActivity.Q().showAsSheet(new t5(-chat.id), i2Var);
                    break;
                }
                break;
            default:
                e4.c2(u61.f0(this.b, true));
                break;
        }
    }

    public /* synthetic */ h(e4 e4Var, TLRPC.Chat chat) {
        this.b = chat;
    }
}
