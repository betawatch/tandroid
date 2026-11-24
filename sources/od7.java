// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class od7 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ od7(cf7 cf7Var, long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.e = cf7Var;
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
                ((cf7) obj).getMessagesController().F3(this.b, this.d, (TLRPC.InputPeer) tLObject, this.c);
                break;
            default:
                jva jvaVar = (jva) obj;
                int i = jvaVar.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j = this.b;
                    long j2 = this.c;
                    if (j == 0) {
                        TLRPC.UserFull X1 = oc7.r1(i).X1(j2);
                        if (X1 != null && (peerSettings = X1.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        oc7.r1(i).W3.edit().putLong(kt6.n(j2, "dialog_bar_paying_"), 0L).apply();
                        oc7.r1(i).e3(oc7.r1(i).W1(Long.valueOf(j2)), oc7.r1(i).L0(Long.valueOf(-j2)), true);
                        bw2.r(i).D(true);
                        nm7.f(i).k(nm7.Q3, Long.valueOf(j2));
                        break;
                    } else {
                        jvaVar.Z(-j, j2, this.d);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ od7(jva jvaVar, TLObject tLObject, long j, long j2, boolean z) {
        this.e = jvaVar;
        this.f = tLObject;
        this.b = j;
        this.c = j2;
        this.d = z;
    }
}
