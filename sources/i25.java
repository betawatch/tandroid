// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class i25 implements lac {
    public final /* synthetic */ c a;
    public final /* synthetic */ xo1 b;
    public final /* synthetic */ a6a c;
    public final /* synthetic */ k47 d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ b g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;

    public /* synthetic */ i25(c cVar, xo1 xo1Var, a6a a6aVar, k47 k47Var, TL_wallet.walletTransaction wallettransaction, String str, b bVar, long j, TLRPC.User user) {
        this.a = cVar;
        this.b = xo1Var;
        this.c = a6aVar;
        this.d = k47Var;
        this.e = wallettransaction;
        this.f = str;
        this.g = bVar;
        this.h = j;
        this.i = user;
    }

    @Override // lac
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        c cVar = this.a;
        int i = cVar.a;
        xo1 xo1Var = this.b;
        a6a a6aVar = this.c;
        k47 k47Var = this.d;
        if (sendtransfer == null) {
            xo1Var.run();
            a6aVar.k(k47Var, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            c.m("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (c.b(cVar.x(), this.f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z = wallettransaction.comment_encrypted;
        if (k47Var != null) {
            TLRPC.MessageAction messageAction = k47Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                k47Var.M1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(k47Var.k);
                a6aVar.getMessagesStorage().g1(arrayList, false, true, false, 0, false, 0, 0L);
                a6aVar.getNotificationCenter().k(nm7.m0, Long.valueOf(k47.B0(k47Var.k)), td4.u(k47Var));
            }
        }
        wallettransaction.gasless = sendtransfer.data_gasless != null;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        b bVar = this.g;
        bVar.k();
        bVar.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = oc7.r1(i).p1(this.i);
        cVar.Z();
        c.O("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i).sendRequestTyped(sendtransfer, new kc((byte) 0), new sm1(cVar, wallettransaction, a6aVar, k47Var, xo1Var, (byte) 4));
    }
}
