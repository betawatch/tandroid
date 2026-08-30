package gg;

import lh.g5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ga1;
import org.telegram.ui.y5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ i(g5 g5Var, TLRPC.Chat chat) {
        this.b = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Chat chat = this.b;
                if (chat != null) {
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                    n2Var.a = true;
                    LaunchActivity.R().showAsSheet(new y5(-chat.id), n2Var);
                    break;
                }
                break;
            default:
                g5.d2(ga1.d0(this.b, true));
                break;
        }
    }

    public /* synthetic */ i(TLRPC.Chat chat) {
        this.b = chat;
    }
}
