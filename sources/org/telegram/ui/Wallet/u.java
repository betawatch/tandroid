package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements u10 {
    public final /* synthetic */ l0 a;
    public final /* synthetic */ g7 b;
    public final /* synthetic */ ez c;
    public final /* synthetic */ gj d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ k0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;

    public /* synthetic */ u(l0 l0Var, g7 g7Var, ez ezVar, gj gjVar, TL_wallet.walletTransaction wallettransaction, String str, k0 k0Var, long j3, TLRPC.User user) {
        this.a = l0Var;
        this.b = g7Var;
        this.c = ezVar;
        this.d = gjVar;
        this.e = wallettransaction;
        this.f = str;
        this.g = k0Var;
        this.h = j3;
        this.i = user;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        l0 l0Var = this.a;
        int i7 = l0Var.a;
        g7 g7Var = this.b;
        ez ezVar = this.c;
        gj gjVar = this.d;
        if (sendtransfer == null) {
            g7Var.run();
            ezVar.k(gjVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            l0.j("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (l0.b(l0Var.t(), this.f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z10 = wallettransaction.comment_encrypted;
        if (gjVar != null) {
            TLRPC.MessageAction messageAction = gjVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z10;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                gjVar.M1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(gjVar.k);
                ezVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                ezVar.getNotificationCenter().k(ns.m0, Long.valueOf(gj.B0(gjVar.k)), org.telegram.messenger.k5.j(gjVar));
            }
        }
        wallettransaction.gasless = sendtransfer.data_gasless != null;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        k0 k0Var = this.g;
        k0Var.k();
        k0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = np.s1(i7).q1(this.i);
        l0Var.S();
        l0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i7).sendRequestTyped(sendtransfer, new d3.b(1), new di.z2(l0Var, wallettransaction, ezVar, gjVar, g7Var, 4));
    }
}
