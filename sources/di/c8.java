package di;

import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ c8(y8 y8Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.e = y8Var;
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
                y8 y8Var = (y8) obj;
                int i10 = y8Var.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.b;
                    long j10 = this.d;
                    if (j3 == 0) {
                        TLRPC.UserFull d2 = np.u1(i10).d2(j10);
                        if (d2 != null && (peerSettings = d2.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        np.u1(i10).g7.edit().putLong(a8.p0.o(j10, "dialog_bar_paying_"), 0L).apply();
                        np.u1(i10).g3(np.u1(i10).c2(Long.valueOf(j10)), np.u1(i10).O0(Long.valueOf(-j10)), true);
                        org.telegram.messenger.i5.r(i10).D(true);
                        ls.f(i10).k(ls.Q3, Long.valueOf(j10));
                        break;
                    } else {
                        y8Var.Z(-j3, j10, this.c);
                        break;
                    }
                }
                break;
            default:
                ((ur) obj).getMessagesController().I3(this.b, this.c, (TLRPC.InputPeer) tLObject, this.d);
                break;
        }
    }

    public /* synthetic */ c8(ur urVar, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.e = urVar;
        this.b = j3;
        this.c = z10;
        this.f = inputPeer;
        this.d = j10;
    }
}
