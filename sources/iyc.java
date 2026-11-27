// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class iyc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lyc b;
    public final /* synthetic */ kyc c;

    public /* synthetic */ iyc(lyc lycVar, kyc kycVar, byte b) {
        this.a = b;
        this.b = lycVar;
        this.c = kycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kyc kycVar = this.c;
        lyc lycVar = this.b;
        switch (b) {
            case 0:
                if (((kyc) lycVar.c) == kycVar) {
                    lycVar.d = null;
                    lycVar.s(kycVar);
                    break;
                }
                break;
            case 1:
                if (((kyc) lycVar.c) == kycVar) {
                    iyc iycVar = (iyc) lycVar.d;
                    if (iycVar != null) {
                        hl.r(iycVar);
                        lycVar.d = null;
                    }
                    int i = kycVar.d;
                    if (i != 0) {
                        iyc iycVar2 = new iyc(lycVar, kycVar, (byte) 2);
                        lycVar.e = iycVar2;
                        hl.d3(iycVar2, 20000L);
                        ht2 ht2Var = kycVar.a;
                        ((ConnectionsManager) ht2Var.b).checkWebProxyInternal(kycVar.b, i, new jyc(lycVar, kycVar));
                        break;
                    } else {
                        lycVar.s(kycVar);
                        break;
                    }
                }
                break;
            default:
                if (((kyc) lycVar.c) == kycVar) {
                    lycVar.e = null;
                    lycVar.s(kycVar);
                    break;
                }
                break;
        }
    }
}
