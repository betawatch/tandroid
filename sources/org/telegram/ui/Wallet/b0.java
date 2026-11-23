package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.r10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ne;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements r10 {
    public final /* synthetic */ v0 a;
    public final /* synthetic */ w7 b;
    public final /* synthetic */ zy c;
    public final /* synthetic */ fj d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ u0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;

    public /* synthetic */ b0(v0 v0Var, w7 w7Var, zy zyVar, fj fjVar, TL_wallet.walletTransaction wallettransaction, String str, u0 u0Var, long j3, TLRPC.User user) {
        this.a = v0Var;
        this.b = w7Var;
        this.c = zyVar;
        this.d = fjVar;
        this.e = wallettransaction;
        this.f = str;
        this.g = u0Var;
        this.h = j3;
        this.i = user;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        v0 v0Var = this.a;
        int i7 = v0Var.a;
        w7 w7Var = this.b;
        zy zyVar = this.c;
        fj fjVar = this.d;
        if (sendtransfer == null) {
            w7Var.run();
            zyVar.k(fjVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            v0.n("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (v0.c(v0Var.y(), this.f)) {
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
        u0 u0Var = this.g;
        u0Var.k();
        u0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = mp.u1(i7).s1(this.i);
        v0Var.a0();
        v0.P("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i7).sendRequestTyped(sendtransfer, new d3.b(1), new ne(v0Var, wallettransaction, zyVar, fjVar, w7Var, 4));
    }
}
