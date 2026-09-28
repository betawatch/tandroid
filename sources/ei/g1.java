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
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j80;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ g1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.b = a2Var;
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
                new p1(this.d, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, d6Var, sVar, eVar).show();
                break;
            default:
                org.telegram.ui.ActionBar.a2 a2Var = this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                h80 h80Var = (h80) this.n;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    a2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        j80.G = joinaspeers.peers;
                        long j3 = this.c;
                        j80.I = j3;
                        j80.H = SystemClock.elapsedRealtime();
                        j80.J = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        j80.v(this.d, j3, joinaspeers.peers, m2Var, this.e, peer, h80Var);
                        break;
                    } else {
                        h80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, AccountInstance accountInstance, h80 h80Var, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.b = a2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = h80Var;
        this.c = j3;
        this.d = context;
        this.r = m2Var;
        this.e = i10;
        this.s = peer;
    }
}
