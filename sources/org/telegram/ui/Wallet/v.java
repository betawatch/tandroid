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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements x10 {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ f7 b;
    public final /* synthetic */ gz c;
    public final /* synthetic */ ij d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ l0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;

    public /* synthetic */ v(m0 m0Var, f7 f7Var, gz gzVar, ij ijVar, TL_wallet.walletTransaction wallettransaction, String str, l0 l0Var, long j3, TLRPC.User user) {
        this.a = m0Var;
        this.b = f7Var;
        this.c = gzVar;
        this.d = ijVar;
        this.e = wallettransaction;
        this.f = str;
        this.g = l0Var;
        this.h = j3;
        this.i = user;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        m0 m0Var = this.a;
        int i7 = m0Var.a;
        f7 f7Var = this.b;
        gz gzVar = this.c;
        ij ijVar = this.d;
        if (sendtransfer == null) {
            f7Var.run();
            gzVar.k(ijVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            m0.j("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (m0.b(m0Var.t(), this.f)) {
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
        l0 l0Var = this.g;
        l0Var.k();
        l0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = qp.s1(i7).q1(this.i);
        m0Var.S();
        m0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i7).sendRequestTyped(sendtransfer, new d3.b(1), new bi.t3(m0Var, wallettransaction, gzVar, ijVar, f7Var, 4));
    }
}
