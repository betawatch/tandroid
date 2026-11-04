package ii;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.telegram.messenger.a8;
import org.telegram.messenger.hp;
import org.telegram.messenger.ib;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.o60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
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

    public /* synthetic */ b1(org.telegram.ui.ActionBar.s1 s1Var, Context context, int i3, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, e6 e6Var, org.telegram.ui.web.r rVar, ai.n0 n0Var) {
        this.b = s1Var;
        this.d = context;
        this.e = i3;
        this.c = j10;
        this.f = tL_messages_preparedInlineMessage;
        this.h = fileArr;
        this.n = e6Var;
        this.r = rVar;
        this.s = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        String i3;
        org.telegram.ui.Wallet.y1 y1Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.b;
                Context context = (Context) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) this.f;
                File[] fileArr = (File[]) this.h;
                e6 e6Var = (e6) this.n;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.r;
                ai.n0 n0Var = (ai.n0) this.s;
                s1Var.dismiss();
                new j1(context, this.e, this.c, tL_messages_preparedInlineMessage, fileArr[0], null, e6Var, rVar, n0Var).show();
                break;
            case 1:
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.h;
                m60 m60Var = (m60) this.n;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.r;
                TLRPC.Peer peer = (TLRPC.Peer) this.s;
                try {
                    s1Var2.dismiss();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                TLObject tLObject = this.f;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    if (joinaspeers.peers.size() != 1) {
                        o60.A1 = joinaspeers.peers;
                        long j10 = this.c;
                        o60.C1 = j10;
                        o60.B1 = SystemClock.elapsedRealtime();
                        int i10 = cVar.a;
                        o60.D1 = i10;
                        hp.s1(i10).S3(joinaspeers.chats, false);
                        hp.s1(cVar.a).Y3(joinaspeers.users, false);
                        o60.L0(context2, j10, joinaspeers.peers, d2Var, this.e, peer, m60Var);
                        break;
                    } else {
                        m60Var.a(hp.s1(cVar.a).j1(zi.C1(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.b;
                TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) this.d;
                TL_wallet.tonConnectRequest tonconnectrequest = (TL_wallet.tonConnectRequest) this.f;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.h;
                String str = (String) this.n;
                byte[] bArr = (byte[]) this.r;
                org.telegram.ui.Wallet.s1 s1Var3 = (org.telegram.ui.Wallet.s1) this.s;
                c2Var.getClass();
                try {
                    h0Var = h0Var2;
                } catch (Exception e11) {
                    e = e11;
                    h0Var = h0Var2;
                }
                try {
                    y1Var = new org.telegram.ui.Wallet.y1(tonconnectpending, tonconnectrequest, org.telegram.ui.Wallet.c2.g(h0Var2, tonconnectpending.session, str, bArr, tonconnectrequest.body, c2Var.f.getCurrentTime()), str, bArr);
                    i3 = null;
                } catch (Exception e12) {
                    e = e12;
                    i3 = org.telegram.ui.Wallet.c2.i("decode request", e);
                    y1Var = null;
                    org.telegram.messenger.g0.h3(new ib(c2Var, y1Var, s1Var3, i3, this.c, this.e, h0Var));
                }
                org.telegram.messenger.g0.h3(new ib(c2Var, y1Var, s1Var3, i3, this.c, this.e, h0Var));
        }
    }

    public /* synthetic */ b1(org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, org.telegram.messenger.c cVar, m60 m60Var, long j10, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.Peer peer) {
        this.b = s1Var;
        this.f = tLObject;
        this.h = cVar;
        this.n = m60Var;
        this.c = j10;
        this.d = context;
        this.r = d2Var;
        this.e = i3;
        this.s = peer;
    }

    public /* synthetic */ b1(org.telegram.ui.Wallet.c2 c2Var, TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, org.telegram.ui.Wallet.h0 h0Var, String str, byte[] bArr, org.telegram.ui.Wallet.s1 s1Var, long j10, int i3) {
        this.b = c2Var;
        this.d = tonconnectpending;
        this.f = tonconnectrequest;
        this.h = h0Var;
        this.n = str;
        this.r = bArr;
        this.s = s1Var;
        this.c = j10;
        this.e = i3;
    }
}
