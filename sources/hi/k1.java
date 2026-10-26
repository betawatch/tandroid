package hi;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.t80;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Runnable {
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

    public /* synthetic */ k1(org.telegram.ui.ActionBar.e2 e2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, u6 u6Var, org.telegram.ui.web.t tVar, bi.t0 t0Var) {
        this.b = e2Var;
        this.d = context;
        this.e = i10;
        this.c = j10;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = u6Var;
        this.r = tVar;
        this.s = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        String h;
        org.telegram.ui.Wallet.a2 a2Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.b;
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                u6 u6Var = (u6) this.n;
                org.telegram.ui.web.t tVar = (org.telegram.ui.web.t) this.r;
                bi.t0 t0Var = (bi.t0) this.s;
                e2Var.dismiss();
                new s1(context, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, u6Var, tVar, t0Var).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                r80 r80Var = (r80) this.n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    e2Var2.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        t80.I = joinaspeers.peers;
                        long j10 = this.c;
                        t80.K = j10;
                        t80.J = SystemClock.elapsedRealtime();
                        t80.L = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        t80.v(context2, j10, joinaspeers.peers, r2Var, this.e, peer, r80Var);
                        break;
                    } else {
                        r80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) this.b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.h;
                String str = (String) this.n;
                byte[] bArr = (byte[]) this.r;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.s;
                e2Var3.getClass();
                try {
                    i0Var = i0Var2;
                } catch (Exception e10) {
                    e = e10;
                    i0Var = i0Var2;
                }
                try {
                    a2Var = new org.telegram.ui.Wallet.a2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.e2.f(i0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, e2Var3.f.getCurrentTime()), str, bArr);
                    h = null;
                } catch (Exception e11) {
                    e = e11;
                    h = org.telegram.ui.Wallet.e2.h("decode request", e);
                    a2Var = null;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k1(e2Var3, a2Var, r1Var, h, this.c, this.e, i0Var));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k1(e2Var3, a2Var, r1Var, h, this.c, this.e, i0Var));
        }
    }

    public /* synthetic */ k1(org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, AccountInstance accountInstance, r80 r80Var, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Peer peer) {
        this.b = e2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = r80Var;
        this.c = j10;
        this.d = context;
        this.r = r2Var;
        this.e = i10;
        this.s = peer;
    }

    public /* synthetic */ k1(org.telegram.ui.Wallet.e2 e2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, org.telegram.ui.Wallet.r1 r1Var, long j10, int i10) {
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
