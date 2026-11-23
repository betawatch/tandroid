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
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.f70;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    public /* synthetic */ y0(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, i6 i6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.b = t1Var;
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
        org.telegram.ui.Wallet.s0 s0Var;
        String i7;
        org.telegram.ui.Wallet.i2 i2Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                i6 i6Var = (i6) this.n;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.r;
                bi.h0 h0Var = (bi.h0) this.s;
                t1Var.dismiss();
                new g1(context, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, i6Var, qVar, h0Var).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                d70 d70Var = (d70) this.n;
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
                        f70.D1 = joinaspeers.peers;
                        long j3 = this.c;
                        f70.F1 = j3;
                        f70.E1 = SystemClock.elapsedRealtime();
                        int i10 = cVar.a;
                        f70.G1 = i10;
                        mp.u1(i10).Z3(joinaspeers.chats, false);
                        mp.u1(cVar.a).f4(joinaspeers.users, false);
                        f70.M0(context2, j3, joinaspeers.peers, g2Var, this.e, peer, d70Var);
                        break;
                    } else {
                        d70Var.a(mp.u1(cVar.a).l1(fj.B1(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f;
                org.telegram.ui.Wallet.s0 s0Var2 = (org.telegram.ui.Wallet.s0) this.h;
                String str = (String) this.n;
                byte[] bArr = (byte[]) this.r;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.s;
                m2Var.getClass();
                try {
                    s0Var = s0Var2;
                } catch (Exception e11) {
                    e = e11;
                    s0Var = s0Var2;
                }
                try {
                    i2Var = new org.telegram.ui.Wallet.i2(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.m2.g(s0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, m2Var.f.getCurrentTime()), str, bArr);
                    i7 = null;
                } catch (Exception e12) {
                    e = e12;
                    i7 = org.telegram.ui.Wallet.m2.i("decode request", e);
                    i2Var = null;
                    org.telegram.messenger.g0.g3(new nb(m2Var, i2Var, f0Var, i7, this.c, this.e, s0Var));
                }
                org.telegram.messenger.g0.g3(new nb(m2Var, i2Var, f0Var, i7, this.c, this.e, s0Var));
        }
    }

    public /* synthetic */ y0(org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, org.telegram.messenger.c cVar, d70 d70Var, long j3, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Peer peer) {
        this.b = t1Var;
        this.f = tLObject;
        this.h = cVar;
        this.n = d70Var;
        this.c = j3;
        this.d = context;
        this.r = g2Var;
        this.e = i7;
        this.s = peer;
    }

    public /* synthetic */ y0(org.telegram.ui.Wallet.m2 m2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.s0 s0Var, String str, byte[] bArr, org.telegram.ui.Wallet.f0 f0Var, long j3, int i7) {
        this.b = m2Var;
        this.d = tonconnectpending;
        this.f = tonconnectrequest;
        this.h = s0Var;
        this.n = str;
        this.r = bArr;
        this.s = f0Var;
        this.c = j3;
        this.e = i7;
    }
}
