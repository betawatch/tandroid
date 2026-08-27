package nh;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.k70;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Runnable {
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

    public /* synthetic */ c1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, c6 c6Var, org.telegram.ui.web.u uVar, cg.u0 u0Var) {
        this.b = b2Var;
        this.d = context;
        this.e = i10;
        this.c = j10;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = c6Var;
        this.r = uVar;
        this.s = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                c6 c6Var = (c6) this.n;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.r;
                cg.u0 u0Var = (cg.u0) this.s;
                this.b.dismiss();
                new k1(this.d, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, c6Var, uVar, u0Var).show();
                break;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                i70 i70Var = (i70) this.n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    b2Var.dismiss();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        k70.C = joinaspeers.peers;
                        long j10 = this.c;
                        k70.E = j10;
                        k70.D = SystemClock.elapsedRealtime();
                        k70.F = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        k70.w(this.d, j10, joinaspeers.peers, n2Var, this.e, peer, i70Var);
                        break;
                    } else {
                        i70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, AccountInstance accountInstance, i70 i70Var, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer) {
        this.b = b2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = i70Var;
        this.c = j10;
        this.d = context;
        this.r = n2Var;
        this.e = i10;
        this.s = peer;
    }
}
