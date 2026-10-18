package org.telegram.ui.Wallet;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Utilities.Callback3 {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ c7 b;
    public final /* synthetic */ SendMessagesHelper c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ l0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;

    public /* synthetic */ t(m0 m0Var, c7 c7Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, l0 l0Var, long j10, TLRPC.User user) {
        this.a = m0Var;
        this.b = c7Var;
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
        c7 c7Var = this.b;
        SendMessagesHelper sendMessagesHelper = this.c;
        MessageObject messageObject = this.d;
        if (sendtransfer == null) {
            c7Var.run();
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
        l0Var.j();
        l0Var.h();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.i);
        m0Var.Q();
        m0.F("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new org.telegram.messenger.a(), new ai.t3(m0Var, wallettransaction, sendMessagesHelper, messageObject, c7Var, 5));
    }
}
