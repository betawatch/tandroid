package gi;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.s80;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements Runnable {
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

    public /* synthetic */ d1(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, g6 g6Var, org.telegram.ui.web.t tVar, ai.s0 s0Var) {
        this.b = c2Var;
        this.d = context;
        this.e = i10;
        this.c = j10;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = g6Var;
        this.r = tVar;
        this.s = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        String h;
        org.telegram.ui.Wallet.a2 a2Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.b;
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                g6 g6Var = (g6) this.n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.r;
                ai.s0 s0Var = (ai.s0) this.s;
                c2Var.dismiss();
                new l1(context, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, g6Var, tVar, s0Var).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                q80 q80Var = (q80) this.n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    c2Var2.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        s80.I = joinaspeers.peers;
                        long j10 = this.c;
                        s80.K = j10;
                        s80.J = SystemClock.elapsedRealtime();
                        s80.L = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        s80.w(context2, j10, joinaspeers.peers, o2Var, this.e, peer, q80Var);
                        break;
                    } else {
                        q80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.h;
                String str = (String) this.n;
                byte[] bArr = (byte[]) this.r;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.s;
                e2Var.getClass();
                try {
                    i0Var = i0Var2;
                } catch (Exception e7) {
                    e = e7;
                    i0Var = i0Var2;
                }
                try {
                    a2Var = new org.telegram.ui.Wallet.a2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.e2.f(i0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, e2Var.f.getCurrentTime()), str, bArr);
                    h = null;
                } catch (Exception e10) {
                    e = e10;
                    h = org.telegram.ui.Wallet.e2.h("decode request", e);
                    a2Var = null;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(e2Var, a2Var, r1Var, h, this.c, this.e, i0Var));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(e2Var, a2Var, r1Var, h, this.c, this.e, i0Var));
        }
    }

    public /* synthetic */ d1(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, AccountInstance accountInstance, q80 q80Var, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer) {
        this.b = c2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = q80Var;
        this.c = j10;
        this.d = context;
        this.r = o2Var;
        this.e = i10;
        this.s = peer;
    }

    public /* synthetic */ d1(org.telegram.ui.Wallet.e2 e2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, org.telegram.ui.Wallet.r1 r1Var, long j10, int i10) {
        this.b = e2Var;
        this.d = tonconnectpending;
        this.f = tonconnectrequest;
        this.h = i0Var;
        this.n = str;
        this.r = bArr;
        this.s = r1Var;
        this.c = j10;
        this.e = i10;
    }
}
