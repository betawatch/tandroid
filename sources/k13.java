// default package

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class k13 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h23 b;

    public /* synthetic */ k13(h23 h23Var, byte b) {
        this.a = b;
        this.b = h23Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        h23 h23Var = this.b;
        switch (b) {
            case 0:
                h23Var.B(new v03((CharSequence) null, (byte) 2));
                break;
            case 1:
                h23Var.B(new v03((CharSequence) null, (byte) 2));
                break;
            case 2:
                h23Var.onResult(null);
                break;
            case 3:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5$lambda$4(h23Var);
                break;
            case 4:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$3$lambda$2(h23Var);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$lambda$0(h23Var);
                break;
            case 6:
                h23Var.onResult(null);
                break;
            case 7:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$7$lambda$6(h23Var);
                break;
            case 8:
                h23Var.onResult(null);
                break;
            case 9:
                h23Var.B(new xu4("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                break;
            default:
                h23Var.B(new xu4("No provider data returned.", (byte) 2));
                break;
        }
    }
}
