package ei;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ h1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.b = b2Var;
        this.d = context;
        this.e = i10;
        this.c = j3;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = d6Var;
        this.r = sVar;
        this.s = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                d6 d6Var = (d6) this.n;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.s;
                this.b.dismiss();
                new q1(this.d, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, d6Var, sVar, eVar).show();
                break;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                i80 i80Var = (i80) this.n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    b2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        k80.G = joinaspeers.peers;
                        long j3 = this.c;
                        k80.I = j3;
                        k80.H = SystemClock.elapsedRealtime();
                        k80.J = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        k80.v(this.d, j3, joinaspeers.peers, n2Var, this.e, peer, i80Var);
                        break;
                    } else {
                        i80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ h1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, i80 i80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.b = b2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = i80Var;
        this.c = j3;
        this.d = context;
        this.r = n2Var;
        this.e = i10;
        this.s = peer;
    }
}
