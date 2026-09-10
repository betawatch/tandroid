package di;

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
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.f80;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ j1(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.g gVar) {
        this.b = d2Var;
        this.d = context;
        this.e = i10;
        this.c = j3;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = f6Var;
        this.r = tVar;
        this.s = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                f6 f6Var = (f6) this.n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.r;
                org.telegram.tgnet.g gVar = (org.telegram.tgnet.g) this.s;
                this.b.dismiss();
                new s1(this.d, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, f6Var, tVar, gVar).show();
                break;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                d80 d80Var = (d80) this.n;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    d2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        f80.G = joinaspeers.peers;
                        long j3 = this.c;
                        f80.I = j3;
                        f80.H = SystemClock.elapsedRealtime();
                        f80.J = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        f80.v(this.d, j3, joinaspeers.peers, p2Var, this.e, peer, d80Var);
                        break;
                    } else {
                        d80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ j1(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, AccountInstance accountInstance, d80 d80Var, long j3, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.b = d2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = d80Var;
        this.c = j3;
        this.d = context;
        this.r = p2Var;
        this.e = i10;
        this.s = peer;
    }
}
