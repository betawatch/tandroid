package ki;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.ob;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.i70;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Runnable {
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

    public /* synthetic */ y0(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, h6 h6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.b = t1Var;
        this.d = context;
        this.e = i7;
        this.c = j3;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = h6Var;
        this.r = qVar;
        this.s = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.r0 r0Var;
        String i7;
        org.telegram.ui.Wallet.h2 h2Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                h6 h6Var = (h6) this.n;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.r;
                bi.h0 h0Var = (bi.h0) this.s;
                t1Var.dismiss();
                new g1(context, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, h6Var, qVar, h0Var).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                g70 g70Var = (g70) this.n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    t1Var2.dismiss();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        i70.D1 = joinaspeers.peers;
                        long j3 = this.c;
                        i70.F1 = j3;
                        i70.E1 = SystemClock.elapsedRealtime();
                        int i10 = cVar.a;
                        i70.G1 = i10;
                        np.u1(i10).Z3(joinaspeers.chats, false);
                        np.u1(cVar.a).f4(joinaspeers.users, false);
                        i70.M0(context2, j3, joinaspeers.peers, g2Var, this.e, peer, g70Var);
                        break;
                    } else {
                        g70Var.a(np.u1(cVar.a).l1(gj.B1(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f;
                org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) this.h;
                String str = (String) this.n;
                byte[] bArr = (byte[]) this.r;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.s;
                l2Var.getClass();
                try {
                    r0Var = r0Var2;
                } catch (Exception e11) {
                    e = e11;
                    r0Var = r0Var2;
                }
                try {
                    h2Var = new org.telegram.ui.Wallet.h2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.l2.g(r0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, l2Var.f.getCurrentTime()), str, bArr);
                    i7 = null;
                } catch (Exception e12) {
                    e = e12;
                    i7 = org.telegram.ui.Wallet.l2.i("decode request", e);
                    h2Var = null;
                    org.telegram.messenger.g0.g3(new ob(l2Var, h2Var, e0Var, i7, this.c, this.e, r0Var));
                }
                org.telegram.messenger.g0.g3(new ob(l2Var, h2Var, e0Var, i7, this.c, this.e, r0Var));
        }
    }

    public /* synthetic */ y0(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, org.telegram.messenger.c cVar, g70 g70Var, long j3, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Peer peer) {
        this.b = t1Var;
        this.f = tLObject;
        this.h = cVar;
        this.n = g70Var;
        this.c = j3;
        this.d = context;
        this.r = g2Var;
        this.e = i7;
        this.s = peer;
    }

    public /* synthetic */ y0(org.telegram.ui.Wallet.l2 l2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.r0 r0Var, String str, byte[] bArr, org.telegram.ui.Wallet.e0 e0Var, long j3, int i7) {
        this.b = l2Var;
        this.d = tonconnectpending;
        this.f = tonconnectrequest;
        this.h = r0Var;
        this.n = str;
        this.r = bArr;
        this.s = e0Var;
        this.c = j3;
        this.e = i7;
    }
}
