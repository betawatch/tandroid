// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class nb7 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ nb7(ad7 ad7Var, long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.e = ad7Var;
        this.b = j;
        this.d = z;
        this.f = inputPeer;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        byte b = this.a;
        TLObject tLObject = this.f;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((ad7) obj).getMessagesController().C3(this.b, this.d, (TLRPC.InputPeer) tLObject, this.c);
                break;
            default:
                gta gtaVar = (gta) obj;
                int i = gtaVar.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j = this.b;
                    long j2 = this.c;
                    if (j == 0) {
                        TLRPC.UserFull W1 = na7.q1(i).W1(j2);
                        if (W1 != null && (peerSettings = W1.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        na7.q1(i).W3.edit().putLong(ls6.n(j2, "dialog_bar_paying_"), 0L).apply();
                        na7.q1(i).b3(na7.q1(i).V1(Long.valueOf(j2)), na7.q1(i).K0(Long.valueOf(-j2)), true);
                        qu2.r(i).D(true);
                        kk7.f(i).k(kk7.P3, Long.valueOf(j2));
                        break;
                    } else {
                        gtaVar.Z(-j, j2, this.d);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ nb7(gta gtaVar, TLObject tLObject, long j, long j2, boolean z) {
        this.e = gtaVar;
        this.f = tLObject;
        this.b = j;
        this.c = j2;
        this.d = z;
    }
}
