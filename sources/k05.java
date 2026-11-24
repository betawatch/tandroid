// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class k05 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k05(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                c cVar = (c) this.c;
                y05 y05Var = (y05) this.d;
                i8c i8cVar = (i8c) this.e;
                boolean z = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge != null) {
                    int currentTime = ConnectionsManager.getInstance(cVar.a).getCurrentTime();
                    StringBuilder sb = new StringBuilder("received proof challenge, expires at ");
                    ir2.w(sb, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                    sb.append(proofchallenge.expires - currentTime);
                    sb.append("s");
                    c.O(sb.toString());
                    Utilities.d.c(new m05(cVar, z, y05Var, proofchallenge, currentTime, i8cVar));
                    break;
                } else {
                    y05Var.close();
                    i8cVar.a(null, tL_error == null ? "NULL_ERROR" : tL_error.text);
                    break;
                }
            default:
                w25 w25Var = (w25) this.c;
                ht htVar = (ht) this.d;
                s25 s25Var = (s25) this.e;
                boolean z2 = this.b;
                y05 y05Var2 = (y05) obj;
                String str = (String) obj2;
                if (y05Var2 != null && str == null) {
                    y05 b = y05Var2.b();
                    x15 x15Var = new x15(b, htVar, (byte) 1);
                    String str2 = s25Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = s25Var.a;
                    if (!"sendTransaction".equals(str2) || !na7.q1(w25Var.a).X3.contains(w25.k(tonconnectsession.id, s25Var.b).concat(".transfer"))) {
                        m25 m25Var = new m25(w25Var, s25Var, x15Var, z2, b);
                        if (!tonconnectsession.closed) {
                            TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                            tonconnectregisterkey.session_id = tonconnectsession.id;
                            tonconnectregisterkey.client_id = tonconnectsession.client_id;
                            w25Var.f.sendRequestTyped(tonconnectregisterkey, new hc((byte) 0), new eu0((Object) x15Var, (Object) b, (Object) s25Var, (Object) m25Var, (byte) 8));
                            break;
                        } else {
                            m25Var.a(null);
                            break;
                        }
                    } else {
                        w25Var.B(s25Var, b, x15Var);
                        break;
                    }
                } else {
                    if (str == null) {
                        str = "Recovery phrase is unavailable";
                    }
                    htVar.a(str);
                    break;
                }
                break;
        }
    }
}
