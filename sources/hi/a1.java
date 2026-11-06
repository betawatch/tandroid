package hi;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.messenger.pb;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.t60;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements Runnable {
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

    public /* synthetic */ a1(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, f6 f6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.b = u1Var;
        this.d = context;
        this.e = i7;
        this.c = j3;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = f6Var;
        this.r = pVar;
        this.s = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.k0 k0Var;
        String i7;
        org.telegram.ui.Wallet.b2 b2Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.b;
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                f6 f6Var = (f6) this.n;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.r;
                bi.t0 t0Var = (bi.t0) this.s;
                u1Var.dismiss();
                new i1(context, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, f6Var, pVar, t0Var).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                r60 r60Var = (r60) this.n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    u1Var2.dismiss();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        t60.z1 = joinaspeers.peers;
                        long j3 = this.c;
                        t60.B1 = j3;
                        t60.A1 = SystemClock.elapsedRealtime();
                        int i10 = cVar.a;
                        t60.C1 = i10;
                        qp.s1(i10).S3(joinaspeers.chats, false);
                        qp.s1(cVar.a).Y3(joinaspeers.users, false);
                        t60.L0(context2, j3, joinaspeers.peers, f2Var, this.e, peer, r60Var);
                        break;
                    } else {
                        r60Var.a(qp.s1(cVar.a).j1(ij.C1(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f;
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.h;
                String str = (String) this.n;
                byte[] bArr = (byte[]) this.r;
                org.telegram.ui.Wallet.v1 v1Var = (org.telegram.ui.Wallet.v1) this.s;
                f2Var2.getClass();
                try {
                    k0Var = k0Var2;
                } catch (Exception e11) {
                    e = e11;
                    k0Var = k0Var2;
                }
                try {
                    b2Var = new org.telegram.ui.Wallet.b2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.f2.g(k0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, f2Var2.f.getCurrentTime()), str, bArr);
                    i7 = null;
                } catch (Exception e12) {
                    e = e12;
                    i7 = org.telegram.ui.Wallet.f2.i("decode request", e);
                    b2Var = null;
                    org.telegram.messenger.g0.h3(new pb(f2Var2, b2Var, v1Var, i7, this.c, this.e, k0Var));
                }
                org.telegram.messenger.g0.h3(new pb(f2Var2, b2Var, v1Var, i7, this.c, this.e, k0Var));
        }
    }

    public /* synthetic */ a1(org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, org.telegram.messenger.c cVar, r60 r60Var, long j3, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Peer peer) {
        this.b = u1Var;
        this.f = tLObject;
        this.h = cVar;
        this.n = r60Var;
        this.c = j3;
        this.d = context;
        this.r = f2Var;
        this.e = i7;
        this.s = peer;
    }

    public /* synthetic */ a1(org.telegram.ui.Wallet.f2 f2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.k0 k0Var, String str, byte[] bArr, org.telegram.ui.Wallet.v1 v1Var, long j3, int i7) {
        this.b = f2Var;
        this.d = tonconnectpending;
        this.f = tonconnectrequest;
        this.h = k0Var;
        this.n = str;
        this.r = bArr;
        this.s = v1Var;
        this.c = j3;
        this.e = i7;
    }
}
