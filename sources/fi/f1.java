package fi;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.v80;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ f1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, c6 c6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.b = a2Var;
        this.d = context;
        this.e = i10;
        this.c = j10;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = c6Var;
        this.r = sVar;
        this.s = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        String h;
        org.telegram.ui.Wallet.a2 a2Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.b;
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                c6 c6Var = (c6) this.n;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.s;
                a2Var2.dismiss();
                new o1(context, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, c6Var, sVar, eVar).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                t80 t80Var = (t80) this.n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    a2Var3.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        v80.G = joinaspeers.peers;
                        long j10 = this.c;
                        v80.I = j10;
                        v80.H = SystemClock.elapsedRealtime();
                        v80.J = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        v80.x(context2, j10, joinaspeers.peers, m2Var, this.e, peer, t80Var);
                        break;
                    } else {
                        t80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.h;
                String str = (String) this.n;
                byte[] bArr = (byte[]) this.r;
                bi.f0 f0Var = (bi.f0) this.s;
                e2Var.getClass();
                try {
                    h0Var = h0Var2;
                } catch (Exception e7) {
                    e = e7;
                    h0Var = h0Var2;
                }
                try {
                    a2Var = new org.telegram.ui.Wallet.a2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.e2.f(h0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, e2Var.f.getCurrentTime()), str, bArr);
                    h = null;
                } catch (Exception e10) {
                    e = e10;
                    h = org.telegram.ui.Wallet.e2.h("decode request", e);
                    a2Var = null;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(e2Var, a2Var, f0Var, h, this.c, this.e, h0Var));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(e2Var, a2Var, f0Var, h, this.c, this.e, h0Var));
        }
    }

    public /* synthetic */ f1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, AccountInstance accountInstance, t80 t80Var, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.b = a2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = t80Var;
        this.c = j10;
        this.d = context;
        this.r = m2Var;
        this.e = i10;
        this.s = peer;
    }

    public /* synthetic */ f1(org.telegram.ui.Wallet.e2 e2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.h0 h0Var, String str, byte[] bArr, bi.f0 f0Var, long j10, int i10) {
        this.b = e2Var;
        this.d = tonconnectpending;
        this.f = tonconnectrequest;
        this.h = h0Var;
        this.n = str;
        this.r = bArr;
        this.s = f0Var;
        this.c = j10;
        this.e = i10;
    }
}
