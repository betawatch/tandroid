package di;

import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ y7(u8 u8Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.e = u8Var;
        this.f = tLObject;
        this.b = j3;
        this.d = j10;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i7 = this.a;
        TLObject tLObject = this.f;
        Object obj = this.e;
        switch (i7) {
            case 0:
                u8 u8Var = (u8) obj;
                int i10 = u8Var.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.b;
                    long j10 = this.d;
                    if (j3 == 0) {
                        TLRPC.UserFull b22 = np.s1(i10).b2(j10);
                        if (b22 != null && (peerSettings = b22.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        np.s1(i10).e7.edit().putLong(a8.p0.o(j10, "dialog_bar_paying_"), 0L).apply();
                        np.s1(i10).a3(np.s1(i10).a2(Long.valueOf(j10)), np.s1(i10).M0(Long.valueOf(-j10)), true);
                        org.telegram.messenger.g5.r(i10).D(true);
                        ns.f(i10).k(ns.N3, Long.valueOf(j10));
                        break;
                    } else {
                        u8Var.a0(-j3, j10, this.c);
                        break;
                    }
                }
                break;
            default:
                ((vr) obj).getMessagesController().B3(this.b, this.c, (TLRPC.InputPeer) tLObject, this.d);
                break;
        }
    }

    public /* synthetic */ y7(vr vrVar, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.e = vrVar;
        this.b = j3;
        this.c = z10;
        this.f = inputPeer;
        this.d = j10;
    }
}
