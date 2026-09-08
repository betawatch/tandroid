package fi;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements Runnable {
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

    public /* synthetic */ g1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, f6 f6Var, org.telegram.ui.web.u uVar, org.telegram.tgnet.e eVar) {
        this.b = b2Var;
        this.d = context;
        this.e = i10;
        this.c = j3;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = f6Var;
        this.r = uVar;
        this.s = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                f6 f6Var = (f6) this.n;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.s;
                this.b.dismiss();
                new p1(this.d, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, f6Var, uVar, eVar).show();
                break;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                u70 u70Var = (u70) this.n;
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
                        w70.G = joinaspeers.peers;
                        long j3 = this.c;
                        w70.I = j3;
                        w70.H = SystemClock.elapsedRealtime();
                        w70.J = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        w70.v(this.d, j3, joinaspeers.peers, n2Var, this.e, peer, u70Var);
                        break;
                    } else {
                        u70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, u70 u70Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.b = b2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = u70Var;
        this.c = j3;
        this.d = context;
        this.r = n2Var;
        this.e = i10;
        this.s = peer;
    }
}
