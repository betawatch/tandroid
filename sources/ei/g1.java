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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.e80;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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

    public /* synthetic */ g1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.e eVar) {
        this.b = b2Var;
        this.d = context;
        this.e = i10;
        this.c = j3;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = f6Var;
        this.r = tVar;
        this.s = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                f6 f6Var = (f6) this.n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.s;
                this.b.dismiss();
                new p1(this.d, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, f6Var, tVar, eVar).show();
                break;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                c80 c80Var = (c80) this.n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    b2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        e80.G = joinaspeers.peers;
                        long j3 = this.c;
                        e80.I = j3;
                        e80.H = SystemClock.elapsedRealtime();
                        e80.J = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        e80.v(this.d, j3, joinaspeers.peers, n2Var, this.e, peer, c80Var);
                        break;
                    } else {
                        c80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, c80 c80Var, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.b = b2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = c80Var;
        this.c = j3;
        this.d = context;
        this.r = n2Var;
        this.e = i10;
        this.s = peer;
    }
}
