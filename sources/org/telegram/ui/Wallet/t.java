package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.p10;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements p10 {
    public final /* synthetic */ k0 a;
    public final /* synthetic */ e7 b;
    public final /* synthetic */ yy c;
    public final /* synthetic */ zi d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ j0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;

    public /* synthetic */ t(k0 k0Var, e7 e7Var, yy yyVar, zi ziVar, TL_wallet.walletTransaction wallettransaction, String str, j0 j0Var, long j10, TLRPC.User user) {
        this.a = k0Var;
        this.b = e7Var;
        this.c = yyVar;
        this.d = ziVar;
        this.e = wallettransaction;
        this.f = str;
        this.g = j0Var;
        this.h = j10;
        this.i = user;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        k0 k0Var = this.a;
        int i3 = k0Var.a;
        e7 e7Var = this.b;
        yy yyVar = this.c;
        zi ziVar = this.d;
        if (sendtransfer == null) {
            e7Var.run();
            yyVar.k(ziVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            k0.j("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (k0.b(k0Var.t(), this.f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z10 = wallettransaction.comment_encrypted;
        if (ziVar != null) {
            TLRPC.MessageAction messageAction = ziVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z10;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                ziVar.K1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ziVar.k);
                yyVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                yyVar.getNotificationCenter().k(hs.m0, Long.valueOf(zi.B0(ziVar.k)), org.telegram.messenger.k5.k(ziVar));
            }
        }
        wallettransaction.gasless = sendtransfer.data_gasless != null;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        j0 j0Var = this.g;
        j0Var.k();
        j0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = hp.s1(i3).q1(this.i);
        k0Var.S();
        k0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i3).sendRequestTyped(sendtransfer, new c3.b(1), new ci.g3(k0Var, wallettransaction, yyVar, ziVar, e7Var, 4));
    }
}
