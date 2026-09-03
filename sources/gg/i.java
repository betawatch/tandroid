package gg;

import lh.g5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a6;
import org.telegram.ui.oa1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                    LaunchActivity.R().showAsSheet(new a6(-chat.id), n2Var);
                    break;
                }
                break;
            default:
                g5.d2(oa1.d0(this.b, true));
                break;
        }
    }

    public /* synthetic */ i(TLRPC.Chat chat) {
        this.b = chat;
    }
}
