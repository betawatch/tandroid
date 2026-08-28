package eg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ TLRPC.TL_messageMediaGiveawayResults d;

    public /* synthetic */ c(d dVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i9) {
        this.a = i9;
        this.b = dVar;
        this.c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c(this.b, this.c, this.d, 1));
                break;
            default:
                t1 t1Var = this.b.c;
                long dialogId = this.c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId != (-tL_messageMediaGiveawayResults.channel_id)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                    bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                    LaunchActivity.R().presentFragment(new qn(bundle));
                    break;
                } else {
                    t1Var.getDelegate().S1(t1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    break;
                }
        }
    }
}
