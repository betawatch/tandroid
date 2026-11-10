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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.t60;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public /* synthetic */ a1(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, h6 h6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.b = u1Var;
        this.d = context;
        this.e = i7;
        this.c = j3;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = h6Var;
        this.r = pVar;
        this.s = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        String i7;
        org.telegram.ui.Wallet.z1 z1Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.b;
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                h6 h6Var = (h6) this.n;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.r;
                bi.t0 t0Var = (bi.t0) this.s;
                u1Var.dismiss();
                new i1(context, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, h6Var, pVar, t0Var).show();
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
                        t60.C1 = joinaspeers.peers;
                        long j3 = this.c;
                        t60.E1 = j3;
                        t60.D1 = SystemClock.elapsedRealtime();
                        int i10 = cVar.a;
                        t60.F1 = i10;
                        qp.s1(i10).S3(joinaspeers.chats, false);
                        qp.s1(cVar.a).Y3(joinaspeers.users, false);
                        t60.L0(context2, j3, joinaspeers.peers, f2Var, this.e, peer, r60Var);
                        break;
                    } else {
                        r60Var.a(qp.s1(cVar.a).j1(ij.B1(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.h;
                String str = (String) this.n;
                byte[] bArr = (byte[]) this.r;
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.s;
                d2Var.getClass();
                try {
                    i0Var = i0Var2;
                } catch (Exception e11) {
                    e = e11;
                    i0Var = i0Var2;
                }
                try {
                    z1Var = new org.telegram.ui.Wallet.z1(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.d2.g(i0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, d2Var.f.getCurrentTime()), str, bArr);
                    i7 = null;
                } catch (Exception e12) {
                    e = e12;
                    i7 = org.telegram.ui.Wallet.d2.i("decode request", e);
                    z1Var = null;
                    org.telegram.messenger.g0.h3(new pb(d2Var, z1Var, t1Var, i7, this.c, this.e, i0Var));
                }
                org.telegram.messenger.g0.h3(new pb(d2Var, z1Var, t1Var, i7, this.c, this.e, i0Var));
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

    public /* synthetic */ a1(org.telegram.ui.Wallet.d2 d2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, org.telegram.ui.Wallet.t1 t1Var, long j3, int i7) {
        this.b = d2Var;
        this.d = tonconnectpending;
        this.f = tonconnectrequest;
        this.h = i0Var;
        this.n = str;
        this.r = bArr;
        this.s = t1Var;
        this.c = j3;
        this.e = i7;
    }
}
