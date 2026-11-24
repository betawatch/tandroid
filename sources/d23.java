// default package

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class d23 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a33 b;

    public /* synthetic */ d23(a33 a33Var, byte b) {
        this.a = b;
        this.b = a33Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a33 a33Var = this.b;
        switch (b) {
            case 0:
                a33Var.A(new n13((CharSequence) null, (byte) 2));
                break;
            case 1:
                a33Var.A(new n13((CharSequence) null, (byte) 2));
                break;
            case 2:
                a33Var.onResult(null);
                break;
            case 3:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5$lambda$4(a33Var);
                break;
            case 4:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$3$lambda$2(a33Var);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$lambda$0(a33Var);
                break;
            case 6:
                a33Var.onResult(null);
                break;
            case 7:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$7$lambda$6(a33Var);
                break;
            case 8:
                a33Var.onResult(null);
                break;
            case 9:
                a33Var.A(new uu4("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                break;
            default:
                a33Var.A(new uu4("No provider data returned.", (byte) 2));
                break;
        }
    }
}
