package mh;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.g70;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ d1(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i9, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, b6 b6Var, org.telegram.ui.web.t tVar, bg.y0 y0Var) {
        this.b = c2Var;
        this.d = context;
        this.e = i9;
        this.c = j10;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = b6Var;
        this.r = tVar;
        this.s = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                b6 b6Var = (b6) this.n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.r;
                bg.y0 y0Var = (bg.y0) this.s;
                this.b.dismiss();
                new l1(this.d, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, b6Var, tVar, y0Var).show();
                break;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                e70 e70Var = (e70) this.n;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    c2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        g70.C = joinaspeers.peers;
                        long j10 = this.c;
                        g70.E = j10;
                        g70.D = SystemClock.elapsedRealtime();
                        g70.F = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        g70.v(this.d, j10, joinaspeers.peers, o2Var, this.e, peer, e70Var);
                        break;
                    } else {
                        e70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ d1(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, AccountInstance accountInstance, e70 e70Var, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.Peer peer) {
        this.b = c2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = e70Var;
        this.c = j10;
        this.d = context;
        this.r = o2Var;
        this.e = i9;
        this.s = peer;
    }
}
