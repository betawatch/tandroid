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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t70 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ t70(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.web.u uVar, eh.w wVar) {
        this.b = d2Var;
        this.c = context;
        this.d = i10;
        this.e = j10;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = g6Var;
        this.r = uVar;
        this.s = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                y70 y70Var = (y70) this.n;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    d2Var.dismiss();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        a80.D = joinaspeers.peers;
                        long j10 = this.e;
                        a80.F = j10;
                        a80.E = SystemClock.elapsedRealtime();
                        a80.G = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        a80.v(this.c, j10, joinaspeers.peers, p2Var, this.d, peer, y70Var);
                        break;
                    } else {
                        y70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.n;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.r;
                eh.w wVar = (eh.w) this.s;
                this.b.dismiss();
                new sh.e1(this.c, this.d, this.e, tL_messages_preparedInlineMessage, fileArr[0], null, g6Var, uVar, wVar).show();
                break;
        }
    }

    public /* synthetic */ t70(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, AccountInstance accountInstance, y70 y70Var, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.b = d2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = y70Var;
        this.e = j10;
        this.c = context;
        this.r = p2Var;
        this.d = i10;
        this.s = peer;
    }
}
