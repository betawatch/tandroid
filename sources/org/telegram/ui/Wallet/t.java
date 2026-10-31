package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.messenger.l20;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.af;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements l20 {
    public final /* synthetic */ k0 a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ qz c;
    public final /* synthetic */ jj d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ j0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;

    public /* synthetic */ t(k0 k0Var, k7 k7Var, qz qzVar, jj jjVar, TL_wallet.walletTransaction wallettransaction, String str, j0 j0Var, long j10, TLRPC.User user) {
        this.a = k0Var;
        this.b = k7Var;
        this.c = qzVar;
        this.d = jjVar;
        this.e = wallettransaction;
        this.f = str;
        this.g = j0Var;
        this.h = j10;
        this.i = user;
    }

    @Override // org.telegram.messenger.l20
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        k0 k0Var = this.a;
        int i10 = k0Var.a;
        k7 k7Var = this.b;
        qz qzVar = this.c;
        jj jjVar = this.d;
        if (sendtransfer == null) {
            k7Var.run();
            qzVar.k(jjVar, null, false);
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
        if (jjVar != null) {
            TLRPC.MessageAction messageAction = jjVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z10;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                jjVar.K1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(jjVar.k);
                qzVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                qzVar.getNotificationCenter().k(zs.m0, Long.valueOf(jj.B0(jjVar.k)), org.telegram.messenger.m5.j(jjVar));
            }
        }
        wallettransaction.gasless = sendtransfer.data_gasless != null;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        j0 j0Var = this.g;
        j0Var.k();
        j0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = vp.r1(i10).p1(this.i);
        k0Var.S();
        k0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new a3.b(1), new af(k0Var, wallettransaction, qzVar, jjVar, k7Var, 3));
    }
}
