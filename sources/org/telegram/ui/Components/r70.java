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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r70 implements Runnable {
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

    public /* synthetic */ r70(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.web.u uVar, dh.v vVar) {
        this.b = d2Var;
        this.c = context;
        this.d = i10;
        this.e = j10;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = f6Var;
        this.r = uVar;
        this.s = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                w70 w70Var = (w70) this.n;
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
                        y70.D = joinaspeers.peers;
                        long j10 = this.e;
                        y70.F = j10;
                        y70.E = SystemClock.elapsedRealtime();
                        y70.G = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        y70.v(this.c, j10, joinaspeers.peers, p2Var, this.d, peer, w70Var);
                        break;
                    } else {
                        w70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.n;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.r;
                dh.v vVar = (dh.v) this.s;
                this.b.dismiss();
                new rh.f1(this.c, this.d, this.e, tL_messages_preparedInlineMessage, fileArr[0], null, f6Var, uVar, vVar).show();
                break;
        }
    }

    public /* synthetic */ r70(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, AccountInstance accountInstance, w70 w70Var, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.b = d2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = w70Var;
        this.e = j10;
        this.c = context;
        this.r = p2Var;
        this.d = i10;
        this.s = peer;
    }
}
