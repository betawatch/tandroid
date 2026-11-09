package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements x10 {
    public final /* synthetic */ l0 a;
    public final /* synthetic */ e7 b;
    public final /* synthetic */ gz c;
    public final /* synthetic */ ij d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ k0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;

    public /* synthetic */ u(l0 l0Var, e7 e7Var, gz gzVar, ij ijVar, TL_wallet.walletTransaction wallettransaction, String str, k0 k0Var, long j3, TLRPC.User user) {
        this.a = l0Var;
        this.b = e7Var;
        this.c = gzVar;
        this.d = ijVar;
        this.e = wallettransaction;
        this.f = str;
        this.g = k0Var;
        this.h = j3;
        this.i = user;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        l0 l0Var = this.a;
        int i7 = l0Var.a;
        e7 e7Var = this.b;
        gz gzVar = this.c;
        ij ijVar = this.d;
        if (sendtransfer == null) {
            e7Var.run();
            gzVar.k(ijVar, null, false);
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
        boolean z9 = wallettransaction.comment_encrypted;
        if (ijVar != null) {
            TLRPC.MessageAction messageAction = ijVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z9;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                ijVar.K1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ijVar.k);
                gzVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                gzVar.getNotificationCenter().k(qs.m0, Long.valueOf(ij.B0(ijVar.k)), org.telegram.messenger.k5.k(ijVar));
            }
        }
        wallettransaction.gasless = sendtransfer.data_gasless != null;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        k0 k0Var = this.g;
        k0Var.k();
        k0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = qp.s1(i7).q1(this.i);
        l0Var.S();
        l0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i7).sendRequestTyped(sendtransfer, new d3.b(1), new bi.t3(l0Var, wallettransaction, gzVar, ijVar, e7Var, 4));
    }
}
