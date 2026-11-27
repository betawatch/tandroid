// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o25 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o25(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                c cVar = (c) this.c;
                c35 c35Var = (c35) this.d;
                icc iccVar = (icc) this.e;
                boolean z = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(cVar.a).getCurrentTime();
                    StringBuilder sb = new StringBuilder("received proof challenge, expires at ");
                    bs2.w(sb, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb.append(proofchallenge.expires - currentTime);
                    sb.append("s");
                    c.P(sb.toString());
                    Utilities.d.c(new q25(cVar, z, c35Var, proofchallenge, currentTime, iccVar));
                    break;
                } else {
                    c35Var.close();
                    iccVar.a(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                a55 a55Var = (a55) this.c;
                gt gtVar = (gt) this.d;
                w45 w45Var = (w45) this.e;
                boolean z2 = this.b;
                c35 c35Var2 = (c35) obj;
                String str = (String) obj2;
                if (c35Var2 != null && str == null) {
                    c35 b = c35Var2.b();
                    v35 v35Var = new v35(b, gtVar, (byte) 4);
                    String str2 = w45Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = w45Var.a;
                    if (!"sendTransaction".equals(str2) || !uc7.s1(a55Var.a).X3.contains(a55.k(tonconnectsession.id, w45Var.b).concat(".transfer"))) {
                        s45 s45Var = new s45(a55Var, w45Var, v35Var, z2, b);
                        if (!tonconnectsession.closed) {
                            TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                            tonconnectregisterkey.session_id = tonconnectsession.id;
                            tonconnectregisterkey.client_id = tonconnectsession.client_id;
                            a55Var.f.sendRequestTyped(tonconnectregisterkey, new ic((byte) 0), new nu0((Object) v35Var, (Object) b, (Object) w45Var, (Object) s45Var, (byte) 10));
                            break;
                        } else {
                            s45Var.a(null);
                            break;
                        }
                    } else {
                        a55Var.B(w45Var, b, v35Var);
                        break;
                    }
                } else {
                    if (str == null) {
                        str = "Recovery phrase is unavailable";
                    }
                    gtVar.a(str);
                    break;
                }
                break;
        }
    }
}
