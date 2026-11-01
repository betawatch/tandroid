package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.kj;
import org.telegram.messenger.m20;
import org.telegram.messenger.rz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.af;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements m20 {
    public final /* synthetic */ k0 a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ rz c;
    public final /* synthetic */ kj d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ j0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;

    public /* synthetic */ t(k0 k0Var, k7 k7Var, rz rzVar, kj kjVar, TL_wallet.walletTransaction wallettransaction, String str, j0 j0Var, long j10, TLRPC.User user) {
        this.a = k0Var;
        this.b = k7Var;
        this.c = rzVar;
        this.d = kjVar;
        this.e = wallettransaction;
        this.f = str;
        this.g = j0Var;
        this.h = j10;
        this.i = user;
    }

    @Override // org.telegram.messenger.m20
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        k0 k0Var = this.a;
        int i10 = k0Var.a;
        k7 k7Var = this.b;
        rz rzVar = this.c;
        kj kjVar = this.d;
        if (sendtransfer == null) {
            k7Var.run();
            rzVar.k(kjVar, null, false);
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
        if (kjVar != null) {
            TLRPC.MessageAction messageAction = kjVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z10;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                kjVar.K1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(kjVar.k);
                rzVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                rzVar.getNotificationCenter().k(at.m0, Long.valueOf(kj.B0(kjVar.k)), org.telegram.messenger.m5.j(kjVar));
            }
        }
        wallettransaction.gasless = sendtransfer.data_gasless != null;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        j0 j0Var = this.g;
        j0Var.k();
        j0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = wp.r1(i10).p1(this.i);
        k0Var.S();
        k0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new a3.b(1), new af(k0Var, wallettransaction, rzVar, kjVar, k7Var, 3));
    }
}
