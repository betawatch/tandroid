package ki;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.nb;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.g70;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements Runnable {
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

    public /* synthetic */ z0(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, i6 i6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.b = u1Var;
        this.d = context;
        this.e = i7;
        this.c = j3;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = i6Var;
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
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.b;
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                i6 i6Var = (i6) this.n;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.r;
                bi.h0 h0Var = (bi.h0) this.s;
                u1Var.dismiss();
                new h1(context, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, i6Var, qVar, h0Var).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                e70 e70Var = (e70) this.n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.r;
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
                        g70.D1 = joinaspeers.peers;
                        long j3 = this.c;
                        g70.F1 = j3;
                        g70.E1 = SystemClock.elapsedRealtime();
                        int i10 = cVar.a;
                        g70.G1 = i10;
                        mp.u1(i10).Z3(joinaspeers.chats, false);
                        mp.u1(cVar.a).f4(joinaspeers.users, false);
                        g70.M0(context2, j3, joinaspeers.peers, h2Var2, this.e, peer, e70Var);
                        break;
                    } else {
                        e70Var.a(mp.u1(cVar.a).l1(fj.B1(joinaspeers.peers.get(0))), false, false, false);
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
                    org.telegram.messenger.g0.g3(new nb(l2Var, h2Var, e0Var, i7, this.c, this.e, r0Var));
                }
                org.telegram.messenger.g0.g3(new nb(l2Var, h2Var, e0Var, i7, this.c, this.e, r0Var));
        }
    }

    public /* synthetic */ z0(org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, org.telegram.messenger.c cVar, e70 e70Var, long j3, Context context, org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.Peer peer) {
        this.b = u1Var;
        this.f = tLObject;
        this.h = cVar;
        this.n = e70Var;
        this.c = j3;
        this.d = context;
        this.r = h2Var;
        this.e = i7;
        this.s = peer;
    }

    public /* synthetic */ z0(org.telegram.ui.Wallet.l2 l2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.r0 r0Var, String str, byte[] bArr, org.telegram.ui.Wallet.e0 e0Var, long j3, int i7) {
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
