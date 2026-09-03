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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s70 implements Runnable {
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

    public /* synthetic */ s70(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.web.t tVar, kh.a0 a0Var) {
        this.b = d2Var;
        this.c = context;
        this.d = i10;
        this.e = j10;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = f6Var;
        this.r = tVar;
        this.s = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                x70 x70Var = (x70) this.n;
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
                        z70.D = joinaspeers.peers;
                        long j10 = this.e;
                        z70.F = j10;
                        z70.E = SystemClock.elapsedRealtime();
                        z70.G = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        z70.v(this.c, j10, joinaspeers.peers, p2Var, this.d, peer, x70Var);
                        break;
                    } else {
                        x70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.r;
                kh.a0 a0Var = (kh.a0) this.s;
                this.b.dismiss();
                new rh.e1(this.c, this.d, this.e, tL_messages_preparedInlineMessage, fileArr[0], null, f6Var, tVar, a0Var).show();
                break;
        }
    }

    public /* synthetic */ s70(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, AccountInstance accountInstance, x70 x70Var, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer) {
        this.b = d2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = x70Var;
        this.e = j10;
        this.c = context;
        this.r = p2Var;
        this.d = i10;
        this.s = peer;
    }
}
