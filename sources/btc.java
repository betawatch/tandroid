// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class btc implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gtc b;

    public /* synthetic */ btc(gtc gtcVar, byte b) {
        this.a = b;
        this.b = gtcVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        gtc gtcVar = this.b;
        switch (b) {
            case 0:
                gtcVar.g0((pcc) obj);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    v21 I = d31.b0(gtcVar).I(R.raw.contact_check, ob6.M0(2131742839, null), ob6.M0(2131742837, null));
                    I.j = 5000;
                    I.j();
                    gtcVar.a.g3.O(true);
                    break;
                } else {
                    d31.b0(gtcVar).f0(str, false);
                    break;
                }
            default:
                gtcVar.d0((Boolean) obj);
                break;
        }
    }
}
