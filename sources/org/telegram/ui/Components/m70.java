package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m70 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ m70(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.web.u uVar, bh.v vVar) {
        this.b = c2Var;
        this.c = context;
        this.d = i10;
        this.e = j10;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = c6Var;
        this.r = uVar;
        this.s = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                r70 r70Var = (r70) this.n;
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
                        t70.C = joinaspeers.peers;
                        long j10 = this.e;
                        t70.E = j10;
                        t70.D = SystemClock.elapsedRealtime();
                        t70.F = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        t70.v(this.c, j10, joinaspeers.peers, o2Var, this.d, peer, r70Var);
                        break;
                    } else {
                        r70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.n;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.r;
                bh.v vVar = (bh.v) this.s;
                this.b.dismiss();
                new ph.e1(this.c, this.d, this.e, tL_messages_preparedInlineMessage, fileArr[0], null, c6Var, uVar, vVar).show();
                break;
        }
    }

    public /* synthetic */ m70(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, AccountInstance accountInstance, r70 r70Var, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer) {
        this.b = c2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = r70Var;
        this.e = j10;
        this.c = context;
        this.r = o2Var;
        this.d = i10;
        this.s = peer;
    }
}
