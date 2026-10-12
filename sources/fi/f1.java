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
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.w80;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        org.telegram.ui.Wallet.g0 g0Var;
        String h;
        org.telegram.ui.Wallet.z1 z1Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.b;
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                c6 c6Var = (c6) this.n;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.r;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.s;
                a2Var.dismiss();
                new o1(context, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, c6Var, sVar, eVar).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.b;
                AccountInstance accountInstance = (AccountInstance) this.h;
                u80 u80Var = (u80) this.n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    a2Var2.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        w80.G = joinaspeers.peers;
                        long j10 = this.c;
                        w80.I = j10;
                        w80.H = SystemClock.elapsedRealtime();
                        w80.J = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        w80.x(context2, j10, joinaspeers.peers, m2Var, this.e, peer, u80Var);
                        break;
                    } else {
                        u80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f;
                org.telegram.ui.Wallet.g0 g0Var2 = (org.telegram.ui.Wallet.g0) this.h;
                String str = (String) this.n;
                byte[] bArr = (byte[]) this.r;
                bi.f0 f0Var = (bi.f0) this.s;
                d2Var.getClass();
                try {
                    g0Var = g0Var2;
                } catch (Exception e7) {
                    e = e7;
                    g0Var = g0Var2;
                }
                try {
                    z1Var = new org.telegram.ui.Wallet.z1(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.d2.f(g0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, d2Var.f.getCurrentTime()), str, bArr);
                    h = null;
                } catch (Exception e10) {
                    e = e10;
                    h = org.telegram.ui.Wallet.d2.h("decode request", e);
                    z1Var = null;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(d2Var, z1Var, f0Var, h, this.c, this.e, g0Var));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m1(d2Var, z1Var, f0Var, h, this.c, this.e, g0Var));
        }
    }

    public /* synthetic */ f1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, AccountInstance accountInstance, u80 u80Var, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer) {
        this.b = a2Var;
        this.f = tLObject;
        this.h = accountInstance;
        this.n = u80Var;
        this.c = j10;
        this.d = context;
        this.r = m2Var;
        this.e = i10;
        this.s = peer;
    }

    public /* synthetic */ f1(org.telegram.ui.Wallet.d2 d2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.g0 g0Var, String str, byte[] bArr, bi.f0 f0Var, long j10, int i10) {
        this.b = d2Var;
        this.d = tonconnectpending;
        this.f = tonconnectrequest;
        this.h = g0Var;
        this.n = str;
        this.r = bArr;
        this.s = f0Var;
        this.c = j10;
        this.e = i10;
    }
}
