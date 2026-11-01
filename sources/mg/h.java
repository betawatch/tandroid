package mg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s61;
import org.telegram.ui.t5;
import rh.e4;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                e4.c2(s61.g0(this.b, true));
                break;
        }
    }

    public /* synthetic */ h(e4 e4Var, TLRPC.Chat chat) {
        this.b = chat;
    }
}
