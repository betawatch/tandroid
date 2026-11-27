// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m25 implements kcc {
    public final /* synthetic */ c a;
    public final /* synthetic */ ao1 b;
    public final /* synthetic */ r7a c;
    public final /* synthetic */ r47 d;
    public final /* synthetic */ TL_wallet.walletTransaction e;
    public final /* synthetic */ String f;
    public final /* synthetic */ b g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.User i;
    public final /* synthetic */ a35 j;

    public /* synthetic */ m25(c cVar, ao1 ao1Var, r7a r7aVar, r47 r47Var, TL_wallet.walletTransaction wallettransaction, String str, b bVar, long j, TLRPC.User user, a35 a35Var) {
        this.a = cVar;
        this.b = ao1Var;
        this.c = r7aVar;
        this.d = r47Var;
        this.e = wallettransaction;
        this.f = str;
        this.g = bVar;
        this.h = j;
        this.i = user;
        this.j = a35Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    @Override // kcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z;
        c cVar = this.a;
        ao1 ao1Var = this.b;
        r7a r7aVar = this.c;
        r47 r47Var = this.d;
        TL_wallet.walletTransaction wallettransaction = this.e;
        String str = this.f;
        b bVar = this.g;
        long j = this.h;
        TLRPC.User user = this.i;
        a35 a35Var = this.j;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        if (sendtransfer == null) {
            ao1Var.run();
            r7aVar.k(r47Var, null, false);
            if (str3 == null) {
                str3 = "NULL_ERROR";
            }
            c.m("failed sending: ".concat(str3));
            return;
        }
        if (str2 != null) {
            wallettransaction.comment = str2;
            wallettransaction.comment_encrypted = true;
        }
        if (c.b(cVar.x(), str)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str4 = wallettransaction.comment;
        boolean z2 = wallettransaction.comment_encrypted;
        if (r47Var != null) {
            TLRPC.MessageAction messageAction = r47Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str4;
                tL_messageActionGramTransfer.comment_encrypted = z2;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                r47Var.M1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(r47Var.k);
                r7aVar.getMessagesStorage().g1(arrayList, false, true, false, 0, false, 0, 0L);
                z = false;
                r7aVar.getNotificationCenter().k(jn7.m0, Long.valueOf(r47.B0(r47Var.k)), qd4.t(r47Var));
                wallettransaction.gasless = sendtransfer.data_gasless == null ? true : z;
                wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
                wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
                bVar.k();
                bVar.i();
                sendtransfer.random_id = j;
                sendtransfer.user_id = uc7.s1(cVar.a).q1(user);
                cVar.a0();
                c.P("prepared sendTransfer, sending");
                if (a35Var != null) {
                    a35Var.k = true;
                }
                ConnectionsManager.getInstance(cVar.a).sendRequestTyped(sendtransfer, new ic(z ? (byte) 1 : (byte) 0), new pm1(cVar, wallettransaction, r7aVar, r47Var, ao1Var, (byte) 4));
            }
        }
        z = false;
        wallettransaction.gasless = sendtransfer.data_gasless == null ? true : z;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        bVar.k();
        bVar.i();
        sendtransfer.random_id = j;
        sendtransfer.user_id = uc7.s1(cVar.a).q1(user);
        cVar.a0();
        c.P("prepared sendTransfer, sending");
        if (a35Var != null) {
        }
        ConnectionsManager.getInstance(cVar.a).sendRequestTyped(sendtransfer, new ic(z ? (byte) 1 : (byte) 0), new pm1(cVar, wallettransaction, r7aVar, r47Var, ao1Var, (byte) 4));
    }
}
