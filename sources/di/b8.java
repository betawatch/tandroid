package di;

import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ b8(x8 x8Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.e = x8Var;
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
                x8 x8Var = (x8) obj;
                int i10 = x8Var.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.b;
                    long j10 = this.d;
                    if (j3 == 0) {
                        TLRPC.UserFull d2 = mp.u1(i10).d2(j10);
                        if (d2 != null && (peerSettings = d2.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        mp.u1(i10).g7.edit().putLong(a8.p0.o(j10, "dialog_bar_paying_"), 0L).apply();
                        mp.u1(i10).g3(mp.u1(i10).c2(Long.valueOf(j10)), mp.u1(i10).O0(Long.valueOf(-j10)), true);
                        org.telegram.messenger.i5.r(i10).D(true);
                        ks.f(i10).k(ks.Q3, Long.valueOf(j10));
                        break;
                    } else {
                        x8Var.Z(-j3, j10, this.c);
                        break;
                    }
                }
                break;
            default:
                ((tr) obj).getMessagesController().I3(this.b, this.c, (TLRPC.InputPeer) tLObject, this.d);
                break;
        }
    }

    public /* synthetic */ b8(tr trVar, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.e = trVar;
        this.b = j3;
        this.c = z10;
        this.f = inputPeer;
        this.d = j10;
    }
}
