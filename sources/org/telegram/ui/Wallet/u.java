package org.telegram.ui.Wallet;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Utilities.Callback3 {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ w6 b;
    public final /* synthetic */ SendMessagesHelper c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ l0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;

    public /* synthetic */ u(m0 m0Var, w6 w6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, l0 l0Var, long j10, TLRPC.User user) {
        this.a = m0Var;
        this.b = w6Var;
        this.c = sendMessagesHelper;
        this.d = messageObject;
        this.e = wallettransaction;
        this.f = str;
        this.g = l0Var;
        this.h = j10;
        this.i = user;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        m0 m0Var = this.a;
        int i10 = m0Var.a;
        w6 w6Var = this.b;
        SendMessagesHelper sendMessagesHelper = this.c;
        MessageObject messageObject = this.d;
        if (sendtransfer == null) {
            w6Var.run();
            sendMessagesHelper.completeSendingGramTransfer(messageObject, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            m0.i("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (m0.a(m0Var.s(), this.f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        sendMessagesHelper.updateSendingGramTransferComment(messageObject, wallettransaction.comment, wallettransaction.comment_encrypted);
        wallettransaction.gasless = sendtransfer.data_gasless != null;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        l0 l0Var = this.g;
        l0Var.k();
        l0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.i);
        m0Var.Q();
        m0.F("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new org.telegram.messenger.a(), new ai.x3(m0Var, wallettransaction, sendMessagesHelper, messageObject, w6Var, 5));
    }
}
