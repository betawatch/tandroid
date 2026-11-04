package ci;

import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ h8(e9 e9Var, TLObject tLObject, long j10, long j11, boolean z10) {
        this.e = e9Var;
        this.f = tLObject;
        this.b = j10;
        this.d = j11;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i3 = this.a;
        TLObject tLObject = this.f;
        Object obj = this.e;
        switch (i3) {
            case 0:
                e9 e9Var = (e9) obj;
                int i10 = e9Var.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.b;
                    long j11 = this.d;
                    if (j10 == 0) {
                        TLRPC.UserFull b22 = hp.s1(i10).b2(j11);
                        if (b22 != null && (peerSettings = b22.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        hp.s1(i10).d7.edit().putLong(a1.g.p(j11, "dialog_bar_paying_"), 0L).apply();
                        hp.s1(i10).a3(hp.s1(i10).a2(Long.valueOf(j11)), hp.s1(i10).M0(Long.valueOf(-j11)), true);
                        org.telegram.messenger.g5.r(i10).D(true);
                        hs.f(i10).k(hs.N3, Long.valueOf(j11));
                        break;
                    } else {
                        e9Var.a0(-j10, j11, this.c);
                        break;
                    }
                }
                break;
            default:
                ((qr) obj).getMessagesController().B3(this.b, this.c, (TLRPC.InputPeer) tLObject, this.d);
                break;
        }
    }

    public /* synthetic */ h8(qr qrVar, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.e = qrVar;
        this.b = j10;
        this.c = z10;
        this.f = inputPeer;
        this.d = j11;
    }
}
