package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.s10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ne;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements s10 {
    public final /* synthetic */ u0 a;
    public final /* synthetic */ v7 b;
    public final /* synthetic */ zy c;
    public final /* synthetic */ fj d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ t0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;

    public /* synthetic */ a0(u0 u0Var, v7 v7Var, zy zyVar, fj fjVar, TL_wallet.walletTransaction wallettransaction, String str, t0 t0Var, long j3, TLRPC.User user) {
        this.a = u0Var;
        this.b = v7Var;
        this.c = zyVar;
        this.d = fjVar;
        this.e = wallettransaction;
        this.f = str;
        this.g = t0Var;
        this.h = j3;
        this.i = user;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        u0 u0Var = this.a;
        int i7 = u0Var.a;
        v7 v7Var = this.b;
        zy zyVar = this.c;
        fj fjVar = this.d;
        if (sendtransfer == null) {
            v7Var.run();
            zyVar.k(fjVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            u0.n("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (u0.c(u0Var.y(), this.f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z10 = wallettransaction.comment_encrypted;
        if (fjVar != null) {
            TLRPC.MessageAction messageAction = fjVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z10;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                fjVar.M1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(fjVar.k);
                zyVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                zyVar.getNotificationCenter().k(ks.m0, Long.valueOf(fj.B0(fjVar.k)), org.telegram.messenger.f3.i(fjVar));
            }
        }
        wallettransaction.gasless = sendtransfer.data_gasless != null;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        t0 t0Var = this.g;
        t0Var.k();
        t0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = mp.u1(i7).s1(this.i);
        u0Var.a0();
        u0.P("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i7).sendRequestTyped(sendtransfer, new d3.b(1), new ne(u0Var, wallettransaction, zyVar, fjVar, v7Var, 4));
    }
}
